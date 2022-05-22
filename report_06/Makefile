DIRS = lesson_13-2 lesson_13-3 lesson_13-4 kadai_1 kadai_2 challenge
NAME = ${USER}
NUM  = 05

all:;
	@for i in * ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i; \
		fi; \
	done

test:;
	@for i in * ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i test; \
		fi; \
	done

clean:;
	@for i in * ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i clean; \
		fi; \
	done

zip:;
	zip -r -o ${NAME}_${NUM}.zip \
		report.txt \
		*/*.java \
		*/*.txt \
		*/Makefile \
		Makefile

utf2sjis:;
	find . -name *.java | xargs nkf -s -Lw --overwrite
	find . -name Makefile | xargs nkf -s -Lw --overwrite
	find . -name *.txt | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java | xargs nkf -w -Lu --overwrite
	find . -name Makefile | xargs nkf -w -Lu --overwrite
	find . -name *.txt | xargs nkf -w -Lu --overwrite

