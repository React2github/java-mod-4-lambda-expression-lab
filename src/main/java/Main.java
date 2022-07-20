@FunctionalInterface
interface NextOddNum {
    int applyAsInt(int x);
}

public class Main {
	static NextOddNum oddNum = (x) -> {
        // take our input and find next odd num 
        // use divisiblity to determine even or odd 
        int alteredNum = x+1;
        while(alteredNum % 2 == 0) {
            alteredNum += 1;
        }
        return alteredNum;
    };
    int res = oddNum.applyAsInt(3);
    

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(oddNum.applyAsInt(num)); // 7
        System.out.println(oddNum.applyAsInt(num2)); // 11
    }
}
