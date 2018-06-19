
#### 常量与变量

>常量


- val

- 类似Java的final

- 不能重复赋值

```Kotlin
//运行时常量.
 val i = 5 
//编译期时常量.在编译期的时候编译器就知道它是一个常量 
//加了const关键字后和java中被final修饰的常量是完全一样
 const val i = 5 
```

>变量

- var 
- 可以重复赋值

```
var s = "你好"
    s = "再见"
```

>类型推导

即编译器可以猜出你声明的变量或常量的类型.所以你可以声明变量的时候不写类型

```Kotlin
//比如这样
val j = 12
//而不是这样写
val j : Int = 12
```

#### Lambda表达式

Lambda表达式是什么?

- 匿名函数
- 写法:{[参数列表]->[函数体,最后一行是返回值]}

```Kotlin
val sum = {a:Int,b:Int->a+b}
```

Lambda表达式的类型表示举例

-    ()->Unit 无惨.返回值Unit
- (Int)->Int 传入整形,返回一个整形
- (String,(String)->String)->Boolean 传入字符串 Lambda表达式 ,返回Boolean

Lambda表达式的调用

- 用()进行调用
- 等价于invoke()

```
val sum = {a:Int,b:Int->a+b}
sum(1,2)
sum.invoke(1,2)
```

Lambda表达式的简化

- 函数参数调用时最后一个Lambda可以移出去
- 函数参数只有一个Lambda,调用时小夸号可以省略
- Lambda只用一个参数可以默认为it
- 入参 返回值与形参一致的函数可以用函数的引用方式作为实参的传入

#### Try Catch异常捕获
 
finally中的代码一定会执行并且先执行

```Kotlin
fun main(args: Array<String>) {
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        0
        e.printStackTrace()
    } finally {
        println(666)
    }
    println(result)
}
```

#### 具名参数 变长参数 默认参数

具名参数 : 给函数的实参附上形参

```
fun sum(args1:Int,args2:Int)=args1+args2
sum(args1=2,args2=3)
```

变长参数 : 某个参数可以接收多个值 可以不为最后一个参数 若传参有歧义时 需用具名参数

```
fun main(vararg args: String) {

    val list = arrayListOf(1,3,4,5)
    val array = intArrayOf(1,3,4,5)
    hello(3.0, *array)
}

fun hello(double: Double, vararg ints: Int, string: String = "Hello"){
    println(double)
    ints.forEach(::println)
    println(string)
}
```

默认参数 : 为函数参数指定默认值 可以为任意位置的参数指定默认值 若传参有歧义时 需用具名参数

*(星号这个不能算一般意义上的运算符)

- 只支持展开array
- 只能用于变长参数列表的实参
- 不能重载