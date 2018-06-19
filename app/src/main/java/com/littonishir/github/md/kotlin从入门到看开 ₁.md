
<!--上标：º ¹ ² ³ ⁴⁵ ⁶ ⁷ ⁸ ⁹ ⁺ ⁻ ⁼ ⁽ ⁾ ⁿ ′ ½下标：₀ ₁ ₂ ₃ ₄ ₅ ₆ ₇ ₈ ₉ ₊ ₋ ₌ ₍ ₎-->

Kotlin作为JetBrains开发的一门新语言,所以我们还是从语言上来学习它,用的IDE是JetBrains开发的IDEA.

### 数据类型
Boolean Number(Byte Short Int Long Double Float) Char
在kotlin中不再区分基本数据类型和装箱数据类型,在需要的时候编译器会自动帮我们选择
#### Boolean
```kotlin
val b1 : Boolean = true
val b2 : Boolean = false
```

#### Number


浮点型 

- Double 64位宽
- Float  32位宽
 
字节 
- Byte 8位宽


整型 
- Short 16位宽
- Int   32位宽
- Long  64位宽

```kotlin
val anInt: Int = 8
val anotherInt: Int = 0xFF
val moreInt: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE//MAX_VALUE MIN_VALUE均是数字的属性可直接取到
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 12368172397127391
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F//2.0默认是Double类型 若想将2.0赋值给一个Float需要在其后面加F
val anotherFloat: Float = 1E3f//1*10^3
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = -Float.MAX_VALUE

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double= Double.MAX_VALUE
val minDouble: Double= -Double.MAX_VALUE

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println("16进制:"+anotherInt)
    println("2进制:"+moreInt)

    println("Int最大值:"+maxInt)
    //Int最大值取值范围
    println(Math.pow(2.0, 31.0) - 1)
    println("Int最小值:"+minInt)
    //Int最小值取值范围
    println( - Math.pow(2.0, 31.0))
    println()

    println("Long最大值:"+maxLong)
    println(Math.pow(2.0, 63.0) - 1)
    println("Long最小值:"+minLong)
    println(- Math.pow(2.0, 63.0))
    println()

    println("Float:"+aFloat)
    println("1*10^3:"+anotherFloat)
    println("Float最大值:"+maxFloat)
    println("Float最小值:"+minFloat)
    println()

    println("Double最大值:"+maxDouble)
    println("Double最小值:"+minDouble)
    println()

    println("Short最大值:"+maxShort)
    println("Short最大值:"+minShort)
    println()

    println("Byte最大值:"+maxByte)
    println("Byte最大值:"+minByte)
}
```
打印结果

```
16进制:255
2进制:3
Int最大值:2147483647
2.147483647E9
Int最小值:-2147483648
-2.147483648E9

Long最大值:9223372036854775807
9.223372036854776E18
Long最小值:-9223372036854775808
-9.223372036854776E18

Float:2.0
1*10^3:1000.0
Float最大值:3.4028235E38
Float最小值:-3.4028235E38

Double最大值:1.7976931348623157E308
Double最小值:-1.7976931348623157E308

Short最大值:32767
Short最大值:-32768

Byte最大值:127
Byte最大值:-128
```
#### Char

- Char占两个字节 16位宽
- Char用单引号'' 引起来,例如:'a','0','\n' 

```kotlin
val aChar: Char = '0'
val bChar: Char = '中'
val cChar: Char = '\u000f'

fun main(args: Array<String>) {
    println(aChar)
    println(bChar)
    println(cChar)
}
```
打印结果

```
0
中
  //这里是一个换行符
```

补充转义字符

```k
 \t  制表符
 \b  光标后退一个字符
 \n  回车
 \r  光标回到行首
 \'  单引号
 \"  双引号
 \\  反斜杠
 \$  美元符号,kotlin支持美元 符号开头的字符串模板
```

#### 基本数据类型转换与字符串

在kotlin中不可隐士转换

```k
val anint : Int = 5
val along : Long = anint.toLong()
```
字符串的比较

- a = = b 表示比较内容,类似java的equals
- a = = = b 表示比较对象是否相同

字符串模板

"Hello, $name" => "Hello, 东方月初" 

```kotlin
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e','l','l','o','W','o','r','l','d'))
//charArrayOf :Char数组构建
fun main(args: Array<String>) {
    println(string == fromChars)
    println(string === fromChars)

    println("输出:" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))
    //字符串模板
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    //Hello "Trump"
    val sayHello : String = "Hello \"Trump\""
    println(sayHello)

    val salary: Int = 1000
    //$salary:是取到salary的值
    println("$salary")
    //原始字符串 原样输出字符串 转义字符也没有用(但是$还是可以用的)
    val rawString: String = """
/*****************************/
        嘴不点而含丹
        眉不画而横翠
        \t
        \n
        \$salary
/*****************************/
    """
    println(rawString)
    println(rawString.length)
}
```

打印结果

```
true
false
输出:HelloWorld
0 + 1 = 1
0 + 1 = 1
Hello "Trump"
1000

/*****************************/
        嘴不点而含丹
        眉不画而横翠
        \t
        \n
        \1000
/*****************************/
    
135
```

#### 类与继承

```
class 类名 (构造方法) {
	init{//构造函数初始化}
}
```
示例代码

```kotlin
//在kotlin中继承 要主动打开open
open class person(var name: String, var sex: String, var voice: String) {
    init {
        println("new a ${this.javaClass.simpleName}, name:$name, sex:$sex, voice:$voice")
    }
}
//继承 : 类名(参一,参二)
class girl(name: String, sex: String, voice: String) : person(name, sex, voice) {}

fun main(args: Array<String>) {
    val mygirl: girl = girl("涂山苏苏", "女狐妖", "甜美\":道士哥哥,这是给你的五彩棒~\"")
    println(mygirl is person)
}

```

打印结果

```
new a girl, name:涂山苏苏, sex:女狐妖, voice:甜美":道士哥哥,这是给你的五彩棒~"
true
```

#### 空类型

任意类型都有可空和不可空两种

```
val notNull : String = null //错误.不能为空
val nullable : String? = null //正确 .?表示可以为空
notNull.length //正确.不为空的值可以直接使用
nullable.length //错误.可能为空,不能直接获取长度
nullable!!.length //正确.!!表示强制认定(我知道它不为空的意思)
nullable?.length //正确.若为空,返回空.不为空返回长度
```

#### 智能类型转换

Java Style 类型转换

```Kotlin
//类似于Java Style 类型转换.失败则抛异常
val student : Student = person as Student
```

安全类型转换

```Kotlin
//如果转换失败.返回null.不抛异常
val student : Student? = person as? Student
```

智能类型转换

```
//编译器尽可能的推导类型,避免无用的类型转换
if(person is Student) person.<子类的成员>
//因为nullable不为空.所以可以直接使用它的成员.不用强转
if(nullable != null) nullable.length
```

#### 区间

基本写法
0...100 表示[0,100]
0 until 100 表示[1,100)不包含100
10 in 1...100 表示判断10是否在[1,100]中


```Kotlin
val range: IntRange = 0..1024 // [0, 1024]
val range_exclusive: IntRange = 0 until 1024 // [0, 1024) = [0, 1023]

val emptyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(50))
    println(50 in range)
//for循环的写法
    for(i in range_exclusive){
        print("$i, ")
    }
}
```

#### 数组

数组即一些列的对象

基本写法

```Kotlin
//String即元素类型 自己想放什么类型就可以放什么类型
val array : Array<String> = ArrayOf("我", "是", "码农")
```

示例代码

```Kotlin
val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("一", "个", "码农")
val arrayOfInts: Array<Int> = arrayOf(1, 2, 3, 4)


fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
		//输出第i个成员
        println(int)
    }
    println(arrayOfChar.joinToString(""))
//数组切片1...2即取索引为1,2的元素
    println(arrayOfInt.slice(1..2))
}
```

打印结果

```
4
1
3
5
7
HelloWorld
[3, 5]

```