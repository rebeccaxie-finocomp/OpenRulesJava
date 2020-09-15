/*******************************************************************************
 * Copyright (c) 2019 OpenRules, Inc.
 *******************************************************************************/
package hello.java;

import java.util.Date;

public class Expectation {


    Date expectationDate;
    double expectationAmount;
    int expectationBankAccountId;
    boolean validBankAccountId;
    String match;
    boolean isMatched;
    boolean canBeUsedInMatch;
    int clientId;
    boolean validClientId;
    boolean readyToMatch;
    double variance;
    boolean validAmount;

    public Date getExpectationDate() {
        return expectationDate;
    }
    public void setExpectationDate(Date expectationDate) {
        this.expectationDate = expectationDate;
    }
    public double getExpectationAmount() {
        return expectationAmount;
    }
    public void setExpectationAmount(double expectationAmount) {
        this.expectationAmount = expectationAmount;
    }
    public int getExpectationBankAccountId() {
        return expectationBankAccountId;
    }
    public void setExpectationBankAccountId(int expectationBankAccountId) {
        this.expectationBankAccountId = expectationBankAccountId;
    }

    public boolean getValidBankAccountId(){
        return this.validBankAccountId;
    }
    public void  setValidBankAccountId(boolean validBankAccountId){
        this.validBankAccountId = validBankAccountId;
    }

    public String getMatch(){
        return this.match;
    }
    public void setMatch(String match){
        this.match = match;
    }
    public boolean isValidBankAccountId(){
        return this.validBankAccountId;
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
    public boolean getValidClientId(){
        return this.validClientId;
    }
    public void setValidClientId(boolean validClientId){
        this.validClientId = validClientId;
    }
    public boolean isIsMatched(){
        return this.isMatched;
    }
    public boolean isCanBeUsedInMatch(){
        return this.canBeUsedInMatch;
    }
    public boolean isValidClientId(){
        return this.validClientId;
    }

    public boolean getReadyToMatch(){
        return this.readyToMatch;
    }
    public void setReadyToMatch(boolean readyToMatch){
        this.readyToMatch = readyToMatch;
    }
    public boolean isReadyToMatch(){
        return this.readyToMatch;
    }

    public double getVariance() {
        return variance;
    }
    public void setVariance(double variance) {
        this.variance = variance;
    }

    public void setValidAmount(boolean validAmount){
        this.validAmount = validAmount;
    }
    public boolean getValidAmount(){
        return this.validAmount;
    }
    public boolean isValidAmount(){
        return this.validAmount;
    }
}
