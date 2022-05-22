DIRS = enshu_1 enshu_2 enshu_3 kadai challenge
NAME = ${USER}
NUM  = 08

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
	zip -r -o ${NAME}_${NUM}.zip \
		report.txt \
		enshu_?/*.java \
		kadai/*.java \
		kadai/*.txt \
		*/Makefile \
		challenge/*.java \
		challenge/*.txt \
		challenge/*.html \
		Makefile

utf2sjis:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -w -Lu --overwrite

