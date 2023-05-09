package ComparatorAndComparable;

import java.util.Comparator;

public class patientIdComparator implements Comparator<Patient>{

	@Override
	public int compare(Patient p1, Patient p2) {

		return ((Integer)p1.getId()).compareTo((Integer)p2.getId());
	}

}
