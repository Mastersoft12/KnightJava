package com.SpringTutorial;

public class BraveKnight implements Knight {

	private Quest quest;	
	
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}


	@Override
	public void embarkOnQuest() {
		this.quest.embark();
	}

}
