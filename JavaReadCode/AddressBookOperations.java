import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddressBookOperations
{


    public static void main(String[] args) throws IOException
    {
        String s = null;
        String s2 = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Console in = System.console();

        System.out.println(" Please select the required operations.\n"
                        + " 1- Add contact\t 2- search contact\t 3- delete contact\t 4- display all contacts\n");
        s2 = in.readLine();
        if (s2 != null && !(s2.equals("1") || s2.equals("2") || s2.equals("3") || s2.equals("4")))
        {
            System.out.println("Invalid Operation Selected\n");
            System.exit(0);
        }

        else
        {
            s = s2;
        }

        if (s != null)
        {
            String dataLine;
            String data;
            if (s.equals("1")) {
                System.out.println("Name: ");
                dataLine = in.readLine();
                data = dataLine;
                in = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("PhoneNumber: ");
                dataLine = in.readLine();
                data = data + ":" + dataLine;
                writeToFile("C:/AddressBook.bat", data, true, true);
            } else if (s.equals("2")) {
                System.out.println("Enter Name 0r PhoneNumber: ");
                dataLine = in.readLine();
                String result = readFromFile("C:/AddressBook.bat", dataLine);
                System.out.println("Search Results\n" + result);
            } else if (s.equals("3")) {
                System.out.println("Enter Name: ");
                dataLine = in.readLine();
                data = dataLine;
                System.out.println("PhoneNumber: ");
                dataLine = in.readLine();
                data = data + ":" + dataLine;
                deleteFromFile("C:/AddressBook.bat", data);
            } else if (s.equals("4")) {
                String result = readFromFile("C:/AddressBook.bat", null);
                System.out.println("Search Results\n" + result);
            }
        }

    }

    private static void deleteFromFile(String string, String dataLine) {
        String data = readFromFile(string, null);
        data = data.replaceAll(dataLine, "");
        writeToFile(string, data, false, false);
    }

    public static boolean writeToFile(String fileName, String dataLine,
            boolean isAppendMode, boolean isNewLine) {
        if (isNewLine) {
            dataLine = "\n" + dataLine;
        }

        try {
            File outFile = new File(fileName);
            DataOutputStream dos;
            if (isAppendMode) {
                dos = new DataOutputStream(new FileOutputStream(fileName, true));
            } else {
                dos = new DataOutputStream(new FileOutputStream(outFile));
            }

            dos.writeBytes(dataLine);
            dos.close();
        } catch (FileNotFoundException ex) {
            return (false);
        } catch (IOException ex) {
            return (false);
        }
        return (true);

    }

    /*
     * Reads data from a given file
     */
    public static String readFromFile(String fileName, String dataLine2) {
        String DataLine = "";
        String fileData = "";
        try {
            File inFile = new File(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(inFile)));
            if (dataLine2 != null)
            {
                while ((DataLine = br.readLine()) != null)
                {
                    if (DataLine.contains(dataLine2)) {
                        fileData = DataLine;
                    }
                }
            }

            else
            {
                while ((DataLine = br.readLine()) != null)
                {
                    fileData = fileData + "\n" + DataLine;
                    //System.out.println(DataLine);
                }
            }
            br.close();
        }

        catch (FileNotFoundException ex)
        {
            return (null);
        } catch (IOException ex)
        {
            return (null);
        }
        return (fileData);

    }

    public static boolean isFileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }
}
