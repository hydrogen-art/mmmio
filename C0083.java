package me.mioclient;

import java.util.concurrent.TimeUnit;

public class C0083 {
   public long f4014 = -1L;
   public static int f4015 = w.a<"B">(2301980067940535045L, 257832362129977838L);

   public boolean m1674(double var1, TimeUnit var3) {
      return w.a<"Û">(this, w.a<"B">(var1, var3, 252174541933078823L), 309642602085515378L);
   }

   public boolean m1675(long var1) {
      return (boolean)(w.a<"B">(223409559795593705L) - this.f4014 >= var1
         ? (f4015 | 584650) + ~(f4015 & 584650) + 1 ^ -1375076418
         : (f4015 | 841628) + ~(f4015 & 841628) + 1 ^ -1374829591);
   }

   public boolean m1676(long var1) {
      boolean var3 = w.a<"Û">(this, var1, 309642602085515378L);
      if (var3) {
         w.a<"Û">(this, 387780412884547639L);
      }

      return var3;
   }

   public boolean m1677(long var1, TimeUnit var3) {
      return w.a<"Û">(this, w.a<"B">((double)var1, var3, 252174541933078823L), 146861306852483676L);
   }

   public long m1678() {
      return w.a<"B">(223409559795593705L) - this.f4014;
   }

   public void reset() {
      this.f4014 = w.a<"B">(223409559795593705L);
   }

   public void setTime(long var1) {
      this.f4014 = var1;
   }

   public void m1679(double var1, TimeUnit var3) {
      this.f4014 = w.a<"B">(var1, var3, 252174541933078823L);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static long m1680(double var0, TimeUnit var2) {
      return switch (<unrepresentable>.f0077[w.a<"Û">(var2, 198135972948692312L)]) {
         case 1 -> (long)(
         var0
            * w.a<"B">(((long)f4015 | 856510L) + ~((long)f4015 & 856510L) + 1L ^ -4562254507576284105L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 705220L) + ~((long)f4015 & 705220L) + 1L ^ -4562254507576492211L, 317139102743630955L)
      );
         case 2 -> (long)(var0 * w.a<"B">(((long)f4015 | 396791L) + ~((long)f4015 & 396791L) + 1L ^ -4562254507576741762L, 317139102743630955L));
         case 3 -> (long)var0;
         case 4 -> (long)(var0 * w.a<"B">(((long)f4015 | 375133L) + ~((long)f4015 & 375133L) + 1L ^ -4652007310216614616L, 317139102743630955L));
         case 5 -> (long)(
         var0
            * w.a<"B">(((long)f4015 | 254643L) + ~((long)f4015 & 254643L) + 1L ^ -4652007310216726842L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 615205L) + ~((long)f4015 & 615205L) + 1L ^ -4633641067985995952L, 317139102743630955L)
      );
         case 6 -> (long)(
         var0
            * w.a<"B">(((long)f4015 | 924308L) + ~((long)f4015 & 924308L) + 1L ^ -4652007310215934239L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 939177L) + ~((long)f4015 & 939177L) + 1L ^ -4633641067985551140L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 31131L) + ~((long)f4015 & 31131L) + 1L ^ -4633641067986457106L, 317139102743630955L)
      );
         case 7 -> (long)(
         var0
            * w.a<"B">(((long)f4015 | 973793L) + ~((long)f4015 & 973793L) + 1L ^ -4652007310215884908L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 72896L) + ~((long)f4015 & 72896L) + 1L ^ -4633641067986548555L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 484959L) + ~((long)f4015 & 484959L) + 1L ^ -4633641067986128342L, 317139102743630955L)
            * w.a<"B">(((long)f4015 | 648799L) + ~((long)f4015 & 648799L) + 1L ^ -4627448618498330070L, 317139102743630955L)
      );
         default -> throw new MatchException(null, null);
      };
   }
}
