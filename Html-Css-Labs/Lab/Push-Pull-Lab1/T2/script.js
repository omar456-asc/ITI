function myColour() {

	var red = document.getElementById('red').value;

	var green = document.getElementById('green').value;

	var blue = document.getElementById('blue').value;

	// rgb() function is used to create the color
	// from red, green and blue values
	var colour = 'rgb(' + red + ',' + green + ',' + blue + ')';

	document.getElementById('txt').style.color = colour;

	
}

document.getElementById('red').addEventListener('input', myColour);
document.getElementById('green').addEventListener('input', myColour);
document.getElementById('blue').addEventListener('input', myColour);
