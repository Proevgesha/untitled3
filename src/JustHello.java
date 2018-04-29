public class JustHello {
    public static void main(String[] args) {
        int [] a = {1,5,3,2,4,1,9};
        boolean flag = false;
        while (flag == false) {
            flag = true;
            for (int i = 0; i < a.length - 1; i++) {
                int b = a[i];
                if (a[i + 1] < b) {
                    flag = false;
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    System.out.println();
                }
            }
        }
        for (int c: a) {
            System.out.println(c);
        }
    }
}
