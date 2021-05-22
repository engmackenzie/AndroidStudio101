////class Car constructor(val make: String, val model: String, val color: String) {
////    fun accelerate() {
////        println("Buzz")
////    }
////    fun details(){
////        println("This is a $color $model $make")
////
////    }
////}
////class Truck(val make: String, val model: String, val towingCapacity:Int){
////    fun tow(){
////        println("Taking the horses by the skin")
////    }
////    fun details(){
////        println("The $model $make has a max towing capacity of $towingCapacity Tonnes")
////    }
////}
//
//open class Vehicle(val make: String, val model:String){
//
//    fun accelerate(){
//        println("Sound")
//    }
//    fun park(){
//        println("Parking")
//    }
//    fun brake(){
//        println("Stopping")
//    }
//    open fun details(){
//        println("It is a $model $make")
//    }
//}
//
//class Car(make: String,model: String, var color: String): Vehicle(make,model)
//
//class Truck(make: String,model: String,var towingCapacity:Int): Vehicle(make,model){
//
//    override fun details() {
//        println("It is a $model $make with a towing capacity of $towingCapacity lbs")
//    }
//}
//
//fun main() {
//
//    val tesla = Car("Tesla","Model S","Red")
//    tesla.accelerate()
//    println(tesla.color)
//
//    val cyberTruck = Truck("CyberTruck","3drive",1000)
//    cyberTruck.details()
//
////    val car = Car(make = "Toyota", model = "Medium", color = "Silver")
////    println(car.make)
////    println(car.model)
////    car.accelerate()
////    car.details()
////
////    val truck = Truck("Cybertruck","3drive",1000)
////    truck.tow()
////    truck.details()
//}