/**
 * 
 */
package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
public class HiController {

	@RequestMapping("/name")
	public String name(){
		return "11";
	}
}
