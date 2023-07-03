object main extends  App{
    def number(num: Int): String = {
        if(num <= 0){
            "Negative/Zero"
        }
        else if(num%2 == 0){
            "Even"
        }
        else{
            "Odd"
        }
    }
    val a = scala.io.StdIn.readInt()
    print(number(a))
}