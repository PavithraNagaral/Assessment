function first(callback)
{
    setTimeout(function()
    {
        
        console.log("first function execution")
        callback()
    },0 )
   
}
console.log("hello")


function second()
{
    console.log("second ")
}



first(second)


