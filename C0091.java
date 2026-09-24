package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;

public class C0091 implements C0045, C0997 {
   public String f3497 = "";
   public static int f3498 = w.a<"B">(1445899600324565492L, 257832362129977838L);

   public C0091() {
      w.a<"Û">(m$$LhN3aMIG1xamNF5W0O3OUPIULy6Ir9ugEHvJJzLsIpXpAVh9kz1bVeXg8pqjWXv3Kig87cb7XjRXScjx9zcM5skilv9gXmiQ8, this, 157496676404787811L);
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      w.a<"Û">(var1, "url", this.f3497, 179792809915938270L);
      return var1;
   }

   @Override
   public void fromJson(JsonElement var1) {
      this.f3497 = w.a<"Û">(w.a<"Û">(w.a<"Û">(var1, 322749330123725882L), "url", 268791691692763549L), 327479800495025542L);
   }

   @Override
   public String getConfigName() {
      return "webhook.json";
   }

   public void m1444(String var1) {
      this.f3497 = var1;
   }

   public String m1445() {
      return this.f3497;
   }

   public void m1446(String var1) {
      w.a<"Û">(
         m$$ST0lYU78VmyXastPw1lLFDyjhGsVzgyCIA2iF6clygrko2h3N2g9nQ0NE00dM9oeZ5yr22Y8aXvILtAlo6yP2lrTJIwGiJraq,
         (Runnable)() -> {
            try {
               JsonObject var1x = new JsonObject();
               w.a<"Û">(var1x, "content", var1, 179792809915938270L);
               HttpClient var2 = w.a<"B">(204835803970455568L);
               Builder var10000 = w.a<"Û">(
                  w.a<"B">(
                     w.a<"Û">(C0933.f1435, 291250801921422195L),
                     w.a<"B">(w.a<"Û">(C0045.f2102, var1x, 284023674023782997L), 367068603047410038L),
                     368112528170712539L
                  ),
                  "User-Agent",
                  "MioClient/2.0",
                  363849207965161911L
               );
               String[] var10001 = new String[(f3498 | 56507) + ~(f3498 & 56507) + 1 ^ -1569925025];
               var10001[(f3498 | 191759) + ~(f3498 & 191759) + 1 ^ -1569789463] = "Content-Type";
               var10001[(f3498 | 367039) + ~(f3498 & 367039) + 1 ^ -1570136744] = "application/json";
               HttpRequest var3 = w.a<"Û">(w.a<"Û">(var10000, var10001, 195729021234103316L), 300736675051851570L);
               w.a<"Û">(var2, var3, w.a<"B">(321132295963193403L), 323830589517684085L);
            } catch (Exception var4) {
            }
         },
         343388196825787852L
      );
   }

   public static String p2fRD9rtCRH2O40TJgZsI8CMXmHd2Gd8fr9zZQypOyCVONH4ZnLD4fItshBPBDAPHjRSRzenfPnGfQY7nnCfGTIZKkwWOkrghsNn(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
