fun main(args:Array<String>){
    var ch='b'
    when(ch){
        'a' -> println("a IS A Vowel")
        'e' -> println("e IS A Vowel")
        'i' -> println("i IS A Vowel")
        'o' -> println("o IS A Vowel")
        'u' -> println("u IS A Vowel")

        else -> println("$ch is a consonant")
    }
    var num1=323
    num1=56
    when(num1){
        in 1..9 -> println("its a single digit no")
        in 10..99 -> println("its a double digit number")
        in 100..999 -> println("its a three digit number")
        else-> println("has more than three digits")
    }
}