package automationTest.pageObject;

import customLib.base.BaseMethods;

public class Helper implements BaseMethods {

    private static Helper obj=null;

    public static Helper getInstance()
    {
        if(obj==null)
        {
            obj=new Helper();
        }
        return obj;
    }
}
