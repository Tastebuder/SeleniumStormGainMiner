# SeleniumStormGainMiner
## Select which OS to run on
Choose which webdriver you wish to use, just change the os folder name between windows/mac
```java
System.setProperty("webdriver.chrome.driver","src/test/resources/windows/chromedriver.exe");
```

## Run for your StormGain User
Copy the `src/test/java/AdamLoginTest.java` file and add your credentials, 2FA must be disabled.

## Run your test once
Change the value of test= to your test name, the class have the word Test in it for junit to pattern match it
```java
mvn -D test=AdamLoginTest test
```

## Run your test on a schedule
### Windows
Set up a Task Schedule that runs every 245 minutes with an action containing a .sh file with the above command inside, set the script to start in the directory where the file is located for ease.

### Unix
Set up a cron or use Automator
