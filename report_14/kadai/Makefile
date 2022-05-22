.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test:;
	@echo 今回は make test は使用しません
	@echo 初期のテストにはkada1から4をターゲットとする規則を用いてください
	@echo 課題1と課題4は別途シェルスクリプトを作成してください
	@echo 必要に応じてkadai1～4のレシピを修正してもよい

kadai1: WUGraph.class LoadPrintTester.class
	./kadai1.sh

kadai2: WUGraph.class EdgeSortTester.class
	java EdgeSortTester wugraph/wug_0.txt

kadai3: UnionFind.class UnionFindTester.class
	java UnionFindTester

kadai4: UnionFind.class WUGraph.class MSTTester.class
	./kadai4.sh

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class wugraph_res/*.txt wugraph_out/*.txt
