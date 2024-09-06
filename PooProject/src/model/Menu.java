package model;

import controle.Controle;
import java.util.Scanner;

public class Menu 
{
    private Scanner scanner = new Scanner(System.in);
    private Controle controle = new Controle();

    public void exibirMenu() {
        String opcao = "";

        while (!opcao.equals("10")) {
            System.out.println("1. Incluir um novo aluno");
            System.out.println("2. Incluir um novo funcionario");
            System.out.println("3. Incluir uma nova turma");
            System.out.println("4. Emitir relatorio dos alunos");
            System.out.println("5. Emitir relatorio dos funcionarios");
            System.out.println("6. Listar todos os funcionarios");
            //System.out.println("7. Mostrar total de gastos com funcionarios");
            System.out.println("8. Listar todas as turmas");
            System.out.println("9. Mudar aluno de turma");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextLine();
            
            executarOpcao(opcao);
        }
    }

    private void executarOpcao(String opcao) {
        switch (opcao) {
            case "1":
                incluirNovoAluno();
                break;
            case "2":
                incluirNovoFuncionario();
                break;
            case "3":
                incluirNovaTurma();
                break;
            case "4":
                emitirRelatorioAluno();
                break;
            case "5":
                emitirRelatorioFuncionario();
                break;
            case "6":
                listarFuncionarios();
                break;
            case "7":
                //mostrarGastosFuncionarios();
                break;
            case "8":
                listarTurmas();
                break;
            case "9":
                //mudarAlunoDeTurma();
                break;
            case "10":
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcaoo invalida, tente novamente.");
        }
    }

    // Método para incluir um novo aluno
    private void incluirNovoAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matricula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a data de nascimento do aluno (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();
        
        System.out.println("Deseja definir senha?(S/N)");
        String s = scanner.nextLine();
        
        Aluno aluno;
        switch(s)
        {
            case "S":
                System.out.print("Digite o usuario(id): ");
                String id = scanner.nextLine();

                System.out.print("Digite a senha: ");
                String senha = scanner.nextLine();

                aluno = new Aluno(nome, matricula, dataNascimento, id, senha);
                controle.cadastrarAluno(matricula, aluno);
                break;
                
            case "N":
                aluno = new Aluno(nome, matricula, dataNascimento);
                controle.cadastrarAluno(matricula, aluno);
                break;
        }

        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Método para incluir um novo funcionário
    private void incluirNovoFuncionario() {
        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o salario do funcionario: ");
        double salario = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Digite a carga horaria: ");
        double cargahoraria = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Deseja definir senha?(S/N)");
        String s = scanner.nextLine();
        
        Funcionarios funcionario;
        switch(s)
        {
            case "S":
                System.out.print("Digite o usuario(id): ");
                String id = scanner.nextLine();

                System.out.print("Digite a senha: ");
                String senha = scanner.nextLine();

                funcionario = new Funcionarios(nome, cpf, salario,cargahoraria, id, senha);
                controle.cadastrarFuncionarios(cpf, funcionario);
                break;
                
            case "N":
                funcionario = new Funcionarios(nome, cpf, salario,cargahoraria);
                controle.cadastrarFuncionarios(cpf, funcionario);
                break;
        }

        System.out.println("Funcionario cadastrado com sucesso!");
    }

    // Método para incluir uma nova turma
    private void incluirNovaTurma() {
        System.out.print("Digite o nome do curso da turma: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a seie/semestre da turma: ");
        String serieSemestre = scanner.nextLine();

        Turma turma = new Turma(curso, serieSemestre);
        controle.cadastrarTurma(curso, turma);

        System.out.println("Turma cadastrada com sucesso!");
    }

    // Método para emitir relatório de aluno
    private void emitirRelatorioAluno() {
        if (controle.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } 
        else 
        {
            System.out.println("\nRelatorio de Alunos:");
            for (Aluno aluno : controle.getAlunos().values()) 
            {
                System.out.println("---------------------------");
                System.out.println(aluno.getRelatorio());
            }
            System.out.println("---------------------------\n");
        }
    }

    // Método para emitir relatório de funcionário
    private void emitirRelatorioFuncionario() {
        if (controle.getFuncionarios().isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado.");
        } 
        else 
        {
            System.out.println("\nRelatorio de Funcionarios:");

            for(Funcionarios f : controle.getFuncionarios().values())
            {
                System.out.println("---------------------------");
                System.out.println(f.getRelatorio());
            }
            System.out.println("---------------------------\n");
        }
    }

    // Método para listar todos os funcionários pelo nome
    private void listarFuncionarios() {
        if (controle.getFuncionarios().isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado.");
        } 
        else 
        {
            System.out.println("\nLista de Funcionarios:");
            for (Funcionarios f : controle.getFuncionarios().values()) 
            {
                System.out.println("---------------------------");
                System.out.println(f.getNome());
            }
            System.out.println("---------------------------\n");
        }
    }

    // Método para mostrar total de gastos com funcionários
    private void mostrarGastosFuncionarios() {
        double totalGastos = 0;
        for (Funcionarios funcionario : controle.getFuncionarios().values()) {
            totalGastos += funcionario.getSalario();
        }
        System.out.println("Total de gastos com funcionários: " + totalGastos);
    }

    // Método para listar todas as turmas
    private void listarTurmas() {
        if (controle.getTurmas().isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
        } else {
            System.out.println("Turmas cadastradas:");
            
            for (Turma turma : controle.getTurmas().values()) {
                System.out.println("\nCurso: " + turma.getCurso() + "\nSerie/Semestre: " + turma.getSerieSemestre());
                System.out.println("---------------------------");
            }
        }
    }

    // Método para mudar aluno de turma
    private void mudarAlunoDeTurma() {
        System.out.print("Digite a matrícula do aluno que deseja mudar de turma: ");
        String matricula = scanner.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : controle.getAlunos().values()) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoEncontrado = aluno;
                break;
            }
        }

        if (alunoEncontrado != null) {
            System.out.print("Digite a nova turma (curso): ");
            String novaTurma = scanner.nextLine();
            System.out.print("Digite o periodo: ");
            String periodo = scanner.nextLine();
            
            Turma t = new Turma(novaTurma, periodo);
            alunoEncontrado.setTurma(t);
            System.out.println("Aluno " + alunoEncontrado.getNome() + " mudou para a turma: " + novaTurma);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
