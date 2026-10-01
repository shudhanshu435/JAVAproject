import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
    
        int[] sourceArray = {10, 20, 30, 40, 50};
        
        int[] copy1 = Arrays.copyOf(sourceArray, sourceArray.length);
        
        int[] copy2 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, copy2, 0, sourceArray.length);
        
        int[] copy3 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            copy3[i] = sourceArray[i];
        }
        
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Using Arrays.copyOf(): " + Arrays.toString(copy1));
        System.out.println("Using System.arraycopy(): " + Arrays.toString(copy2));
        System.out.println("Using a for loop: " + Arrays.toString(copy3));
    }
}
