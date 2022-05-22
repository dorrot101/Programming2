.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test:;
	@echo 今回は make test は使用できません。make kadai1, make kadai2, make kadai3 で課題チェックが動くようMakefileを編集してください。
kadai1: $(CLASS)
	$(JAVAC) GraphTester.java
	java GraphTester sample.txt
kadai2: $(CLASS)
	$(JAVAC) DijkstraTester.java
	@for i in 0 1 2 3 4 5 6 ; do \
		java DijkstraTester sample.txt 0 $$i ; \
	done
kadai3: $(CLASS)
	$(JAVAC) PQDijkstraTester.java
	@for i in 0 1 2 3 4 5 6 ; do \
		java PQDijkstraTester sample.txt 0 $$i ; \
	done
.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
