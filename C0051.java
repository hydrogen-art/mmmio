package me.mioclient;

import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_2338;

public abstract class C0051 implements C0045, C0170 {
   public static C0846 speedmine = C0933.f1409.m2696(C0846.class);
   public final C1061 f1743;
   public static int f1744 = w.a<"B">(3538160736768787560L, 257832362129977838L);

   public C0051(C1061 var1) {
      this.f1743 = var1;
   }

   public boolean m1425(class_2338 var1) {
      if (var1.equals(w.a<"Û">(this.f1743.f4625, 355885868896307572L))) {
         return (boolean)((f1744 | 106426) + ~(f1744 & 106426) + 1 ^ -1380725871);
      } else if (w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 270398306108537951L),
            w.a<"Û">(var1, 229561253177300454L),
            180844654503832142L
         )
         > (double)w.a<"Û">(this.f1743, 168666589868586713L)) {
         return (boolean)((f1744 | 552685) + ~(f1744 & 552685) + 1 ^ -1380304186);
      } else if (!w.a<"Û">(speedmine, var1, 231084082479479476L)) {
         return (boolean)((f1744 | 416727) + ~(f1744 & 416727) + 1 ^ -1380708356);
      } else {
         if (w.a<"Û">((Boolean)w.a<"Û">(this.f1743.f4606, 174312564406604366L), 354697271520518137L)) {
            List var2 = w.a<"B">(var1, 239126559569481376L);
            if (w.a<"Û">(var2, 284469716622774448L)) {
               return (boolean)((f1744 | 888722) + ~(f1744 & 888722) + 1 ^ -1379935303);
            }
         }

         return (boolean)(w.a<"Û">((Boolean)w.a<"Û">(this.f1743.f4607, 174312564406604366L), 354697271520518137L)
               && !w.a<"B">(w.a<"Û">(C0139.f4247, var1, 166568231611948727L), 364240166945318996L)
            ? (f1744 | 860110) + ~(f1744 & 860110) + 1 ^ -1379972123
            : w.a<"B">(var1, 168455243775731585L));
      }
   }

   public boolean m2757(class_2338 var1) {
      if (var1 == null) {
         return (boolean)((f1744 | 642415) + ~(f1744 & 642415) + 1 ^ -1380214460);
      } else {
         return (boolean)(!var1.equals(w.a<"Û">(speedmine, 305504058178342304L)) && !var1.equals(w.a<"Û">(speedmine, 201995150761921689L))
            ? (f1744 | 356478) + ~(f1744 & 356478) + 1 ^ -1380506539
            : (f1744 | 606021) + ~(f1744 & 606021) + 1 ^ -1380226193);
      }
   }

   public boolean m2758(class_1297 var1) {
      return w.a<"Û">(
         m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687,
         w.a<"Û">(w.a<"Û">(var1, 225708705569795011L), 0.0, w.a<"B">(-4631501856787818086L, 317139102743630955L), 0.0, 244681124810902308L),
         116811053208981688L
      );
   }

   @Override
   public boolean m0689() {
      return (boolean)((f1744 | 201795) + ~(f1744 & 201795) + 1 ^ -1380892568);
   }
}
