fun getfullname(firstname:String, lastname:String=""): String{

    return if (lastname.isNotEmpty()){
        "$firstname $lastname"
    }else{
        firstname
    }
}

fun calculatescore(correctanswer:Int, totalquestions:Int):Int{

    return (correctanswer *100)/totalquestions
}
fun main(args: Array<String>) {
    val stud1=getfullname("Erick","Were")
    println(stud1)

    val correctanswer=35
    val totalquestions=100
    val score=calculatescore(correctanswer, totalquestions)
    println("Your score is: $score")


// lambda function //
    val sum ={num1:Int, num2:Int ->num1+num2}
    println("20+7 : ${sum(20,7)}")
}

//create a function that displays a complex calculator using input and output concepts//
