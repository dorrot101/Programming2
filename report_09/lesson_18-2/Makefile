.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo ""
	@echo "【確認1 文字列「main」をFindFile1.javaから検索】"
	$(JAVA) FindFile1 main FindFile1.java
	@echo ""
	@echo "【確認2 文字列「FindFile1」をFindFile1.javaから検索】"
	$(JAVA) FindFile1 FindFile1 FindFile1.java 
	@echo ""
	@echo "【確認3 文字列「TekitonaMojiretsu」をFindFile1.javaから検索】"
	$(JAVA) FindFile1 TekitonaMojiretsu FindFile1.java 

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
