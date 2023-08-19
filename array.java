public class array {
    public static void main(String[] args) {
        //we can write int[] marks or int marks[]
        int[] marks= new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=89;
        //a array is initialized with null. since its int here so each unit in array is indexed with 0
        //size of array can be found out using the .length()
        System.out.println(marks[0]);
        
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
