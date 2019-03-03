package customLib.base.methods;

import customLib.base.BaseMethods;

public class NavigateMethods  {

    private static NavigateMethods obj=null;

    public static NavigateMethods getInstance()
    {
        if(obj==null)
            obj=new NavigateMethods();

        return obj;

    }

    public void hitURL(String url)
    {
        try {
            BaseMethods.DRIVER.get(url);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
