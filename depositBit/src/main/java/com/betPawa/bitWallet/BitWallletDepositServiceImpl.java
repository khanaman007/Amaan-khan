package com.betPawa.bitWallet;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.betPawa.bitWallet.BitWallletDepositServiceGrpc.BitWallletDepositServiceImplBase;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.common.dao.IBitWalletRepository;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.util.Transformer;

import io.grpc.stub.StreamObserver;
@GRpcService
public class BitWallletDepositServiceImpl extends BitWallletDepositServiceImplBase {
  @Autowired private IBitWalletRepository repso;
  private static final Logger LOGGER =LoggerFactory.getLogger(BitWallletDepositServiceImpl.class); 
	public BitWallletDepositServiceImpl() {
		// TODO Auto-generated constructor stub
	}
 
 @Override
public void deposit(DepositRequest request, StreamObserver<EmpltyResponse> responseObserver) {
	       BitWalletAccount account=null;
			LOGGER.info("server received {}", request);
			
			
			try {
				account =Transformer.getBitWalletAccount(request);
				repso.deposit(account);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
