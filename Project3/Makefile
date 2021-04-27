run: myInterp.g  myInterp_test.java
	java -jar antlr-3.5.2-complete-no-st3.jar
	java -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myInterp.g 
	javac -cp antlr-3.5.2-complete-no-st3.jar:. myInterp_test.java
	java -cp antlr-3.5.2-complete-no-st3.jar:. myInterp_test test1
	java -cp antlr-3.5.2-complete-no-st3.jar:. myInterp_test test2
	java -cp antlr-3.5.2-complete-no-st3.jar:. myInterp_test test3
