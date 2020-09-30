class ProfessorTitular(override var nome: String, override var sobrenome: String,
                       override val codigo: Int,
                       override var tempoDeCasa: Int, var especialidade: String) : Professor {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is ProfessorTitular) return false

        if(codigo != other.codigo) return false

        return true
    }
}