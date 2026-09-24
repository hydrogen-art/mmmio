package me.mioclient;

import java.util.function.Consumer;

public class C0033<T> implements C0900 {
   public final Class<?> f1678;
   public final int f1679;
   public final Consumer<T> f1680;

   public C0033(Class<?> var1, int var2, Consumer<T> var3) {
      this.f1678 = var1;
      this.f1679 = var2;
      this.f1680 = var3;
   }

   public C0033(Class<?> var1, Consumer<T> var2) {
      this(var1, 0, var2);
   }

   @Override
   public void m1833(Object var1) {
      this.f1680.accept((T)var1);
   }

   @Override
   public Class<?> m1834() {
      return this.f1678;
   }

   @Override
   public int m1835() {
      return this.f1679;
   }

   @Override
   public boolean m1836() {
      return false;
   }
}
