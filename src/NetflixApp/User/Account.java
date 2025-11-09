package NetflixApp.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account implements java.io.Serializable {
    private String email;
    private String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Account(String skoexamplecom, User user) {
        throw new UnsupportedOperationException("Not supported yet.");// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nUsername: " + email + "\tPassword: " + password + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    public void SaveAccounts(Account customers) {
        try {
            FileOutputStream myfile = new FileOutputStream("accounts.ser");
            ObjectOutputStream oos = new ObjectOutputStream(myfile);

            oos.writeObject(customers);

            oos.flush();// force the writing on the file before closing the stream
            oos.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public List<Account> loadAccountsFromFile() {
        List<Account> customers = new ArrayList<>();
        File accountFile = new File("accounts.ser");

        if (accountFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(accountFile))) {
                // Read a single Account object, not a List<Account>
                Account loadedAccount = (Account) ois.readObject();
                customers.add(loadedAccount);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error loading accounts from file: " + e.getMessage());
            }
        } else {
            System.out.println("No existing accounts file found. Starting fresh.");
        }

        return customers;
    }
}
