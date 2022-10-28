import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

    public boolean openFile(String path) {
        try{
            FileReader file = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            System.out.println(line);
            System.out.println("No:of urinals available: " + countUrinals(line));

            while (line != null) {
                line = br.readLine();
                if(line.equals("-1")){
                    break;
                }
                System.out.println(line);
                System.out.println("Urinals count : " + countUrinals(line));
            }
            return true;
        }
        catch(IOException exp){
            return false;

        }
    }

    public Integer countUrinals(String y)
    {


        urinals obj=new urinals();
        boolean iscorrect=goodString(y);
        if(!iscorrect)
            return -1;
        String[] str=y.split("");
        int temp=0;
        int len=str.length;
        int state[]=new int[len];
        for(int i=0;i<len;i++)
        {
            state[i]=Integer.parseInt(String.valueOf(str[i]));
        }
        if(len==1){
            if(state[0]==0){
                temp=1;
                state[0]=1;
            }
        }
        else {
            int i=0;
            if(state[i]==0 && state[i+1]!=1){
                state[i]=1;
                temp++;
          }
            for(i=1;i<len-1;i++){
                if(state[i]==0 && state[i-1]!=1 && state[i+1]!=1){
                    state[i]=1;
                    temp++;
                }
            }
            if(state[i]==0&&state[i-1]!=1) {
                temp++;
                state[i] = 1;
            }
        }
        return temp;
    }

    }
