package task3;

public class PlotDot extends  StrategyTest{
	// 内側なら"*", 外側なら" "
	 protected void plotInside() { System.out.print("*"); }
	 protected void plotOutside() { System.out.print(" "); }
	 protected void nextLine() { System.out.println(); }

}
