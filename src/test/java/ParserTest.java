
import com.mysql.jdbc.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.jsoup.Jsoup.connect;

/**
 * Created by dr.jun on 2014. 2. 6..
 */
public class ParserTest {

    @Test
    public void testParser() {
        String url = "http://www.11st.co.kr/product/SellerProductDetail.tmall?method=getSellerProductDetail&prdNo=851172576&trTypeCd=22&trCtgrNo=895019";
        String bigImageUrl = "";
        long bigImageSize = 0;
        //url = "http://en.wikipedia.org/";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Elements newsHeadlines = doc.select("#resp_layout");
        String title = doc.title();
        Elements media = doc.select("img");

        System.out.println("image count " + media.size());
        System.out.println("start");

        for (Element src : media) {

            URL imageUrl;
            long imageSize;

            try {
                imageUrl = new URL(src.attr("src"));
                imageSize = imageUrl.openConnection().getContentLength();
                //System.out.println(imageUrl.openConnection().);

                if(imageSize != 0 && imageSize > bigImageSize){
                    bigImageSize = imageSize;
                    bigImageUrl = imageUrl.toString();
                }

            } catch (MalformedURLException e) {
                //e.printStackTrace();
                System.out.println("e1" + e);
            } catch (IOException e) {
                System.out.println("e2" + e);
                //e.printStackTrace();
            }

        }

        System.out.println("===============");
        System.out.println(title);
        System.out.println(bigImageSize);
        System.out.println(bigImageUrl);
        System.out.println("===============");
    }
}
