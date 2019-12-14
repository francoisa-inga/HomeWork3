package HW3Compile.HW3CompileA;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        /**
         * Missing part of the code (simplified it using cycle)
         */
        for(x=0;x<3;x++){
            myBooks[x] = new Books();
        }

        //myBooks fields initialising
        myBooks[0].title = "Java Fruit";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Java Recipees";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Jan";

        //reset x as 0 to implement the part of the code below
        x=0;
        while(x<3) {
            System.out.print(myBooks[x].title);
            System.out.print(" authos is ");
            System.out.println(myBooks[x].author);
            x=x+1;


        }
        //x=x+1;
    }

}