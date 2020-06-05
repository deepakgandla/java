package com.deepak;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static final long serialVersionUID=1l;

    public static void main(String[] args) {

        try{
            Thread.sleep(1000);
            Robot r=new Robot();


            String path="D:screenshot12.jpg";

            Rectangle capture=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image=r.createScreenCapture(capture);
            ImageIO.write(Image,"jpg",new File(path));

        }catch(AWTException | IOException | InterruptedException ex){
            System.out.println(ex);
        }
    }


}
