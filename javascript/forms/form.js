function validateform()
{
    let username1=document.forms['loginform']['username']
    let passwordele=document.forms['loginform']['password']
    if (username1.value.trim().length > 5 )
    {
        let pele=document.getElementById("pele")
        pele.style.display="none"
        
        
    }
     else{
        //  alert("please fill details")
        let pele=document.getElementById("pele")
        pele.style.display="block"
       
    }

    
     if( passwordele.value.trim().length>5 )
    {
        let pwd=document.getElementById("pwd")
        pwd.style.display="none"
       
        
    }
     else{
        //  alert("please fill details")
        let pwd=document.getElementById("pwd")
        pwd.style.display="block"
        
    }
   
    if(username1.value.trim().length > 5 && passwordele.value.trim().length>5)
    {
        alert("data saved")
        return true
        
    }
     else{
        
        
     }
     }

    function mypass(){
        let a=document.getElementById("pwd")
        if(a.type=="password"){
            a.type="text"
        }else{
            a.type="password"
        }

    }


    


