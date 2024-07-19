package com.APIsAnnotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class LaunchStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,4,7,2,5);
		Stream<Integer> streamData =list.stream();
//		long count = streamData.count();
//		System.out.println(count);
//		Stream <Integer> sortedStream = streamData.sorted();
//		sortedStream.forEach(n->System.out.println(n));	
//		Stream<Integer>mapStream = sortedStream.map(n-> n*2);
		
//		Stream<Integer> filData = streamData.filter(n-> n%2==0);
//		filData.forEach(n->System.out.println(n));
		
//		or in method chaining
		Stream<Integer> finalStream = streamData.filter(n-> n%2==0).sorted().map(n-> n*2);
		finalStream.forEach(n->System.out.println(n));
		
		//can't reconsume  a stream i.e. we can use a strem for a single time for
		//any operation otherwise it will throw IllegalStateException
		
//		streamData.forEach(n->System.out.println(n));
	}
}
