package Oop

fun main(args: Array<String>) {
  var xyz = MySecond("Issack", "issackali@gmial.com")
    println(xyz.name)
    xyz.acc_balance_checker()
    xyz.age_checker()
}
abstract class MyFirst(open var name:String, open var email:String){
    abstract fun age_checker()
    abstract fun acc_balance_checker()

}

class MySecond(override var name:String, override var email:String):MyFirst(name,
email){
    override fun age_checker() {
        println("Yeah, i can check the age")
    }

    override fun acc_balance_checker() {
        println("Yeah, i can check the balance")
    }
}