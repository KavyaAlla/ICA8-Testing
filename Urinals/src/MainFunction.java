public class MainFunction {
    public String getString()
    {
        return null;
    }

    public Boolean goodString(String x)
    {
        for(int count=0;count<x.length();count++)
        {
            if(count+1<x.length())
            {
                if(x.charAt(count)=='1' && x.charAt(count+1)=='1')
                    return  false;
            }
            if(x.charAt(count)!='1' && x.charAt(count)!='0')
            {
                return false;
            }
        }
        return true;
    }

    public void openFile()
    {

    }

    public Integer countUrinals(String s)
    {
        return 0;
    }
}