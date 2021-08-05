import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("Enter The principal")
    var p = my_scanner.nextDouble()

    println("Enter the Rate")
    var r = my_scanner.nextDouble()

    println("Enter Time")
    var t = my_scanner.nextDouble()

    var interest = (p * r * t)/100.0;
    println("Your interest is $interest")
}