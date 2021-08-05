import java.util.*

fun main(args: Array<String>) {
    /*var my_scanner = Scanner(System.`in`)
    println("Enter Your Name")
    var name = my_scanner.next()

    println("Enter the Radius")
    var radius = my_scanner.nextDouble()

    println("Enter the Height")
    var height = my_scanner.nextDouble()
    cylinder_volume_One(name,radius,height)*/
    var my_scanner = Scanner(System.`in`)
    println("Enter Your name")
    var name = my_scanner.next()

    println("Enter The Weight")
    var weight = my_scanner.nextDouble()

    println("Enter The Height")
    var height = my_scanner.nextDouble()
    volume_of_bmi(name,weight,height)
}
/*fun cylinder_volume_One(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume < 10000){
        println("Hi $n, Your Volume is $volume and this is a small cylinder")
    }else{
        println("Hi $n, You Volume is $volume and this is a large cylinder")
    }*/
    fun volume_of_bmi(n:String, w:Double, h:Double){
     var volume = w / Math.pow(h,2.0)
       if (volume< 30){
           println("Hi $n, you are underweight")
       }else if (volume < 50){
           println("Hi $n, You are Overweight")
       }else
           println("You Obesssss")

    }