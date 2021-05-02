run: myCompiler.g  myCompiler_test.java
	java -jar antlr-3.5.2-complete-no-st3.jar
	java -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myCompiler.g 
	javac -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test.java
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test1-1.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test1-2.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test2-1.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test2-2.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test3-1.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult
	java -cp antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test3-2.c > myCompiler.j
	java -jar jasmin.jar myCompiler.j
	java myResult