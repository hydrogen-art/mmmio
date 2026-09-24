package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2960;

public class C0032 extends C1266 {
   public static final class_2960 f4908 = w.a<"B">("mio-mount", "textures/shine.png", 226297093937582094L);
   public final C0015<Color> f4909;
   public static int f4910 = w.a<"B">(1593957334754311832L, 257832362129977838L);

   public C0032() {
      super("Glint", "Changes your enchantment glint's color.", C1045.f3174);
      w.a<"B">(this, 242859112966675773L);
   }

   @C1027
   public void m3979(C0052 var1) {
      if (w.a<"Û">(var1, 224750614909859690L) == C0277.f4214) {
         Color var2 = (Color)w.a<"Û">(this.f4909, 174312564406604366L);
         w.a<"Û">(
            w.a<"Û">(w.a<"Û">(w.a<"B">(249781506980689257L), 212007125412436034L), f4908, 117952533399137933L),
            (boolean)((f4910 | 741534) + ~(f4910 & 741534) + 1 ^ 1353521635),
            (boolean)((f4910 | 468003) + ~(f4910 & 468003) + 1 ^ 1352756575),
            310918076993443686L
         );
         w.a<"B">((f4910 | 420252) + ~(f4910 & 420252) + 1 ^ 1352671456, f4908, 271900140776288940L);
         w.a<"B">(
            (float)w.a<"Û">(var2, 239609820066095028L) / w.a<"B">((f4910 | 86805) + ~(f4910 & 86805) + 1 ^ 332929641, 349057757755238323L),
            (float)w.a<"Û">(var2, 340797987757289690L) / w.a<"B">((f4910 | 623695) + ~(f4910 & 623695) + 1 ^ 332451123, 349057757755238323L),
            (float)w.a<"Û">(var2, 212499208735578764L) / w.a<"B">((f4910 | 92532) + ~(f4910 & 92532) + 1 ^ 332931080, 349057757755238323L),
            w.a<"B">((f4910 | 916606) + ~(f4910 & 916606) + 1 ^ 1865135362, 349057757755238323L),
            338561931007909111L
         );
      } else {
         w.a<"B">(
            w.a<"B">((f4910 | 631329) + ~(f4910 & 631329) + 1 ^ 1865411421, 349057757755238323L),
            w.a<"B">((f4910 | 22993) + ~(f4910 & 22993) + 1 ^ 1864765613, 349057757755238323L),
            w.a<"B">((f4910 | 763785) + ~(f4910 & 763785) + 1 ^ 1865281269, 349057757755238323L),
            w.a<"B">((f4910 | 346492) + ~(f4910 & 346492) + 1 ^ 1864564736, 349057757755238323L),
            338561931007909111L
         );
      }
   }

   public static String zUcHnkGjlPyMsHsXl48KJdu8z3345Bb3HdM6LHiaU9RGSGdGv3YYyHyaUww8Pkg8HScqG3RARHKklTFoZAexAvNMxiFZMpWUZsFU(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
