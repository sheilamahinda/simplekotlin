class wanafunzi(val jina:String,var miaka:Int, val gender:String){

}
fun main(args:Array<String>){
    val mimi=wanafunzi(jina = "erick", miaka = 32, gender = "male")
    println("student name is: ${mimi.jina} age is ${mimi.miaka} and is a ${mimi.gender}")
    val yeye=wanafunzi(jina = "ken", miaka = 23, gender = "male")
    println("student name is:${yeye.jina} age is ${yeye.miaka} and is a ${yeye.gender}")
}