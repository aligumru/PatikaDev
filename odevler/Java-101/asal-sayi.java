
public class Main {
    public static void main(String[] args) {

        String asal="";
        for (int i=1;i<=100;i++){
            int count=0;

            for(int j=i;j>=1;j--){

                if(i%j==0){
                    count+=1;
                }
            }

            if(count==2){
                asal=asal+i+" ";
            }
        }
        System.out.println(asal);
    }
}