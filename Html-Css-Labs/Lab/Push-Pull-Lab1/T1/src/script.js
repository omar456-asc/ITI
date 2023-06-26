// Select Elements
const video = document.getElementById("video");

const remainingTime = document.getElementById("remainingTime");
const totalTime = document.getElementById("totalTime");

const playPause = document.getElementById("playPause");
const stop = document.getElementById("stop");

const rewind = document.getElementById("rewind");
const begin = document.getElementById("begin");
const end = document.getElementById("end");
const fastForward = document.getElementById("fastForward");

const volume = document.getElementById("volume");
const mute = document.getElementById("mute");
const fullScreen = document.getElementById("full_screen");

//Variables
let TIME_STEP = 5;
let vol = 0;

//Helpers functions
const formatTime = (seconds) => {
  seconds = Math.round(seconds);
  let minutes = 0;
  if (seconds >= 60) {
    minutes = Math.floor(seconds / 60);
    seconds = seconds - minutes * 60;
  }

  seconds = seconds + "";
  if (seconds.length == 1) {
    seconds = "0" + seconds;
  }

  return minutes + ":" + seconds;
};

//Buttons Functions
playPause.onclick = () => {
  if (video.paused || video.ended) {
    video.play();
    playPause.innerText = "Pause";
  } else {
    video.pause();
    playPause.innerText = "Play...";
  }
};

stop.onclick = () => {
  video.pause();
  video.currentTime = 0;
  playPause.innerText = "Play";
  video.playbackRate = 1;
  playbackRate.value = 1;
};

begin.onclick = () => {
  video.currentTime = 0;
};

rewind.onclick = () => {
  video.currentTime -= TIME_STEP;
};

fastForward.onclick = () => {
  video.currentTime += TIME_STEP;
};

end.onclick = () => {
  video.currentTime = video.duration;
  playPause.innerText = "Play";
};

volume.addEventListener(
  "change",
  function () {
    video.volume = this.value;
  },
  false
);
mute.addEventListener(
  "click",
  function () {
    if (!video.muted) {
      vol = volume.value;
    }

    video.muted = !video.muted;

    if (video.muted) {
      volume.value = 0;
      mute.innerText = "Unmute";
    } else {
      volume.value = vol;
      mute.innerText = "Mute";
    }
  },
  false
);

scrubber.addEventListener(
  "change",
  function () {
    video.currentTime = this.value;
  },
  false
);

playbackRate.addEventListener(
  "change",
  function () {
    video.playbackRate = this.value;
  },
  false
);

video.addEventListener("play", function () {
  totalTime.innerText = formatTime(video.duration);
});

video.addEventListener(
  "timeupdate",
  function () {
    remainingTime.innerText = formatTime(video.currentTime);
    scrubber.value = video.currentTime;
  },
  false
);

//Full screen
function enterFullScreen(element) {
  if (element.requestFullscreen) {
    element.requestFullscreen();
  } else if (element.mozRequestFullScreen) {
    element.mozRequestFullScreen(); // Firefox
  } else if (element.webkitRequestFullscreen) {
    element.webkitRequestFullscreen(); // Safari
  } 
  else if (element.msRequestFullscreen) {
    element.msRequestFullscreen(); // IE/Edge
  }
}

let btn = document.getElementById("full_screen");
btn.addEventListener("click", function () {
  let videoEle = document.querySelector("video");
  enterFullScreen(videoEle);
});