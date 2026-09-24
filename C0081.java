package me.mioclient;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.RichPresence;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.class_642;

public class C0081 extends C1266 {
   public final C0015<Boolean> f4731;
   public final C0015<Boolean> f4732;
   public CompletableFuture<IPCClient> f4733;
   public long f4734;
   public final C0083 f4735;
   public static int f4736 = w.a<"B">(5062553886626457008L, 257832362129977838L);

   public C0081() {
      super("Discord", "Displays mioclient.me as your discord activity.", C1045.f3178);
      w.a<"B">(this, 242859112966675773L);
      this.f4734 = w.a<"B">(223409559795593705L);
      this.f4735 = new C0083();
      w.a<"Û">(this, (boolean)((f4736 | 364527) + ~(f4736 & 364527) + 1 ^ -1678548441), 135570431627433065L);
   }

   @Override
   public void onEnable() {
      IPCClient var1 = new IPCClient(((long)f4736 | 772138L) + ~((long)f4736 & 772138L) + 1L ^ -1162833255184386638L);
      this.f4733 = w.a<"Û">(w.a<"B">((Supplier<IPCClient>)() -> {
         try {
            w.a<"Û">(var1, new DiscordBuild[(f4736 | 484297) + ~(f4736 & 484297) + 1 ^ -1678668287], 355380721766581564L);
            return var1;
         } catch (Exception var2) {
            throw new RuntimeException(var2);
         }
      }, 172733015791464554L), (Function<Throwable, IPCClient>)var1x -> {
         if (w.a<"Û">(this, 314537768572362865L)) {
            w.a<"Û">(this, 289688631157446311L);
         }

         return null;
      }, 221910043196003006L);
   }

   @Override
   public void onDisable() {
      if (w.a<"Û">(this.f4733, 370600344815678040L) && !w.a<"Û">(this.f4733, 218006967078975789L)) {
         try {
            w.a<"Û">((IPCClient)w.a<"Û">(this.f4733, 190172646069528122L), 158431848412867143L);
         } catch (Exception var2) {
            w.a<"Û">(var2, 277292852406578821L);
         }
      }
   }

   @C1027
   public void m1964(C0330 var1) {
      try {
         if (!w.a<"Û">(this.f4733, 370600344815678040L)
            || !w.a<"Û">(this.f4735, ((long)f4736 | 412032L) + ~((long)f4736 & 412032L) + 1L ^ -1678725748L, 309642602085515378L)) {
            return;
         }

         w.a<"Û">(this.f4735, 387780412884547639L);
         IPCClient var2 = (IPCClient)w.a<"Û">(this.f4733, null, 157432609030969668L);
         if (var2 == null) {
            return;
         }

         RichPresence.Builder var3 = new RichPresence.Builder();
         w.a<"Û">(var3, "https://mioclient.me/assets/dcrpc3.png", w.a<"Û">(this, 236051715937953009L), 329337009776956252L);
         w.a<"Û">(var3, this.f4734, 267950531835255349L);
         if (w.a<"Û">((Boolean)w.a<"Û">(this.f4731, 174312564406604366L), 354697271520518137L)) {
            w.a<"Û">(var3, new C1002().m2578(w.a<"Û">(C0933.f1423, 215809475655423530L)).m2593("uid \u0001"), 140787199857836835L);
         }

         if (w.a<"Û">((Boolean)w.a<"Û">(this.f4732, 174312564406604366L), 354697271520518137L)) {
            class_642 var4 = null;
            String var5 = "Not playing";
            if (!w.a<"Û">(this, 205492958615326489L)) {
               var4 = w.a<"Û">(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.field_1724.field_3944,
                  131347417028836246L
               );
               String var10000 = !w.a<"Û">(
                        m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff, 300193738958224619L
                     )
                     && var4 != null
                  ? var4.field_3761
                  : "singleplayer";
               var5 = new C1002().m2591(var10000).m2593("Playing \u0001");
            }

            w.a<"Û">(var3, var5, 326043342268849881L);
            if (var4 != null && var4.field_41861 != null) {
               w.a<"Û">(
                  var3,
                  w.a<"B">(w.a<"Û">(var5, 342985361154189862L), 147657446483717914L),
                  w.a<"Û">(var4.field_41861, 281773429917475290L),
                  w.a<"Û">(var4.field_41861, 220484825237191619L),
                  (f4736 | 676431) + ~(f4736 & 676431) + 1 ^ -1677934713,
                  247683654517891686L
               );
            }
         }

         w.a<"Û">(var2, w.a<"Û">(var3, 269348710799456144L), 218297766952359339L);
      } catch (Exception var6) {
      }
   }

   public String m1965() {
      return "Mio v2.1.7";
   }

   public static String K3qtTcJ8eGqlwEKG0M2mqGbrIF9xrbRxJ64IaJhFHBD2xZDBDwyAKQpb81nhOftMNzI2OZ6kvunq7gbPunemiu7fc5SlMFS4xKbZ(
      Lookup var0, String var1, Class var2, int var3
   ) {
      return C0095.7IgZv9bBL5GpyGTf0kFTQpZX9VWJwgZFTFXlfKJ1x9FHDv9zDA7Ntr6wDp1wDNWSCHg8DYCpducbijJx2MEnobhlOb9ksiHrPH7r(var3);
   }
}
