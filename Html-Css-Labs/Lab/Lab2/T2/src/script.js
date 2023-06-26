var btn = document.getElementById("btn")
      //console.log(btn);
      btn.addEventListener('click',function(){
        var name = document.getElementById("name").value;
        var age = document.getElementById("age").value;
        var email = document.getElementById("email").value;
        //console.log(name,age);
        localStorage.setItem("username",name);
        localStorage.setItem("userage",age);
        localStorage.setItem("email",email);
      });