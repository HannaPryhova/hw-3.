public class ATM {
    public int countBanknotes(int sum){
        int [] NominalOfBanknotes = {500,200,100,50,20,10,5,2,1};
        int numberOfBanknotes = 0, count = 0;
        while (sum!= 0){
            if (sum >= NominalOfBanknotes[count]) {
                numberOfBanknotes = numberOfBanknotes+sum/NominalOfBanknotes[count];
                sum = sum-(sum/NominalOfBanknotes[count])*NominalOfBanknotes[count];
            }
            count++;
        }
        return numberOfBanknotes;
    }
}
