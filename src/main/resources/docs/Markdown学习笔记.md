---
https://vuepress.vuejs.org/zh/guide/frontmatter.html#%E9%BB%98%E8%AE%A4%E4%B8%BB%E9%A2%98%E7%9A%84%E9%A2%84%E5%AE%9A%E4%B9%89%E5%8F%98%E9%87%8F
---

# Typora的Markdown语法

# 概述

Markdown 由 Daring Fireball 创建，原始指南在[这里](https://daringfireball.net/projects/markdown/syntax)。但是，它的语法因不同的解析器或编辑器而异。Typora 正在使用 GitHub Flavored Markdown。

# 大纲

+ 概述
+ 块元素
  + 段落与换行符
  + 标题
  + 引用文字
  + 列表
  + 任务列表
  + （栅栏式）代码块
  + 数学公式块
  + 表格
  + 脚注
  + 水平线
  + YAML Front Matter
  + 目录（TOC）
  + 图表   (Sequence，Flowchart and Mermaid)
+ Span元素
  + 链接
    + 内部链接
    + 参考链接
  + URL网址
  + 图片
  + 强调（斜体）
  + 粗体
  + 代码
  + 删除线
  + 下划线
  + 表情符号：smile：
  + 内联数学公式
  + 下标
  + 上标
  + 高亮
+ HTML
  + 嵌入内容
  + 视频
  + 其他HTML支持



# 块元素

##  段落与换行符

段落只是一行或多行连续的文本。在 markdown 源代码中，段落由多个空行分隔。在Typora中，您只需按下 Return 即可创建新段落。 按 Shift + Return 可创建单个换行符。但是，大多数 markdown 解析器将忽略单行中断，要使其他 markdown 解析器识别您的换行符，可以在 行尾留下两个空格，或者插入 <br/>.

##  标题
标题在行的开头使用1-6个#字符，对应标题级别1-6。或者ctrl+1-6。

##  引用文字

Markdown 使用电子邮件样式>字符进行块引用。它们表示为：

> 这是一个有两段的块引用。这是第一段

> 这是第二段
>
> Vestibulum enim wisi, viverra nec, fringilla in, laoreet vitae, risus。

在typora中，只需输入’>’后跟引用内容即可生成块引用。Typora将为您插 入正确的“>”或换行符。通过添加额外级别的“>”允许在块引用内嵌入另一 个块引用。

##  列表

输入 * list item 1 将创建一个无序列表，该 * 符号可以替换为 + 或 -. 

输入 1. list item 1 将创建一个有序列表，其 markdown 源代码如下：

```markdown
### 无序列表
+ 红色
+ 绿色
+ 蓝色

### 有序列表
1. 红色
2. 绿色
3. 蓝色
```

### 无序列表
+ 红色
+ 绿色
+ 蓝色

### 有序列表
1. 红色
2. 绿色
3. 蓝色

##  任务列表

任务列表是标记为[ ]或[x]（未完成或完成）的项目的列表。快捷键 ctrl+shift+X 例如:

- [ ] 未完成
- [x] 完成

您可以通过单击项目前面的复选框来更改完成/未完成状态。

## （栅栏式）代码块

Typora仅支持 Github Flavored Markdown 中的栅栏式代码块。不支持 markdown 中的原始代码块。 使用栅栏式代码块很简单：输入```之后输入一个可选的语言标识符，然后 按return键后输入代码，我们将通过语法高亮显示它：

``` 
function test()
{
console.log('notice the blank line before this function?');
}
```

``` ruby
require'redcatpet'
markdown = Redcarpet.new('hello world!')
puts matkdown.to_html
```

##  数学公式块

您可以使用 MathJax 渲染 LaTeX 数学表达式。

行内公式输入 $，行间公式输入 $$, 然后按“return”键将触发一个接受Tex / LaTex源代码的输入区域。   

在 markdown 源文件中，数学公式块是由’$$’标记包装的 LaTeX 表达式：
$$
\mathbf{V}_1 \times \mathbf{V}_2 = \begin{vmatrix}
\mathbf{i} & \mathbf{j} & \mathbf{k} \\
\frac{\partial X }{\partial u} & \frac{\partial Y}{\partial u} & 0 \\
\frac{\partial X }{\partial v} & \frac{\partial Y}{\partial v} & 0 \\
\end{vmatrix}
$$
以下是一些LaTeX的语法：

###  希腊字母

$$
\delta,\lambda\\
\Delta,Lambda\\
\alpha, \Alpha, \beta, \Beta\\
\phi, \varphi,\pi\\
$$

###  上下标

$$
a^2,a_1\\
x^{y+z},p_{ij},p_ij\\
x_i,x_{\rm i}, \text{A B}, \\\rm{A B}\\\text A B ,\ \ \rm A B^T \\{\rm} 
{\rm A B }\\
DF
$$

###  分式与根式

$$
\frac{1}{2}\\
\frac 1 2,\\
\frac1 2 \\
\frac1 {x+y}\\
\frac{\dfrac1 x+1}{y+1}\\
\sqrt 2\\
$$

###  普通运算符

$$
\infty\\
\sin x, \sec x ,\cos x\\
\log_{2x}2x, \ln x,\lg x\\
\lim_{x\to 0} \frac{x}{\sin x}\\[9pt]
\lim\limits_{x\to 0}\frac x {\sin x} ,\\[5pt]
\lim_{n \to \infty}f(x) =0\\
\text MSE(x)\\
\int_{a}^{b} x^2 dx\\
\iint_V \mu(u,v) \,du\,dv\\
\iiint_V \mu(u,v,w) \,du\,dv\,dw\\
\iiiint_V \mu(t,u,v,w) \,dt\,du\,dv\,dw\\
$$

###  大型运算符

$$
\sum,\prod\\
\sum_i,\sum_{i=0}^N\\
\frac{\sum\limits_{i=1}^n x_i}{\prod\limits_{i=1}^n x_i}\\
a \quad a \\
a \qquad a\\
$$

###  标注符号

$$
\vec x,\overrightarrow {AB}\\
\vec {AB},\overleftarrow {AB}\\
\bar x ,\overline{abcd}
$$

###  箭头

$$
\leftarrow \\
\gets\\
\leftrightarrow\\
\Leftrightarrow\\
\Rightarrow\\
\longrightarrow\\
$$

###  括号与定界符

$$
\{ \},\\
() [] 
\lfloor,
\left(0，\frac 1 a \right]\\
(0,\frac 1 a]\\
\left.\frac{\partial f}{\partial x}\right |_{x =0}\\[10pt]
\frac{\partial f}{\partial x} |_{x =0}
$$

###  多行公式

$$
\begin{align}
a=b+c+d\\
=e+f\\
a&=b+c+d\\
&=e+f
\end{align}
$$

###  大括号

$$
\frac{f(x)}{g(x)}=
\begin{cases}
\sin x , -\pi \le x \le \pi \\
0, \text {其他}
\end{cases}
$$

###  矩阵

$$
\begin{matrix}
a & b & \cdots & c \\
\vdots& \vdots &\ddots &\vdots\\
e& f & \cdots &g
 \end{matrix}
\\
 \begin{bmatrix}
a & b & \cdots & c \\
\vdots& \vdots &\ddots &\vdots\\
e& f & \cdots &g
 \end{bmatrix}
\\[9pt]
 \begin{vmatrix}
a & b & \cdots & c \\
\vdots& \vdots &\ddots &\vdots\\
e& f & \cdots &g
 \end{vmatrix}
\\[9pt]
 \begin{pmatrix}
a & b & \cdots & c \\
\vdots& \vdots &\ddots &\vdots\\
e& f & \cdots &g
 \end{pmatrix}
$$

###  综合

$$
\begin{align}
&f(x)=\frac{1}{\sqrt{2\pi}\sigma}{\rm e }^{-\frac{(x - \mu)^2}{2{\sigma}^2}}  
\\
f(x)&=\frac{1}{\sqrt{2\pi}\sigma}\exp\left[{-\frac{(x - \mu)^2}{2{\sigma}^2}}\right]
\end{align}
$$

##  表格

输入 | First Header | Second Header | 并按下 return 键将创建一个包 含两列的表。 创建表后，焦点在该表上将弹出一个表格工具栏，您可以在其中调整表 格，对齐或删除表格。您还可以使用上下文菜单来复制和添加/删除列/ 行。 可以跳过以下描述，因为表格的 markdown 源代码是由typora自动生成 的。

| First Header | Second Header |
| ------------ | ------------- |
| content text | content text  |
|              |               |

您还可以在表格中包括内联 Markdown 语法，例如链接，粗体，斜体或 删除线。 最后，通过在标题行中包含冒号：您可以将文本定义为左对齐，右对齐或居中对齐：

| left-aligned | center aligned  | right-aligned |
| ------------ | --------------- | ------------- |
| col 3 is     | some wordy text | $1600         |

最左侧的冒号表示左对齐的列; 最右侧的冒号表示右对齐的列; 两侧的冒号表示中心对齐的列。

##  脚注

您可以像这样创建脚注[^footnote]. 
[^footnote]: Here is the *text* of the **footnote**.

将产生： 您可以像这样创建脚注[^1].

[^1]: 鼠标移动到‘footnote’上标中查看脚注的内容。

##  水平线

输入 *** 或 --- 在空行上按 return 键将绘制一条水平线。

***

##  YAML Front Matter

 Typora 现在支持 YAML Front Matter 。 在文章顶部输入 --- 然后按 Enter 键将引入一个，或者从菜单中插入一个元数据块。

---

##  目录(TOC)	

目录 (TOC) 输入 [toc] 然后按 Return 键将创建一个“目录”部分，自动从文档内容中 提取所有标题，其内容会自动更新。
[toc]

##  图表 (Sequence, Flowchart and Mermaid) 

Typora 支持, sequence, flowchart and mermaid, 使用前要先从偏好设置 面板启用该功能。

##  Span 元素

在您输入后Span元素会被立即解析并呈现。在这些span元素上移动光标 会将这些元素扩展为markdown源代码。以下将解释这些span元素的语法。

##  链接

Markdown 支持两种类型的链接：内联和引用。 在这两种样式中，链接文本都写在[方括号]内。 要创建内联链接，请在链接文本的结束方括号后立即使用一组常规括号。 在常规括号内，输入URL地址，以及可选的用引号括起来的链接标题。例如：

This is [an example](http://example.com/ "Title") inline link. 

[This link](http://example.net/) has no title attribute.

**内部链接** 

您可以将常规括号内的 href 设置为文档内的某一个标题，这将创建一个书签，允许您在单击后跳转到该部分。例如： Command(在Windows上：Ctrl) + 单击此链接将跳转到标题块元素处。 

**参考链接**

参考样式链接使用第二组方括号，在其中放置您选择的标签以标识链接：

This is [an example][id] reference-style link. 

然后，在文档中的任何位置，您可以单独定义链接标签，如下所示：

[id]: http://example.com/ "Optional Title Here"

在typora中，它们将呈现为： This is an example reference-style link. 

隐式链接名称快捷方式允许您省略链接的名称，在这种情况下，链接文本本身将用作名称。只需使用一组空的方括号，例如，将“Google”一词链接 到google.com网站，您只需写下： [Google][] 然后定义链接： [Google]: http://google.com/ 在typora中单击链接将其展开以进行编辑，command + 单击将在 Web 浏览器中打开超链接。



##  URL网址

Typora允许您将 URL 作为链接插入，用 <括号括起来>。 

成为 i@typora.io. Typora也将自动链接标准URL。

例如： www.google.com.

##  图片

图像与链接类似， 但在链接语法之前需要添加额外的 ! 字符。

 图像语法如下所示： ![替代文字](/path/to/img.jpg) ![替代文字](/path/to/img.jpg "可选标题") 

您可以使用拖放操作从图像文件或浏览器来插入图像。并通过单击图像修 改 markdown 源代码。如果图像在拖放时与当前编辑文档位于同一目录 或子目录中，则将使用相对路径。

##  强调（斜体）

Markdown 将星号 (*) 和下划线(_)视为强调的指示。_

_用一个 * or _ 包裹 文本将使用HTML  *标签包裹文本。_

例如： *单个星号* _单个下划线_ 

##  粗体

用两个 * 或 _ 包裹的文本将使用HTML  **标签包裹**

##  代码

要指示代码范围，请使用反引号（`）进行包裹。与预格式化的代码块不 同，代码跨度表示正常段落中的代码。

```c
printf('hello world!');
```

##  删除线

GFM通过添加语法来创建删除线文本，标准的Markdown中缺少该文本。~~错误的文字~~

##  下划线

<u>下划线</u>

##  表情符号emoji

输入表情符号的语法是 :smile: 用户可以通过 ESC 按键触发表情符号的自动完成建议，或者在偏好设置面板里启用后自动触发表情符号。此外，还支持直接从 Edit -> Emoji & Symbols 菜单栏输入UTF8表情符号字符。

##  下标

要使用此功能，首先，请在 偏好设置 面板 -> Markdown扩展语法 选项卡 中启用它。然后用 ~ 来包裹下标内容，例如： H~2~O, X~long\ text~/

##  上标

要使用此功能，首先，请在 偏好设置 面板 -> Markdown扩展语法 选项卡 中启用它。然后用 ^ 来包裹上标内容，例如： X^2^。

##  高亮

要使用此功能，首先，请在 偏好设置 面板 -> Markdown扩展语法 选项卡 中启用它。然后用 == 来包裹高亮内容，例如： ==highlight==。

##  HTML

可以用html来设置纯markdown不支持的内容。

支持嵌入内容、视频等
