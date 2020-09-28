class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       tempoDeCasa: Int,
                       codigo: Int,
                       var quantHorasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigo) {
}