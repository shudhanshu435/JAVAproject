public class Difference{
    public static void main(String[] args){
        int [] arr= {2,4,6,8,10};
        int difference=arr[0];
        for(int i=1; i<arr.length; i++){
            difference-=arr[i];
        }
        System.out.println("Difference " + difference);
    }
}