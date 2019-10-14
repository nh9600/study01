package study01.test13;

public class ListTest01 {
	private String[] strs;//스트링 배열
	
	public ListTest01(){
		this.strs = new String[0];
	}
	public int size() {//숫자니까 인트
		return this.strs.length;
	}
	
	public void add(String str) {//스트링 변수
		String[]tmpStr = this.strs;
		this.strs = new String[strs.length+1];
		this.strs[strs.length-1]=str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i] = tmpStr[i];
		}
		
	}
	
	public static void main(String[]args) {
	ListTest01 lt01 = new ListTest01();
	lt01.add("a");
	lt01.add("b");
	lt01.add("c");
	System.out.println(lt01.strs[0]);
	System.out.println(lt01.strs[0]+","+lt01.strs[1]+","+lt01.strs[2]);
	}

}


