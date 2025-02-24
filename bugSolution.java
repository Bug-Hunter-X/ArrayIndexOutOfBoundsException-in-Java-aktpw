public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //Check if index is in bounds
        if(0 <= 4 && 4 >=0){
          System.out.println(arr[4]); // Accessing a valid element
        }
        else{
          System.out.println("Index out of bounds");
        }
    }
}