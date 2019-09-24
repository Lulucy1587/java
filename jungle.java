public class jungle{
    public static void main(String[] args){
        double x=0.5;      //女警的始血量为0.5
        int t=1,n;        //t为巨龙的伤害量，n为喝神仙水的瓶数
        for(n=1;x<=t&&n<=5;n++){
            x=x*2;
        }
        System.out.println("当女警还剩"+x+"滴血时向巨龙开的第一枪");
    }
}