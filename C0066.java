package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_293;
import net.minecraft.class_4588;
import net.minecraft.class_9799;
import net.minecraft.class_9801;
import net.minecraft.class_293.class_5596;

public class C0066 implements class_4588 {
   public static final boolean f1754;
   public final class_9799 f1755;
   public class_287 f1756;
   public class_5596 f1757;
   public class_293 f1758;

   public static C0066 m0745() {
      return m0746(786432);
   }

   public static C0066 m0746(int var0) {
      return f1754 ? C1359.m3804(var0) : new C0066(var0);
   }

   public C0066(int var1) {
      this.f1755 = new class_9799(var1);
   }

   public C0066 m0747(class_5596 var1, class_293 var2) {
      this.f1757 = var1;
      this.f1758 = var2;
      return this;
   }

   public class_4588 method_22912(float var1, float var2, float var3) {
      return this.m0750().method_22912(var1, var2, var3);
   }

   public class_4588 method_1336(int var1, int var2, int var3, int var4) {
      return this.m0750().method_1336(var1, var2, var3, var4);
   }

   public class_4588 method_22913(float var1, float var2) {
      return this.m0750().method_22913(var1, var2);
   }

   public class_4588 method_60796(int var1, int var2) {
      return this.m0750().method_60796(var1, var2);
   }

   public class_4588 method_22921(int var1, int var2) {
      return this.m0750().method_22921(var1, var2);
   }

   public class_4588 method_22914(float var1, float var2, float var3) {
      return this.m0750().method_22914(var1, var2, var3);
   }

   public boolean m0748() {
      return this.f1756 != null;
   }

   public class_287 m0749(class_5596 var1, class_293 var2) {
      this.f1756 = new class_287(this.f1755, var1, var2);
      return this.f1756;
   }

   public class_287 m0750() {
      if (this.f1756 == null) {
         if (this.f1757 == null || this.f1758 == null) {
            throw new IllegalArgumentException("Tried to invoke empty not caching buffer");
         }

         this.f1756 = new class_287(this.f1755, this.f1757, this.f1758);
      }

      return this.f1756;
   }

   public class_9801 m0751() {
      if (this.f1756 == null) {
         throw new IllegalArgumentException("Tried to end empty buffer");
      } else {
         class_9801 var1 = this.f1756.method_60794();
         this.f1756 = null;
         return var1;
      }
   }

   public void m0752() {
      if (this.f1756 != null) {
         m0754(this.f1756);
         this.f1756 = null;
      }
   }

   public static void m0753(C0066 var0) {
      if (var0.m0748()) {
         m0754(var0.f1756);
         var0.f1756 = null;
      }
   }

   public static void m0754(class_287 var0) {
      if (var0 != null) {
         class_9801 var1 = var0.method_60794();
         if (var1 != null) {
            class_286.method_43433(var1);
         }
      }
   }

   static {
      boolean var0;
      try {
         Class.forName("net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter");
         var0 = true;
      } catch (ClassNotFoundException var2) {
         var0 = false;
      }

      f1754 = var0;
   }

   public static String wC82cGANDvOI9Kvd3FqZ9S5XiiB5yRVdssVDw548AzvG7s6Tolc1c2hM89G1Jq5HZp6uoswZ1TYWxgL1IuLVhz4zQzq429fFL3dd(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
