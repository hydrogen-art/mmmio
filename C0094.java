package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_7833;
import net.minecraft.class_898;
import net.minecraft.class_293.class_5596;
import net.minecraft.class_4587.class_4665;
import net.minecraft.class_5253.class_5254;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;

public class C0094 implements C0045 {
   public static final C0094 f4640 = new C0094();
   public static float f4641;
   public static class_4587 f4642;

   public static float m1872() {
      return f4641;
   }

   public static void m1873(float var0) {
      f4641 = var0;
   }

   public static class_4587 m1874() {
      return f4642;
   }

   public static void m1875(class_4587 var0) {
      f4642 = var0;
   }

   public void m1876(class_4587 var1, float var2, float var3, float var4, float var5, Color var6) {
      if (var4 < var2) {
         float var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if (var5 < var3) {
         float var8 = var3;
         var3 = var5;
         var5 = var8;
      }

      this.m1878(var1, var2, var4, var3, var6);
      this.m1879(var1, var4, var3, var5, var6);
      this.m1878(var1, var2, var4, var5, var6);
      this.m1879(var1, var2, var3, var5, var6);
   }

   public void m1877(class_4587 var1, float var2, float var3, float var4, float var5, Color var6, float var7) {
      this.m1880(var1, var2, var4, var3, var6, var7);
      this.m1881(var1, var4, var3, var5, var6, var7);
      this.m1880(var1, var2, var4, var5, var6, var7);
      this.m1881(var1, var2, var3, var5, var6, var7);
   }

   public void m1878(class_4587 var1, float var2, float var3, float var4, Color var5) {
      if (var3 < var2) {
         float var6 = var2;
         var2 = var3;
         var3 = var6;
      }

      this.m1883(var1, var2, var4, var3 + 1.0F, var4 + 1.0F, var5);
   }

   public void m1879(class_4587 var1, float var2, float var3, float var4, Color var5) {
      if (var4 < var3) {
         float var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      this.m1883(var1, var2, var3 + 1.0F, var2 + 1.0F, var4, var5);
   }

   public void m1880(class_4587 var1, float var2, float var3, float var4, Color var5, float var6) {
      if (var3 < var2) {
         float var7 = var2;
         var2 = var3;
         var3 = var7;
      }

      this.m1883(var1, var2, var4, var3 + var6, var4 + var6, var5);
   }

   public void m1881(class_4587 var1, float var2, float var3, float var4, Color var5, float var6) {
      if (var4 < var3) {
         float var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      this.m1883(var1, var2, var3 + var6, var2 + var6, var4, var5);
   }

   public void m1882(class_4587 var1, float var2, float var3, float var4, float var5, int var6) {
      if (var2 < var4) {
         float var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if (var3 < var5) {
         float var13 = var3;
         var3 = var5;
         var5 = var13;
      }

      float var8 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var6 & 0xFF) / 255.0F;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(class_757::method_34540);
      class_287 var12 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      var12.method_22918(var1.method_23760().method_23761(), var2, var5, 0.0F).method_22915(var9, var10, var11, var8);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, 0.0F).method_22915(var9, var10, var11, var8);
      var12.method_22918(var1.method_23760().method_23761(), var4, var3, 0.0F).method_22915(var9, var10, var11, var8);
      var12.method_22918(var1.method_23760().method_23761(), var2, var3, 0.0F).method_22915(var9, var10, var11, var8);
      class_286.method_43433(var12.method_60800());
      RenderSystem.disableBlend();
   }

   public void m1883(class_4587 var1, float var2, float var3, float var4, float var5, Color var6) {
      this.m1882(var1, var2, var3, var4, var5, var6.hashCode());
   }

   public void m1884(class_4587 var1, int var2, int var3, int var4, int var5, Color var6, Color var7) {
      RenderSystem.enableBlend();
      RenderSystem.setShader(class_757::method_34540);
      class_289 var8 = class_289.method_1348();
      class_287 var9 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      this.m1885(var1.method_23760().method_23761(), var9, var2, var3, var4, var5, 0, var6.hashCode(), var7.hashCode());
      class_286.method_43433(var9.method_60800());
      RenderSystem.disableBlend();
   }

   public void m1885(Matrix4f var1, class_4588 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      float var10 = (float)class_5254.method_27762(var8) / 255.0F;
      float var11 = (float)class_5254.method_27765(var8) / 255.0F;
      float var12 = (float)class_5254.method_27766(var8) / 255.0F;
      float var13 = (float)class_5254.method_27767(var8) / 255.0F;
      float var14 = (float)class_5254.method_27762(var9) / 255.0F;
      float var15 = (float)class_5254.method_27765(var9) / 255.0F;
      float var16 = (float)class_5254.method_27766(var9) / 255.0F;
      float var17 = (float)class_5254.method_27767(var9) / 255.0F;
      var2.method_22918(var1, (float)var3, (float)var4, (float)var7).method_22915(var11, var12, var13, var10);
      var2.method_22918(var1, (float)var3, (float)var6, (float)var7).method_22915(var15, var16, var17, var14);
      var2.method_22918(var1, (float)var5, (float)var6, (float)var7).method_22915(var15, var16, var17, var14);
      var2.method_22918(var1, (float)var5, (float)var4, (float)var7).method_22915(var11, var12, var13, var10);
   }

   public int m1886(String var1) {
      return m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1772.method_1727(var1);
   }

   public int m1887(class_2561 var1) {
      return m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1772.method_27525(var1);
   }

   public double m1888() {
      return (double)m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_22683().method_4486();
   }

   public double m1889() {
      return (double)m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_22683().method_4502();
   }

   public void m1890(class_4587 var1, class_238 var2, Color var3) {
      float var4 = (float)(
         var2.field_1323
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var5 = (float)(
         var2.field_1322
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var6 = (float)(
         var2.field_1321
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var7 = (float)(
         var2.field_1320
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var8 = (float)(
         var2.field_1325
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var9 = (float)(
         var2.field_1324
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      this.m1900();
      RenderSystem.setShader(class_757::method_34540);
      class_287 var10 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var7, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var9).method_39415(var3.getRGB());
      var10.method_22918(var1.method_23760().method_23761(), var4, var8, var6).method_39415(var3.getRGB());
      class_286.method_43433(var10.method_60800());
      this.m1902();
   }

   public void m1891(class_4587 var1, class_238 var2, Color var3) {
      float var4 = (float)(
         var2.field_1323
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var5 = (float)(
         var2.field_1322
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var6 = (float)(
         var2.field_1321
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var7 = (float)(
         var2.field_1320
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var8 = (float)(
         var2.field_1325
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var9 = (float)(
         var2.field_1324
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      int var10 = var3.hashCode();
      int var11 = C0152.m3475(var3, 0);
      this.m1900();
      RenderSystem.setShader(class_757::method_34540);
      class_287 var12 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var8, var6).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var7, var8, var6).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var8, var6).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var7, var8, var9).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var7, var8, var9).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var4, var8, var9).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var6).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var5, var9).method_39415(var10);
      var12.method_22918(var1.method_23760().method_23761(), var4, var8, var9).method_39415(var11);
      var12.method_22918(var1.method_23760().method_23761(), var4, var8, var6).method_39415(var11);
      class_286.method_43433(var12.method_60800());
      this.m1902();
   }

   public void m1892(class_4587 var1, class_243 var2, Color var3) {
      this.m1890(var1, class_238.method_29968(var2), var3);
   }

   public void m1893(class_4587 var1, class_2338 var2, Color var3) {
      this.m1890(var1, new class_238(var2), var3);
   }

   public void m1894(class_4587 var1, class_238 var2, Color var3, double var4) {
      float var6 = (float)(
         var2.field_1323
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var7 = (float)(
         var2.field_1322
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var8 = (float)(
         var2.field_1321
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var9 = (float)(
         var2.field_1320
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var10 = (float)(
         var2.field_1325
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var11 = (float)(
         var2.field_1324
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      class_289 var12 = class_289.method_1348();
      this.m1900();
      RenderSystem.lineWidth((float)var4);
      RenderSystem.setShader(class_757::method_34535);
      GL20.glEnable(2848);
      GL20.glHint(3154, 4354);
      RenderSystem.defaultBlendFunc();
      class_287 var13 = class_289.method_1348().method_60827(class_5596.field_27377, class_290.field_29337);
      class_761.method_22980(
         var1,
         var13,
         (double)var6,
         (double)var7,
         (double)var8,
         (double)var9,
         (double)var10,
         (double)var11,
         (float)var3.getRed() / 255.0F,
         (float)var3.getGreen() / 255.0F,
         (float)var3.getBlue() / 255.0F,
         (float)var3.getAlpha() / 255.0F
      );
      class_286.method_43433(var13.method_60800());
      GL20.glDisable(2848);
      this.m1902();
   }

   public void m1895(class_4587 var1, class_243 var2, Color var3, double var4) {
      this.m1894(var1, class_238.method_29968(var2), var3, var4);
   }

   public void m1896(class_4587 var1, class_2338 var2, Color var3, double var4) {
      this.m1894(var1, new class_238(var2), var3, var4);
   }

   public void m1897(class_4587 var1, class_243 var2, class_243 var3, Color var4, float var5) {
      float var6 = (float)(
         var2.field_1352
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var7 = (float)(
         var2.field_1351
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var8 = (float)(
         var2.field_1350
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var9 = (float)(
         var3.field_1352
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var10 = (float)(
         var3.field_1351
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var11 = (float)(
         var3.field_1350
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      class_4665 var12 = var1.method_23760();
      this.m1900();
      RenderSystem.lineWidth(var5);
      RenderSystem.setShader(class_757::method_34535);
      GL20.glEnable(2848);
      GL20.glHint(3154, 4354);
      RenderSystem.defaultBlendFunc();
      class_287 var13 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      var13.method_22918(var1.method_23760().method_23761(), var6, var7, var8).method_39415(var4.getRGB()).method_60831(var12, var5, 0.0F, 0.0F);
      var13.method_22918(var1.method_23760().method_23761(), var9, var10, var11).method_39415(var4.getRGB()).method_60831(var12, var5, 0.0F, 0.0F);
      var13.method_22918(var1.method_23760().method_23761(), var6, var7, var8).method_39415(var4.getRGB()).method_60831(var12, 0.0F, var5, 0.0F);
      var13.method_22918(var1.method_23760().method_23761(), var9, var10, var11).method_39415(var4.getRGB()).method_60831(var12, 0.0F, var5, 0.0F);
      var13.method_22918(var1.method_23760().method_23761(), var6, var7, var8).method_39415(var4.getRGB()).method_60831(var12, 0.0F, 0.0F, var5);
      var13.method_22918(var1.method_23760().method_23761(), var9, var10, var11).method_39415(var4.getRGB()).method_60831(var12, 0.0F, 0.0F, var5);
      class_286.method_43433(var13.method_60800());
      GL20.glDisable(2848);
      this.m1902();
   }

   public void m1898(class_4587 var1, class_243 var2, class_243 var3, Color var4) {
      float var5 = (float)(
         var2.field_1352
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var6 = (float)(
         var2.field_1351
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var7 = (float)(
         var2.field_1350
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var8 = (float)(
         var3.field_1352
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var9 = (float)(
         var3.field_1351
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var10 = (float)(
         var3.field_1350
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      RenderSystem.setShader(class_757::method_34540);
      f4640.m1900();
      class_287 var11 = class_289.method_1348().method_60827(class_5596.field_29344, class_290.field_1576);
      var11.method_22918(var1.method_23760().method_23761(), var5, var6, var7).method_39415(var4.hashCode());
      var11.method_22918(var1.method_23760().method_23761(), var8, var9, var10).method_39415(var4.hashCode());
      class_286.method_43433(var11.method_60800());
      f4640.m1902();
   }

   public void m1899() {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
   }

   public void m1900() {
      this.m1899();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
   }

   public void m1901() {
      RenderSystem.disableBlend();
   }

   public void m1902() {
      this.m1901();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
   }

   public void m1903(Runnable var1) {
      if (C0879.f3743.f3747.getValue() != C0880.f1492) {
         int var2 = C0879.f3743.f3747.getValue().m0623();
         C0439.m2282((var2 & var2 - 1) == 0 ? var2 : 2, var1);
      } else {
         var1.run();
      }
   }

   public void m1904(class_4587 var1, class_243 var2, float var3, float var4, float var5, float var6, double var7, Color var9) {
      var1.method_22903();
      m1914(var1, var2);
      RenderSystem.defaultBlendFunc();
      var1.method_46416(var3, var4, 0.0F);
      var1.method_22907(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561().method_24197());
      var1.method_22905(0.025F * (float)var7, -0.025F * (float)var7, (float)(0.025F * var7));
      int var10 = (int)(var5 / 2.0F);
      RenderSystem.disableDepthTest();
      this.m1883(var1, (float)(-var10), 0.0F, (float)((int)(var5 - (float)var10)), (float)((int)var6), var9);
      RenderSystem.enableDepthTest();
      var1.method_22909();
   }

   public void m1905(class_332 var1, class_243 var2, float var3, float var4, double var5, Color var7, class_2960 var8) {
      class_4587 var9 = var1.method_51448();
      var9.method_22903();
      m1914(var9, var2);
      class_4184 var10 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773.method_19418();
      var9.method_22907(class_7833.field_40716.rotationDegrees(-var10.method_19330()));
      var9.method_22907(class_7833.field_40714.rotationDegrees(var10.method_19329()));
      RenderSystem.defaultBlendFunc();
      var9.method_22905(0.025F * (float)var5, -0.025F * (float)var5, 1.0F);
      int var11 = (int)(var3 / 2.0F);
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.setShader(class_757::method_34543);
      RenderSystem.setShaderColor((float)var7.getRed() / 255.0F, (float)var7.getGreen() / 255.0F, (float)var7.getBlue() / 255.0F, 1.0F);
      var1.method_25302(var8, -var11, -var11, 0, 0, (int)var3, (int)var4);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableDepthTest();
      var9.method_22909();
   }

   public void m1906(class_4587 var1, class_243 var2, float var3, float var4, float var5, float var6, double var7, Color var9) {
      var1.method_22903();
      m1914(var1, var2);
      class_4184 var10 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773.method_19418();
      var1.method_22907(class_7833.field_40716.rotationDegrees(-var10.method_19330()));
      var1.method_22907(class_7833.field_40714.rotationDegrees(var10.method_19329()));
      RenderSystem.defaultBlendFunc();
      var1.method_46416(var3, var4, 0.0F);
      var1.method_22905(0.025F * (float)var7, -0.025F * (float)var7, 1.0F);
      int var11 = (int)(var5 / 2.0F);
      RenderSystem.disableDepthTest();
      this.m1876(var1, (float)(-var11), 0.0F, (float)((int)(var5 - (float)var11)), (float)((int)var6), var9);
      RenderSystem.enableDepthTest();
      var1.method_22909();
   }

   public void m1907(class_332 var1, String var2, class_243 var3, float var4, float var5, double var6, Color var8, boolean var9) {
      this.m1908(var1, var2, var3, var4, var5, -C0498.f4738.m3896(var2) / 2.0F, 0.0F, var6, var8, var9);
   }

   public void m1908(class_332 var1, String var2, class_243 var3, float var4, float var5, float var6, float var7, double var8, Color var10, boolean var11) {
      var1.method_51448().method_22903();
      m1914(var1.method_51448(), var3);
      RenderSystem.defaultBlendFunc();
      var1.method_51448().method_46416(var4, var5, 0.0F);
      var1.method_51448()
         .method_22907(m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561().method_24197());
      var1.method_51448().method_22905(0.025F * (float)var8, -0.025F * (float)var8, (float)(0.025F * var8));
      if (var11) {
         C0498.f4738.m3889(var1, var2, var6, var7, var10);
      } else {
         C0498.f4738.m3887(var1, var2, var6, var7, var10);
      }

      var1.method_51448().method_22909();
   }

   public void m1909(class_4587 var1, class_287 var2, class_243 var3, class_243 var4, int var5, int var6) {
      float var7 = (float)(
         var3.method_10216()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var8 = (float)(
         var3.method_10214()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var9 = (float)(
         var3.method_10215()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var10 = (float)(
         var4.method_10216()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var11 = (float)(
         var4.method_10214()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var12 = (float)(
         var4.method_10215()
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      var2.method_22918(var1.method_23760().method_23761(), var7, var8, var9)
         .method_39415(var5)
         .method_60831(var1.method_23760(), var10 - var7, var11 - var8, var12 - var9);
      var2.method_22918(var1.method_23760().method_23761(), var10, var11, var12)
         .method_39415(var6)
         .method_60831(var1.method_23760(), var10 - var7, var11 - var8, var12 - var9);
   }

   public void m1910(class_4587 var1, class_287 var2, class_238 var3, int var4) {
      float var5 = (float)(
         var3.field_1323
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var6 = (float)(
         var3.field_1322
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10214()
      );
      float var7 = (float)(
         var3.field_1321
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      float var8 = (float)(
         var3.field_1320
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10216()
      );
      float var9 = (float)(
         var3.field_1324
            - m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561()
               .field_4686
               .method_19326()
               .method_10215()
      );
      Matrix4f var10 = var1.method_23760().method_23761();
      var2.method_22918(var10, var5, var6, var7).method_39415(var4);
      var2.method_22918(var10, var8, var6, var7).method_39415(var4);
      var2.method_22918(var10, var8, var6, var9).method_39415(var4);
      var2.method_22918(var10, var5, var6, var9).method_39415(var4);
      var2.method_22918(var10, var5, var6, var7).method_39415(var4);
   }

   public void m1911(class_1297 var1, float var2, class_4587 var3, class_4597 var4) {
      class_898 var5 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_1561();
      class_243 var6 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773
         .method_19418()
         .method_19326();
      double var7 = class_3532.method_16436((double)var2, var1.field_6038, var1.method_23317());
      double var9 = class_3532.method_16436((double)var2, var1.field_5971, var1.method_23318());
      double var11 = class_3532.method_16436((double)var2, var1.field_5989, var1.method_23321());
      float var13 = class_3532.method_16439(var2, var1.field_5982, var1.method_36454());
      var5.method_3954(var1, var7 - var6.field_1352, var9 - var6.field_1351, var11 - var6.field_1350, var13, var2, var3, var4, var5.method_23839(var1, var2));
   }

   public void m1912(Matrix4f var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      float[] var10 = new float[]{(float)(var6 >> 16 & 0xFF) / 255.0F, (float)(var6 >> 8 & 0xFF) / 255.0F, (float)(var6 & 0xFF) / 255.0F};
      float[] var11 = new float[]{(float)(var7 >> 16 & 0xFF) / 255.0F, (float)(var7 >> 8 & 0xFF) / 255.0F, (float)(var7 & 0xFF) / 255.0F};
      float[] var12 = new float[]{(float)(var8 >> 16 & 0xFF) / 255.0F, (float)(var8 >> 8 & 0xFF) / 255.0F, (float)(var8 & 0xFF) / 255.0F};
      float[] var13 = new float[]{(float)(var9 >> 16 & 0xFF) / 255.0F, (float)(var9 >> 8 & 0xFF) / 255.0F, (float)(var9 & 0xFF) / 255.0F};
      this.m1899();
      RenderSystem.setShader(class_757::method_34540);
      class_287 var14 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
      var14.method_22918(var1, var2, var3 + var5, 0.0F).method_22915(var13[0], var13[1], var13[2], 1.0F);
      var14.method_22918(var1, var2 + var4, var3 + var5, 0.0F).method_22915(var12[0], var12[1], var12[2], 1.0F);
      var14.method_22918(var1, var2 + var4, var3, 0.0F).method_22915(var11[0], var11[1], var11[2], 1.0F);
      var14.method_22918(var1, var2, var3, 0.0F).method_22915(var10[0], var10[1], var10[2], 1.0F);
      class_286.method_43433(var14.method_60800());
      this.m1901();
   }

   public void m1913(Matrix4f var1, float var2, float var3, float var4, float var5, int... var6) {
      if (var6.length >= 2) {
         float[][] var7 = new float[var6.length][4];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = new float[]{
               (float)(var6[var8] >> 24 & 0xFF) / 255.0F,
               (float)(var6[var8] >> 16 & 0xFF) / 255.0F,
               (float)(var6[var8] >> 8 & 0xFF) / 255.0F,
               (float)(var6[var8] & 0xFF) / 255.0F
            };
         }

         this.m1899();
         RenderSystem.setShader(class_757::method_34540);
         float var12 = var4 / (float)var6.length;

         for (int var9 = 1; var9 < var6.length; var9++) {
            class_289 var10 = class_289.method_1348();
            class_287 var11 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1576);
            var11.method_22918(var1, var2 + (var9 == var6.length - 1 ? var4 : var12 * (float)var9), var3, 0.0F)
               .method_22915(var7[var9][1], var7[var9][2], var7[var9][3], var7[var9][0]);
            var11.method_22918(var1, var2 + var12 * (float)(var9 - 1), var3, 0.0F)
               .method_22915(var7[var9 - 1][1], var7[var9 - 1][2], var7[var9 - 1][3], var7[var9 - 1][0]);
            var11.method_22918(var1, var2 + var12 * (float)(var9 - 1), var3 + var5, 0.0F)
               .method_22915(var7[var9 - 1][1], var7[var9 - 1][2], var7[var9 - 1][3], var7[var9 - 1][0]);
            var11.method_22918(var1, var2 + (var9 == var6.length - 1 ? var4 : var12 * (float)var9), var3 + var5, 0.0F)
               .method_22915(var7[var9][1], var7[var9][2], var7[var9][3], var7[var9][0]);
            class_286.method_43433(var11.method_60800());
         }

         this.m1901();
      }
   }

   public static void m1914(class_4587 var0, class_243 var1) {
      class_243 var2 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773
         .method_19418()
         .method_19326();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      var0.method_22904(var3, var5, var7);
   }

   public static void m1915(class_4587 var0) {
      class_4184 var1 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1773.method_19418();
      var0.method_22907(class_7833.field_40714.rotationDegrees(var1.method_19329()));
      var0.method_22907(class_7833.field_40716.rotationDegrees(var1.method_19330() + 180.0F));
   }
}
