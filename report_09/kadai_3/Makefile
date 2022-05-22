.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo 【確認1: カレントディレクトリを表示】
	$(JAVA) ListRecursive ./
	@echo 【確認2: 親ディレクトリを表示】
	$(JAVA) ListRecursive ../

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
