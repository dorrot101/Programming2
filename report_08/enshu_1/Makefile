.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1 \"Hello World!\"を指定】"
	$(JAVA) PrintCode "Hello World!"
	@echo
	@echo "【確認2 引数がない場合】"
	$(JAVA) PrintCode


$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
