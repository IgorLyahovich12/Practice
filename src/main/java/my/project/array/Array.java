package my.project.array;

public class Array {
    //create
    public int[] matrix;
    public int[][] thirdMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    //create with initialization
    public int[] secondMatrix={2,3,4,5,6};
    public Array() {
        matrix = new int[7];
        secondMatrix[0]=7;
    }

}
