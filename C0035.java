package me.mioclient;

import net.minecraft.class_1297;
import net.minecraft.class_2338;

public final class C0035 {
   public final C0083 f0760 = new C0083();
   public final int f0761;
   public final class_2338 f0762;
   public float f0763;
   public float f0764;
   public int f0765;
   public static int f0766 = w.a<"B">(3423920536961042659L, 257832362129977838L);

   public C0035(int var1, class_2338 var2) {
      this.f0761 = var1;
      this.f0762 = var2;
   }

   public int getEntityId() {
      return this.f0761;
   }

   public class_1297 m2417() {
      return w.a<"Û">(w.a<"B">(249781506980689257L).field_1687, this.f0761, 336328433021103938L);
   }

   public class_2338 m2418() {
      return this.f0762;
   }

   public float m2419() {
      return this.f0763;
   }

   public float m2420(float var1) {
      return w.a<"B">(var1, this.f0764, this.f0763, 286181508181077551L);
   }

   public void m2421(float var1) {
      if (this.f0763 != var1) {
         if (var1 == 0.0F) {
            this.f0764 = 0.0F;
         } else {
            this.f0764 = this.f0763;
         }

         w.a<"Û">(this, 243427139682179240L);
         this.f0763 = w.a<"B">(var1, 0.0F, w.a<"B">((f0766 | 174858) + ~(f0766 & 174858) + 1 ^ -1255138711, 349057757755238323L), 131506059371757968L);
      }
   }

   public int m2422() {
      return this.f0765;
   }

   public void m2423(int var1) {
      this.f0765 = var1;
   }

   public void m2424() {
      w.a<"Û">(this.f0760, 387780412884547639L);
   }

   public boolean m2425() {
      if (this.f0763 == w.a<"B">((f0766 | 711205) + ~(f0766 & 711205) + 1 ^ -1254593722, 349057757755238323L)
         && w.a<"Û">(this.f0760, ((long)f0766 | 366855L) + ~((long)f0766 & 366855L) + 1L ^ -1967706188L, 309642602085515378L)) {
         return (boolean)((f0766 | 699030) + ~(f0766 & 699030) + 1 ^ -1967645708);
      } else {
         class_1297 var1 = w.a<"Û">(this, 352392838906185273L);
         if (var1 == null) {
            return (boolean)((f0766 | 108097) + ~(f0766 & 108097) + 1 ^ -1967974621);
         } else {
            return (boolean)(w.a<"Û">(w.a<"Û">(var1, 234599673457807184L), w.a<"Û">(this.f0762, 229561253177300454L), 271768320413122837L)
                  >= w.a<"B">(((long)f0766 | 595893L) + ~((long)f0766 & 595893L) + 1L ^ -4634204018531653930L, 317139102743630955L)
               ? (f0766 | 250552) + ~(f0766 & 250552) + 1 ^ -1968086054
               : (f0766 | 775567) + ~(f0766 & 775567) + 1 ^ -1967561492);
         }
      }
   }
}
