package task3;

public interface Shape {
    // 抽象メソッド inside(x, y)
    // (x, y)が図形の内側ならtrueを，そうでなければfalseを返すものとする．
    // ちょうど境界線上は内側とみなす約束とする．
    abstract public boolean inside(double x, double y); 

    // 抽象メソッド getRange()
    // xの動く範囲[x1, x2]と動く間隔xstep
    // yの動く範囲[y1, y2]と動く間隔ystep の6つの数の組を返す．
    abstract public XYRange getRange();
}