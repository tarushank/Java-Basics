package Basics.PrintMethod;

public class Pattern {
    public static void main(String[] args) {
        String hash = "#";
        String addedHash = "";
        int numOfHashes = 10;

        for(int i=0; i<numOfHashes; i++) {
            addedHash = addedHash + hash;
        }

        int count = 1;
        while(count <= numOfHashes) {
            System.out.printf("%"+numOfHashes+"."+count+"s %n",addedHash);
            count++;
        }
    }
}
