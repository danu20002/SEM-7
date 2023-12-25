import java.util.*;

public class Termwork5 {
    public static  void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Initialize lock, stock,Barrel prices");
       int lock_price=sc.nextInt();
       int stock_price=sc.nextInt();
       int barrel_price=sc.nextInt();
       System.out.println("Initialize production limit of lock,stock,barrel");
       int lock_limit=sc.nextInt();
       int stock_limit= sc.nextInt();
       int barrel_limit=sc.nextInt();
       System.out.println("Initialize Commission levels ");
       double commission_level1=sc.nextDouble();
        double commission_level2=sc.nextDouble();
        double commission_level3=sc.nextDouble();
       System.out.println("Collecting data from Salesperson");
       System.out.println("Number of locks sold");
       int locks_sold= sc.nextInt();
        System.out.println("Number of stocks sold");
        int stocks_sold=sc.nextInt();
        System.out.println("Number of barrels sold");
        int barrel_sold=sc.nextInt();

        System.out.println("Calculating total Sales");
        int total_sales=(locks_sold*lock_price)+(stocks_sold*stock_price)+(barrel_sold*barrel_price);
        System.out.println("total sales is "+total_sales);

        System.out.println(" Calculating Commission ");
       double commission;
        if(total_sales<=1000){
           commission= total_sales*commission_level1;
        } else if (total_sales<=1800) {
            commission=(1000*commission_level1)+((total_sales-1000)*commission_level2);
        }else {
            commission=(1000*commission_level1)+(800*commission_level2)+((total_sales-1800)*commission_level3);
        }
        System.out.println("Total commission Earned by salesperson is "+commission);

    }
}
//please see the test case and its table
