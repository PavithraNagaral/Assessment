const promise=new Promise(function(resolve,reject)
{
    if(2>10)
    {
        resolve("success")
    }else{
        reject("error")
    }
})

promise.then(function(data)
{
    console.log("data",data)
}).catch(function(error){
    console.log("error",error)
})

const persondata=new Promise(function(resolve,reject)
{
    if(20>10)
    {
        let data=[10,20,30]
        resolve(data)
    }
    else{
        reject("no data")
    }
})

persondata.then(function(pdata)
{
    console.log("data",pdata)
    pdata=pdata.push(34,87);
    return pdata;
}).then(function(pladata)
{
    console.log("planet data",pladata);
}).catch(function(err)
{
    console.log("error",err)
})