var count = Number(prompt("How many numbers you want?"));
var arr = [];
var sum = 0;
for (let i=0;i<count;i++)
{
    arr[i]=Number(prompt("Enter number?"));
    sum += arr[i];
}
var avg = sum/arr.length;
document.write(`The Sum = ${sum} The Average = ${avg}`);