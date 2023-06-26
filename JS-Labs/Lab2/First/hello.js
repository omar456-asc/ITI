//alert("This is my prototype calculator that can only add two numbers");
var stop = false;
while(!stop){

var num = Number(prompt("enter age "));
if(num <=0)
{
    alert("Please enter valid age")
}
else if(num < 11)
{
    alert("Child");
}
else if (num > 10 && num < 19)
{
    alert("Teenager");
}
else if(num > 18 && num < 51)
{
    alert("Grown up")
}
else
{
    alert("Old")
}
const answer = confirm("Do you want to continue");
if (!answer) {
    stop=true;
  }
}