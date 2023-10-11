package exercise.chapter_13;

public class ExplicitCasting {

    public static void main(String[] args) {
        //더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt); //5

        //사이즈 큰 -> 사이즈 작은
        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println(myByte); //88

        //연산 +
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result = (int) myDouble1 + (int) myDouble2;
        System.out.println(result); //8
    }
}
