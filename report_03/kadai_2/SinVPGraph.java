//課題2: グラフのプロット SinVPGraph.java
// このひな形を利用し???を適切なコードに修正するか，題意が満たされていれば独自に作成してもよい

public class SinVPGraph extends VirtPlotGraph{
	 
	 protected int cycle;
	 
	 public SinVPGraph(char symbol, int cycle){
		  super(symbol);
		  this.cycle = cycle;
	 }
	 
	 public int getCycle(){
		  return cycle;
	 }

	 public void setCycle(int cycle){
		  this.cycle = cycle;
	 }

	 // rcos^2 + rsin^2 = r^2
	 @Override 
	 public void computeY(){
		int tx = getX();
		int range = VirtPlotGraph.Y_MAX;
		double quarter = (double)cycle / 4;
		double radian = Math.toRadians(360 * tx/cycle);
		double temp_sinX = Math.sqrt(1 - Math.cos(radian)*Math.cos(radian));
		int sinX = (int) (range * temp_sinX);
		double quadrant = Math.floor(tx/quarter);
		if(quadrant == 0 || quadrant == 1) {
			setY(sinX);
		} else setY(-sinX);
	 }
}
