fun complexcal(){
    println("complex calculator")
    println("enter the first number")
    val num1= readLine()?.toDoubleOrNull()
    println("enter the operator (+,-,*,/)")
    val operator= readLine()

    println("enter the second number")
    val num2= readLine()?.toDoubleOrNull()

    if (num1==null||operator==null||num2==null){
        println("invalid input.please put correct numbers and operators")
        return
    }
    val results=when(operator){
        "+"->num1+num2
        "-"->num1-num2
        "*"->num1*num2
        "/"->if(num2 !=0.0)num1/num2 else "you cant divide by zero"
        else->"invalid operator"
    }
    println("answer is $results")
}
fun main(args:Array<String>){
    complexcal()
}