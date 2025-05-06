class Payment(inputPaymentID:String,inputAmount:Float,inputMethod:String){
    val paymentID:String =inputPaymentID
    val amount: Float=inputAmount
    val method:String=inputMethod

    //pseudofunction... An to payment einai valid (mesw kapoioy check apo api), return true
    fun pay(paymentValid:Boolean):Boolean{
        if(paymentValid==true){
            return true
        }else{
            return false
        }
    }
}
