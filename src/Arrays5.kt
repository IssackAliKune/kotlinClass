import java.util.*

fun main(args: Array<String>) {
    var scanner_yangu = Scanner(System.`in`)
    println("How Many Students do You Have?")
    var Number_of_Names = scanner_yangu.nextInt()

    //Instantiate a string array that can only Accommodate
    //upto the number entered
    println("Enter the $Number_of_Names names")
    var names = arrayOfNulls<String>(Number_of_Names)
    //write a loop to take the names
    var position = 0
    while (position < Number_of_Names) {
        names[position] = scanner_yangu.next()
        position++
        }
        for (jina in names){
            println(jina)
        }


}