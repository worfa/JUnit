public class Main {

    public static void main(String[] args){
        Calculate calculation = new Calculate();
        int sum = calculation.sum(2,5);
        System.out.println(sum);

        FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();
        firstDayAtSchool.addPencils();
        firstDayAtSchool.prepareMyBag();
    }
}
