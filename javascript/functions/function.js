console.log("named functions==============")
add(10,30)

function add(n1,n2)
{
    sum=n1+n2
    console.log("sum is:"+sum)
}


console.log("ananymous functions=========")

var a=function(n1,n2)
{
    sum=n1+n2
    console.log("sum is:"+sum)
}
a(10,20)


console.log("self invoked==========");
(function(n1,n2)
{
    sum=n1+n2
    console.log("sum is:"+sum)
})(5,5)


console.log("arrow=======")
var division=(val1,val2)=>{
    val=val1*val2;
    console.log(val)
}
division(3,7)

var a=(n1,n2)=>{
    sum=n1+n2
    console.log("sum is:"+sum)
}
a(80,70)

var sum=(i,j)=>i+j;
var value=sum(10,40)
console.log(value)                            


console.log("=========================")
