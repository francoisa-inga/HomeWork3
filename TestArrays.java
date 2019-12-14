package IslandArrays;

public class TestArrays {
    public void runIslands() {

    //declare and initialise islands array
    String[] islands = new String[4];
    islands[0]="Bermuda";
    islands[1]="Fiji";
    islands[2]="Acores";
    islands[3]="Cosumel";

    //declare and initialise indexes array
    int[] index = new int[4];
    index[0]=1;
    index[1]=3;
    index[2]=0;
    index[3]=2;

    int y = 0;
    int ref;

        while(y<4)

    {
        ref = index[y];
        System.out.print("islands are ");
        System.out.println(islands[ref]);
        y = y + 1;
    }
}
}
