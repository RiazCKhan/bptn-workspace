package wednesday;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayList {

    public static void main(String[] args) {
        
        List<String> nameList = new ArrayList<String>();

        nameList.add("Robert");
        nameList.add("Samson");
        nameList.add("Alex");
        nameList.add("William");

        System.out.println("Elements of List: " + nameList);

        // Create an array of the same size as nameList Hint: use size() method
        String[] nameListCopy = new String[nameList.size()];

        // Fetch the elements from the nameList and insert into newly created array
        // Hint: Use get() method to fetch the elements from arrayList and use for loop
        for (int nameIndex = 0; nameIndex < nameListCopy.length; nameIndex++) {
            if (nameListCopy[nameIndex] == null) {
                nameListCopy[nameIndex] = nameList.get(nameIndex);
            }
        }

        // Print Array Copy of ArrayList nameList
        // for (String name : nameListCopy) {
        //     System.out.println("Elements of Array: " + name);
        // }

        // Print Array Copy of ArrayList nameList
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < nameListCopy.length ; i++){
            System.out.print(nameListCopy[i] + "  ");
        }

    }
}
