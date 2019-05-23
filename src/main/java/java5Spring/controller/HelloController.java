package java5Spring.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java5Spring.dao.NhanvienDAO;
import java5Spring.entities.Nhanvien;
import java5Spring.service.NhanvienService;
import java5Spring.service.QuyenService;

@Controller
public class HelloController {

	@Autowired
	private QuyenService quyenService;
	@Autowired
	private NhanvienService nhanvienService;

	@RequestMapping(value = { "/", "/index" })
	public String index() {

		return "login";
	}

	@RequestMapping("/listquyen")
	public String listquyen(Model model) {
		model.addAttribute("listquyen", quyenService.listQuyen());

		return "listquyen";
	}

	@RequestMapping("/listnhanvien")
	public String listnhanvien(Model model) {
		model.addAttribute("listnhanvien", nhanvienService.listnhanvien());

		return "listnhanvien";
	}

	@RequestMapping("/savenhanvien")
	public String insertNhanvien(Model model) {
		model.addAttribute("nhanvien", new Nhanvien());
		System.out.println("hello");
		return "savenhanvien";

	}

	@RequestMapping("/savenv")
	public String dosaveNhanvien(@ModelAttribute("Nhanvien") Nhanvien nhanvien, Model model) {
		nhanvienService.saveNhanvien(nhanvien);
		model.addAttribute("listnhanvien", nhanvienService.listnhanvien());

		return "listnhanvien";
	}

	@RequestMapping("/deletenhanvien/{id}")
	public String deleteNhanvien(@PathVariable String id, Model model) {
		Nhanvien nhanvien = this.nhanvienService.findNhanvien(id);
		if (!Objects.isNull(nhanvien)) {
			this.nhanvienService.deleteNhanvien(nhanvien);
			model.addAttribute("listnhanvien", nhanvienService.listnhanvien());
			return "redirect:/listnhanvien";
		}

		return "listnhanvien";

	}

	@RequestMapping("/updatenhanvien/{id}")
	public String updatenhanvien(@PathVariable String id, Model model) {
		Nhanvien nhanvien = this.nhanvienService.findNhanvien(id);
		model.addAttribute("nhanvien", nhanvien);
		return "updatenhanvien";

	}

	@RequestMapping(value = "/updatenv")
	public String doupdatenhanvien(@ModelAttribute("Nhanvien") Nhanvien nhanvien, Model model) {
		System.out.println("hello 2");
		this.nhanvienService.updateNhanvien(nhanvien);
		model.addAttribute("listnhanvien", nhanvienService.listnhanvien());
		return "listnhanvien";
	}

}