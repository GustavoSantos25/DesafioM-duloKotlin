interface Professor {
    var nome: String
    var sobrenome: String
    var tempoDeCasa: Int
    val codigo: Int
    override fun equals(other: Any?): Boolean
}