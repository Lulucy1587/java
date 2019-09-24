public class integral{
    public static void main(String[] args){
        System.out.print("请输入函数：");
        Scanner func =new Scanner(System.in);
        System.out.print("请输入上下限a,b：");
        Scanner in =new Scanner(System.in);
        float a = in.nextInt();
        float b = in.nextInt();
        float m,n=100000,x,f;
        float sum=0;
        int i=1;
        m=(a-b)/n;
        while(i<=n){
            x=a+i*m;
            f=func.nextInt;
            sum=sum+f*m;
            i++;
        }
        System.out.println("函数在"+a+','+b+"区间的定积分为："+sum);

    }
}