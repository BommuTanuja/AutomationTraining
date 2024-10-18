package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


/*
    Hashmap :
    it follows the order which we added in that order only it will print
    if we gave multiple null key value pair it will take only one pair
    it allows duplicates ,but it will override ,and it will take the last element which we have added

    * Hashtable :
    it follows the descending order
    it allows duplicates ,but it will override ,and it will take the last element which we have added
    it do not allow null key and values and throws the null pointer exception

 */




public class HashMapVsHashTable {
    public static void main(String[] args) {
        Map<Integer,String> studentData = new HashMap<>();
        studentData.put(1,"Akhil");
        studentData.put(2,"Brain");
        studentData.put(3, "Danny");
        studentData.put(4, "Catherine");
        studentData.put(5, "Eagle");
       studentData.put(null, null);
       studentData.put(null, null);
        studentData.put(5, "Harry");
        studentData.put(5, "Ferry");
        studentData.put(6,"Ferry");

        System.out.println(studentData);

        System.out.println("*****************************");

        Map<Integer,String > studentData1 = new Hashtable<>();
        studentData1.put(1,"Akhil");
        studentData1.put(2, "Brain");
        studentData1.put(3, "Catherine");
        studentData1.put(4, "Danny");
        studentData1.put(5, "Eagle");
        studentData1.put(5, "Ferry");
        studentData1.put(5, "Ferry");
        studentData1.put(5, "Ferry");
  //      studentData1.put(null,null);
        studentData1.put(6,"Ferry");

        System.out.println(studentData1);
    }
}
