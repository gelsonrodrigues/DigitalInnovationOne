package part3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

//        List<Curso> cursos = cursoDAO.read();
//        cursos.stream().forEach(System.out::println);
//
//        Curso cursonovo = new Curso("Computacao III",5);
//        cursoDAO.create(cursonovo);
//        cursoDAO.read().stream().forEach(System.out::println);

//        Curso cursoalterado = cursoDAO.readById(2);
//        cursoalterado.setNome("Computacao I");
//        cursoalterado.setDuracaoHoras(6);
//        cursoDAO.update(cursoalterado);
//        cursoDAO.read().stream().forEach(System.out::println);

//        cursoDAO.delete(1);
//        cursoDAO.read().forEach(System.out::println);



        AlunoDAO alunoDAO = new AlunoDAO();
        // =========================== 1 - Consulta =================================================
//        List<Aluno> alunos = alunoDAO.list();
//        alunos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
//        Aluno alunoParaConsulta = alunoDAO.getById(1);
//        System.out.println(alunoParaConsulta);

        // =========================== 2 - Inserção =================================================
//        Aluno alunoParaInsercao = new Aluno(
//                "Matheus",
//                43,
//                "SP"
//        );
//        alunoDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================
//        alunoDAO.delete(2);
//        alunoDAO.list().forEach(System.out::println);


        // =========================== 4 - Atualizar ================================================
//        alunoDAO.list().forEach(System.out::println);
//        Aluno alunoParaAtualizar = alunoDAO.getById(3);
//        alunoParaAtualizar.setNome("Joaquim");
//        alunoParaAtualizar.setIdade(18);
//        alunoParaAtualizar.setEstado("RS");
//
//        alunoDAO.update(alunoParaAtualizar);
//        alunoDAO.list().forEach(System.out::println);
    }

}
