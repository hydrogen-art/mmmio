package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1738;
import net.minecraft.class_1740;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_332;
import net.minecraft.class_6880;

public class C0058 extends C0601 {
   public final C0015<C0059> f2482;
   public final C0015<Boolean> f2483;
   public final C0015<Boolean> f2484;
   public final C0015<Boolean> f2485;
   public final C0015<Boolean> f2486;
   public final C0015<Boolean> f2487;
   public final C0015<Boolean> f2488;
   public final C0015<Boolean> f2489;
   public final C0015<Integer> f2490;
   public final C0015<Boolean> f2491;
   public final C0015<Boolean> f2492;
   public final C0015<Boolean> f2493;
   public final List<class_1657> f2494;
   public static int f2495 = w.a<"B">(3918250955331281161L, 257832362129977838L);

   public C0058() {
      String[] var10002 = new String[(f2495 | 893775) + ~(f2495 & 893775) + 1 ^ 1254520773];
      var10002[(f2495 | 234585) + ~(f2495 & 234585) + 1 ^ 1254637778] = "playerlist";
      super("TextRadar", var10002);
      this.f2482 = w.a<"Û">(this, new C0495<>("Sort", C0059.f3915), 192839886211813275L);
      this.f2483 = w.a<"Û">(
         this, new C0240("Health", w.a<"B">((boolean)((f2495 | 351350) + ~(f2495 & 351350) + 1 ^ 1255049468), 320330632857389983L)), 192839886211813275L
      );
      this.f2484 = w.a<"Û">(
         this, new C0240("Distance", w.a<"B">((boolean)((f2495 | 82697) + ~(f2495 & 82697) + 1 ^ 1254791042), 320330632857389983L)), 192839886211813275L
      );
      this.f2485 = w.a<"Û">(
         this, new C0240("TotemPops", w.a<"B">((boolean)((f2495 | 412147) + ~(f2495 & 412147) + 1 ^ 1254989176), 320330632857389983L)), 192839886211813275L
      );
      this.f2486 = w.a<"Û">(
         this, new C0240("FriendColor", w.a<"B">((boolean)((f2495 | 923655) + ~(f2495 & 923655) + 1 ^ 1254476941), 320330632857389983L)), 192839886211813275L
      );
      this.f2487 = w.a<"Û">(
         this, new C0240("EnemyColor", w.a<"B">((boolean)((f2495 | 442516) + ~(f2495 & 442516) + 1 ^ 1254954014), 320330632857389983L)), 192839886211813275L
      );
      this.f2488 = w.a<"Û">(
         this, new C0240("Armor", w.a<"B">((boolean)((f2495 | 693782) + ~(f2495 & 693782) + 1 ^ 1254179485), 320330632857389983L)), 192839886211813275L
      );
      this.f2489 = w.a<"Û">(
         this,
         w.a<"Û">(new C0240("Limit", w.a<"B">((boolean)((f2495 | 713609) + ~(f2495 & 713609) + 1 ^ 1254176514), 320330632857389983L)), 265590331628451000L),
         192839886211813275L
      );
      C0290 var1 = new C0290<>(
         "Max",
         w.a<"B">((f2495 | 281098) + ~(f2495 & 281098) + 1 ^ 1255120521, 367942141483020029L),
         w.a<"B">((f2495 | 651196) + ~(f2495 & 651196) + 1 ^ 1254243126, 367942141483020029L),
         w.a<"B">((f2495 | 448121) + ~(f2495 & 448121) + 1 ^ 1254949586, 367942141483020029L)
      );
      C0015[] var10003 = new C0015[(f2495 | 870759) + ~(f2495 & 870759) + 1 ^ 1254530541];
      var10003[(f2495 | 857014) + ~(f2495 & 857014) + 1 ^ 1254541117] = this.f2489;
      this.f2490 = w.a<"Û">(this, w.a<"Û">(var1, var10003, 218731375162136680L), 192839886211813275L);
      this.f2491 = w.a<"Û">(
         this,
         w.a<"Û">(new C0240("Ignore", w.a<"B">((boolean)((f2495 | 710168) + ~(f2495 & 710168) + 1 ^ 1254163091), 320330632857389983L)), 168899080216898642L),
         192839886211813275L
      );
      C0240 var2 = new C0240("Friends", w.a<"B">((boolean)((f2495 | 373147) + ~(f2495 & 373147) + 1 ^ 1255040272), 320330632857389983L));
      var10003 = new C0015[(f2495 | 362893) + ~(f2495 & 362893) + 1 ^ 1255038215];
      var10003[(f2495 | 329083) + ~(f2495 & 329083) + 1 ^ 1255068144] = this.f2491;
      this.f2492 = w.a<"Û">(this, w.a<"Û">(var2, var10003, 218731375162136680L), 192839886211813275L);
      C0240 var3 = new C0240("Nakeds", w.a<"B">((boolean)((f2495 | 875953) + ~(f2495 & 875953) + 1 ^ 1254525242), 320330632857389983L));
      var10003 = new C0015[(f2495 | 334824) + ~(f2495 & 334824) + 1 ^ 1255067490];
      var10003[(f2495 | 424483) + ~(f2495 & 424483) + 1 ^ 1254993576] = this.f2491;
      this.f2493 = w.a<"Û">(this, w.a<"Û">(var3, var10003, 218731375162136680L), 192839886211813275L);
      this.f2494 = new ArrayList<>();
      this.m$$H4ZB5VRjXea6ADgAn7oqhkF1jdY2RLRFdAhjRxioAK3g7dPU84hlRjGs8rjdVIiyq3olBiqej55jhKcEKsFLMteWctvBZwGDg(new C0024(this));
   }

   @Override
   public void onEnable() {
      w.a<"Û">(this.f2494, 140901994866995976L);
   }

   @C1027
   public void m0968(C0612 var1) {
      synchronized (this.f2494) {
         w.a<"Û">(this.f2494, 140901994866995976L);
         Stream var10000 = w.a<"Û">(
            w.a<"Û">(
               w.a<"Û">(
                  w.a<"Û">(
                     w.a<"Û">(
                        m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, 188438576288929642L
                     ),
                     110814793610710346L
                  ),
                  this::m0972,
                  287370376266094532L
               ),
               w.a<"B">(this::m0971, 224107444354928270L),
               267272267864878514L
            ),
            w.a<"Û">((Boolean)w.a<"Û">(this.f2489, 174312564406604366L), 354697271520518137L)
               ? (long)w.a<"Û">((Integer)w.a<"Û">(this.f2490, 174312564406604366L), 260981171345819427L)
               : ((long)f2495 | 735805L) + ~((long)f2495 & 735805L) + 1L ^ 9223372035600617801L,
            381466885755282524L
         );
         List var10001 = this.f2494;
         w.a<"B">(this.f2494, 131918113315390561L);
         w.a<"Û">(var10000, var10001::add, 197435602795669445L);
      }
   }

   @Override
   public void m0562(class_332 var1) {
      float var2 = this.m$$PpPu8DGysERuMBG0leKIFNRaKTaNSzoCfcKirIjr69JLku3Wnfarn023SAFK1QxxHfuMxDcep9htxtos8M0qbRsNrTpFakkn7.m2958((float)C0498.f4738.m3897())
         - this.m$$PpPu8DGysERuMBG0leKIFNRaKTaNSzoCfcKirIjr69JLku3Wnfarn023SAFK1QxxHfuMxDcep9htxtos8M0qbRsNrTpFakkn7.m2947();

      for (Iterator var3 = w.a<"Û">(this.f2494, 341496865259068134L);
         w.a<"Û">(var3, 333900474771661065L);
         var2 += (float)(
            (C0498.f4738.m3897() + ((f2495 | 250203) + ~(f2495 & 250203) + 1 ^ 1254622673))
               * this.m$$PpPu8DGysERuMBG0leKIFNRaKTaNSzoCfcKirIjr69JLku3Wnfarn023SAFK1QxxHfuMxDcep9htxtos8M0qbRsNrTpFakkn7.m2960()
         )
      ) {
         class_1657 var4 = (class_1657)w.a<"Û">(var3, 192468336863492695L);
         Color var5 = this.m$$iZnnVBJ17A5YJbakVntJjvhjlzvzt8abld4g7DVpkphruizpxyO31ajNTWEZ2smIjpUa4yekh7iZ7sJESIVA0nApb5M9c0lYC(var2);
         if (w.a<"Û">(C0933.f1417, var4, 241036547861815495L) && w.a<"Û">((Boolean)w.a<"Û">(this.f2486, 174312564406604366L), 354697271520518137L)) {
            var5 = w.a<"Û">(C0933.f1417, w.a<"Û">(w.a<"Û">(var4, 138826997201410603L), 211085733983653208L), var5, 342655978625678444L);
         } else if (w.a<"Û">(C0933.f1417, var4, 331571300069254198L) && w.a<"Û">((Boolean)w.a<"Û">(this.f2487, 174312564406604366L), 354697271520518137L)) {
            var5 = w.a<"Û">(C0933.f1417, w.a<"Û">(w.a<"Û">(var4, 138826997201410603L), 211085733983653208L), var5, 342655978625678444L);
         }

         String var6 = w.a<"Û">(this, var4, 277168932975847942L);
         float var7 = C0498.f4738.m3896(var6);
         C0498.f4738
            .m3889(
               var1,
               var6,
               this.m$$PpPu8DGysERuMBG0leKIFNRaKTaNSzoCfcKirIjr69JLku3Wnfarn023SAFK1QxxHfuMxDcep9htxtos8M0qbRsNrTpFakkn7.m2957(var7)
                  - this.m$$PpPu8DGysERuMBG0leKIFNRaKTaNSzoCfcKirIjr69JLku3Wnfarn023SAFK1QxxHfuMxDcep9htxtos8M0qbRsNrTpFakkn7.m2944(),
               var2,
               var5
            );
      }
   }

   @Override
   public float[] m0563() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      Iterator var3 = w.a<"Û">(this.f2494, 341496865259068134L);

      while (w.a<"Û">(var3, 333900474771661065L)) {
         class_1657 var4 = (class_1657)w.a<"Û">(var3, 192468336863492695L);
         float var5 = C0498.f4738.m3896(w.a<"Û">(this, var4, 277168932975847942L));
         var1 += (float)(C0498.f4738.m3897() + ((f2495 | 607422) + ~(f2495 & 607422) + 1 ^ 1254264884));
         if (var5 > var2) {
            var2 = var5;
         }
      }

      float[] var10000 = new float[(f2495 | 990684) + ~(f2495 & 990684) + 1 ^ 1254410581];
      var10000[(f2495 | 170795) + ~(f2495 & 170795) + 1 ^ 1254707104] = var2;
      var10000[(f2495 | 273090) + ~(f2495 & 273090) + 1 ^ 1255145032] = var1;
      return var10000;
   }

   public String m0969(class_1657 var1) {
      StringBuilder var2 = new StringBuilder();
      float var3 = w.a<"B">(var1, 181476777857313967L);
      if (w.a<"Û">((Boolean)w.a<"Û">(this.f2483, 174312564406604366L), 354697271520518137L)) {
         w.a<"Û">(
            w.a<"Û">(
               w.a<"Û">(var2, w.a<"Û">(this, (double)var3, 196161286996442796L), 271039767216664537L), w.a<"B">(var3, 292355722995856317L), 247028270812929167L
            ),
            " ",
            150545021362368941L
         );
      }

      w.a<"Û">(var2, class_124.field_1070, 271039767216664537L);
      w.a<"Û">(var2, w.a<"Û">(C0933.f1440, w.a<"Û">(w.a<"Û">(var1, 138826997201410603L), 211085733983653208L), 198989071350764069L), 150545021362368941L);
      if (w.a<"Û">((Boolean)w.a<"Û">(this.f2485, 174312564406604366L), 354697271520518137L)) {
         int var4 = w.a<"Û">(C0933.f1427, var1, 193163454500097853L);
         if (var4 > 0) {
            w.a<"Û">(w.a<"Û">(w.a<"Û">(var2, w.a<"B">(var4, 296869183011809414L), 271039767216664537L), " -", 150545021362368941L), var4, 247028270812929167L);
         }
      }

      if (w.a<"Û">((Boolean)w.a<"Û">(this.f2484, 174312564406604366L), 354697271520518137L)) {
         w.a<"Û">(
            w.a<"Û">(
               w.a<"Û">(w.a<"Û">(var2, class_124.field_1068, 271039767216664537L), " ", 150545021362368941L),
               w.a<"B">(
                  w.a<"Û">(
                     m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, var1, 274649721728910700L
                  ),
                  292355722995856317L
               ),
               247028270812929167L
            ),
            "m",
            150545021362368941L
         );
      }

      if (w.a<"Û">((Boolean)w.a<"Û">(this.f2488, 174312564406604366L), 354697271520518137L)) {
         String var9 = "G";
         Iterator var5 = w.a<"Û">(w.a<"Û">(var1, 139770540016991271L), 191661729848227466L);

         while (w.a<"Û">(var5, 333900474771661065L)) {
            class_1799 var6 = (class_1799)w.a<"Û">(var5, 192468336863492695L);
            class_1792 var8 = w.a<"Û">(var6, 222207108884875224L);
            if (var8 instanceof class_1738) {
               class_1738 var7 = (class_1738)var8;
               class_6880 var10 = w.a<"Û">(var7, 228117485496806767L);
               if (var10 != class_1740.field_7889 && var10 != class_1740.field_21977 || !w.a<"Û">(var6, 313442640298098225L)) {
                  var9 = "";
               }
            } else {
               if (w.a<"Û">(var6, 222207108884875224L) == class_1802.field_8833) {
                  var9 = "W";
                  break;
               }

               var9 = "";
            }
         }

         if (!w.a<"Û">(var9, 226515538076917205L)) {
            w.a<"Û">(var2, class_124.field_1068, 271039767216664537L);
            w.a<"Û">(var2, " [", 150545021362368941L);
            w.a<"Û">(var2, var9, 150545021362368941L);
            w.a<"Û">(var2, "]", 150545021362368941L);
         }
      }

      return w.a<"Û">(var2, 167209770867625114L);
   }

   public class_124 m0970(double var1) {
      if (var1 >= w.a<"B">(((long)f2495 | 300999L) + ~((long)f2495 & 300999L) + 1L ^ 4626322718471439180L, 317139102743630955L)) {
         return class_124.field_1060;
      } else if (var1 >= w.a<"B">(((long)f2495 | 56697L) + ~((long)f2495 & 56697L) + 1L ^ 4625196818564319730L, 317139102743630955L)) {
         return class_124.field_1077;
      } else if (var1 >= w.a<"B">(((long)f2495 | 680484L) + ~((long)f2495 & 680484L) + 1L ^ 4621819118843180719L, 317139102743630955L)) {
         return class_124.field_1065;
      } else {
         return var1 >= w.a<"B">(((long)f2495 | 68667L) + ~((long)f2495 & 68667L) + 1L ^ 4616189619309566128L, 317139102743630955L)
            ? class_124.field_1061
            : class_124.field_1079;
      }
   }

   public double m0971(class_1297 var1) {
      return w.a<"Û">(this.f2482, 174312564406604366L) == C0059.f3915
         ? w.a<"Û">(var1, m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 363910000626804101L)
         : (double)w.a<"B">(
            w.a<"Û">(
               w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
               370804508038485452L
            ),
            w.a<"B">(var1, 227058158510945889L)[(f2495 | 342058) + ~(f2495 & 342058) + 1 ^ 1255074977],
            123679565561004181L
         );
   }

   public boolean m0972(class_1657 var1) {
      if (!this.m$$gRj7aiBtDUdrULFMRSSNGe3GE4NJYmPLULaW8RoQqkczJRkPf1MnKCjIJUd2eMxM2dCKHKu8Kn8y32QvHMngHVwK1aYsDDolf()
         && m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724 == var1) {
         return (boolean)((f2495 | 181499) + ~(f2495 & 181499) + 1 ^ 1254690928);
      } else if (w.a<"Û">((Boolean)w.a<"Û">(this.f2492, 174312564406604366L), 354697271520518137L) && w.a<"Û">(C0933.f1417, var1, 241036547861815495L)) {
         return (boolean)((f2495 | 317859) + ~(f2495 & 317859) + 1 ^ 1255083304);
      } else {
         return (boolean)(w.a<"Û">((Boolean)w.a<"Û">(this.f2493, 174312564406604366L), 354697271520518137L) && !w.a<"B">(var1, 130756052256592378L)
            ? (f2495 | 497806) + ~(f2495 & 497806) + 1 ^ 1254902789
            : (f2495 | 339187) + ~(f2495 & 339187) + 1 ^ 1255078009);
      }
   }

   public static String brdl3PsohQBkOYChEnEaE3cWqQNJdzE517iVc4cKJmf0p2Rv83Gm8eJdiTUK35sOJVKbbUZCLQD8lqo5X7d8BpWKgV0RCir52qeM(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
