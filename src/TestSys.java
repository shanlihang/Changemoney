//测试类
import java.util.Scanner;
public class TestSys {
    public static void main(String[] args){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        SmallChangeSys s = new SmallChangeSys();
        do {
            System.out.println("------------零钱通菜单------------");
            System.out.println("\t\t1.零钱通明细\t\t");
            System.out.println("\t\t2.收益入账\t\t");
            System.out.println("\t\t3.消费\t\t");
            System.out.println("\t\t4.退出系统\t\t");
            System.out.println("请选择功能：1-4:");
            int print = sc.nextInt();
            switch (print){
                case 1:
                    System.out.println("------------零钱通明细------------");
                    s.showBalabce();
                    break;
                case 2:
                    s.profit();
                    break;
                case 3:
                    s.consumption();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("你输入的数字有误，请重新输入：");
            }

        }while (flag);
        System.out.println("------------已退出零钱通------------");
    }
}


