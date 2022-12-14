package behavioral;

import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
		// YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
		
		people.sort(new Comparator<Person>() {
			public int compare(Person c1, Person c2) {
				return c1.getHeight().compareTo(c2.getHeight());
			}
		});
    }
}
