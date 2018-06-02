# jackson-kotlin-sample

## デシリアライズ
### 基本編
データクラスで、名前と型をそろえれば、あっという間に出来上がり。(test1, test2)
配列は、DoubleArrayとかIntArrayを使ってもいいけど、(test1)
StringArrayがKotlinにないので、Array<String>を使う。(test2)

### 超便利!
型をAnyにすれば、名前が一致すれば好きなように取り出せるので、便利。
構造だけ合えばいい。(test3)

## 値の更新
配列を更新しようとすると、
Kotlin: Unsupported [Collection literals outside of annotations]が出てしまう?
→doubleArrayOfが使える。(test1)、
stringArrayOfとかanyArrayOfは存在しないのようなので、arrayOfで渡せばよい。(test2, test3)

## シリアライズ & ファイル書き込み
mapper.writeValue(ClassLoader.getSystemResource("Test.json"), test)
みたいにやったがうまくいかなかったのは、resourcesフォルダだから。
(src/dist以下に置いた場合、File()をかませば、なんの問題もない。)
### SerializationFeature.INDENT_OUTPUTの挙動について
勝手にCRLFにしている? あと、IntelliJ IDEAのコード自動フォーマット(Ctrl+Alt+L)より、改行少な目。

## その他
readで使ったファイルを上書きしたい。どうすればよいのか?
→resourcesフォルダではなく、distフォルダなどを使ったほうがよさげ。
(src/main/resourcesから読みだして、build/resourcesフォルダに書くから。)
