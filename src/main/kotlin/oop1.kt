class people(val name:String,val age:Int, val gender:String) {
    //member function for intro
    fun jitambukishe() {
        println("hi my name is $name, im $age years old and i am a $gender")
    }
//    member function to have a birthday
    fun havebirthday(){
//        age++
    println("$name just turned $age")
    }
}
fun main(args:Array<String>){
//    create aninstance (objects) of the class
    val watu=people(name = "john", age = 45, gender = "male")
    watu.jitambukishe()
    watu.havebirthday()
    val watu1=people(name = "stella", age = 33, gender = "female")
    watu1.jitambukishe()
    watu1.havebirthday()
    val watu2=people(name = "ken", age = 56, gender = "male")
    watu2.jitambukishe()
    watu2.havebirthday()
}