package regressionmodel;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> chrips = new ArrayList<Double>();
		ArrayList<Double> temp = new ArrayList<Double>();
		
		PierceMechanically pm = new PierceMechanically();
		
		chrips.add(20.0);
		chrips.add(16.0);
		chrips.add(19.8);
		chrips.add(18.4);
		chrips.add(17.1);
		chrips.add(15.5);
		chrips.add(14.7);
		chrips.add(15.7);
		chrips.add(15.4);
		chrips.add(16.3);
		chrips.add(15.0);
		chrips.add(17.2);
		chrips.add(16.0);
		chrips.add(17.0);
		chrips.add(14.4);
		
		temp.add(88.6);
		temp.add(71.6);
		temp.add(93.3);
		temp.add(84.3);
		temp.add(80.6);
		temp.add(75.2);
		temp.add(69.7);
		temp.add(71.6);
		temp.add(69.4);
		temp.add(83.3);
		temp.add(79.6);
		temp.add(82.6);
		temp.add(80.6);
		temp.add(83.5);
		temp.add(76.3);
		
		pm.addValues(chrips, temp);
		
		do {
			pm.computeHypothesis(temp.size());
			pm.computeCostFunction();	
			pm.OutputTitas();
		} while(pm.checkFor()==true);
		
		pm.OutputTitas();
				
		
	}

}
