import java.util.HashMap;

public class A1_HashMap {

    HashMap <String, String> firstMap = new HashMap <String, String>();

    //1.Add key : value pairs to a HashMap (String, pointing to String)
    public void ex1(){

        firstMap.put("Marco", "Polo");
        firstMap.put("Big", "Ben");
        firstMap.put("olas", "oasch");

        System.out.print( firstMap);

    }
    // 2.Retrieve a value associated with a given key from the HashMap.
    public void ex2(){
        firstMap.remove("Marco");
        System.out.print(firstMap);
    }

    //3.Check whether a particular key/value exist in a HashMap.
    public void ex3(){
        System.out.println(firstMap.containsKey("Marco"));
        System.out.print(firstMap.containsKey("Big"));


    }

    //4.Find out the number of key-value mappings present in a HashMap.
    public void ex4(){
        System.out.print(firstMap.size());

    }

    //5.Remove all key-value pairs from a HashMap.
    public void ex5(){
        firstMap.clear();
        System.out.print(firstMap);
    }

    //6.Iterate through all key-value pairs and print them.
    public void ex6(){

        firstMap.put("Marco", "Polo");
        firstMap.put("Big", "Ben");
        firstMap.put("olas", "oasch");
        firstMap.put("Rocky", "Balboa");
        firstMap.put("Robo", "Cop");

        for(String i : firstMap.keySet()){
            System.out.printf("%10s",(i)+" ");

        }

        System.out.println();

        for(String i : firstMap.values()){
            System.out.printf("%10s",(i)+" ");

        }

    }

    //7.Remove a key-value pair.
    public void ex7(){
        firstMap.remove("Marco");
        System.out.print(firstMap);
    }

    //8.
    public void ex8(){
        firstMap.put("immer",firstMap.get("olas"));
        firstMap.remove("olas");
        System.out.print(firstMap);
    }



}
