package com.example.demo23;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TaskAddController {
    @FXML
    private TextField taskNameTextField;

    @FXML
    private TextField taskDescriptionTextField;

    @FXML
    private ChoiceBox<TaskType> taskTypeChoiceBox;

    @FXML
    private ChoiceBox<TaskPriority> taskPriorityChoiceBox;

    @FXML
    private DatePicker taskDeadlineDatePicker;

    @FXML
    private Button addToTheListButton;

    // Other FXML variables and methods can be added as needed
}
