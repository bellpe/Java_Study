package Ex06_다형성_실습;

public class English extends Language {
	public String gerTitleMSG() {
		return "===Welcome VendingMachine===";
	}
	public String getInputMSG() {
		return "Inset coin please >> ";
	}
	public String getChoiceMSG() {
		return "Choose your menu";
	}
	public String getMenuMSG() {
		return "1.water(700) 2.coke(1000) 3.coffee(500) >>";
	}
	public String getNoMoneyMSG() {
		return "No money";
	}
	public String getChangeMoneyMSG(int money) {
		return money + "won left";
	}

}
