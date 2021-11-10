package de.gfi.calc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalcStage extends Stage {

    Button plusButton;
    Button minusButton;
    Button resetButton;

    Label label;

    int zahl = 0;

    String fruit;


    public CalcStage(String fruit) {

        super();

        this.fruit = fruit;

        VBox vBox = initialize();
        Scene scene = new Scene(vBox, 320, 200);
        this.setTitle(fruit + "!");
        this.setScene(scene);

    }

    public VBox initialize() {

        label = new Label(fruit + " = " + zahl);

        plusButton = new Button("+");
        EventHandler<ActionEvent> eventHandler = actionEvent -> {
            zahl++;
            label.setText(fruit + ": " + zahl);
            System.out.println("Clicked Plus Button");
        };
        plusButton.setOnAction(eventHandler);

        minusButton = new Button("-");
        EventHandler<ActionEvent> eventHandler1 = actionEvent -> {
            zahl--;
            label.setText(fruit + " = " + zahl);
            System.out.println("Clicked Minus Button");
        };
        minusButton.setOnAction(eventHandler1);

        resetButton = new Button("0");
        EventHandler<ActionEvent> eventHandler2 = actionEvent -> {
            zahl = 0;
            label.setText(fruit + ": " + zahl);
            System.out.println("Clicked Minus Button");
        };
        resetButton.setOnAction(eventHandler2);

        label.setFont(new Font("Blackadder ITC", 20));

        HBox h = new HBox();
        plusButton.setMinSize(30, 30);
        minusButton.setMinSize(30, 30);
        resetButton.setMinSize(30, 30);
        h.getChildren().add(plusButton);
        h.getChildren().add(minusButton);
        h.getChildren().add(resetButton);
        VBox v = new VBox();
        v.getChildren().add(label);
        v.getChildren().add(h);

        return v;
    }

}
