package to.msn.wings.selflearn.chap08.implement;

public class LoggableImpl implements  Loggable{}
//ここでオーバーライドしないならインターフェイス側にあるデフォルトメソッドが適用される。
/*
 @Override
 public void log(String msg){
 Loggable.super.log(msg);
 }
 みたいにsuperをつけると、明示的にデフォルトメソッドを呼び出せる。
*/