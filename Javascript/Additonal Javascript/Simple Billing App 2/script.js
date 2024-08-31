var eventArray = [];

window.onload = function () {
  if (eventArray.length < 1) {
    document.getElementById("noEventMessage").style.display = "block";
    // document.getElementById("resultTable").style.display = "none";
  }
};

function addEvent() {
  document.getElementById("resultTable").style.display = "block";

  var eventName = document.getElementById("name").value;
  var venue = document.getElementById("venue").value;
  var date = document.getElementById("date").value;
  var price = document.getElementById("price").value;
  var count = document.getElementById("days").value;
  var totalCost = count * price;
  var id = eventArray.length + 1;

  const eventObject = {
    eventName: eventName,
    venue: venue,
    date: date,
    totalCost: totalCost,
    id: id,
  };

  eventArray.push(eventObject);
  display();
}

function display() {
  document.getElementById("resultTable").style.display = "block";
  document.getElementById("noEventMessage").style.display = "none";

  eventArray.forEach((n, i) => {
    console.log(n, i);
  });

  var tableBody = document.getElementById("tbody");
  tableBody.innerHTML = "";

  eventArray.forEach((event, index) => {
    var tr = document.createElement("tr");

    var td1 = document.createElement("td");
    td1.innerHTML = event.eventName;
    tr.appendChild(td1);

    var td2 = document.createElement("td");
    td2.innerHTML = event.venue;
    tr.appendChild(td2);

    var td3 = document.createElement("td");
    td3.innerHTML = event.date;
    tr.appendChild(td3);

    var td4 = document.createElement("td");
    td4.innerHTML = event.totalCost;
    tr.appendChild(td4);

    var td5 = document.createElement("td");
    td5.innerHTML = `<a href="#" id="link${index}" onclick="deleteElement(${event.id})">
        Cancel
      </a>`;
    tr.appendChild(td5);

    var td6 = document.createElement("td");
    td6.innerHTML = `<a href="#" id="link${index}" onclick="editElement(${event.id})">
        Update
      </a>`;
    tr.appendChild(td6);

    tableBody.appendChild(tr);
  });
}

function deleteElement(refId) {
  eventArray.filter((item, index) => {
    if (refId == item.id) {
      eventArray.splice(index, 1);
    }
  });

  display();
}

function editElement(refID) {
  document.getElementById("updateTable").style.display = "block";

  document.getElementById("uId").value = refID;
}

function update() {
  var id = parseInt(document.getElementById("uId").value);

  var indx = eventArray.findIndex((ref) => ref.id == id);

  var venue = document.getElementById("uVenue").value;
  var date = document.getElementById("uDate").value;

  var eventName = "cccc";
  var totalCost = "cccc";

  eventArray[indx] = {
    eventName,
    venue,
    date,
    totalCost,
    id,
  };

  display();
}
