let ele=document.createElement("p");
function greet(message){
    let name="bbbb"
    alert(message+" "   +name)
    alert(`${message} ${name}`)
    console.log(`${2+2}`)
    console.log("2+2")
}

function changefont()
{
    let ele=document.getElementById("test");
    ele.style.fontSize="50px"
}

function changefonttoold(){
    let ele=document.getElementById("test");
    ele.style.fontSize="20px"

}
function showdata(){
    console.log("key pressed")

}

function release()
{
    console.log("key released")
}

function showele()
{
   
   let a= ele.textContent="created p"
    
   document.body.appendChild(ele)
    //document.write(a)
   

}

let ele1=document.getElementById("d")
ele1.onclick=function()
{
    alert("clicked")
}

let d=document.getElementById("t")
d.addEventListener("click",function()
{
    alert("clickedddddddddddddddddd")
})