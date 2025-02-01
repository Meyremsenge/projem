
package birincidonem;
public class hHashmain {
    public static void main(String[] args) {
        hHashtable t=new hHashtable(10);
        t.put(1, 5);
         t.put(14, 28);
          t.put(12, 23);
           t.put(22, 33);
          for (int i = 0; i < t.map.length; i++) {
              if (t.map[i] != null) {
                  System.out.println(i+"."+ t.map[i].getKey() + "-" + t.map[i].getValue());
                  
              }
        }
    }
}
