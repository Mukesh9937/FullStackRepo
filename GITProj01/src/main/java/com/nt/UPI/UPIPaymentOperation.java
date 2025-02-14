package com.nt.UPI;

import java.util.Random;

public class UPIPaymentOperation {
	public String doPayment(String upiId,double amount){
		return amount +"is transfered to "+upiId;
   }
	public String addrewards(String txId) {
		return txId+"has got"+new Random().nextInt(4000)+"reward points have come";
	}
	
}


