let person={
    name:"shalini",
    age:20,
    hobbies:["sing","music"]
}

let {name,hobbies}=person;
console.log(hobbies)

console.log("===========")
displayname(person)
function displayname({name,hobbies})
{
    console.log(name)
    console.log(hobbies)
}

console.log("------------")
let hobbie=["singing","dancing","jumping"]
let [hobby0,hobby1]=hobbie;
console.log(hobby0)
console.log(hobby1)