package OperatingSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class sector{
    int id = -1;//记录作业的编号
    int addr=0;//内存的起始位置
    int size=100;//分配的内存大小
}
class List extends ArrayList<sector> implements Comparator<sector>{
    @Override
    public int compare(sector o1, sector o2) {
        if (o1.size < o2.size)
            return 1;
        if (o1.size > o2.size)
            return -1;
        else
            return 0;
    }
}
public class Allo {
    Scanner sc = new Scanner(System.in);
    List avail = new List();
    ArrayList<sector> busy = new ArrayList<>();
    sector sec;

    public Allo(){
        avail.add(new sector());
    }

    public void fenpei() {
        sec = new sector();
        System.out.println("输入作业编号及大小");
        sec.id = sc.nextInt();
        sec.size = sc.nextInt();
        sector linshi = new sector();
        boolean flag = false;
        for (int i = 0; i < avail.size(); i++) {
            linshi = avail.get(i);
            if (sec.size <= linshi.size) {
                flag = true;
                sec.addr = linshi.addr;
                linshi.addr = linshi.addr + sec.size ;
                linshi.size -= sec.size;
                if (linshi.size >= 0 && linshi.size < 2) {
                    avail.remove(i);
                }
                busy.add(sec);
            }
        }
        if(flag == false){
            System.out.println("无可分配的内存！！清理后重试");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            revoke();
        }
    }
    private void revoke() {
        // TODO Auto-generated method stub
        sec = new sector();
        sector linshi = new sector();
        System.out.println("输入回收作业的编号");
        int id = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < busy.size() && flag == false; i++) {
            sec = busy.get(i);
            if (sec.id == id) {
                sec.id = -1;
                flag = true;
                busy.remove(i);
                for (int j = 0; j < avail.size(); j++) {
                    linshi = avail.get(j);
                    if (linshi.addr + linshi.size == sec.addr) {
                        avail.remove(j);
                        linshi.size += sec.size;
                        avail.add(linshi);
                        break;
                    } else if (sec.addr + sec.size == linshi.addr) {
                        linshi.addr = sec.addr;
                        linshi.size += sec.size;
                        avail.remove(j);
                        avail.add(linshi);
                        break;

                    } else {
                        avail.add(sec);
                        break;
                    }
                }
            }

        }

        if (flag == true) {
            System.out.println("回收成功");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
        } else {
            System.out.println("回收失败，不存在此作业");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
        }
        menu();
    }
    private void display() {
        // TODO Auto-generated method stub
        System.out.println("avail中的内容信息");
        System.out.println("起始地址" + "\t" + "剩余大小");
        sec = new sector();

        int i;
        for (i = 0; i < avail.size(); i++) {
            sec = avail.get(i);
            System.out.println(sec.addr + "------->" + sec.size);
        }
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        if (busy.isEmpty()) {
            System.out.println("busy中暂无信息！");
        } else {
            System.out.println("busy中的内容信息");
            System.out.println("作业编号" + "\t" + "起始地址" + "\t" + "大小");
            for (i = 0; i < busy.size(); i++) {
                sec = busy.get(i);
                System.out.println(sec.id + "------->" + sec.addr + "------->"
                        + sec.size);
            }
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }
        menu();
    }

    private void menu() {
        // TODO Auto-generated method stub
        System.out.println("请选择......");
        System.out.println("Press 1  分配内存");
        System.out.println("Press 2  回收内存");
        System.out.println("Press 3  显示内存信息");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                int n;
                System.out.println("输入要分配的作业个数");
                n = sc.nextInt();
                for(int i=0;i<n;i++){
                    fenpei();
                }
                menu();
                break;
            case 2:
                revoke();
                break;
            case 3:
                display();
                break;
            default:
                System.out.println("输入有误！");
                menu();
                break;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Allo am = new Allo();
        am.menu();
    }
}
