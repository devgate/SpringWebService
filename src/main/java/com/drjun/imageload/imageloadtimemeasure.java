package com.drjun.imageload;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by 1001948 on 2015. 10. 28..
 */
public class imageloadtimemeasure {

    public static void main(String[] args) {

        String imageUrl = "http://skpis.cache.scs.skcdn.co.kr/is/brand/201510/17BPQyswVIcd2e9026e9726c1907547495702dc5ba.jpg";

        while(true){

            BufferedImage img = null;
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String currentTime = sdf.format(cal.getTime());

            try {
                Thread.sleep(1000);

                long start = System.currentTimeMillis();
                img = ImageIO.read(new URL(imageUrl));
                //img.getSource();
                long end = System.currentTimeMillis();

                System.out.println(currentTime + " - " + (end - start));


            } catch (IOException e) {
                System.out.println("error : " + e);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
