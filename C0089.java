package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.LinkedList;
import org.joml.Vector4i;

public class C0089 implements C0045 {
   public static final LinkedList<Vector4i> f2614 = new LinkedList<>();

   public static void m1009(int var0, int var1, int var2, int var3) {
      double var4 = m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_22683().method_4495();
      Vector4i var6 = new Vector4i(
         (int)((double)var0 * var4),
         (int)(
            (double)(
                  m$$Ui76c5BZRSBpPm0DfeVTRlI7WOQRBMv4Y8TvsOKW24HodABbko9fwnPvSiOuXrlYsaF3dKAbJpJAVbaSAbJty0rklFwmhBjff.method_22683().method_4502()
                     - (var1 + var3)
               )
               * var4
         ),
         (int)((double)var2 * var4),
         (int)((double)var3 * var4)
      );
      RenderSystem.enableScissor(var6.x, var6.y, var6.z, var6.w);
      f2614.addLast(var6);
   }

   public static void m1010() {
      RenderSystem.disableScissor();
      f2614.removeLast();
      if (!f2614.isEmpty()) {
         Vector4i var0 = f2614.getLast();
         RenderSystem.enableScissor(var0.x, var0.y, var0.z, var0.w);
      }
   }
}
