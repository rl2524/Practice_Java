import java.util.ArrayList;

public class Average {

    public Average() {
    }

    public double getAverage(ArrayList<Integer> grades){
        double sum = 0.0;
        if (grades.size() < 1 ){
            System.out.println("Enter 0 or positive integers");
            return 0;
        }else{
            for (Integer grade : grades) {
                sum += grade;
            }
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Average average = new Average();
        ArrayList<Integer> myAverage = new ArrayList<>();
        myAverage.add(50);
        myAverage.add(60);
        myAverage.add(70);
        myAverage.add(80);
        myAverage.add(63);

      System.out.print(average.getAverage(myAverage));

    }
}
