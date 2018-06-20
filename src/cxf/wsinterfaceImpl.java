/**
 * 
 */
package cxf;

import javax.jws.WebService;

/**
 * @Description:TODO
 * @author: hyc
 * @date:   2018年6月20日 下午2:14:41
 */
@WebService
public class wsinterfaceImpl implements wsinterface{

	/* (non-Javadoc)
	 * @see cxf.wsinterface#wstest(java.lang.String)
	 */
	@Override
	public String wstest(String aaa) {
		// TODO Auto-generated method stub
		System.out.println("调用webservice" + aaa);
		return aaa;
	}
    
}
