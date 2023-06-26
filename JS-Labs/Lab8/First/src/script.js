// Create a "close" button and append it to each list item
var myNodelist = document.getElementsByTagName("LI");
for (let i = 0; i < myNodelist.length; i++) {
  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  var span1 = document.createElement("SPAN");
  var txt1 = document.createTextNode("\u2713");
  span1.className="start";
  span1.appendChild(txt1);  
  myNodelist[i].appendChild(span);
  myNodelist[i].appendChild(span1);
}

// Click on a close button to hide the current list item
var close = document.getElementsByClassName("close");
for (let i = 0; i < close.length; i++) {
  close[i].onclick = function() {
    var div = this.parentElement;
    div.style.display = "none";
  }
}
// Add a "checked" symbol when clicking on a list item
var start = document.getElementsByClassName("start");
for (let i = 0; i < start.length; i++) {
    start[i].onclick = function() {
      var div = this.parentElement;
      if(div.className=='checked'){
        div.className='';
      }
      else{
        div.className='checked';
      }
      
    }
  }
  

// Create a new list item when clicking on the "Add" button
function newElement() {
  var li = document.createElement("li");
  var inputValue = document.getElementById("input").value;
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
    alert("Cannot add empty Item");
  } else {
    document.getElementById("lists").appendChild(li);
  }
  document.getElementById("input").value = "";

  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  var span1 = document.createElement("SPAN");
  var txt1 = document.createTextNode("\u2713");
  span1.className="start";
  span1.appendChild(txt1);  
  li.appendChild(span);
  li.appendChild(span1);

  for (let i = 0; i < close.length; i++) {
    close[i].onclick = function() {
      var div = this.parentElement;
      div.style.display = "none";
    }
  }
  for(let i =0;i<start.length;i++){
    start[i].onclick=function(){
  var div = this.parentElement;
  if(div.className=='checked'){
    div.className='';
  }
  else{
    div.className='checked';
  }
}
}
}