fun main(){
    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("João", "Santos", 1, "Matemática")
    digitalHouseManager.registrarProfessorTitular("Maria", "Silva", 2, "Português")
    digitalHouseManager.registrarProfessorAdjunto("Jorge", "Nascimento", 3, 40)
    digitalHouseManager.registrarProfessorAdjunto("Gabriela", "Morais", 4, 50)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 1, 3)
    digitalHouseManager.alocarProfessores(20002, 2, 4)

    digitalHouseManager.matricularAluno("Gustavo", "Santos", 10)
    digitalHouseManager.matricularAluno("Matheus", "Barbosa", 20)
    digitalHouseManager.matricularAluno(10, 20001)
    digitalHouseManager.matricularAluno(20, 20001)

    digitalHouseManager.matricularAluno("Paulo", "César", 30)
    digitalHouseManager.matricularAluno("Caio", "Dantas", 40)
    digitalHouseManager.matricularAluno("Alessandra", "Santos", 50)
    digitalHouseManager.matricularAluno(30, 20002)
    digitalHouseManager.matricularAluno(40, 20002)
    digitalHouseManager.matricularAluno(50, 20002)

}