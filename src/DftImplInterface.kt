interface DftImplInterface {
    fun callMeDefaultImplementation(){
        println("this is a kotlin interface's interface with default implementation")
    }
}

class DftImplClass: DftImplInterface

fun createDftInterface() = DftImplClass() as DftImplInterface



