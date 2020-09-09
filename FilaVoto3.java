class FilaVoto3 {
    public static void main(String[] args) {
        
        System.out.print("Informe seu nome: ");

        String nome = System.console().readLine();

        if (nome.length() <= 1) {
            System.out.println("Nome invalido");
            System.out.print("Informe seu nome: ");
            nome = System.console().readLine();
        }

        System.out.print(nome + ", mês de nascimento: ");

        String mesNascimento = System.console().readLine();

        if (!mesNascimento.matches("[0-9]+")) {
            System.out.println("Mes invalido");
            System.out.print(nome + ", mês de nascimento: ");
            mesNascimento = System.console().readLine();
        }

        int mes = Integer.valueOf(mesNascimento);

        if (mes <= 6) {
            System.out.println(nome + ", vá para a fila: 1");
        } else {
            System.out.println(nome + ", vá para a fila: 2");
        }
    }
}
