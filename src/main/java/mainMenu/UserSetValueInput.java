package mainMenu;

import view.ViewInvalidInput;
import view.ViewUserSetValueInput;



public class UserSetValueInput {
     Double amountInputValue;

    public void showViewSetValueNonNegativeZero(String iconPath) {
        try {

            ViewUserSetValueInput userSetValueInput = new ViewUserSetValueInput(iconPath);
            Double amountInputDouble = Double.parseDouble(userSetValueInput.getUserInputValue());
            if (amountInputDouble <= 0){
                throw  new IllegalArgumentException();
            }
            else {
                this.amountInputValue = amountInputDouble;
            }
        } catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();
            new ViewInvalidInput();
            showViewSetValueNonNegativeZero(iconPath);
        }
    }

    public void showViewSetValueNegativeZero(String iconPath){
        try {
            ViewUserSetValueInput userSetValueInput = new ViewUserSetValueInput(iconPath);
            Double amountInputDouble = Double.parseDouble(userSetValueInput.getUserInputValue());
            if (amountInputDouble == null){
                throw  new IllegalArgumentException();
            }
            else {
                this.amountInputValue = amountInputDouble;
            }
        } catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();

            ViewInvalidInput viewInvalidInput = new ViewInvalidInput();
            showViewSetValueNonNegativeZero(iconPath);
        }
    }
    public double getValue(){
        return this.amountInputValue;
    }
}
