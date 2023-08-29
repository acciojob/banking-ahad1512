package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only


    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
       super(name,balance,5000);
       this.tradeLicenseId = tradeLicenseId;
       if(getBalance()<5000){
           throw new Exception("Insufficient Balance");
       }
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
    for (int i=0; i<tradeLicenseId.length()-1;i++){
        if(tradeLicenseId.charAt(i)==tradeLicenseId.charAt(i+1)){
            String r = rearrangedId(tradeLicenseId);
            //System.out.println(r);
            if(!isValidateLicenseId(r)){
                throw new Exception("Valid License can not be generated");
            }
            break;
        }

    }
    }

    private boolean isValidateLicenseId(String r) {
        char[] chars = r.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1])
                return false;
        }
        return true;
    }

    private String rearrangedId(String tradeLicenseId) {
        char chars[] = tradeLicenseId.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                for (char c ='A'; c <='Z'; c++){
                    if(chars[i]!=c && (i==chars.length-2 || c!=chars[i+2] )){
                        chars[i+1]=c;
                        break;
                    }
                }
            }
        }
        return new String(chars);
    }

}
