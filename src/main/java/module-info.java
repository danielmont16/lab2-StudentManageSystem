module com.example.lab2studentmanagesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2studentmanagesystem to javafx.fxml;
    exports com.example.lab2studentmanagesystem;
}