package ca.qc.bdeb.sim203.tp2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    static double WIDTH = 900, HEIGHT = 600;

    @Override
    public void start(Stage stage) throws Exception {
        var root = new Pane();
        var scene = new Scene(root,WIDTH,HEIGHT, Color.web("#4287f5"));

        var sceneAcceuil = creerSceneDAccueil();

        var canvas = new Canvas(WIDTH,HEIGHT);
        var context = canvas.getGraphicsContext2D();

        stage.setTitle("Les Aventures de Charlotte La Barbotte");
        stage.setScene(sceneAcceuil);
        stage.show();
    }

    private Scene creerSceneDAccueil(){
        var root = new HBox();
        var acceuil = new Scene(root,WIDTH,HEIGHT,Color.RED);

        root.setAlignment(Pos.CENTER);

        var menu = new VBox(15);
        menu.setAlignment(Pos.CENTER);

        var logo = new ImageView("logo.png");
        logo.setPreserveRatio(true);
        logo.setFitHeight(HEIGHT);

        var btnJouer = new Button("Jouer!");
        var brnInfos = new Button("Infos");

        var barreBtns = new ButtonBar();
        barreBtns.getButtons().addAll(btnJouer,brnInfos);
        barreBtns.setCenterShape(true);

        barreBtns.setPadding(new Insets(10));

        menu.getChildren().addAll(logo,barreBtns);

        root.getChildren().add(menu);

        return acceuil;
    }

}

