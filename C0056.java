package me.mioclient;

import net.minecraft.class_1738;
import net.minecraft.class_1792;

public class C0056 implements C1117 {
   public static int f4242 = w.a<"B">(4129387279496238238L, 257832362129977838L);

   @Override
   public void m1208(C0136 var1) {
      w.a<"B">(w.a<"Û">(var1, 276615241323197793L), w.a<"Û">(var1, 280531567236027014L), 238771771368340878L);
   }

   @Override
   public void m1209(C0136 var1) {
      w.a<"B">(w.a<"Û">(var1, 280531567236027014L), w.a<"Û">(var1, 276615241323197793L), 238771771368340878L);
   }

   @Override
   public C0136 m1210(class_1792 var1) {
      if (!w.a<"B">(var1, 264334521969076694L)) {
         return C0136.f0280;
      } else {
         int var2 = (f4242 | 922102) + ~(f4242 & 922102) + 1 ^ 989915902;
         if (var1 instanceof class_1738 var3) {
            var2 = ((f4242 | 358121) + ~(f4242 & 358121) + 1 ^ 990612975) - w.a<"Û">(w.a<"Û">(var3, 337650081844373857L), 296145192384863639L);
         }

         int var4 = w.a<"B">(var1, 261845468269893067L);
         return new C0136(var4, var2);
      }
   }
}
