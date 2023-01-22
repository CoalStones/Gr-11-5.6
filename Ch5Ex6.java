package ch5ex6;
import java.util.Scanner;


public class Ch5Ex6 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,op,up=10,low=1,in;
        double total;
        
        num1=(int)((up-low)*Math.random()+low);
        num2=(int)((up-low)*Math.random()+low);
        op=(int)((3-0)*Math.random()+0);
        
            if(op==0){
                System.out.println("What is "+num1+" + "+num2);
                    in=input.nextInt();
                total=num1+num2;
                        if(total==in){
                            System.out.println("Correct!");
                        }
                        else{
                            System.out.println("Incorrect, the correct answer is "+total);
                        }
            }
            if(op==1){
                System.out.println("What is "+num1+" - "+num2);
                    in=input.nextInt();
                total=num1-num2;
                        if(total==in){
                            System.out.println("Correct!");
                        }
                        else{
                            System.out.println("Incorrect, the correct answer is "+total);
                        }
            }
            if(op==2){
                System.out.println("What is "+num1+" * "+num2);
                    in=input.nextInt();
                total=num1*num2;
                        if(total==in){
                            System.out.println("Correct!");
                        }
                        else{
                            System.out.println("Incorrect, the correct answer is "+total);
                        }
            }
            if(op==3){
                System.out.println("What is "+num1+" / "+num2);
                    in=input.nextInt();
                total=num1/num2;
                        if(total==in){
                            System.out.println("Correct!");
                        }
                        else{
                            System.out.println("Incorrect, the correct answer is "+total);
                        }
            }
            input.close();
    }
    
}
