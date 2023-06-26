
function click(){
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pw").value;
    if(username=="admin"&&password=="123"){
        alert("Welocme");
    }
    else{
        alert("Not Registerd")
    }
    
}

    document.getElementById("btn").onclick=click;
    document.body.style.backgroundColor="green";