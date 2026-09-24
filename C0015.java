package me.mioclient;

import java.util.Objects;
import java.util.function.Predicate;

public abstract class C0015<T> extends C0502 implements C0617<T>, C0997 {
   public T f3314;
   public boolean f3315;
   public boolean f3316;
   public boolean f3317;
   public boolean f3318;
   public Predicate<T> f3319;
   public String f3320 = w.a<"Û">(this, 248211090350577353L);
   public String f3321 = "";
   public Runnable f3322;
   public T f3323;
   public T f3324;
   public T f3325;
   public T f3326;
   public T f3327;
   public boolean f3328;
   public boolean f3329;
   public C0508 f3330;
   public static int f3331 = w.a<"B">(7682831543674908056L, 257832362129977838L);

   public C0015(String var1, T var2, T var3, T var4, Predicate<T> var5) {
      super(var1);
      this.f3314 = (T)var2;
      this.f3325 = (T)var3;
      this.f3326 = (T)var4;
      this.f3319 = var5;
      this.f3323 = (T)var2;
      this.f3324 = (T)var2;
      this.f3327 = (T)var2;
      this.f3328 = (boolean)((f3331 | 407817) + ~(f3331 & 407817) + 1 ^ -197626942);
   }

   public C0015(String var1, T var2, Predicate<T> var3) {
      super(var1);
      this.f3314 = (T)var2;
      this.f3319 = var3;
      this.f3323 = (T)var2;
      this.f3324 = (T)var2;
      this.f3327 = (T)var2;
   }

   public C0015(String var1, T var2, T var3, T var4) {
      super(var1);
      this.f3314 = (T)var2;
      this.f3325 = (T)var3;
      this.f3326 = (T)var4;
      this.f3323 = (T)var2;
      this.f3324 = (T)var2;
      this.f3327 = (T)var2;
      this.f3328 = (boolean)((f3331 | 515980) + ~(f3331 & 515980) + 1 ^ -197552825);
   }

   public C0015(String var1, T var2) {
      super(var1);
      this.f3314 = (T)var2;
      this.f3323 = (T)var2;
      this.f3324 = (T)var2;
      this.f3327 = (T)var2;
   }

   @Override
   public T getValue() {
      return this.f3323;
   }

   public T m3385() {
      return this.f3324;
   }

   public void m3386(T var1) {
      this.f3324 = (T)var1;
   }

   public T m3387() {
      return this.f3314;
   }

   public T m3388() {
      return this.f3325;
   }

   public T m3389() {
      return this.f3326;
   }

   public boolean m3390() {
      return w.a<"Û">(this, 282635387798544717L).equals(w.a<"Û">(this, 174312564406604366L));
   }

   public boolean m3391() {
      return w.a<"Û">(this, 356267007715237645L).equals(w.a<"Û">(this, 174312564406604366L));
   }

   @Override
   public String getConfigName() {
      return this.f3320;
   }

   public void m3392(String var1) {
      this.f3320 = var1;
   }

   public String m3393() {
      return w.a<"B">((Enum)this.f3324, 359764719705144201L);
   }

   public String m3394() {
      return this.f3321;
   }

   public <T> String m3395(T var1) {
      return w.a<"Û">(var1.getClass(), 174412189000224787L);
   }

   public void reset() {
      w.a<"Û">(this, this.f3314, 277551887451345681L);
   }

   public abstract void m0645(String var1);

   public void m2603(T var1) {
      w.a<"Û">(this, var1, 237520400103599167L);
      if (this.f3328) {
         if (w.a<"Û">((Number)this.f3325, 164830166794491443L) > w.a<"Û">((Number)var1, 164830166794491443L)) {
            w.a<"Û">(this, this.f3325, 237520400103599167L);
         }

         if (w.a<"Û">((Number)this.f3326, 164830166794491443L) < w.a<"Û">((Number)var1, 164830166794491443L)) {
            w.a<"Û">(this, this.f3326, 237520400103599167L);
         }
      }

      this.f3323 = this.f3324;
      if (this.f3323 != this.f3327) {
         w.a<"Û">(this, 337912706739466282L);
      }

      this.f3327 = this.f3323;
   }

   public void m3396(T var1) {
      this.f3314 = (T)var1;
   }

   public T m3397() {
      return this.f3327;
   }

   public C0015<T> m3398() {
      this.f3316 = (boolean)((f3331 | 821782) + ~(f3331 & 821782) + 1 ^ -198000419);
      return this;
   }

   public C0015<T> m3399() {
      this.f3318 = (boolean)((f3331 | 765555) + ~(f3331 & 765555) + 1 ^ -197794632);
      w.a<"Û">(this, 265590331628451000L);
      return this;
   }

   public final C0015<T> m3400(String var1, C0508 var2) {
      this.f3321 = var1;
      this.f3330 = var2;
      return this;
   }

   public void m3401(Runnable var1) {
      this.f3322 = var1;
   }

   public void m3402() {
      if (this.f3322 != null) {
         try {
            w.a<"Û">(this.f3322, 324159666149362285L);
         } catch (Throwable var2) {
         }
      }
   }

   public C0015<T> m3403() {
      this.f3317 = (boolean)((f3331 | 222331) + ~(f3331 & 222331) + 1 ^ -197316944);
      return this;
   }

   @SafeVarargs
   public final C0015<T> m3404(C0015<Boolean>... var1) {
      w.a<"Û">(
         this,
         (Predicate<Object>)var1x -> {
            C0015[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = (f3331 | 15497) + ~(f3331 & 15497) + 1 ^ -197233085; var4 < var3; var4++) {
               C0015 var5 = var2[var4];
               int var6 = !var5.f3318 && !var5.f3316
                  ? (f3331 | 857537) + ~(f3331 & 857537) + 1 ^ -197959925
                  : (f3331 | 500479) + ~(f3331 & 500479) + 1 ^ -197531596;
               if (var6 != 0 ? !w.a<"Û">(var5, 254992554122318132L) : !w.a<"Û">((Boolean)w.a<"Û">(var5, 174312564406604366L), 354697271520518137L)) {
                  return (boolean)((f3331 | 67638) + ~(f3331 & 67638) + 1 ^ -197180676);
               }
            }

            return (boolean)((f3331 | 456383) + ~(f3331 & 456383) + 1 ^ -197608332);
         },
         235935633196277017L
      );
      return this;
   }

   public void m3405(Predicate<T> var1) {
      if (this.f3319 == null) {
         this.f3319 = var1;
      } else {
         this.f3319 = w.a<"Û">(this.f3319, var1, 285253071685891862L);
      }
   }

   public void m3406() {
      w.a<"Û">(this, (Predicate<Object>)var0 -> w.a<"Û">(C0933.f1444, 295997551300011996L), 235935633196277017L);
   }

   public boolean m3407() {
      return this.f3323 instanceof Number;
   }

   public boolean m3408() {
      return this.f3323 instanceof Enum;
   }

   public boolean m3409() {
      return this.f3323 instanceof String;
   }

   public boolean m3410() {
      return (boolean)(w.a<"Û">(this, 332127138152154352L) && !w.a<"Û">(this.f3321, 226515538076917205L) && w.a<"Û">(this.f3330, this, 187918951222481465L)
         ? (f3331 | 664056) + ~(f3331 & 664056) + 1 ^ -197891277
         : (f3331 | 912307) + ~(f3331 & 912307) + 1 ^ -197942919);
   }

   public boolean m3411() {
      return (boolean)(this.f3319 == null
         ? (f3331 | 463090) + ~(f3331 & 463090) + 1 ^ -197567943
         : w.a<"Û">(this.f3319, w.a<"Û">(this, 174312564406604366L), 258912813308304151L));
   }

   public boolean m3412() {
      return (boolean)(this.f3315 && this.f3316 ? (f3331 | 955255) + ~(f3331 & 955255) + 1 ^ -198125124 : (f3331 | 538496) + ~(f3331 & 538496) + 1 ^ -197755574);
   }

   public boolean m3413() {
      return this.f3328;
   }

   public void m3414() {
      this.f3328 = (boolean)((f3331 | 500844) + ~(f3331 & 500844) + 1 ^ -197529946);
   }

   public boolean m3415() {
      return this.f3318;
   }

   public void m3416(boolean var1) {
      this.f3329 = var1;
   }

   public boolean m3417() {
      return this.f3329;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return (boolean)((f3331 | 605712) + ~(f3331 & 605712) + 1 ^ -197692197);
      } else if (var1 == null || this.getClass() != var1.getClass()) {
         return (boolean)((f3331 | 661736) + ~(f3331 & 661736) + 1 ^ -197897694);
      } else if (!super.equals(var1)) {
         return (boolean)((f3331 | 547179) + ~(f3331 & 547179) + 1 ^ -197782623);
      } else {
         C0015 var2 = (C0015)var1;
         return Objects.equals(this.f3320, var2.f3320);
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[(f3331 | 733911) + ~(f3331 & 733911) + 1 ^ -197822433];
      var10000[(f3331 | 916479) + ~(f3331 & 916479) + 1 ^ -197938891] = w.a<"B">(super.hashCode(), 367942141483020029L);
      var10000[(f3331 | 342880) + ~(f3331 & 342880) + 1 ^ -197430869] = this.f3320;
      return w.a<"B">(var10000, 292132947184505832L);
   }
}
