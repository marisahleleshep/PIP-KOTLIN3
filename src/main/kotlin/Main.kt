fun main(){
    println(evenIndices(listOf("Marisah","Hunter","Milkah","Najma")))
    println(getAverage(listOf(23.2,98.0)))
    println(peopleList())


    val peopleList = mutableListOf<Person>(
        Person("Alice", 20),
        Person("Bob", 30),
        Person("Charlie", 40)
    )

    addPeopleToList(peopleList)

    println(peopleList)
    println(word("akirachix"))
    println(alphabets(arrayOf("Students")))




}

//How do you check if a string is a palindrome?
fun word(str:String):Boolean{
        var all = str.reversed()
        return str == all

}
//How do you sort an array of strings in alphabetical order?
fun alphabets(arr: Array<String>): Array<String>{
    return arr.sortedArray()

}


//What is the largest number in an array of integers?
fun integers(numbers: IntArray): Int {
    var largest = numbers[0]
    for (number in numbers) {
        if (number > largest) {
            largest = number
        }
    }
    return largest
}




//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun evenIndices(str: List<String>): List<String> {
    val x = mutableListOf<String>()
    str.forEachIndexed{ index, m->
        if(index%2==0)
            x.add(m)
    }
    return x
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun getAverage(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = totalHeight.toDouble ()
    return Pair(averageHeight, totalHeight)
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Attributes(var name:String,var age:Int,var heights: Int,var weight:Double)
fun peopleList() {
    val person = Attributes("Jane", 30, 120, 99.9)
    val person1 = Attributes("Mike", 12, 70, 40.9)
    val person2 = Attributes("Lenah", 25, 67, 50.5)
    val person3 = Attributes("Sammy", 33, 85, 25.85)
    val Attributes = listOf(person, person1, person2, person3)

    val sortedattributes = Attributes.sortedByDescending { Attributes -> Attributes.name }
    println(sortedattributes)
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

data class Person(val name: String, val age: Int)

fun addPeopleToList(people: MutableList<Person>) {
    val person1 = Person("John", 25)
    val person2 = Person("Jane", 30)
    people.addAll(listOf(person1, person2))
}














