package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class C0012 extends C1266 {
   public final C0015<C0013> f2863;
   public final C0015<Float> f2864;
   public final C0015<Float> f2865;
   public final C0015<Integer> f2866;
   public final C0015<Boolean> f2867;
   public final C0015<Boolean> f2868;
   public final C0015<Float> f2869;
   public final C0015<Boolean> f2870;
   public final C0015<Color> f2871;
   public final C0015<Color> f2872;
   public final C0015<Boolean> f2873;
   public final C0015<Color> f2874;
   public final C0015<Color> f2875;
   public final C0015<Boolean> f2876;
   public final C0015<Color> f2877;
   public final C0015<Color> f2878;
   public static int f2879 = w.a<"B">(6350426118581099626L, 257832362129977838L);

   public C0012() {
      super("HoleESP", "Highlights the spots that are safe from end crystals.", C1045.f3174);
      w.a<"B">(this, 242859112966675773L);
   }

   @Override
   public String getInfo() {
      return w.a<"B">(w.a<"Û">(w.a<"Û">(C0933.f1419, 341317371462913554L), 260708190417501501L), 140572902764040146L);
   }

   @C1027
   public void m3212(C1358 var1) {
      double var2 = w.a<"B">(
         (double)w.a<"Û">(var1, 332657398031159950L),
         m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_6036,
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 358934561846661819L),
         308057504384614299L
      );
      class_243 var4 = w.a<"Û">(
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
         133466035608991790L
      );
      class_238 var5 = new class_238(w.a<"B">(155039566109854826L));
      Iterator var6 = w.a<"Û">(w.a<"Û">(C0933.f1419, 341317371462913554L), 341496865259068134L);

      while (w.a<"Û">(var6, 333900474771661065L)) {
         C0572 var7 = (C0572)w.a<"Û">(var6, 192468336863492695L);
         if (w.a<"B">(w.a<"Û">(var7, 375159741303828290L), 132682894836608805L)
            && (w.a<"Û">((Boolean)w.a<"Û">(this.f2876, 174312564406604366L), 354697271520518137L) || !w.a<"Û">(var7, 312078955087835113L))
            && w.a<"Û">(
               w.a<"Û">(var7, 291940820831714374L),
               var4,
               (double)w.a<"Û">((Integer)w.a<"Û">(this.f2866, 174312564406604366L), 260981171345819427L),
               279625802339170394L
            )
            && (
               !w.a<"Û">(
                     w.a<"Û">(
                        m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 261249985676109960L
                     ),
                     w.a<"Û">(var7, 375159741303828290L),
                     133676266014519719L
                  )
                  || !w.a<"Û">((Boolean)w.a<"Û">(this.f2867, 174312564406604366L), 354697271520518137L)
                  || w.a<"Û">((Boolean)w.a<"Û">(this.f2868, 174312564406604366L), 354697271520518137L)
            )) {
            Color var8 = (Color)w.a<"Û">(this.f2871, 174312564406604366L);
            Color var9 = (Color)w.a<"Û">(this.f2872, 174312564406604366L);
            if (w.a<"Û">(var7, 312078955087835113L)) {
               var8 = (Color)w.a<"Û">(this.f2877, 174312564406604366L);
               var9 = (Color)w.a<"Û">(this.f2878, 174312564406604366L);
            } else if (w.a<"Û">(var7, 265311111079877806L) == C0573.f2336) {
               var8 = (Color)w.a<"Û">(this.f2874, 174312564406604366L);
               var9 = (Color)w.a<"Û">(this.f2875, 174312564406604366L);
            }

            double var10 = w.a<"Û">(var4, w.a<"Û">(w.a<"Û">(var7, 291940820831714374L), 229561253177300454L), 180844654503832142L);
            int var12 = w.a<"Û">(w.a<"Û">(var7, 375159741303828290L), var5, 133676266014519719L)
                  && w.a<"Û">((Boolean)w.a<"Û">(this.f2867, 174312564406604366L), 354697271520518137L)
               ? (f2879 | 988980) + ~(f2879 & 988980) + 1 ^ -406916990
               : (f2879 | 196679) + ~(f2879 & 196679) + 1 ^ -407705616;
            if (w.a<"Û">((Boolean)w.a<"Û">(this.f2868, 174312564406604366L), 354697271520518137L)
               && (var10 >= (double)w.a<"Û">((Float)w.a<"Û">(this.f2869, 174312564406604366L), 149784643039979208L) || var12 != 0)) {
               float var13 = w.a<"B">((f2879 | 858901) + ~(f2879 & 858901) + 1 ^ -667091806, 349057757755238323L)
                  - (float)w.a<"B">(
                     (var10 - (double)w.a<"Û">((Float)w.a<"Û">(this.f2869, 174312564406604366L), 149784643039979208L))
                        / (double)(
                           (float)w.a<"Û">((Integer)w.a<"Û">(this.f2866, 174312564406604366L), 260981171345819427L)
                              - w.a<"Û">((Float)w.a<"Û">(this.f2869, 174312564406604366L), 149784643039979208L)
                        ),
                     0.0,
                     w.a<"B">(((long)f2879 | 700193L) + ~((long)f2879 & 700193L) + 1L ^ -4607182419207173994L, 317139102743630955L),
                     318037245528159060L
                  );
               if (var12 != 0) {
                  var13 = (float)(var2 - w.a<"B">(var2, 143282796194555966L));
               }

               var8 = C0152.m3473(var8, (int)(var13 * (float)w.a<"Û">(var8, 245270953955453918L)));
               var9 = C0152.m3473(var9, (int)(var13 * (float)w.a<"Û">(var9, 245270953955453918L)));
            }

            switch (w.a<"Û">((C0013)w.a<"Û">(this.f2863, 174312564406604366L), 145772840582553226L)) {
               case 1:
                  w.a<"B">(
                     w.a<"Û">(var1, 173269294235887931L),
                     w.a<"Û">(
                        w.a<"Û">(var7, 375159741303828290L),
                        (double)(
                           (float)w.a<"Û">(w.a<"Û">(var7, 291940820831714374L), 171752333823210875L)
                              + w.a<"Û">((Float)w.a<"Û">(this.f2865, 174312564406604366L), 149784643039979208L)
                        ),
                        182030847371476974L
                     ),
                     var8,
                     246072095578695914L
                  );
                  break;
               case 2:
                  C0485.m3217(
                     w.a<"Û">(var1, 173269294235887931L),
                     w.a<"Û">(
                        w.a<"Û">(var7, 375159741303828290L),
                        (double)(w.a<"Û">(w.a<"Û">(var7, 291940820831714374L), 171752333823210875L) + ((f2879 | 905069) + ~(f2879 & 905069) + 1 ^ -407099173)),
                        182030847371476974L
                     ),
                     var8
                  );
            }

            C0485.m3219(
               w.a<"Û">(var1, 173269294235887931L),
               w.a<"Û">(
                  w.a<"Û">(var7, 375159741303828290L),
                  (double)(
                     (float)w.a<"Û">(w.a<"Û">(var7, 291940820831714374L), 171752333823210875L)
                        + w.a<"Û">((Float)w.a<"Û">(this.f2865, 174312564406604366L), 149784643039979208L)
                  ),
                  182030847371476974L
               ),
               var9,
               w.a<"Û">((Float)w.a<"Û">(this.f2864, 174312564406604366L), 149784643039979208L)
            );
         }
      }
   }

   public static String A5Lol6aTMmEXjMgKIJddlbSI5LTCGco0ZJM9AnQh6uTQYd94rbnN5MYYbgck9blg0goi0IDi7XPtglOqBrpvUuwATlgAICmiFvZi(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
