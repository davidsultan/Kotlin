import java.util.*

//fun main() {
//    val name = """ "David" """
//    var age = 24
//    println("My name is $name, my age is $age.")
//
//    val exampleNumber = 2_000_000
//    val exampleLong: Long = exampleNumber.toLong()
//
//    println("\n************** Arrays *********************")//  Arrays
//
//    val names: Array<String> = arrayOf("Soner", "Mesud", "Musab")
//    names[0]="david"
//
//
//    println("number of elements = ${names.size}")
//    println("the first element = ${names[0]}")
//    println("first element = ${names[0].length}")
//    println("last element = ${names.last()}")
//    println("last element = ${names[names.lastIndex]}")
//
//
//    val mixedArray1 = arrayOf(1, "king", 's')
//    val mixedArray2 = arrayOf(arrayOf(1,2,3),
//                              arrayOf(4,5,6))
//
//    println(mixedArray2[1][2])
//
//    println("\n******************** Loops *******************")
//
//    for(name in names){
//        println(name)
//    }
//    for(i in 1..20) print(i)
//    println()
//    for(i in 1 until 20) print(i)
//    println()
//    for(i in 20 downTo 1) print(i)
//    println()
//    for(i in 20L downTo 1) print(i)
//    println()
//    for(i in 'a'..'s') print(i)
//    println()
//    for(i in 1..20 step 2) print(i)
//    println()
//    for(i in 1.rangeTo(20).step(2)) println(i)
//
//    for(index in names.indices){
//        println("Index $index = ${names[index]}")
//    }
//    println()
//    var i=0;
//    outer@ do{
//        println(i)
//        i++
//        //continue
//        var j=0
//        while(j<5){
//            println("---$j")
//            j++
//            break@outer
//            println("I am not printed.")
//        }
//        println("I am printed.")
//    }while(i<5)
//
//    println("\n***************** Operators ***************")
//
//    println("2>1 is ${2>1}")
//    println("2>=1 is ${2>=1}")
//    println("2=1 is ${2==1}")
//    println("2!=1 is ${2!=1}")
//
//    println("true && false = ${true&&false}")
//    println("true || false = ${true||false}")
//
//    println(true and false)// and is different from &&
//    println(true or false)// or is different from ||
//    println(true xor false)// xor is different from |
//
//    val cond = (2>1)||(3>2)&&(2>3)//&& has priority.
//
//    var num=20
//    var count=0
//    while(num/2 >= 2){
//        count++
//        println(num)
//        num/=2
//    }
//    println(count)
//
//    for(i in 1..10){
//        var prefix = if(i !in 4..7) "-" else ">"
//        println(prefix+i)
//    }
//    println("\n***************** When ***********************")
//
//    val time=4
//    val isFriday=false
//    val greeting = when{
//        isFriday -> "I am gonna stay in the mosque all day."
//        time < 5 -> """"Patriot" politicians!"""
//        time in 0..11 -> "Thief president!"
//        time==12 || time==13 ->{
//            println("Life sucks!")
//            "We have a joystick on us!"
//        }
//        else -> "Whatever!"
//    }
//    println(greeting)
//
//    val months = 2;
//    val season = when{
//        months in 3 downTo 1 -> "Winter"
//        months < 4 -> "April"
//        else -> "none"
//    }
//    println(season)

//    println(getMax(14,45, 32))
//
//    println(getMax(900, 400,50,40,30))
//}
//fun getMax(a: Int, b: Int) = if(a>b) a else b        // OVERLOADING
//fun getMax(a: Double, b: Double) = if(a>b) a else b  // OVERLOADING
//fun getMax(a: Int, b: Int, c: Int) =
//    when{
//        a >= b && a>= c -> a
//        b >= a && b>= c -> b
//        else -> c
//    }

//fun getMax(first:Int, vararg remaining: Int): Int{
//    var max = first
//    for(i in remaining) {
//        if(i>max)
//            max=i
//    }
//    return max
//}

fun main(){
    val user1 = User(age=29)
    val user2 = User("Soner     ", 21)
//    println("${user1.name} was a prophet also a ${user2.name}...")
//    println("${user.name} is ${user.age} years old and so so hot.")
    println("${user1.name} wants to suck ${user2.name}.")
}
class User(name:String = "Donald J. Trump           ", val age: Int = 0){
    val name:String

    init {
        if (name.isBlank()) this.name = "No name"
        else this.name = name.trim()

//        println("Name: ${this.name}, age: ${age}")
    }
//    init {
//        println("hwhattt")
//    }

}


