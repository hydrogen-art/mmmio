package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1694;
import net.minecraft.class_1923;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2627;
import net.minecraft.class_2818;
import net.minecraft.class_3719;
import net.minecraft.class_5250;

public class C0022 extends C1266 {
   public final C0015<Boolean> f2544;
   public final C0015<Integer> f2545;
   public final C0015<Boolean> f2546;
   public final C0015<Boolean> f2547;
   public final C0015<Boolean> f2548;
   public final C0015<Boolean> f2549;
   public final C0015<Boolean> f2550;
   public final C0015<Boolean> f2551;
   public final C0015<C1348> f2552;
   public final C0015<Float> f2553;
   public final C0015<Boolean> f2554;
   public final C0015<Boolean> f2555;
   public final C0015<Boolean> f2556;
   public final C0015<Boolean> f2557;
   public final C0015<Boolean> f2558;
   public final C0015<Boolean> f2559;
   public final C0083 f2560;
   public static int f2561 = w.a<"B">(948609173850284903L, 257832362129977838L);

   public C0022() {
      super("StashFinder", "Logs and/or notifies you about possible stashes.", C1045.f3173);
      w.a<"B">(this, 242859112966675773L);
      this.f2560 = new C0083();
      w.a<"Û">(this, (boolean)((f2561 | 128198) + ~(f2561 & 128198) + 1 ^ -1437946765), 135570431627433065L);
   }

   @C1027
   public void m0990(C0785 var1) {
      String var2 = w.a<"Û">(new SimpleDateFormat("MM/dd HH:mm a"), new Date(), 387358855454593605L);
      class_2818 var3 = w.a<"Û">(var1, 387642137083103624L);
      class_1923 var4 = w.a<"Û">(var3, 245954181696410062L);
      int var5 = (f2561 | 582504) + ~(f2561 & 582504) + 1 ^ -1438401571;
      Iterator var6 = w.a<"Û">(w.a<"Û">(w.a<"Û">(var3, 289417256228043774L), 269526036007691028L), 277715502174036685L);

      while (w.a<"Û">(var6, 333900474771661065L)) {
         class_2586 var7 = (class_2586)w.a<"Û">(var6, 192468336863492695L);
         if (!w.a<"Û">((Boolean)w.a<"Û">(this.f2554, 174312564406604366L), 354697271520518137L)
            || !w.a<"B">(
               w.a<"Û">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687,
                  w.a<"Û">(var7, 269630716540245963L),
                  344154755948902447L
               ),
               w.a<"Û">(var7, 269630716540245963L),
               w.a<"Û">((Boolean)w.a<"Û">(this.f2556, 174312564406604366L), 354697271520518137L),
               w.a<"Û">((Boolean)w.a<"Û">(this.f2557, 174312564406604366L), 354697271520518137L),
               w.a<"Û">((Boolean)w.a<"Û">(this.f2558, 174312564406604366L), 354697271520518137L),
               w.a<"Û">((Boolean)w.a<"Û">(this.f2555, 174312564406604366L), 354697271520518137L),
               w.a<"Û">((Boolean)w.a<"Û">(this.f2559, 174312564406604366L), 354697271520518137L),
               186960504981352750L
            )) {
            if (var7 instanceof class_2595 || var7 instanceof class_3719 && !w.a<"Û">(C0933.f1436, w.a<"Û">(var7, 269630716540245963L), 258698271008592849L)) {
               var5++;
            }

            if (w.a<"Û">((Boolean)w.a<"Û">(this.f2544, 174312564406604366L), 354697271520518137L)
               && var5 >= w.a<"Û">((Integer)w.a<"Û">(this.f2545, 174312564406604366L), 260981171345819427L)) {
               String var15 = new C1002().m2578(var5).m2593("\u0001 chests");
               C1097 var18 = w.a<"Û">(
                  this,
                  new C1002().m2591(var2).m2591(var15).m2593("\u0001 (\u0001)"),
                  w.a<"Û">(var4, 385764854994384473L),
                  w.a<"Û">(var4, 364025584559716488L),
                  155544539547341461L
               );
               if (w.a<"Û">(this, var18, var15, 349890741516270213L)) {
                  break;
               }
            } else if (var7 instanceof class_2627) {
               class_2627 var9 = (class_2627)var7;
               if (w.a<"Û">((Boolean)w.a<"Û">(this.f2546, 174312564406604366L), 354697271520518137L)
                  && !w.a<"Û">(C0933.f1436, w.a<"Û">(var9, 365174812300326210L), 258698271008592849L)) {
                  String var8 = "a shulkerbox";
                  C1097 var10 = w.a<"Û">(
                     this,
                     new C1002().m2591(var2).m2591(var8).m2593("\u0001 (\u0001)"),
                     w.a<"Û">(var4, 385764854994384473L),
                     w.a<"Û">(var4, 364025584559716488L),
                     155544539547341461L
                  );
                  if (w.a<"Û">(this, var10, var8, 349890741516270213L)) {
                     break;
                  }
               }
            }
         }
      }

      if (w.a<"Û">((Boolean)w.a<"Û">(this.f2547, 174312564406604366L), 354697271520518137L)) {
         ArrayList var13 = new ArrayList();
         Iterator var14 = w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, 156655948167432853L),
            191661729848227466L
         );

         while (w.a<"Û">(var14, 333900474771661065L)) {
            class_1297 var16 = (class_1297)w.a<"Û">(var14, 192468336863492695L);
            if (var16 instanceof class_1694 var17 && w.a<"Û">(var17, 384979221714230770L).equals(w.a<"Û">(var17, 384979221714230770L))) {
               Iterator var19 = w.a<"Û">(var13, 341496865259068134L);

               while (w.a<"Û">(var19, 333900474771661065L)) {
                  class_1694 var11 = (class_1694)w.a<"Û">(var19, 192468336863492695L);
                  if (w.a<"Û">(w.a<"Û">(var17, 378991382189744787L), w.a<"Û">(var11, 378991382189744787L), 133676266014519719L)) {
                     C1097 var12 = w.a<"Û">(
                        this,
                        new C1002().m2591(var2).m2593("Stacked minecarts (\u0001)"),
                        w.a<"Û">(var4, 385764854994384473L),
                        w.a<"Û">(var4, 364025584559716488L),
                        155544539547341461L
                     );
                     w.a<"Û">(this, var12, "Stacked minecarts", 349890741516270213L);
                     return;
                  }
               }

               w.a<"Û">(var13, var17, 276802003864609490L);
            }
         }
      }
   }

   public C1097 m0991(String var1, int var2, int var3) {
      String var4 = w.a<"Û">(w.a<"B">(375727057840316412L), 359350625232260409L);
      String var5 = w.a<"Û">(
               m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_3944, 131347417028836246L
            )
            == null
         ? "singleplayer"
         : w.a<"Û">(
               m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_3944, 131347417028836246L
            )
            .field_3761;
      return new C1097(var1, var2, var3, var4, var5);
   }

   public boolean m0992(C1097 var1, String var2) {
      if (w.a<"Û">(
            w.a<"Û">(
               C0933.f1432,
               (Predicate<C1097>)var1x -> (boolean)(w.a<"Û">(var1x, 169934215395400277L) == w.a<"Û">(var1, 169934215395400277L)
                        && w.a<"Û">(var1x, 112109402966723863L) == w.a<"Û">(var1, 112109402966723863L)
                     ? (f2561 | 381710) + ~(f2561 & 381710) + 1 ^ -1437692998
                     : (f2561 | 804821) + ~(f2561 & 804821) + 1 ^ -1438179488),
               120632717548688135L
            ),
            334854191428563747L
         )
         && w.a<"Û">(C0933.f1432, var1, 133315123936993858L)) {
         if (w.a<"Û">((Boolean)w.a<"Û">(this.f2548, 174312564406604366L), 354697271520518137L)) {
            class_5250 var3 = w.a<"Û">(
               w.a<"B">(w.a<"Û">(this, 248211090350577353L), 228465064790135899L), new C1002().m2591(var2).m2593(" has found \u0001 at: "), 194629304146735395L
            );
            if (!w.a<"Û">((Boolean)w.a<"Û">(this.f2549, 174312564406604366L), 354697271520518137L)) {
               w.a<"Û">(var3, w.a<"Û">(var1, 337467143560015873L), 194629304146735395L);
            }

            w.a<"B">(var3, w.a<"B">((f2561 | 259794) + ~(f2561 & 259794) + 1 ^ 1438082194, 289296048454852994L), C0639.f3882, 211469761772001922L);
         }

         if (w.a<"Û">((Boolean)w.a<"Û">(this.f2551, 174312564406604366L), 354697271520518137L)
            && w.a<"Û">(
               this.f2560,
               w.a<"B">(((long)f2561 | 962546L) + ~((long)f2561 & 962546L) + 1L ^ -4617315519399856313L, 317139102743630955L),
               TimeUnit.SECONDS,
               215737872562411156L
            )) {
            w.a<"Û">(
               C0933.f1420,
               (C1348)w.a<"Û">(this.f2552, 174312564406604366L),
               w.a<"Û">((Float)w.a<"Û">(this.f2553, 174312564406604366L), 149784643039979208L),
               359079024815758851L
            );
            w.a<"Û">(this.f2560, 387780412884547639L);
         }

         return (boolean)((f2561 | 455848) + ~(f2561 & 455848) + 1 ^ -1437750244);
      } else {
         return (boolean)((f2561 | 369381) + ~(f2561 & 369381) + 1 ^ -1437664688);
      }
   }

   public static String VtoKqlvAKGI1rzaLdfVAZ9dIyCeeFzjvLHf14T43YuypjRT5RDYiZPjhxFNtKXXqUKOUdwCO4enj2PACQ5dILB5z4lvD3IHrDgdK(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
