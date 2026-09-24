package me.mioclient;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1422;
import net.minecraft.class_1477;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1569;
import net.minecraft.class_1657;
import net.minecraft.class_1683;
import net.minecraft.class_1684;
import net.minecraft.class_1688;
import net.minecraft.class_243;

public class C0018 extends C1266 {
   public static C0461 freecam = C0933.f1409.m2696(C0461.class);
   public static C0677 norender = C0933.f1409.m2696(C0677.class);
   public final C0015<C0020> f4095;
   public final C0015<Integer> f4096;
   public final C0015<Integer> f4097;
   public final C0015<Boolean> f4098;
   public final C0015<Float> f4099;
   public final C0015<Integer> f4100;
   public final C0015<Float> f4101;
   public final C0015<Float> f4102;
   public final C0015<Float> f4103;
   public final C0015<Float> f4104;
   public final C0015<Float> f4105;
   public final C0015<Float> f4106;
   public final C0015<Boolean> f4107;
   public final C0015<Float> f4108;
   public final C0015<Boolean> f4109;
   public final C0015<C0019> f4110;
   public final C0015<Integer> f4111;
   public final C0015<Float> f4112;
   public final C0015<Boolean> f4113;
   public final C0015<Color> f4114;
   public final C0015<Color> f4115;
   public final C0015<Color> f4116;
   public final C0015<Color> f4117;
   public final C0015<Boolean> f4118;
   public final C0015<Boolean> f4119;
   public final C0015<Boolean> f4120;
   public final C0015<Boolean> f4121;
   public final C0015<Boolean> f4122;
   public final C0015<Integer> f4123;
   public final C0015<Boolean> f4124;
   public final C0015<Integer> f4125;
   public final C0015<Boolean> f4126;
   public final C0015<Boolean> f4127;
   public final C0015<Boolean> f4128;
   public final C0015<Boolean> f4129;
   public final C0015<Boolean> f4130;
   public final C0015<Boolean> f4131;
   public final C0015<Boolean> f4132;
   public final C0015<Boolean> f4133;
   public final ObjectArrayList<class_1297> f4134;
   public float f4135;
   public static int f4136 = w.a<"B">(898330388544593992L, 257832362129977838L);

   public C0018() {
      super("Shader", "Advanced ESP using shaders.", C1045.f3174);
      w.a<"B">(this, 242859112966675773L);
      this.f4134 = new ObjectArrayList();
      this.f4135 = w.a<"B">((f4136 | 769772) + ~(f4136 & 769772) + 1 ^ 1638465303, 349057757755238323L);
      w.a<"Û">(this.f4111, "DecoratorRadius", 275243698516531804L);
      w.a<"Û">(this.f4112, "DecoratorAlpha", 275243698516531804L);
      w.a<"Û">(this.f4120, "HandsFill", 275243698516531804L);
      w.a<"Û">(this.f4121, "HandsOutline", 275243698516531804L);
      w.a<"Û">(this.f4125, "ItemRange", 275243698516531804L);
      w.a<"Û">(this.f4123, "CrystalRange", 275243698516531804L);
   }

   @Override
   public String getInfo() {
      return C0498.m3882(w.a<"Û">(this.f4095, 174312564406604366L));
   }

   @C1027(
      m$$yQoOQz1st0lNQj86PDesOHtgsYLfurTAHSCXM6U4bh1f4TBvo6fLnfZOfETVK2e8rfKZwJawOCAF49XxX6pnKBXEI6PsrW7AJ = -99999999
   )
   public void m3708(C1358 var1) {
      C0344 var2 = w.a<"Û">((C0020)w.a<"Û">(this.f4095, 174312564406604366L), 115972558449864680L);
      w.a<"Û">(this.f4134, 126313462636642575L);
      Iterator var3 = w.a<"Û">(
         w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1687, 156655948167432853L),
         191661729848227466L
      );

      while (w.a<"Û">(var3, 333900474771661065L)) {
         class_1297 var4 = (class_1297)w.a<"Û">(var3, 192468336863492695L);
         if (w.a<"Û">(this, var4, 308251601702005196L)) {
            w.a<"Û">(this.f4134, var4, 384081062731248022L);
         }
      }

      w.a<"Û">(
         this.f4134,
         w.a<"B">(
            (Function<class_1297, Double>)var0 -> w.a<"B">(
                  w.a<"Û">(
                     w.a<"Û">(
                        w.a<"Û">(
                           m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L
                        ),
                        133466035608991790L
                     ),
                     w.a<"Û">(var0, 360959056130751432L),
                     271768320413122837L
                  ),
                  165155940100814265L
               ),
            224107444354928270L
         ),
         317510866906416064L
      );
      C0479.m2762(var2, (boolean)((f4136 | 921239) + ~(f4136 & 921239) + 1 ^ 1580027756), () -> {
         w.a<"Û">(w.a<"Û">(var1, 173269294235887931L), 156066167197700274L);
         w.a<"Û">(this.f4134, (Consumer<class_1297>)var3x -> w.a<"Û">(this, var1, var3x, var2, 174899968348804064L), 205272351064519204L);
         w.a<"Û">(w.a<"Û">(var1, 173269294235887931L), 250771500943331132L);
      });
   }

   @C1027
   public void m3709(C0612 var1) {
      this.f4135 = w.a<"Û">(
         this,
         (class_1297)w.a<"Û">(
            w.a<"Û">(w.a<"Û">(this.f4134, 352622073094781086L), w.a<"B">(this::m3711, 224107444354928270L), 234479002390850050L), null, 237682386832069967L
         ),
         260871151849278408L
      );
   }

   public void m3710(C1355 var1, class_1297 var2, C0344 var3) {
      if (w.a<"Û">(var2, 133372882497935473L) || w.a<"Û">((Boolean)w.a<"Û">(this.f4133, 174312564406604366L), 354697271520518137L)) {
         class_243 var4 = w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
            133466035608991790L
         );
         float var5 = w.a<"Û">(var1, 332657398031159950L);
         double var6 = w.a<"B">((double)var5, var2.field_6038, w.a<"Û">(var2, 232310121460392074L), 308057504384614299L) - var4.field_1352;
         double var8 = w.a<"B">((double)var5, var2.field_5971, w.a<"Û">(var2, 113892722580447470L), 308057504384614299L) - var4.field_1351;
         double var10 = w.a<"B">((double)var5, var2.field_5989, w.a<"Û">(var2, 204214536009510197L), 308057504384614299L) - var4.field_1350;
         float var12 = w.a<"B">(var5, var2.field_5982, w.a<"Û">(var2, 331088680080475721L), 286181508181077551L);
         w.a<"Û">(
            var3.m$$D2Azy1oMT0A9jULp75MJoT61sp1MSsq9TNzibl81TE1bLOjJ6WC0WyS94jT7AMeMoAtZH1XStxf9lKcSFYgefROiGy2Gn5psH,
            (f4136 | 606719) + ~(f4136 & 606719) + 1 ^ 1579811067,
            (f4136 | 214172) + ~(f4136 & 214172) + 1 ^ 1579156888,
            (f4136 | 431526) + ~(f4136 & 431526) + 1 ^ 1579537570,
            (f4136 | 581996) + ~(f4136 & 581996) + 1 ^ 1579917416,
            377547092110746105L
         );
         w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff, 186577611421056948L),
            var2,
            var6,
            var8,
            var10,
            var12,
            var5,
            w.a<"Û">(var1, 173269294235887931L),
            var3.m$$D2Azy1oMT0A9jULp75MJoT61sp1MSsq9TNzibl81TE1bLOjJ6WC0WyS94jT7AMeMoAtZH1XStxf9lKcSFYgefROiGy2Gn5psH,
            (f4136 | 185427) + ~(f4136 & 185427) + 1 ^ 1579259304,
            164531099975477041L
         );
      }
   }

   public float m3711(class_1297 var1) {
      if (var1 != null && w.a<"Û">(norender, 314537768572362865L) && w.a<"Û">((Boolean)w.a<"Û">(norender.f3699, 174312564406604366L), 354697271520518137L)) {
         double var2 = w.a<"Û">(
            w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, 114479647550158442L),
            w.a<"Û">(var1, 360959056130751432L),
            180844654503832142L
         );
         float var4 = w.a<"Û">(var1, 362675778809075131L);
         if (var2 <= (double)var4 && var1 != m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724) {
            float var5 = (float)(var2 / (double)var4);
            float var6 = (float)w.a<"Û">((Integer)w.a<"Û">(norender.f3700, 174312564406604366L), 260981171345819427L)
               / w.a<"B">((f4136 | 784286) + ~(f4136 & 784286) + 1 ^ 492287589, 349057757755238323L);
            return var6 + var5 * (w.a<"B">((f4136 | 216743) + ~(f4136 & 216743) + 1 ^ 1637879644, 349057757755238323L) - var6);
         }
      }

      return w.a<"B">((f4136 | 876817) + ~(f4136 & 876817) + 1 ^ 1638801642, 349057757755238323L);
   }

   public Color m3712(Color var1) {
      float var2 = this.f4135;
      if (C0789.f1300) {
         var2 = w.a<"B">((f4136 | 422543) + ~(f4136 & 422543) + 1 ^ 1638216564, 349057757755238323L);
      }

      return C0152.m3473(var1, (int)(var2 * (float)w.a<"Û">(var1, 245270953955453918L)));
   }

   public float m3713() {
      return C0789.f1300
         ? w.a<"Û">((Float)w.a<"Û">(this.f4108, 174312564406604366L), 149784643039979208L)
         : w.a<"Û">((Float)w.a<"Û">(this.f4108, 174312564406604366L), 149784643039979208L) * this.f4135;
   }

   public boolean m3714(class_1297 var1) {
      float var2 = (float)w.a<"Û">((Integer)w.a<"Û">(this.f4096, 174312564406604366L), 260981171345819427L);
      if (var1 instanceof class_1511) {
         var2 = (float)w.a<"Û">((Integer)w.a<"Û">(this.f4123, 174312564406604366L), 260981171345819427L);
      }

      if (var1 instanceof class_1542) {
         var2 = (float)w.a<"Û">((Integer)w.a<"Û">(this.f4125, 174312564406604366L), 260981171345819427L);
      }

      int var3 = w.a<"B">(w.a<"Û">(var1, 225708705569795011L), 132682894836608805L)
            && !(
               w.a<"Û">(
                     m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724, var1, 274649721728910700L
                  )
                  > var2
            )
         ? (f4136 | 841607) + ~(f4136 & 841607) + 1 ^ 1580177020
         : (f4136 | 635652) + ~(f4136 & 635652) + 1 ^ 1579873022;
      if (var1 instanceof class_1657 var4 && w.a<"Û">(var4, 200877420547186367L)) {
         return (boolean)((f4136 | 66822) + ~(f4136 & 66822) + 1 ^ 1579304189);
      }

      if (var3 != 0) {
         return (boolean)((f4136 | 406676) + ~(f4136 & 406676) + 1 ^ 1579513199);
      } else if (w.a<"B">(var1, 236526568069354406L)) {
         return (boolean)((f4136 | 765402) + ~(f4136 & 765402) + 1 ^ 1579740193);
      } else {
         int var5 = !w.a<"Û">(
                  w.a<"Û">(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773, 202182323384413167L),
                  316146075363717916L
               )
               && !w.a<"Û">(freecam, 314537768572362865L)
            ? (f4136 | 429265) + ~(f4136 & 429265) + 1 ^ 1579535658
            : (f4136 | 283517) + ~(f4136 & 283517) + 1 ^ 1579618951;
         if (var1 instanceof class_1657) {
            if (var5 != 0
               && w.a<"Û">((Boolean)w.a<"Û">(this.f4129, 174312564406604366L), 354697271520518137L)
               && var1 == m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724) {
               return (boolean)((f4136 | 450697) + ~(f4136 & 450697) + 1 ^ 1579524467);
            } else {
               return (boolean)(w.a<"Û">((Boolean)w.a<"Û">(this.f4128, 174312564406604366L), 354697271520518137L)
                     && var1 != m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724
                  ? (f4136 | 606474) + ~(f4136 & 606474) + 1 ^ 1579811056
                  : (f4136 | 376657) + ~(f4136 & 376657) + 1 ^ 1579613866);
            }
         } else {
            return (boolean)((!(var1 instanceof class_1542) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4124, 174312564406604366L), 354697271520518137L))
                  && (!(var1 instanceof class_1683) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4130, 174312564406604366L), 354697271520518137L))
                  && (
                     !(var1 instanceof class_1296) && !(var1 instanceof class_1422) && !(var1 instanceof class_1477)
                        || !w.a<"Û">((Boolean)w.a<"Û">(this.f4126, 174312564406604366L), 354697271520518137L)
                  )
                  && (!(var1 instanceof class_1569) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4127, 174312564406604366L), 354697271520518137L))
                  && (!(var1 instanceof class_1684) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4131, 174312564406604366L), 354697271520518137L))
                  && (!(var1 instanceof class_1511) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4122, 174312564406604366L), 354697271520518137L))
                  && (!(var1 instanceof class_1688) || !w.a<"Û">((Boolean)w.a<"Û">(this.f4132, 174312564406604366L), 354697271520518137L))
               ? (f4136 | 246302) + ~(f4136 & 246302) + 1 ^ 1579189221
               : (f4136 | 857111) + ~(f4136 & 857111) + 1 ^ 1580094957);
         }
      }
   }

   public boolean m3715() {
      return (boolean)(C0789.f1300 && !w.a<"Û">((Boolean)w.a<"Û">(this.f4120, 174312564406604366L), 354697271520518137L)
         ? (f4136 | 704828) + ~(f4136 & 704828) + 1 ^ 1579778246
         : (f4136 | 938107) + ~(f4136 & 938107) + 1 ^ 1580011904);
   }

   public boolean m3716() {
      return (boolean)(C0789.f1300 && !w.a<"Û">((Boolean)w.a<"Û">(this.f4121, 174312564406604366L), 354697271520518137L)
         ? (f4136 | 822396) + ~(f4136 & 822396) + 1 ^ 1580191110
         : (f4136 | 310453) + ~(f4136 & 310453) + 1 ^ 1579679054);
   }

   public static String qQiNO2oIOUQOL0Oe0pPb9FlIOvQ9bHDf7I6GYPYkTHQwBuNTk2vL8IlFlufl2Be6h4itOUz4qy5cGCQIvsKF9K0VkYHMjSzcIMz2(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
