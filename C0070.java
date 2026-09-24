package me.mioclient;

import com.google.gson.JsonObject;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BiConsumer;
import net.minecraft.class_124;
import net.minecraft.class_2172;

public class C0070 extends C1073 {
   public static int f4092 = w.a<"B">(6952612722619785936L, 257832362129977838L);

   public C0070() {
      super("queue");
   }

   @Override
   public void exec(LiteralArgumentBuilder<class_2172> var1) {
      w.a<"Û">(
         var1,
         (Command)var1x -> {
            w.a<"B">(w.a<"B">("Fetching data...", 273107254583785490L), w.a<"B">(this, 125714438377117436L), 241936116971186271L);
            w.a<"Û">(
               w.a<"Û">(this, "queue", null, 280718462408574149L),
               (BiConsumer<JsonObject, Throwable>)(var1xx, var2) -> {
                  Object var3 = null;
                  if (var2 != null) {
                     var3 = w.a<"Û">(var2, 366087562966767608L);
                  } else {
                     try {
                        int var4 = (f4092 | 674792) + ~(f4092 & 674792) + 1 ^ 58276081;
                        int var5 = (f4092 | 370110) + ~(f4092 & 370110) + 1 ^ 58119847;
                        if (w.a<"Û">(var1xx, "prio", 314399812765309162L)) {
                           var4 = w.a<"Û">(w.a<"Û">(var1xx, "prio", 268791691692763549L), 113424266836384094L);
                        }

                        if (w.a<"Û">(var1xx, "regular", 314399812765309162L)) {
                           var5 = w.a<"Û">(w.a<"Û">(var1xx, "regular", 268791691692763549L), 113424266836384094L);
                        }

                        StringBuilder var6 = new StringBuilder();
                        if (var5 != ((f4092 | 46242) + ~(f4092 & 46242) + 1 ^ 57919419)) {
                           Object[] var10002 = new Object[(f4092 | 749109) + ~(f4092 & 749109) + 1 ^ -58202134];
                           var10002[(f4092 | 943311) + ~(f4092 & 943311) + 1 ^ -58528495] = w.a<"B">(var5, 367942141483020029L);
                           w.a<"Û">(var6, w.a<"Û">("%d in normal queue", var10002, 259257223839993282L), 150545021362368941L);
                        }

                        if (var5 != ((f4092 | 54361) + ~(f4092 & 54361) + 1 ^ 57911104) && var4 != ((f4092 | 759103) + ~(f4092 & 759103) + 1 ^ 58254886)) {
                           w.a<"Û">(var6, ", ", 150545021362368941L);
                        }

                        if (var4 != ((f4092 | 382500) + ~(f4092 & 382500) + 1 ^ 58107197)) {
                           Object[] var9 = new Object[(f4092 | 450632) + ~(f4092 & 450632) + 1 ^ -58037865];
                           var9[(f4092 | 289597) + ~(f4092 & 289597) + 1 ^ -58137885] = w.a<"B">(var4, 367942141483020029L);
                           w.a<"Û">(var6, w.a<"Û">("%d in priority queue", var9, 259257223839993282L), 150545021362368941L);
                        }

                        w.a<"B">(w.a<"B">(w.a<"Û">(var6, 167209770867625114L), 273107254583785490L), w.a<"B">(this, 125714438377117436L), 241936116971186271L);
                        return;
                     } catch (Exception var7) {
                        var3 = w.a<"Û">(var7, 167589060831725173L);
                     }
                  }

                  if (var3 != null) {
                     w.a<"B">(
                        w.a<"B">(new C1002().m2591(var3).m2591(w.a<"B">(class_124.field_1061, 174997918119584642L)).m2593("\u0001\u0001"), 273107254583785490L),
                        w.a<"B">(this, 125714438377117436L),
                        C0639.f3881,
                        211469761772001922L
                     );
                  }
               },
               334160241183483360L
            );
            return (f4092 | 349310) + ~(f4092 & 349310) + 1 ^ -58073695;
         },
         286944572020109927L
      );
   }

   public static String gokDHNTlSIsZwLQEcHKJvOB0sdMrF30OkGPna5fJMglwwyhSeOw94Q5HjmUXFCV6ZZkkJhQ24h8JCf4Y81O5Pl9k9J8p32h6A6zu(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
