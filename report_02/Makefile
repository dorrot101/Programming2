DIRS = enshu_1 enshu_2 enshu_3 kadai challenge
NAME = ${USER}
NUM = 02

all:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i; \
		fi; \
	done

test:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i test; \
		fi; \
	done

clean:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i clean; \
		fi; \
	done

zip:;
	zip -o ${USER}_${NUM}.zip -r \
		Makefile \
		*/Makefile \
		enshu_[1-3]/*.java \
		kadai/*.java \
		challenge/*.java \
		report.txt

utf2sjis:;
	find . -name *.java -o -name *.txt -o -name Makefile | \
		xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java -o -name *.txt -o -name Makefile | \
		xargs nkf -w -Lu --overwrite

