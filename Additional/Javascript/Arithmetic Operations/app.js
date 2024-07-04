var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");

//Fill your code here

function performOperation() {
  let num1 = parseInt(input[1]);
  let num2 = parseInt(input[2]);
  if (input[0] == 1) {
    //add
    console.log(num1 + num2);
  } else if (input[0] == 2) {
    //subtraction
    console.log(num1 - num2);
  } else if (input[0] == 3) {
    //Multiplication
    console.log(num1 * num2);
  } else if (input[0] == 4) {
    //Division
    console.log(num1 / num2);
  } else {
    console.log("Invalid Input");
  }
}

performOperation();
