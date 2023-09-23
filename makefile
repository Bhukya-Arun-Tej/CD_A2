run:
	javac Main.java
	java Main < test.java
build:
	java -jar jtb132.jar minijava.jj
	javacc jtb.out.jj	
