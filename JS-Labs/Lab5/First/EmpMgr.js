function Person(fullName, money, sleepMode, healthRate) {
  this.fullName = fullName;
  this.money = money;
  this.sleepMode = sleepMode;
  this.healthRate = healthRate;
  this.Sleep = function (hours) {
    if (hours == 7) {
      this.sleepMode = "happy";
    } else if (hours > 7) {
      this.sleepMode = "lazy";
    } else if (hours < 7) {
      this.sleepMode = "tired";
    }
  };
  this.Eat = function (meals) {
    if (meals == 3) {
      this.healthRate = "100";
    } else if (meals == 2) {
      this.healthRate = "75";
    } else if (meals == 1) {
      this.healthRate = "50";
    }
  };
  this.Buy = function (items) {
    for (let i = 0; i < items; i++) {
      this.money -= 10;
    }
    if (this.money < 0) {
      this.money = 0;
    }
    return this.money;
  };
}
function Employee(
  Id,
  email,
  workMode,
  salary,
  isManger,
  fullName,
  money,
  sleepMode,
  healthRate
) {
  Person.call(this, fullName, money, sleepMode, healthRate);
  this.Id = Id;
  this.email = email;
  this.workMode = workMode;
  this.salary = salary;
  this.isManger = isManger;
  this.Work = function (hours) {
    if (hours == 8) {
      this.sleepMode = "happy";
    } else if (hours > 8) {
      this.sleepMode = "lazy";
    } else if (hours < 8) {
      this.sleepMode = "tired";
    }
  };
}
// const empobj=[];
// const omar = new Employee(1,"Omar@gmail.com","happy",1000,"true","OmarWalid",100,"happy","100");
// const mahmoud = new Employee(2,"Omar@gmail.com","happy",1000,"true","MahmoudMohamed",100,"happy","100");
// empobj.push(omar,mahmoud);
function Office(name, employees) {
  this.name = name;
  this.employees = employees;
  this.getAllEmp = function () {
    return this.employees;
  };
  this.getEmp = function (id) {
    var employees = 0;
    this.employees.forEach((element) => {
      if (element.ID == id) {
        employees = element;
      }
    });
    return employees;
  };
  this.Fire = function (id) {
    for (let i = 0; i < employees.length; i++) {
      if (employees[i].Id == id) {
        employees.splice(i, 1);
      }
    }
  };
  this.Hire = function (Employee) {
    this.employees.push(Employee);
    return this.employees;
  };
}
const employees = [];
////////////
let add = () => {
  let obj = new Employee();

  for (const key in obj) {
    obj[key] = prompt(`Enter  ${key}`);
  }
  employees.push(obj);
  // return obj;
};

let manager = () => {
  // alert("Hello mngr");
  let mgr = new Office("moddeer", employees);

  let action = prompt(
    "Enter 1 to get all emp \n 2 to get emp \n 3 to hire emp \n 4 to fire emp "
  );
  switch (parseInt(action)) {
    case 1:
      mgr.getAllEmp();
      employees.forEach((employee) => {
        for (const key in employee) {
          document.write(`<p>${key} : ${employee[key]}</p> `);
        }
      });
      break;
    case 2:
      var id = prompt("Enter ID ");
      mgr.getEmp(id);
      break;
    case 3:
      add();
      break;
    case 4:
      id = prompt("Enter ID ");
      mgr.getEmp(id);
      mgr.Fire(id);
      break;
  }
};

////////////////
let quite = false;
do {
  input = prompt("Enter add or mngr or nrml and q for quite");

  switch (input) {
    case "add":
      add();
      break;
    case "mngr":
      manager();
      break;
    case "nrml":
      alert("hello emp");
      break;
    case "q":
      quite = true;
      break;
  }
  //quite = confirm("Do you want to exit ");
} while (!quite);

/////////////////////////
viewAll = (employees) => {
  employees.forEach((employee) => {
    for (const key in employee) {
      document.write(`<p>${key} : ${employee[key]}</p> `);
    }
    document.write(`====================`);
  });
};

////
// let mgr = new Office("moddeer", employees);
// console.log(mgr);

// employees.push(mahmoud);
