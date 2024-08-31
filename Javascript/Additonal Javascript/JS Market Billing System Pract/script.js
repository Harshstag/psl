let totalAmount = 0;

function addItem() {
  var name = document.getElementById("name").value;
  var price = document.getElementById("price").value;
  var quantity = document.getElementById("quantity").value;
  var total = parseInt(price) * parseInt(quantity);

  var tr = document.createElement("tr");
  var td1 = document.createElement("td");
  var td2 = document.createElement("td");
  var td3 = document.createElement("td");
  var td4 = document.createElement("td");

  td1.innerHTML = name;
  td2.innerHTML = price;
  td3.innerHTML = quantity;
  td4.innerHTML = total;

  tr.appendChild(td1);
  tr.appendChild(td2);
  tr.appendChild(td3);
  tr.appendChild(td4);

  document.querySelector("#table tbody").appendChild(tr);

  totalAmount += total;

  document.getElementById("net_total").innerHTML =
    "Your Net Amount is Rs. " + totalAmount;
}
