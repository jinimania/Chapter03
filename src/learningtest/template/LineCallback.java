package learningtest.template;

/**
 * Created with IntelliJ IDEA.
 * User: 2SsooN
 * Date: 2013. 11. 10.
 * Time: PM 1:05
 * To change this template use File | Settings | File Templates.
 */
public interface LineCallback<T> {
    T doSomethingWithLine(String line, T value);
}
