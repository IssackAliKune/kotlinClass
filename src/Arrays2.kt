import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter Name")
    var name = chukua.next()

    println("Enter Email")
    var Email = chukua.next()

    println("Enter Your Marks")
    var marks = chukua.next()

    println("Enter Your Age")
    var age = chukua.next()

    println("Hello $name, Your email is $Email, Your age is $age and You Scored $marks")
}