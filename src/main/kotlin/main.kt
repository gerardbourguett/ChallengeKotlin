fun main() {
    for (i in 1..100){
        while (i%3==0 && i%5!==0){
            println("$i Falabella")
            break
        }
        while(i%3!=0 && i%5==0){
            println("IT")
            break
        }
        while(i%3==0 && i%5==0){
            println("Integraciones")
            break
        }
        if(i%3!=0 && i%5!=0){
            println(i)
        }
    }
}