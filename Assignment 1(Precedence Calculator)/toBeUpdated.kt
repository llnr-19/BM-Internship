//Assignment
//Task 1:(Add two numbers)
fun main(args:Array <String>) {
    var sum=args[0].toDouble()
    var operator=args[1].toString()
    val num1=args[0].toDouble()
    val num2=args[2].toDouble()
    
    if(operator=="+"){
        sum=num1+num2
    }
    else if(operator=="-"){
        sum=num1-num2
    }
     else if(operator=="*"){
        sum=num1*num2
    }
      else if(operator=="/"){
        sum=num1/num2
         }
    
    println("$num1 $operator $num2 = $sum")
}

//Task 2:(Evaluate a Mathmatical Expression)
var sum=args[0].toDouble()
for(i in 1..args.size-1){
        if(args[i]=="+"){
            sum+=args[i+1].toDouble()
        }
        else if(args[i]=="-"){
            sum-=args[i+1].toDouble()
        }
    else if(args[i]=="/" || args[i]=="*"){
            if(args[i]=="*"){
                sum*=args[i+1].toDouble()
            }
             else if(args[i]=="/"){
                sum/=args[i+1].toDouble()
            }
        }
    }
    println(sum)

//Task 3:(Evaluate an expression using presedence)
import java.util.*

fun main(args:Array <String>) {
    
}
fun order(a:Char):Int{
    var primacy: Int=0
    if(a=='^'){
        primacy=3
    }
    else if(a=='*'||a=='/'){
        primacy=2
    }
    else if(a=='+'||a=='-'){
        primacy=1
    }
    return primacy
}