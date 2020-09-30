class Curso(var nome: String, val codigo: Int,
            var professorAdjunto: ProfessorAdjunto, var professorTitular: ProfessorTitular,
            var maxQuantAlunos: Int, var listaAlunos: MutableList<Aluno>) {

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Curso) return false

        if(codigo != other.codigo) return false

        return true
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        when(maxQuantAlunos){
            listaAlunos.size -> return false
            else ->{
                listaAlunos.add(umAluno)
            }
        }
        return true
    }

    fun excluirAluno(umAluno: Aluno) = listaAlunos.remove(umAluno)

}