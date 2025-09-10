# JavaScript 基础学习笔记

## 预备知识

[001 Course Structure and Projects_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=1&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

###  Code Editor

​		代码编辑器推荐：VScode Adam等 

​		推荐使用VScode

###  Java与JavaScript的关系

​		**毫无关系！！** 

###  学习整体架构

​		

|  02.FUNDAMENTALS - PART1   |
| :------------------------: |
|  03.FUNDAMENTALS - PART2   |
|     05.DEVELOP SKILLS      |
|    07. DOM MANIPILATION    |
|  08. HOW JAVASCRIPT WORKS  |
|    09. MODERN OPEARTORS    |
|       10. FUNCTIONS        |
|         11. ARRAYS         |
| 12. NUMBERS, DATES, TIMERS |
|      13. ADVANCED DOM      |
|  14. OBJECT - ORIENTED JS  |
|     15. MAPTY PROJECT      |
|    16. ASYNCHRONOUS JS     |
| 17. MODERN JS APPLICATIONS |
|    18. FORKIFY PROJECT     |
|   19. DEPLOYMENT AND GIT   |
|                            |
|                            |



##  基础知识 - hello world!

[007 Hello World!_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=5&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

###  利用浏览器开发人员工具

​		确保浏览器有Chrome内核

​		打开方式 F12快捷键就可以打开miscroft edge的控制台和google浏览器的控制台

###  练手代码

```javascript
alert("hello world!")
let js = 'amazing'
if (js === 'amazing') alert('javascript is fun!')
js = 'boring'
if (js === 'amazing') alert('javascript is fun!')
50+09-03
```

![image-20231027153053883](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231027153053883.png)



###  JavaScript 简短介绍

[008 A Brief Introduction to JavaScript_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=6&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

####  JavaScript的定义

![image-20231027153516975](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231027153516975.png)

####  JavaScript在网络中的应用

![image-20231027153912712](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231027153912712.png)

####  JavaScript的前后端关系

![image-20231027154607191](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231027154607191.png)

####  JavaScript发展历程

![image-20231027154825172](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231027154825172.png)

###  在文件中编写JavaScript

[009 Linking a JavaScript File_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=7&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

​		构建前端的时候，HTML文件是必须的，因为JavaScript需要附加到HTML文件中。

​		在编写script脚本文件的时候有两种选择，一种是直接在HTML文件中内联脚本逻辑，第二种是新建script.js文件，HTML外联脚本文件，要倾向于第二种编写逻辑，这样方便逻辑编写修改以及之后的项目维护。

​		内联写法：

```javascript
<script>
  let js = 'amazing';
  // if (js === 'amazing') alert('JavaScript is FUN!')
  console.log(40 + 20 - 23 + 8); // 控制台调用
</script>
```

​		外联写法：在HTML文件中直接调用script脚本文件

```javascript
let js = 'amazing';
if (js === 'amazing') alert('JavaScript is FUN!')
console.log(40 + 20 - 23 + 8);
```

```javascript
<body>
  <h1>JavaScript Fundamentals – Part 1</h1>
  <script src="script.js"></script>
</body>

```

###  值与变量

[010 Values and Variables_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=8&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
console.log('jonas');
console.log(23);
let firstName = "Bob";  //声明变量
console.log(firstName);  //输出
console.log(firstName);
console.log(firstName);
```

1.camelCase 小写第一个单词大写后续的单词(javascript)  2. first_name

变量命名规则:

不能用数字开头，不能有特殊字符（只能有数字，字母，下划线或美元符号），不能用function等JavaScript中的保留关键字

不要用大写字母开头，全部大写用于常量，最好要变量更有描述性

###  数据类型

[012 Data Types_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=9&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

1. 数字Number：所有的数字类型
2. 字符串String：单引号，双引号都行
3. 布尔值Boolean：true or false
4. 未定义undefined：未被定义的变量
5. Null：empty value
6. Symbol（ES2015）：没啥用
7. BigInt：用于number不能hold的更大整型

代码注释：//后面就可以写单行注释

​				/* */里面是多行注释

动态数据类型

```javascript
let javascriptIsFun = true;
console.log(typeof true);
console.log(typeof javascriptIsFun);
console.log(typeof 23);
console.log(typeof 'steven');

javascriptIsFun = 'yes';
```

###  申明变量的三种方式 let const var

[013 let, const and var_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=10&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

let用来申明会改变的变量，之后可以改变变量的值，可以先不设置初值，在确保变量未来一定会改变再使用

const用来申明不会改变的变量，之后不能改变变量的初值，必须需要初值

var使用于function let使用于块

###  基本运算符

[014 Basic Operators_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=11&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// math operators
const ageSteven = 2056 - 2005;
const ageEvan = 2056 -2003;
console.log(ageSteven, ageEvan);
console.log(ageSteven * 2, ageEvan/10, 2**4);
const firstName = 'steven';
const lastName = 'zhang';
console.log(firstName + ' ' + lastName);

//assigment operators
let x= 10 + 9;
x += 10;
x *=9;
x++; // x = x + 1
x--;

//comparison operators
console.log(ageSteven > ageEvan); // <, >, >=, <=
console.log(ageSteven >= 19); //返还布尔值
const isFullAge = ageSteven >= 19;

```



###  运算优先级

[015 Operator Precedence_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=12&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

MDN是一个比较好用的文档网站

```javascript
console.log(ageSteven * 8 > ageEvan / 9); 
console.log(10 - 2 - 3);
let x,y;
x=y=98-3; 
console.log(x,y); // x = y =95
const averAge = (ageSteven + ageEvan)/2; //()is the highest
console.log(ageSteven, ageEvan);
```



###  字符串与模板文字

[017 Strings and Template Literals_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=14&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Strings and Template Literals
const firstName = 'Jonas';
const job = 'teacher';
const birthYear = 1991;
const year = 2037;

const jonas = "I'm " + firstName + ', a ' + (year - birthYear) + ' year old ' + job + '!';
console.log(jonas);

const jonasNew = `I'm ${firstName}, a ${year - birthYear} year old ${job}!`;
console.log(jonasNew);

console.log(`Just a regular string...`);

console.log('String with \n\
multiple \n\
lines');

console.log(`String
multiple
lines`); //用反引号更加方便
```



###  If - else

[018 Taking Decisions_ if _ else Statements_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=15&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
const age = 15;

if (age >= 18) {
  console.log('Sarah can start driving license 🚗 ');
} else {
  const yearsLeft = 18 - age;
  console.log(`Sarah is too young. Wait another ${yearsLeft} years :)`);
}

const birthYear = 2012;

let century;// 在if else结构中声明变量没有用
if (birthYear <= 2000) {
  century = 20;
} else {
  century = 21;
}
console.log(century);
```



###  值的类型转换与强制转换

[020 Type Conversion and Coercion_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=17&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Type Conversion and Coercion

// type conversion
const inputYear = '1991'; //这里是string
// console.log(inputYear + 18) 会输出199118
console.log(Number(inputYear), inputYear);
console.log(Number(inputYear) + 18);

console.log(Number('Jonas')); // NaN 不是数字
console.log(typeof NaN); // number 一个无效的数字

console.log(String(23), 23);
// 只能转换三种数据类型——数字，字符，布尔（2.13）

// type coercion
console.log('I am ' + 23 + ' years old'); // number-string
console.log('23' - '10' - 3); // 10 string-number(-)
console.log('23' + '10' + 3); // '23103' number-string
console.log('23' * '2'); // 46
console.log('23' / '2'); // 11.5

let n = '1' + 1; // '11'
n = n - 1;
console.log(n);  // 10

2+3+4+'5' // '95'
'10'-'4'-'3'- 2 +'5' // '15'
```



###  真值与假值

[021 Truthy and Falsy Values_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7/?p=18&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// 5 falsy values: 0, '', undefined, null, NaN
console.log(Boolean(0));
console.log(Boolean(undefined));
console.log(Boolean('Jonas'));
console.log(Boolean({})); // empty object
console.log(Boolean(''));

const money = 100;
if (money) {
  console.log("Don't spend it all ;)");
} else {
  console.log('You should get a job!');
}

let height = 0; // 0会走else
if (height) {
  console.log('YAY! Height is defined');
} else {
  console.log('Height is UNDEFINED');
}
```



###  相等运算符

[022 Equality Operators_ == vs. ===_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7/?p=19&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

'==‘会执行类型强制 loose equality，'==='不会执行类型强制 strict equality

```JavaScript
const age = 18;
if (age === 18) console.log('You just became an adult :D (strict)');

'18' == 18; // true
'18'=== 18; // false

if (age == 18) console.log('You just became an adult :D (loose)');
```

```javascript
prompt("what is your favourite number ?")
```

![image-20231030153635340](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231030153635340.png)

```javascript
const favourite = Number(prompt("What's your favourite number?"));
console.log(favourite);
console.log(typeof favourite);
```

'!=‘会执行类型强制 loose equality，'!=='不会执行类型强制 strict equality



###  布尔逻辑

[023 Boolean Logic_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7/?p=20&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

AND;OR;NOT

![image-20231102195902377](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231102195902377.png)

[024 Logical Operators_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7/?p=21&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Logical Operators
const hasDriversLicense = true; // A
const hasGoodVision = true; // B

console.log(hasDriversLicense && hasGoodVision);
console.log(hasDriversLicense || hasGoodVision);
console.log(!hasDriversLicense);

// if (hasDriversLicense && hasGoodVision) {
//   console.log('Sarah is able to drive!');
// } else {
//   console.log('Someone else should drive...');
// }

const isTired = false; // C
console.log(hasDriversLicense && hasGoodVision && isTired);

if (hasDriversLicense && hasGoodVision && !isTired) {
  console.log('Sarah is able to drive!');
} else {
  console.log('Someone else should drive...');
}
*/

```



###  switch case语法

```JavaScript
const day = 'friday';

switch (day) {
  case 'monday': // day === 'monday'
    console.log('Plan course structure');
    console.log('Go to coding meetup');
    break;
  case 'tuesday':
    console.log('Prepare theory videos');
    break;  // 用来跳出switch
  case 'wednesday':
  case 'thursday':
    console.log('Write code examples');
    break;
  case 'friday':
    console.log('Record videos');
    break;
  case 'saturday':
  case 'sunday':
    console.log('Enjoy the weekend :D');
    break;
  default:
    console.log('Not a valid day!');
}

if (day === 'monday') {
  console.log('Plan course structure');
  console.log('Go to coding meetup');
} else if (day === 'tuesday') {
  console.log('Prepare theory videos');
} else if (day === 'wednesday' || day === 'thursday') {
  console.log('Write code examples');
} else if (day === 'friday') {
  console.log('Record videos');
} else if (day === 'saturday' || day === 'sunday') {
  console.log('Enjoy the weekend :D');
} else {
  console.log('Not a valid day!');
}
```



###  statements and expressions

[027 Statements and Expressions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7/?p=24&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Expressions
3 + 4
1991
true && false && !false

//Statements
if (23 > 10) {
  const str = '23 is bigger';
}

const me = 'Jonas';
console.log(`I'm ${2037 - 1991} years old ${me}`);
```



###  条件运算符

```JavaScript
const age =23;
age >= 18 ? console.log('I like to drink wine') : console.log('I like to drink water');
const drink = age >= 18 ? 'wine' : 'water';
console.log(drink);
```

条件运算符可以有效减少代码的冗余度



###  JavaScript发展史

![image-20231102202813297](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231102202813297.png)

![image-20231102203706427](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20231102203706427.png)







##  JS的基本编写

###  激活严格模式（activate strict mode）

编写更加安全的代码

+ 禁止一些行为
+ 帮助编码，标注错误

[032 Activating Strict Mode_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=29&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
'use strict';  //不知道实际意义，大家都这么写
// Activating Strict Mode
let hasDriversLicense = false;
const passTest = true;

if (passTest) hasDriversLicense = true;
if (hasDriversLicense) console.log('I can drive :D');

// const interface = 'Audio';  //interface保留word
// const private = 534;       //private保留word
```



###  函数（functions）

[033 Functions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=30&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
function logger(){
	console.log('My name is steven');
}
// calling / running / invoking function
logger();
logger();
logger();

function fruitProcessor(apples, oranges) {
  const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
  return juice;
}

const appleJuice = fruitProcessor(5, 0);
console.log(appleJuice);

const appleOrangeJuice = fruitProcessor(2, 4);
console.log(appleOrangeJuice);

const num = Number('23');
```



###  *Function Declarations vs. Expressions*

[034 Function Declarations vs. Expressions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=31&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Function declaration
function calcAge1(birthYear) {
  return 2037 - birthYear;
}
const age1 = calcAge1(1991);

// Function expression  //匿名函数
const calcAge2 = function (birthYear) {
  return 2037 - birthYear;
}
const age2 = calcAge2(1991);

console.log(age1, age2);

```

+ 第一种可以先调用再声明，即函数提升，第二种不行



###  箭头函数（arrow functions）重要！！！！！

[035 Arrow Functions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=32&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
const calcAge3 = birthyear => 2037 - birthyear; //类似python中的lamda表达式
const age3 = calcAge3(1991);
console.log(age3);

const yearsUntilRetirement = (birthYeah, firstName) => {
  const age = 2037 - birthYeah;
  const retirement = 65 - age;
  // return retirement;
  return `${firstName} retires in ${retirement} years`;
}

console.log(yearsUntilRetirement(1991, 'Jonas')); console.log(yearsUntilRetirement(1980, 'Bob'));
```



###  函数调用函数

[036 Functions Calling Other Functions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=33&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Functions Calling Other Functions
function cutFruitPieces(fruit) {
  return fruit * 4;
}

function fruitProcessor(apples, oranges) {
  const applePieces = cutFruitPieces(apples);
  const orangePieces = cutFruitPieces(oranges);

  const juice = `Juice with ${applePieces} piece of apple and ${orangePieces} pieces of orange.`;
  return juice;
}
console.log(fruitProcessor(2, 3));

```

  <img src="C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20240102103454792.png" alt="image-20240102103454792" style="zoom:100%;" />



###  函数综合

注意在一个文件中，如果没有产生包的概念， 不要重复声明相同名字的函数，会报错——无法重新申明块范围变量 ts（2451）

[037 Reviewing Functions_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=34&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Reviewing Functions
const calcAge = function (birthYeah) {
  return 2037 - birthYeah;
}

const yearsUntilRetirement = function (birthYeah, firstName) {
  const age = calcAge(birthYeah);
  const retirement = 65 - age;

  if (retirement > 0) {
    console.log(`${firstName} retires in ${retirement} years`);
    return retirement;
  } else {
    console.log(`${firstName} has already retired 🎉`);
    return -1;
  }
}

console.log(yearsUntilRetirement(1991, 'Jonas'));
console.log(yearsUntilRetirement(1950, 'Mike'));
```

![image-20240102103819982](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20240102103819982.png)

![image-20240102104109966](C:\Users\Yuding\AppData\Roaming\Typora\typora-user-images\image-20240102104109966.png)



###  数据结构-ARRAYS(数组)

[039 Introduction to Arrays_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=36&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```JavaScript
// Introduction to Arrays
const friend1 = 'Michael';
const friend2 = 'Steven';
const friend3 = 'Peter';

const friends = ['Michael', 'Steven', 'Peter'];
console.log(friends);

const y = new Array(1991, 1984, 2008, 2020);  //项目中一般不用new初始化数组，这里是教学目的

console.log(friends[0]); //'michael'
console.log(friends[2]);

console.log(friends.length);  //数组长度  3
console.log(friends[friends.length - 1]); //peter

friends[2] = 'Jay'; //换数组元素
console.log(friends);
// friends = ['Bob', 'Alice']  非法声明

const firstName = 'Jonas';
const jonas = [firstName, 'Schmedtmann', 2037 - 1991, 'teacher', friends]; //数组长度 5
console.log(jonas);
console.log(jonas.length);
 
// Exercise
const calcAge = function (birthYeah) {
  return 2037 - birthYeah;
}
const years = [1990, 1967, 2002, 2010, 2018];  //对数组操作不太可行

const age1 = calcAge(years[0]);
const age2 = calcAge(years[1]);
const age3 = calcAge(years[years.length - 1]);
console.log(age1, age2, age3);

const ages = [calcAge(years[0]), calcAge(years[1]), calcAge(years[years.length - 1])];
console.log(ages);
```

[040 Basic Array Operations (Methods)_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=37&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Basic Array Operations (Methods)
const friends = ['Michael', 'Steven', 'Peter'];

// Add elements 返回新数组长度
const newLength = friends.push('Jay'); // push
console.log(friends);
console.log(newLength);

friends.unshift('John');  // unshift 在数组头添加
console.log(friends);

// Remove elements 返回被删除的元素
friends.pop(); // Last element
const popped = friends.pop();
console.log(popped);
console.log(friends);

friends.shift(); // First element
console.log(friends);

console.log(friends.indexOf('Steven'));  //true
console.log(friends.indexOf('Bob'));    //false

friends.push(23);
console.log(friends.includes('Steven'));
console.log(friends.includes('Bob'));
console.log(friends.includes(23));  // true
console.log(friends.includes('23'));  // false

if (friends.includes('Steven')) {
  console.log('You have a friend called Steven');
}
```



###  数据结构-OBJECTS （对象）

[042 Introduction to Objects_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=39&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Introduction to Objects
const jonasArray = [
  'Jonas',
  'Schmedtmann',
  2037 - 1991,
  'teacher',
  ['Michael', 'Peter', 'Steven']
];

const jonas = {
  firstName: 'Jonas',
  lastName: 'Schmedtmann',
  age: 2037 - 1991,
  job: 'teacher',
  friends: ['Michael', 'Peter', 'Steven']
};
```

[043 Dot vs. Bracket Notation_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=40&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Dot vs. Bracket Notation
const jonas = {
  firstName: 'Jonas',
  lastName: 'Schmedtmann',
  age: 2037 - 1991,
  job: 'teacher',
  friends: ['Michael', 'Peter', 'Steven']
};
console.log(jonas);

console.log(jonas.lastName);
console.log(jonas['lastName']);

//利用方括号来实现捕获不同的对象
const nameKey = 'Name';
console.log(jonas['first' + nameKey]);
console.log(jonas['last' + nameKey]);

// console.log(jonas.'last' + nameKey)

const interestedIn = prompt('What do you want to know about Jonas? Choose between firstName, lastName, age, job, and friends');

if (jonas[interestedIn]) {
  console.log(jonas[interestedIn]);
} else {
  console.log('Wrong request! Choose between firstName, lastName, age, job, and friends');
}

jonas.location = 'Portugal';
jonas['twitter'] = '@jonasschmedtman';
console.log(jonas);

console.log('${jones.firstName} has ${jones.friends.length}, and his best friend is called ${jonas,friend[0]}' )
```

[044 Object Methods_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=41&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Object Methods

const jonas = {
  firstName: 'Jonas',
  lastName: 'Schmedtmann',
  birthYeah: 1991,
  job: 'teacher',
  friends: ['Michael', 'Peter', 'Steven'],
  hasDriversLicense: true,

   //expression
  // calcAge: function (birthYeah) {
  //   return 2037 - birthYeah;
  // }

  // calcAge: function () {
  //   // console.log(this);
  //   return 2037 - this.birthYeah;
  // }

  // this 更加具有通用性 jones jones2 peter都可以
  calcAge: function () {
    this.age = 2037 - this.birthYeah;
    return this.age;
  },

  getSummary: function () {
    return `${this.firstName} is a ${this.calcAge()}-year old ${jonas.job}, and he has ${this.hasDriversLicense ? 'a' : 'no'} driver's license.`
  }
};

console.log(jonas.calcAge());

console.log(jonas.age);
console.log(jonas.age);
console.log(jonas.age);

```

###  iteration

[046 Iteration_ The for Loop_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=43&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Iteration: The for Loop

// for loop keeps running while condition is TRUE
for (let rep = 1; rep <= 30; rep++) {
  console.log(`Lifting weights repetition ${rep} 🏋️‍♀️`);
}
```

[047 Looping Arrays, Breaking and Continuing_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=44&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Looping Arrays, Breaking and Continuing
const jonas = [
  'Jonas',
  'Schmedtmann',
  2037 - 1991,
  'teacher',
  ['Michael', 'Peter', 'Steven'],
  true
];
const types = [];

// console.log(jonas[0])
// console.log(jonas[1])
// ...
// console.log(jonas[4])
// jonas[5] does NOT exist

for (let i = 0; i < jonas.length; i++) {
  // Reading from jonas array
  console.log(jonas[i], typeof jonas[i]);

  // Filling types array
  // types[i] = typeof jonas[i];
  types.push(typeof jonas[i]);
}

console.log(types);

const years = [1991, 2007, 1969, 2020];
const ages = [];

for (let i = 0; i < years.length; i++) {
  ages.push(2037 - years[i]);
}
console.log(ages);

// continue and break
console.log('--- ONLY STRINGS ---')
for (let i = 0; i < jonas.length; i++) {
  if (typeof jonas[i] !== 'string') continue;

  console.log(jonas[i], typeof jonas[i]);
}

console.log('--- BREAK WITH NUMBER ---')
for (let i = 0; i < jonas.length; i++) {
  if (typeof jonas[i] === 'number') break;

  console.log(jonas[i], typeof jonas[i]);
}
```

[048 Looping Backwards and Loops in Loops_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=45&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

[049 The while Loop_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=46&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
// Looping Backwards and Loops in Loops
const jonas = [
  'Jonas',
  'Schmedtmann',
  2037 - 1991,
  'teacher',
  ['Michael', 'Peter', 'Steven'],
  true
];

// 0, 1, ..., 4
// 4, 3, ..., 0

for (let i = jonas.length - 1; i >= 0; i--) {
  console.log(i, jonas[i]);
}

for (let exercise = 1; exercise < 4; exercise++) {
  console.log(`-------- Starting exercise ${exercise}`);

  for (let rep = 1; rep < 6; rep++) {
    console.log(`Exercise ${exercise}: Lifting weight repetition ${rep} 🏋️‍♀️`);
  }
}

// The while Loop
for (let rep = 1; rep <= 10; rep++) {
  console.log(`Lifting weights repetition ${rep} 🏋️‍♀️`);
}

let rep = 1;
while (rep <= 10) {
  // console.log(`WHILE: Lifting weights repetition ${rep} 🏋️‍♀️`);
  rep++;
}

let dice = Math.trunc(Math.random() * 6) + 1;     // trunc 取整  random 0-1随机取

while (dice !== 6) {
  console.log(`You rolled a ${dice}`);
  dice = Math.trunc(Math.random() * 6) + 1;
  if (dice === 6) console.log('you rolled a ${dice} and Loop is about to end...');
}
```



##  开发技巧与编辑（DEVELOPER SKILLS & EDITOR SETUP）

###  配置vscode

[055 Setting up Prettier and VS Code_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=50&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

+ prettier工具 保证代码格式
+ vscode的自动完成很好用
+ todo highlight 标识工具

###  安装node.js 并且配置dev环境

安装node.js 使用npm的包 live server

注意在vscode中终端看node版本的时候需要用管理员模式打开vscode

安装live-server包可以实时看到js的效果

###  善用网络与debugger

sources中js文件，添加breakpoints



##  HTML 和 CSS 的基础知识

###  HTML 的结构与元素

[064 Basic HTML Structure and Elements_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=59&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

HTML文件用来描述网页的内容的标记语言

开始标签，关闭标签 

head      body       !+tab

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link href="style.css" rel="stylesheet" />

    <title>Learning HTML & CSS</title>
  </head>
  <body>
    <h1>JavaScript is fun, but so is HTML & CSS!</h1>
    <p class="first">
      You can learn JavaScript without HTML and CSS, but for DOM manipulation
      it's useful to have some basic ideas of HTML & CSS. You can learn more
      about it
      <a href="https://www.udemy.com/user/jonasschmedtmann/">on Udemy</a>.
    </p>

    <h2>Another heading</h2>
    <p class="second">
      Just another paragraph
    </p>

    <img
      id="course-image"
      src="https://img-a.udemycdn.com/course/480x270/437398_46c3_9.jpg"
    />

    <form id="your-name">
      <h2>Your name here</h2>
      <p class="first">Please fill in this form :)</p>

      <input type="text" placeholder="Your name" />
      <button>OK!</button>
    </form>
  </body>
</html>

```

###  属性，类，id

[065 Attributes, Classes and IDs_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=60&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

class可以重复，id不能重复

###  CSS基本知识

[066 Basic Styling with CSS_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=61&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```html
<style>
    body{                       //元素
        background-color:green; //属性 指
    }
<style/>
```

css需要链接到html文件中

```html
 <link href="style.css" rel="stylesheet" />
```

```css
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background-color: rgb(255, 247, 201);
  font-family: Arial;
  font-size: 20px;
  padding: 50px;
}

h1 {
  font-size: 35px;
  margin-bottom: 25px;
}

h2 {
  margin-bottom: 20px;
  text-align: center;
}

p {
  margin-bottom: 20px;
}

.first {
  color: red;
}

#your-name {
  background-color: rgb(255, 220, 105);
  border: 5px solid #444;
  width: 400px;
  padding: 25px;
  margin-top: 30px;
}

input,
button {
  padding: 10px;
  font-size: 16px;
}

a {
  background-color: yellowgreen;
}

#course-image {
  width: 300px;
}

#your-name h2 {
  color: olivedrab;
}

```

###  css中的box model

[067 Introduction to the CSS Box Model_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=62&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

*是全局选择



##  构建项目

[068 Section Intro_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=63&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

###  构建Guess My Number

####  DOM将js与html中的元素链接起来

```javascript
console.log(document.querySelector('.message').textContent);
```

####  DOM操作-JavaScript对网页进行操作 什么是DOM？ DOM操作？

[071 What's the DOM and DOM Manipulation_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=65&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

DOCUMENT OBJECT MODEL

document 是DOM操作的入口 document.

DOM - Web API  ;  DOM 不是 JAVASCRIPT

####  选择与操作元素

```JavaScript
document.querySelector('.message').textContent = 'Correct Number !'; 
document.querySelector('.number').textContent = 13;
document.querySelector('.score').textContent = 10;
document.querySelector('.guess').value;
```

####  对界面上的按钮进行反应

[073 Handling Click Events_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=67&spm_id_from=pageDriver&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

```javascript
document.querySelector('.check').addEventListener('click',function(){
    const guess = Number(document.querySelector('.guess').value); 
    if(！guess){
        document.querySelector('.message').textContent = 'No number';
    }
});
```

####  代码逻辑

```JavaScript
let secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highscore = 0;

const displayMessage = function (message) {
  document.querySelector('.message').textContent = message;
};

document.querySelector('.check').addEventListener('click', function () {
  const guess = Number(document.querySelector('.guess').value);
  console.log(guess, typeof guess);

  // When there is no input
  if (!guess) {
    // document.querySelector('.message').textContent = '⛔️ No number!';
    displayMessage('⛔️ No number!');

    // When player wins
  } else if (guess === secretNumber) {
    // document.querySelector('.message').textContent = '🎉 Correct Number!';
    displayMessage('🎉 Correct Number!');
    document.querySelector('.number').textContent = secretNumber;

    document.querySelector('body').style.backgroundColor = '#60b347';
    document.querySelector('.number').style.width = '30rem';

    if (score > highscore) {
      highscore = score;
      document.querySelector('.highscore').textContent = highscore;
    }

    // When guess is wrong
  } else if (guess !== secretNumber) {
    if (score > 1) {
      // document.querySelector('.message').textContent =
      // guess > secretNumber ? '📈 Too high!' : '📉 Too low!';
      displayMessage(guess > secretNumber ? '📈 Too high!' : '📉 Too low!');
      score--;
      document.querySelector('.score').textContent = score;
    } else {
      // document.querySelector('.message').textContent = '💥 You lost the game!';
      displayMessage('💥 You lost the game!');
      document.querySelector('.score').textContent = 0;
    }
  }

```



####  利用DOM 设置 CSS样式

```javascript

    document.querySelector('body').style.backgroundColor = '#60b347';
    document.querySelector('.number').style.width = '30rem';

```

```javascript
document.querySelector('.again').addEventListener('click', function () {
  score = 20;
  secretNumber = Math.trunc(Math.random() * 20) + 1;

  // document.querySelector('.message').textContent = 'Start guessing...';
  displayMessage('Start guessing...');
  document.querySelector('.score').textContent = score;
  document.querySelector('.number').textContent = '?';
  document.querySelector('.guess').value = '';

  document.querySelector('body').style.backgroundColor = '#222';
  document.querySelector('.number').style.width = '15rem';
});
```

###  构建Modal Window

html中的类

```html
<body>
    <button class="show-modal">Show modal 1</button>
    <button class="show-modal">Show modal 2</button>
    <button class="show-modal">Show modal 3</button>

    <div class="modal hidden">
      <button class="close-modal">&times;</button>
      <h1>I'm a modal window 😍</h1>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim
        veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
        commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
        velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
        occaecat cupidatat non proident, sunt in culpa qui officia deserunt
        mollit anim id est laborum.
      </p>
    </div>
    <div class="overlay hidden"></div>
```

js中选择所有的类

```javascript
const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btnCloseModal = document.querySelector('.close-modal');
const btnsOpenModal = document.querySelectorAll('.show-modal');
```

js对类进行操作

```javascript
const openModal = function () {
  modal.classList.remove('hidden');
  overlay.classList.remove('hidden');
};

const closeModal = function () {
  modal.classList.add('hidden');
  overlay.classList.add('hidden');
};
```

按键事件

```javascript
document.addEventListener('keydown', function (e) {
  // console.log(e.key);

  if (e.key === 'Escape' && !modal.classList.contains('hidden')) {
    closeModal();
  }
});
```



###  pick game

[082 PROJECT #3_ Pig Game_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1vA4y197C7?p=76&vd_source=321e8aa4a05a672eb79d804e6b1bb605)

####  整体流程图

![pig-game-flowchart](F:\JavaScript\complete-javascript-course\07-Pig-Game\final\pig-game-flowchart.png)

####  js文件

```javascript
'use strict';

// Selecting elements
const player0El = document.querySelector('.player--0');
const player1El = document.querySelector('.player--1');
const score0El = document.querySelector('#score--0');
const score1El = document.getElementById('score--1');
const current0El = document.getElementById('current--0');
const current1El = document.getElementById('current--1');

const diceEl = document.querySelector('.dice');
const btnNew = document.querySelector('.btn--new');
const btnRoll = document.querySelector('.btn--roll');
const btnHold = document.querySelector('.btn--hold');

let scores, currentScore, activePlayer, playing;

// Starting conditions
const init = function () {
  scores = [0, 0];
  currentScore = 0;
  activePlayer = 0;
  playing = true;

  score0El.textContent = 0;
  score1El.textContent = 0;
  current0El.textContent = 0;
  current1El.textContent = 0;

  diceEl.classList.add('hidden');
  player0El.classList.remove('player--winner');
  player1El.classList.remove('player--winner');
  player0El.classList.add('player--active');
  player1El.classList.remove('player--active');
};
init();

const switchPlayer = function () {
  document.getElementById(`current--${activePlayer}`).textContent = 0;
  currentScore = 0;
  activePlayer = activePlayer === 0 ? 1 : 0;
  player0El.classList.toggle('player--active');
  player1El.classList.toggle('player--active');
};

// Rolling dice functionality
btnRoll.addEventListener('click', function () {
  if (playing) {
    // 1. Generating a random dice roll
    const dice = Math.trunc(Math.random() * 6) + 1;

    // 2. Display dice
    diceEl.classList.remove('hidden');
    diceEl.src = `dice-${dice}.png`;

    // 3. Check for rolled 1
    if (dice !== 1) {
      // Add dice to current score
      currentScore += dice;
      document.getElementById(
        `current--${activePlayer}`
      ).textContent = currentScore;
    } else {
      // Switch to next player
      switchPlayer();
    }
  }
});

btnHold.addEventListener('click', function () {
  if (playing) {
    // 1. Add current score to active player's score
    scores[activePlayer] += currentScore;
    // scores[1] = scores[1] + currentScore

    document.getElementById(`score--${activePlayer}`).textContent =
      scores[activePlayer];

    // 2. Check if player's score is >= 100
    if (scores[activePlayer] >= 100) {
      // Finish the game
      playing = false;
      diceEl.classList.add('hidden');

      document
        .querySelector(`.player--${activePlayer}`)
        .classList.add('player--winner');
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.remove('player--active');
    } else {
      // Switch to the next player
      switchPlayer();
    }
  }
});

btnNew.addEventListener('click', init);

```

跟着写一遍会比较清楚。
