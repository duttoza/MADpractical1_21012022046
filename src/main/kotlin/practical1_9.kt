fun findmax(a:Array<Int>){
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)
}
fun main()
{
    var a = arrayOf(12, 11, 1252, 54, 86, 124)
    findmax(a)

}