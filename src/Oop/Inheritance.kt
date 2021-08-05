package Oop

fun main(args: Array<String>) {
 var teacher = Mwalimu("issackaliakune@gmail.com", "issack123456")
    teacher.register()
    teacher.add_marks()
    println(teacher.email)
}
open class Mwanafunzi(open var email:String, open var password:String) {
    fun login(){
        println("Yeah, I can login")
    }
    fun register(){
        println("Yeah, i can register")
    }
}
class Mwalimu(override var email: String,
              override var password: String):Mwanafunzi(email,password){
    fun add_marks(){
        println("Yeah, I can add Marks") }

}
