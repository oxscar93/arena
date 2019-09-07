package domain


data class User(
    val idCard: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    var isAdmin: Boolean
) {
    var account: Account? = null
        set(value) {
            if (field != null) throw UnsupportedOperationException("User already have account")
            field = value
        }

    fun fullName() = "$firstName $lastName"
}
