.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= TextToUpperTester

all: $(CLASS)

test: $(CLASS)
	mv foobar.txt foobar_bak.txt
	echo "testing data" > foobar.txt
	@echo
	@echo "【確認1：\"testing data\"と書かれたファイル(foobar.txt)を作成し、プログラムを実行";	
	$(JAVA) $(MAIN)
	@echo
	@echo "【確認2：foobar.txtを削除しファイルが存在しない状態でプログラムを実行";	
	rm -f foobar.txt
	$(JAVA) $(MAIN)
	mv foobar_bak.txt foobar.txt

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class

