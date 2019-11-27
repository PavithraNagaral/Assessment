var a;
var b=10;
var a=20;
console.log(a)
var a=30;
console.log(a)


if(10<20)
{
    var c=40;
    console.log("inside",+c)
}
console.log("outside "+c)

for(var i=0;i<4;i++)
{

}
console.log("the value of i outside"+i)

console.log("==========let keyword===========")
//console.log("value of q"+q)//before declartion
let p;
let q=20;
p=30;
//let p=40;cant reintialize
console.log("p is"+p)

console.log("======const===========")
//const x; v hv to declare the value for const

const x=10;
console.log("the constant value "+x)

const y=[10,20,30];
// y={};cant reassign

y.push(100)//possible 
console.log(y)
