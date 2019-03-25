package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	
	private SpellChecker spellChecker;
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
		System.out.println("Iside text editor constructor");
	}

	public void test(){
		spellChecker.checkSpelling();
		
	}
}
