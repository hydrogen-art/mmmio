package me.mioclient;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.UnaryOperator;
import net.minecraft.class_124;
import net.minecraft.class_1299;
import net.minecraft.class_1538;
import net.minecraft.class_1657;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_5819;
import net.minecraft.class_5892;
import net.minecraft.class_703;
import net.minecraft.class_7384;

public class C0039 extends C1266 {
   public final C0015<Boolean> f5265;
   public final C0015<Boolean> f5266;
   public final C0015<C1348> f5267;
   public final C0015<Float> f5268;
   public final C0015<Boolean> f5269;
   public final C0015<C1348> f5270;
   public final C0015<Float> f5271;
   public final C0015<Boolean> f5272;
   public final C0015<Float> f5273;
   public final C0015<Boolean> f5274;
   public final C0015<Integer> f5275;
   public final C0015<Boolean> f5276;
   public final C0015<Boolean> f5277;
   public final C0015<Boolean> f5278;
   public final C0015<Boolean> f5279;
   public final C0015<Boolean> f5280;
   public final C0015<Float> f5281;
   public final C0015<String> f5282;
   public final C0015<Boolean> f5283;
   public final C0015<Boolean> f5284;
   public static C1104 f5285 = C0933.f1409.m2696(C1104.class);
   public static final class_5819 f5286 = new class_7384(w.a<"B">(223409559795593705L));
   public final ConcurrentHashMap<UUID, Integer> f5287;
   public final ObjectList<UUID> f5288;
   public int f5289;
   public int f5290;
   public List<String> f5291;
   public static int f5292 = w.a<"B">(6020670971113331394L, 257832362129977838L);

   public C0039() {
      super("KillEffects", "Does various things when someone dies.", C1045.f3173);
      w.a<"B">(this, 242859112966675773L);
      this.f5287 = new ConcurrentHashMap<>();
      this.f5288 = w.a<"B">(new ObjectArrayList(), 134167403133599274L);
      this.f5289 = (f5292 | 462539) + ~(f5292 & 462539) + 1 ^ -1023108675;
      this.f5290 = (f5292 | 736950) + ~(f5292 & 736950) + 1 ^ -1022842432;
      this.f5291 = w.a<"B">(new ArrayList(), 291435362423732219L);
      w.a<"Û">(this.f5266, "KillSoundPlayers", 275243698516531804L);
      w.a<"Û">(this.f5267, "KillSoundPlayersSound", 275243698516531804L);
      w.a<"Û">(this.f5268, "KillSoundPlayersVolume", 275243698516531804L);
      w.a<"Û">(this.f5269, "KillSoundSelf", 275243698516531804L);
      w.a<"Û">(this.f5270, "KillSoundSelfSound", 275243698516531804L);
      w.a<"Û">(this.f5271, "KillSoundSelfVolume", 275243698516531804L);
      w.a<"Û">(this.f5276, "ThunderSelf", 275243698516531804L);
      w.a<"Û">(this.f5273, "KillStreakSoundVolume", 275243698516531804L);
      w.a<"Û">(this.f5279, "AshesSelf", 275243698516531804L);
      w.a<"Û">(this.f5280, (Runnable)() -> {
         if (w.a<"Û">((Boolean)w.a<"Û">(this.f5280, 174312564406604366L), 354697271520518137L)) {
            w.a<"Û">(this, (boolean)((f5292 | 95552) + ~(f5292 & 95552) + 1 ^ -1023221194), 173842780690845528L);
         }
      }, 276217487236498440L);
      w.a<"Û">(this.f5284, (Runnable)() -> {
         if (w.a<"Û">((Boolean)w.a<"Û">(this.f5284, 174312564406604366L), 354697271520518137L)) {
            w.a<"Û">(this, (boolean)((f5292 | 301064) + ~(f5292 & 301064) + 1 ^ -1022947457), 173842780690845528L);
            w.a<"Û">(this.f5284, w.a<"B">((boolean)((f5292 | 251354) + ~(f5292 & 251354) + 1 ^ -1023393108), 320330632857389983L), 277551887451345681L);
         }
      }, 276217487236498440L);
      w.a<"Û">(this.f5283, (Runnable)() -> this.f5290 = (f5292 | 507735) + ~(f5292 & 507735) + 1 ^ -1023137759, 276217487236498440L);
      w.a<"Û">(
         this.f5282, (Runnable)() -> w.a<"Û">(this, (boolean)((f5292 | 60050) + ~(f5292 & 60050) + 1 ^ -1023181339), 173842780690845528L), 276217487236498440L
      );
      w.a<"Û">(this.f5282, "AutoEZPath", 275243698516531804L);
      w.a<"Û">(this.f5283, "AutoEZRandom", 275243698516531804L);
      w.a<"Û">(this.f5284, "AutoEZRefresh", 275243698516531804L);
      w.a<"Û">(this, (boolean)((f5292 | 320080) + ~(f5292 & 320080) + 1 ^ -1022921434), 135570431627433065L);
   }

   @Override
   public void onEnable() {
      this.f5289 = (f5292 | 657709) + ~(f5292 & 657709) + 1 ^ -1022779813;
      w.a<"Û">(this, (boolean)((f5292 | 245751) + ~(f5292 & 245751) + 1 ^ -1023399808), 173842780690845528L);
   }

   @C1027
   public void m2113(C0190 var1) {
      this.f5289 = (f5292 | 644807) + ~(f5292 & 644807) + 1 ^ -1022737999;
   }

   @C1027
   public void m2114(C1326 var1) {
      if (w.a<"Û">(var1, 306625651387180848L) != C0277.f4215) {
         if (!w.a<"Û">(this, 205492958615326489L)) {
            if (w.a<"Û">(var1, 297159386115682001L) instanceof class_1657 var3
               && var3 != m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724
               && !w.a<"Û">(C0933.f1417, w.a<"Û">(w.a<"Û">(var3, 148578202377381513L), 286788181028845103L), 225253295937045434L)
               && w.a<"B">(var3, 181476777857313967L) > 0.0F) {
               try {
                  w.a<"Û">(
                     this.f5287,
                     w.a<"Û">(var3, 324397300427198075L),
                     w.a<"B">(
                        m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_6012,
                        367942141483020029L
                     ),
                     113839807039675881L
                  );
               } catch (Exception var5) {
               }
            }
         }
      }
   }

   @C1027
   public void m2115(C0133 var1) {
      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_5892) {
         this.f5289 = (f5292 | 127039) + ~(f5292 & 127039) + 1 ^ 1023252662;
      }
   }

   @C1027
   public void m2116(C0612 var1) {
      if (!w.a<"Û">(this, 205492958615326489L)) {
         if (this.f5289 == ((f5292 | 623450) + ~(f5292 & 623450) + 1 ^ 1022749651)) {
            this.f5289 = (f5292 | 111163) + ~(f5292 & 111163) + 1 ^ -1023269555;
            if (w.a<"Û">((Boolean)w.a<"Û">(this.f5265, 174312564406604366L), 354697271520518137L)
               && w.a<"Û">((Boolean)w.a<"Û">(this.f5269, 174312564406604366L), 354697271520518137L)
               && w.a<"Û">((Float)w.a<"Û">(this.f5271, 174312564406604366L), 149784643039979208L) > 0.0F) {
               C0134 var2 = w.a<"Û">(C0933.f1420, (C1348)w.a<"Û">(this.f5270, 174312564406604366L), 371338236536096699L);
               if (var2 != null) {
                  w.a<"Û">(var2, w.a<"Û">((Float)w.a<"Û">(this.f5271, 174312564406604366L), 149784643039979208L), 212279982900710395L);
               }
            }

            if (w.a<"Û">((Boolean)w.a<"Û">(this.f5274, 174312564406604366L), 354697271520518137L)
               && w.a<"Û">((Boolean)w.a<"Û">(this.f5276, 174312564406604366L), 354697271520518137L)) {
               w.a<"Û">(
                  this,
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 114479647550158442L),
                  170559386305943625L
               );
            }

            if (w.a<"Û">((Boolean)w.a<"Û">(this.f5278, 174312564406604366L), 354697271520518137L)
               && w.a<"Û">((Boolean)w.a<"Û">(this.f5279, 174312564406604366L), 354697271520518137L)) {
               w.a<"Û">(
                  this,
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 114479647550158442L),
                  335776074181856781L
               );
            }
         }

         w.a<"Û">(this.f5288, 242795367740842327L);
         synchronized (this.f5287) {
            Iterator var3 = w.a<"Û">(w.a<"Û">(this.f5287, 174851628121742182L), 270311222073355079L);

            while (w.a<"Û">(var3, 333900474771661065L)) {
               UUID var4 = (UUID)w.a<"Û">(var3, 192468336863492695L);

               try {
                  class_1657 var5 = w.a<"Û">(
                     m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, var4, 191871202600449693L
                  );
                  if (var5 == null) {
                     w.a<"Û">(this.f5288, var4, 383500696639390968L);
                  } else {
                     int var6 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_6012
                        - w.a<"Û">((Integer)w.a<"Û">(this.f5287, var4, 203852389717232268L), 260981171345819427L);
                     if (var6 > ((f5292 | 656688) + ~(f5292 & 656688) + 1 ^ -1022782894)) {
                        w.a<"Û">(this.f5288, var4, 383500696639390968L);
                     } else if (w.a<"Û">(var5, 233742093911656776L) <= 0.0F) {
                        w.a<"Û">(this.f5288, var4, 383500696639390968L);
                        this.f5289 = this.f5289 + ((f5292 | 448429) + ~(f5292 & 448429) + 1 ^ -1023065894);
                        if (w.a<"Û">((Boolean)w.a<"Û">(this.f5280, 174312564406604366L), 354697271520518137L)) {
                           String var8 = w.a<"Û">(this, 189864582157565508L);
                           if (var8 != null) {
                              var8 = w.a<"Û">(var8, "{name}", w.a<"Û">(w.a<"Û">(var5, 148578202377381513L), 286788181028845103L), 328425598364162988L);
                              if (!w.a<"Û">(f5285, 314537768572362865L)
                                 || !w.a<"Û">(var8, (String)w.a<"Û">(f5285.f0469, 174312564406604366L), 339063961306778534L)) {
                                 String var9 = var8;
                                 Runnable var10 = () -> w.a<"B">(var9, 158920205804770919L);
                                 if (w.a<"Û">(this.f5281, 335309852205562156L)) {
                                    w.a<"Û">(var10, 324159666149362285L);
                                 } else {
                                    w.a<"Û">(
                                       C0933.f1433,
                                       var10,
                                       (int)(
                                          w.a<"Û">((Float)w.a<"Û">(this.f5281, 174312564406604366L), 149784643039979208L)
                                             / w.a<"B">((f5292 | 48330) + ~(f5292 & 48330) + 1 ^ -28317839, 349057757755238323L)
                                       ),
                                       122889728173745617L
                                    );
                                 }
                              }
                           }
                        }

                        if (w.a<"Û">((Boolean)w.a<"Û">(this.f5274, 174312564406604366L), 354697271520518137L)
                           && (w.a<"B">(var5, 130756052256592378L) || !w.a<"Û">((Boolean)w.a<"Û">(this.f5277, 174312564406604366L), 354697271520518137L))) {
                           w.a<"Û">(this, w.a<"Û">(var5, 359920018220808632L), 170559386305943625L);
                        }

                        if (w.a<"Û">((Boolean)w.a<"Û">(this.f5278, 174312564406604366L), 354697271520518137L)) {
                           w.a<"Û">(this, w.a<"Û">(var5, 359920018220808632L), 335776074181856781L);
                        }

                        if (w.a<"Û">((Boolean)w.a<"Û">(this.f5265, 174312564406604366L), 354697271520518137L)
                           && w.a<"Û">((Boolean)w.a<"Û">(this.f5266, 174312564406604366L), 354697271520518137L)
                           && w.a<"Û">((Float)w.a<"Û">(this.f5268, 174312564406604366L), 149784643039979208L) > 0.0F) {
                           C0134 var22 = w.a<"Û">(C0933.f1420, (C1348)w.a<"Û">(this.f5267, 174312564406604366L), 371338236536096699L);
                           if (var22 != null) {
                              w.a<"Û">(var22, w.a<"Û">((Float)w.a<"Û">(this.f5268, 174312564406604366L), 149784643039979208L), 212279982900710395L);
                           }
                        }

                        if (w.a<"Û">((Boolean)w.a<"Û">(this.f5272, 174312564406604366L), 354697271520518137L)
                           && this.f5289 >= ((f5292 | 236144) + ~(f5292 & 236144) + 1 ^ -1023406844)
                           && w.a<"Û">((Float)w.a<"Û">(this.f5273, 174312564406604366L), 149784643039979208L) > 0.0F) {
                           C0134 var23 = w.a<"Û">(C0933.f1420, this.f5289, 382510172730962804L);
                           if (var23 != null) {
                              w.a<"Û">(var23, w.a<"Û">((Float)w.a<"Û">(this.f5273, 174312564406604366L), 149784643039979208L), 212279982900710395L);
                           }
                        }
                     }
                  }
               } catch (Exception var15) {
               }
            }
         }

         synchronized (this.f5288) {
            try {
               ObjectListIterator var19 = w.a<"Û">(this.f5288, 150951082806341405L);

               while (w.a<"Û">(var19, 333900474771661065L)) {
                  UUID var20 = (UUID)w.a<"Û">(var19, 192468336863492695L);
                  w.a<"Û">(this.f5287, var20, 212341237211316739L);
               }
            } catch (Exception var13) {
            }
         }
      }
   }

   public void m2117(class_1657 var1) {
      if (!w.a<"Û">(this, 205492958615326489L)
         && var1 != m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724
         && !w.a<"Û">(C0933.f1417, w.a<"Û">(w.a<"Û">(var1, 148578202377381513L), 286788181028845103L), 225253295937045434L)) {
         try {
            w.a<"Û">(
               this.f5287,
               w.a<"Û">(var1, 324397300427198075L),
               w.a<"B">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_6012,
                  367942141483020029L
               ),
               113839807039675881L
            );
         } catch (Exception var3) {
         }
      }
   }

   public void m2118(boolean var1) {
      if (w.a<"Û">((Boolean)w.a<"Û">(this.f5280, 174312564406604366L), 354697271520518137L) || var1) {
         Path var10000 = w.a<"Û">(C1165.f0527, (String)w.a<"Û">(this.f5282, 174312564406604366L), 208803259736780592L);
         String[] var10001 = new String[(f5292 | 283911) + ~(f5292 & 283911) + 1 ^ -1022901648];
         var10001[(f5292 | 87746) + ~(f5292 & 87746) + 1 ^ -1023229516] = ".txt";
         Path var2 = w.a<"B">(var10000, var10001, 358501288355537839L);

         try {
            if (!w.a<"Û">(w.a<"Û">(var2, 318068064568792515L), 317839649527142638L)) {
               Object[] var10003 = new Object[(f5292 | 401294) + ~(f5292 & 401294) + 1 ^ -1023047431];
               var10003[(f5292 | 559726) + ~(f5292 & 559726) + 1 ^ -1022681832] = w.a<"Û">(this.f5282, 174312564406604366L);
               throw new IOException(w.a<"Û">("AutoEZ file %s not found", var10003, 259257223839993282L));
            }

            w.a<"Û">(this.f5291, 140901994866995976L);
            w.a<"Û">(this.f5291, w.a<"B">(w.a<"Û">(var2, 318068064568792515L), StandardCharsets.UTF_8, 108336427594749562L), 271623032661790232L);
            this.f5290 = (f5292 | 726231) + ~(f5292 & 726231) + 1 ^ -1022852191;
         } catch (Exception var6) {
            if (w.a<"Û">((Boolean)w.a<"Û">(this.f5280, 174312564406604366L), 354697271520518137L)) {
               w.a<"B">(
                  w.a<"Û">(
                     w.a<"B">(new C1002().m2591(w.a<"B">(var6, 174997918119584642L)).m2593("Failed to update AutoEZ lines: \u0001"), 228465064790135899L),
                     (UnaryOperator)var0 -> w.a<"Û">(var0, class_124.field_1061, 279049886156942355L),
                     165931758622126162L
                  ),
                  w.a<"B">((f5292 | 608243) + ~(f5292 & 608243) + 1 ^ 1013329355, 289296048454852994L),
                  C0639.f3882,
                  211469761772001922L
               );

               try {
                  w.a<"B">(var2, new FileAttribute[(f5292 | 557642) + ~(f5292 & 557642) + 1 ^ -1022683844], 146085388416447367L);
               } catch (IOException var5) {
               }
            }
         }
      }
   }

   public String m2119() {
      try {
         if (w.a<"Û">(this.f5291, 284469716622774448L)) {
            return null;
         } else if (w.a<"Û">((Boolean)w.a<"Û">(this.f5283, 174312564406604366L), 354697271520518137L)) {
            return (String)w.a<"Û">(
               this.f5291, w.a<"Û">(w.a<"B">(339623076596514038L), w.a<"Û">(this.f5291, 260708190417501501L), 290903900221401347L), 325739049664951543L
            );
         } else {
            List var10000 = this.f5291;
            int var10001 = this.f5290;
            this.f5290 = this.f5290 + ((f5292 | 27119) + ~(f5292 & 27119) + 1 ^ -1023148392);
            return (String)w.a<"Û">(var10000, var10001 % w.a<"Û">(this.f5291, 260708190417501501L), 325739049664951543L);
         }
      } catch (Exception var2) {
         return null;
      }
   }

   public void m2120(class_243 var1) {
      for (int var2 = (f5292 | 116999) + ~(f5292 & 116999) + 1 ^ -1023254927;
         var2 < w.a<"Û">((Integer)w.a<"Û">(this.f5275, 174312564406604366L), 260981171345819427L);
         var2++
      ) {
         class_1538 var3 = new class_1538(
            class_1299.field_6112, m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687
         );
         w.a<"Û">(var3, var1, 195140128880882405L);
         w.a<"Û">(var3, var1, 164462217578819023L);
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, var3, 115753465985057365L);
      }
   }

   public void m2121(class_243 var1) {
      for (int var2 = (f5292 | 224324) + ~(f5292 & 224324) + 1 ^ -1023345870;
         var2
            < w.a<"Û">(f5286, (f5292 | 582501) + ~(f5292 & 582501) + 1 ^ -1022659536, 264607176943110869L)
               + ((f5292 | 883658) + ~(f5292 & 883658) + 1 ^ -1022432091);
         var2++
      ) {
         class_703 var3 = w.a<"Û">(
            m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1713,
            w.a<"Û">(f5286, 304245520903141031L) ? class_2398.field_22247 : class_2398.field_23956,
            w.a<"Û">(var1, 366754089402394978L)
               + w.a<"Û">(f5286, 203886655549941078L)
                  * w.a<"B">(((long)f5292 | 494790L) + ~((long)f5292 & 494790L) + 1L ^ -4597454644027271299L, 317139102743630955L),
            w.a<"Û">(var1, 292829928904272542L)
               + w.a<"B">(((long)f5292 | 716709L) + ~((long)f5292 & 716709L) + 1L ^ -4611686019450177325L, 317139102743630955L)
               - w.a<"Û">(f5286, 203886655549941078L)
                  * w.a<"B">(((long)f5292 | 804624L) + ~((long)f5292 & 804624L) + 1L ^ -4602949035701887829L, 317139102743630955L),
            w.a<"Û">(var1, 317360164092454553L)
               + w.a<"Û">(f5286, 203886655549941078L)
                  * w.a<"B">(((long)f5292 | 720515L) + ~((long)f5292 & 720515L) + 1L ^ -4597454644027480776L, 317139102743630955L),
            0.0,
            w.a<"B">(-4631501856787818086L, 317139102743630955L)
               - w.a<"Û">(f5286, 203886655549941078L)
                  * w.a<"B">(((long)f5292 | 786194L) + ~((long)f5292 & 786194L) + 1L ^ -4602678820195506076L, 317139102743630955L),
            0.0,
            214377668763196631L
         );
         if (var3 != null) {
            var3.field_3847 = var3.field_3847 + ((f5292 | 746963) + ~(f5292 & 746963) + 1 ^ -1022823766);
         }
      }
   }

   public static String F52slXToRZFCIJVkenI8R8XPX0B01CGz7Yx5OTQYNEHK5P8noI4redHhPjME9pqzUFBQWo8FEzK0xH576Kj5vIRwzaIPTAHegb0N(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
