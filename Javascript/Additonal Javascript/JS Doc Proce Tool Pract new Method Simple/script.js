function process() {
  var orignalDoc = document.getElementById("documentInput").value;
  var words = orignalDoc.split(" ");
  var findText = document.getElementById("findText").value;
  var replaceText = document.getElementById("replaceText").value;
  var countWord = document.getElementById("countWord").value;

  var pd = document.getElementById("pd");
  pd.style.display = "block";

  // var ProcessedDoc = orignalDoc.replace(
  //   new RegExp(findText, "g"),
  //   replaceText
  // );

  ///////////////////////////////////////// IMP PART ////////////////////////////////////////////////

  var ProcessedDoc = orignalDoc.replaceAll(findText, replaceText);

  var count =
    orignalDoc.toLowerCase().split(countWord.toLowerCase()).length - 1;

  ////////////////////////////////////////////////////////////////////////////////////////////////////

  var text1 = "Documrnt With Replaced text: " + ProcessedDoc;
  var text2 = "Occurence of " + countWord + " : " + count;

  var p1 = document.createElement("p");
  p1.innerHTML = text1;

  var p2 = document.createElement("p");
  p2.innerHTML = text2;

  var processedDocument = document.getElementById("processedDocument");

  processedDocument.appendChild(p1);
  processedDocument.appendChild(p2);
}
