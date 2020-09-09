class FilaVoto2 {
    public static void main(String[] args) {
        
        System.out.print("Informe seu nome: ");

        String nome = System.console().readLine();

        System.out.print(nome + ", mês de nascimento: ");

        String mesNascimento = System.console().readLine();

        // char[] senha = System.console().readPassword();
        
        // System.out.println(senha);

        System.out.println(nome + ", vá para a fila: " + mesNascimento);
    }
}
