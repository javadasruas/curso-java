class FilaVoto5 {

    public static void main(String[] args) {

        String nome = insereNome();

        String mesNascimento = insereMes(nome);

        int mes = Integer.valueOf(mesNascimento);

        if (mes <= 6) {
            System.out.println(nome + ", vá para a fila: 1");
        } else {
            System.out.println(nome + ", vá para a fila: 2");
        }
    }

    static String insereNome() {

        System.out.print("Informe seu nome: ");

        String nome = System.console().readLine();

        nome = validaNome(nome);

        return nome;
    }

    static String validaNome(String nome) {

        if (nome.length() <= 1 || nome.matches("[0-9]+")) {
            System.out.println("Nome invalido");
            return insereNome();
        }

        return nome;
    }

    static String insereMes(String nome) {

        System.out.print(nome + ", mês de nascimento: ");

        String mesNascimento = System.console().readLine();

        mesNascimento = validaMes(nome, mesNascimento);

        return mesNascimento;
    }

    static String validaMes(String nome, String mesNascimento) {

        if (!mesNascimento.matches("[0-9]+")) {
            System.out.println("Mes invalido");
            return insereMes(nome);
        }

        return mesNascimento;
    }
}
