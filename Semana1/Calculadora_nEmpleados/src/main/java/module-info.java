module ni.edu.uam.ejemplo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemplo4 to javafx.fxml;
    exports ni.edu.uam.ejemplo4;
}