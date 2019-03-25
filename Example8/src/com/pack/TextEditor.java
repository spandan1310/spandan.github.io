package com.pack;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TextEditor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextEditor(SpellChecker spellChecker, String name) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void test(){
		spellChecker.checkSpelling();
		
	}
}
