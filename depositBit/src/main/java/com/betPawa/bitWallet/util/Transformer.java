package com.betPawa.bitWallet.util;


import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.common.CurrencyType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;



public class Transformer {
	
 public static BitWalletAccount getBitWalletAccount(DepositRequest request) {
	 BitWalletAccount acount= new BitWalletAccount();
	 acount.setAmount(request.getAmount());
	 acount.setBitWalletId(request.getUserId());
	 acount.setCurrency(CurrencyType.valueOf(request.getCurrency()));
	
	 return acount;
 }
 
}
