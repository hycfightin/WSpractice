/**
 * 
 */
package cxf;

import javax.jws.WebService;

/**
 * @Description:TODO
 * @author: hyc
 * @date:   2018��6��20�� ����2:14:41
 */
@WebService
public class wsinterfaceImpl implements wsinterface{

	/* (non-Javadoc)
	 * @see cxf.wsinterface#wstest(java.lang.String)
	 */
	@Override
	public String wstest(String aaa) {
		// TODO Auto-generated method stub
		System.out.println("����webservice" + aaa);
		return aaa;
	}
    
}
