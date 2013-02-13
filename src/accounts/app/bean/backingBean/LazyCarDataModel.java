package accounts.app.bean.backingBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

/**
 * Dummy implementation of LazyDataModel that uses a list to mimic a real datasource like a database.
 */
public class LazyCarDataModel extends LazyDataModel<StakeHolder> {

	private List<StakeHolder> datasource;

	public LazyCarDataModel(List<StakeHolder> datasource) {
		this.datasource = datasource;
	}

	@Override
	public StakeHolder getRowData(String rowKey) {
		for(StakeHolder stkhold : datasource) {
			if(String.valueOf(stkhold.getId()).equals(rowKey))
				return stkhold;
		}

		return null;
	}

	@Override
	public Object getRowKey(StakeHolder stkHold) {
		return stkHold.getId();
	}

	@Override
	public List<StakeHolder> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,String> filters) {
		List<StakeHolder> data = new ArrayList<StakeHolder>();

		//filter
		for(StakeHolder stkHold : datasource) {
			boolean match = true;

			for(Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
				try {
					String filterProperty = it.next();
					String filterValue = filters.get(filterProperty);
					String fieldValue = String.valueOf(stkHold.getClass().getField(filterProperty).get(stkHold));

					if(filterValue == null || fieldValue.startsWith(filterValue)) {
						match = true;
					}
					else {
						match = false;
						break;
					}
				} catch(Exception e) {
					match = false;
				} 
			}

			if(match) {
				data.add(stkHold);
			}
		}

		//sort
		if(sortField != null) {
			//			Collections.sort(data, new LazySorter(sortField, sortOrder));
		}

		//rowCount
		int dataSize = data.size();
		this.setRowCount(dataSize);

		//paginate
		if(dataSize > pageSize) {
			try {
				return data.subList(first, first + pageSize);
			}
			catch(IndexOutOfBoundsException e) {
				return data.subList(first, first + (dataSize % pageSize));
			}
		}
		else {
			return data;
		}
	}
}
