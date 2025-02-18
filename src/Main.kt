fun main() {
    var age = 0
//1.2   age = null

    //2
    var city:String? = "Tokyo"
    city = null

    //3
    println(city?.length)

    //4
    city?:"default city" //no null allowed >:(

    //5.2
    doubleOrNull("Abdulwahab")
    doubleOrNull(null)
}

//5.1
fun doubleOrNull(isItADouble:String?){
   println(isItADouble?.reversed())
}