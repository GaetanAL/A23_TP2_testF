package ca.qc.bdeb.sim203.tp2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Charlotte {
    double x,y;
    Image image = new Image("Charlotte\\charlotte.png");

    public Charlotte(){

    }

    public void draw(GraphicsContext context){
        context.drawImage(image,x,y);
    }
}
