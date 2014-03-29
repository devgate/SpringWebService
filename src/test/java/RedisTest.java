import redis.clients.jedis.Jedis;

/**
 * Created by dr.jun on 2014. 3. 10..
 */
public class RedisTest {


    public static void main(String[] args) {
        System.out.println("-----------------start");
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo1", "bar1");
        String value = jedis.get("foo1");
        System.out.println(value);
    }
}
