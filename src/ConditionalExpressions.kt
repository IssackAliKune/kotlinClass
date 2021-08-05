fun main(args: Array<String>) {
    var x = 0
    var y = if (x<10){
        "X is less than 10"
    }else{
        "X is not less than 10"
    }
    println(y)

    var number = 0
    var result = if (number == 1){
        "Oooops!!! You Lost"
    }else if (number == 2){
        "Ooops!!! You Lost"
    }else if (number == 3){
        "Congratulations!! You Won"
    }else if (number == 4){
        "Oooop!!! You lost"
    }else{
        "Please Enter a Number From 1 to 4"
    }
    println(result)

    var a = 0
    var b = when(a){
        1->{
            "One Was Found"
        }
        2->{
            "Two Was Found"
        }3->{
            "Tree Was Found"
        }
        else->{
            "Sorry, We Don't know That number"
        }
    }
    println(b)
}