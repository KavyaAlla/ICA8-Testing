import java.io.*;
import java.util.Scanner;

public class MainFunction {
    public String getString() {
        return null;
    }

    public Boolean goodString(String x) {
        for (int count = 0; count < x.length(); count++) {
            if (count + 1 < x.length()) {
                if (x.charAt(count) == '1' && x.charAt(count + 1) == '1')
                    return false;
            }
            if (x.charAt(count) != '1' && x.charAt(count) != '0') {
                return false;
            }
        }
        return true;
    }



    public Integer countUrinals(String y) {


        urinals obj = new urinals();
        boolean iscorrect = goodString(y);
        if (!iscorrect)
            return -1;
        String[] str = y.split("");
        int temp = 0;
        int len = str.length;
        int state[] = new int[len];
        for (int i = 0; i < len; i++) {
            state[i] = Integer.parseInt(String.valueOf(str[i]));
        }
        if (len == 1) {
            if (state[0] == 0) {
                temp = 1;
                state[0] = 1;
            }
        } else {
            int i = 0;
            if (state[i] == 0 && state[i + 1] != 1) {
                state[i] = 1;
                temp++;
            }
            for (i = 1; i < len - 1; i++) {
                if (state[i] == 0 && state[i - 1] != 1 && state[i + 1] != 1) {
                    state[i] = 1;
                    temp++;
                }
            }
            if (state[i] == 0 && state[i - 1] != 1) {
                temp++;
                state[i] = 1;
            }
        }
        return temp;
    }

    public int openFile(String filepath) {
        try {
            
            File file = new File(filepath);
            if (file == null)
                throw new IOException();
            //opening file to get the counter
            File cf = new File("src/counter.txt");
            if (cf == null)
                throw new IOException();
            Scanner c = new Scanner(cf);
            int counter = Integer.parseInt(c.nextLine());
            //getting the output file
            String outputfile = "src/rule.txt";
            if (counter != 0)
                outputfile = "src/rule" + counter + ".txt";

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.equals("-1"))
                    break;
                int vacancies = countUrinals(s);
                writeFile(outputfile, vacancies);

            }

            FileWriter cwriter = new FileWriter("src/incrementcounter.txt");
            if (cwriter == null)
                throw new IOException();
            cwriter.write(Integer.toString(counter + 1));
            cwriter.close();

            System.out.println("Successfully written output to " + outputfile);
            return 1;
        } catch (IOException e) {
            System.out.println("Error in opening file");
            e.printStackTrace();
            return 0;
        }

    }

    public int writeFile(String outputfile, int vacancies) {
        try {
            FileWriter writer = new FileWriter(outputfile, true);
            if (writer == null)
                throw new IOException();
            BufferedWriter bw = new BufferedWriter(writer);
            if (bw == null)
                throw new IOException();

            bw.write(Integer.toString(vacancies));
            bw.newLine();
            bw.close();
            return 1;
        } catch (IOException e) {
            System.out.println("Error opening output file");
            e.printStackTrace();
            return 0;

        }
    }

    }

