
public class Aluno extends Pessoa {

        private int serie;
        public Aluno(String nome, int idade, int senha,int serie) {
            super(nome, idade, senha);
            this.serie = serie;
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
        public int getSerie(){
            return this.serie;
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
        public void setSerie(int s){
            this.serie = s;
        }

    }

