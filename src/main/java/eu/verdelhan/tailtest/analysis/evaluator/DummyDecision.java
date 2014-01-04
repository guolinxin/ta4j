package eu.verdelhan.tailtest.analysis.evaluator;

import java.util.LinkedList;
import java.util.List;

import eu.verdelhan.tailtest.TimeSeriesSlicer;
import eu.verdelhan.tailtest.Trade;

public class DummyDecision extends Decision {

	private double value;

	public DummyDecision(double value, TimeSeriesSlicer slicer) {
		super(null, slicer,0, null, new LinkedList<Trade>(), null);
		this.value = value;
	}

	public DummyDecision(List<Trade> trades, TimeSeriesSlicer slicer) {
		super(null, slicer,0, null, trades, null);
	}

	@Override
	public double evaluateCriterion() {
		return this.value;
	}

}