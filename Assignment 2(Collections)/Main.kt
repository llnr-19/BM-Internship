//Nooreldin Ayman  Assignment 2

//      NOTE
// Run each task separately
fun main(args: Array<String>) {
    //Task 1
    val list = mutableListOf("Maze", "Mr.", "More")
    for (item in list) {
        if (('r' in item) && item.startsWith('M')) {
            println(item)
            break
        }
    }

    // // Task 2
    // val list=mutableListOf("Maze", "Mr.","More")
    // var counter:Int=0
    // var ind=0
    // for(item in list){
    //   if(('r' in item)&& item.startsWith('M') ){
    //     counter++
    //     ind=list.indexOf(item)
    //   }
    // }
    // if(counter==0){
    //   println("Not found !!")
    // }
    // else if(counter==1){
    //   println(list[ind])
    // }
    // else{
    //   println("Found")
    // }

    // //Task 3
    //   val count=3
    // val list=listOf("a" , "abc")
    // var counter:Int=0
    // for(item in list){
    //     if(item.length< count){
    //         println(" count: $count \n item: $item , item length: ${item.length}\n Counter: $counter")
    //         println(false)
    //     }
    //     else{
    //       counter ++
    //     }
    // }
    // if(counter==list.size){
    //     println(true)
    // }

    // //Task 4
    // val list = mutableListOf("a", "Ma.", "M.")
    // var ind=0
    // for (item in list) {
    //     if (('a' in item) && item.startsWith('M')) {
    //         ind=list.indexOf(item)
    //         break
    //     }
    // }
    // println("item: ${list[ind]} , index: $ind")
    // for(i in 0 until ind){
    //     println(list[i])
    // }

    // //Task 5
    // val count=3
    // val list=mutableListOf("a","abc","ab","abgf")
    // var ind=0
    // for(item in list){
    //   if(item.length>=count){
    //     ind=list.indexOf(item)
    //     break
    //   }
    // }
    // println("item: ${list[ind]} , index: $ind")
    // for(i in ind until list.size){
    //   println(list[i])
    // }

    // //Task 6
    // val list=mutableListOf("a","abc","ab")
    // val newList =mutableListOf<Any>()
    // for(item in list){
    //   newList.add(item.length)
    // }
    // println(newList)

}