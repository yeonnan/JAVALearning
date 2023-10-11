package exercise.chapter_31;

public class SeaSituation {

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setGender("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setGender("Male");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(false);

        fish2.becomeDanger();
        System.out.println("독성여부 : "+fish2.isHavingPoison());

        //override
        fish1.eat("새우");
        fish2.eat("새우");

       // System.out.println(fish2.isEatable());
    }
}
