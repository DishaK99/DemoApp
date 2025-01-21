package com.listener;

import org.testng.IExecutionListener;

public class ExecutionList implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		System.out.println("started");
		}

	@Override
	public void onExecutionFinish() {
		System.out.println("Finished");
		}

}
