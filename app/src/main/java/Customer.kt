class Customer(inputName: String,inputEmail: String,inputLocation:String,inputPassword:String) {
    var name: String=inputName
    val email: String=inputEmail
    var location: String=inputLocation

    var password:String=inputPassword

    //support variable gia na ginetai true/false me login sign in
    var isSignedIn: Boolean=true

    //unit sto kotlin antistoixo toy null
    //pairnoyme to name kai password poy egrapse o xristis kai elegxoyme an einai swsta
    fun signIn(inputtedName:String,inputtedPassword:String): Unit{
        if(inputtedName==this.name && inputtedPassword==this.password) {
            this.isSignedIn = true
        }else{
            println("Sign In failed")
        }
    }
    fun logOut(): Unit{
        this.isSignedIn=false
    }
    //theoroyme oti to createAccount einai to constructor kai ginete mesw twn inputs (inputName klp)
    fun help():Unit{}

    fun editUsername(newUsername:String):Unit{
        this.name=newUsername
    }
    fun changePassword(newPassword:String):Unit{
        this.password=newPassword
    }
    //ws set location yphrxe provlhma me ta declarations
    fun setNewLocation(newLocation:String):Unit{
        this.location=newLocation
    }



}