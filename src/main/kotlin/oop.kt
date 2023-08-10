class computer{
    var brand=""
    var price=0
    var specs=""
}
fun main(args: Array<String>){
    //create object//
    val myobj=computer()
    myobj.brand= "Hewlett pack"
    myobj.price= 80000
    myobj.specs="core i7 512 ssd 16gb Ram"
    println("My laptop is ${myobj.brand}and it is ${myobj.specs}and it costs Kshs ${myobj.price}")
}