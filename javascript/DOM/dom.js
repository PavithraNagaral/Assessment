// var a=document.getElementById("demo")
// console.log(a)

// var b=a.textContent;
// console.log(b)

// var c=a.textContent="gggg"
// console.log(c)

var pele=document.querySelector("p")
var a=pele.textContent="mmmm"
console.log(a)
var f=document.getElementsByClassName("test")
console.log(f)

f[0].style.color="red"
pele.style.fontSize="40px"
pele.style.color="green"

var qele=document.querySelectorAll(".test")
console.log(qele)

var button=document.createElement("button")
button.textContent="click"
var c=document.body.appendChild(button)

var para=document.createElement("p")
para.textContent="hii fine"
document.body.appendChild(para)

document.write("iii")


var ele=document.getElementById("add")
ele.className="xyz"