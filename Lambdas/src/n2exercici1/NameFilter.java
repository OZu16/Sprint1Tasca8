package n2exercici1;

import java.util.List;

@FunctionalInterface
public interface NameFilter {
	
	List<String> filterList(List<String> n);

}