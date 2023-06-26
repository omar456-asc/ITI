<?php
session_start();
// session_destroy();
$currentIndex = $_SESSION["currentIndex"] ?? 0;
// Helper Functions File
require_once("./FormHandler.php");
$handler = new FormHandler('employess.php');
// Initialize variables for employee data



$data = $handler->displayData($currentIndex);

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $action = $_POST['action'] ?? '';

    if ($action === 'add') {
        $handler->addData();
    } elseif ($action === 'next') {
        $handler->getNextData($_SESSION["currentIndex"]);
    } elseif ($action === 'prev') {
        $handler->getPrevData($_SESSION["currentIndex"]);
    } elseif ($action === 'update') {
        $handler->updateData($_SESSION["currentIndex"]);
    } elseif ($action === 'search') {
        $handler->searchByName($_POST['name']);
    } elseif ($action === 'delete') {
        $handler->deleteData($_SESSION["currentIndex"]);
    }
}
extract($data);

//var_dump($_SESSION["currentIndex"]);

// var_dump($data);
$templateData = [
    'name' => $data['name'],
    'phone' => $data['phone'],
    'address' => $data['address'],
    'email' => $data['email'],
    'currentIndex' => $data['currentIndex'] ?? '',
];
require_once('./template.php');
