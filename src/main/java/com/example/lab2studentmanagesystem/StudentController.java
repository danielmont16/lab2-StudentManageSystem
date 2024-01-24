package com.example.lab2studentmanagesystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentController {
    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField majorField;

    @FXML private TableView <Student> studentTable;
    @FXML private TableColumn<Student, String> idColumn;
    @FXML private TableColumn<Student, String> nameColumn;
    @FXML private TableColumn<Student, String> majorColumn;

    private ObservableList<Student> studentList;

    @FXML
    protected void onClickAddStudent() {
     String student_id = idField.getText();
     String student_name = nameField.getText();
     String student_major= majorField.getText();

     Student newStudent = new Student(student_id, student_name, student_major);
     studentList.add(newStudent);

    idField.clear();
    nameField.clear();
    majorField.clear();

    }

    @FXML
    protected void onClickDeleteStudent() {

        int index = studentTable.getSelectionModel().getSelectedIndex();
        studentList.remove(index);
    }


    @FXML
    protected  void initialize(){

        idColumn.setCellValueFactory(cellData -> (cellData.getValue().getId()));
        nameColumn.setCellValueFactory(cellData -> (cellData.getValue().getName()));
        majorColumn.setCellValueFactory(cellData -> (cellData.getValue().getMajor()));

        studentList = FXCollections.observableArrayList();
        studentTable.setItems(studentList);

    }
}