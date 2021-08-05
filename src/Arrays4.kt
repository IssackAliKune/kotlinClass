import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter Your Weight")
    var w = chukua.nextDouble()

    println("Enter Your Height")
    var h = chukua.nextDouble()
     var bmi = (w/h*2)
    println("Your bmi is $bmi")

}