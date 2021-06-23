package utils;


import org.testng.IAnnotationTransformer;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Parameters;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTransformation implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method)
    {
        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);

    }
    public void onTestStart(ITestResult result) {

        System.out.println("New Test Started" +result.getName());

    }

    public void onTestSuccess(ITestResult result) {

        System.out.println("Test Successfully Finished" +result.getName());

    }

    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed" +result.getName());

    }

    public void onTestSkipped(ITestResult result) {

        System.out.println("Test Skipped" +result.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        System.out.println("Test Failed but within success percentage" +result.getName());

    }

    public void onStart(ITestContext context) {


        System.out.println("This is onStart method" +context.getOutputDirectory());

    }

    public void onFinish(ITestContext context) {

        System.out.println("This is onFinish method" +context.getPassedTests());
        System.out.println("This is onFinish method" +context.getFailedTests());
    }
}









