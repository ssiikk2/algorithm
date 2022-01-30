package `10162`

import java.util.*

class main {
    init {
        val n = Scanner(System.`in`)
        var val0 = n.nextInt()
        var val1 = 0
        var val2 = 0
        var val3 = 0
        if (val0 % 10 != 0) {
            System.out.println("-1")
        } else {
            while (val0 >= 10 && val0 <= 10000) {
                if (val0 >= 300) {
                    val0 -= 300
                    val1++
                } else if (val0 >= 60) {
                    val0 -= 60
                    val2++
                } else if (val0 >= 10) {
                    val0 -= 10
                    val3++
                }
            }
            println("$val1 $val2 $val3")
        }
    }


}