 

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

![截屏2020-12-24 下午9.22.06](/Users/wyj/Documents/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.22.06.png)

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

![截屏2020-12-24 下午9.41.35](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.41.35.png)

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

![截屏2020-12-24 下午9.54.46](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.54.46.png)

类似这样![截屏2020-12-24 下午9.56.14](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%889.56.14.png)

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

![截屏2020-12-24 下午10.30.11](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%8810.30.11.png)

3.知道路径后，进入到文件路径下如图

输入以下命令，返回运行结果。证明配置成功，可以进一步接下来的学习啦！

```sh
cd /Users/wyj/Java   # cd +(your path)
```

```java
java HelloWorld.java //java +(your filename)
```

![截屏2020-12-24 下午10.37.24](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2020-12-24%20%E4%B8%8B%E5%8D%8810.37.24.png)

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

## 标识符命名规则

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

#### 1.数据类型的优先级

(Short,byte,char) --> int --> long --> float --> double

#### 2.自动转换和强制转换

- 赋值变量的数据类型优先级高于表达式结果数据类型的优先级-->表达式结果数据类型的优先级被自动转换为赋值变量的数据类型优先级
- 若低于或同级，则表达式数据类型强制转换为赋值变量的数据类型

### 复合数据类型

- 类

- 接口

- 数组

## 变量和常量

### 变量

![截屏2021-01-07 下午2.35.47](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%882.35.47-0001463-0001476.png)

![截屏2021-01-07 下午2.36.35](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%882.36.35-0001412.png)

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

![截屏2021-01-04 上午11.21.32](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8A%E5%8D%8811.21.32-9730570.png)

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

![截屏2021-01-04 下午10.45.09](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8B%E5%8D%8810.45.09-9771615.png)



## ![截屏2021-01-04 下午10.48.06](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-04%20%E4%B8%8B%E5%8D%8810.48.06-9771713.png)

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

   ![截屏2021-01-05 下午7.12.59](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-05%20%E4%B8%8B%E5%8D%887.12.59-9845196.png)

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

   

# 第四章面向对象

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

-  内存解析

  堆 存放对象实例

  栈 存储局部变量

  方法区 存储被虚拟机加载的类信息，常量，静态变量，即时编译器编译后的代码等数据

 command + option + 左 回到调用的地方 + 右 函数详情

![截屏2021-01-07 上午11.52.18](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8A%E5%8D%8811.52.18-9991551.png)

面向对象中两个重要的概念：

类：对一类事物的描述，是抽象的，概念上的定义

对象：是实际存在的该类事物的每一个个体，也称为实例(instance)

- 面向对象程序设计的重点是类的设计
- 设计类，就是设计类的成员

说明：

- 属性 = 成员变量 = field = 域 ,字段
- 方法 = 成员方法 = 函数 = method
- 创建类的对象 = 类的实例化 = 实例化类

## 对象

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
/**
 * 一，理解“万物万物皆对象”
 * 1.在Java语言范畴中，将功能，结构等封装到类中，通过类的实例化，来调用具体的功能结构
 *  	
 * 2.涉及Java语言与前端HTML，后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类，对象
 * 二，内存解析说明
 * 引用类型的变量 只可能储存两类值：null 或 地址值（含变量的类型）
 * 三，匿名对象的使用
 * 1.理解：创建的对象，没有显示的赋给一个变量名，即为匿名对象
 * 2.特征：匿名对象只能调用一次。
 * 3.使用
 * @Description 
 * @author Olivia Email:2736737597@qq.com
 * @version
 * @date 2021年1月7日下午2:50:59
 * 
 */
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



### 对象的创建

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

![截屏2021-01-07 下午12.10.37](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%8812.10.37-9992698.png)

编译完源程序以后，生成一个或多个字节码文件。

使用JVM中的类的加载器和解释器对生成的字节码文件进行解释运行。意味着，将字节码文件对应的类加载到内存中，涉及到内存解析。

![截屏2021-01-07 下午12.21.51](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-07%20%E4%B8%8B%E5%8D%8812.21.51-9993332.png)

虚拟机栈，即平时提到的栈结构，将局部变量存储在栈结构中

堆，将new出来的结构(数组，对象)加载在堆空间中。补充，对象的属性(非static)加载在堆空间中。

方法区，类的加载信息，常量池，静态域

### 对象的使用

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

## 包

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

## 面向对象上

描述一组具有公共状态和行为的对象的原型。

1. 一个Java文档可以包含多个类，但最多只能有一个为公共类
2. 如果存在public class，该类的类名必须与文档名相同
3. main方法是Java应用程序的入口，如果文档存在public class和main方法，则main方法必须位于public class 中。

### 类声明

##### 类修饰符

- public 可以被任何包中的类访问，在一个类中使用其他包中的类，必须在程序中增加import语句
- abstract 一个抽象类包含抽象方法，抽象方法是没有方法体的方法。只能用于衍生子类，不能实例化。
- final 不能被继承的类，不能派生子类
- 默认为firendly类

##### 说明一个父类

extends关键字用来告诉编译器创建的类是从父类继承来的子类。

`class 类名 extends 父类名{} `

##### 说明一个类所实现的接口

Implements 关键字类告诉编译器类实现的接口，一个类可以实现多个接口，多个接口用逗号分隔。接口主要为了使程序的功能描述和功能的具体实现相分离。

`implements interface1,interface2~;`

##### 工具类的封装

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



### 成员变量和常量

#### 1.变量

- 成员变量（位于类方法体以外的变量）

  - 实例成员变量
    1. 每次创建类的新对象时，系统就会为该对象创建实例变量的副本，该对象每个实例变量都有自己的内存空间
    2. 通过对象名访问这些实例变量
  - 类成员变量（静态成员变量）
    1. 第一次调用类的时候，系统为类变量分配一次内存。不管以后创建多少个对象，所有对象都共享该类的变量。
    2. 通过类名或某个对象来访问类变量


- 方法变量（位于方法体内的变量）(局部变量)

- 成员变量（属性）和局部变量的不同点

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

#### 2.常量

- 成员常量
- 方法常量

`final datatype CONSTANTNAME=值或表达式`

用final声明，常量名全部用大写字母

#### 3.成员变量和常量

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



### 方法的声明与实现

##### 方法定义形式

```
[权限修饰符]返回类型 方法名(参数列表)[throw 异常类型]{
//方法体
}
```

权限修饰符：private , public , friendly , protected

返回值类型：

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

##### 方法的返回类型

​	可以是Java中任意的数据类型，当不需要返回类型时，返回类型必须是void。

​	return返回值类型必须和方法声明的返回类型一致

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
  		second(v, i); System.out.println(v.i);
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

![截屏2021-01-09 下午9.15.20](/Users/wyj/Documents/Java%E5%9F%BA%E7%A1%80.assets/%E6%88%AA%E5%B1%8F2021-01-09%20%E4%B8%8B%E5%8D%889.15.20-0198163.png)

形参会创建一份对象v和i；

是否有返回值方法的调用分为

1. 以表达式方式被调用
2. 以语句方式被调用(无返回值)
3. 通过对象来调用(无返回值)

可变个数形参的方法

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

##### 方法体中的局部变量

方法体中声明的变量，例如，形参

1. 局部变量不允许使用Java修饰符修饰
2. 不会被初始化，没有默认值。

##### this关键字

用来表示当前类

- 当成员变量的名字和局部变量的名字相同时，在方法中访问成员变量使用
- 访问当前类的成员变量和方法
- 辅助调用类的构造方法，尤其是当构造方法有多个时。

当构造方法有多个，创建对象时调用哪个构造方法，取决于用户给出的参数

```java
/*
 * this 关键字的使用
 * 1.this可以用来修饰，调用属性，方法，构造器
 * 2.this修饰属性和方法：
 * 	this理解为：当前对象 或 当前正在创建的对象
 * 
 * 	2.1 在类的方法中，可以使用“this.属性”或"this.方法"的方式，调用当前对象属性或方法。
 * 但是，通常情况省略"this.".特殊情况下，如果方法的形参和类的属性同名时，必须显示的
 * 使用“this.变量”的方式，表明变量是属性，而非形参。
 * 
 * 	2.2 在类的构造器中，可以使用“this.属性”或"this.方法"的方式，调用当前正在创建的对象属性或方法。
 * 但是，通常情况省略"this.".特殊情况下，如果构造器的形参和类的属性同名时，必须显示的
 * 使用“this.变量”的方式，表明变量是属性，而非形参
 * 
 * 3. this构造器
 * 		1.在类构造器中，可以显示的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 * 		2.构造器中不能通过"this(形参列表)"方式调用自己
 * 		3.如果一个类中有n个构造器，则最多有n-1个构造器使用了"this(形参列表)"
 * 		4.规定："this(形参列表)"必须声明当前构造器的首行
 * 		5.构造器内部:最多只能声明一个"this(形参列表)"，用来调用其他的构造器
```



### 构造器

- “两同一不同”：同一个类，相同方法名，参数列表不同，参数类型不同
- 跟方法的权限修饰符，返回值类型，形参变量名，方法体都没有关系
- 在通过对象调用方法时，如何确定某个指定方法  1.方法名 2.参数列表

作用：1.便于在基于类创建对象时向对象传递参数，2.对类的成员变量进行初始化。

1. 每个类都有一个默认的构造方法，其既无参数，也无返回值，其作用是使用new操作符创建新对象后初始化新建的对象。
2. 一旦为类编写了构造方法，默认构造方法将被覆盖。
3. 仅在使用new操作符创建新对象时执行一次，，一般不能用“对象名.方法名”显式调用
4. 构造方法支持方法重载。
5. 构造方法的名称必须与类名完全相同，不返回任何值，没有类型，“void”也不行
6. 构造方法不呢个被static, final,abstract,synchronized和native等修饰符修饰，且带参数的构造方法不能被子类继承。

```java
/*
 * 类的构造之三：构造器(或构造方法,constructor)的使用
 * construct:建设，建造 constructor:建设者
 * 一，构造器的作用
 * 1.创建对象
 * 2.初始化对象的信息
 * 
 * 二，说明
 * 1.如果没有显示的定义类的构造器，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式，权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦显示定义了类的构造器之后，系统就不再提构默认的空参构造器
 * 5.一个类中至少有一个构造器
 */
```

### 习题

1. 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩 score(int)。 

 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。 

 问题一:打印出3年级(state值为3)的学生信息。 

 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息

```java
package com.atguigu.exer;
/*
 * 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩 score(int)。 
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。 
 * 问题一:打印出3年级(state值为3)的学生信息。 
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
	public static void main(String[] args){
		// 声明 Student 类型的数组
		Student[] stu = new Student[20];
		for(int i = 0;i < stu.length;i++){
			// 给数组元素赋值
			stu[i] = new Student();
			stu[i].number = i+1;
			// 年级：[1,6]
			stu[i].state = (int)(Math.random()*(6-1+1)+1);
			// 成绩：[0,100]
			stu[i].score = (int)(Math.random()*(100-0+1)+0);
		}
		// 创建测试对象
		StudentTest test = new StudentTest();
		test.print(stu);
		System.out.println("查找三年级的学生成绩：");
		test.SearchState(stu,3);
		test.sort(stu);
		System.out.println("排序后：");
		test.print(stu);
		
	} 	
		/**
		 * 
		 * @Description 遍历Student[]数组的操作
		 * @author Olivia
		 * @date 2021年1月6日下午7:52:06
		 * @param stu
		 */
		public void print(Student[] stu){
			for(int i = 0;i < stu.length;i++) {
				System.out.println(stu[i].info());
			}
		}
		//查找
		/**
		 * 
		 * @Description 查找Student数组中指定年级的学生信息
		 * @author Olivia
		 * @date 2021年1月6日下午7:49:38
		 * @param stu  要查找的数组
		 * @param state  要找的年级
		 */
		public void SearchState(Student[] stu,int state) {
			for(int i = 0;i < stu.length;i++) {
				if(stu[i].state == 3) {
					System.out.println(stu[i].info());
				}
			}
		}
		/**
		 * 
		 * @Description 给Student数组排序
		 * @author Olivia
		 * @date 2021年1月6日下午7:51:27
		 * @param stu
		 */
		public void sort(Student[] stu) {
			for(int i = 0;i < stu.length-1;i++) {
				for(int j = 0;j < stu.length-1-i;j++) {
					if(stu[j].score < stu[j+1].score){
						// 如果需要换顺序，交换的是数组的元素，Student对象
						Student temp = stu[j];
						stu[j] = stu[j+1];
						stu[j + 1] = temp;
					}		
				}	
			}
		}
}

class Student {
	int number;
	int state;
	int score;

	String info() {
		return "学号" + number + "年级" + state + "成绩" + score;

	}
}
```



### 封装

将代码及其处理的数据绑定在一起的一种编程机制，保证程序不受外部干扰且不被误用。

- 模块化，对代码的编写和维护可以独立进行，重用性
- 数据隐藏，自身维护自身数据和方法

```java
/*
 * 面向对象的特征一：封装与隐藏
 * 一·问题的引入
 * 创建一个类的对象以后，通过“对象.属性”的方式，
 * 对对象的属性进行赋值。赋值操作受到属性的数据类型和存储范围的制约。
 * 除此之外，没有其他制约条件。
 * 但是实际问题中，往往需要给属性赋值加入额外的限制条件，
 * 这个条件不能在属性声明时体现，只能通过方法进行限制条件的添加。(比如setlegs)
 * 同时避免用户再使用“对象.属性”的方式对属性进行赋值，则需要将属性声明为私有的(private)
 * --->此时，针对于属性就体现了封装性。
 * 
 * 二·封装性的体现:
 * 将类的属性XXX私有化(private),同时，
 * 提供公共的public方法获取(getXXX)和设置(setXXX)
 * 拓展：封装性的体现，不对外暴露私有的方法，单例模式等等
 * 三·封装的体现，需要权限修饰符来配合
 * 1.Java规定的4种权限（从小到大排列）:private,缺省,protected,public
 * 2.4种权限可以用来修饰类及类的内部结构：属性，方法，构造器，内部类
 * 3.具体的，4种权限可以用来修饰类的内部结构；属性，方法，构造器，内部类
 * 			修饰类的话，只能使用：缺省,public
 * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，
 * 体现类及类的内部结构在被调用时的可见性的大小
 *
 *
 * JavaBean是一种Java语言写成的可重用组件。
 * 所谓javaBean，是指符合如下标准的Java类: 
 * 		>类是公共的
 * 		>有一个无参的公共的构造器 
 * 		>有属性，且有对应的get、set方法
 /
```



操作的先后顺序

1. 默认初始化
2. 显示初始化
3. 构造器中的初始化
4. 通过“对象.方法”或“对象.属性”的方式，赋值

## 面向对象中

### 继承

- 一个父类可以拥有多个子类，是所有子类的公共变量和公共方法的集合

- 子类不受父类提供的状态和行为的限制，可以增加自己的方法。扩充。

- 覆盖继承。

- 所有类都默认Object类(java.lang.Object)，Object类位于类的最上层，所有类都是Object类的子类。

  ```
  [类的修饰符]class <子类名> extends <父类名>{
  //类体
  }
  ```

### 隐藏

- 子类可以继承父类的成员变量和成员方法，如果一个成员变量同时被父类和子类中定义，那么在创建对象后，它们是同时存在的，并且父类的成员变量用于父类的方法，子类的成员变量用于子类的方法。子类从父类继承的该成员变量将被隐藏。

- 创建对象时，系统会先调用父类的构造方法，然后调用子类的构造方法。

- 子类继承父类的成员变量，即公共成员变量时，子类修改改成员变量的值的时候，父类该变量的值也被修改。

### 覆盖

- 子类重新定义了从父类继承的方法，定义一个同名，同类型，同参数的方法。
- 使用子类创建对象时，可以直接引用父类的fangfa

区别：

1. 子类隐藏父类的成员变量只是使之不可见，父类的同名成员变量在子类对象中仍然拥有自己独立的内存空间；而子类方法对父类方法的覆盖将清除父类方法占用的内存空间，使得父类方法在子类对象中不再存在。
2. 子类不能覆盖父类中final方法和static方法，但可以隐藏这类方法，在子类中声明与父类同名的final方法和static方法。

### 构造方法

- 子类无条件继承父类的无参数的构造方法
- 如果子类没有构造方法，则它将继承父类无参数的构造方法作为自己的构造方法；如果子类定义了构造方法，则子类创建对象时，先调用父类的无参构造方法，再执行子类的构造方法。若想调用父类的有参构造方法，可使用super关键字。
- 对于父类带参数的构造方法，子类可以通过自己的构造方法中使用super关键字来调用，但这个调用必须在子类构造方法中的第一条可执行语句。

```java
/*
 * 类的构造之三：构造器(或构造方法,constructor)的使用
 * construct:建设，建造 constructor:建设者
 * 一，构造器的作用
 * 1.创建对象
 * 2.初始化对象的信息
 * 
 * 二，说明
 * 1.如果没有显示的定义类的构造器，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式，权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦显示定义了类的构造器之后，系统就不再提构默认的空参构造器
 * 5.一个类中至少有一个构造器
 */
```





super关键字

- 访问父类无参构造方法：super();
- 访问父类的有参构造方法：super(参数列表);
- 访问父类的成员变量：super.成员变量名称

### 子类对象和父类对象特点

1. 子类创建的对象可以赋值给父类对象，此时父类对象调用的是子类的方法和变量（这些方法在父类中本身就存在，虽然已被偷梁换柱）
2. 只能把子类对象赋值给父类

## 多态性

一个对外接口，多个内在实现方法。

- 方法重载，一个类中定义多个同名方法，程序在调用方法时，系统会自动根据参数类型，个数和顺序的不同调用不同的方法，
- 方法覆盖，调用对象的某个方法，现在子类中查找此方法。如果找到则调用子类方法，否则，在父类中查找此方法。父类与子类之间方法的多态性。

## 抽象类

- 通常只包含抽象方法（只包含方法声明），方法的实现由派生出的各个子类完成，使得程序的功能描述和功能实现分离。
- 一个抽象类可以派生多个子类，所以一个抽象方法可以在多个子类中有多种实现方式。

```java
public abstract class PlaneGraohcs1{
  	private String shape;
  	public abstract double area();
}
```

- 不能给予抽象类创建对象
- 非抽象类不能包含抽象方法，抽象类可以包含普通成员变量和成员方法。

## 接口

接口是由常量和抽象方法组成的特殊类。一个子类只可以继承一个抽象类，但可以继承多个接口，实现了程序设计中的多继承的关系。

### 定义

```java
[public] interface 接口名 [extends 父接口名列表]{
  	//常量声明
  	//抽象方法声明
}
```

- 必要部分：interface关键字和接口的名字
- public 修饰的是公共接口，可以被所有类和接口使用；没有public修饰的接口则只能被同一个包中的其他类和接口使用
- 子接口可以继承一个或多个父接口的所有属性和方法
- 接口中，所有的常量默认为public static final类型，所有的方法默认为 public abtract类型

### 实现

- 如果一个类实现一个接口，那么这个类就应该实现提供接口中定义的所有抽象方法的具体实现。
- 声明一个类来实现多个接口，在类的声明中要包括implements语句，在implenments后列出要实现的多个接口，这些接口名称以逗号分隔。
- 实现接口的类继承了接口中定义的常量，可以直接使用常量名来引用常量或者接口名.常量名
- 如果一个类中没有实现接口中声明的所有方法

### 接口的使用

若要在以前的接口中增加一个方法，为确保使用原接口的类的继承和实现关系不中断，创建一个新的继承接口，把新增的方法写在里面。只需使用新接口的类声明中的接口名，并在类体中编写新方法的实现程序。

# 异常

处理方式

try-catch-finally

throws  + 异常类型