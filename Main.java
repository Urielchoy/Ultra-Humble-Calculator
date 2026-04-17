//package EjercicioMenuEjecutable;
import java.awt.GridLayout;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora ultra humilde");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,2,10,10));

        // Inputs
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        // Resultado
        JLabel resultadoLabel = new JLabel("Resultado: ");
        // Botones
        JButton btnSumar = new JButton("Sumar");
        JButton btnRestar = new JButton("Restar");

        // Frame Grid
        frame.add(new JLabel("Número 1:", SwingConstants.CENTER));
        frame.add(num1Field);
        frame.add(new JLabel("Número 2:", SwingConstants.CENTER));
        frame.add(num2Field);
        frame.add(btnSumar);
        frame.add(btnRestar);
        frame.add(new JLabel("", SwingConstants.CENTER));
        frame.add(resultadoLabel);
        

        // Acción SUMAR
        btnSumar.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                Sumador s = new Sumador();
                int result = s.execute(num1, num2);

                resultadoLabel.setText("Resultado: " + result);
            } catch (Exception ex) {
                resultadoLabel.setText("Error: input inválido");
            }
        });

        // Acción RESTAR
        btnRestar.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                Restador r = new Restador();
                int result = r.execute(num1, num2);

                resultadoLabel.setText("Resultado: " + result);
            } catch (Exception ex) {
                resultadoLabel.setText("Error: input inválido");
            }
        });

        frame.setVisible(true);
    }
}