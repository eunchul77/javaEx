package com.kh.object3;

import java.util.Random;

public class NonStaticSample {
	
	public NonStaticSample() {
		
	}

	public void printLottoNumbers() {
		int i = 0;
		int j = 0;
		int rotto = 0;
		while(true) {
			j = rotto;
			rotto = (int)((Math.random()*5)+1);
			System.out.print(rotto);
			
			// 이상함
			if(rotto!=j) {
				i ++;
			} else {
				rotto = (int)((Math.random()*5)+1);
				System.out.print(rotto);
				continue;
			}
			
			if(i!=6) {
				System.out.print(",");
			} else {
				break;
			}
		}
		
		
	}
	
	public void outputChar(int num, char c) {
		
	}
	
	public char alphabette(char ch1 ) {
		return 'A';
	}
	
	public String mySubstring(String str, int index, int index2) {
		return null;
	}

}

