fun main(args: Array<String>) {
    var names = arrayOf("Issack", "King", "Grace", "Mariga", "Abdullahi", "Ahmed")
    for (x in names){
        println(x)
    }

    var ages = arrayOfNulls<Int>(5)
    ages[0] = 134
    ages[1] = 435
    ages[2] = 884
    ages[3] = 945
    ages[4] = 104
    for (mwaka in ages){
        println(mwaka)
    }
}