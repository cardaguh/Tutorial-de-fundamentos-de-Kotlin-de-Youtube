
fun main(param: Array<String>){
    /*print("Ingrese primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese primer número: ")
    val num2 = readLine()!!.toInt()

    val suma = num1 + num2

    println("La suma de los dos números es: $suma")*/

    /*val num1 = 5
    val num2 = 6
    if(num1 > num2)
        println("El numero 1 es el mayor")
    else
        println("El numero 2 es el mayor")*/

    /*var x = 0
    while(x <= 10) {
        println(x)
        x += 1
    }*/

    /*for(i in 10 downTo 3 step 2)
        println(i)*/

    /*println("Ingrese su edad: ")
    val edad = readLine()!!.toInt()

    when{
        edad < 18 -> println("No puede ingresar a la película!")
        edad >= 18 -> println("Puede ingresar a la película")
    }*/

   /* val numero1  = 3
    val numero2 = 4
    val result = sumar(numero1, numero2)
    println("El resultado de la suma es: $result")*/

    /*fun sumar(v1: Int, v2: Int): Int{
    val suma = v1 + v2
    return suma
    }*/

    /*var acum = 0f
    var cont = 0f
    var promedio = 0f

    val notas: FloatArray
    notas = FloatArray(4)



    for(i in 0..3){
    print("Ingrese nota: ")
    notas[i] = readLine()!!.toFloat()
        acum = acum + notas[i]
        cont++
    }

    promedio = acum / cont
    println("El promedio es: $promedio");
    }*/

    val objetoClase = SumarRestar()
    objetoClase.ingresarNumeros()
    objetoClase.sumar()
    objetoClase.restar()
}

    class SumarRestar{
        var num1: Int = 0
        var num2: Int = 0

        fun ingresarNumeros(){
            print("Ingrese el primer número: ")
            num1 = readLine()!!.toInt()

            print("Ingrese el segundo número: ")
            num2 = readLine()!!.toInt()
        }

        fun sumar(){
            val suma = num1 + num2
            println("La suma es: $suma ")
        }

        fun restar(){
            val resta = num1 - num2
            println("La resta es: $resta ")
        }
}




