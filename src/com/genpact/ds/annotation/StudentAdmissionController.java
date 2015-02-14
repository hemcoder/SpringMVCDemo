package com.genpact.ds.annotation;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.genpact.model.Student;

@Controller
@RequestMapping("/")
public class StudentAdmissionController {
   
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[]{"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy*mm*dd");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName",new CustomStudentName());
	}
	/*@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView model=new ModelAndView("index");
		return model;
	}*/
	
	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	/*@RequestMapping(value="/admissionSuccess",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",defaultValue="Mr. XYZ") String name,@RequestParam("contactNumber") String contact){
		
		Student student=new Student();
		student.setStudentName(name);
		student.setContactNumber(contact);
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("message","Welcome to Ghanta Engineering");
		model.addObject("student", student);
		return model;
	}*/

	@RequestMapping(value="/admissionSuccess",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model=new ModelAndView("AdmissionForm");
			return model;
		}
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("message","Welcome to Ghanta Engineering");
	}
}
