package task3;

//ファイルStrategyTest.java

public class StrategyTest {
 private static void error() {
     System.out.println("使い方: java StrategyTest [rectまたはcircle] [dotまたはstar]");
     System.exit(1);
 }
 // x座標: x1からx2までxstep刻み
 // y座標: y1からy2までystep刻み の各点について，
 // (x, y)が図形の内側かどうかに従って文字を描画する．
 public static void draw(Shape shape, Plot plot) {
     XYRange r = shape.getRange();
     for (double y = r.y2; y >= r.y1; y -= r.ystep) {
         for (double x = r.x1; x <= r.x2; x += r.xstep) {
             if (shape.inside(x, y)) {
                 plot.plotInside();
             } else {
                 plot.plotOutside();
             }
         }
         plot.nextLine();
     }
 }
 public static void main(String[] args) {
     if (args.length != 2) {
         error();
     }
     Shape shape = new CircleS();
     if (args[0].equals("rect")) {
         shape = new RectS();
     } else if (! args[0].equals("circle")) {
         error();
     }
     Plot plot = new PlotDot();
     if (args[1].equals("star")) {
         plot = new PlotStar();
     } else if (! args[1].equals("dot")) {
         error();
     }
     draw(shape, plot);
 }
}
