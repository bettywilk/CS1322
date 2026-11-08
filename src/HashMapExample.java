
import java.util.HashMap;
//Hash map example
public class HashMapExample {
    public static HashMap<String, Integer> countGrades(double[] grades) {
        HashMap<String, Integer> gradeMap = new HashMap<String, Integer>();
        gradeMap.put("A", 0);
        gradeMap.put("B", 0);
        gradeMap.put("C", 0);
        gradeMap.put("D", 0);
        gradeMap.put("F", 0);

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 89.5) {
                gradeMap.put("A", gradeMap.get("A") + 1);
            } else if (grades[i] >= 79.5) {
                gradeMap.put("B", gradeMap.get("B") + 1);
            } else if (grades[i] >= 69.5) {
                gradeMap.put("C", gradeMap.get("C") + 1);
            } else if (grades[i] >= 59.5) {
                gradeMap.put("D", gradeMap.get("D") + 1);
            } else {
                gradeMap.put("F", gradeMap.get("F") + 1);
            }
        }
        return (gradeMap);
    }

    public static void main(String[] args) {
        double[] grades = {85.9, 91.4, 99.5, 87.3, 67.9};
        HashMap<String, Integer> gradeMap = new HashMap<String, Integer>();
        gradeMap = countGrades(grades);
        for (String key : gradeMap.keySet()) {
            System.out.println("Grade: " + key + ", Quantity: " + gradeMap.get(key));
        }
    }
}



