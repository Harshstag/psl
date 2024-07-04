// var fs = require("fs");
// var input = fs.readFileSync("input.txt").toString().trim().split("\n");
class User {
  constructor(username) {
    this.username = username;
  }

  checkNameLength() {
    if (this.username.length() > 4) {
      return this.username;
    } else {
      return "Name is too short";
    }
  }
}

const obj1 = new User("Harina");
console.log(obj1.checkNameLength());
