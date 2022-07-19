public class cn {
    public static void main(String[] args) {
        int arr[]={150,203,303,473,43,66,77};
        int n=7;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int x= arr[i];
            int r= x%10;
            if(r==3)
            {
            cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
