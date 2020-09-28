class Professor(var nome: String,
                var sobrenome: String,
                var tempoDeCasa: Int,
                val codigo: Int) {

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Professor) return false

        if(codigo != other.codigo) return false

        return true
    }


}