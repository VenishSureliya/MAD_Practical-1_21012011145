import java.util.Arrays

fun main(){
    println("Create Array-1 by using arrayOf() method : ")
    val arrayOne = arrayOf(10, 20, 30, 40, 50)
    println(Arrays.toString(arrayOne) + "\n")


    println("Create Array-2 by using Array<>() : ")
    val arrayTwo = arrayOf<String>("Fabrizio", "Hakimi", "Cancelo", "Bernardo", "Kroos", "Ramos")
    println(Arrays.toString(arrayTwo) + "\n")


    println("Create Array-3 using Array<>() and Lambda function : ")
    val arrayThree = Array(7, {i -> i * 1})
    println(Arrays.toString(arrayThree) + "\n")


    println("Create Array-4 by using IntArray() : ")
    val arrayFour = IntArray(5)
    println(Arrays.toString(arrayFour) + "\n")


    println("Create Array-5 by using IntArrayOf() : ")
    val arrayFive = intArrayOf(5, 10, 15, 20, 25)
    println(Arrays.toString(arrayFive) + "\n")


    println("Create 2D Array-6 by using arrayOf() and intArrayOf() : ")
    val arraySix = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 4)
    )
    for(row in arraySix){
        println(row.contentToString())
    }
    print("\n")


    val arraySeven = Array<Int>(5){0}
    val arraySize : Int = arraySeven.size
    println("Enter array element values below : ")
    for (iCount in 0..arraySeven.size - 1){
        print("Enter element AS[$iCount] : ")
        arraySeven[iCount] = readln().toInt()
    }
    println(Arrays.toString(arraySeven) + "\n")


    print("After sorting by built-in function : ")
    Arrays.sort(arraySeven)
    println(Arrays.toString(arraySeven))


}