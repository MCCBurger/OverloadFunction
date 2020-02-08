fun main() {
    //Declare variables
    var userType = 0
    var name = ""
    var phone = ""
    var busName = ""

    //Ask user which type of customer they are
    println("Are you a residential of business customer? \n 1 -> Residential \n 2 -> Business")
    print("Choice: ")
    userType = readLine()!!.toInt()
    
    //Validate and run specific functions
    when (userType) {
        1 -> {
            print("Please enter your name : ")
            name = readLine()!!.toString()
            print("Please enter your phone number: ")
            phone = readLine()!!.toString()
            customer(name, phone)
        }
        2 -> {
            print("Please enter your business name: ")
            busName = readLine()!!.toString()
            print("Please enter your name : ")
            name = readLine()!!.toString()
            print("Please enter your phone number: ")
            phone = readLine()!!.toString()
            customer(busName, name, phone)
        }
        !in 1..2 -> println("INVALID CHOICE")
    }
}

//Residential customer
fun customer(n: String, p: String) {
    println("Your name is: $n and your phone number is: $p")
}

//Business customer
fun customer(b: String, n: String, p: String) {
    println("Your business name is: $b and your n4ame is: $n and your phone number is: $p")
}

