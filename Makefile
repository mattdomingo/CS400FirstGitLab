default: run

compile:
	javac Main.java Color.java

run: compile
	java Main
