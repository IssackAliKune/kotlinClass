import java.util.*

fun main(args: Array<String>) {
    var scanner_yangu = Scanner(System.`in`)
    println("How Many Students do You Have?")
    var Number_of_Names = scanner_yangu.nextInt()
    println("Enter the names with their corresponding ADM numbers")
    var names = arrayOfNulls<String>(Number_of_Names)
    var adm_numbers = arrayOfNulls<String>(Number_of_Names)

    var position = 0
    while (position < Number_of_Names){
        names[position] = scanner_yangu.next()
        adm_numbers[position] = scanner_yangu.next()
        position++
    }
    var print_position = 0
    while (print_position < Number_of_Names){
        println("Names is "+names[print_position]+"------ADM No is "
                +adm_numbers[print_position])
        print_position++

    }
}