DIRS = kadai challenge
NAME = ${USER}
NUM  = 14

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
		*/*.java \
		*/*/*.txt \
		*/*.sh \
		kadai/wugraph \
		kadai/wugraph_out \
		kadai/wugraph_ans \
		kadai/wugraph_res \
		*/Makefile \
		Makefile


utf2sjis:;
	find . -name *.java -o -name *.txt -o -name Makefile -o name *.sh | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java -o -name *.txt -o -name Makefile -o name *.sh | xargs nkf -w -Lu --overwrite

