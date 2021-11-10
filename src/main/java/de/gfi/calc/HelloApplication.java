package de.gfi.calc;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    @Override
    public void start(Stage unused) {

        CalcStage cs1 = new CalcStage("blueberry");
        cs1.show();
        CalcStage cs2 = new CalcStage("raspberry");
        cs2.show();
        CalcStage cs3 = new CalcStage("cloudberry");
        cs3.show();


    }





    public static void main(String[] args) {
        launch();
    }
}