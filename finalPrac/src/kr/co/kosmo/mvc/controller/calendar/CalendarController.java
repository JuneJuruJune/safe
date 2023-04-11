package kr.co.kosmo.mvc.controller.calendar;

import java.util.List;

import javax.servlet.http.HttpServletRequest;import javax.xml.ws.Service.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.vo.BookVO;
import kr.co.kosmo.mvc.vo.LocalVO;

@Controller
@RequestMapping(value = "/calendar")
public class CalendarController {
	@Autowired
	private CalendarService calenService;
	
	@RequestMapping(value = "/calendarList")
	public ModelAndView getCalendar(ModelAndView mav, HttpServletRequest request) {
		List<BookVO> calendar = null;
		try {
			calendar = calenService.getCalendar();
			request.setAttribute("calendarList", calendar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.setViewName("calendar/calendar");
		return mav;
	}
	
	@RequestMapping(value = "/calTotal")
	public ModelAndView calendarTotal(ModelAndView mav, HttpServletRequest request) {
		List<LocalVO> caltotal = null;
		try {
			caltotal = calenService.calendarTotal();
			request.setAttribute("caltotal", caltotal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.setViewName("calendar/calendar");
		return mav;
	}
	
	@GetMapping(value = "/popup")
	public ModelAndView localtrip() {
		ModelAndView mav = new ModelAndView("calendar/popup");
		return mav;
	}
	


}
