package com.hcl.primerandamize;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class producer {
	public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static BlockingQueue<Integer> random() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int increment = 0;
		try {
			while (increment != 10) {
				queue.put(random.nextInt(1000));

				increment++;
			}

		} catch (Exception e) {
			e.getMessage();
		}
		return queue;

	}

}
