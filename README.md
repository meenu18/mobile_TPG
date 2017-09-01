# mobile_TPG
Mobile Automation SetUp Guide:

Software required:
Java
Eclipse
Maven
Appium server
Android SDK
Node.js
Latest Appium Client library and appium jar files for java
APK files 

Installation and path set up of different software:

Java and Eclipse Installation:
 1. Install Java Development Kit (JDK)-
To install that  go to THIS LINK http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html. Download the latest version of java and install it.

2. Setup Java Environmental Variable Path  -
Go to to Start Menu and searach for 'Environmental variable' and click on it. Then Click on Environmental variable and add New System Variable with variable name as JAVA_HOME and classpath as your jdk path

3. Install Eclipse
Download Eclipse from https://eclipse.org/downloads/.
Click on .exe file and install it.

Create Maven Project:
In the Eclipse IDE, navigate to File > New > Other… in order to bring up the project creation wizard.
Scroll to the Maven folder, open it, and choose Maven Project. Then choose Next.
You may choose to Create a simple project or forgo this option. Leave other options as is, and click Next.
Now, you will need to enter information regarding the Maven Project you are creating. You may visit the Maven documentation for a more in-depth look at the Maven Coordinates (http://maven.apache.org/pom.html#Maven_Coordinates). In general, the Group Id should correspond to your organization name, and the Artifact Id should correspond to the project’s name. The version is up to your discretion as is the packing and other fields. If this is a stand-alone project that does not have parent dependencies, you may leave the Parent Project section as is. Fill out the appropriate information, and click Finish.
You will now notice that your project has been created. You will place your Java code in /src/main/java, resources in /src/main/resources, and your testing code and resources in /src/test/java and /src/test/resources respectively.
Open the pom.xml file to view the structure Maven has set up. In this file, you can see the information entered in Step 4. You may also use the tabs at the bottom of the window to change to view Dependencies, the Dependency Hierarchy, the Effective POM, and the raw xml code for the pom file in the pom.xml tab.
You now have a new Java project with Maven enabled.

Appium Client library and appium jar files for java:
Add selenium maven dependency from https://mvnrepository.com/artifact/io.appium.
Add maven dependency from https://mvnrepository.com/artifact/io.appium.


Android SDK Installation:
Open url https://developer.android.com/studio/index.html
Select the other download option and download the windows.zip folder.
Upzip folder, SDK manger and AVD manager should be present under the folder (if not present then go on to lib folder, find there the same).
Double click on SDK Manger for installing it 
select the build tools.
select the android sdk platform tools.
select the android version
  5. Set the sdk path :
Go to My Computer-> open properties-> Advance system setting -> Environment variables -> under user variable set (variable name="ANDROID_HOME" and Variable value="D:\Application\Mobile_testing_sw\sdk_tools_r25.2.3-windows\" (specify the full path where android sdk zip folder exracted).
Edit the system variable, edit "Path" variable, add path till platform tools add semicolon and then path till tools.
 6. Check the sdk installation by type "adb" in cmd.

Appium Server Installation:
Download apium for windows from https://bitbucket.org/appium/appium.app/downloads/
Double click on the .exe and install Appium. 
Launch by clicking the icon.
Android Settings:
Select Platform Name = Android
Select Automation Name = Appium
Select PlatformVersion = Your android device's OS version. 
Select Android setting, Set application path where .apk file present.
set the sdk path under advance setting.
  5. General Settings:
Go on General Setting tab->Server Address is : 127.0.0.1 and Port number is : 4723.We need it during appium software automation test script creation. 

Node.js Installation:
 Download node.js from https://nodejs.org/en/download/ and install it.








