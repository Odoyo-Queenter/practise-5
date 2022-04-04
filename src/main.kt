fun main (){
    var name = "Queenter Achieng"
    println(name)

    var weight = "50 kgs"
    println(weight)

    var age = "24 years"
    println(age)

    var phoneNumber = "0708456793"
    println(phoneNumber)

    val nationality = "Ethioian"
    println("not kenyan")

    var  isKenyan= true
    println(isKenyan)

    names("Faith")
    division(50,3)
    addition(50,50,50,50)
    facts("Queenter")

}
//
//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number,  weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
//Create variables and assign them some values for each of these fields.

//reate and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada”  (2 points)
///Create and invoke a function that given 2 numbers returns the remainder of their
//div/ision (3 points)
//Create and invoke  function that returns the sum of any given 4 numbers (3 points)
//Create and invoke a function that prints out an interesting fact about yourself (2
//points)//

fun names(name:String){
     var greeting = "Hello $name"
    println(greeting)

}
fun division(a:Int, b:Int):Int{
    var modulus = a % b

    println(modulus)
    return modulus
}
fun addition(c:Int,d:Int,e:Int,f:Int):Int{
    var sum = c + d + e + f

    println(sum)
    return sum


}
fun facts(name :String):String{
    var me = "$name  loves cooking"

    println(me)
    return me
}