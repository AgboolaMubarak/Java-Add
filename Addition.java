/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

class Variables {

    private int A;
    private int B;
    private int Y;
    String numbers = "-0123456789";
    int i;

    /**
     * @return the A
     */
    public int getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(int A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public int getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(int B) {
        this.B = B;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(int Y) {
        this.Y = Y;
    }

    public String CheckValue(String num) {
        String result = "";
        String[] alist = num.split("");
        if (numbers.contains(num)) {
            result = "Integer";

        } else if (num.length() >= 2) {
            for (int b = 0; b < num.length(); b++) {
                if (numbers.contains(alist[b])) {
                    result = "Integer";

                } else {
                    result = "Not an Integer";
                    break;
                }
            }
        } else if (num.length() > 7 | num.length() < 7) {
            result = "too long or short";

        } 
        return result;
    }

}

/**
 * a function to calculate the statement *
 */
class Add {

    public int Add(int A, int B) {
        int Y = 2 * A + B;
        return Y;
    }

}

/**
 *
 * @author Mubarak
 */
public class Addition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Variables var = new Variables();
        String menu;
        System.out.println("Enter First Value");

        menu = scan.next();
        String check = var.CheckValue(menu);

        if (check.equals("Integer")) {
            int main = parseInt(menu);
            var.setA(main);
            System.out.println("Enter Second Value");
            menu = scan.next();
            String check2 = var.CheckValue(menu);
            if (check2.equals("Integer")) {
                int main2 = parseInt(menu);
                var.setB(main2);
                int First = var.getA();
                int Second = var.getB();
                Add add = new Add();
                int Result = add.Add(First, Second);
                var.setY(Result);
                System.out.println("The result of the addition is " + Result);

            } else {
                System.out.println("All Values must be an Integer");

            }

        } else {
            System.out.println("Value must be an Integer");

        }

    }

}
