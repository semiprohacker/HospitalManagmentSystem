package ComparatorAndComparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


//comparable sorts by age
//patientNameComparator defined by lambda
//patientIdComparator by implementing comparator
public class PatientSet {
	
	public static void main(String[] args) {
		
		Comparator <Patient> patientNameComparator=(p1,p2)->{
			
				return p1.getName().compareTo(p2.getName());
		};
		
		Set<Patient> set = new TreeSet<>(new patientIdComparator());
		
		set.add(new Patient(1,40,"Jaishree"));
		set.add(new Patient(2,55,"Maisie"));
		set.add(new Patient(3,30,"KrihsnaReddy"));
		
		System.out.println(set);
		
	}

}
