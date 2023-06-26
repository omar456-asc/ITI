<?php
class FormHandler
{
    public $filename;
    public $countData;
    private $currentIndex;
    private $data;

    public function __construct($filename)
    {
        $this->filename = $filename;
        $this->data = $this->loadXMLFile();
        $this->currentIndex = $_SESSION["currentIndex"] ?? 0;
        // $this->filename = 'employees.xml';
    }
    public function loadXMLFile()
    {
        // Load existing XML file or create a new one if it doesn't exist
        if (file_exists($this->filename)) {
            $xml = simplexml_load_file($this->filename);
        } else {
            $xml = new SimpleXMLElement('<employees></employees>');
        }
        return $xml;
    }
    public function saveDataInXML()
    {
        // Retrieve form data
        $name = $_POST['name'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $email = $_POST['email'];

        $xml = $this->loadXMLFile();

        // Add new employee data to XML
        $employee = $xml->addChild('employee');
        $employee->addChild('name', $name);
        $employee->addChild('phone', $phone)->addAttribute('type', 'mobile');
        $employee->addChild('address', $address);
        $employee->addChild('email', $email);

        // Save updated XML to file
        $xml->asXML($this->filename);
        echo "<p class='mt-4 text-center alert alert-success'>Employee data saved to $this->filename.</p>";
    }
    public function displayData($currentIndex)
    {
        $xml = $this->loadXMLFile();

        $employees = $xml->employees;
        $employees
            = json_decode(json_encode((array)$xml), TRUE);
        $this->countData = count($employees['employee']);



        $employee = $employees['employee'][$currentIndex]; //current index 

        // var_dump($employee);
        return $employee;
    }
    public function getNextData($currentIndex)
    {
        if ($currentIndex + 1 < $this->countData) {
            $_SESSION["currentIndex"] += 1;  //needs intialization
            $data = $this->displayData($currentIndex);
        } else {
            $_SESSION["currentIndex"] = 0;
        }
    }
    public function getPrevData($currentIndex)
    {
        if ($currentIndex  > 0) {
            $_SESSION["currentIndex"] -= 1;
            $data = $this->displayData($currentIndex);
        } else {
            $_SESSION["currentIndex"] = $this->countData - 1;
        }
    }

    public function updateData($currentIndex)
    {
        $xml = $this->loadXMLFile();

        $employees = $xml->employees;
        $employees = json_decode(json_encode((array)$xml), TRUE);
        $this->countData = count($employees['employee']);

        // Retrieve updated form data
        $name = $_POST['name'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $email = $_POST['email'];

        // Update employee data in XML
        $employees['employee'][$currentIndex]['name'] = $name;
        $employees['employee'][$currentIndex]['phone'] = $phone;
        $employees['employee'][$currentIndex]['address'] = $address;
        $employees['employee'][$currentIndex]['email'] = $email;

        // Save updated XML to file
        $updatedXml = new SimpleXMLElement('<employees></employees>');
        $this->arrayToXml($employees, $updatedXml);
        $updatedXml->asXML($this->filename);
        echo "<p class='mt-4 text-center alert alert-success'>Employee data updated in $this->filename.</p>";
    }

    public function searchByName($name)
    {
        $xml = $this->loadXMLFile();

        $employees = $xml->xpath("//employee[contains(name, '$name')]");
        $results = [];

        foreach ($employees as $employee) {
            $result = [
                'name' => (string) $employee->name,
                'phone' => (string) $employee->phone,
                'address' => (string) $employee->address,
                'email' => (string) $employee->email,
            ];
            $results[] = $result;
        }

        return $results;
    }
    public function deleteData($currentIndex)
    {
        $xml = $this->loadXMLFile();

        $employees = $xml->employees;
        $employees = json_decode(json_encode((array)$xml), TRUE);
        $this->countData = count($employees['employee']);

        // Remove employee data from XML
        unset($employees['employee'][$currentIndex]);

        // Re-index the employees array
        $employees['employee'] = array_values($employees['employee']);

        // Save updated XML to file
        $xml = new SimpleXMLElement('<employees></employees>');
        $this->arrayToXml($employees, $xml);
        $xml->asXML($this->filename);

        // Update current index
        $this->currentIndex = 0;
        $_SESSION['currentIndex'] = $this->currentIndex;

        echo "<p class='mt-4 text-center alert alert-success'>Employee data deleted successfully.</p>";
    }
}
