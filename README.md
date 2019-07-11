# java-training   
    java training for new java learner   
JAVA 运行环境介绍   
1.安装JDK   
<br>
  下载JDK（windows版本有exe和zip包格式，建议下载zip包格式，zip包是免安装的，zip包下载完成后需要解压缩）<br>
        下载地址(任意选择一个版本)
        <br>
        <br>
        JDK8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
      <br>
              JDK12: https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html
  <br>
        根据自己计算机从操作系统位数，选择对应的JDK版本进行下载
        JDK8
  ![image](https://github.com/sumingsoftware/images/blob/master/jdk.png)
  
              JDK12
  ![image](https://github.com/sumingsoftware/images/blob/master/JDK12.png)
   
      下载后的存放目录C:\Program Files\Java\jdk1.8.0_152<br>
   ![image](https://github.com/sumingsoftware/images/blob/master/JDK%E5%AD%98%E6%94%BE%E7%9B%AE%E5%BD%95.png)
  
2. 设置环境变量   <br>    
        (1)设置JAVA_HOME   
        <br>
        C:\Program Files\Java\jdk1.8.0_152
        <br>
        右键单击“这台电脑”，然后左键单击“属性”
        <br>
  ![image](https://github.com/sumingsoftware/images/blob/master/JAVA%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E8%AE%BE%E7%BD%AE1.png)
          点击高级系统设置
          <br>
  ![image](https://github.com/sumingsoftware/images/blob/master/JAVA%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E8%AE%BE%E7%BD%AE2.png)
         点击环境变量
         <br>
  ![image](https://github.com/sumingsoftware/images/blob/master/JAVA%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E8%AE%BE%E7%BD%AE3.png)
        点击新建,变量名位置输入JAVA_HOME,变量值位置输入 C:\Program Files\Java\jdk1.8.0_152
        <br>
  ![image](https://github.com/sumingsoftware/images/blob/master/JAVA%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E8%AE%BE%E7%BD%AE4.png)
 <br>
        (2)设置Path
        <br>
  %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
  <br>
        (3)设置Classpath（前面是.; ,不要忘记）
        <br>
      .;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;
  
3. 检查环境变量是否设置成功
<br/>   
          打开DOS命令窗口，输入java -version, 点击回车，如果出现如下图的JDK版本信息，说明安装成功。
          <br>
          <br>
        ![image](https://github.com/sumingsoftware/images/blob/master/JAVA%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E8%AE%BE%E7%BD%AE%E6%A3%80%E6%9F%A5.png)
  

4.安装Eclipse(或者Intellij等编辑器)   
<br>
        下载Eclipse   
 下载地址https://www.eclipse.org/downloads/   
 安装Eclipse<br/>
