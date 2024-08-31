var http = new XMLHttpRequest();
http.open("get", "students.json", true);
http.send();
http.onload = function () {
  if (this.readyState == 4 && this.status == 200) {
    var data = JSON.parse(this.responseText);
    console.log(data);
    var table = document.createElement("table");
    var thead = document.createElement("thead");
    var tr = document.createElement("tr");
    for (var key in data[0]) {
      var th = document.createElement("th");
      th.innerHTML = key;
      tr.appendChild(th);
    }
    thead.appendChild(tr);
    table.appendChild(thead);

    var tbody = document.createElement("tbody");
    for (var i = 0; i < data.length; i++) {
      var tr = document.createElement("tr");

      for (var key in data[i]) {
        var td = document.createElement("td");
        td.innerHTML = data[i][key];
        tr.appendChild(td);
      }
      tbody.appendChild(tr);
    }

    table.appendChild(tbody);
    document.body.appendChild(table);
  }
};
