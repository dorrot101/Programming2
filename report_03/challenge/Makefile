.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= Nim.java Computer.java Player.java
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= Nim

all: $(CLASS)

test: $(CLASS)
	$(JAVA) $(MAIN)

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class

