package database;

import java.io.*;

public class fileStorage {
    static File accountsData = new File("data.txt");

    public fileStorage() throws IOException {
        if(!accountsData.exists()) {
            accountsData.createNewFile();
        }
    }

    public static String addAccountToDataBase(String username, String password)  {
        if(username.equals("") || password.equals("")) {
            return "The fields must not be empty!";
        }

        try {
            FileWriter writer = new FileWriter(accountsData, true);

            writer.write(username + "\n");
            writer.write(password + "\n");
            writer.write("\n");
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return "Account created successfully!";
    }

    public static String verifyData(String usernameInput, String passwordInput) {
        String username, password;

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(accountsData));

            while((username = buffer.readLine()) != null) {
                password = buffer.readLine();
                buffer.readLine();


                if(username.equals(usernameInput) && password.equals(passwordInput)) {
                    return "Login successful!";
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return "Invalid username or password!";
    }
}
