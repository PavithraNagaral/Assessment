var hobbies=["sleeping","eating","singing","travelling","againsleeping"];
console.log("========using for loop")
for(var i=0;i<hobbies.length;i++)
{
    console.log(hobbies[i])
}


console.log("using for of===================")

for( var hobby of hobbies)
{
    console.log(hobby)
}

console.log("using for in===================")

for( var hobby1 in hobbies)
{
    console.log[hobbies.hobby1]
}

var employee={
    name:"adi",
    age:22,
    color:'white',
    phone:999999999,
    hobbies:["travelling","cooking","sleeping"]
}

var name=employee["name"]
console.log(name);
var age=employee["age"]
console.log(age)
var color=employee.color
console.log(color)


console.log("==================using for in===========")
for(var key in employee)
{
    console.log(employee[key])
}