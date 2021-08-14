import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeManager() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int point) {
        points.add(point);
        grades.add(pointToGrade(point));
    }

    private int pointToGrade(int point) {
        int grade = 0;

        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public double averagePoints() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return 1.0 * sum / points.size();
    }

    public double averagePassingPoints() {
        int sum = 0;
        int count = 0;

        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }
        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int passing = 0;
        double ratio = 0.0;
        for (int point : points) {
            if (point >= 50) {
                passing++;
            }
        }
        if (passing > 0) {
            ratio = (double) passing / points.size();
            return 100 * ratio;
        }
        return 0.0;
    }

    public int getNumbersOfGrade(int grade){
        int numbers = 0;

        for (int currentGrade : grades) {
            if (currentGrade == grade){
                numbers++;
            }
        }
        return numbers;
    }

}
