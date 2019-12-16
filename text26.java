//输入星期几的第一个字母来判断一下是星期几;
//如果第一个字母一样,则继续判断第二个字母
package Demo40;

import java.util.Scanner;

public class text26 {
    public static void main(String[] args) {
        //保存用户输入的第二个字母
        char weekSecond;
        //将Scanner类实例化为input对象,用于接收用户输入
        Scanner input = new Scanner(System.in);
        //开始提示并接受用户控制台输入
        System.out.println("请输入星期值英文的第一个字母,我来帮您判断是星期几: ");
        String letter = input.next();
        //判断用户控制台输入字符串长度是否为一个字母
        if(letter.length() == 1){
            //利用取第一个索引位的字符来实现让Scanner接收char类型输入
            char weekFirst = letter.charAt(0);
            switch(weekFirst){
                case 'm':
                    //当输入小写字母时,利用switch结构特性执行下一个带break语句的case分支,
                    // 以实现忽略用户控制台输入大小写敏感的功能
                case 'M':
                    System.out.println("星期一Monday");
                    break;
                case 't':
                case 'T':
                    System.out.println("由于星期二(Tuesday)与星期四(Thursday)均为字母T开头,故需输入第二个字母才能正确判断: ");
                    letter = input.next();
                    if(letter.length() == 1){
                        weekSecond = letter.charAt(0);
                        //利用或||运算符来实现忽略用户控制台输入大小写敏感的功能
                        if(weekSecond == 'U' || weekSecond == 'u'){
                            System.out.println("星期二Tuesday");
                            break;
                        }else if(weekSecond == 'H' || weekSecond == 'h'){
                            System.out.println("星期四Thursday");
                            break;
                            //控制台错误提示
                        }else{
                            System.out.println("输入错误,不能识别的星期值第二个字母,程序结束!");
                            break;
                        }
                    }else{
                        System.out.println("输入错误,只能输入一个字母,程序结束!");
                        break;
                    }
                case 'w':
                case 'W':
                    System.out.println("星期三Wednesday");
                    break;
                case 'f':
                case 'F':
                    System.out.println("星期五Friday");
                    break;
                case 's':
                case 'S':
                    System.out.println("由于星期六(Saturday)与星期日(Sunday)均为字母S开头,故需输入第二个字母才能正确判断: ");
                    letter = input.next();
                    if(letter.length() == 1){
                        weekSecond = letter.charAt(0);
                        if(weekSecond == 'A' || weekSecond == 'a'){
                            System.out.println("星期六Saturday");
                            break;
                        }else if(weekSecond == 'U' || weekSecond == 'u'){
                            System.out.println("星期日Sunday");
                            break;
                            //控制台错误提示
                        }else{
                            System.out.println("输入错误,不能识别的星期值第二个字母,程序结束!");
                            break;
                        }
                    }else{
                        System.out.println("输入错误,只能输入一个字母,程序结束!");
                        break;
                    }
                default:
                    //控制台错误提示
                    System.out.println("输入错误,不能识别的星期值第一个字母,程序结束!");
                    break;
            }
        }else{
            //控制台错误提示
            System.out.println("输入错误,只能输入一个字母,程序结束!");
        }
    }
}
