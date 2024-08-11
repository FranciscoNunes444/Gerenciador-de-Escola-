public class Professor extends Pessoa{
    private String materia;
    private int turmas;

    public Professor(String nome, int idade,int senha,String materia,int turmas){
        super(nome, idade, senha);
        this.materia = materia;
        this.turmas = turmas;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getTurmas() {
        return turmas;
    }

    public void setTurmas(int turmas) {
        this.turmas = turmas;
    }

    @Override
    public int getIdade() {

        return super.getIdade();
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    @Override
    public int getSenha() {

        return super.getSenha();
    }

    @Override
    public void setIdade(int age) {

        super.setIdade(age);
    }

    @Override
    public void setNome(String name) {

        super.setNome(name);
    }

    @Override
    public void setSenha(int password) {

        super.setSenha(password);
    }


}