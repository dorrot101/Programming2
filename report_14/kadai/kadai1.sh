#!/bin/sh
# 課題1: 確認作業を自動化するシェルスクリプトを作成 kadai1.sh

for file in wugraph/*.txt; do
    filename=$(basename $file)
    java LoadPrintTester $file > wugraph_out/$filename
    diff -s $file wugraph_out/$filename
done