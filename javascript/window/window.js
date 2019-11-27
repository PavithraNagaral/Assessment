console.log(window)
console.log(this)
console.log(window===this)

var a=10;
console.log(a)
console.log(window.a)

function add()
{
    console.log("add method")
}
add()
console.log(window.add())

// alert("harmful")
var e=confirm("r u fine")
console.log(e)
var age=prompt("enter age",0);
console.log(age)
                                                                                                            