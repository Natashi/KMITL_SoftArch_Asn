package structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
	private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();
	
	public void service() {
		for (HealthcareServiceable iMember : members)
			iMember.service();
	}
	public double getPrice() {
		double sum = 0;
		for (HealthcareServiceable iMember : members)
			sum += iMember.getPrice();
		return sum;
	}
	
	public void addMember(HealthcareServiceable worker) {
		members.add(worker);
	}
	public void removeMember(HealthcareServiceable worker) {
		members.remove(worker);
	}
}
