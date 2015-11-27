import java.util.Arrays;
import java.util.Collections;

/**
 * Created by dr.jun on 2014. 11. 4..
 */
public class Random {

    public static void main(String[] args) {

        String[] IGoEuiMiUpDa = new String[]{"김범준", "권정민","김석우",
                "김승윤","박선","박용진","서동훈","이세정",
                "이혜란","홍보라","박성철","강현정","김경민",
                "김세정","김세훈","김영한","김태경","김해영",
                "박용권","이대환","이완근","이재일","전정일","정성용"
                };

        do{
            Collections.shuffle(Arrays.asList(IGoEuiMiUpDa));
        }while(!IGoEuiMiUpDa[0].endsWith("세정"));

        System.out.printf("[가자! 핸드볼 경기장으로!!!] " + IGoEuiMiUpDa[0] );

    }
}
