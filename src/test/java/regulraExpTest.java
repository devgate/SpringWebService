import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1001948 on 15. 7. 20..
 */
public class regulraExpTest {
    public static void main(String[] args) {

        List<String> input = new ArrayList<String>();
        input.add("http://www.ddd.ddd/a.gif");
        input.add("http://423.4234.234/a.gif");
        input.add("http://423.4234.234/fdsafsafds/fdsafdsa/a.gif");
        input.add("http://423.4234.234/fdsafsafds/23423423/343423423.gif");
        input.add("http://www.ddd.ddd/a.gifx");
        input.add("http://www.ddd.ddd/");
        input.add("ocbt://com.skmc.okcashbag.home_google/detail/event?url=http%3A%2F%2Fsp-gatewaydev.syrup.co.kr%2Fadsolution%2Focb%2Fevent%2Fmkt_id%3D45107%26service_solution_id%3D3114%26channel_id%3D04%26mkt_type%3D%26solution_type_code%3D0103%26br%3D3114040103%26ch%3D18%26chSet%3D04&title=%EC%9D%B4%EB%B2%A4%ED%8A%B8");


        for (String url : input) {
            if (url.matches("^http?://(?:[a-z0-9-]+.)+[a-z0-9]{2,6}(?:/[^/#?]+)+.(?:jpg|gif|png)$")) {
                System.out.println("Found good url: " + url);
            }
        }


        for (String url : input) {
            if (url.startsWith("ocbt://")) {
                System.out.println("Found good url 222: " + url);
            }
        }

    }

}
