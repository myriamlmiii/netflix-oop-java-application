/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp.User;
import java.util.List;

public class AccountSearch extends Account {
    public AccountSearch(String email, String password) {
        super(email, password);
    }

    public int search (List<Account> accounts, Account accountToFind) throws AccountNotFound {
        for (Account acc : accounts) {
            if (acc.equals(accountToFind)) {
                return 1;
            }
        }
        throw new AccountNotFound("Account does not exist. Please Sign-in!");
    }
}