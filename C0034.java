package me.mioclient;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2172;

public final class C0034 extends C0219 {
   public static int f0431 = w.a<"B">(5289858080108313336L, 257832362129977838L);

   public C0034() {
      super("ignore");
   }

   @Override
   public void exec(LiteralArgumentBuilder<class_2172> var1) {
      w.a<"Û">(
         (LiteralArgumentBuilder)w.a<"Û">(
            var1,
            w.a<"Û">(
               w.a<"B">("add", 233839479830701924L),
               w.a<"Û">(
                  w.a<"B">("name", w.a<"B">(192168525870671914L), 191188367299315725L),
                  (Command)var0 -> {
                     String var1x = w.a<"Û">((String)w.a<"Û">(var0, "name", String.class, 275658406246533271L), 308826267231227763L);
                     if (w.a<"Û">(w.a<"Û">(C0933.f1424, 356969323270842243L), var1x, 338145669613544495L)) {
                        w.a<"B">(
                           w.a<"B">(new C1002().m2591(var1x).m2593("You are already ignoring \u0001"), 228465064790135899L),
                           w.a<"B">((f0431 | 246474) + ~(f0431 & 246474) + 1 ^ 1679482002, 289296048454852994L),
                           241936116971186271L
                        );
                     } else {
                        w.a<"Û">(w.a<"Û">(C0933.f1424, 356969323270842243L), var1x, 309270453639690490L);
                        w.a<"B">(
                           w.a<"B">(new C1002().m2591(var1x).m2593("Player \u0001 has been ignored"), 228465064790135899L),
                           w.a<"B">((f0431 | 618886) + ~(f0431 & 618886) + 1 ^ 1678798814, 289296048454852994L),
                           241936116971186271L
                        );
                     }

                     return (f0431 | 856021) + ~(f0431 & 856021) + 1 ^ -1679036813;
                  },
                  368995281709124746L
               ),
               289819728773344295L
            ),
            289819728773344295L
         ),
         w.a<"Û">(
            w.a<"B">("remove", 233839479830701924L),
            w.a<"Û">(
               w.a<"Û">(
                  w.a<"B">("name", w.a<"B">(192168525870671914L), 191188367299315725L),
                  (SuggestionProvider)(var0, var1x) -> w.a<"B">(w.a<"Û">(C0933.f1424, 356969323270842243L), var1x, 210234445746591302L),
                  357832626693996259L
               ),
               (Command)var0 -> {
                  String var1x = w.a<"Û">((String)w.a<"Û">(var0, "name", String.class, 275658406246533271L), 308826267231227763L);
                  if (w.a<"Û">(w.a<"Û">(C0933.f1424, 356969323270842243L), var1x, 338145669613544495L)) {
                     w.a<"B">(
                        w.a<"B">(new C1002().m2591(var1x).m2593("\u0001 is no longer ignored"), 228465064790135899L),
                        w.a<"B">((f0431 | 10242) + ~(f0431 & 10242) + 1 ^ 1679373914, 289296048454852994L),
                        241936116971186271L
                     );
                     w.a<"Û">(w.a<"Û">(C0933.f1424, 356969323270842243L), var1x, 124697318442522382L);
                  } else {
                     w.a<"B">(
                        w.a<"B">(new C1002().m2591(var1x).m2593("You are not ignoring \u0001"), 228465064790135899L),
                        w.a<"B">((f0431 | 846921) + ~(f0431 & 846921) + 1 ^ 1679159825, 289296048454852994L),
                        241936116971186271L
                     );
                  }

                  return (f0431 | 780146) + ~(f0431 & 780146) + 1 ^ -1678965036;
               },
               368995281709124746L
            ),
            289819728773344295L
         ),
         289819728773344295L
      );
   }

   public static String etYoakjMM4qJ9kqhlAnxeQUCcFQHxjFl7HVhPtgjvpQ5gRU1mpx489fq9NzRUUOKxIAwK2He0X5Qjst3gJH7o9vDjvLhFy0K1mEt(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
