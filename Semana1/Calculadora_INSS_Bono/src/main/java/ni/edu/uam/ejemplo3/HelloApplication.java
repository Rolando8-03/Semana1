package ni.edu.uam.ejemplo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setPadding(new Insets(30));
        root.setSpacing(15);

        Label lblTitle = new Label("Bienvenido");
        Label lblSalary = new Label("Salario: ");
        TextField tfSalary = new TextField();
        Button btnDeducciones = new Button("Calcular deducciones");
        Label lblResult = new Label();

        btnDeducciones.setOnAction(event -> {
            int num1 = Integer.parseInt(tfSalary.getText());

            if (num1 < 0) {
                lblResult.setText("Tu salario no puede ser negativo");
                return;
            }

            int result1 = (int) (num1 * 0.07);
            int result2;

            if (num1 < 12000) {
                result2 = (int) (num1 * 0.10);
            } else if (num1 < 20000) {
                result2 = (int) (num1 * 0.05);
            } else {
                result2 = (int) (num1 * 0.03);
            }

            int result3 = num1 - result1 + result2;

            lblResult.setText(
                    "El INSS es " + result1
                            + ", tu bono es " + result2
                            + " y tu salario queda en " + result3
            );
        });

        HBox salary = new HBox();
        salary.setSpacing(15);
        salary.getChildren().addAll(lblSalary,tfSalary);

        root.getChildren().addAll(lblTitle, salary, btnDeducciones, lblResult);

        Scene scene = new Scene(root,600,400);
        stage.setTitle("Salario");
        stage.setScene(scene);
        stage.show();
    }
}
