public class Operators {

    public Operators() {

    }
    public int addition(int a, int b){
        return a+b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public float division(int a, int b) throws Exception {
        if(b==0) throw new ArithmeticException("You can't divide by 0");
        return a/b;
    }
    public boolean found(int[]tab,int n){
        int inf=0;
        int sup=tab.length-1;
        int middle=0;
        while (inf<sup){
            middle=(inf+sup)/2;
            if(n<tab[middle])
                sup=middle;
            else
                inf=middle+1;
        }
        return (n==tab[middle]);
    }

    public static void main(String[] args) {
        int [] tab={1,2,3,4,5,6,7};
        Operators operators=new Operators();
        System.out.println(tab.length-1);
        System.out.println(operators.found(tab,4));
    }

}
