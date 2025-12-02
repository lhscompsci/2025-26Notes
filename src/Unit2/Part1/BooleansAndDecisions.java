package Unit2.Part1;

public class BooleansAndDecisions {
    static void main(String[] args){
        //boolean expressions  a.k.a. condition
        // >
        // <
        // >=
        // <=
        // ==
        // !=

        int total=0;
        boolean flag = total >= 100;

        // decisions
        //  basic:   if
        if(fuelLevel <= .25)
            stopForGas();

        // 2-way decision:   if-else
        if(price1 < price2)
            stopAtGS1();
        else
            stopAtGS2();

        // multi-way decisions:  if-else if-else
        if(wantSlimChickens){
            goToSlims();
            stopAtSonic();
        }
        else if(wantMarketStreet)
            goToMktSt();
        else if(wantPizza)
            goToMarcos();
        else
            goToCommons();

        // nested decisions
        if(price1<price2){
            stopAtGS1();
            if(thirsty)
                goInside();
            else
                stayAtCar();
            if(tiresNeedAir)
                addAirToTires();
        }


    }
}
