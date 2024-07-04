var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");
var fs = require("fs");

var name = input[0];
var dept = input[1];
var doj = input[2];

function Employee(name, dept, doj) {
  this.name = name;
  this.dept = dept;
  this.doj = doj;
}

Employee.prototype.displayEmployee = function () {
  console.log("Name : " + this.name);
  console.log("Department : " + this.dept);
  console.log("DOJ : " + this.doj);
};

var employee = new Employee(name, dept, doj);
employee.displayEmployee();
