package study01.test13;

public class ListTest03 {
	private String[] strs;
	
	public int indexOf(String str) {
		for(int i=0;i<strs.length;i++) {
			if(str.contentEquals(str[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(String str) {
		int idx = indexOf(str);
		if(idx!=-1) {
			remove(idx);
		}
	}

}
