package regressionmodel;

import java.util.ArrayList;

public class PierceMechanically {
	
	ArrayList<Double> chirps = new ArrayList<Double>();
	ArrayList<Double> temp = new ArrayList<Double>();
	ArrayList<Double> hypothies = new ArrayList<Double>();

	double tita0,tita1;
	double costFunc=0;
	
	public PierceMechanically() {
		tita0 = 1;
		tita1 = 1;
	}
	
	public void addValues(ArrayList<Double> chirps,ArrayList<Double> temp) {
		this.chirps = chirps;
		this.temp = temp;
	}
	
	public void computeHypothesis(int till) {
		int i=0;
		while (i<till) {
			hypothies.add(tita0 + (tita1 * chirps.get(i)));
		}
	}
	
	public void computeCostFunction() {
		double sumof=0;
		for (int i=0;i<temp.size();i++) {
			sumof = sumof + Math.pow(hypothies.get(i)-temp.get(i), 2);
		}
		costFunc = 1/(2*temp.size()) * sumof;
	}
	
	public boolean checkFor() {
		if(costFunc <= 0.10) {
			tita0 = newTitas(tita0);
			tita1 = newTitas(tita1);
			return true;
		}
		else
			return false;
	}
	
	public double newTitas(double titals) {
		titals = titals - 0.1 * (costFunc/titals);
		return titals;
	}
	
	public void OutputTitas() {
		System.out.println("Tita 0 +"+tita0+" Tita 1 "+tita1);
	}
	
	
	

}
