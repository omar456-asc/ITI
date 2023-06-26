function getLoc(){
	navigator.geolocation.getCurrentPosition(showLoc,showError,options);
}
function showLoc(e){
	var long = e.coords.longitude;
	var lat = e.coords.latitude;
	//location.assign("http://maps.google.com/maps/" +"@"+ lat + ",+" + long+",21z");
	let infoWindow = new google.maps.InfoWindow();
const pos = {
            lat: e.coords.latitude,
            lng: e.coords.longitude,
          };
let map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: -34.397, lng: 150.644 },
    zoom: 6,
  });
 	infoWindow.setPosition(pos);
          infoWindow.setContent("Location found.");
          infoWindow.open(map);
          map.setCenter(pos);
}
function showError(x){
	switch(x.code){
		case 0:
			console.log(x.message);
			break;
		case 1:
			console.log(x.message);
			break;
		case 2:
			console.log(x.message);
			break;
		case 3:
			console.log(x.message);
			break;
	}
}
var options= {
	enableHighAccuarcy: true,
	timout: 1000,
	maximumAge: 1000
};