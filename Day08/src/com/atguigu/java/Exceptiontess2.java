package com.atguigu.java;
/*
 * 异常处理的方式二：throws + 异常类型
 * 1.写在方法的声明处，指明方法声明时可能会抛出的异常类型。
 * 一旦方法执行时，出现异常，仍会在异常代码处生成异常对象，
 * 此对象满足throws后异常类型时，就会被抛出，出现异常，在异常后面的代码就不再zhixingle
 * 2.在调用该方法的时候也会编译错误，除非又使用向上抛的方法。
 * 3.在最顶层的方法中应该用try-catch-finally来捕获异常，将异常延迟到运行中。
 * 体会: try-catch-finally: 真正的将异常给处理了
 * 		throws的方式只是将异常抛给了调用者，相当于帅锅
 * 如何选择用throws还是try-catch-finally?
 * 1.如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws,
 * 如果子类重写的方法中有异常，必须使用try-catch-finally方式处理。
 * 2.执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的，
 * 建议这几个方法使用throw的方式进行处理，
 * 而执行的方法a可以使用try-catch-finally方式进行处理。
 */
public class Exceptiontess2 {

}
