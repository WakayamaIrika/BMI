import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner s = new Scanner(System.in);
                double sintyo,taiju,bmi;
		int a;
		for(a=0;a<=1;a++){
                System.out.println("cm");
                sintyo=s.nextDouble();
                System.out.println("kg");
                taiju=s.nextDouble();
		sintyo=sintyo/100;
                bmi=taiju/(sintyo*sintyo);
		System.out.println("BMI="+(String.format("%.1f", bmi))+"");
		}
       }
}


