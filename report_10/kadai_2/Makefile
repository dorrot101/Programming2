.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= SignalSimulator

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1 信号の間隔60，車の出現間隔3の場合】"
	$(JAVA) $(MAIN) 60 3
	@echo "【確認2 信号の間隔30，車の出現間隔3の場合】"
	$(JAVA) $(MAIN) 30 3 
	@echo "【確認3 信号の間隔15，車の出現間隔3の場合】"
	$(JAVA) $(MAIN) 15 3 

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
