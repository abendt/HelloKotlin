package demo.nullable_types

class KNullableTypesExample {
    fun sendMessageToClient(
            client: Client?, message: String?, mailer: Mailer
    ) {
        val email = client?.personalInfo?.email
        if (email != null && message != null) {
            mailer.sendMessage(email, message)
        }
    }
}