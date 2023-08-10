fun main(args:Array<String>) {
    var num=5
    if(num>10){
        println("the number is greater")
    }else{
        println("the number is less")
    }
//    if..elseif else statement
    val nambari=89
    if (nambari<0){
        println("its a negative number")
    }else if (nambari>0 && nambari<10)
        println("its a one digit number")
    else if (nambari>=10 && nambari<100)
        println("its a double digit number")
    else
    println("its a three or more digit number")
//    create an if..elseif else statement to check marks as pass,fail,distinction and credit
    val marks=75
    if (marks>=80 && marks<100){
        println("you have a distinction")
    }else if (marks>=60 && marks<80)
        println("you have passed")
    else if (marks<60)
        println("you have failed")
    else
        println("wrong input")
}