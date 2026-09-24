package me.mioclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import net.minecraft.class_310;

public interface C0045 {
   Gson f2102 = w.a<"Û">(w.a<"Û">(w.a<"Û">(new GsonBuilder(), 199580065711664952L), 312967141602512938L), 153959172246586332L);
   class_310 f2103 = w.a<"B">(249781506980689257L);
   C0009 f2104 = new C0009() {
      public static int f2041 = w.a<"B">(5769831902834188827L, 257832362129977838L);

      {
         w.a<"Û">(this, "me.mioclient", (C0701)(var0, var1) -> {
            Object[] var10002 = new Object[(f2041 | 693196) + ~(f2041 & 693196) + 1 ^ -2022154433];
            var10002[(f2041 | 685290) + ~(f2041 & 685290) + 1 ^ -2022131685] = var1;
            int var10004 = (f2041 | 620363) + ~(f2041 & 620363) + 1 ^ -2021934149;
            Object[] var10005 = w.d();
            Method var3 = w.d(375802770950488598L);
            Object[] var6 = var10005;
            Object var5 = null;

            try {
               var10005 = (Lookup)var3.invoke(var5, var6);
            } catch (InvocationTargetException var2) {
               throw var2.getTargetException();
            }

            var10002[var10004] = var10005;
            return (Lookup)w.a<"Û">(var0, null, var10002, 115055975180753664L);
         }, 193502119659164612L);
      }

      public static String S32cadHJrsGkXW1WdJWiFvG4jdzT0W3FSc86GqVETe5EtEdP9SZoil2AJlbnP8BbqVuQ67oiSZ37gLw5ILMQZLJDdh39rnCgtRRu(
         Lookup var0, String var1, Class var2, int var3
      ) {
         return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
      }
   };
   ExecutorService f2105 = w.a<"B">(252686907388798934L);

   default boolean m2859() {
      return f2103.field_1724 == null || f2103.field_1687 == null;
   }

   static boolean m2860(Object var0) {
      return f2103.field_1724 == var0;
   }

   static boolean m2861() {
      try {
         w.a<"B">("me.mioclient.loader.Globals", false, w.a<"Û">(C0045.class, 387074074206584407L), 161873063264088950L);
         return true;
      } catch (Exception var1) {
         return false;
      }
   }
}
