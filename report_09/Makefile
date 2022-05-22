DIRS = lesson_18-2 lesson_18-3 kadai_1 kadai_2 kadai_3 challenge
NAME = ${USER}
NUM  = 09

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
		lesson_18-?/*.java \
		kadai_?/*.java \
		kadai_?/*.txt \
		kadai_?/*.jpg \
		kadai_3/1st \
		*/Makefile \
		challenge/*.java \
		challenge/1st \
		Makefile

utf2sjis:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -w -Lu --overwrite
