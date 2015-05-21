import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class LotterySort {
	
	private ArrayList <Integer> pool = new ArrayList<Integer>();
	private List <Integer> sorted;
	private ArrayList<Integer> negative = new ArrayList<Integer>();

	public LotterySort(List <Integer> a){
		sorted = a;
	}
	
	private void sort(){
		for(int a : sorted ){
			if(a >= 0){
				for(int i = 0; i < a; i++){
					pool.add(a);
				}
			}else{
				negative.add(-a);
			}
		}
		
		if(!negative.isEmpty())negative = (ArrayList<Integer>) ( new LotterySort(negative).returnSortedList());
		//Collections.reverse(negative);
		
		sorted.clear();
		
		while(!pool.isEmpty()){
			
			int a = pool.get((int) Math.floor(Math.random()*pool.size()));
			sorted.add(a);
			while(pool.contains(a)){
				pool.remove(pool.indexOf(a));
			}
		}
			
		
		sorted.addAll(negative);
		Collections.reverse(sorted);	
	}
	
	public List <Integer> returnSortedList(){
		sort();
		return sorted;
	}

}
