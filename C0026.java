package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;

public enum C0026 implements C0196 {
   f1844("New"),
   f1845("Old") {
      @Override
      public Color[] m0665(C0513 var1) {
         return new Color[]{(Color)w.a<"Û">(var1.f1333, 174312564406604366L), (Color)w.a<"Û">(var1.f1334, 174312564406604366L)};
      }
   },
   f1846("Blocks") {
      @Override
      public Color[] m0665(C0513 var1) {
         return new Color[]{(Color)w.a<"Û">(var1.f1336, 174312564406604366L), (Color)w.a<"Û">(var1.f1337, 174312564406604366L)};
      }
   },
   f1847("Overflow") {
      @Override
      public Color[] m0665(C0513 var1) {
         return new Color[]{(Color)w.a<"Û">(var1.f1340, 174312564406604366L), (Color)w.a<"Û">(var1.f1341, 174312564406604366L)};
      }
   },
   f1848("Placeholder") {
      @Override
      public Color[] m0665(C0513 var1) {
         return null;
      }
   };

   public final String f1849;

   public C0026(String var3) {
      this.f1849 = var3;
   }

   @Override
   public String getName() {
      return this.f1849;
   }

   public Color[] m0665(C0513 var1) {
      return new Color[]{(Color)w.a<"Û">(var1.f1330, 174312564406604366L), (Color)w.a<"Û">(var1.f1331, 174312564406604366L)};
   }

   public static String uSK71HesIMvYGsGhuFe8JAQolsmKjqcg9jZqGlMMspBIAyc6RFgzzMzTUcU0fUCl3ChImzJg9FIRuSPa6YHPWAdkrLZGLYbILOS8(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
