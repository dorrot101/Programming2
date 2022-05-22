.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: 年月が無指定された場合(実行時の年月)】"
	$(JAVA) MyCalendar

	@echo "【確認2: 年月が指定された場合】"
	$(JAVA) MyCalendar 2021 6

	@echo "【確認3: 年が指定された場合】"
	$(JAVA) MyCalendar 2021

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
