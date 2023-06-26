var username = prompt("Enter username");
var password = prompt("Enter password");
if(username != "admin"){
    alert("Incorrect username");
}
if(password !="421$$"){
    alert("Incorrect password")
}
if(username == "admin"&&password=="421$$" ){
    alert("Welcome Login success")
}
//document.write(`Welcome ${firstName} ${lastName} you are ${age} years old`);