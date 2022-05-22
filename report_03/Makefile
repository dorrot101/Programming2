DIRS = enshu_1 enshu_2 kadai_1 kadai_2 challenge
NAME = ${USER}
NUM  = 03

all:;
	@for i in $(DIRS) ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i; \
		fi; \
	done

test:;
	@for i in $(DIRS) ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i test; \
		fi; \
	done

clean:;
	@for i in $(DIRS) ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i clean; \
		fi; \
	done

zip:;
	zip -r -o ${NAME}_${NUM}.zip \
		report.txt \
		*/*.java \
		*/Makefile \
		Makefile

utf2sjis:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java -o -name *.txt -o -name Makefile | xargs nkf -w -Lu --overwrite

