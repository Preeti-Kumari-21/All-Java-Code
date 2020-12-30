package com.in28minutes.spring.basics.springin5minutes.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class XmlPersonDAO {
	
	XmlJdbcConnection xmlJdbcConnection;
	@Autowired
	XmlORMConnection xmlORMConnection;

	public XmlORMConnection getXmlORMConnection() {
		return xmlORMConnection;
	}

	public void setXmlORMConnection(XmlORMConnection xmlORMConnection) {
		this.xmlORMConnection = xmlORMConnection;
	}

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}
	
	

}
