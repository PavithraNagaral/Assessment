function formula() {
	var select = document.getElementById('selectOption');
 	var selectOption = select.options[select.selectedIndex].value;

    if(selectOption === "pound") {
    		reset();
    		document.getElementById("output").style.visibility="visible";
			document.getElementById('lbsInput').addEventListener('input',function(e){
			let lbs=e.target.value;
			document.getElementById('poundOutput').innerHTML=lbs * 1;
			document.getElementById('kgOutput').innerHTML = (lbs * 0.453592).toFixed(2);
			document.getElementById('gramsOutput').innerHTML = (lbs * 453.592).toFixed(2);
			document.getElementById('ozOutput').innerHTML = (lbs * 16).toFixed(2);
		})

    } else if(selectOption === "kg") {
    		reset();
    		document.getElementById("output").style.visibility="visible";
			document.getElementById('lbsInput').addEventListener('input',function(e){
			let lbs=e.target.value;
			document.getElementById('kgOutput').innerHTML=lbs * 1;
			document.getElementById('poundOutput').innerHTML = (lbs * 2.20462).toFixed(2);
			document.getElementById('gramsOutput').innerHTML = (lbs * 1000).toFixed(2);
			document.getElementById('ozOutput').innerHTML = (lbs * 35.274).toFixed(2);
		})

    } else if(selectOption === "default"){
    	document.getElementById("output").style.visibility="hidden";
    	}
}


function reset(){
	document.getElementById("lbsInput").value="";
	document.getElementById("lbsInput") .focus();
}