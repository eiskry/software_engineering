package task3;

public class RectS implements Shape {
	// 左下が(2.0, 2.0) で サイズが 5.0 x 3.0 の長方形
	 public boolean inside(double x, double y) {
	     return 2.0 <= x && x <= 7.0 &&
	         2.0 <= y && y <= 5.0;
	 }
	 // 描画範囲は，xが[0.0, 7.0], 0.25刻み．yが[0.0, 6.0]，0.5刻み．
	 public XYRange getRange() {
	     return new XYRange(0.0, 7.0, 0.25,
	                        0.0, 6.0, 0.5);
	 }

}
