# Postfix Expression - CS 2400 Project 2
Huzail Hassan and Amar Gandhi | CS 2400.04

## JUnit Testing

To run tests from the command line issue the following command in the project directory (assuming that you have Java 8 on your system path):

Windows:

`java -jar .\lib\junit-platform-console-standalone-1.7.1-all.jar -cp .\out\production\Homework2\ --scan-classpath`

Linux/macOS (untested):

`java -jar ./lib/junit-platform-console-standalone-1.7.1-all.jar -cp ./out/production/Homework2/ --scan-classpath`

Your output should look like the following:

```
.
+-- JUnit Jupiter [OK]
| +-- ArrayStackTest [OK]
| | +-- evaluatePosfix_Given_2() [OK]
| | +-- evaluatePosfix_Given_3() [OK]
| | '-- evaluatePosfix_Given() [OK]
| '-- LinkedStackTest [OK]
|   +-- convertToPostfix_LeadingWhitespace() [OK]
|   +-- convertToPostfix_TrailingWhitespace() [OK]
|   '-- convertToPostfix_Given() [OK]
'-- JUnit Vintage [OK]

Test run finished after 75 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[         6 tests found           ]
[         0 tests skipped         ]
[         6 tests started         ]
[         0 tests aborted         ]
[         6 tests successful      ]
[         0 tests failed          ]
```

Alternatively, open the repository in VSCode with the [Java Test Runner](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test) extension installed (should come with the Java extension pack), or in another IDE that supports JUnit (such as Idea or Eclipse).

