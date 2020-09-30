class DigitalHouseManager {
    val listaAlunos = mutableListOf<Aluno>()
    val listaCursos = mutableListOf<Curso>()
    val listaProfessores = mutableListOf<Professor>()
    val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,quantMaxAlunos: Int) = listaCursos.add(Curso(nome, codigoCurso, quantMaxAlunos))

    //mandar apenas o codigo do curso aqui meio que deixou o equals feito na classe Curso
    //sem sentido, pois ainda preciso procurar na lista toda
    fun excluirCurso(codigoCurso: Int) = listaCursos.remove(listaCursos.find{it.codigo == codigoCurso})


    fun registrarProfessorAdjunto(nome: String ,
                                  sobrenome: String ,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int) = listaProfessores.add(ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras))


    fun registrarProfessorTitular(nome: String ,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String) = listaProfessores.add(ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade))


    //mesmo 'problema' da fun excluirCurso
    fun excluirProfessor(codigoProfessor: Int) = listaProfessores.remove(listaProfessores.find { it.codigo == codigoProfessor })


    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int) = listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))


    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno = listaAlunos.find{it.codigo == codigoAluno}
        val curso = listaCursos.find{it.codigo == codigoCurso}

        when(aluno != null && curso != null){
            true ->{
                when(curso.adicionarUmAluno(aluno)){
                    true->{
                        val matricula = Matricula(aluno, curso)
                        listaMatriculas.add(matricula)
                        println("Matricula do aluno ${aluno.nome} no curso ${curso.nome} realizada!")
                    }
                    else-> println("Não há vagas disponíveis!")
                }
            }
            else -> println("Aluno ou curso inexistente!")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val curso = listaCursos.find{it.codigo == codigoCurso}
        val profTitular = listaProfessores.find{it.codigo == codigoProfessorTitular}
        val profAdjunto = listaProfessores.find{it.codigo == codigoProfessorAdjunto}

        when(curso != null && profTitular != null && profAdjunto != null){
            true -> {
                curso.professorTitular = profTitular
                curso.professorAdjunto = profAdjunto
                println("Professores ${profTitular.nome} e ${profAdjunto.nome} alocados ao curso ${curso.nome}")
            }
            else -> println("Curso ou professor(es) inexistente!")
        }
    }


}