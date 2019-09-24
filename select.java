import java.util.Random;
public class select{
    public static void main(String[] args){
        String c[]={"one ball","two banbanas","three bags"};
        String a[]={"Mike","Jery","Lucy"};
        String b[]={"has","is not have","is buying"};
        Random random=new Random();
        int x=(int)(Math.random()*a.length);
        int y=(int)(Math.random()*b.length);
        int z=(int)(Math.random()*c.length);
        System.out.println(a[x]);
        System.out.println(b[y]);
        System.out.println(c[z]);
    }
}