package cn.qlq.fileupload;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试struts环境是否搭建成功
 * @author liqiang
 *
 */
public class TestEn extends ActionSupport{
	private String result;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		result="搭建成功!";
		return super.execute();
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
