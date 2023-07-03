object main extends App{
    def calculateInterest(depositAmount: Double): Double = {
        if (depositAmount <= 20000){
            0.02*depositAmount
        }
        else if (depositAmount <= 200000){
            0.04*depositAmount
        }
        else if (depositAmount <= 2000000){
            0.035*depositAmount
        }
        else{
            0.065*depositAmount
        }
    }
    print(calculateInterest(16434))
}