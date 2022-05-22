//課題2: グラフのプロット SawToothVPGraph
// このひな形を利用し???を適切なコードに修正するか，題意が満たされていれば独自に作成してもよい

public class SawToothVPGraph extends SinVPGraph{
	 
	 public SawToothVPGraph(char symbol, int cycle){
		  super(symbol, cycle);
	 }
	 // y = kx ((cycle/2)*n < x <= (cycle/2)*n) (n = 整数、k = range/(cycle/2)
	 @Override public void computeY(){
		 int tx = getX();
		 double range = (double)VirtPlotGraph.Y_MAX;
		 double inclination =  2*range/cycle;
		 int tempx = (int) (inclination * tx);
		 if(tx < cycle/2) setY(tempx);
		 else setY(tempx - 2*Y_MAX);
	 }
}
