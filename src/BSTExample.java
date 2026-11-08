import java.util.TreeMap;
public class BSTExample
{
    public static void main(String [] args)
    {
        TreeMap<Integer,String> myTree = new TreeMap<Integer,String>();
        myTree.put(12345, "Betty Kretlow");
        myTree.put(678910,"John Doe");
        System.out.println(myTree);
        String lastStudent = myTree.get(678910);
        System.out.println("Last student is "+lastStudent);
        myTree.remove(678910);
        TreeMap<String,String> iterateTree = new TreeMap<>();
        iterateTree.put("0","Alice");
        iterateTree.put("1","Wyatt");
        iterateTree.put("2","Cole");
        iterateTree.put("3","Levy");
        iterateTree.put("4","Hollis");
        iterateTree.put("5","Tate");
        iterateTree.put("6","Elinor");
        iterateTree.put("7","Brodie");
        iterateTree.put("8","Tilly");
        iterateTree.put("9","Bernie");
        iterateTree.put("10","Aria");
        iterateTree.put("11","Archer");
        System.out.println("Great Grandchildren");
        System.out.println("\tnumber"+"\tName");
        for(String k:iterateTree.keySet())
        {
            //System.out.print(k);

            System.out.println("\t"+(k)+"\t" +iterateTree.get(k));
        }
    }
}
