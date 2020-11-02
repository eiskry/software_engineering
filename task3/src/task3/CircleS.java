package task3;

public class  CircleS implements Shape{
	// 中心(0.0, 0.0)，半径 3.0 の円を描く．
    public boolean inside(double x, double y) {
        return -Math.sqrt(9-y*y) <= x && x <= Math.sqrt(9-y*y) &&
            -3.0 <= y && y <= 3.0;
    }
    
    // 描画範囲は，x が[-5.0, 5.0], 0.25刻み． yが[-5.0, 5.0], 0.5刻み．
    public XYRange getRange() {
        return new XYRange(-5.0, 5.0, 0.25,
                           -5.0, 5.0, 0.5);
    }
}