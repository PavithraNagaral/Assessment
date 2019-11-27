var date=new Date();
console.log(date);

var date1=new Date(0);
console.log("millisecons"+date1);

var d2=new Date(2019,10,6);
console.log("full with years "+d2);
var d3=new Date("april 24");
console.log(d3);

console.log("only years:"+d2.getFullYear());
console.log("only month:"+d2.getMonth());
console.log("only date:"+d2.getDate());

var todaysdate=date.getDate();
console.log(todaysdate);

var day=date.getDay();
console.log("date is: "+day);

var month=date.getMonth();
console.log("month is:"+month);

var months=["january","february","march","april","may","june","july","august","september","october","november","december"];
var thismonth=months[month];

console.log("=========================");
var days=["sunday","monday","tuesday","wednesday","thursday","friday","saturday"];
var thisdays=days[day];

console.log("month="+thismonth);


console.log("=====================");
var str="10";
var num=10;

if(str === num)
{
    console.log("equals")
}else{
    console.log("not")
}

var age=12
var voting=age>18? "eligible":"not eligible"
console.log(voting)
