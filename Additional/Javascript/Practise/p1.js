const students = require("./student.json");
console.log("test");
// console.log(students);

for (var key in students) {
  console.log(key);
  console.log(students[key].name);
}
