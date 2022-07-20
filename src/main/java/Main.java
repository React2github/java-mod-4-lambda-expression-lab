@FunctionalInterface
interface nextOddNum {
    int applyAsInt(int x, int y);
}

public class Main {
	static nextOddNum OddNum = (x,y) -> x + y;
    int res = OddNum.applyAsInt(3, 2);
    

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(OddNum.applyAsInt(num,num2)); // 7
        System.out.println(OddNum.applyAsInt(num2, num)); // 11
    }
}
