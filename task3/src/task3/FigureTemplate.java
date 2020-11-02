package task3;
public abstract class FigureTemplate {
    // 抽象メソッド inside(x, y)
    // (x, y)が図形の内側ならtrueを，そうでなければfalseを返すものとする．
    // ちょうど境界線上は内側とみなす約束とする．
    abstract protected boolean inside(double x, double y); 

    // 抽象メソッド getRange()
    // xの動く範囲[x1, x2]と動く間隔xstep
    // yの動く範囲[y1, y2]と動く間隔ystep の6つの数の組を返す．
    abstract protected XYRange getRange();

    // 抽象メソッド plotInside()
    // 図形の内側を表す文字を描く．画面上のx座標を１つ右へ動かす．
    abstract protected void plotInside();

    // 抽象メソッド plotOutside()
    // 図形の外側を表す文字を描く．画面上のx座標を１つ右へ動かす．
    abstract protected void plotOutside();

    // 抽象メソッド nextLine()
    // 画面上のy座標を１つ下へ動かし，x座標を左端にリセットする．
    abstract protected void nextLine();

   // テンプレートメソッド draw()
    // x座標: x1からx2までxstep刻み
    // y座標: y1からy2までystep刻み の各点について，
    // (x, y)が図形の内側かどうかに従って文字を描画する．
    public final void draw() {
        XYRange r = getRange();
        for (double y = r.y2; y >= r.y1; y -= r.ystep) {
            for (double x = r.x1; x <= r.x2; x += r.xstep) {
                if (inside(x, y)) {
                    plotInside();
                } else {
                    plotOutside();
                }
            }
            nextLine();
        }
    }
}