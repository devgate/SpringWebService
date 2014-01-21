import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2014. 1. 16.
 * Time: 오전 10:57
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest {

    @Test
    public void exceptionTest(){

        try{

            String str = null;
            System.out.println("Step1");
            str.trim();
            System.out.println("Step2");


        }catch(Exception e){
            System.out.println("error1");
            System.out.println("result : " + e);
            e.printStackTrace();
            System.out.println("error2");
        }




    }
}
