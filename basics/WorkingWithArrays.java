package basics;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[5];
        int[] numbers3 = new int[] {10, 20, 30, 40, 50};

        int[][] marks = {   {87, 88, 89, 88, 87, 89},
                            {92, 94, 96, 98, 90, 93},
                            {77, 78, 79, 80, 81, 82}    };

        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("**********");
        
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("**********");
        
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + "\t");
        }
        System.out.println();
    
        System.out.println("**********");
        
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 6; k++) {
                System.out.print(marks[j][k] + "\t");
            }
            System.out.println();
        
        }
    }
}
