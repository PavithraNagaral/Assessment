function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
    }, 1000);
}

//function to set the counter
  function start ( ) {

      var inn=document.getElementById("in").value;
    var fiveMinutes = 60 * inn,
        display = document.querySelector('#time');
    startTimer(fiveMinutes, display);
};
function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
    }, 1000);
}

//function to set the counter
  function start ( ) {

      var inn=document.getElementById("in").value;
    var fiveMinutes = 60 * inn,
        display = document.querySelector('#time');
    startTimer(fiveMinutes, display);
};
