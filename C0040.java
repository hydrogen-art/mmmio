package me.mioclient;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;

public enum C0040 implements C0196 {
   f0101("Any"),
   f0102("WhiteList") {
      @Override
      public <T> boolean m2112(T var1, Collection<T> var2) {
         return w.a<"Û">(var2, var1, 129802938482401398L);
      }
   },
   f0103("BlackList") {
      @Override
      public <T> boolean m2112(T var1, Collection<T> var2) {
         return !w.a<"Û">(m$$3TN5W89up6ZlPBXEB2WL7bnXzuQzThgRiCedni0bGTBKCkaCWOTlnE54tQsJVloMAIXRjkgJqUcHLYmVBW9LdUtFE2v8Q2KEc, var1, var2, 257405975721056342L);
      }
   };

   public final String f0104;

   public C0040(String var3) {
      this.f0104 = var3;
   }

   @Override
   public String getName() {
      return this.f0104;
   }

   public <T> boolean m2112(T var1, Collection<T> var2) {
      return true;
   }

   public <T> boolean m2177(T var1, C0015<? extends Collection<T>> var2) {
      return w.a<"Û">(this, var1, (Collection)w.a<"Û">(var2, 174312564406604366L), 257405975721056342L);
   }

   public static String nt5uCXYKHhQ2cpaxbPdBrtsFH4UIAFNiHJetmBMWjWPuC9VUEYN88v5eChMI2J2IRH7RMS1XcXuVu5T99Ms5lfbr8et6qa5TY8cn(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
