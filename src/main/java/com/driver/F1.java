package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Racing",2);

    }

    public void accelerate(int rate){
        int newSpeed = rate+getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            setGears(1);
            return;
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            if(getCurrentSpeed()>0 && getCurrentSpeed()<=50) setGears(1);
            if(getCurrentSpeed()>50 && getCurrentSpeed()<=100) setGears(2);
            if(getCurrentSpeed()>100 && getCurrentSpeed()<=150) setGears(3);
            if(getCurrentSpeed()>150 && getCurrentSpeed()<=200) setGears(4);
            if(getCurrentSpeed()>200 && getCurrentSpeed()<=250) setGears(5);
            if( getCurrentSpeed()<250) setGears(6);
        }
    }
}
