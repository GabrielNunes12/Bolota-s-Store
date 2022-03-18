package Models;

public class TrainingArrays {
    public static void main(String[] args) {
        AccountModel[] arrayObj = new AccountModel[2];
        int index = 0;
        arrayObj[0] = new AccountModel(0L, 2000.0);
        arrayObj[1] = new AccountModel(1L, 300.00);
        System.out.println(arrayObj[0]);

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
