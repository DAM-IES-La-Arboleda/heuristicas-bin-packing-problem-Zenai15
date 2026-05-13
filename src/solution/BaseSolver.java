package solution;

import core.BinPackingSolver;
import java.util.*;

public class BaseSolver implements BinPackingSolver {
	@Override
	public List<List<Double>> solve(double capacity, List<Double> weights) {
		
		/*
		List<List<Double>> bins = new ArrayList<>();
		
		for (double weight: weights) {
			bins.add(List.of(weight));
		}
		return bins;
		*/
		
		
		List<List<Double>> bins = new ArrayList<>();
		List<Double> sortedWeights = weights;
		
		List<Double> contenedor = new ArrayList<>();
		Double currentCapacity = capacity;

		while (!sortedWeights.isEmpty()) {
			contenedor = new ArrayList<>();
			currentCapacity = capacity;
			
			for (int w = 0; w < sortedWeights.size(); w++) {
				if (sortedWeights.get(w) <= currentCapacity) {
					contenedor.add(sortedWeights.get(w));
					currentCapacity -= sortedWeights.get(w);
					sortedWeights.remove(sortedWeights.get(w));
				} else {
					
				}
			}
			
			bins.add(contenedor);
		}
		
		return bins;
		
	}
}