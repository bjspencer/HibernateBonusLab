package com.hibernatehotel.HibernateBonusLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibernatehotel.HibernateBonusLab.dao.HotelDao;
import com.hibernatehotel.HibernateBonusLab.entity.Hotel;

@Controller
public class HotelsController {

	@Autowired
	HotelDao h;

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("home");
	}

	@RequestMapping("/hotelpage")
	public ModelAndView viewHotels(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("city") String city, @RequestParam("priceByNight") String price) {
		Hotel h1 = new Hotel(id, name, city, price);
		h1 = h.findByCity(city);
		return new ModelAndView("hotelpage");
	}
}
