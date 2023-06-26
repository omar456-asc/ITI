var can = document.getElementById("can");
    var ctx = can.getContext("2d");
    // the triangle
ctx.beginPath();
ctx.moveTo(100, 100);
ctx.lineTo(100, 300);
ctx.lineTo(300, 300);
ctx.font = "30px Comic Sans MS";
ctx.fillText("a", 230, 200);
ctx.fillText("b", 60, 220);
ctx.fillText("c", 190, 330);
ctx.closePath();
ctx.fillStyle = "red";
ctx.fill();