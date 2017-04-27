package com.hcl.primerandamize;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class consumer {

	private BlockingQueue<Integer> queue = producer.random();

	public BlockingQueue<properties> queue1 = new ArrayBlockingQueue<>(queue.size());

	public BlockingQueue<properties> prime_numbers() {
		// TODO Auto-generated method stub
		boolean find = true;
		try {

			Iterator<Integer> it = queue.iterator();

			while (it.hasNext()) {
				Integer Next_Element = it.next();
				find = true;
				int F_number = Next_Element;
				int z = Next_Element;
				for (int i = F_number - 1; i > 1; i--) {
					// System.out.println(F_number);

					if (z % i == 0) {
						find = false;
					}
				}
				if (find == true) {
					queue1.add(new properties(Next_Element, find));
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queue1;
	}

}
