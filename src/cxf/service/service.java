/**
 * 
 */
package cxf.service;

import javax.xml.ws.Endpoint;

import cxf.wsinterface;
import cxf.wsinterfaceImpl;

/**
 * @Description:TODO
 * @author: hyc
 * @date:   2018��6��20�� ����2:16:20
 */
public class service {
    public static void main (String args[]) {
    	System.out.println("��ʼwebservice");
    	wsinterface ws = new wsinterfaceImpl();
    	String address = "http://100.5.8.52:8080/hello";    
        Endpoint.publish(address, ws);  // JDKʵ��  
         System.out.println("����������");  
    }
}
