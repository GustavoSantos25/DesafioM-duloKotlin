class Curso(var nome: String, val codigo: Int, var maxQuantAlunos: Int) {

    var listaAlunos = mutableListOf<Aluno>()
    lateinit var professorAdjunto : Professor
    lateinit var professorTitular : Professor

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