/*******************************************************************************
 * Copyright (c) 2019 OpenRules, Inc.
 *******************************************************************************/
package hello.java;

import java.util.Date;

public class BankStatement {


	Date bankStatementDate;
	double bankStatementAmount;
	int bankAccountId;
	boolean isMatched;
	boolean canBeUsedInMatch;
	int clientId;
	
	public Date getBankStatementDate() {
		return bankStatementDate;
	}
	public void setBankStatementDate(Date bankStatementDate) {
		this.bankStatementDate = bankStatementDate;
	}
	public double getBankStatementAmount() {
		return bankStatementAmount;
	}
	public void setBankStatementAmount(double bankStatementAmount) {
		this.bankStatementAmount = bankStatementAmount;
	}
	public int getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public boolean getIsMatched(){
		return this.isMatched;
	}
	public void setIsMatched(boolean isMatched){
		this.isMatched = isMatched;
	}
	public boolean getCanBeUsedInMatch(){
		return this.canBeUsedInMatch;
	}
	public void setCanBeUsedInMatch(boolean canBeUsedInMatch){
		this.canBeUsedInMatch = canBeUsedInMatch;
	}
	public int getClientId(){
		return this.clientId;
	}
	public void setClientId(int clientId){
		this.clientId = clientId;
	}

	public boolean isIsMatched(){
		return this.isMatched;
	}
	public boolean isCanBeUsedInMatch(){
		return this.canBeUsedInMatch;
	}


}
