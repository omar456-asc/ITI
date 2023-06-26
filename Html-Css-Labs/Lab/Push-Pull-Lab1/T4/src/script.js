let canva = document.getElementById("can");
const ctx = canva.getContext("2d");

ctx.strokeStyle = "red";

let x = 0,
  y = 0;

ctx.moveTo(x, y);

let interval = setInterval(function () {
  x += 5;
  y += 5;

  ctx.lineTo(x, y);
  ctx.stroke();

  if (x >= document.getElementById("can").width) {
    clearInterval(interval);
    alert("animation end");
  }
}, 25);
ctx.stroke;