package projetoPessoalCadastro.src;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String email;
    private String telefone;

    public Aluno(String nome, String matricula, String curso, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}