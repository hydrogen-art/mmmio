package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles.Lookup;

public enum C0076 implements C0196, C0386 {
   f1143("Both") {
      public Color[] m2158(C0304 var1) {
         return new Color[]{(Color)w.a<"Û">(var1.f2607, 174312564406604366L), (Color)w.a<"Û">(var1.f2606, 174312564406604366L)};
      }
   },
   f1144("Fill") {
      public Color[] m2159(C0304 var1) {
         return new Color[]{
            m$$z037XtSxn4njjnr9EUkVypAZo6Lc08mWMQWloVGeviVTwlPIuvfHV7G7KqkxwNrNKlHRsY2I494swuzvqLYNmF9rjr3Aw3oUE,
            (Color)w.a<"Û">(var1.f2606, 174312564406604366L)
         };
      }
   },
   f1145("Line") {
      public Color[] m2160(C0304 var1) {
         return new Color[]{
            (Color)w.a<"Û">(var1.f2607, 174312564406604366L),
            m$$z037XtSxn4njjnr9EUkVypAZo6Lc08mWMQWloVGeviVTwlPIuvfHV7G7KqkxwNrNKlHRsY2I494swuzvqLYNmF9rjr3Aw3oUE
         };
      }
   };

   public final String f1146;

   public C0076(String var3) {
      this.f1146 = var3;
   }

   @Override
   public String getName() {
      return this.f1146;
   }

   public static String ai3EPPnEqAHY8nNao4depJnPQh6iep3hrZXfq3ghZEbHtyaFPv0VlPr6hFzci0lornvEXhUW5dR284L38symL6zd2rIwHArvSFkW(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
