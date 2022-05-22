.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: テキストファイル(UTF8)のコピー】"
	$(JAVA) FileCopy sample_utf8.txt sample_utf8-copy.txt
	diff sample_utf8.txt sample_utf8-copy.txt
	@echo "【確認2: テキストファイル(SJIS)のコピー】"
	$(JAVA) FileCopy sample_sjis.txt sample_sjis-copy.txt
	diff sample_sjis.txt sample_sjis-copy.txt
	@echo "【確認3: バイナリファイル(JPEGのコピー】"
	$(JAVA) FileCopy sample.jpg sample-copy.jpg
	diff sample.jpg sample-copy.jpg
	@echo "【確認4: ファイルが存在する場合の処理】"
	touch test
	$(JAVA) FileCopy sample_utf8.txt test
	rm test

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
	\rm -f *-copy.*
