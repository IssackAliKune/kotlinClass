fun main(args: Array<String>) {
    motto()
    mission()
    avg( 1551, 4456.78, 65454.788f)
    rectangle_area(34.0, 45.0)
    cylinder_volume("Issack", 7.0, 45.0)
}
fun motto(){
    println("Hey, This is our Motto")
}
fun mission(){
    println("Hey, This is our Mission")
}
fun avg(x:Int, y:Double, z:Float){
    var average = (x + y + z)/3.0
    println("Your Average is $average")
}
fun rectangle_area(l:Double, w:Double){
    var area = l * w
    println("Your area is $area")
}
fun cylinder_volume(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume < 10000){
        println("Hi $n, Your Volume is $volume and this is a small cylinder")
    }else{
      println("Hi $n, You Volume is $volume and this is a large cylinder")
    }

}