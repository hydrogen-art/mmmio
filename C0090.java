package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class C0090 extends C1266 {
   public static final double f3023 = w.a<"B">(((long)C0090.f3024 | 87L) + ~((long)C0090.f3024 & 87L) + 1L ^ 4596374139143384815L, 317139102743630955L);
   public static int f3024 = w.a<"B">(5090482726201525949L, 257832362129977838L);

   public C0090() {
      super("HitboxDesync", "Crashes chinese crystal auras.", C1045.f3177);
   }

   @C1027
   public void m3273(C0612 var1) {
      if (m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687 != null) {
         class_2350 var2 = w.a<"Û">(
            m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 284966267891927393L
         );
         class_238 var3 = w.a<"Û">(
            m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 261249985676109960L
         );
         class_243 var4 = w.a<"Û">(var3, 376895844755266015L);
         class_243 var5 = new class_243(w.a<"Û">(var2, 336968210434395700L));
         class_243 var6 = w.a<"Û">(
            this,
            w.a<"Û">(
               w.a<"Û">(
                  w.a<"B">(w.a<"B">(var4, 274163478939689086L), 250673775726706964L),
                  w.a<"B">(((long)f3024 | 844144L) + ~((long)f3024 & 844144L) + 1L ^ 4602678821116756655L, 317139102743630955L),
                  0.0,
                  w.a<"B">(((long)f3024 | 366783L) + ~((long)f3024 & 366783L) + 1L ^ 4602678821117344608L, 317139102743630955L),
                  215037093685651073L
               ),
               w.a<"Û">(
                  var5, w.a<"B">(((long)f3024 | 933084L) + ~((long)f3024 & 933084L) + 1L ^ 4596374139142460004L, 317139102743630955L), 310215828564446757L
               ),
               300445064978294627L
            ),
            var2,
            109468724637895741L
         );
         w.a<"Û">(
            m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724,
            var6.field_1352 == 0.0
               ? w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 268094392877253824L)
               : var6.field_1352,
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 358934561846661819L),
            var6.field_1350 == 0.0
               ? w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 310441135103619165L)
               : var6.field_1350,
            267135527332903540L
         );
         w.a<"Û">(this, 155417974908982175L);
      }
   }

   public class_243 m3274(class_243 var1, class_2350 var2) {
      return new class_243(
         var1.field_1352 * (double)w.a<"B">(w.a<"Û">(w.a<"Û">(var2, 336968210434395700L), 138421017466979018L), 159606413758159910L),
         var1.field_1351 * (double)w.a<"B">(w.a<"Û">(w.a<"Û">(var2, 336968210434395700L), 378023363593035523L), 159606413758159910L),
         var1.field_1350 * (double)w.a<"B">(w.a<"Û">(w.a<"Û">(var2, 336968210434395700L), 217197552266331542L), 159606413758159910L)
      );
   }

   public static String fBHZiJeUPBlxryvl0s5SNbRJzzXn1zZTM0KXpOmsGBcOYAHCHqfpXqp0iW6dohIJPa76gldouhiF6CHNmeMM9qBSVY3ppVvM982N(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
