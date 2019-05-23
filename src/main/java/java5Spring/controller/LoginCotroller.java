package java5Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java5Spring.entities.Nhanvien;
import java5Spring.service.NhanvienService;
import java5Spring.service.QuyenService;
@Controller
public class LoginCotroller {
	@Autowired
	private QuyenService quyenService;
	@Autowired
	private NhanvienService nhanvienService;

	@RequestMapping(value = "/login")
	public String login(ModelMap model) {
		Nhanvien nhanvien = new Nhanvien();
		model.put("nhanvien", nhanvien);

		return "login";

	}

	@RequestMapping("/dologin")
	public String diLogin(@Validated Nhanvien nhanvien, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "login";
		}

		boolean userExits = nhanvienService.checklogin(nhanvien.getUserName(), nhanvien.getPassWord());
		if (userExits) {
			model.put("nhanvien", nhanvien);
			return "index";
		} else {
			// result.rejectValue("username", "invalid");
			return "login";
		}
	}

}
