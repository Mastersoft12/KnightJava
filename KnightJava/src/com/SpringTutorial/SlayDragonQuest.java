package com.SpringTutorial;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;	
	
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}


	@Override
	public void embark() {
		stream.println("Iniciando la busqueda del dragon...");
		
	}

}