//功能类
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.SimpleTimeZone;

public class SmallChangeSys {
    private double balance;//余额
    private double money = 0;
    private double con = 0;
    private String purpose = "";//消费用途
    String detaild = "";
    String total = "";
    Scanner sc = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //零钱通明细
    public void showBalabce(){
        System.out.println(total);
    }
    //收益入账
    public void profit(){
        System.out.println("请输入入账金额:");
        money = sc.nextDouble();
        balance += money;
        detaild = "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
        total += detaild;
    }
    //消费
    public void consumption(){
        System.out.println("请输入消费金额:");
        con = sc.nextDouble();
        System.out.println("请输入消费用途:");
        purpose = sc.next();
        balance -= con;
        detaild = "\n" + purpose + "\t\t" + "-" + con + "\t" + sdf.format(date) + "\t余额：" + balance;
        total += detaild;
    }
}