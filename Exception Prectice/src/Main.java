public class Main {
    public static void main(String[] args) throws MyException{
        int[] a = new int[2];
        a[0] = 2;
        a[1] = 1;
        int b = divideNumber(a[0], a[1]);
    }

    private static int divideNumber(int a, int b) throws MyException {
        if(a>b){
            throw new MyException("a is greater than b");
        }
        return b;
    }
}