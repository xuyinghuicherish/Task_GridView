package cn.edu.bzu.module;

/**
 * 实现GridView item的实体类
 * @author monster
 */
public class Function {
	private int ImgId;
	private String Text;
	
	public Function() {
		super();
	}
	public Function(int imgId, String text) {
		super();
		ImgId = imgId;
		Text = text;
	}
	public int getImgId() {
		return ImgId;
	}
	public void setImgId(int imgId) {
		ImgId = imgId;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	
}
