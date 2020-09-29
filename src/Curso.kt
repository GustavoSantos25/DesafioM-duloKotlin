class Curso(var nome: String, val codigo: Int,
            var professorAdjunto: ProfessorAdjunto, var professorTitular: ProfessorTitular,
            var maxQuantAlunos: Int, var listaAlunos: MutableList<Aluno>) {

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Curso) return false

        if(codigo != other.codigo) return false

        return true
    }
}