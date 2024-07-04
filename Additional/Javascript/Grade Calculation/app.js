var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");
console.log(input);
const { gradecalculate } = require("./check");

gradecalculate(input);
