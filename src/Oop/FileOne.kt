package Oop

import java.util.*

fun main(args: Array<String>) {
   var gari1 = Car()
    println(gari1.model)
    var mwanafunzi1 = Studendts("Ahmed", 23, "EMB/001")
    var mwanafunzi2 = Studendts("Abdullahi", 30, "EMB/002")
    var mwanafunzi3 = Studendts("Grace", 13, "EMB/003")

    println(mwanafunzi2.name+"    "+mwanafunzi2.age+"    "+mwanafunzi2.adm_no)

    var chukua = Scanner(System.`in`)
    println("Enter Name")
    var name = chukua.next()
    println("<enter age")
    var age = chukua.nextInt()
    println("Enter Admisssion number")
    var Admission = chukua.next()
    var mwanafunzi = Studendts(name, age, Admission)
    println(mwanafunzi.name+"   "+mwanafunzi.age+"    "+mwanafunzi.adm_no)
}

class Car{
    var model = "Mercedes 2016"
    var color = "Gray"
    var price = 3000000.0

    fun accelerate(){
        println("Yeah, I Can Accelerate")
    }

    fun brake(){
        println("Yeah, I Can Brake")
    }

}

class Studendts(name:String, age:Int, adm_no:String){
    var name:String
    var age:Int
    var adm_no:String
    //This is a constructor
    init {
        this.name = name
        this.age = age
        this.adm_no = adm_no
    }
    fun register(){
        println("Yeah, i can register")
    }
    fun login(){
        println("Yeah, i can login")
    }

}