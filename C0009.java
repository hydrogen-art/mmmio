package me.mioclient;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class C0009 implements C0048 {
   public final Map<Object, List<C0900>> f0302 = new ConcurrentHashMap<>();
   public final Map<Class<?>, List<C0900>> f0303 = new ConcurrentHashMap<>();
   public final Map<Class<?>, List<C0900>> f0304 = new ConcurrentHashMap<>();
   public final List<C0010> f0305 = new ArrayList<>();

   @Override
   public void m0189(String var1, C0701 var2) {
      synchronized (this.f0305) {
         this.f0305.add(new C0010(var1, var2));
      }
   }

   @Override
   public <T> T m0190(T var1) {
      List var2 = this.f0304.get(var1.getClass());
      if (var2 != null) {
         for (C0900 var4 : var2) {
            var4.m1833(var1);
         }
      }

      return (T)var1;
   }

   @Override
   public <T extends C0929> T m0191(T var1) {
      List var2 = this.f0304.get(var1.getClass());
      if (var2 != null) {
         var1.m3495(false);

         for (C0900 var4 : var2) {
            var4.m1833(var1);
            if (var1.m3497()) {
               break;
            }
         }
      }

      return (T)var1;
   }

   @Override
   public void m0192(Object var1) {
      this.m0195(this.m0203(var1.getClass(), var1), false);
   }

   @Override
   public void m0193(Class<?> var1) {
      this.m0195(this.m0203(var1, null), true);
   }

   @Override
   public void m0194(C0900 var1) {
      this.m0196(var1, false);
   }

   public void m0195(List<C0900> var1, boolean var2) {
      for (C0900 var4 : var1) {
         this.m0196(var4, var2);
      }
   }

   public void m0196(C0900 var1, boolean var2) {
      if (var2) {
         if (var1.m1836()) {
            this.m0197(this.f0304.computeIfAbsent(var1.m1834(), var0 -> new CopyOnWriteArrayList<>()), var1);
         }
      } else {
         this.m0197(this.f0304.computeIfAbsent(var1.m1834(), var0 -> new CopyOnWriteArrayList<>()), var1);
      }
   }

   public void m0197(List<C0900> var1, C0900 var2) {
      int var3 = 0;

      while (var3 < var1.size() && var2.m1835() <= ((C0900)var1.get(var3)).m1835()) {
         var3++;
      }

      var1.add(var3, var2);
   }

   @Override
   public void m0198(Object var1) {
      this.m0201(this.m0203(var1.getClass(), var1), false);
   }

   @Override
   public void m0199(Class<?> var1) {
      this.m0201(this.m0203(var1, null), true);
   }

   @Override
   public void m0200(C0900 var1) {
      this.m0202(var1, false);
   }

   public void m0201(List<C0900> var1, boolean var2) {
      for (C0900 var4 : var1) {
         this.m0202(var4, var2);
      }
   }

   public void m0202(C0900 var1, boolean var2) {
      List var3 = this.f0304.get(var1.m1834());
      if (var3 != null) {
         if (var2) {
            if (var1.m1836()) {
               var3.remove(var1);
            }
         } else {
            var3.remove(var1);
         }
      }
   }

   public List<C0900> m0203(Class<?> var1, Object var2) {
      Function var3 = var3x -> {
         CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
         this.m0204(var4, var1, var2);
         return var4;
      };
      if (var2 == null) {
         return this.f0303.computeIfAbsent(var1, var3);
      } else {
         for (Object var5 : this.f0302.keySet()) {
            if (var5 == var2) {
               return this.f0302.get(var2);
            }
         }

         List var6 = (List)var3.apply(var2);
         this.f0302.put(var2, var6);
         return var6;
      }
   }

   public void m0204(List<C0900> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.m0205(var7)) {
            var1.add(new C0700(this.m0206(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.m0204(var1, var2.getSuperclass(), var3);
      }
   }

   public boolean m0205(Method var1) {
      if (!var1.isAnnotationPresent(C1027.class)) {
         return false;
      } else if (var1.getReturnType() != void.class) {
         return false;
      } else {
         return var1.getParameterCount() != 1 ? false : !var1.getParameters()[0].getType().isPrimitive();
      }
   }

   public C0701 m0206(Class<?> var1) {
      synchronized (this.f0305) {
         for (C0010 var4 : this.f0305) {
            if (var1.getName().startsWith(var4.f2473)) {
               return var4.f2474;
            }
         }
      }

      throw new C0129(var1);
   }
}
