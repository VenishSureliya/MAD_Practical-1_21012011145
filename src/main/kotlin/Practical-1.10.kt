import java.util.*

/*class Student(val name: String, val enrNo: Int){

    val hisName = "Name of the student : $name".also(::println)
    val hisEnrNo = "Enrollment no of the student : $enrNo".also(::println)

}*/

class Student(val name: String, val enrNo: Int){
    val stName: String
    var stEnrNo: Int


    init {
        stName = name
        stEnrNo = enrNo

        println("Name : $stName")
        println("Enrollment No : $stEnrNo")

    }

    override fun toString(): String {
        return super.toString()
    }

}
fun main(){
    val stInfoOne = Student ("Venish", 145)
}