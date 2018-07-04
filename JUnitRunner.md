## JUnit Runner

### Execution

For execute JUnit Runner from command-line use the following command:

```    
java -cp taurus-java-helpers-[VERSION].jar:junit-[VERSION].jar com.blazemeter.taurus.junit.CustomRunner [PATH_TO_PROPERTIES_FILE]
```
    
### Properties file

This file contains properties as `{key}={value}` pairs. Each property should be define at the new line.

Custom Runner expects the following properties:

- `target_***` - paths to `*.jar` file, that contains JUnit test case classes 

- `report_file` - path to report file

- `iterations` - execution count of Test Suite (long value)

- `hold_for` - duration limit in seconds (float value)

Also you can specify custom properties, that will be pass to Java System Properties, e.g.:

```
var1=value1
var2=val2
```

#### Example 
```
target_lib1=/home/user/tests/libs/myLib.jar
target_lib2=C:/libs/myLib.jar
report_file=/home/user/reports/junit.xml
iterations=1
hold_for=60

var1=value1
var2=val2
```