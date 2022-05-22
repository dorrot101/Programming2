#!/bin/sh
# 課題4: 確認作業を自動化するシェルスクリプトを作成 kadai4.sh

for file in wugraph/*.txt; do
    filename=$(basename $file)
    java MSTTester $file > wugraph_res/$filename
    diff -s wugraph_ans/$filename wugraph_res/$filename
done