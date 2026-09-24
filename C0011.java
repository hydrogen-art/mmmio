package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.Predicate;

public final class C0011 extends C0015<C1348> {
   public static int f5132 = w.a<"B">(2155770200752385004L, 257832362129977838L);

   public C0011(String var1, C1348 var2) {
      super(var1, var2);
   }

   public C0011(String var1, C1348 var2, Predicate<C1348> var3) {
      super(var1, var2, var3);
   }

   @Override
   public void m0645(String var1) {
      String[] var2 = w.a<"Û">(var1, ":", 369825978071233340L);
      if (var2.length == ((f5132 | 429779) + ~(f5132 & 429779) + 1 ^ -1006982220)) {
         w.a<"Û">(this, new C1348(var1), 277551887451345681L);
      } else if (var2.length == ((f5132 | 42321) + ~(f5132 & 42321) + 1 ^ -1006862283)) {
         w.a<"Û">(
            this,
            new C1348(var2[(f5132 | 490483) + ~(f5132 & 490483) + 1 ^ -1006936427], var2[(f5132 | 403593) + ~(f5132 & 403593) + 1 ^ -1007022610]),
            277551887451345681L
         );
      }
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      w.a<"Û">(var1, "name", w.a<"Û">((C1348)w.a<"Û">(this, 174312564406604366L), 380852241946877156L), 179792809915938270L);
      w.a<"Û">(var1, "category", w.a<"Û">((C1348)w.a<"Û">(this, 174312564406604366L), 376576959810656411L), 179792809915938270L);
      return var1;
   }

   @Override
   public void fromJson(JsonElement var1) {
      JsonObject var2 = w.a<"Û">(var1, 322749330123725882L);
      String[] var10001 = new String[(f5132 | 503066) + ~(f5132 & 503066) + 1 ^ -1006925698];
      var10001[(f5132 | 225518) + ~(f5132 & 225518) + 1 ^ -1006676600] = "name";
      var10001[(f5132 | 601916) + ~(f5132 & 601916) + 1 ^ -1007351205] = "category";
      if (w.a<"B">(var2, var10001, 240802080559288953L)) {
         String var3 = w.a<"Û">(w.a<"Û">(var2, "name", 268791691692763549L), 327479800495025542L);
         String var4 = w.a<"Û">(w.a<"Û">(var2, "category", 268791691692763549L), 327479800495025542L);
         w.a<"Û">(this, new C1348(var4, var3), 277551887451345681L);
      }
   }

   public static String _daT4rCRJsJkhvaRaFsL96I1dHUjzSjM30OFBcwhj6qn26HZAMgyc8W2Ri0HeZt3v0hFb7gbcQOji2ZstAxX42BgbHS999t8J7d1/* $VF was: 4daT4rCRJsJkhvaRaFsL96I1dHUjzSjM30OFBcwhj6qn26HZAMgyc8W2Ri0HeZt3v0hFb7gbcQOji2ZstAxX42BgbHS999t8J7d1*/(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
