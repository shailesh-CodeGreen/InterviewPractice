package StringPRO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class rev {
	
	
	
	public static void main(String[] args) {
		
	List <Integer> list = new ArrayList <>();
	
	
	list.add(19);
	
	list.add(7);
	list.add(12);
	list.add(30);
	
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
	Object[] arr= list.toArray();
	//System.out.println(arr.toString());
for (int i = 0; i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}System.out.println();
	for(Object i:list) {
		
		System.out.print(i+" ");
		
	}         List a =list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(a);
	
	}}