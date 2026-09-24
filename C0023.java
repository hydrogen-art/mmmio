package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.TimeUnit;
import me.mioclient.mixin.ducks.DuckMinecraftClient;
import net.minecraft.class_1268;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1569;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1829;
import net.minecraft.class_3966;

public class C0023 extends C1266 {
   public final C0015<Float> f2131;
   public final C0015<Boolean> f2132;
   public final C0015<Double> f2133;
   public final C0015<Integer> f2134;
   public final C0015<Boolean> f2135;
   public final C0015<Boolean> f2136;
   public final C0015<Boolean> f2137;
   public final C0015<Boolean> f2138;
   public final C0015<Boolean> f2139;
   public final C0015<Boolean> f2140;
   public final C0083 f2141;
   public static int f2142 = w.a<"B">(735138470670587881L, 257832362129977838L);

   public C0023() {
      super("Trigger", "Attacks entities under your crosshair.", C1045.f3172);
      w.a<"B">(this, 242859112966675773L);
      this.f2141 = new C0083();
   }

   @C1027
   public void m2872(C1095 var1) {
      if (w.a<"Û">(var1, 336212328865671254L) != C0277.f4215) {
         if (!w.a<"Û">(this, 205492958615326489L)) {
            if (w.a<"Û">(
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 229019767109027877L),
                  222207108884875224L
               ) instanceof class_1743
               || w.a<"Û">(
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 229019767109027877L),
                  222207108884875224L
               ) instanceof class_1829
               || !w.a<"Û">((Boolean)w.a<"Û">(this.f2132, 174312564406604366L), 354697271520518137L)) {
               if (m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1765 instanceof class_3966) {
                  class_1297 var2 = w.a<"Û">(
                     (class_3966)m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1765,
                     120740545413154530L
                  );
                  int var3 = var2 instanceof class_1657
                        && !w.a<"Û">(C0933.f1417, w.a<"Û">(w.a<"Û">(var2, 291295238331520790L), 286788181028845103L), 225253295937045434L)
                        && w.a<"Û">((Boolean)w.a<"Û">(this.f2136, 174312564406604366L), 354697271520518137L)
                     ? (f2142 | 296387) + ~(f2142 & 296387) + 1 ^ 1733893925
                     : (f2142 | 458915) + ~(f2142 & 458915) + 1 ^ 1733990980;
                  if (var3 != 0
                     && w.a<"Û">((Boolean)w.a<"Û">(this.f2137, 174312564406604366L), 354697271520518137L)
                     && !w.a<"B">((class_1657)var2, 130756052256592378L)) {
                     var3 = (f2142 | 320594) + ~(f2142 & 320594) + 1 ^ 1733918389;
                  }

                  if (w.a<"Û">(var2, 133372882497935473L)
                     && (
                        var3 != 0
                           || var2 instanceof class_1296 && w.a<"Û">((Boolean)w.a<"Û">(this.f2138, 174312564406604366L), 354697271520518137L)
                           || var2 instanceof class_1569 && w.a<"Û">((Boolean)w.a<"Û">(this.f2139, 174312564406604366L), 354697271520518137L)
                           || var2 instanceof class_1511 && w.a<"Û">((Boolean)w.a<"Û">(this.f2140, 174312564406604366L), 354697271520518137L)
                     )
                     && w.a<"Û">(
                           m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724,
                           w.a<"B">((f2142 | 657602) + ~(f2142 & 657602) + 1 ^ 1482134053, 349057757755238323L),
                           307875972928141599L
                        )
                        >= w.a<"B">((f2142 | 101835) + ~(f2142 & 101835) + 1 ^ 1490818860, 349057757755238323L)
                     && w.a<"Û">(
                        this.f2141,
                        w.a<"Û">((Double)w.a<"Û">(this.f2133, 174312564406604366L), 287934447355057060L) * w.a<"B">(329795338200638383L),
                        TimeUnit.SECONDS,
                        215737872562411156L
                     )
                     && w.a<"Û">(
                           m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724,
                           var2,
                           274649721728910700L
                        )
                        <= w.a<"Û">((Float)w.a<"Û">(this.f2131, 174312564406604366L), 149784643039979208L)) {
                     w.a<"Û">(
                        this,
                        w.a<"B">(w.a<"Û">((Integer)w.a<"Û">(this.f2134, 174312564406604366L), 260981171345819427L), 121600475411070866L),
                        353847612103276312L
                     );
                     w.a<"Û">(this.f2141, 387780412884547639L);
                  }
               }
            }
         }
      }
   }

   public void m2873(boolean var1) {
      if (var1) {
         w.a<"Û">(
            m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724,
            class_1268.field_5808,
            356560492913773202L
         );
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 257015636314407964L);
      } else {
         ((DuckMinecraftClient)m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff).attack();
      }
   }

   public static String K3BIckaza75mTvxrGmj1ta1sre4ZRy7O3ByC0PkD96d0dT5luek60AQFzWJiY3H1bjbwUvNPfQJNVJt6t6TzbQmFyZg62NaHeGvW(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
