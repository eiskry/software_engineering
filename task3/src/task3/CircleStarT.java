package task3;

public class CircleStarT extends FigureTemplate {
	// 中心(0.0, 0.0)，半径 3.0 の円を描く．
    protected boolean inside(double x, double y) {
        return -Math.sqrt(9-y*y) <= x && x <= Math.sqrt(9-y*y) &&
            -3.0 <= y && y <= 3.0;
    }
    
    // 描画範囲は，x が[-5.0, 5.0], 0.25刻み． yが[-5.0, 5.0], 0.5刻み．
    protected XYRange getRange() {
        return new XYRange(-5.0, 5.0, 0.25,
                           -5.0, 5.0, 0.5);
    }
    // 内側なら"*", 外側なら" "
    protected void plotInside() { System.out.print("★"); }
    protected void plotOutside() { System.out.print(" "); }
    protected void nextLine() { 
    	System.out.println();
    	System.out.println();
    	}

    public static void main(String[] args) {
        (new CircleStarT()).draw();
    }
}