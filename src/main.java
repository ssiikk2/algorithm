import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int val0 = n.nextInt();

        int val1 =0;
        int val2 =0;
        int val3 =0;


        if(val0 % 10 != 0){
            System.out.println("-1");
        }else {
            while (val0 >= 10 && val0 <= 10000) {
                if (val0 >= 300) {
                    val0 -= 300;
                    val1++;
                } else if (val0 >= 60) {
                    val0 -= 60;
                    val2++;
                } else if (val0 >= 10) {
                    val0 -= 10;
                    val3++;
                }
            }
            System.out.println(val1+""+" "+val2+""+" "+val3);
        }


    }
}
