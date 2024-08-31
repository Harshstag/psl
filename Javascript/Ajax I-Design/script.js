// console.log("working");
// http = new XMLHttpRequest();
// http.open("get", "student.json", true);
// http.send();
// http.onload = function display() {
//   if (this.readyState == 4 && this.status == 200) {
//     var data = JSON.parse(this.responseText);
//     console.log(data);
//     var table = document.createElement("table");
//     var thead = document.createElement("thead");
//     var tr = document.createElement("tr");
//     for (var key in data[0]) {
//       var th = document.createElement("th");
//       th.innerHTML = key;
//       tr.appendChild(th);
//     }
//     thead.appendChild(tr);
//     table.appendChild(thead);
//     var tbody = document.createElement("tbody");
//     for (var i = 0; i < data.length; i++) {
//       var tr = document.createElement("tr");
//       for (var key in data[i]) {
//         var td = document.createElement("td");
//         td.innerHTML = data[i][key];
//         tr.appendChild(td);
//       }
//       tbody.appendChild(tr);
//     }
//     table.appendChild(tbody);
//     document.body.appendChild(table);
//     table.style.border = "1px solid";
//   }
// };

// function update() {
//   var id = document.getElementById("id").value;
//   var fieldType = document.getElementById("fileType").value;
//   var fieldValue = document.getElementById("fieldValue").value;
//   console.log(id, fieldType, fieldValue);
//   var updatedData = {
//     id: id,
//     fieldType: fieldType,
//     fieldValue: fieldValue,
//   };
//   var jsonData = JSON.stringify(updatedData);
//   var http = new XMLHttpRequest();
//   http.open("put", "student.json", true);
//   //   http.setRequestHeader("Content-Type", "application/json");
//   http.onreadystatechange = function () {
//     if (this.readyState == 4 && this.status == 200) {
//       console.log("Data updated successfully");
//       display();
//     }
//   };
//   http.send(jsonData);
// }

var students = [];

function display() {
  var xhr = new XMLHttpRequest();
  xhr.open("get", "student.json", true);
  xhr.onload = function () {
    if (this.status == 200) {
      students = JSON.parse(this.responseText);
      var table = document.getElementById("studentTable");
      students.forEach(function (student) {
        var row = document.createElement("tr");
        for (var key in student) {
          var cell = document.createElement("td");
          var cellText = document.createTextNode(student[key]);
          cell.appendChild(cellText);
          row.appendChild(cell);
        }
        table.appendChild(row);
      });
    }
  };
  xhr.send();
}

function updateData() {
  var id = document.getElementById("id").value;
  var fieldType = document.getElementById("fieldType").value;
  var fieldValue = document.getElementById("fieldValue").value;

  for (var i = 0; i < students.length; i++) {
    if (students[i].Id == id) {
      students[i][fieldType] = fieldValue;
      break;
    }
  }

  var xhr = new XMLHttpRequest();
  xhr.open("POST", "updateStudentData", true); // 'updateStudentData' should be replaced with the actual endpoint
  xhr.setRequestHeader("Content-Type", "application/json");
  xhr.onload = function () {
    if (this.status == 200) {
      var table = document.getElementById("studentTable");
      table.innerHTML = `
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>DOB</th>
                            <th>Mobile Number</th>
                            <th>Email</th>
                            <th>Address</th>
                            <th>DOJ</th>
                            <th>Department</th>
                            <th>Mark</th>
                        </tr>`;
      display();
    }
  };
  xhr.send(JSON.stringify(students));
}
window.onload = function () {
  display();
};
