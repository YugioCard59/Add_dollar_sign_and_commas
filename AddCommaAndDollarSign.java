/**
 * Given a numerical value represented as a String this code will add commas
 * at the appropriate locations if the commas were originally omitted from
 * the original String input.  If the original String input omitted the dollar sign
 * then this code will add the dollar sign to the String input.
 * String input should be a numerical value to represent a US dollar amount.
 * The String input should not have commas but may or may not have the "$" symbol
 * in front of the value.
 * 
 * @IsabelC.
 * @v12023
 */

public class DollarAmount {

    public String getAmountAsString1(String amount) {
        if(amount.indexOf("$") == 0  && amount.length() <= 4) {
        //Check if $ present and length doesn't require , 
            return amount;
        } else {

            if(amount.indexOf("$") != 0 && amount.length() <= 3) {
                amount = "$" + amount;
                return amount;
            }
        }
            
        if(amount.indexOf("$") == 0 && amount.length() > 4) {
        //Check if $ present and length requires ,
           for(int i = amount.length() - 1; i < amount.length(); i-=3) {
               if(i < 4) {
                   break;
                }
                StringBuffer stringBuffer = new StringBuffer(amount);
                stringBuffer = stringBuffer.insert(i-2, ",");
                amount = stringBuffer.toString();
                // System.out.println(amount);
                // System.out.println(i);         
            }
            return amount;
        } else {

            if(amount.indexOf("$") != 0 && amount.length() > 3) {
            //Check if $ not present and length doesn't require ,
                amount = "$" + amount;
                for(int i = amount.length() - 1; i < amount.length(); i-=3) {
                    if(i < 4) {
                        break;
                    }
                    StringBuffer stringBuffer = new StringBuffer(amount);
                    stringBuffer = stringBuffer.insert(i-2, ",");
                    amount = stringBuffer.toString();
                    // System.out.println(amount);
                    // System.out.println(i);
                }
                
                return amount;
            }
        }
            return amount;
    }
}
