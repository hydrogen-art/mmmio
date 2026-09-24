package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_1268;

public enum C0098 implements C0196 {
   f4021("Mainhand") {
      @Override
      public class_1268 m3026() {
         return class_1268.field_5808;
      }
   },
   f4022("Offhand") {
      @Override
      public class_1268 m3026() {
         return class_1268.field_5810;
      }
   },
   f4023("Packet"),
   f4024("Vanilla");

   public final String f4025;

   public C0098(String var3) {
      this.f4025 = var3;
   }

   @Override
   public String getName() {
      return this.f4025;
   }

   public class_1268 m3026() {
      return null;
   }

   public static String L12IkE35CPKdIwczlazsvLw1ucCDxPFkElyVDLXMX8lHpOfAhrKGwhrCxekRrGsCw6vvarzL0lgUdpbxeEUjWiSYTce31qHGsjaR(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
