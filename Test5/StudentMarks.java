package codejava;
import java.util.HashMap;
import java.util.Map;


public class StudentMarks {
	    public static void main(String[] args) {
	        HashMap<String, Integer> marksMap = new HashMap<>();
	        marksMap.put("Aishu", 85);
	        marksMap.put("Divya", 90);
	        marksMap.put("Chan", 78);
	        marksMap.put("Bhava", 100);
	        System.out.println("Student Marks:");
	        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	        int total = 0;
	        for (int mark : marksMap.values()) {
	            total += mark;
	        }
	        double average = (double) total / marksMap.size();
	        System.out.println("Average Marks: " + average);
	    }
	}


