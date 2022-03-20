package Models;

import java.util.Locale;

public class TrainingArrays {
    public static void main(String[] args) {
        AccountModel[] arrayObj = new AccountModel[2];
        String alphabet = "ABC DEF GHJ";
        String[] strings = alphabet.split(" ");
        int index = 0;
        arrayObj[0] = new AccountModel(0L, 2000.0);
        arrayObj[1] = new AccountModel(1L, 300.00);
        System.out.println(arrayObj[0]);

        for(int i = 0; i< strings.length; i++) {
            System.out.println(strings[i].toLowerCase());
        }

        for(int i=0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i].getId());
            System.out.println(arrayObj[i].getBalance());
        }

        while (index < arrayObj.length) {
            System.out.println("While Loop");
            System.out.println(arrayObj[index].getId());
            System.out.println(arrayObj[index].getBalance());
            index++;
        }
    }
}
