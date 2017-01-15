/**
* @author suren
 *
*/
package com.angularrest.webshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.angularrest.webshop.model.CD;

@Service
public class ShopService {
	private List<CD> cDList = new ArrayList<CD>();

	ShopService() {
		cDList.add(new CD(1, "A", 20));
		cDList.add(new CD(2, "B", 20));
	}

	public List<CD> getCDList() {
		return cDList;
	}

	public CD getCD(long id) {
		for (CD cd : cDList) {
			if (cd.getId() == id) {
				return cd;
			}
		}
		return null;
	}

	public void addCD(CD cd) {
		if (!cDList.contains(cd)) 
			cDList.add(cd);
	}

	public void removeCD(long id) {
		for (CD cd : cDList) {
			if (cd.getId() == id)
				cDList.remove(cd);
		}
	}

}
