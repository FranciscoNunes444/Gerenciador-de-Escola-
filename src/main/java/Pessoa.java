
abstract class Pessoa {
        private String nome;
        private int idade;
        private int senha;

        public Pessoa(String nome, int idade,int senha){
            this.nome = nome;
            this.idade = idade;
            this.senha = senha;
        }

        public String getNome(){
            return this.nome;
        }
        public int getIdade(){
            return this.idade;
        }
        public int getSenha(){
            return this.senha;
        }

        public void setNome(String name){
            this.nome = name;
        }

        public void setIdade(int age){
            this.idade = age;
        }

        public void setSenha(int password){
            this.senha = password;
        }

    }


