package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case stared");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case success");
		
		}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case failed");
		
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case skipped");
		
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case failed due to per");
		
		}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+" test case failed due to timeout");
		
	}

	@Override
	public void onStart(ITestContext result) {
		String testname=result.getName();
		System.out.println(testname+" on start");
		
	}

	@Override
	public void onFinish(ITestContext result) {
		
		String testname=result.getName();
		System.out.println(testname+" on finish");
		
	}

}
