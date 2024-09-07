# Projeto-de-Orientacao-a-Objeto

# Equipe: 

* MARIA EDUARDA OLIVEIRA DE LIMA
* VÍTOR GABRIEL BASTOS LOPES
* GILMAR BOMFIM DA COSTA JUNIOR
* FELIPE GOMES GADELHA
*======================================
**Sistema de Gestão Acadêmica**

O **Sistema de Gestão Acadêmica** é projetado para gerenciar eficientemente alunos, funcionários e turmas de uma instituição de ensino. Ele oferece funcionalidades essenciais para o controle de dados institucionais e a automatização de processos administrativos.

### Funcionalidades Principais

#### **Classe Aluno**
A classe `Aluno` é responsável por definir os atributos de um aluno, incluindo:
- Nome
- Matrícula
- Data de nascimento
- Turma

Ela também oferece métodos para acessar e modificar essas informações de forma segura e estruturada.

#### **Interface Autenticável**
A interface `Autenticável` define um método para autenticar usuários com base em um ID e senha, garantindo a segurança no acesso ao sistema. Essa interface será implementada por classes relacionadas à verificação de acesso de funcionários e administradores.

#### **Classes de Funcionários**
O sistema diferencia entre os diversos tipos de funcionários por meio de herança da classe `Funcionário`. As subclasses incluem:
- **Técnico**
- **Professor**
- **Coordenador**
- **Diretor**

Cada tipo de funcionário tem um cálculo específico de bonificação sobre o salário:
- **Técnico**: 10%
- **Professor**: 15%
- **Coordenador**: 15% + bônus adicional de R$500,00
- **Diretor**: 20%

#### **Classe Curso**
A classe `Curso` representa os cursos oferecidos pela instituição. Ela contém dados como:
- Nome do curso
- Sigla
- Modalidade (presencial, online, etc.)

#### **Classe Funcionário**
Esta classe é responsável por armazenar os dados básicos de cada funcionário, como:
- Nome
- CPF
- Salário

As subclasses especializam o cálculo da bonificação, fornecendo relatórios precisos de remuneração.

#### **Classe Main**
A classe `Main` contém o ponto de entrada do sistema, responsável por inicializar o menu principal e gerenciar a interação do usuário com o sistema.

#### **Classe Menu**
O `Menu` é a interface interativa do sistema. Ele permite ao usuário:
- Cadastrar novos alunos, funcionários e turmas
- Emitir relatórios
- Listar funcionários e turmas
- Calcular o total de gastos com a folha de pagamento
- Alterar a turma de alunos

#### **Classe Turma**
A classe `Turma` gerencia as turmas da instituição, associando-as aos cursos e às séries ou semestres correspondentes.

### Resumo Operacional
O sistema oferece um conjunto completo de ferramentas para:
- Cadastro e gestão de alunos, funcionários e turmas
- Geração de relatórios detalhados sobre a equipe, incluindo cálculo de bonificações
- Listagem de turmas e funcionários, bem como monitoramento do total de gastos com a folha de pagamento
- Facilitar a movimentação de alunos entre turmas

