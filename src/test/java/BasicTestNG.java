
//Learnings:

//How to run tests with TestNG



import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicTestNG {

    @AfterTest
    public void lastexecution(){

        System.out.println("i will execute last");
    }



    @Test
    public void Demo(){
        System.out.println("Hello World......!");
    }

    @Test
    public  void SecondTest(){

        System.out.println("Bye............!");
    }


}
