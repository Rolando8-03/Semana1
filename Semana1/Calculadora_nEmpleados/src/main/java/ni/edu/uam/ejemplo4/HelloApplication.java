package ni.edu.uam.ejemplo4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    int[] salarios;
    int posicion = 0;

    @Override
    public void start(Stage stage) {

        VBox root = new VBox(10);
        root.setPadding(new Insets(30));

        Label lblCantidad = new Label("Cantidad de empleados:");
        TextField tfCantidad = new TextField();
        Button btnIniciar = new Button("Iniciar");

        Label lblSalario = new Label("Salario del empleado:");
        TextField tfSalario = new TextField();
        Button btnAgregar = new Button("Agregar salario");

        Label lblMensaje = new Label();
        Label lblResultado = new Label();

        btnAgregar.setDisable(true);

        btnIniciar.setOnAction(event -> {

            int cantidad = Integer.parseInt(tfCantidad.getText());

            salarios = new int[cantidad];
            posicion = 0;

            btnAgregar.setDisable(false);
            lblResultado.setText("");
            lblMensaje.setText("Ingrese el salario del empleado 1");
        });

        btnAgregar.setOnAction(event -> {

            int salario = Integer.parseInt(tfSalario.getText());

            salarios[posicion] = salario;
            posicion++;

            tfSalario.clear();

            if (posicion < salarios.length) {

                lblMensaje.setText(
                        "Ingrese el salario del empleado "
                                + (posicion + 1)
                );

            } else {

                int mayor = salarios[0];
                int menor = salarios[0];
                int suma = 0;

                for (int i = 0; i < salarios.length; i++) {

                    suma = suma + salarios[i];

                    if (salarios[i] > mayor) {
                        mayor = salarios[i];
                    }

                    if (salarios[i] < menor) {
                        menor = salarios[i];
                    }
                }

                double promedio =
                        (double) suma / salarios.length;

                int moda = salarios[0];
                int mayorRepeticion = 1;

                for (int i = 0; i < salarios.length; i++) {

                    int repeticion = 0;

                    for (int j = 0; j < salarios.length; j++) {

                        if (salarios[i] == salarios[j]) {
                            repeticion++;
                        }
                    }

                    if (repeticion > mayorRepeticion) {
                        mayorRepeticion = repeticion;
                        moda = salarios[i];
                    }
                }

                String textoModa;

                if (mayorRepeticion == 1) {
                    textoModa = "No hay moda";
                } else {
                    textoModa = String.valueOf(moda);
                }

                lblResultado.setText(
                        "Salario más alto: C$ " + mayor
                                + "\nSalario más bajo: C$ " + menor
                                + "\nPromedio: C$ "
                                + String.format("%.2f", promedio)
                                + "\nModa: " + textoModa
                );

                lblMensaje.setText(
                        "Todos los salarios fueron registrados"
                );

                btnAgregar.setDisable(true);
            }
        });

        root.getChildren().addAll(
                lblCantidad,
                tfCantidad,
                btnIniciar,
                lblSalario,
                tfSalario,
                btnAgregar,
                lblMensaje,
                lblResultado
        );

        Scene scene = new Scene(root, 450, 450);

        stage.setTitle("Salarios de empleados");
        stage.setScene(scene);
        stage.show();
    }
}