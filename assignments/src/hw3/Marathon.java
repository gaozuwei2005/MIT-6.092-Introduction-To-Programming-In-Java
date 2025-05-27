package hw3;

public class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int fastestID1 = 0, fastestID2 = 0;
        for (int i =  2; i < times.length; i ++) {
            if(times[i] < times[fastestID1]) {
                fastestID2 = fastestID1;
                fastestID1 = i;
            } else if(times[i] < times[fastestID2]) {
                fastestID2 = i;
            }
        }
        System.out.println("The fastest marathon runner is " + names[fastestID1] + " with a time of " + times[fastestID1] + " minutes.");
        System.out.println("The second fastest marathon runner is " + names[fastestID2] + " with a time of " + times[fastestID2] + " minutes.");
    }
}