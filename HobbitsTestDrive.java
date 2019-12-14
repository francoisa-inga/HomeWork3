package HW3Compile.HW3CompileB;

/**
*This class is missing, entry point is hence missing; won't compile
 */
public class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

//Here should be (z<3) not (z<4) because 1 element will be outside array dimensions
        while (z < 3) {
            /**This line should be down, because like that the element h[0] won't be created
            z = z + 1;
             */
            h[z] = new Hobbits();
            h[z].name = "Bilbo";

            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + "-");
            System.out.println("Good Hobbit's name");
            z=z+1;
        }
    }
}
