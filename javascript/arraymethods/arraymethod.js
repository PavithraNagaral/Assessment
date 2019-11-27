var brands=["bisleri","kinley","kf","babaji"];
brands.forEach(function(value,index){
    console.log(value)
    console.log(index)
})

var ho=["sleep","walk","music","eat"]
// console.log(ho)
//  var s=ho.push("jumps")
//  console.log(s)
//  console.log(ho)
// ho.pop()
// ho.shift()
var h=ho.unshift("dancing")
console.log(ho)
console.log(h)

// var i=ho.indexOf("eat",3)
// console.log(i)

console.log("------------------------")
// var h=ho.join("=")
// console.log(h)
// console.log("original array",ho)

var h=ho.unshift("iiiiiiiiii")
console.log(ho)
console.log(h)


console.log("=============")
var o=ho.splice(1,0,"kkkkkk","yyyyyyyyy")
console.log(ho)

console.log("==========")
// ho.splice(0)
// console.log(ho)

console.log("=======")
var del=ho.splice(1,2,"ggg")
console.log(ho)
console.log(del)

console.log("------------")
var y=ho.slice(1,3);
console.log("the slice methos",y)
console.log("the orginal methos",ho)




console.log("========")
// var n1=[100,200,300]
// var newarray=n1.filter(function(v,i){
//     if(v>100){
//         return true;
//     }
    
//     else{
//         return false;
//     }
   
// })

console.log("orgi array",n1)
console.log("modi",newarray)

console.log("====using arrow=======")
var n1=[100,200,300]
var newarray=n1.filter(n=>n>100)
console.log("modi",newarray)


console.log("usage of map===========")
var num=[100,200,300];
 var mapped=num.map(function(v,i){
    var value=v+30;
    return value;
})

console.log("mapped",mapped)
console.log("orginal",num)


console.log("==========")
var items=[{
    name:"lipstick",
    id:1,
    price:499
},
{
    name:"eyeliner",
    id:2,
    price:999
},
{
    name:"watch",
    id:3,
    price:10000
},
{
    name:"trimmer",
    id:2,
    price:500
}]

// var new1=items.filter(v=>v.price>500)
// console.log(new1)

console.log("using map")
// var num1=items.map(function(v,i){
//       v.price=v.price+100;
//      return v;
// })

// console.log(items)

// var mappeditems=items.map(item=>{
//     var i={
//         name=item.name,
//         id=item.id,
//         price=item.price+100


//     }
    
// })
// console.log(mappeditems)
// console.log(items)

var choco=["dairymilk","milkybar","munch"]
var a=choco.includes("iii");
console.log(a)

var b=Array.isArray(choco)
console.log(b)









