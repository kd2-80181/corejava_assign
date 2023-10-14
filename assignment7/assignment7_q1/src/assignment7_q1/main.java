package assignment7_q1;

public class main {
    public static void main(String[] args) {
        // Declare two arrays of type String
        String[] array1 = {"apple", "banana", "orange", "grape", "apple", "mango", "banana"};
        String[] array2 = new String[array1.length];

        // Find duplicate values using equals() method
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i].equals(array1[j])) {
                    // Check if the duplicate value is not already added to the second array
                    boolean isDuplicate = false;
                    for (int k = 0; k < array2.length; k++) {
                        if (array1[i].equals(array2[k])) {
                            isDuplicate = true;
                            break;	
                        }
                    }
                    if (!isDuplicate) {
                        // Add the duplicate value to the second array
                        for (int k = 0; k < array2.length; k++) {
                            if (array2[k] == null) {
                                array2[k] = array1[i];
                                break;
                            }
                        }
                    }
                }
            }
        }

        // Print the duplicate values
        System.out.println("Duplicate values in the array:");
        for (String value : array2) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }
}

 	