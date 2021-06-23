package utils;

import org.testng.ITest;
import org.testng.annotations.Parameters;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public interface IAnnotationTransformer {
    public void transform(ITest annotation, Class testClass,
                          Constructor testConstructor, Method testMethod);


}
