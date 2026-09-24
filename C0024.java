package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.lwjgl.glfw.GLFW;

public class C0024 extends C1092 {
   public static final class_2960 f2697 = class_2960.method_60655("mio", "textures/triangle.png");
   public static C0024 f2698;
   public final C0015<Float> f2699;
   public final C0072 f2700;
   public boolean f2701;
   public static int f2702 = 2016675324;

   public C0024(C0601 var1) {
      super(var1);
      this.f2699 = new C0290<>(
         "Size",
         Float.intBitsToFloat((f2702 | 92839) + ~(f2702 & 92839) + 1 ^ 1203072859),
         Float.intBitsToFloat((f2702 | 866604) + ~(f2702 & 866604) + 1 ^ 1194933456),
         Float.intBitsToFloat((f2702 | 245876) + ~(f2702 & 245876) + 1 ^ 943179144)
      );
      this.f2700 = new C0072();
   }

   @Override
   public void m0001(class_332 var1, class_4587 var2, double var3, double var5) {
      super.m0001(var1, var2, var3, var5);
      float[] var7 = this.m$$5A06gZj2dsph0f9cXKvj8epziI0fcqRkJo7UqoMuOreVQZNCp519kmHqqLBtI2Y6PvI4f5F9teEN3bzlthtsJA0DeNZJu8qk0.m0563();
      var2.method_22903();
      if (this.f2701) {
         var2.method_22905(this.m1075(), this.m1075(), Float.intBitsToFloat((f2702 | 69759) + ~(f2702 & 69759) + 1 ^ 1203049859));
         var2.method_46416(
            this.m$$bozWMGG3YDsfjiKSBecrFVSGu4m3Vmr92d1ZfhIfVD2UvsId4MqrMHCFTCShpOQXrtChkILvVY01QuqxS6YXIvDtS4Lghic0p() / this.m1075(),
            this.m$$1CqrbCjMf48cYbpAUy7HpGUjTl7uZ03IF7QJyV09HpHBaKqP6zGcVRt7Qt9Um7TwY5CH3raBxwmYccMfQHsHztudl22SQ8uKr() / this.m1075(),
            0.0F
         );
      } else {
         var2.method_46416(
            this.m$$bozWMGG3YDsfjiKSBecrFVSGu4m3Vmr92d1ZfhIfVD2UvsId4MqrMHCFTCShpOQXrtChkILvVY01QuqxS6YXIvDtS4Lghic0p(),
            this.m$$1CqrbCjMf48cYbpAUy7HpGUjTl7uZ03IF7QJyV09HpHBaKqP6zGcVRt7Qt9Um7TwY5CH3raBxwmYccMfQHsHztudl22SQ8uKr(),
            0.0F
         );
      }

      this.m$$5A06gZj2dsph0f9cXKvj8epziI0fcqRkJo7UqoMuOreVQZNCp519kmHqqLBtI2Y6PvI4f5F9teEN3bzlthtsJA0DeNZJu8qk0.m0562(var1);
      if (!m$$pKAlAHlut5QYTZu8DvqT5VzS9Xa0uVrkPAk4yJDRfk6MjQbn4aOFybrtSVXm9xiJTiOYHuUl6wATNXz9MGA1Dezfp5o5FWC7Z && this.f2701) {
         boolean var8 = this.m1076(var3, var5);
         if (f2698 == this) {
            double var9 = (double)var7[(f2702 | 899619) + ~(f2702 & 899619) + 1 ^ 2017050591];
            double var11 = (double)var7[(f2702 | 887379) + ~(f2702 & 887379) + 1 ^ 2017038254];
            double var13 = Math.min(
               (var3 - (double)this.m$$bozWMGG3YDsfjiKSBecrFVSGu4m3Vmr92d1ZfhIfVD2UvsId4MqrMHCFTCShpOQXrtChkILvVY01QuqxS6YXIvDtS4Lghic0p()) / var9,
               (var5 - (double)this.m$$1CqrbCjMf48cYbpAUy7HpGUjTl7uZ03IF7QJyV09HpHBaKqP6zGcVRt7Qt9Um7TwY5CH3raBxwmYccMfQHsHztudl22SQ8uKr()) / var11
            );
            this.f2699.m2603((float)C0082.m1399(var13, (f2702 | 113016) + ~(f2702 & 113016) + 1 ^ 2016787590));
         }

         if (var8 && this.m1077((f2702 | 863787) + ~(f2702 & 863787) + 1 ^ 2017012694)) {
            this.f2699.m2603(Float.intBitsToFloat((f2702 | 980291) + ~(f2702 & 980291) + 1 ^ 1203433663));
         }

         if (var8 && this.m1077((f2702 | 534371) + ~(f2702 & 534371) + 1 ^ 2017206943)) {
            f2698 = this;
         } else if (!this.m1077((f2702 | 152727) + ~(f2702 & 152727) + 1 ^ 2016825707)) {
            f2698 = null;
         }

         if (f2698 == this) {
            this.f2700
               .m0792(
                  Float.intBitsToFloat((f2702 | 230571) + ~(f2702 & 230571) + 1 ^ 1196549937),
                  ((long)f2702 | 944588L) + ~((long)f2702 & 944588L) + 1L ^ 2017094858L
               );
         } else if (var8) {
            this.f2700
               .m0792(
                  Float.intBitsToFloat((f2702 | 474969) + ~(f2702 & 474969) + 1 ^ 1191179880),
                  ((long)f2702 | 378554L) + ~((long)f2702 & 378554L) + 1L ^ 2016527292L
               );
         } else {
            this.f2700
               .m0792(
                  Float.intBitsToFloat((f2702 | 474242) + ~(f2702 & 474242) + 1 ^ 1182791091),
                  ((long)f2702 | 510452L) + ~((long)f2702 & 510452L) + 1L ^ 2016660722L
               );
         }

         var2.method_22903();
         float var15 = Float.intBitsToFloat((f2702 | 220412) + ~(f2702 & 220412) + 1 ^ 1150769408);
         var2.method_22905(var15, var15, Float.intBitsToFloat((f2702 | 158086) + ~(f2702 & 158086) + 1 ^ 1003252858));
         var2.method_46416(
            (var7[(f2702 | 667930) + ~(f2702 & 667930) + 1 ^ 2017342694] - Float.intBitsToFloat((f2702 | 280398) + ~(f2702 & 280398) + 1 ^ 948978354)) / var15,
            (var7[(f2702 | 680619) + ~(f2702 & 680619) + 1 ^ 2017355606] - Float.intBitsToFloat((f2702 | 617006) + ~(f2702 & 617006) + 1 ^ 949841874)) / var15,
            0.0F
         );
         Color var10 = C0152.m3468();
         RenderSystem.enableBlend();
         RenderSystem.setShaderColor(
            (float)var10.getRed() / Float.intBitsToFloat((f2702 | 735809) + ~(f2702 & 735809) + 1 ^ 994066365),
            (float)var10.getGreen() / Float.intBitsToFloat((f2702 | 653557) + ~(f2702 & 653557) + 1 ^ 994245897),
            (float)var10.getBlue() / Float.intBitsToFloat((f2702 | 949600) + ~(f2702 & 949600) + 1 ^ 994408604),
            this.f2700.m0795() * C0933.m2653().m$$zKed0weSqqmjXSLKU1GIzHnlkAdiudOuUSRkoPTdeD6JMwx1fBcBqYzRgIRogRF8pOAQ6Q1ZchWvcrZU9l2QdkPJZ4MH7nJM1()
         );
         var1.method_25302(
            f2697,
            (f2702 | 726470) + ~(f2702 & 726470) + 1 ^ 2017398842,
            (f2702 | 941880) + ~(f2702 & 941880) + 1 ^ 2017090244,
            (f2702 | 7072) + ~(f2702 & 7072) + 1 ^ 2016681564,
            (f2702 | 99117) + ~(f2702 & 99117) + 1 ^ 2016773841,
            (f2702 | 200003) + ~(f2702 & 200003) + 1 ^ 2016872895,
            (f2702 | 812986) + ~(f2702 & 812986) + 1 ^ 2016961350
         );
         RenderSystem.setShaderColor(
            Float.intBitsToFloat((f2702 | 257794) + ~(f2702 & 257794) + 1 ^ 1203235582),
            Float.intBitsToFloat((f2702 | 944206) + ~(f2702 & 944206) + 1 ^ 1203400114),
            Float.intBitsToFloat((f2702 | 216773) + ~(f2702 & 216773) + 1 ^ 1203194681),
            Float.intBitsToFloat((f2702 | 175615) + ~(f2702 & 175615) + 1 ^ 1203152899)
         );
         RenderSystem.disableBlend();
         var2.method_22909();
      }

      var2.method_22909();
   }

   @Override
   public float[] m1073() {
      float[] var1 = this.m$$5A06gZj2dsph0f9cXKvj8epziI0fcqRkJo7UqoMuOreVQZNCp519kmHqqLBtI2Y6PvI4f5F9teEN3bzlthtsJA0DeNZJu8qk0.m0563();
      var1[(f2702 | 805559) + ~(f2702 & 805559) + 1 ^ 2016956235] = var1[(f2702 | 805559) + ~(f2702 & 805559) + 1 ^ 2016956235] * this.m1075();
      var1[(f2702 | 865370) + ~(f2702 & 865370) + 1 ^ 2017014183] = var1[(f2702 | 865370) + ~(f2702 & 865370) + 1 ^ 2017014183] * this.m1075();
      return var1;
   }

   public void m1074(C0601 var1) {
      this.f2701 = (boolean)((f2702 | 871590) + ~(f2702 & 871590) + 1 ^ 2017020251);
      var1.register(this.f2699);
   }

   public float m1075() {
      return this.f2699.getValue();
   }

   public boolean m1076(double var1, double var3) {
      if (!this.f2701) {
         return (boolean)((f2702 | 151366) + ~(f2702 & 151366) + 1 ^ 2016823994);
      } else {
         float[] var5 = this.m$$hvBBfcmrhPdLnUJRw7hOgoKrcTSFlOvfNvkSBeEincGfWyJcxvnT5vfx9DyKPpjKbEqygJzjflwo2YPqUwE2FkgRxcEXQ7wbD();
         float var6 = this.m$$bozWMGG3YDsfjiKSBecrFVSGu4m3Vmr92d1ZfhIfVD2UvsId4MqrMHCFTCShpOQXrtChkILvVY01QuqxS6YXIvDtS4Lghic0p()
            + Math.max(var5[(f2702 | 328388) + ~(f2702 & 328388) + 1 ^ 2016479032], Float.intBitsToFloat((f2702 | 935823) + ~(f2702 & 935823) + 1 ^ 951730803));
         float var7 = this.m$$1CqrbCjMf48cYbpAUy7HpGUjTl7uZ03IF7QJyV09HpHBaKqP6zGcVRt7Qt9Um7TwY5CH3raBxwmYccMfQHsHztudl22SQ8uKr()
            + Math.max(var5[(f2702 | 148) + ~(f2702 & 148) + 1 ^ 2016675177], Float.intBitsToFloat((f2702 | 640841) + ~(f2702 & 640841) + 1 ^ 951960245));
         return (boolean)(var1 >= (double)(var6 - Float.intBitsToFloat((f2702 | 527651) + ~(f2702 & 527651) + 1 ^ 949749983))
               && var1 <= (double)var6
               && var3 >= (double)(var7 - Float.intBitsToFloat((f2702 | 308249) + ~(f2702 & 308249) + 1 ^ 949006821))
               && var3 <= (double)var7
            ? (f2702 | 389514) + ~(f2702 & 389514) + 1 ^ 2016539767
            : (f2702 | 896645) + ~(f2702 & 896645) + 1 ^ 2017045369);
      }
   }

   public boolean m1077(int var1) {
      return (boolean)(GLFW.glfwGetMouseButton(
               m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_22683().method_4490(), var1
            )
            == ((f2702 | 837146) + ~(f2702 & 837146) + 1 ^ 2016986087)
         ? (f2702 | 20398) + ~(f2702 & 20398) + 1 ^ 2016692819
         : (f2702 | 585400) + ~(f2702 & 585400) + 1 ^ 2017258308);
   }

   static {
      long var10000 = 6964286087521631107L;
   }

   public static String _V3rjf2QUFfs3hK52KErTYYaxaSD2miexOPclQY4GOLOlFbT5WYXw3Ws0GJKxJrxYWbBSpMQn7MHYHkmDxXulOZ7qR9jzaxFL8Gi/* $VF was: 1V3rjf2QUFfs3hK52KErTYYaxaSD2miexOPclQY4GOLOlFbT5WYXw3Ws0GJKxJrxYWbBSpMQn7MHYHkmDxXulOZ7qR9jzaxFL8Gi*/(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
