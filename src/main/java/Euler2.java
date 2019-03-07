class Euler2 {


    public static void main(String args[]) {

        Euler2 euler2 = new Euler2();
//        euler2.lab(4000000);
        System.out.println( euler2.lab(4000000));
    }

    int lab(int n) {
        int sum = 0;
        int a = 0;
        int b = 1;
        int c = a + b;
        while (c < n) {
            if (c % 2 == 0) {
                sum = sum + c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return sum;
    }

}
