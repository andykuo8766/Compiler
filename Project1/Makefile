run: mylexer.g  testLexer.java
	java -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool mylexer.g 
	javac -cp ./antlr-3.5.2-complete-no-st3.jar testLexer.java mylexer.java
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testLexer test1.c
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testLexer test2.c
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testLexer test3.c