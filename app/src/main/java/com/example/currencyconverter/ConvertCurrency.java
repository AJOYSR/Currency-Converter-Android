package com.example.currencyconverter;

public class ConvertCurrency {
    public static double usdBDT(double usdB){
        usdB=usdB*81;
        return usdB;
    }

    public static double bdtUSD(double BDTu){
        BDTu=BDTu/81;
        return BDTu;
    }

    public static double bdtIND(double bdtI){
        bdtI=bdtI*79;
        return bdtI;
    }
}
