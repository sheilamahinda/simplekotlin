fun Lameq(){
    println("This is a user defined function")
}
fun main(arg:Array<String>){
    Lameq()
    Arithmetic()
}

fun Arithmetic(){
    var num=4
    var num2=67
    println("The sum of $num and $num2 is : ${num+num2}")
    println("The product of $num and $num2 is : ${num*num2}")
    println("The quotient of $num and $num2 is : ${num/num2}")
    println("The difference of $num and $num2 is : ${num-num2}")
}

