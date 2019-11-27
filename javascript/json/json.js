const person={
    name:"sundari",
    age:33,
    weight:60,
    hobbies:["music","sing"]
}
const JSONObject=JSON.stringify(person)
console.log(JSONObject)

const jobject=JSON.parse(JSONObject)
console.log(jobject)