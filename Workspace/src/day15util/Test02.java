package day15util;

import java.text.SimpleDateFormat;

public class Test02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY 'years' MM 'months' dd 'days' hh:mm:ss");
		String result = sdf.format(System.currentTimeMillis());
		System.out.println(result);
	}
}
