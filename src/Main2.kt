fun main(){


    val coordinate = Point()

    coordinate.abscisa = 6F
    coordinate.ordinata = 9F

    println(coordinate.abscisa == coordinate.ordinata)
    println(coordinate)



    val parameter = Triangle(height = coordinate.ordinata, base = coordinate.abscisa)

    println(parameter.getArea())


}


class Point{

    var abscisa: Float = 0F
    var ordinata: Float = 1F

    override fun toString(): String {
        return "x = ${abscisa}, y = ${ordinata}"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point)
            if(this.abscisa == this.ordinata){
                return true
            }
        return false
    }
}


interface IFigure {
    fun getArea(): Float

}

class Triangle(private val height: Float, private val base: Float): IFigure {
    override fun getArea(): Float {
        return height * base / 2
    }


}