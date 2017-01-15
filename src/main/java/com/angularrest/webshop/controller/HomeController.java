/**
* @author suren
 *
*/
package com.angularrest.webshop.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.angularrest.webshop.model.CD;
import com.angularrest.webshop.service.ShopService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/shop/cd/{id}", method = RequestMethod.GET)
	@ResponseBody
	public CD getCD(@PathVariable long id) {
		logger.info("Welcome home! CD has been returned");
		CD cd = shopService.getCD(id);
		System.out.println(cd);
		return cd;
	}

	@RequestMapping(value = "/shop/cd1/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCD(@PathVariable long id) {
		logger.info("Welcome home! CD has been removed");
		 System.out.println(id);
		shopService.removeCD(id);
	}

	@RequestMapping(value = "/shop/cd", method = RequestMethod.POST)
	@ResponseBody
	public CD addCD(@RequestBody CD cd) {
		logger.info("Welcome home! CD has been added");
		shopService.addCD(cd);
		return cd;
	}

	@RequestMapping(value = "/shop/cds", method = RequestMethod.GET)
	@ResponseBody
	public Collection<CD> getCDList() {
		logger.info("Welcome home! CDlist has been returned");
		return shopService.getCDList();
	}

}
