package com.example.intuit.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
   @Id
   String playerID;
   String birthYear,birthMonth,birthDay,birthCountry,
   birthState,birthCity,deathYear,deathMonth,deathDay,deathCountry,
   deathState,deathCity,nameFirst,nameLast,nameGiven,weight,height,
   bats,throws_,debut,finalGame,retroID,bbrefID;

   public Player(){}

   public Player(String[] fields) {
      this.playerID = fields[0];
      this.birthYear = fields[1];
      this.birthMonth = fields[2];
      this.birthDay = fields[3];
      this.birthCountry = fields[4];
      this.birthState = fields[5];
      this.birthCity = fields[6];
      this.deathYear = fields[7];
      this.deathMonth = fields[8];
      this.deathDay = fields[9];
      this.deathCountry = fields[10];
      this.deathState = fields[11];
      this.deathCity = fields[12];
      this.nameFirst = fields[13];
      this.nameLast = fields[14];
      this.nameGiven = fields[15];
      this.weight = fields[16];
      this.height = fields[17];
      this.bats = fields[18];
      this.throws_ = fields[19];
      this.debut = fields[20];
      this.finalGame = fields[21];
      this.retroID = fields[22];
      this.bbrefID = fields[23];
   }

   @Override
   public String toString() {
      return "Player{" +
              "playerID='" + playerID + '\'' +
              ", birthYear='" + birthYear + '\'' +
              ", birthMonth='" + birthMonth + '\'' +
              ", birthDay='" + birthDay + '\'' +
              ", birthCountry='" + birthCountry + '\'' +
              ", birthState='" + birthState + '\'' +
              ", birthCity='" + birthCity + '\'' +
              ", deathYear='" + deathYear + '\'' +
              ", deathMonth='" + deathMonth + '\'' +
              ", deathDay='" + deathDay + '\'' +
              ", deathCountry='" + deathCountry + '\'' +
              ", deathState='" + deathState + '\'' +
              ", deathCity='" + deathCity + '\'' +
              ", nameFirst='" + nameFirst + '\'' +
              ", nameLast='" + nameLast + '\'' +
              ", nameGiven='" + nameGiven + '\'' +
              ", weight='" + weight + '\'' +
              ", height='" + height + '\'' +
              ", bats='" + bats + '\'' +
              ", throws_='" + throws_ + '\'' +
              ", debut='" + debut + '\'' +
              ", finalGame='" + finalGame + '\'' +
              ", retroID='" + retroID + '\'' +
              ", bbrefID='" + bbrefID + '\'' +
              '}';
   }

   public String getPlayerID() {
      return playerID;
   }

   public void setPlayerID(String playerID) {
      this.playerID = playerID;
   }

   public String getBirthYear() {
      return birthYear;
   }

   public void setBirthYear(String birthYear) {
      this.birthYear = birthYear;
   }

   public String getBirthMonth() {
      return birthMonth;
   }

   public void setBirthMonth(String birthMonth) {
      this.birthMonth = birthMonth;
   }

   public String getBirthDay() {
      return birthDay;
   }

   public void setBirthDay(String birthDay) {
      this.birthDay = birthDay;
   }

   public String getBirthCountry() {
      return birthCountry;
   }

   public void setBirthCountry(String birthCountry) {
      this.birthCountry = birthCountry;
   }

   public String getBirthState() {
      return birthState;
   }

   public void setBirthState(String birthState) {
      this.birthState = birthState;
   }

   public String getBirthCity() {
      return birthCity;
   }

   public void setBirthCity(String birthCity) {
      this.birthCity = birthCity;
   }

   public String getDeathYear() {
      return deathYear;
   }

   public void setDeathYear(String deathYear) {
      this.deathYear = deathYear;
   }

   public String getDeathMonth() {
      return deathMonth;
   }

   public void setDeathMonth(String deathMonth) {
      this.deathMonth = deathMonth;
   }

   public String getDeathDay() {
      return deathDay;
   }

   public void setDeathDay(String deathDay) {
      this.deathDay = deathDay;
   }

   public String getDeathCountry() {
      return deathCountry;
   }

   public void setDeathCountry(String deathCountry) {
      this.deathCountry = deathCountry;
   }

   public String getDeathState() {
      return deathState;
   }

   public void setDeathState(String deathState) {
      this.deathState = deathState;
   }

   public String getDeathCity() {
      return deathCity;
   }

   public void setDeathCity(String deathCity) {
      this.deathCity = deathCity;
   }

   public String getNameFirst() {
      return nameFirst;
   }

   public void setNameFirst(String nameFirst) {
      this.nameFirst = nameFirst;
   }

   public String getNameLast() {
      return nameLast;
   }

   public void setNameLast(String nameLast) {
      this.nameLast = nameLast;
   }

   public String getNameGiven() {
      return nameGiven;
   }

   public void setNameGiven(String nameGiven) {
      this.nameGiven = nameGiven;
   }

   public String getWeight() {
      return weight;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getHeight() {
      return height;
   }

   public void setHeight(String height) {
      this.height = height;
   }

   public String getBats() {
      return bats;
   }

   public void setBats(String bats) {
      this.bats = bats;
   }

   public String getThrows_() {
      return throws_;
   }

   public void setThrows_(String throws_) {
      this.throws_ = throws_;
   }

   public String getDebut() {
      return debut;
   }

   public void setDebut(String debut) {
      this.debut = debut;
   }

   public String getFinalGame() {
      return finalGame;
   }

   public void setFinalGame(String finalGame) {
      this.finalGame = finalGame;
   }

   public String getRetroID() {
      return retroID;
   }

   public void setRetroID(String retroID) {
      this.retroID = retroID;
   }

   public String getBbrefID() {
      return bbrefID;
   }

   public void setBbrefID(String bbrefID) {
      this.bbrefID = bbrefID;
   }
}
