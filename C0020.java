package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.Supplier;

public enum C0020 implements C0196 {
   f0356("Solid", () -> C0789.f1293),
   f0357("Rainbow", () -> C0789.f1294),
   f0358("Gradient", () -> C0789.f1295),
   f0359("Bloom", () -> C0789.f1296);

   public final String f0360;
   public final Supplier<C0344> f0361;

   public C0020(String var3, Supplier<C0344> var4) {
      this.f0360 = var3;
      this.f0361 = var4;
   }

   public C0344 m0216() {
      return (C0344)w.a<"Û">(this.f0361, 151449370165949320L);
   }

   @Override
   public String getName() {
      return this.f0360;
   }

   public static String Q0SDDKkqX4AOsSW6ghl4nbijj8Vwg5poTdp67BrU9884y7SZwW9PfaZdQJYugnBQbTYnP5DhKvwcpGtXRY0o1tJuvnY56a9oLqcP(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
