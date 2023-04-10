package com.UST.FlightService.utils;

import com.UST.FlightService.exception.InsufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String,Double>paymentmap=new HashMap<>();
    static {
        paymentmap.put("acc1",20000.00);
        paymentmap.put("acc2",15000.00);
        paymentmap.put("acc3",25000.00);
        paymentmap.put("acc4",4000.00);
        paymentmap.put("acc5",45000.00);
        paymentmap.put("acc6",90000.00);
        paymentmap.put("acc7",2000.00);
        paymentmap.put("acc8",36000.00);
    }
    public static boolean validateCreditLimit(String accountNo,double paidamount) throws InsufficentAmountException {
        if(paidamount>paymentmap.get(accountNo)){
            throw new InsufficentAmountException("insufficent Amount...");
        }else {
            return true;
        }
    }

}
