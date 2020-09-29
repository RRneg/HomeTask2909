import java.util.Arrays;

public class CreateMassive{
    public static void main(String[] args) {
        int[] testaraylist = new int[100];
        int n = (int) (1 + (Math.random() * 100));
        int i = 0;
        while (i <= n - 1) {
            testaraylist[i] = (int) (50 - Math.random() * 100);
            System.out.println(testaraylist[i]);
            i++;
        }
        System.out.println("the array consists of  " +n+ "  lenses");

        //task1
        i = 0;
        while (i <= n - 1) {
            if (testaraylist[i]%2==0 & testaraylist[i] != 0) {
                System.out.println(testaraylist[i]);
            }
            i++;
        }
        //task2
        i = 0;
        int check = 0;
        while (i <= n - 1) {
            if (testaraylist[i]>0) {
                check ++;

            }
            i++;
        }
        System.out.println("Number of positive numbers in an array   " + check);

        //task3
        i=0;
        check=0;
        while (i <= n - 1) {
            if (testaraylist[i+1]>testaraylist[i]) {
                check ++;

            }
            i++;
        }
        System.out.println("amount of elements array larger than the previous = " + check);

        //task4
        i=0;
        check=0;
        while (i <= n-3 ) {
            if (testaraylist[i+1]< testaraylist[i+2] & testaraylist[i+3] < testaraylist[i+2]) {
                check ++;

            }
            i++;
        }
        System.out.println("amount of elements array satisfying the condition of problem 4 = " + check);

    //task 5
        i=0;
        while (i <= (int)((n-1)/2) ) {
         check = testaraylist[i];
         testaraylist[n-i-1] = testaraylist[i];
            testaraylist[n-i-1] = check;
             i++;
        }
        i=0;
        System.out.println("reverse array order");
        while (i <= n - 1) {
            System.out.println(testaraylist[i]);
            i++;
        }
        //task6
        i=0;
        while (i <= (int)((n - 1)/2)) {
            check=testaraylist[i*2];
            testaraylist[i*2]=testaraylist[i*2+1];
            testaraylist[i*2+1] = check;
            i++;
        }
        System.out.println("array of rearranged pairwise numbers");
        while (i <= n - 1) {
            System.out.println(testaraylist[i]);
            i++;
        }
    }




}

