var firstNum = Number(prompt("Enter first number"));
var op = prompt("what do you want (sum,multi,subtract,moduls)");
var secNum = Number(prompt("Enter Second number"));
var result =0;
        switch(op){
            case "sum":
                result=firstNum+secNum;
    		alert("The result ="+result);
            break;
            case "multi":
                result=firstNum*secNum;
    alert("The result ="+result);

            break;
            case "subtract":
                result=firstNum-secNum;
    alert("The result ="+result);
            break;
		case "moduls":
                result=firstNum%secNum;
    alert("The result ="+result); 
            break;

        }
        var stop=false;
        while(!stop)
        {
                 op = prompt("what do you want (sum,multi,subtract,moduls)");
                 secNum = Number(prompt("Enter number"));
                 switch(op){
                        case "sum":
                            result+=secNum;
                                alert("The result ="+result);
                        break;
                        case "multi":
                            result*=secNum;
                alert("The result ="+result);
            
                        break;
                        case "subtract":
                            result-=secNum;
                alert("The result ="+result);
                        break;
                            case "moduls":
                            result%=secNum;
                alert("The result ="+result); 
                        break;
            
            
                    }
        const answer = confirm("Do you want to continue");
        if (!answer) {
            stop=true;
          }
        }
