import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String recemNascido = "Recém-nascido";
        String bebe = "Bebê";
        String crianca = "Criança";
        String preAdolescente = "Pré-adolescente";
        String adolescente = "Adolescente";
        String adulto = "Adulto";

        String input = JOptionPane.showInputDialog(null, "Insira a sua idade ", "Bem-vindo(a)", JOptionPane.QUESTION_MESSAGE);

        if (input == null || input.equals("")) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou entrada inválida.");
            return; // Sai do programa
        }

        int idade;
        try {
            idade = Integer.parseInt(input);
            if (idade >= 100) {
                JOptionPane.showMessageDialog(null, "Número inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Sai do programa
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do programa
        }

        String grupoIdade;
        if (idade <= 1) {
            grupoIdade = recemNascido;
        } else if (idade <= 3) {
            grupoIdade = bebe;
        } else if (idade <= 10) {
            grupoIdade = crianca;
        } else if (idade <= 13) {
            grupoIdade = preAdolescente;
        } else if (idade < 18) {
            grupoIdade = adolescente;
        } else {
            grupoIdade = adulto;
        }

        JOptionPane.showMessageDialog(null, "Você pertence ao grupo de " + grupoIdade);
    }
}
