package me.mioclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import me.mioclient.mixin.ducks.DuckAbstractBlock;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1542;
import net.minecraft.class_1667;
import net.minecraft.class_1683;
import net.minecraft.class_1684;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2586;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2678;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_4273;

public class C0053 implements C0045 {
   public final List<class_2586> f3013 = w.a<"B">(new ArrayList(), 291435362423732219L);
   public final Map<class_2338, C0394> f3014 = w.a<"B">(new HashMap(), 297409492390560467L);
   public final Set<class_2338> f3015 = w.a<"B">(new HashSet(), 166028414854636487L);
   public final Set<class_2338> f3016 = w.a<"B">(new HashSet(), 166028414854636487L);
   public final Set<C0246> f3017 = w.a<"B">(new HashSet(), 166028414854636487L);
   @Deprecated
   public class_2338 unconfirmedBreak = null;
   public class_1799 f3018;
   public class_1799 f3019;
   public final C0083 f3020 = new C0083();
   public int f3021;
   public static int f3022 = w.a<"B">(8830594641239947832L, 257832362129977838L);

   public C0053() {
      w.a<"Û">(m$$LhN3aMIG1xamNF5W0O3OUPIULy6Ir9ugEHvJJzLsIpXpAVh9kz1bVeXg8pqjWXv3Kig87cb7XjRXScjx9zcM5skilv9gXmiQ8, this, 157496676404787811L);
   }

   @C1027
   public void m3250(C0190 var1) {
      w.a<"Û">(this.f3014, 288879253482200997L);
      w.a<"Û">(this.f3015, 259971657844247781L);
      w.a<"Û">(this.f3013, 140901994866995976L);
      w.a<"Û">(this.f3017, 259971657844247781L);
   }

   @C1027(
      m$$yQoOQz1st0lNQj86PDesOHtgsYLfurTAHSCXM6U4bh1f4TBvo6fLnfZOfETVK2e8rfKZwJawOCAF49XxX6pnKBXEI6PsrW7AJ = 200
   )
   public void m3251(C0591 var1) {
      w.a<"Û">(this, 203536372807808440L);
   }

   @C1027(
      m$$yQoOQz1st0lNQj86PDesOHtgsYLfurTAHSCXM6U4bh1f4TBvo6fLnfZOfETVK2e8rfKZwJawOCAF49XxX6pnKBXEI6PsrW7AJ = -200
   )
   public void m3252(C0612 var1) {
      w.a<"Û">(this.f3016, 259971657844247781L);
      if (w.a<"Û">(this.f3020, ((long)f3022 | 88523L) + ~((long)f3022 & 88523L) + 1L ^ 575981912L, 309642602085515378L)) {
         this.unconfirmedBreak = null;
      }

      w.a<"Û">(
         this.f3015,
         (Predicate<class_2338>)var0 -> (boolean)(!w.a<"Û">(
                  var0,
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 299721818904416994L),
                  w.a<"B">(((long)f3022 | 411850L) + ~((long)f3022 & 411850L) + 1L ^ 4638707616767531215L, 317139102743630955L),
                  217636444529705754L
               )
               ? (f3022 | 683052) + ~(f3022 & 683052) + 1 ^ 576715816
               : (f3022 | 44112) + ~(f3022 & 44112) + 1 ^ 576011349),
         271448142827029127L
      );
      synchronized (this.f3014) {
         ArrayList var3 = new ArrayList();
         Iterator var4 = w.a<"Û">(w.a<"Û">(this.f3014, 354320704134596920L), 194435811056609302L);

         while (w.a<"Û">(var4, 333900474771661065L)) {
            Entry var5 = (Entry)w.a<"Û">(var4, 192468336863492695L);
            if (w.a<"B">(223409559795593705L)
               > w.a<"Û">((C0394)w.a<"Û">(var5, 196870340575900401L), 308971481820117745L)
                  + (((long)f3022 | 491095L) + ~((long)f3022 & 491095L) + 1L ^ 575860392L)) {
               w.a<"Û">(var3, (class_2338)w.a<"Û">(var5, 141740301999341859L), 276802003864609490L);
            }
         }

         var4 = w.a<"Û">(var3, 341496865259068134L);

         while (w.a<"Û">(var4, 333900474771661065L)) {
            class_2338 var16 = (class_2338)w.a<"Û">(var4, 192468336863492695L);
            w.a<"Û">(this.f3014, var16, 128627855127182569L);
         }
      }

      synchronized (w.a<"Û">(this, 256388424110503341L)) {
         w.a<"Û">(this.f3013, 140901994866995976L);
         w.a<"Û">(this.f3013, w.a<"B">(307461254337034737L), 271623032661790232L);
         w.a<"Û">(this.f3013, Objects::isNull, 372804948295703628L);
         w.a<"Û">(
            this.f3013,
            w.a<"B">(
               (Function<class_2586, Double>)var0 -> w.a<"B">(
                     w.a<"Û">(
                        w.a<"Û">(
                           m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 114479647550158442L
                        ),
                        w.a<"Û">(w.a<"Û">(var0, 269630716540245963L), 229561253177300454L),
                        271768320413122837L
                     ),
                     165155940100814265L
                  ),
               224107444354928270L
            ),
            369116887926758393L
         );
      }

      synchronized (this.f3017) {
         Iterator var13 = w.a<"Û">(this.f3017, 194435811056609302L);

         while (w.a<"Û">(var13, 333900474771661065L)) {
            C0246 var15 = (C0246)w.a<"Û">(var13, 192468336863492695L);
            if (w.a<"Û">(var15, 139505943034691367L)) {
               w.a<"Û">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687,
                  w.a<"Û">(var15, 189297064378072591L),
                  w.a<"Û">(var15, 328053022686109160L),
                  377828007779303518L
               );
            }
         }
      }

      w.a<"Û">(this.f3017, C0246::m2106, 271448142827029127L);
   }

   @C1027
   public void m3253(C0132 var1) {
      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_2885 var2
         && w.a<"Û">(w.a<"Û">(this, w.a<"Û">(var2, 337054383787126058L), 200344847097995200L), 222207108884875224L) instanceof class_1747 var3) {
         class_3965 var7 = w.a<"Û">(var2, 324915051986502352L);
         class_2338 var5 = w.a<"Û">(w.a<"Û">(var7, 318588572047519347L), w.a<"Û">(var7, 256237328539981644L), 361576458954219689L);
         w.a<"Û">(this.f3014, var5, w.a<"B">(w.a<"Û">(var3, 339813793232936443L), 280577399634514105L), 121875332790264405L);
         w.a<"Û">(this.f3016, var5, 309270453639690490L);
         w.a<"Û">(this, 203536372807808440L);
      }
   }

   @C1027
   public void m3254(C1109 var1) {
      w.a<"Û">(this, 203536372807808440L);
   }

   @C1027
   public void m3255(C0133 var1) {
      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_2626 var2) {
         w.a<"Û">(this.f3017, (Predicate<C0246>)var1x -> w.a<"Û">(var1x, 189297064378072591L).equals(w.a<"Û">(var2, 374912813267946826L)), 271448142827029127L);
         if (w.a<"Û">(w.a<"Û">(var2, 352440678900927401L), 363526675043086623L)) {
            w.a<"Û">(this.f3015, w.a<"Û">(var2, 374912813267946826L), 124697318442522382L);
            w.a<"Û">(this.f3014, w.a<"Û">(var2, 374912813267946826L), 128627855127182569L);
         } else if (w.a<"Û">(this.f3014, w.a<"Û">(var2, 374912813267946826L), 128627855127182569L) != null) {
            w.a<"Û">(this.f3015, w.a<"Û">(var2, 374912813267946826L), 309270453639690490L);
         }
      }

      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_2637 var4) {
         w.a<"Û">(
            var4,
            (BiConsumer<class_2338, class_2680>)(var1x, var2x) -> w.a<"Û">(
                  this.f3017, (Predicate<C0246>)var1xx -> w.a<"Û">(var1xx, 189297064378072591L).equals(var1x), 271448142827029127L
               ),
            297095639837123530L
         );
      }

      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_2678 var5) {
         this.f3021 = w.a<"Û">(var5, 275539577614371486L);
      }

      if (w.a<"Û">(var1, 127302489982333990L) instanceof class_4273 var6) {
         this.f3021 = w.a<"Û">(var6, 207824517905717475L);
      }
   }

   @C1027
   public void m3256(C1352 var1) {
      if (w.a<"Û">(var1, 237068343286007081L) != null
         && m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724 != null) {
         if (w.a<"Û">(this.f3014, w.a<"Û">(var1, 237068343286007081L), 325824999980124721L)) {
            C0394 var2 = (C0394)w.a<"Û">(this.f3014, w.a<"Û">(var1, 237068343286007081L), 299255156581412505L);
            if (var2 == null || w.a<"Û">(var2, 355668610993813509L) == null) {
               return;
            }

            class_238 var3 = new class_238(w.a<"Û">(var1, 237068343286007081L));
            if (w.a<"Û">(
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 261249985676109960L),
                  var3,
                  133676266014519719L
               )
               || !((DuckAbstractBlock)w.a<"Û">(var2, 355668610993813509L)).isCollidable()) {
               return;
            }

            if (!w.a<"Û">(
               w.a<"Û">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687,
                  class_1297.class,
                  var3,
                  (Predicate<class_1297>)var0 -> (boolean)(!(var0 instanceof class_1683)
                           && !(var0 instanceof class_1542)
                           && !(var0 instanceof class_1303)
                           && !(var0 instanceof class_1667)
                           && !(var0 instanceof class_1684)
                        ? (f3022 | 240411) + ~(f3022 & 240411) + 1 ^ 576076575
                        : (f3022 | 171020) + ~(f3022 & 171020) + 1 ^ 576130057),
                  132523282209579994L
               ),
               284469716622774448L
            )) {
               return;
            }

            w.a<"Û">(
               var1,
               w.a<"Û">(
                  w.a<"Û">(w.a<"Û">(var2, 355668610993813509L), 371018036170469473L),
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687,
                  w.a<"Û">(var1, 237068343286007081L),
                  385368692334192390L
               ),
               262992423543532860L
            );
         }

         if (w.a<"B">(171090672375251307L)) {
            if (w.a<"Û">(w.a<"Û">(C0933.f1416, 131737481540982891L), ((long)f3022 | 663746L) + ~((long)f3022 & 663746L) + 1L ^ 576696811L, 309642602085515378L)
               )
             {
               if (w.a<"Û">(var1, 237068343286007081L).equals(this.unconfirmedBreak)) {
                  w.a<"Û">(var1, w.a<"B">(248767843822576740L), 262992423543532860L);
               }
            }
         }
      }
   }

   public void m3257(class_2338 var1) {
      w.a<"Û">(this.f3017, w.a<"B">(var1, 178972224900368046L), 309270453639690490L);
      w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1761, var1, 241541298675415944L);
   }

   public void m3258(class_2338 var1) {
      this.unconfirmedBreak = var1;
      w.a<"Û">(this.f3020, 387780412884547639L);
   }

   public class_2338 m3259() {
      return this.unconfirmedBreak;
   }

   public Map<class_2338, C0394> m3260() {
      return this.f3014;
   }

   public class_1799 m3261(class_1268 var1) {
      return var1 == class_1268.field_5808 ? this.f3018 : this.f3019;
   }

   public void m3262() {
      this.f3018 = w.a<"Û">(
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 229019767109027877L),
         130512395089112511L
      );
      this.f3019 = w.a<"Û">(
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 159396947398056288L),
         130512395089112511L
      );
   }

   public List<class_2586> m3263() {
      return this.f3013;
   }

   public boolean m3264(class_2338 var1) {
      return (boolean)(!w.a<"Û">(this.f3015, var1, 338145669613544495L) && !w.a<"Û">(this.f3014, var1, 325824999980124721L)
         ? (f3022 | 557906) + ~(f3022 & 557906) + 1 ^ 576525143
         : (f3022 | 281215) + ~(f3022 & 281215) + 1 ^ 575789691);
   }

   public boolean m3265(class_2338 var1) {
      return (boolean)(w.a<"Û">(
               w.a<"Û">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, var1, 310987074049434965L
               ),
               289106033197017315L
            )
            && !w.a<"Û">(this.f3016, var1, 338145669613544495L)
         ? (f3022 | 302245) + ~(f3022 & 302245) + 1 ^ 575736992
         : (f3022 | 229157) + ~(f3022 & 229157) + 1 ^ 576122657);
   }

   public int m3266() {
      return this.f3021;
   }
}
