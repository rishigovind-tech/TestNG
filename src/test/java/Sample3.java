import org.testng.annotations.*;



public class Sample3 {


    @Parameters({ "URL" })
    @Test
    public void WebloginHomeLoan(String uname)
    {
        //selenium
        System.out.println("webloginhomePersonalLoan");
        System.out.println(uname);

    }


    @Test(groups={"Smoke"})
    public void MobileLoginHomeLoan()
    {
        //Appium
        System.out.println("MobileloginHome");
    }

    @Test
    public void LoginAPIHomeLoan()
    {
        //Rest API automation
        System.out.println("APIloginHome");
    }
}
