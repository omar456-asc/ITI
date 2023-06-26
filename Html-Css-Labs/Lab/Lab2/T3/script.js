      var worker = new Worker("worker.js") //*promise ==> async await
      var sum = document.getElementById("sum");
      var bg = document.getElementById("bg");
      //console.log(sum,bg)

      sum.onclick = function(){
        // var summ = 0;
        // for(var i=0;i<10000000000;i++){
        //     summ+=i;
        // }
        // alert(summ)
         worker.postMessage(""); //delegation "search"
      }
      worker.onmessage = function(message){
        alert(message.data);
      }

      bg.onclick = function(){
        if(document.body.style.background !== "green"){
            document.body.style.background = "green";
        }else{
            document.body.style.background = "blue";
        }
      }
    