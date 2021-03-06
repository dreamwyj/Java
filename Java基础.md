 

## 1.学习编程的方法

·写博客，多总结

·多敲代码，多应用

思维方式

1. “大处着眼，小处着手”。 （框架的合作和竞争关系，学习内容的主次把握，对细节的把握）
2. “逆向思维，反证法”。 （理解，感受）
3. “透过问题看本质” 
4. 英文注重

## 2.Java编程环境的配置

1.官网上下载jdk

[j d k](https://www.oracle.com/java/technologies/javase-downloads.html)

2.打开终端，输入：

```shell
/usr/libexexc/java_home -V
```

查询jdk所在的路径，为之后提供使用

![截屏2020-12-24 下午9.22.06](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.22.06-1484259.png)

3.在2中所在的路径下打开终端

```shell
cd +（你的路径）
```

如：

```shell
cd /Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home
```

4.在终端下创建配置文件

```shell
sudo -i vi /etc/.bash_profile
```

输入密码

![截屏2020-12-24 下午9.41.35](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.41.35-1798827.png)

弹出一个空白框，键入 i

```shell
JAVA_HOME=Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home
# 这里填入自己2中的路径

CLASSPAHT=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

PATH=$JAVA_HOME/bin:$PATH:

export JAVA_HOME

export CLASSPATH

export PATH
```

完成后按esc键退出编辑，再输入

```shell
:wq
```

保存刚刚的操作

5.这时终端自动退到原来界面，此时输入

```shell
source /etc/.bash_profile
```

 并回车，使配置生效

6.终端输入java和javac会反馈一些信息

![截屏2020-12-24 下午9.54.46](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.54.46-1484267.png)

类似这样![截屏2020-12-24 下午9.56.14](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.56.14-1484271.png)

这说明配置成功

7.接下来验证

1.打开自带的文本编辑器，若不知道如何打开[Mac文本编辑器](https://jingyan.baidu.com/article/9158e0002ebe98a25412288c.html)

2.打开自带文本编辑器后，输入Java的代码案例

这里使用

```java
public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```

然后，保存 **文件名一定要与你与你第一行代码class之后的代码相同。**

我这里的文件名就是 HelloWorld.java

将这个文件拖到Mac的终端，终端会显示这个文件的路径。如图

![截屏2020-12-24 下午10.30.11](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%8810.30.11-1484275.png)

3.知道路径后，进入到文件路径下如图

输入以下命令，返回运行结果。证明配置成功，可以进一步接下来的学习啦！

```sh
cd /Users/wyj/Java   # cd +(your path)
```

```java
java HelloWorld.java //java +(your filename)
```

![截屏2020-12-24 下午10.37.24](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%8810.37.24-1484293.png)

# 第零章：Eclipse中的快捷键

 \* 1.补全代码的声明：option + /

 \* 2.快速修复: 	Command + 1

 \* 3.批量导包：	Command + shift + O

 \* 4.使用单行注释：Command + /

 \* 5.使用多行注释： 

 \* 6.取消多行注释：  

 \* 7.复制指定行的代码：Command + option + down 或 Command + option + up

 \* 8.删除指定行的代码：Command + d

 \* 9.上下移动代码：	option + up 或 option + down

 \* 10.切换到下一行代码空位：shift + enter

 \* 11.切换到上一行代码空位：Command + shift + enter

 \* 12.如何查看源码：  	Command + 指定结构 或 Command + shift + t

 \* 13.退回到前一个编辑的页面：Command + shift + left

 \* 14.进入到下一个编辑的页面(针对于上面那条来说的)：Command + shift +right

 \* 15.光标选中指定的类，查看继承树结构：Command + t

 \* 16.复制代码： Command + c

 \* 17.撤销：		Command + z

 \* 18.反撤销： 	Command + y

 \* 19.剪切： 		Command + x

 \* 20.粘贴：		Command + v

 \* 21.保存： 		Command + s

 \* 22.全选：		Command + a

 \* 23.格式化代码： Command + shift +f

 \* 24.选中数行，整体往后移动： tab

 \* 25.选中数行，整体往前移动：	shift + tab

 \* 26.在当前类中，显示类结构，并支持搜索指定的方法、属性等：Command + o

 \* 27.批量修改指定的变量名、方法名、类名等： option + command + R 或 

 \* 28.选中的结构的大小写的切换：变成大写：  Command + shift + x

 \* 29.选中的结构的大小写的切换：变成小写：		Command + shift +y	

 \* 30.调出生成getter/setter/构造器等结构： option + Command + s

 \* 31.显示当前选择资源(工程 or 文件)的属性： option + enter

 \* 32.快速查找：参照选中的Word快速定位到下一个: command + k

 \* 

 \* 33.关闭当前窗口：command + w

 \* 34.关闭所有的窗口：command + shift + w

 \* 35.查看指定的结构使用过的地方：command + option + g

 \* 36.查找与替换：	Command + f

 \* 37.最大化当前的View：Control + m

# 第一章：认识Java

## JRE(Java Runtime Environment)

Java实时运行环境：Java程序被编译后会生成一个字节码文件，该文件必须借助JRE才能在各大操作系统和计算机平台上运行，JRE相当于各大操作系统和Java应用程序之间的一个虚拟层，是Java字节码文件的运行平台。

## JVM(Java Virtual Machine)

Java虚拟机：一个虚构的计算机，有自己完善的硬件架构。把Java字节码文件解释成可在特定操作系统和计算机平台中执行的机器代码。

关系：JVM属于JRE，但是JRE还会包含必须的库类

## JDK

Java开发平台，它包含JRE和编译Java程序的编译器，用来执行Java字节码文件的解释器等。

# 第二章：Java语言编程基础

## **常见命名规则：** 

**1.包：相当于文件夹，可以解决命名冲突问题** 

**单级包**： henzen 

**多级包：** 全部小写，单词之间用 . 来分隔，域名翻转比如 

com.cakaoyan 

**2.类或接口** 

**单个单词**：首字母大写，如Student 

多**个单词**：全部单词都是首字母大写，如果HelloWorld 

**3.方法或变量** 

**单个单词：**小写，如果method 

**多个单词**：第一个单词小写，其余单词首字母大写，比如 

studentName 

**4.常量** 

所有字母全部大写，单词之间以下划线_分隔，比如MAX_NUM 

**标识符命名规则**

1. 由字母，数字，下划线，美元符号组成
2. 首字符必须是字母，下划线，或美元符号
3. 字母区分大小写
4. 常量以大写字母英文单词命名，变量以小写字母英文单词命名。如果一个变量由多个英文单词组成，第一个单词为小写，第二个单词首字母大写
5. 类标识符通常以大写英文字母开始
6. 关键字，保留字不能作为用户自定义标识符使用



## 数据类型

### 简单数据类型

- 数值类型

  整型(byte, short,int,long)

  浮点型(float, double)

- 字符型

  char

- 布尔型

  boolean
  
  1.数据类型的优先级
  
  ​		(Short,byte,char) --> int --> long --> float --> double
  
  2.自动转换和强制转换
  
- 赋值变量的数据类型优先级高于表达式结果数据类型的优先级-->表达式结果数据类型的优先级被自动转换为赋值变量的数据类型优先级
- 若低于或同级，则表达式数据类型强制转换为赋值变量的数据类型

### 复合数据类型

- 类

- 接口

- 数组

## 变量和常量

### 

![截屏2021-01-07 下午2.35.47](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%882.35.47-0001463-0001476-1484309.png)

**常量**

- 方法常量

`final datatype CONSTANTNAME=值或表达式`

用final声明，常量名全部用大写字母

## 运算符与表达式

- 算术运算符
- 关系运算符
- 逻辑运算符（&&，左边表达式值为false，整个逻辑表达式的值为false，同理，||，左边表达式值为true，整个true）
- 赋值运算符
- 三目运算符
- 位运算符

1. “&”和“&&”的区别
   - 单&时，左边无论真假，右边都进行运算
   - 双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
2. ”^"追求的是“异”

![截屏2021-01-04 上午11.21.32](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8A%E5%8D%8811.21.32-9730570-1484315.png)

## 流程控制语句

## 注释

- 单行注释
- 多行注释

`/* */`对文件，方法，数据结构等的说明，或者算法的描述，一般位于方法的前面

- 文档注释

`/** */`为了支持JDK工具javadoc，文档注释会生成HTML格式代码报告，书写在类，构造方法，成员方法以及常量或变量的定义之前。

# 第三章数组

1. 数组是有序的，数组属于数据的引用类型，
2. 数组的元素可以是任何数据类型。
3. 数组的长度一旦确定了就不能修改了
4. Java多位数组不必都是规则的矩阵形式

## 初始化

### 默认初始化值

一维数组元素初始化值

- 数组元素是整型：0
- 浮点型：0.0
- char型：0或‘\u0000',是数字0
- boolean型：false
- 数组元素是引用数据类型时，String：null

二维数组元素默认的初始化值

1. 初始化方式一：

   ```java
   int[][] arr = new int[4][3];
   ```

   外层元素初始化为：地址值

   内层元素初始化为：与一位数组初始化情况相同

2. 初始化方式二：

   ```java
   int[][] arr = new int[4][];
   ```

   外层元素初始化值为：null

   内层元素初始化值为：不能调用

3. 数组内存解析

   - 栈(stack):局部变量
   - 堆(heap):new出来的结构，对象数组
   - 方法区：静态域，常量池

### 两种初始化方式

1. 静态初始化：数组初始化和数组元素的赋值操作同时进行。
2. 动态初始化：分开进行

```java
// 静态初始化
int[] ids;
ids = new int[]{1001,1002};
int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
```

```java
// 动态初始化
String[] names = new String[5];
String[][] arr2 = new String[3][2];
String[][] arr3 = new String[3][];
```

## 遍历

```java
//3.遍历二维数组
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j < arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
```

- 第一层 arr.length
- 第二层 arr[i].length

## 内存解析

![截屏2021-01-04 下午10.45.09](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8B%E5%8D%8810.45.09-9771615-1484321.png)



## ![截屏2021-01-04 下午10.48.06](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8B%E5%8D%8810.48.06-9771713-1484325.png)

## 应用

1. 数组元素的赋值(杨辉三角、回形数等)
   - 杨辉三角二维数组遍历的应用
   - 

2. 求数值型数组中元素的最大值、最小值、平均数、总和等 

   随机数公式

   ```java
   (int)(Math.random()*(b-a+1)+a)//随机数是两位数
   ```

   

3. 数组的复制、反转、查找(线性查找、二分法查找)

   - 数组复制和赋值的区别

   ```java
   //复制
   String[] arr = new String[] {"JJ","DD","MM","BB","GG","AA"};
   String[] arr1 = new String[arr.length];
   for(int i = 0;i < arr1.length;i++) {
   			arr1[i] = arr[i];
   }
   //数组变量的赋值：arr1 = arr
   ```

   ​	复制是通过new方式，给array2在对空间中新开辟了数组的空间，将数组array1中的数组值一个个赋值到array2中，两个不同的内存空间存储相同的数值；

   ​	赋值是两个数组指向堆空间中的同一个数组实体，将arr保存的数组地址值赋给arr1。

   

   - 反转

     - i，arr.length-1-i 表示一头一尾
     - i ，j = arr.length-1 表示一头一尾进行遍历

   - 线性查找一个个比对

     - 判断两个字符串是否相等  str1.equals(str2)，用target = -1;初始化，若找到target>=0,否则target<0
     - 用flag标志

   - 二分查找

     - 前提是，数组必须有序

     - 用flag标志
     

4. 数组元素的十大排序算法

   ![截屏2021-01-05 下午7.12.59](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-05%20%E4%B8%8B%E5%8D%887.12.59-9845196-1484329.png)

   冒泡排序：平均时间复杂度O(n^2)

   快速排序：平均时间复杂度O(nlog2n)

   排序的分类：内部排序 与 外部排序（需要借助磁盘）

## Arrays工具类

java.util.Arrys类为操作数组的工具类

常用的方法

| 1    | boolean equals(int[]a,int[]b)     | 判断两个数组是否相等                 |
| ---- | :-------------------------------- | ------------------------------------ |
| 2    | String toString(int[] a)          | 输出数组信息                         |
| 3    | void fill(int[]a,int val)         | 将指定值填充到数组当中               |
| 4    | void sort(int[] a)                | 对数组进行排序                       |
| 5    | Int binarySearch(int[] a,int key) | 对排序后的数组进行二分法检索制定的值 |

## 数组使用中的常见异常

1. 数组角标越界异常 ArrayIndexOutOfBoundsExcetion

   ```java
   //后面越界
   for(int i = 0;i <= arr.length;i++) {
   			System.out.println(arr[i]);
   }
   //前面越界
   		System.out.println(arr[-2]);
   ```

   

2. 空间指针异常 NullPointException

   ```java
   // 情况一：
   		int[] arr1 = new int[]{1,2,3};
   		arr1 = null;
   		System.out.println(arr1[0]);
   		// 情况二：
   		int[][] arr2 = new int[4][];
   		System.out.println(arr2[0][0]);
   		// 情况三：
   		String[] arr3 =  new String[]{"AA","BB","CC"};
   		arr3[0] = null;
   		System.out.println(arr3[0].toString());
   ```

   

# 第四章面向对象上

## 类与对象

- 面向对象思想的三条主线

  1.类及类的成员：属性，方法，构造器，代码块，内部块

  2.面向对象的三大特征：封装，继承，多态

  3.其他关键字 this super abstract interface static final package import

-  类和对象的创建和执行操作有哪三步？

 1.创建类，设计类的成员

 2.创建类的对象

 3.通过“对象.属性”或"对象.方法"调用对象的结构

-  对象的赋值

 	Person p3 = p1 将p1变量保存的对象地址赋给p3,导致p1和p3指向了同一个对象实体。

-  JVM内存解析

  堆 存放对象实例

  栈 存储局部变量

  方法区 存储被虚拟机加载的类信息，常量，静态变量，即时编译器编译后的代码等数据。

![截屏2021-01-28 上午8.41.36](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8A%E5%8D%888.41.36-1794534.png)

1.编译完源程序以后，生成一个或多个字节码文件。

2.使用JVM中的类的加载器和解释器对生成的字节码文件进行解释运行。意味着，将字节码文件对应的类加载到内存中，涉及到内存解析。

3.虚拟机栈，即平时提到的栈结构，将局部变量存储在栈结构中

4.堆，将new出来的结构(数组，对象)加载在堆空间中。补充，对象的属性(非static)加载在堆空间中。

5.方法区，类的加载信息，常量池，静态域

![截屏2021-01-07 上午11.52.18](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8A%E5%8D%8811.52.18-9991551-1798827.png)

面向对象中两个重要的概念：

类：对一类事物的描述，是抽象的，概念上的定义

对象：是实际存在的该类事物的每一个个体，也称为实例(instance)

- 面向对象程序设计的重点是类的设计
- 设计类，就是设计类的成员

说明：

- 属性 = 成员变量 = field = 域 ,字段
- 方法 = 成员方法 = 函数 = method
- 创建类的对象 = 类的实例化 = 实例化类

### 对象

一组数据和相关方法的集合。利用一个已经存在的类可以创建多个对象，被创建的对象成为类的实例对象。即对象。

一，理解“万物万物皆对象”

1. 在Java语言范畴中，将功能，结构等封装到类中，通过类的实例化，来调用具体的功能结构

2. 涉及Java语言与前端HTML，后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类，对象

 二，内存解析说明

1. 引用类型的变量，只可能存储两类值：null 或 地址值（含变量的类型）

三，匿名对象的使用

1. 理解：创建的对象，没有显示的赋给一个变量名，即为匿名对象
2. 特征：匿名对象只能调用一次。

```java

public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		// 匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
		//new Phone().price = 1999;
		//new Phone().showPrice();
		PhoneMall mall = new PhoneMall();
		//mall.show(p);
		 mall.show(new Phone());
	}
}
 class PhoneMall{
	 public void show(Phone phone) {
		 phone.sendEmail();
		 phone.playGame();
		 
	 }
 }
class Phone{
	double price;
	
	public void sendEmail(){
		System.out.println("发送邮件");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}
	public void showPrice() {
		System.out.println("手机价格为： " + price);
	}
}

```

**对象的创建**

- 声明对象引用变量

  为对象指定所属类及命名该对象引用变量名称。分配一个对象引用变量的空间。

  `类名 对象名`

- 为对象分配内存空间

  使用new运算符和类的构造方法为声明的对象分配内存。 new称为操作符或运算符，任务是实例化对象，同时负责调用类的构造方法完成新对象的初始化任务。

  `<对象名>=new <构造方法>([参数列表]);`

```java
Person p1 = new Person();
Person p2 = new Person();
Person p3 = p1;//没有创建新对象，公用一个堆空间中的对象实体
```

![截屏2021-01-07 下午12.10.37](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%8812.10.37-9992698-1798827.png)

**对象的使用**

<对象名>.<变量名>

<对象名>.<方法名>

### Java的垃圾回收机制

——对象的清除

Java虚拟机会自动判断创建的对象是否还被引用，若不再被引用，它会自动释放其占用的内存空间。定期检测不再使用的对象并自动释放内存空间的过程叫垃圾回收机制。

- 垃圾回收器

  Java有一个垃圾回收器，它会周期性扫描对象的内存区，将没有被引用的对象作为垃圾收集起来，定期地释放不再被使用的内存空间。

  在Java程序中调用System类的gc( )方法显式地运行垃圾回收程序。

  - 在程序运行时产生大量垃圾数据类型之后。
  - 程序运行时需要大量内存之前运行垃圾回收器。

  

- 撤销方法finalize

  在一个对象被垃圾回收器收集之前，垃圾回收器将给对象一个机会调用自己的finalize()方法，将对象从内存中清除。

  位于java.lang.Object中。如果要在一个类中调用该方法释放该类所占有的资源，则在对该类处理工作完成后，一般调用父类的finalize()方法以清除对象使用的所有资源。



## 



### 类声明

描述一组具有公共状态和行为的对象的原型。

1. 一个Java文档可以包含多个类，但最多只能有一个为公共类
2. 如果存在public class，该类的类名必须与文档名相同
3. main方法是Java应用程序的入口，如果文档存在public class和main方法，则main方法必须位于public class 中。



**工具类的封装**

```java
package com.atguigu.exer;
/*
 * 自定义数组的工具类
 */
public class ArrayUtil {
	//求数组的最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
	
	//求数组的最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
		
	}
	//求数组的总和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
		
		
	}
	//求数组的平均值
	public double getAvg(int[] arr){
		
		return getSum(arr) / arr.length;
		
		
		
	}
	//反转数组
	public void reverse(int[] arr){
		for(int i = 0,j = arr.length-1;i < j;i++,j--) {
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
	}
	//复制数组
	public int[] copy(int[] arr){
		int[] arr2 = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			arr2[i] = arr[i];
		}
		return arr2;
		
	}
	//数组排序
	public void sort(int[] arr){
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-i-1;j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	//遍历数组
	public void print(int[] arr){
		for(int i = 0;i < arr.length;i++) {
			if(i==0)
				System.out.print("["+ arr[i]+",");
			else if(i == arr.length-1)
				System.out.print(arr[i]+"]");
			else 
				System.out.print(arr[i] + ",");
		}
			
		
		
	}
	//查找指定元素
	public int getIndex(int[] arr,int value){
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == value) {
				return i;
			}
				
		}
		return -1; //返回一个负数表示没有找到
		
		
		
	}

}
```

```java
package com.atguigu.exer;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
		int max = util.getMax(arr);
		int min = util.getMin(arr);
		System.out.println("Max:" + max +" Min:" + min);
//		System.out.println("排序前:");
//		util.print(arr);
//		util.sort(arr);
//		System.out.println("\n排序后:");
//		util.print(arr);
		System.out.println("查找:");
		int index = util.getIndex(arr, -3);
		if(index >= 0)
			System.out.println("找到了,索引地址为:" + index);
		else
			System.out.println("未找到");
		
		
		
	}

}
```



### 类的结构之一：属性

![截屏2021-01-28 上午9.16.59](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8A%E5%8D%889.16.59-1796672.png)

#### 1.成员变量与方法变量

- 成员变量（位于类方法体以外的变量）

  - 实例成员变量
    1. 每次创建类的新对象时，系统就会为该对象创建实例变量的副本，该对象每个实例变量都有自己的内存空间
    2. 通过对象名访问这些实例变量
  - 类成员变量（静态成员变量）
    1. 第一次调用类的时候，系统为类变量分配一次内存。不管以后创建多少个对象，所有对象都共享该类的变量。
    2. 通过类名或某个对象来访问类变量


- 方法变量（位于方法体内的变量）(局部变量)

  **成员变量（属性）和局部变量（方法变量）的不同点**

  ![截屏2021-01-28 上午9.47.23](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8A%E5%8D%889.47.23-1798506.png)

  - 在类中声明的位置的不同

    - 属性：直接定义在类的一对{}内；

    - 局部变量：声明在方法体内，方法形参，代码块内，构造器形参，构造器内部的变量

  - 关于权限修饰符不同

    - 属性：可以在声明属性时，指明其权限，使用权限修饰符

      常用的权限修饰符：private, public,friendly,protected --->封装性

    - 局部变量不能用权限修饰

  - 默认初始化值的情况

    - 属性：类的属性，根据其类型，都有默认初始化值

      整型 (byte , short , int , long) , 0

      浮点型（char , double) , 0.0

      字符型（char）0 或 ‘\u0000’

      布尔型（boolen) , false

      引用数据类型(类，数组，接口)，null

    - 局部变量没有默认初始化值

      形参在调用时，赋值即可

  - 在内存中加载的位置

    - 属性：加载到堆空间中（非static）
    - 局部变量：加载到栈空间

#### 2.成员变量和常量

必须放在类体中

`[访问控制修饰符][static]<数据类型> 变量名;`

`[访问控制修饰符][static][final]<数据类型> 常量名;`

访问控制修饰符

| 类型               | private | protected | public | 默认 |
| ------------------ | ------- | --------- | ------ | ---- |
| 所属类             | Y       | Y         | Y      | Y    |
| 同一个包中的其他类 | N       | Y         | Y      | Y    |
| 同一个包中的子类   | N       | Y         | Y      | Y    |
| 不同包中的子类     | N       | Y         | Y      | N    |
| 不同包中的非子类   | N       | N         | Y      | N    |



### 类的结构之二：方法

##### 方法定义形式

```
[权限修饰符]返回类型 方法名(参数列表)[throw 异常类型]{
//方法体
}
```

权限修饰符：private , public , friendly , protected

返回值类型：可以是Java中任意的数据类型，当不需要返回类型时，返回类型必须是void。return返回值类型必须和方法声明的返回类型一致，return也可以用来结束方法

##### 方法的修饰符

- abtract

- static 

  - 实例方法，每个对象的实例都有自己专用的内存空间

    - ​	实例方法既可以访问类变量，也可以访问实例变量

  - 类方法（静态方法）

    1. 类方法只能访问类变量，不能访问实例变量
    2. 可以通过类名直接调用类方法，不能调用实例方法
    3. 通过对象名既可以调用类方法，也可以调用实例方法

- final

  - 如果父类的某个方法被final修饰，则其子类不能覆盖这个方法，只能继承这个方法
  - 防止子类对父类的关键方法进行修改，保证程序安全性
  - final类中的方法以及类中的private方法都默认为是final方法

- native

  用其他语言编写的方法在Java程序中。提供Java本地接口JNI（Java Native Interface），使得Java虚拟机能够运行嵌入在Java程序中的其他语言代码。

  1. 充分利用已经存在的程序功能模块，避免重复工作和提高程序的执行效率
  2. 利用native方法借助于其他运行速度比较高的场合

- synchronized(同步)

  用于多线程

- throw(异常类型列表)

##### 方法的参数传递

- 传递基本数据类型的参数时，在方法中修改传递过来的参数的值，并不会影响原参数的值。
- 传递复合数据类型参数，传递的是对象的引用地址。对参数的操作会影响原参数的改变。原参数与传递过来的参数指向同一个地址。

```java
	// 例1 传数组
public void sort(int[] arr){
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-i-1;j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
```

```java
//例2 传对象
package com.atguigu.exer;

public class ValueTransferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);
		ValueTransferTest test = new ValueTransferTest();//创建valuetransferTest()对象
		test.swap(data);
		System.out.println("m = " + data.m + ", n = " + data.n);
		

	}
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}
	class Data{
		int m;
		int n;
	}
```

- 方法的参数传递内存解析

  ```java
  public class TransferTest3 {
      public static void main(String args[]) {
  			TransferTest3 test = new TransferTest3();
  			test.first(); 
      }
  		public void first() { 
    	int i = 5;
  		Value v = new Value(); 
    	v.i = 25;
  		second(v, i); 
      System.out.println(v.i);
  		}
  public void second(Value v, int i) { 
    	i = 0;	
  		v.i = 20;
  		Value val = new Value();
  		v = val;
  		System.out.println(v.i + " " + i);
  	}
  }
    class Value {
      int i = 15;
  }
  ```

![截屏2021-01-09 下午9.15.20](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-09%20%E4%B8%8B%E5%8D%889.15.20-0198163-1798827.png)

**形参会创建一份对象v和i；**

##### 可变个数形参的方法

 1.jdk 5.0

 2.具体使用：

 2.1 可变个数形参的格式：数据类型... 变量名

 2.2 当调用可变个数形参方法时，传入的参数可以是：0个，1个，2个

 2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载

 2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。

 2.5 可变个数形参在方法的形参中，必须声明在末尾

 2.6 可变个数形参在方法的形参中，最多只能声明一个可变形参。

```java
package com.atguigu.exer;
/* 可变个数形参的方法
 * 1.jdk 5.0
 * 2.具体使用：
 * 		2.1 可变个数形参的格式：数据类型... 变量名
 * 		2.2 当调用可变个数形参方法时，传入的参数可以是：0个，1个，2个
 * 		2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 * 		2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。
 * 		2.5 可变个数形参在方法的形参中，必须声明在末尾
 * 		2.6 可变个数形参在方法的形参中，最多只能声明一个可变形参。
 * 
 */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
//		test.show("hello");
//		test.show("hello","world");
//		test.show();
//		test.show(new String[] {"AA","BB","CC"});//调用数组的或可变变量
		test.show("AA","BB","CC");//调用可变变量
		
	}
	public void show(int i) {
		
	}
	public void show(String s) {
		System.out.println("show(String)");
		
	}
	public void show(int i,String ... strs){
		System.out.println("show(String ... strs)");
		for(int i = 0;i< strs.length;i++) {
			System.out.println(strs[i]);
		}
		
	}
//	public void show(String[] strs) {
//		
//	}
	

}  
```



##### 重载方法

多个方法共享一个名字，各个方法之间必须在参数个数，顺序或类型方面有所区别。

两同一不同：同一个类，相同的方法名。

参数列表不同：参数个数不同，参数类型不同。



### 面向对象的特征之一：封装

#### 封装的作用

将代码及其处理的数据绑定在一起的一种编程机制，保证程序不受外部干扰且不被误用。

- 模块化，对代码的编写和维护可以独立进行，重用性
- 数据隐藏，自身维护自身数据和方法

封装性的体现
 * 不对外暴露私有的方法，单例模式等，将类的属性XXX私有化(private),同时，提供公共的public方法获取(getXXX)和设置(setXXX)。
 * 封装的体现，需要权限修饰符来配合

   ​	1.Java规定的4种权限（从小到大排列）:private,缺省,protected,public

   ​	2.4种权限可以用来修饰类及类的内部结构：属性，方法，构造器，内部类
    * 			修饰类的话，只能使用：缺省,public
 * 体现类及类的内部结构在被调用时的可见性的大小

#### 权限修饰符

![截屏2021-01-28 上午9.50.03](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8A%E5%8D%889.50.03-1798634.png)

- public 可以被任何包中的类访问，在一个类中使用其他包中的类，必须在程序中增加import语句
- abstract 一个抽象类包含抽象方法，抽象方法是没有方法体的方法。只能用于衍生子类，不能实例化。
- final 不能被继承的类，不能派生子类
- 默认为firendly类

### 类的结构之三：构造器

一，构造器的作用

1.创建对象

2.初始化对象的信息

二，说明

1. 每个类都有一个默认的构造方法，其既无参数，也无返回值，其作用是使用new操作符创建新对象后初始化新建的对象。

2. 定义构造器的格式，权限修饰符 类名(形参列表){}

3. 一个类中定义的多个构造器，彼此构成重载

4. 一旦显示定义了类的构造器之后，系统就不再提构默认的空参构造器

5. 一个类中至少有一个构造器

6. “两同一不同”：同一个类，相同方法名，参数列表不同，参数类型不同

7. 跟方法的权限修饰符，返回值类型，形参变量名，方法体都没有关系

8. 在通过对象调用方法时，如何确定某个指定方法  1.方法名 2.参数列表

9. 仅在使用new操作符创建新对象时执行一次，，一般不能用“对象名.方法名”显式调用

10. 构造方法的名称必须与类名完全相同，不返回任何值，没有类型，“void”也不行

11. 构造方法不能被static, final,abstract,synchronized和native等修饰符修饰

    

#### 属性赋值的先后顺序

1. 默认初始化
2. 显示初始化
3. 构造器中的初始化
4. 通过“对象.方法”或“对象.属性”的方式，赋值

#### JavaBean

JavaBean是一种Java语言写成的可重用组件。指符合如下标准的Java类: 

- 类是公共的

 * 		有一个无参的公共的构造器 
 * 		有属性，且有对应的get、set方法

### this关键字

用来调用属性，方法，构造器。理解为当前创建的对象或当前对象。



1.“this.属性”或“this.方法”来调用当前属性或方法。一般省略。只有当形参和成员变量同名的时候，才会用"this.变量"的方式表示成员变量。这在构造器和方法中都适用。
2.this 构造器

- 在类构造器中，this(形参列表)方式可以调用本类中指定的其他构造器（但是不能调用自己）。所以如果一个类中有n个构造器，则最多有n-1个构造器使用了“this(形参列表)”。
- this(形参列表)必须声明在当前构造器的首行。在构造器的内部，最多只能声明一个"this(形参列表)",用来调用其他的构造器。

### 包

- 应用程序所属的包，作为程序第一条语句 package 包名；

- 引用外部包中的类，紧跟package语句后 

  - `import 包名.公共类名`
  - `import 包名.*`

  1. 目标程序中只能使用包中的公共类
  2. 包之间存在层次关系，但使用的时候是平等的

1. 位于同一包的程序可直接相互引用对方程序中的类（包括public类和默认类）

2. 如果两个程序属于不同包中，则必须使用import命令导入外部包中的类，而且中能引用公共类

3. 使用import 包名.*;语句可以导入当前程序所需要的包中的任何公共类，使用import 包名.类名；语句只能导入包中的指定公共类。

4. 注意:

   1. 在源文件中使用import显式的导入指定包下的类或接口
   2. 声明在包的声明和类的声明之间。
   3. 如果需要导入多个类或接口，那么就并列显式多个import语句即可
   4. 举例:可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
   5. 如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
   6. 如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的 是哪个类。
   7. 如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。 
   8. import static组合的使用:调用指定类或接口下的静态的属性或方法

# 第五章面向对象中



### 面向对象的特征之二：继承

作用：

1.减少代码的冗余

2.便于功能的扩展

3.为多态性的使用提供了前提

说明：

- 一个父类可以拥有多个子类，是所有子类的公共变量和公共方法的集合

- 子类不受父类提供的状态和行为的限制，可以增加自己的方法。扩充。

- 覆盖继承。

- 所有类都默认Object类(java.lang.Object)，Object类位于类的最上层，所有类都是Object类的子类。

  ```
  [类的修饰符]class <子类名> extends <父类名>{
  //类体
  }
  ```

- 子类名：子类，派生类，subclass;父类：超类，基类，superclass
- 子类继承父类之后就拥有了父类的所有属性和方法，特别是父类中声明为private的属性和方法，子类继承父类以后仍然认为获取了父类中的私有结构。只是因为封装性的影响，使子类不能直接调用。对于私有属性可以用getXXX和setXXX来获取。对于私有方法，可以在父类中的公有方法里调用，子类通过调用公有方法来实现私有方法的调用。
- 子类继承父类后，获取了直接父类和间接父类的所有属性和方法。
- 构造方法是一个类独有的方法不会被它的子类继承，但是子类在实例化对象时：如果子类的构造器没有显示的调用父类的构造器，则将自动调用父类默认的构造器（无参）。相当于默认省略了super()。子类实例化对象时，会先调用父类的无参构造器。

### 重写

子类继承了父类之后，父类继承的方法中在子类不适用时，子类可以将父类的方法进行重新描述。这个重新描述的方法的方法名，形参列表的顺序，类型都与父类的方法相同。重写后，创建子类对象后，用子类对象调用子类父类对象中的同名同参数方法时，实际上执行的是子类重写父类的方法

隐藏

- 子类可以继承父类的成员变量和成员方法，如果一个成员变量同时被父类和子类中定义，那么在创建对象后，它们是同时存在的，并且父类的成员变量用于父类的方法，子类的成员变量用于子类的方法。子类从父类继承的该成员变量将被隐藏。

- 创建对象时，系统会先调用父类的构造方法，然后调用子类的构造方法。

- 子类继承父类的成员变量，即公共成员变量时，子类修改改成员变量的值的时候，父类该变量的值也被修改。

区别：

1. 子类隐藏父类的成员变量只是使之不可见，父类的同名成员变量在子类对象中仍然拥有自己独立的内存空间；而子类方法对父类方法的覆盖将清除父类方法占用的内存空间，使得父类方法在子类对象中不再存在。
2. 子类不能覆盖(重写)父类中final方法和static方法，但可以隐藏这类方法，在子类中声明与父类同名的final方法和static方法。

```
方法声明：
权限修饰符 返回值类型 方法名(形参列表) throws 异常类型{
// 方法体
} 
```

要求：子类中的叫重写的方法，父类中的叫被重写的方法

1. 子类重写的方法必须和父类被重写的方法具有相同的方法名称、参数列表

2. 子类重写的方法的返回值类型不能大于父类被重写的方法的返回值类型
   1. 父类被重写的方法的返回值类型是void,则子类重写的方法返回值类型只能是void.
   2. 父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类。
   3. 父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型必须是相同的基本数据类型。

3. 子类重写的方法使用的访问权限不能小于父类被重写的方法的访问权限
4. 子类不能重写父类中声明为private权限的方法
5. 子类方法抛出的异常不能大于父类被重写方法的异常

### super关键字

- 理解为：父类的
- 用来调用属性，方法，构造器。

**调用方法和属性**

在子类的方法或构造器中，通过使用“super.属性”或“super.方法”显示的调用父类中声明的属性或方法。通常省略。
特殊情况：
1.子类父类中定义了同名的成员变量，如果要使用父类的成员变量，显示的使用super关键字。
2.子类重写了父类的方法后，若要调用父类被重写的方法，使用super关键字。
**调用构造器**
1.子类无条件继承父类的无参数的构造方法，

2.如果子类没有构造方法，则它将继承父类无参数的构造方法作为自己的构造方法；如果子类定义了构造方法，则子类创建对象时，先调用父类的无参构造方法，再执行子类的构造方法。若想调用父类的有参构造方法，可使用super关键字。

- 对于父类带参数的构造方法，子类可以通过自己的构造方法中使用super关键字来调用，但这个调用必须在子类构造方法中的第一条可执行语句。

- 子类在实例化对象时：如果子类的构造器没有显示的调用父类的构造器，则将自动调用父类默认的构造器（无参）。相当于默认省略了super()。此时，子类实例化对象时，会先调用父类的无参构造器。
- 在子类显示的使用“super(形参列表)”的方式调用父类中声明的有参构造器。它必须在子类构造器的首行。
- “this(形参列表)”或“super(形参列表)”只能二选一，
- 在构造器的首行，没有显示的声明“this(形参列表)”或“super(形参列表)”，默认调用为父类的空参构造器。如果父类没有不带参数的构造器，且子类的构造器中又没显示的调用父类其他构造器，则Java编译器将报告错误
- 在类的构造器中，至少有一个类的构造器使用了"super(形参列表)"。



![截屏2021-01-28 上午11.44.26](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8A%E5%8D%8811.44.26-1805488.png)

static应用单例模式

- 饿汉式

  ```java
  class Bank{
  	//1.私化类的构造器
  	private Bank{
  	
  	}
  	//2.内部创建类的对象
  	//4.要求此对象也必须声明为静态的
  	priavte static Bank instance = new Bank();
  	
  	//3.提供公共的静态的方法，返回类的对象
  	public static Bank getInstance(){
  			return instannce;
  	}
  	
  }
  ```

- 懒汉式

  ```java
  class Bank {
      private Bank() {
  
      }
  
      private static Bank instance = null;
  
      private static Bank getInstance() {
  ////        方式一: 效率稍差
  //        synchronized (Bank.class){
  //            if(instance == null){
  //                instance = new Bank();
  //            }
  //        }
  //        方式二: 效率稍高
          if (instance == null) {
              synchronized (Bank.class) {
                  if (instance == null) {
                      instance = new Bank();
                  }
              }
          }
          return instance;
      }
  }
  
  ```

  



### 面向对象的特征之三：多态性

**理解**

一个事物的多种形态，父类的引用指向子类的对象(或子类的对象赋给父类的引用)。如，Person man = new Man();提高了代码的通用性。

一个对外接口，多个内在实现方法。

- 方法重载，一个类中定义多个同名方法，程序在调用方法时，系统会自动根据参数类型，个数和顺序的不同调用不同的方法，
- 方法覆盖，调用对象的某个方法，现在子类中查找此方法。如果找到则调用子类方法，否则，在父类中查找此方法。父类与子类之间方法的多态性。

#### 多态性的使用

**多态的使用前提**

1.类的继承关系

2.方法的重写

**多态性的使用：虚拟方法调用**

虚拟方法：多态下，被重写的父类方法。父类根据赋予给它的不同子类对象，动态调用属于子类的该方法。方法的调用是在运行中确定的。

​		**虚拟方法的调用**

- 当调用子父类同名同参数方法时，实际上执行的是子类重写的父类方法--虚拟方法的调用。

- 不能调用子类所特有的方法或属性。

- 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。除非使用强制类型转化符，这也叫向下转型。使用强制转换时可能出现ClassCastException的异常。这时需要运用instanceof关键字。

- 在编译期，只能调用父类中声明的方法，在运行期，实际执行的是子类重写的父类方法。总结：编译看左边，运行看右边。

  - 引用变量有两个类型分别是编译时类型和运行时类型。
  - 编译时类型由声明该引用变量时使用的类型决定。
  - 运行时类型由实际赋值给该引用变量的对象决定。
  - 编译时，看左边；看的是父类的引用，查看引用变量所声明的类中是否有所调用的方法。
  - 运行时，看右边。看的是子类的对象，调用实际new的对象所属的类中的重写方法

  编译类型和运行类型不一致，就出现了对象的多态。

**子类对象和父类对象特点**

1. 子类创建的对象可以赋值给父类对象，此时父类对象调用的是子类的方法和变量（这些方法在父类中本身就存在，虽然已被偷梁换柱）
2. 只能把子类对象赋值给父类

**注意：**对象的多态性，只适用于方法，不适用于属性(编译和运行都看左边)。

##### **重写与重载的区别**

重载，不表现为多态性，对于编译器而言，同名方法根据不同的参数列表形成了不同的方法，他们调用的地址在编译期就绑定了。在方法调用之前，编译器就已经确定了所要调用的方法，称为早绑定或静态绑定。子类可以重载父类的同名不同参数的方法。

重写，表现为多态性，只等到方法调用的那一刻，解释器才会确定所要调用的具体方法，称为“晚绑定”或“动态绑定”。

##### 向上转型和向下转型

![截屏2021-01-28 下午12.22.49](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%8812.22.49-1807811.png)

**为什么使用向下转型**

因为对象的多态性以后，内存中实际上是加载子类持有的属性和方法，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的方法和属性。子类持有的属性和方法不能调用。

**如何实现向下转型**

使用（）强制符，这个过程叫做对象类型转换。

**注意**

1.使用强转时，可能出现ClassCastException的异常。

2.为避免异常，在向下转型之前，进行instanceof判断，返回true,就进行向下转型。

**instanceof的使用**

- a instanceof A:判断对象a是否是类A的实例，如果是，返回true,否则，返回false.

- 如果a instanceof A返回true,则a instanceof B也返回true.(其中类B是类A的父类)
- 要求a所属的类与类A必须是子类和父类的关系，否则编译错误。

```java
		// 问题一：编译时通过，运行时不通过
		Person p3 = new Woman();
		Man m3 = (Man)p3;
		Person p4 = new Person();
		Man m4 = (Man)p4;
		
		// 问题二：编译通过，运行通过
		Object object = new Woman();
		Person person = (Person)object;
		
		// 问题三：编译不过
		Man m5 = new Woman();
		
		String str = new Date();
		Object o = new Date();
		String str1 = (String)o;
```



### Object类的使用

#### java.lang.Object类

1.Object类是所有Java类的根父类

2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类

- command + t 查看结构

 3.object类中的功能（属性，方法）具有通用型

- finalize()方法：程序员可以通过System.gc()或者Runtime.getRuntime().gc()来通知系统进行垃圾回收，但系统是否立即进行垃圾回收，不确定。

- getClass()方法：获取当前对象的所属类
- toString(),clone(),hashCode(),equals(),notify(),notifyAll()

4.Object类只声明一个空参构造器

#### equals()方法

1. 是一个方法，而非运算符。

2. 只能适用于引用数据类型

3. Object类中equals()的定义

   ```java
   public boolean equals(Object obj){
   				return (this == obj);
   }
   ```

   说明Object类中定义的equals()和==的作用是相同的，比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体。

4. 像String，Date，File，包装类等都重写了Object类中的equals()方法。重写后比较的不是两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同。

5. 通常情况下，自定义的类如果使用equals()话，通常比较两个对象的“实体内容”是否相同，则需要自定义重写equals()

6. 重写的原则：比较两个对象的实体内容是否相同。

**重写equals()**

1.手写

```java
public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(obj instanceof Order) {
			Order order = (Order)obj;
			return (this.orderld == order.orderld && this.orderName.equals(order.orderName));
		}
		return false;
	}

	public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(8, "dhska");
		Order order2 = new Order(8, "dhska");
		System.out.println(order1.equals(order2));
	}

}
```

2.开发中自动生成。

**==与equals()区别**

 ==：运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
 * 	如果比较的是引用数据类型变量，比较两个对象的地址值是否相同。即两个引用是否指向同一个对象实体。

#### toString()方法

Obeject类中toString()的使用
 * 当输出一个对象的引用时，实际上就是调用当前对象的toString()方法

 * Object类中的toString()方法如何定义

     ```java
     public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
     ```

 * 像String，Date，File，包装类等都重写了Object类中的toString()方法。
     使得在调用对象的toString()时，返回“实体内容”信息。
    
 * 自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容”。在开发中，也是自动生成的。

#### 单元测试

**Java 中的JUnit单元测试**

**步骤：**

1.选中当前工程 - 右键选择：build path - add libraries - Junit 4 - 下一步

2.创建一个Java类，进行单元测试。

​	此时Java类的要求：1.此类是public的 2.此类提供公共的无参构造器

3.此类中声明单元测试方法。

​	此时的单元测试方法,方法的权限是public,没有返回值，没有形参

4.此单元测试方法上需要声明注解：@Test，并在单元测试类中导入：import org.junit.Test;

5.声明好单元测试方法以后，则可以在方法体内测试相关的代码。

6.写完代码以后，左键双击单元测试方法名，右键 run as - Junit Test

**说明：**

 * 如果执行结果没有任何异常：绿条

- 如果执行结果出现异常：红条

```java
public class JUnitTest {
    int num = 10;

    public JUnitTest() {
    }

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        System.out.println(this.num);
        this.show();
    }

    public void show() {
        this.num = 20;
        System.out.println("show()...");
    }

    @Test
    public void testToString() {
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
```



#### 包装类（Wrapper）的使用

1.为了使基本数据类型的变量具有类的特征，引入包装类。

2.8种基本数据类型及其对应的包装类

![截屏2021-01-28 下午1.27.10](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%881.27.10.png)

1.Vector类中关于添加元素，只定义了形参Object类型的方法：

v.addElement(Object obj); //基本数据类型 ---> 包装类 ---> 使用多态

**基本数据类型，包装类，Strings三者之间的相互转换。**

![截屏2021-01-28 下午1.30.05](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%881.30.05.png)

#### 

- 基本数据类型 --------> 包装类，调用包装类的构造器

  - 手动调用

  ```java
  public class WrapperTest {
  	
  	
  	//基本数据类型----->包装类，调用包装类的构造器
  	@Test
  	public void test1() {
  		
  		int num1 = 10;
  //		System.out.println(in1.toString());
  		Integer in1 = new Integer(num1);
  		System.out.println(in1.toString());// 10
  		
  		Integer in2 = new Integer("123");
  		System.out.println(in2);// 123
  		
  //		// 报异常
  //		Integer in3 = new Integer("123abc");
  //		System.out.println(in2);
  		
  		Float float1 = new Float(12.3f);
  		Float float2 = new Float("12.3");
  		System.out.println(float1 + " " +float2);
      // 12.3 12.3
  		
  		Boolean boolean1 = new Boolean(true); //true
      // Boolean类型，当字符串有了除true以外的字符时，返回false。
  		Boolean boolean2 = new Boolean("true123"); //false
  		System.out.println(boolean1 + " " + boolean2);
  		
  		Order order = new Order();
  		System.out.println(order.isMale);// false
  		System.out.println(order.isFemale);// null
  	}
  
  }
  class Order{
  	
  	boolean isMale;
  	Boolean isFemale;
  }
  
  ```

  - 自动装箱

- 包装类 -----> 基本数据类型:调用包装类的XXXvalue()

  - 手动拆箱

  ```java
  @Test
  	public void test2() {
  		Integer in1 = new Integer(12);
  		int i1 = in1.intValue();
  		System.out.println(i1 + 1);
  		
  		Float float1 = new Float(12.3);
  		float float2 = float1.floatValue();
  		System.out.println(float2);
  	}
  	
  ```

  - 自动拆箱

    ```java
    @Test
    	public void test3() {
    		// 自动装箱：基本数据类型 ---> 包装类
    		int num2 = 10;
    		Integer in1 = num2;
    		
    		boolean b1 = true;
    		Boolean b2 = b1;
    		
    		// 自动拆箱:包装类 ---> 基本数据类型
    		System.out.println(in1.toString());
    		int num3 = in1;
    	}
    	
    ```

- 基本数据类型，包装类 ---> String类型：调用String重载的valueOf(xxx)

  ```java
  @Test
  	public void test4() {
  		
  		int num1 = 10;
  		// 方式1：链接运算
  		String str1 = num1 + "";
  		// 方式2:调用String的valueOf(XX)
  		float f1 = 12.3f;
  		String str2 = String.valueOf(f1);//"12.3"
  		
  		Double d1 = new Double(12.4);
  		String str3 = String.valueOf(d1);
  		System.out.println(str2);
  		System.out.println(str3);
  	}
  ```

- String类型 ---> 基本数据类型，包装类:调用包装类的parseXXX(String s)

  ```java
  @Test
  	public void test5() {
  		String str1 = "123";
  		// 错误的情况
  //		int num1 = (int)str1;
  //		Integer in1 = (Integer)str1;
  		//可能会报NumberFormatException
  		int num2 = Integer.parseInt(str1);
  		System.out.println(num2);
  		
  		String str2 = "true1";
  		boolean flag = Boolean.parseBoolean(str2);
  		System.out.println("******" + flag);
  	}
  ```

转换时，可能会报NumberFormatException异常

# 第六章面向对象下

### static关键字

- 可以用来修饰属性，方法，代码块，内部类

- 使用static修饰属性，按是否被static修饰，属性分为实例变量和静态变量。实例变量在每个对象中都有一份独立的空间。静态变量是多个对象共享一个空间，当通过一个对象修改静态变量时，会导致其他对象调用此静态变量时是被修改过的。

- 静态变量和方法随着类的加载而加载，可以通过“类.静态变量”或“类.静态方法”的方式进行调用。

- 类只会加载一次，则静态变量，静态方法在内存中也只会加载一份，存在方法区的静态域中。

  - |      | （静态方法）类方法/属性 | 非静态方法/属性 |
    | ---- | ----------------------- | --------------- |
    | 类   | yes                     | no              |
    | 对象 | yes                     | yes             |

  - 静态方法，只能调用静态的方法或属性。

  - 在静态方法中，不能使用this关键字和super关键字。

- 如何确定一个属性是否要声明为static，如果属性是可以被多个对象所共享，不会随着对象的不同而不同。

- 如何确定一个方法是否要声明为static，操作属性的方法，通常设为static。工具类中的方法，习惯上声明为static。

**类变量和实例变量内存解析**

![截屏2021-01-28 下午2.12.04](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%882.12.04.png)

#### 单例设计模式

采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。

- 饿汉式

  ```java
  class Bank{
    // 1.私有化类的构造器
    private Bank(){
      
    }
    // 2.内部创建类的对象
  	// 4.对此对象的声明也必须声明为静态的
  	private static Bank instance = new Bank();
    
    // 3.提供公共的方法，返回类的对象
  	public static Bank getInstance(){
      return instance;
    }
  }
  ```

  

- 懒汉式

  ```java
  class Bank {
      private Bank() {
  
      }
  
      private static Bank instance = null;
  
      private static Bank getInstance() {
  ////        方式一: 效率稍差
  //        synchronized (Bank.class){
  //            if(instance == null){
  //                instance = new Bank();
  //            }
  //        }
  //        方式二: 效率稍高
          if (instance == null) {
              synchronized (Bank.class) {
                  if (instance == null) {
                      instance = new Bank();
                  }
              }
          }
          return instance;
      }
  }
  
  
  ```

- 区分饿汉式和懒汉式
  - 饿汉式   
    - 好处：对象加载时间长
    - 坏处：饿汉式是线程安全的
  - 懒汉式
    - 好处：延迟对象的创建
    - 目前的写法坏处：线程不安全

### main()方法的使用说明

- main()方法作为程序入口
- main()方法是一个普通的静态方法。
- main()方法可以作为与控制台的交互方式

### 代码块

- 用来初始化类，对象

- 分为静态代码块和非静态代码块

- 静态代码块

  - 内部可以有输出语句
  - 随着类的加载而执行，且只执行一次
  - 作用：初始化类的信息。
  - 如果一个类中定义了多个静态代码块，则会按照声明的先后顺序执行。
  - 静态代码块的执行要优先于非静态代码块的执行。
  - 静态代码块只能调用静态的属性，静态的方法，不能调用非静态的结构。

  ```java
  class Person {
  	public static int total;
  	static {
  				total = 100;//为total赋初值
  	}
  	…… //其它属性或方法声明
  }
  ```

  

- 非静态代码块

  - 内部可以有输出语句
  - 随着对象的创建而执行
  - 每创建一个对象，执行一次非静态代码块
  - 作用：在创建对象时，对对象属性等进行初始化
  - 如果一个类中定义了多个非静态代码块，则会按照声明的先后顺序执行。
  - 非静态代码块可以调用静态的属性，静态的方法或非静态的属性，非静态的方法。

- 对属性可以赋值的位置：

  1. 默认初始化
  2. 显示初始化
  3. 构造器中的初始化
  4. 有了对象以后，可以通过"对象.属性"或“对象.方法”的方式，进行赋值
  5. 在代码块中赋值

  执行的先后顺序 1 - 2/5 - 3 - 4

**实例化子类对象时，涉及到父类，子类中静态代码块，非静态代码块，构造器的加载顺序。**

父类静态代码块，子类静态代码块，父类非静态代码块，父类构造器，子类非静态代码块，子类构造器

由父及子，静态先行。

### final关键字

- fianl可以用来修饰的结构：类，方法，变量
- final 用来修饰类：此类不能被其他类所继承
- final 用来修饰方法：表明此方法不能被重写
- fianl 用来修饰变量，此时的“变量”成为常量
  - final 修饰属性：可以考虑赋值的位置有：显示赋值，代码块中赋值，构造器中的初始化
  - final 修饰局部变量：使用final修饰形参时，表明此形参是一个常量，调用此方法时，给常量形参赋一个实参，一旦赋值以后，只能在方法内使用此形参，但不能进行重新赋值。
  - static final :用来修饰属性，全局常量。

### abstract关键字的使用

- abstract 可以用来修饰的结构：类，方法

- 修饰类：

  - 通常只包含抽象方法（只包含方法声明），方法的实现由派生出的各个子类完成，使得程序的功能描述和功能实现分离。
  - 一个抽象类可以派生多个子类，所以一个抽象方法可以在多个子类中有多种实现方式。
  - 不能给予抽象类创建对象或者说不能实例化
  - 非抽象类不能包含抽象方法，抽象类可以包含普通成员变量和成员方法。
  - 抽象类一定有构造器，便于子类实例化调用。
  - 开发中，会提供抽象类的子类，让子类对象实例化，完成相关的操作。

- 修饰方法：

  - 抽象方法只有方法的声明，没有方法体

  - 包含抽象方法的类一定是抽象类，抽象类是可以没有抽象方法的

  - 若子类重写了父类中的所有的抽象方法，此方法可实例化

  - 若子类没有重写父类中的所有抽象方法，则此类也是一个抽象类，需要使用abstract修饰。

  - ```java
    public abstract void talk();
    ```

    

- abstract 使用上的注意点

  -   abstract 不能用来修饰：属性，构造器等结构；
  -   abstract 不能用来修饰私有方法，静态方法，final的方法

- 抽象类的匿名子类

  ```java
  		method(new Student());
  		Worker worker = new Worker();
  		method1(worker);//非匿名的类非匿名的对象
  		method1(new Worker());//非匿名的类匿名的对象
  		
  		// 创建了一个匿名类的对象：person
  		Person person = new Person() {
  
  			@Override
  			public void eat() {
  				// TODO Auto-generated method stub
  				System.out.println("吃东西");
  			}
  
  			@Override
  			public void breath() {
  				// TODO Auto-generated method stub
  				System.out.println("好好呼吸");
  			}
  			
  		};
  		method1(person);
  		System.out.println("**********");
  		//创建匿名子类的匿名对象
  		method1(new Person() {
  			@Override
  			public void eat() {
  				// TODO Auto-generated method stub
  				System.out.println("吃好吃的东西");
  			}
  
  			@Override
  			public void breath() {
  				// TODO Auto-generated method stub
  				System.out.println("好好呼吸新鲜的空气");
  			}
  
  		});
  	
  ```

### 

#### 模板方法设计模式（TemplateMethod）

- 多态的应用

- 抽象类体现的是一种模板模式的设计，抽象类作为多个子类的通用模版，子类在抽象类的基础上进行扩展，改造，但子类总体上会保留抽象类的行为方式。

- 当功能内部一部分实现是确定的，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。

- 在软件开发中实现一个算法时，整体步骤很固定，通用，这些步骤已经在父类中写好了。但是某些部分易变，易变部分可以抽象出来，供不同子类实现。这就是一种模板模式。

  ```java
  /*
   * 抽象类的应用：模版方法的设计模式
   */
  public class TemplateTest {
  	public static void main(String[] args) {
  		SubTemplate template = new SubTemplate();
  		template.spendTime();
  	}
  
  }
  
  abstract class Template{
  	// 计算某段代码所需要花费的时间
  	public void spendTime() {
  		// TODO Auto-generated method stub
  		long start = System.currentTimeMillis();
  		
  		code();//不确定的部分，易变的部分
  		
  		long end = System.currentTimeMillis();
  		
  		System.out.println("花费的时间为：" + (end - start));
  
  	}
  	public abstract void code();
  }
  class SubTemplate extends Template{
  
  	@Override
  	public void code() {
  		// TODO Auto-generated method stub
  		
  		for (int i = 2; i <= 1000; i++) {
  			boolean flag = true;
  			for (int j = 2; j <= Math.sqrt(i); j++) {
  				if (i%j == 0) {
  					flag = false;
  					break;
  				}
  				
  				
  			}
  			if (flag) {
  				System.out.println(i);
  			}
  		}
  		
  	}
  	
  }
  
  ```

```java
abstract class Template {
		public final void getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println("执行时间是：" + (end - start));
		}
	public abstract void code();
}
class SubTemplate extends Template {
		public void code() {
			for (int i = 0; i < 10000; i++) {
					System.out.println(i);
			} 
    } 
}
```

- 应用
  -  数据库访问的封装
  -  Junit单元测试
  -  JavaWeb的Servlet中关于doGet/doPost方法调用
  -  Hibernate中模板程序
  -  Spring中JDBCTemlate、HibernateTemplate等



**抽象类的匿名子类**

```java
package com.atguigu.java;
/*
 * 抽象类的匿名子类
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		method(new Student());
		Worker worker = new Worker();
		method1(worker);//非匿名的类非匿名的对象
		method1(new Worker());//非匿名的类匿名的对象
		
		// 创建了一个匿名类的对象：person
		Person person = new Person() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃东西");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸");
			}
			
		};
		method1(person);
		System.out.println("**********");
    
		//创建匿名子类的匿名对象
		method1(new Person() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃好吃的东西");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸新鲜的空气");
			}

		});
	}
	public static void method1(Person person) {
		person.eat();
		person.breath();
	}
	
	public static void method(Student s) {
		
	}

}
class Worker extends Person{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
}

```





### 接口

接口是由常量和抽象方法定义的集合。一个子类只可以继承一个抽象类，但可以继承多个接口，实现了程序设计中的多继承的关系。

**定义**

```java
[public] interface 接口名 [extends 父接口名列表]{
  	//常量声明
  	//抽象方法声明
}
```

**特点**

- public 修饰的是公共接口，可以被所有类和接口使用；没有public修饰的接口则只能被同一个包中的其他类和接口使用。

- 子接口可以继承一个或多个父接口的所有属性和方法

- 所有的常量默认为public static final类型

- 所有的方法默认为 public abtract类型

- 定义Java类的语法格式：先写extends，后写implements

  class SubClass extends SuperClass **implements** InterfaceA{ } 

- 一个类可以实现多个接口，接口也可以继承其它接口。 

-  实现接口的类中必须提供接口中所有方法的具体实现内容，方可实例化。否则，仍为抽象类。

- 接口的主要用途就是被实现类实现。（面向接口编程）
- 与继承关系类似，接口与实现类之间存在多态性。

- 接口和类是并列关系，是一种特殊的抽象类，(在JDK7.0前)只包含常量和方法的定义，没有变量和方法的实现。（Java8）可以为接口添加静态方法和默认方法，可以用接口直接定义静态方法，默认方法，可以通过类的对象来调用。

- 声明一个类来实现多个接口，在类的声明中要包括implements语句，在implenments后列出要实现的多个接口，这些接口名称以逗号分隔。

- 实现接口的类继承了接口中定义的常量，可以直接使用常量名来引用常量，或者接口名.常量名。

- ```
  面试题：抽象类和接口有哪些异同。
   * 相同点：
   * 1.都不能实例化，都可以包含抽象方法的。
   * 不同点：
   * 抽象类和接口（Java7，Java8，Java9）的定义，内部结构解释说明
   * 1.抽象类有构造器，接口不能声明构造器
   * 2.抽象类只能被单继承，接口可以被多继承。
   * 类与接口：多实现
  ```

**体会**

1.接口使用上满足多态性

2.接口，实际上定义了一种规范

3.开发中，面向接口编程



![截屏2021-01-28 下午3.36.05](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%883.36.05-1819411.png)

**接口中的默认方法**

- 若一个接口中定义了一个默认方法，而另外一个接口中也定义了一个同名同参数的方法（不管此方法是否是默认方法），在实现类同时实现了这两个接口时，会出现：接口冲突。解决办法：实现类必须覆盖接口中同名同参数的方法，来解决冲突。

-  若一个接口中定义了一个默认方法，而父类中也定义了一个同名同参数的非抽象方法，则不会出现冲突问题。因为此时遵守：类优先原则。接口中具有相同名称和参数的默认方法会被忽略。

**接口的使用**

- 若要在以前的接口中增加一个方法，为确保使用原接口的类的继承和实现关系不中断，创建一个新的继承接口，把新增的方法写在里面。只需使用新接口的类声明中的接口名，并在类体中编写新方法实现程序。¨
- 如何在子类(或实现类)的方法中调用父类，接口中被重写的方法

```java
public void myMethod(){
		method3();
		super.method3();
		CompareA.super.method3();
		CompareB.super.method3();
}
```



##### 代理模式（Proxy）

为对象提供一种代理以控制这个对象的访问。

```java
package com.atguigu.java;
/*
 * 接口的应用：代理模式
 * 
 */
public class NetWorkTest {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	}

}
interface NetWork{
	public void browse();
	
}
// 被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("真实的服务器访问网络");
	}
	
}
// 代理类
class ProxyServer implements NetWork{
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("联网之前的检查工作");
	}

	@Override
	public void browse() {
		check();
		work.browse();
	}
	
}
```

### 类的内部成员---内部类

当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整的结构又只为外部事物提供服务，那么整个内部的完整结构最好使用内部类。

 1.Java中允许一个类A声明在类B中，则类A就是内部类，类B就是外部类。

2.内部类的分类：成员内部类(静态，非静态) vs 局部内部类（方法内，代码块类，构造器内）

**成员内部类**

![截屏2021-01-28 下午4.15.36](Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-28%20%E4%B8%8B%E5%8D%884.15.36.png)

一方面，作为外部类的成员。

 * 				调用外部类的结构
 * 				可以被static修饰
 * 				可以被4种不同的权限修饰

另一方面，作为一个类

 * 				类可以定义属性，方法，构造器等
 * 				可以被final修饰，表示此类不能被继承，不使用final,可以被继承
 * 				可以被abstract修饰。

1.关注如下的3个问题

1.1 如何实例化成员内部类的对象(静态的，非静态的)

```java
// 创建静态的Dog内部类的实例(静态的成员内部类)
Person.Dog dog = new Person.Dog();
// 创建非静态的Bird内部类的实例(非静态的成员内部类)
// Person.Bird bird = new Person.Bird(); 错误的
Person p = new Person();
Person.Bird bird = p.new Bird(); 
```

1.2 如何在成员内部类中区分调用外部类的结构

```java
class Person{
		String name = "小明";
		public void eat(){
		
		}
		//非静态成员内部类
		class Bird{
				String name = "杜鹃";
				public void display(String name){
						System.out.println(name);//方法的形参
						System.out.println(this.name);//内部类的属性
						System.out.println(Person.this.name);//外部类的属性
						//Person.this.eat();
				}
		}
}
```



2.局部内部类的使用 

```java
//返回一个实现了Comparable接口的类的对象
public Comparable getComparable(){
			// 创建一个实现Comparable接口的类：局部内部类
			// 方式一：
			class MyComparable implements Comparable{
					public int comparaTo(Object o){
							return 0;
					}
			}
			return new MyComparable();
}
```

```java
//返回一个实现了Comparable接口的类的对象
public Comparable getComparable(){
			// 创建一个实现Comparable接口的类：局部内部类
			// 方式二：
		return new Comparable(){
      	public int comparaTo(Object o){
          	 return 0;
        }
    };
}
```

总结：成员内部类和局部内部类，在编译以后，都会生成字节码文件。

格式： 成员内部类：外部类$内部类名.class

​             局部内部类：外部类$数字 内部类名.class
 * 在局部内部类的方法中,如果调用局部内部类所声明的方法中的局部变量的话，要求此局部变量声明为final。
 * jdk 7及之前的版本，要求此局部变量显示的声明为final的
 * jdk 8及之后的版本，可以省略final的声明

5.**分类： 成员内部类**（static成员内部类和非static成员内部类）

   	         **局部内部类**（不谈修饰符）、匿名内部类

**如何使用局部内部类**

- 只能在声明它的方法或代码块中使用，而且是先声明后使用。除此之外的任何地方


都不能使用该类 

- 但是它的对象可以通过外部方法的返回值返回使用，返回值类型只能是局部内部类


的父类或父接口类型

- 局部内部类可以使用外部类的成员，包括私有的。 
- 局部内部类可以使用外部方法的局部变量，但是必须是final的。由局部内部类和局

部变量的声明周期不同所致。

- 局部内部类和局部变量地位类似，不能使用public,protected,缺省,private

- 局部内部类不能使用static修饰，因此也不能包含静态成员


##### **匿名内部类**

匿名内部类不能定义任何静态成员、方法和类，只能创建匿名内部类的一个实例。一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。

 **格式：**

```java
new 父类构造器（实参列表）|(实现接口) (){
		//匿名内部类的类体部分

} 
```

 **匿名内部类的特点**

- 匿名内部类必须继承父类或实现接口


-  匿名内部类只能有一个对象


-  匿名内部类对象只能使用多态形式引用


```java
package com.atguigu.java1;
/*
 * 接口的使用
 * 1.接口使用上满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程
 */
public class USBTest {
	public static void main(String[] args) {

		// 1.创建了接口的非匿名实现类的非匿名对象。
		Computer computer = new Computer();
		Flash flash = new Flash();
		computer.transferData(flash);
    
		// 2.创建接口的非匿名实现类的匿名对象。
		computer.transferData(new Printer());
    
		// 3.创建接口的匿名实现类的非匿名对象。
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
			
		};
		computer.transferData(phone);
    
		// 4.创建了接口的匿名实现类的匿名对象
		computer.transferData(new USB() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("mp3开始工作");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("mp3结束工作");
			}
		});

	}

}

class Computer {
	public void transferData(USB usb) {
		usb.start();

		System.out.println("具体传输数据的细节");

		usb.stop();
	}
}

interface USB {
	// 定义了长，宽，最大最小的传输速度
	void start();

	void stop();

}

class Flash implements USB {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U盘结束工作");
	}

}

class Printer implements USB {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开始工作");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机结束工作");
	}

}
```



# 第七章 异常

**Error:**Java虚拟机无法解决的严重问题。如JVM系统内部错误，资源耗尽等严重情况，一般不编写针对性的代码进行处理。

```java
 	// 1.栈溢出:java.lang.StackOverflowError
//		main(args);
		// 2.堆溢出:java.lang.OutOfMemoryError
//		Integer[] arr = new Integer[1024*1024*1024];
```

```
 * 一，异常体系结构
 * java.lang.Throwable
 * 		-----java.lang.Error:一般不编写针对性的代码进度信息
 * 		-----java.lang.Exception:可以进行异常处理
 * 			> 编译时异常(checked)
 * 				>IOException
 * 					>FileNotFoundException
 * 				>ClassNotFoundException
 * 			>运行时异常(unchecked,RuntimeException)
 * 				>NullPointerException
 * 				>ArrayIndexOutOfBoundException
 * 				>ClassCastException
 * 				>NumberFormatException
 * 				>InputMismatchException
 * 				>ArithmeticException
 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型。
  异常对象的产生：
 * 1.系统自动生成的异常对象
 * 2.手动的生成一个异常对象，并抛出throw
```

### 处理方式

##### try-catch-finally

```
 
  try{
    //可能出现的异常代码
  }catch(异常类型1 变量名1){
  // 处理异常的方式1
  }catch(异常类型2 变量名2){
   // 处理异常的方式2
  }
   ...
   finally{
   // 一定执行
   }
 
```

说明：

1.finally可选

2.try将可能出现异常的代码包起来，在执行过程中一旦生成异常，会生成异常对象，会与catch括号写的异常对象匹配，匹配成功就进行异常处理，如果没有finally，将会继续执行后面的代码，则在catch外面声明变量，在catch里面进行赋值。

3.如果catch有子父类关系，一般子类写在父类上面

4.catch常用方法，1. String getMessage(),2.printStackTrace()

5.在try里面定义的变量在外面不能用,try-catch-finally 处理编译时异常，运行时仍可能报错。

6.try-catch-finally 可以嵌套

finally 

1.finally中声明的是一定会执行的代码，

即使catch有异常，try,catch中有return的情况

2.像数据库连接，

输入输出流，网络编程Socket等资源，JVM是不能自动的回收的，需要自己动手进行资源的释放。

此时资源的释放需要声明在finally中

体会：

1.try-catch-finally 将编译时异常延迟到运行时出现。

2.针对编译时异常，一定进行异常的处理

##### throws  + 异常类型

```
 * 异常处理的方式二：throws + 异常类型
 * 1.写在方法的声明处，指明方法声明时可能会抛出的异常类型。一旦方法执行时，出现异常，仍会在异常代码处生成异常对象，此对象满足throws后异常类型时，就会被抛出，出现异常，在异常后面的代码就不再执行了
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
```

```java
/*
 * 异常对象的产生：
 * 1.系统自动生成的异常对象
 * 2.手动的生成一个异常对象，并抛出throw
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		try {
			Student student = new Student();
			student.regist(-1001);
			System.out.println(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		}else {
//			System.out.println("你输入的数据非法！");
//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("你输入的数据非法");
			throw new MyException("不能输出负数");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}

```



### 自定义异常

```java
/*
 * 如何自定义异常类？
 * 1.继承于现有的异常结构：RuntimeException,Exception
 * 2.提供全局常量:serialVersionUID的任意值
 * 3.提供重载的构造器
 * 
 */
 public class MyException extends RuntimeException{
	
	 static final long serialVersionUID = -7034897990745766939L;
	 
	 public MyException() {
		 
	 }
	 public MyException(String msg) {
		 super(msg);
	 }


}

```

