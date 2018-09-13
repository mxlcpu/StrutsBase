package com.mxlcpu.web.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class PhotoAction extends ActionSupport {
	private File photo;
	private String photoFileName;
	private String photoContentType;
	public String logup() {
		return SUCCESS;
	}
	public String upload() {
		System.out.println(photo);
		String baseDir = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files");
		File bdf = new File(baseDir);
		if (!bdf.exists()) {
			bdf.mkdirs();
		}
		boolean flag = photo.renameTo(new File(bdf , photoFileName));
		if (flag) {
			return SUCCESS;
		}
		addActionError("上传失败");
		return INPUT;
	}
	private InputStream ips;
	
	public InputStream getIps() {
		return ips;
	}
	public void setIps(InputStream ips) {
		this.ips = ips;
	}
	String fileName;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String download() {
		//下载需要动作类提供一个对应文件的流,并提供get/set方法,供struts的一个流处理拦截器stream提供下载功能
		//根据文件名(查数据库)获得对应文件的流
		String baseDir = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files/aaa.jpg");
		fileName = "h哈哈.jpg";
		try {
			ips = new FileInputStream(new File(baseDir));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
}
