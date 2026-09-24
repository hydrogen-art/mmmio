package me.mioclient;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public class C0082 implements C0045 {
   public static int f3453 = w.a<"B">(1238522884478040026L, 257832362129977838L);

   public static double m1399(double var0, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = w.a<"B">(var0, 379132629283419874L);
         var3 = w.a<"Û">(var3, var2, RoundingMode.FLOOR, 311894684468768572L);
         return w.a<"Û">(var3, 247513116637928524L);
      }
   }

   public static float m1400(float var0, int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var2 = w.a<"B">((double)var0, 379132629283419874L);
         var2 = w.a<"Û">(var2, var1, RoundingMode.FLOOR, 311894684468768572L);
         return w.a<"Û">(var2, 355622785977450279L);
      }
   }

   public static float m1401(float var0, float var1) {
      return var0 + w.a<"Û">(new Random(), 128635073665338922L) * (var1 - var0);
   }

   public static int m1402(int var0, int var1) {
      return var0 + w.a<"Û">(new Random(), 376011729578292335L) * (var1 - var0);
   }

   public static double m1403(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float m1404(float var0) {
      return var0 * C1074.f4552;
   }

   public static float m1405(float var0) {
      return var0 * C1074.f4553;
   }

   public static class_243 m1406(float var0, float var1) {
      float var2 = w.a<"B">(var0, 136504982068271121L);
      float var3 = w.a<"B">(-var1, 136504982068271121L);
      float var4 = w.a<"B">(var3, 229164846296942151L);
      float var5 = w.a<"B">(var3, 155264254601911076L);
      float var6 = w.a<"B">(var2, 229164846296942151L);
      float var7 = w.a<"B">(var2, 155264254601911076L);
      return new class_243((double)(var5 * var6), (double)(-var7), (double)(var4 * var6));
   }

   public static double m1407(class_243 var0, double var1) {
      return w.a<"B">(
         w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
            133466035608991790L
         ),
         var0,
         var1,
         241370723479498950L
      );
   }

   public static double m1408(class_243 var0, class_243 var1, double var2) {
      double var4 = w.a<"Û">(var0, var1, 180844654503832142L);
      double var6 = (double)w.a<"Û">(
            (Integer)w.a<"Û">(
               w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1690, 266195410219308853L),
               142580699129741492L
            ),
            260981171345819427L
         )
         / w.a<"B">(((long)f3453 | 952143L) + ~((long)f3453 & 952143L) + 1L ^ 4637440979761783653L, 317139102743630955L);
      if (var6 < w.a<"B">(((long)f3453 | 64883L) + ~((long)f3453 & 64883L) + 1L ^ 4607182419764975961L, 317139102743630955L)) {
         var6 = w.a<"B">(((long)f3453 | 79174L) + ~((long)f3453 & 79174L) + 1L ^ 4607182419765088620L, 317139102743630955L);
      }

      return var4 <= w.a<"B">(((long)f3453 | 418627L) + ~((long)f3453 & 418627L) + 1L ^ 4621819118553827177L, 317139102743630955L) / var2
         ? w.a<"B">(w.a<"B">(((long)f3453 | 917838L) + ~((long)f3453 & 917838L) + 1L ^ 4607182419765421412L, 317139102743630955L), var2, 199488685501753436L)
            * var6
         : var4 * var2 * w.a<"B">(((long)f3453 | 880797L) + ~((long)f3453 & 880797L) + 1L ^ 4591870180175383853L, 317139102743630955L) * var6;
   }

   public static float m1409(class_1657 var0) {
      float[] var1 = w.a<"B">(w.a<"Û">(var0, 359920018220808632L), 213766782372904553L);
      return w.a<"B">(
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 152871992642526281L),
         var1[(f3453 | 789258) + ~(f3453 & 789258) + 1 ^ 965275424],
         123679565561004181L
      );
   }

   public static double m1410(double var0, double var2, double var4) {
      double var6 = var0 - var2;
      double var8 = var4 - var0;
      return var8 > var6 ? var2 : var4;
   }

   public static boolean m1411(int var0) {
      if (var0 == 0) {
         return (boolean)((f3453 | 736352) + ~(f3453 & 736352) + 1 ^ 965728330);
      } else {
         return (boolean)(w.a<"Û">(new Random(), (f3453 | 596982) + ~(f3453 & 596982) + 1 ^ 965607352, 246303119967947802L) <= var0
            ? (f3453 | 583480) + ~(f3453 & 583480) + 1 ^ 965477139
            : (f3453 | 150028) + ~(f3453 & 150028) + 1 ^ 965127718);
      }
   }

   public static float m1412(float var0) {
      return (var0 < 0.0F ? var0 + w.a<"B">((f3453 | 326554) + ~(f3453 & 326554) + 1 ^ 2050236336, 349057757755238323L) : var0)
         % w.a<"B">((f3453 | 216959) + ~(f3453 & 216959) + 1 ^ 2050206549, 349057757755238323L);
   }

   public static float m1413(float var0, float var1) {
      return w.a<"B">(C0094.m1872(), var0, var1, 286181508181077551L);
   }

   public static double m1414(double var0, double var2) {
      return w.a<"B">((double)C0094.m1872(), var0, var2, 308057504384614299L);
   }

   public static double m1415(class_2338 var0) {
      return w.a<"B">(w.a<"Û">(var0, 229561253177300454L), 160706828367220643L);
   }

   public static double m1416(class_243 var0) {
      return w.a<"Û">(
         w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
            133466035608991790L
         ),
         var0,
         180844654503832142L
      );
   }
}
