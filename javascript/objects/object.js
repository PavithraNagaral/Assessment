var person={
    firstname:"prathiba",
    lastname:"sudarshan",
    gender:"f",

    eat: function()
    {
        console.log("loves eating");
    },
    getfullnme: function()
    {
        return this.firstname+""+this.lastname;
    },
    sleep: function()
    {
        console.log("loves sleeping");
    },
    gender1: function(){
        return gender;
    }


}
var firstname=person.firstname;
var lastname=person.lastname;
var gender=person.gender;
person.eat();
var fullname=person.getfullnme();
person.sleep();
console.log(firstname);
console.log(lastname);
console.log(fullname);
console.log(gender);
var g=person.gender1();
console.log(g);
