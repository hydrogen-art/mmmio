package me.mioclient;

public class C0072 {
   public float f1870;
   public float f1871;
   public long startTime;
   public long f1872;
   public static int f1873 = w.a<"B">(3554208130785664865L, 257832362129977838L);

   public void m0792(float var1, long var2) {
      if (this.f1871 != var1) {
         this.f1870 = w.a<"Û">(this, 130550643917971814L);
         this.f1871 = var1;
         this.startTime = w.a<"B">(223409559795593705L);
         this.f1872 = var2;
      }
   }

   public void m0793(boolean var1, long var2) {
      w.a<"Û">(this, var1 ? w.a<"B">((f1873 | 555058) + ~(f1873 & 555058) + 1 ^ 972013013, 349057757755238323L) : 0.0F, var2, 299144451833946012L);
   }

   public void m0794(float var1) {
      w.a<"Û">(this, var1, 0L, 299144451833946012L);
   }

   public float m0795() {
      return (
               w.a<"B">((f1873 | 583387) + ~(f1873 & 583387) + 1 ^ 971973436, 349057757755238323L)
                  - w.a<"B">(
                     (float)(this.startTime + this.f1872 - w.a<"B">(223409559795593705L)) / (float)w.a<"B">(this.f1872, 1L, 329552778111668452L),
                     0.0F,
                     w.a<"B">((f1873 | 435308) + ~(f1873 & 435308) + 1 ^ 971071883, 349057757755238323L),
                     131506059371757968L
                  )
            )
            * (this.f1871 - this.f1870)
         + this.f1870;
   }
}
