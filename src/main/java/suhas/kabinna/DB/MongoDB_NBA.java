package suhas.kabinna.DB;

import java.util.List;
import java.util.Set;

import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)

@XmlType(name="text")

//"PlayerName","Position","Game_Date","Game_Number","Age","TeamName","Home_Away","OppName","Win_Loss",
//"GameStarted","MinutesPlayed","FG","FGA","ThreeP","ThreePA","FT","FTA","ORB","DRB","TRB","AST","STL","BLK",
//"TOV","PF","PF","PTS","GmSC","PlusMinus"

public class MongoDB_NBA {

	protected String Aa_PlayerName;
	protected String Position;
	protected Double Game_Number;
	protected String Game_Date;
	protected String Age;
	protected String TeamName;
	protected String Home_Away;
	protected String OppName;
	protected String Win_Loss;
	protected String GameStarted;
	protected String MinutesPlayed;
	protected Double FG;
	protected Double FGA;
	protected Double ThreeP;
	protected Double ThreePA;
	protected Double FT;
	protected Double FTA;
	protected Double ORB;
	protected Double DRB;	
	protected Double TRB;
	protected Double AST;
	protected Double STL;
	protected Double BLK;
	protected Double TOV;
	protected Double PF;
	protected Double PTS;
	protected Double GmSC;
	protected Double PlusMinus;

	
	public MongoDB_NBA(){
		
	}
	
	
	
	public MongoDB_NBA(String playerName,String position, Double game_Number, String game_Date, String age, String teamName, String home_Away,
			String oppName, String win_Loss, String gameStarted, String minutesPlayed, Double fG, Double fGA, 
			Double threeP, Double threePA, Double fT, Double fTA,  Double oRB, Double dRB, Double tRB,
			Double aST, Double sTL, Double bLK, Double tOV, Double pF,Double Pts, Double gmSC, Double plusMinus) {
		super();
		Aa_PlayerName = playerName;
		Position = position;
		Game_Number = game_Number;
		Game_Date = game_Date;
		Age = age;
		TeamName = teamName;
		Home_Away = home_Away;
		OppName = oppName;
		Win_Loss = win_Loss;
		GameStarted = gameStarted;
		MinutesPlayed = minutesPlayed;
		FG = fG;
		FGA = fGA;
		ThreeP = threeP;
		ThreePA = threePA;
		FT = fT;
		FTA = fTA;
		ORB = oRB;
		DRB = dRB;
		TRB = tRB;
		AST = aST;
		STL = sTL;
		BLK = bLK;
		TOV = tOV;
		PF = pF;
		PTS = Pts;
		GmSC = gmSC;
		PlusMinus = plusMinus;
	}

	
	public void getPlayerNames(String playerName){
		this.Aa_PlayerName = playerName;
	}
	
//	@XmlElement(name="PlayerName")
	public String getPlayerName() {
		return Aa_PlayerName;
	}
	public void setPlayerName(String playerName) {
		Aa_PlayerName = playerName;
	}
	
	@XmlElement(name="Position")
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	@XmlElement(name="Game_Number")
	public Double getGame_Number() {
		return Game_Number;
	}
	public void setGame_Number(Double game_Number) {
		Game_Number = game_Number;
	}
	
	@XmlElement(name="Game_Date")
	public String getGame_Date() {
		return Game_Date;
	}
	public void setGame_Date(String game_Date) {
		Game_Date = game_Date;
	}
	
	@XmlElement(name="Age")
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	
	@XmlElement(name="TeamName")
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	
	@XmlElement(name="Home_Away")
	public String getHome_Away() {
		return Home_Away;
	}
	public void setHome_Away(String home_Away) {
//		if(home_Away =="@"){
//			Home_Away ="Away";
//		}
//		if (home_Away==""){
//			Home_Away ="Home";
//		}
		Home_Away= home_Away;
		
	}
	
	@XmlElement(name="OppName")
	public String getOppName() {
		return OppName;
	}
	public void setOppName(String oppName) {
		OppName = oppName;
	}
	
	@XmlElement(name="Win_Loss")
	public String getWin_Loss() {
		return Win_Loss;
	}
	public void setWin_Loss(String win_Loss) {
		Win_Loss = win_Loss;
	}
	
	@XmlElement(name="GameStarted")
	public String getGameStarted() {
		return GameStarted;
	}
	public void setGameStarted(String gameStarted) {
		GameStarted = gameStarted;
	}
	
	@XmlElement(name="MinutesPlayed")
	public String getMinutesPlayed() {
		return MinutesPlayed;
	}
	public void setMinutesPlayed(String minutesPlayed) {
		MinutesPlayed = minutesPlayed;
	}
	
	@XmlElement(name="FG")
	public Double getFG() {
		return FG;
	}
	
	public void setFG(Double fG) {
		FG = fG;
	}
	
	@XmlElement(name="FGA")
	public Double getFGA() {
		return FGA;
	}
	public void setFGA(Double fGA) {
		FGA = fGA;
	}
	
	@XmlElement(name="ThreeP")
	public Double getThreeP() {
		return ThreeP;
	}
	public void setThreeP(Double threeP) {
		ThreeP = threeP;
	}
	
	@XmlElement(name="ThreePA")
	public Double getThreePA() {
		return ThreePA;
	}
	public void setThreePA(Double threePA) {
		ThreePA = threePA;
	}
	
	@XmlElement(name="FT")
	public Double getFT() {
		return FT;
	}
	public void setFT(Double fT) {
		FT = fT;
	}
	
	@XmlElement(name="FTA")
	public Double getFTA() {
		return FTA;
	}
	public void setFTA(Double fTA) {
		FTA = fTA;
	}
	
	@XmlElement(name="ORB")
	public Double getORB() {
		return ORB;
	}
	public void setORB(Double oRB) {
		ORB = oRB;
	}
	
	@XmlElement(name="DRB")
	public Double getDRB() {
		return DRB;
	}
	public void setDRB(Double dRB) {
		DRB = dRB;
	}
	
	@XmlElement(name="TRB")
	public Double getTRB() {
		return TRB;
	}
	public void setTRB(Double tRB) {
		TRB = tRB;
	}
	
	@XmlElement(name="AST")
	public Double getAST() {
		return AST;
	}
	public void setAST(Double aST) {
		AST = aST;
	}
	
	@XmlElement(name="STL")
	public Double getSTL() {
		return STL;
	}
	public void setSTL(Double sTL) {
		STL = sTL;
	}
	
	@XmlElement(name="BLK")
	public Double getBLK() {
		return BLK;
	}
	public void setBLK(Double bLK) {
		BLK = bLK;
	}
	
	@XmlElement(name="TOV")
	public Double getTOV() {
		return TOV;
	}
	public void setTOV(Double tOV) {
		TOV = tOV;
	}
	
	@XmlElement(name="PF")
	public Double getPF() {
		return PF;
	}
	public void setPF(Double pF) {
		PF = pF;
	}
	
	@XmlElement(name="PTS")
	public Double getPTS() {
		return PTS;
	}
	public void setPTS(Double pF) {
		PTS = pF;
	}
	
	@XmlElement(name="GmSC")
	public Double getGmSC() {
		return GmSC;
	}
	public void setGmSC(Double gmSC) {
		GmSC = gmSC;
	}
	
	@XmlElement(name="PlusMinus")
	public Double getPlusMinus() {
		return PlusMinus;
	}
	public void setPlusMinus(Double plusMinus) {
		PlusMinus = plusMinus;
	}

	
}
