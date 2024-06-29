package com.example.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repostory.StudentRepo;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class MainService {
	
	@Autowired
	private StudentRepo repo;
	
	public ResponseEntity<Student> addData(Student data){
		repo.save(data);
		return ResponseEntity.ok(data);
	}

	public String pdfGenarate() throws JRException {
		String filePath= "C:\\Users\\Admin\\maveen-workplace\\Student_Login\\src\\main\\resources\\jasper\\Blank_A4.jrxml";
		   
		List<Student> list = repo.findAll();
		JRBeanCollectionDataSource data= new JRBeanCollectionDataSource(list);
		
		Map<String,Object> map = new HashMap<>();
	    map.put("firstName","Nithese");
	    map.put("lastName","Kanna");
	    map.put("age",22);
	    map.put("dob","29-jul-2001");
	    map.put("Dataset1", data);
	    
	    JasperReport report=JasperCompileManager.compileReport(filePath);
	    JasperPrint print = JasperFillManager.fillReport(report, map, new JREmptyDataSource());
	    JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\Admin\\maveen-workplace\\Student_Login\\src\\main\\resources\\jasper\\Blank_A4.pdf");
	    return "done";
	}

	public List<Student> getData() {
		List<Student> list =repo.findAll();
		return list;
	}

}
