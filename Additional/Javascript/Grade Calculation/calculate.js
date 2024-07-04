var fs = require("fs");

//fill your code
function gradecalculate(input) {
  let numbers = input.map(Number);
  let avg =
    ((numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / 5) *
    100;

  console.log(numbers);
  if (avg > 70) {
    console.log("Pass");
  } else {
    console.log("Fails");
  }
}

module.exports = { gradecalculate };
