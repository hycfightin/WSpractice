/**
 * 
 */
package usewebservice;

import cxf.wsinterfaceImpl;

/**
 * @Description:TODO
 * @author: hyc
 * @date:   2018��6��20�� ����3:36:45
 */
public class wsclient {
	public static void main(String args[]) {
		WsinterfaceImpl aa = new WsinterfaceImplService().getWsinterfaceImplPort();
		String fuck = aa.wstest("asdasdasd");
	    System.out.println("shinime "+fuck);
	}

}
