package org.sayan.home;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloWorldTask extends DefaultTask{
	
	@TaskAction
	public void helloWorld() {
		System.out.println("Hello World");
	}

}
