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

fun main(args: Array<String>) {
    println(evaluateExpression(args))
}

fun isOperand(a: String): Boolean {
    return when (a) {
        "+", "-", "*", "/" -> true
        else -> false
    }
}

fun primacy(a: String): Int {
    var order = 0
    when (a) {
        "*", "/" -> order = 2
        "+", "-" -> order = 1
    }
    return order
}

fun operation(a: Double, b: Double, operand: String): Double {
    var res = 0.0
    when (operand) {
        "+" -> res = a + b
        "-" -> res = a - b
        "*" -> res = a * b
        "/" -> res = a / b
    }
    return res
}

fun evaluateExpression(exp: Array<String>): Double {
    val operands: Stack<String> = Stack()
    val digits: Stack<Double> = Stack()
    for (i in exp) {
        if (isOperand(i)) {
            while (operands.isNotEmpty() && primacy(i) <= primacy(operands.peek())) {
                digits.push(operation(digits.pop(), digits.pop(), operands.pop()))
            }
            operands.push(i)
        } else if (i == "(") {
            operands.push(i)
        } else if (i == ")") {
            while (operands.peek() != "(") {
                digits.push(operation(digits.pop(), digits.pop(), operands.pop()))
            }
            digits.pop()
        } else {
            digits.push(i.toDouble())
        }
    }

    while (operands.isNotEmpty()) {
        digits.push(operation(digits.pop(), digits.pop(), operands.pop()))
    }

    return digits.pop()
}
