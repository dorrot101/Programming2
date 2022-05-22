//課題2: グラフのプロット VirtPlotGraph.java
// このひな形を利用し???を適切なコードに修正するか，題意が満たされていれば独自に作成してもよい

public class VirtPlotGraph{

	//Amplitude
	 public static final int Y_MAX = 20;
	 public static final int Y_MIN = - Y_MAX;

	 private static int x = 0;

	 private static char buffer[] = new char[Y_MAX - Y_MIN + 1];
	
	 public static int getX(){
		  return x;
	 }
	 public static void setX(int i){
		  x = i; // thisは使えない
	 } 

	 public static void clear(){
		  for(int y = 0;y < buffer.length;y++) buffer[y] = ' ';
	 }

	 public static void println(){  System.out.println(new String(buffer)); }

	 public void plot(){
		  int y = this.y;
		  if(y < Y_MIN) y = Y_MIN;
		  if(y > Y_MAX) y = Y_MAX;
		  buffer[y - Y_MIN] = symbol;
	 }

	 private char symbol;	
	 private int y = 0;

	 public VirtPlotGraph(char symbol){
		  this.symbol = symbol;
	 }

	 public int getY(){
		  return y;
	 }

	 public void setY(int y){
		  this.y = y;
	 }

	 public void computeY(){ setY(0); }
}
