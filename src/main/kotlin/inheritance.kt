open class animal(val name:String){
    open fun makesound(){
        println("$name makes a sound")
    }
}
class  cat(name: String):animal(name){
    override fun makesound(){
        println("$name meows")
    }
}
class dog(name: String):animal(name){
    override fun makesound(){
        println("$name barks")
    }
}
fun main(args: Array<String>){
    val dog=dog(name = "buddy")
    val cat=cat(name = "whiskers")
    dog.makesound()
    cat.makesound()
}