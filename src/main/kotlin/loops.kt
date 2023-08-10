fun main(args:Array<String>){
//    for loops
    for (i in 5..15) {
        println("my loops: $i")
    }
    var myarr= arrayOf("Eric","John","Clare","Purity")
    for (names in myarr){
        println("student : $names")
    }
//    do while
    var num=30
    do{
        println("loop : $num")
        num+=6
    }while (num<=110)
}