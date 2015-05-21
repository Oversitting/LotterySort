import java.util.ArrayList;
import java.util.List;


public class LSrun {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i < 200; i++){
			a.add( (int) (Math.pow((int)i*Math.random(), 2)));
		}
		
		a = new LotterySort(a).returnSortedList();
		
		while(!a.isEmpty()){
				System.out.println(a.remove(0));
		}

	}

}
