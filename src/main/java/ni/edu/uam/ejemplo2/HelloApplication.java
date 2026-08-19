package ni.edu.uam.ejemplo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setPadding(new Insets(30));
        root.setSpacing(15);

        Label lblTitle = new Label("Calculadora");
        Label lblNumber1 = new Label("Número 1: ");
        Label lblNumber2 = new Label("Número 2: ");
        TextField tfNumber1 = new TextField();
        TextField tfNumber2 = new TextField();
        Button btnAddition = new Button("Sumar");
        Button btnSubstraction = new Button("Restar");
        Button btnMultiplication = new Button("Multiplicación");
        Button btnDivision = new Button("División");
        Label lblResult = new Label("El resultado es: ");

        btnAddition.setOnAction(event ->{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int result = num1 + num2;
            lblResult.setText(String.valueOf("El resultado es: " + result));
        });

        btnSubstraction.setOnAction(event ->{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int result = num1 - num2;
            lblResult.setText(String.valueOf("El resultado es: " + result));
        });

        btnMultiplication.setOnAction(event ->{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int result = num1 * num2;
            lblResult.setText(String.valueOf("El resultado es: " + result));
        });

        btnDivision.setOnAction(event ->{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int result = num1 / num2;
            lblResult.setText(String.valueOf("El resultado es: " + result));
        });

        HBox number1 = new HBox();
        number1.setSpacing(10);
        number1.getChildren().addAll(lblNumber1, tfNumber1);

        HBox number2 = new HBox();
        number1.setSpacing(10);
        number1.getChildren().addAll(lblNumber2, tfNumber2);

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().addAll( btnAddition, btnSubstraction,
                btnMultiplication, btnDivision);

        root.getChildren().addAll(lblTitle, number1, number2, buttons, lblResult);

        Scene scene = new Scene(root,600,400);
        stage.setTitle("UAM");
        stage.setScene(scene);
        stage.show();
    }
}
