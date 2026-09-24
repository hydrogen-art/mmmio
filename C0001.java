package me.mioclient;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class C0001 extends C0293<Color> implements C1008 {
   public final List<C0448> f0198;
   public final C0083 f0199;
   public final C0083 f0200;
   public final C0083 f0201;
   public boolean f0202;
   public boolean f0203;
   public boolean f0204;
   public boolean f0205;
   public boolean f0206;
   public float[] f0207;
   public final C0792 f0208;
   public final C0792 f0209;
   public final C0792 f0210;
   public final C0792 f0211;
   public final C0614 f0212;
   public static int f0213 = -567802571;

   public C0001(C1244 var1, C1008 var2, C0015<?> var3) {
      super(var1, var2, var3);
      this.f0198 = new ArrayList<>((f0213 | 684160) + ~(f0213 & 684160) + 1 ^ -568166986);
      this.f0199 = new C0083();
      this.f0200 = new C0083();
      this.f0201 = new C0083();
      this.f0207 = new float[(f0213 | 384480) + ~(f0213 & 384480) + 1 ^ -567420714];
      this.f0208 = new C0792(
         Float.intBitsToFloat((f0213 | 737475) + ~(f0213 & 737475) + 1 ^ -1635564042), (boolean)((f0213 | 923688) + ~(f0213 & 923688) + 1 ^ -567927524)
      );
      this.f0209 = new C0792(
         Float.intBitsToFloat((f0213 | 521737) + ~(f0213 & 521737) + 1 ^ -1634733252), (boolean)((f0213 | 32956) + ~(f0213 & 32956) + 1 ^ -567769720)
      );
      this.f0210 = new C0792(
         Float.intBitsToFloat((f0213 | 389893) + ~(f0213 & 389893) + 1 ^ -1634863568), (boolean)((f0213 | 606144) + ~(f0213 & 606144) + 1 ^ -568247564)
      );
      this.f0211 = new C0792(
         Float.intBitsToFloat((f0213 | 133042) + ~(f0213 & 133042) + 1 ^ -1635122553), (boolean)((f0213 | 845741) + ~(f0213 & 845741) + 1 ^ -568008039)
      );
      this.f0212 = new C0614(
         Float.intBitsToFloat((f0213 | 824220) + ~(f0213 & 824220) + 1 ^ -1633380695), (boolean)((f0213 | 707625) + ~(f0213 & 707625) + 1 ^ -568145635)
      );
      int var4 = (int)(
         (double)(
               this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1
                  + this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL()
                  + this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
            )
            + Double.longBitsToDouble(((long)f0213 | 270982L) + ~((long)f0213 & 270982L) + 1L ^ -4619004368389396557L)
            + (double)this.m2202()
      );
      this.f0198.add(new C0003(var4, this));
      this.f0198.add(new C0005(var4, this));
      if (!((C1118)var3).m2600()) {
         this.f0198.add(new C0002(this));
      }

      this.f0198.add(new C0004(this));
   }

   public void m2193(class_332 var1, class_4587 var2, double var3, double var5) {
      super.m$$H4ZB5VRjXea6ADgAn7oqhkF1jdY2RLRFdAhjRxioAK3g7dPU84hlRjGs8rjdVIiyq3olBiqej55jhKcEKsFLMteWctvBZwGDg(var1, var2, var3, var5);
      if (this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V() || !this.f0202) {
         this.f0208.m4117(0.0F);
         this.f0209.m4117(0.0F);
         this.f0210.m4117(0.0F);
         this.f0211.m4117(0.0F);
      }

      if (!this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         if (this.m$$Cyfyk5OMQSnlg0Q0ageBpOGLRjg1rgovHKt6FL6P1atToUuY0RXlw1MESRBF7pV5ASO7ZCRHy1JeA1EIR9q5GwA1SnbjOF5EH && this.f0202) {
            C1214.f0644 = C0371.f0343;
         }

         this.m$$H4ZB5VRjXea6ADgAn7oqhkF1jdY2RLRFdAhjRxioAK3g7dPU84hlRjGs8rjdVIiyq3olBiqej55jhKcEKsFLMteWctvBZwGDg(
            var2,
            this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getName(),
            () -> C0498.f4738
                  .m3889(
                     var1,
                     this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getName(),
                     (float)(
                        this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getX()
                           + ((f0213 | 266129) + ~(f0213 & 266129) + 1 ^ -567539040)
                     ),
                     (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getY()
                        + this.m$$Q6v7Z8vHWixFGmnIwtPT9IRjbEDcp4pbIBg72K4rvMLMAvr4NRM7tkUiW5GGFIwz5ErOctZd5wyLot9rbgaFeWhVicVZ9yVxZ()
                        - this.m$$F4zako7ZnM6Q4oBXFdOvlGhEdnVEGYRWpCXVM3b498QSheE2JxUfvz3PeTnhcFs37rb30sKqxM30g1NRLsO51EuMfjqHIZr01()
                        + (float)this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1,
                     this.m$$RMYwRgyl7vvgm1H2lo9ktTEAKiIDvTunbc3az4N3Oaj484okgkcjCPFt1Y13NM7WuhGQlRXRy1LG34HAHpl3bQqOTw5JlDdEu().f3776.getValue()
                  )
         );
         C0438.m3962(
            var2,
            this.m2199()
               + (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.m0240()
               - Float.intBitsToFloat((f0213 | 966360) + ~(f0213 & 966360) + 1 ^ -1620132883),
            this.m2200() + Float.intBitsToFloat((f0213 | 890426) + ~(f0213 & 890426) + 1 ^ -509242609),
            this.m2199()
               + (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.m0240()
               - Float.intBitsToFloat((f0213 | 480546) + ~(f0213 & 480546) + 1 ^ -1638969321),
            this.m2200() + Float.intBitsToFloat((f0213 | 230704) + ~(f0213 & 230704) + 1 ^ -1626636283),
            this.m$$RMYwRgyl7vvgm1H2lo9ktTEAKiIDvTunbc3az4N3Oaj484okgkcjCPFt1Y13NM7WuhGQlRXRy1LG34HAHpl3bQqOTw5JlDdEu().f3779.getValue()
         );
         C0438.m3962(
            var2,
            this.m2199()
               + (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.m0240()
               - Float.intBitsToFloat((f0213 | 583157) + ~(f0213 & 583157) + 1 ^ -1621040960),
            this.m2200() + Float.intBitsToFloat((f0213 | 568447) + ~(f0213 & 568447) + 1 ^ -505370294),
            this.m2199()
               + (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.m0240()
               - Float.intBitsToFloat((f0213 | 240272) + ~(f0213 & 240272) + 1 ^ -1632915547),
            this.m2200() + Float.intBitsToFloat((f0213 | 506270) + ~(f0213 & 506270) + 1 ^ -1623737173),
            C0152.m3473(
               (Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue(),
               (f0213 | 875505) + ~(f0213 & 875505) + 1 ^ -567976389
            )
         );
         if (this.f0202) {
            int var7 = ((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue()).getAlpha();
            int var8 = this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL();
            if (this.f0204) {
               C1214.f0644 = C0371.f0344;
               this.f0207[(f0213 | 606109) + ~(f0213 & 606109) + 1 ^ -568247639] = (float)class_3532.method_15350(
                  (var3 - (double)this.m2199() - Double.longBitsToDouble(((long)f0213 | 98688L) + ~((long)f0213 & 98688L) + 1L ^ -4617315518529305419L))
                     / (double)(
                        this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                           - ((f0213 | 850342) + ~(f0213 & 850342) + 1 ^ -568001381)
                     ),
                  0.0,
                  Double.longBitsToDouble(((long)f0213 | 235742L) + ~((long)f0213 & 235742L) + 1L ^ -4607182419367584277L)
               );
               this.f0207[(f0213 | 522369) + ~(f0213 & 522369) + 1 ^ -567280202] = Float.intBitsToFloat((f0213 | 792895) + ~(f0213 & 792895) + 1 ^ -509338614)
                  - (float)class_3532.method_15350(
                     (
                           var5
                              - (double)this.m2200()
                              - (double)var8
                              - Double.longBitsToDouble(((long)f0213 | 980290L) + ~((long)f0213 & 980290L) + 1L ^ -4613937818808946569L)
                        )
                        / (double)(
                           this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                              - ((f0213 | 171521) + ~(f0213 & 171521) + 1 ^ -567633092)
                        ),
                     0.0,
                     Double.longBitsToDouble(((long)f0213 | 984959L) + ~((long)f0213 & 984959L) + 1L ^ -4607182419367886262L)
                  );
            } else if (this.f0205) {
               C1214.f0644 = C0371.f0344;
               float var9 = (float)Math.min(
                  Math.max(
                     (double)this.m2199(), var3 - Double.longBitsToDouble(((long)f0213 | 890664L) + ~((long)f0213 & 890664L) + 1L ^ -4607182419367980515L)
                  ),
                  (double)(
                     this.m2199()
                        + (float)(
                           this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                              - ((f0213 | 52257) + ~(f0213 & 52257) + 1 ^ -567752432)
                        )
                  )
               );
               this.f0207[(f0213 | 856630) + ~(f0213 & 856630) + 1 ^ -567994621] = Math.min(
                  (var9 - this.m2199())
                     / (float)(
                        this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                           - ((f0213 | 940892) + ~(f0213 & 940892) + 1 ^ -567910803)
                     ),
                  Float.intBitsToFloat((f0213 | 355652) + ~(f0213 & 355652) + 1 ^ -508729231)
               );
            } else if (this.f0206 && !this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.f3317) {
               C1214.f0644 = C0371.f0344;
               float var21 = (float)Math.min(
                  Math.max(
                     (double)this.m2199(), var3 - Double.longBitsToDouble(((long)f0213 | 371858L) + ~((long)f0213 & 371858L) + 1L ^ -4613937818808505945L)
                  ),
                  (double)(
                     this.m2199()
                        + (float)(
                           this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                              - ((f0213 | 633634) + ~(f0213 & 633634) + 1 ^ -568218093)
                        )
                  )
               );
               var7 = (int)(
                  Math.min(
                        Float.intBitsToFloat((f0213 | 165163) + ~(f0213 & 165163) + 1 ^ -508919778)
                           - (var21 - this.m2199())
                              / (float)(
                                 this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                                    - ((f0213 | 495932) + ~(f0213 & 495932) + 1 ^ -567307251)
                              ),
                        Float.intBitsToFloat((f0213 | 316587) + ~(f0213 & 316587) + 1 ^ -508767842)
                     )
                     * Float.intBitsToFloat((f0213 | 227001) + ~(f0213 & 227001) + 1 ^ -1655409780)
               );
            }

            int var22 = Color.HSBtoRGB(
               this.f0207[(f0213 | 464134) + ~(f0213 & 464134) + 1 ^ -567341005],
               Float.intBitsToFloat((f0213 | 536942) + ~(f0213 & 536942) + 1 ^ -509594533),
               Float.intBitsToFloat((f0213 | 292853) + ~(f0213 & 292853) + 1 ^ -508792128)
            );
            float var10 = (float)(var22 >> ((f0213 | 228213) + ~(f0213 & 228213) + 1 ^ -567574960) & ((f0213 | 460641) + ~(f0213 & 460641) + 1 ^ -567344469))
               / Float.intBitsToFloat((f0213 | 17459) + ~(f0213 & 17459) + 1 ^ -1655226106);
            float var11 = (float)(var22 >> ((f0213 | 343594) + ~(f0213 & 343594) + 1 ^ -567461097) & ((f0213 | 198777) + ~(f0213 & 198777) + 1 ^ -567603789))
               / Float.intBitsToFloat((f0213 | 838688) + ~(f0213 & 838688) + 1 ^ -1654929131);
            float var12 = (float)(var22 & ((f0213 | 555588) + ~(f0213 & 555588) + 1 ^ -568295538))
               / Float.intBitsToFloat((f0213 | 556928) + ~(f0213 & 556928) + 1 ^ -1654687051);
            int var13 = this.f0204
               ? (f0213 | 322324) + ~(f0213 & 322324) + 1 ^ 567480798
               : this.m$$RMYwRgyl7vvgm1H2lo9ktTEAKiIDvTunbc3az4N3Oaj484okgkcjCPFt1Y13NM7WuhGQlRXRy1LG34HAHpl3bQqOTw5JlDdEu().f3779.getValue().hashCode();
            C0438.m3964(
               var2.method_23760().method_23761(),
               this.m2199() + Float.intBitsToFloat((f0213 | 291655) + ~(f0213 & 291655) + 1 ^ -1643350414),
               this.m2200() + (float)var8 + Float.intBitsToFloat((f0213 | 868466) + ~(f0213 & 868466) + 1 ^ -517651129),
               (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 56656) + ~(f0213 & 56656) + 1 ^ -567748506)
               ),
               (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 495170) + ~(f0213 & 495170) + 1 ^ -567309452)
               ),
               var13,
               var13,
               var13,
               var13
            );
            C0438.m3964(
               var2.method_23760().method_23761(),
               this.m2199() + Float.intBitsToFloat((f0213 | 552764) + ~(f0213 & 552764) + 1 ^ -1637848567),
               this.m2200() + (float)var8 + Float.intBitsToFloat((f0213 | 485185) + ~(f0213 & 485185) + 1 ^ -508599692),
               (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 128914) + ~(f0213 & 128914) + 1 ^ -567676253)
               ),
               (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 662785) + ~(f0213 & 662785) + 1 ^ -568190928)
               ),
               (f0213 | 449850) + ~(f0213 & 449850) + 1 ^ 567355376,
               var22,
               (f0213 | 889383) + ~(f0213 & 889383) + 1 ^ 556111634,
               (f0213 | 395162) + ~(f0213 & 395162) + 1 ^ 556663471
            );
            Matrix4f var10000 = var2.method_23760().method_23761();
            float var10001 = this.m2199() + Float.intBitsToFloat((f0213 | 928384) + ~(f0213 & 928384) + 1 ^ -1643761739);
            float var10002 = this.m2200()
               + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
               + (float)var8
               - Float.intBitsToFloat((f0213 | 572688) + ~(f0213 & 572688) + 1 ^ -517949403);
            float var10003 = (float)(
               this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                  - ((f0213 | 324417) + ~(f0213 & 324417) + 1 ^ -567478665)
            );
            float var10004 = Float.intBitsToFloat((f0213 | 49462) + ~(f0213 & 49462) + 1 ^ -1631009789);
            int[] var10005 = new int[(f0213 | 211187) + ~(f0213 & 211187) + 1 ^ -567591484];
            var10005[(f0213 | 528452) + ~(f0213 & 528452) + 1 ^ -568322703] = this.f0205
               ? (f0213 | 117632) + ~(f0213 & 117632) + 1 ^ 567685450
               : this.m2201().hashCode();
            var10005[(f0213 | 360749) + ~(f0213 & 360749) + 1 ^ -567442407] = this.f0205
               ? (f0213 | 51655) + ~(f0213 & 51655) + 1 ^ 567751437
               : this.m2201().hashCode();
            C0438.m3965(var10000, var10001, var10002, var10003, var10004, var10005);
            var10000 = var2.method_23760().method_23761();
            var10001 = this.m2199() + Float.intBitsToFloat((f0213 | 775814) + ~(f0213 & 775814) + 1 ^ -1637624909);
            var10002 = this.m2200()
               + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
               + (float)var8;
            var10003 = (float)(
               this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                  - ((f0213 | 189010) + ~(f0213 & 189010) + 1 ^ -567613597)
            );
            var10004 = Float.intBitsToFloat((f0213 | 484874) + ~(f0213 & 484874) + 1 ^ -1628478657);
            var10005 = new int[(f0213 | 816730) + ~(f0213 & 816730) + 1 ^ -568036504];
            var10005[(f0213 | 315413) + ~(f0213 & 315413) + 1 ^ -567487200] = (f0213 | 163543) + ~(f0213 & 163543) + 1 ^ 567639010;
            var10005[(f0213 | 600686) + ~(f0213 & 600686) + 1 ^ -568250534] = (f0213 | 393166) + ~(f0213 & 393166) + 1 ^ 567412219;
            var10005[(f0213 | 659613) + ~(f0213 & 659613) + 1 ^ -568191574] = (f0213 | 287742) + ~(f0213 & 287742) + 1 ^ 556571083;
            var10005[(f0213 | 258776) + ~(f0213 & 258776) + 1 ^ -567543826] = (f0213 | 964906) + ~(f0213 & 964906) + 1 ^ 556155872;
            var10005[(f0213 | 732613) + ~(f0213 & 732613) + 1 ^ -568121100] = (f0213 | 44989) + ~(f0213 & 44989) + 1 ^ 556313207;
            var10005[(f0213 | 813157) + ~(f0213 & 813157) + 1 ^ -568038059] = (f0213 | 958758) + ~(f0213 & 958758) + 1 ^ 567911660;
            var10005[(f0213 | 779945) + ~(f0213 & 779945) + 1 ^ -568073318] = (f0213 | 583871) + ~(f0213 & 583871) + 1 ^ 568323466;
            C0438.m3965(var10000, var10001, var10002, var10003, var10004, var10005);
            this.m2206(
               this.f0210,
               this.f0207[(f0213 | 917476) + ~(f0213 & 917476) + 1 ^ -567936303]
                  * (float)(
                     this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - ((f0213 | 847930) + ~(f0213 & 847930) + 1 ^ -568003315)
                  )
            );
            float var14 = class_3532.method_15363(
               this.f0210.m2325(),
               Float.intBitsToFloat((f0213 | 181915) + ~(f0213 & 181915) + 1 ^ -1637170258),
               (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 148399) + ~(f0213 & 148399) + 1 ^ -567654759)
               )
            );
            C0438.m3963(
               var2,
               (float)((int)(this.m2199() + var14)) - Float.intBitsToFloat((f0213 | 954034) + ~(f0213 & 954034) + 1 ^ -517567609),
               (float)(
                     (int)(
                        this.m2200()
                           + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                           + (float)var8
                     )
                  )
                  - Float.intBitsToFloat((f0213 | 981667) + ~(f0213 & 981667) + 1 ^ -517537898),
               (float)((int)(this.m2199() + var14 + Float.intBitsToFloat((f0213 | 286994) + ~(f0213 & 286994) + 1 ^ -1641257945)))
                  + Float.intBitsToFloat((f0213 | 546786) + ~(f0213 & 546786) + 1 ^ -517975337),
               (float)(
                  (int)(
                     this.m2200()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + (float)var8
                        + Float.intBitsToFloat((f0213 | 315531) + ~(f0213 & 315531) + 1 ^ -1627597378)
                  )
               ),
               this.f0204 ? (f0213 | 709314) + ~(f0213 & 709314) + 1 ^ 568141832 : this.m2201().hashCode()
            );
            C0438.m3963(
               var2,
               (float)((int)(this.m2199() + var14)),
               (float)(
                  (int)(
                     this.m2200()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + (float)var8
                  )
               ),
               (float)((int)(this.m2199() + var14 + Float.intBitsToFloat((f0213 | 700706) + ~(f0213 & 700706) + 1 ^ -1641892841))),
               (float)(
                  (int)(
                     this.m2200()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + (float)var8
                        + Float.intBitsToFloat((f0213 | 97075) + ~(f0213 & 97075) + 1 ^ -1627816442)
                  )
               ),
               (f0213 | 75350) + ~(f0213 & 75350) + 1 ^ 567729308
            );
            if (!this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.f3317) {
               var10000 = var2.method_23760().method_23761();
               var10001 = this.m2199() + Float.intBitsToFloat((f0213 | 815995) + ~(f0213 & 815995) + 1 ^ -1643874738);
               var10002 = (float)(
                     (int)this.m2200()
                        + this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + var8
                  )
                  + Float.intBitsToFloat((f0213 | 640165) + ~(f0213 & 640165) + 1 ^ -1630420592);
               var10003 = (float)(
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 991431) + ~(f0213 & 991431) + 1 ^ -567859727)
               );
               var10004 = Float.intBitsToFloat((f0213 | 38171) + ~(f0213 & 38171) + 1 ^ -1631023058);
               var10005 = new int[(f0213 | 671198) + ~(f0213 & 671198) + 1 ^ -568182551];
               var10005[(f0213 | 845561) + ~(f0213 & 845561) + 1 ^ -568007732] = this.f0206
                  ? (f0213 | 155980) + ~(f0213 & 155980) + 1 ^ 567647110
                  : this.m2201().hashCode();
               var10005[(f0213 | 142910) + ~(f0213 & 142910) + 1 ^ -567661814] = this.f0206
                  ? (f0213 | 972594) + ~(f0213 & 972594) + 1 ^ 567881208
                  : this.m2201().hashCode();
               C0438.m3965(var10000, var10001, var10002, var10003, var10004, var10005);
               this.m2194(
                  var2,
                  (int)this.m2199() + ((f0213 | 727117) + ~(f0213 & 727117) + 1 ^ -568124037),
                  (int)this.m2200()
                     + this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     + var8
                     + ((f0213 | 916669) + ~(f0213 & 916669) + 1 ^ -567936640),
                  this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     - ((f0213 | 216774) + ~(f0213 & 216774) + 1 ^ -567587849),
                  (f0213 | 985969) + ~(f0213 & 985969) + 1 ^ -567865790,
                  var10,
                  var11,
                  var12,
                  (float)var7 / Float.intBitsToFloat((f0213 | 642950) + ~(f0213 & 642950) + 1 ^ -1654732109)
               );
            }

            this.m2206(
               this.f0208,
               class_3532.method_15363(
                     this.f0207[(f0213 | 196836) + ~(f0213 & 196836) + 1 ^ -567605808],
                     0.0F,
                     Float.intBitsToFloat((f0213 | 593837) + ~(f0213 & 593837) + 1 ^ -509539688)
                  )
                  * (float)(
                     this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - ((f0213 | 522437) + ~(f0213 & 522437) + 1 ^ -567280136)
                  )
            );
            this.m2206(
               this.f0209,
               (
                     Float.intBitsToFloat((f0213 | 460736) + ~(f0213 & 460736) + 1 ^ -508624139)
                        - class_3532.method_15363(
                           this.f0207[(f0213 | 166903) + ~(f0213 & 166903) + 1 ^ -567636288],
                           0.0F,
                           Float.intBitsToFloat((f0213 | 461938) + ~(f0213 & 461938) + 1 ^ -508622521)
                        )
                  )
                  * (float)(
                     this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - ((f0213 | 416084) + ~(f0213 & 416084) + 1 ^ -567387031)
                  )
            );
            float var15 = this.m2199() + Float.intBitsToFloat((f0213 | 598205) + ~(f0213 & 598205) + 1 ^ -1635703416) + this.f0208.m2325();
            float var16 = this.m2200() + (float)var8 + Float.intBitsToFloat((f0213 | 645397) + ~(f0213 & 645397) + 1 ^ -1637753824) + this.f0209.m2325();
            this.f0212.m2328(this.f0204);
            float var17 = Float.intBitsToFloat((f0213 | 838919) + ~(f0213 & 838919) + 1 ^ -1641756622)
               * Float.intBitsToFloat((f0213 | 486289) + ~(f0213 & 486289) + 1 ^ -508596572)
               * this.f0212.m2325();
            Color var18 = Color.getHSBColor(
               this.f0207[(f0213 | 459430) + ~(f0213 & 459430) + 1 ^ -567343213],
               this.f0207[(f0213 | 676558) + ~(f0213 & 676558) + 1 ^ -568174598],
               this.f0207[(f0213 | 545304) + ~(f0213 & 545304) + 1 ^ -568305873]
            );
            C0438.m3962(
               var2,
               var15 - Float.intBitsToFloat((f0213 | 307731) + ~(f0213 & 307731) + 1 ^ -504580314) - var17,
               var16 - Float.intBitsToFloat((f0213 | 493972) + ~(f0213 & 493972) + 1 ^ -504394591) - var17,
               var15 + Float.intBitsToFloat((f0213 | 851469) + ~(f0213 & 851469) + 1 ^ -505087176) + var17,
               var16 + Float.intBitsToFloat((f0213 | 160201) + ~(f0213 & 160201) + 1 ^ -504728324) + var17,
               this.f0204 ? Color.white : this.m2201()
            );
            C0438.m3962(
               var2,
               var15 - Float.intBitsToFloat((f0213 | 715587) + ~(f0213 & 715587) + 1 ^ -509415818) - var17,
               var16 - Float.intBitsToFloat((f0213 | 808349) + ~(f0213 & 808349) + 1 ^ -509325144) - var17,
               var15 + Float.intBitsToFloat((f0213 | 911675) + ~(f0213 & 911675) + 1 ^ -509219826) + var17,
               var16 + Float.intBitsToFloat((f0213 | 813026) + ~(f0213 & 813026) + 1 ^ -509320489) + var17,
               this.f0204 ? var18 : var18.darker()
            );
            this.f0198.forEach(var6 -> var6.m0001(var1, var2, var3, var5));
            this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH
               .m2603(
                  C0152.m3473(
                     new Color(
                        Color.HSBtoRGB(
                           this.f0207[(f0213 | 370681) + ~(f0213 & 370681) + 1 ^ -567434548],
                           this.f0207[(f0213 | 149482) + ~(f0213 & 149482) + 1 ^ -567655714],
                           this.f0207[(f0213 | 415333) + ~(f0213 & 415333) + 1 ^ -567389358]
                        )
                     ),
                     class_3532.method_15340(var7, (f0213 | 500572) + ~(f0213 & 500572) + 1 ^ -567302551, (f0213 | 662491) + ~(f0213 & 662491) + 1 ^ -568189423)
                  )
               );
            if (((C1118)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH).m2601()) {
               this.f0207[(f0213 | 97712) + ~(f0213 & 97712) + 1 ^ -567707515] = Color.RGBtoHSB(
                  ((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue()).getRed(),
                  ((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue()).getGreen(),
                  ((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue()).getBlue(),
                  null
               )[(f0213 | 240860) + ~(f0213 & 240860) + 1 ^ -567563799];
            }
         }

         int var19 = (int)(
            (float)(
                  this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1
                     + this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL()
                     + this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                     + ((f0213 | 450420) + ~(f0213 & 450420) + 1 ^ -567354809)
               )
               + this.m2202()
         );
         float var20 = Float.intBitsToFloat((f0213 | 824231) + ~(f0213 & 824231) + 1 ^ -509307246);

         for (C0448 var24 : this.f0198) {
            var24.m0002(var3, var5);
            var24.m0008(var19);
            if (!(var24 instanceof C0867)) {
               var19 += (int)((float)var24.m0010() + var20);
               var24.m0008(var19);
               var20 = Float.intBitsToFloat((f0213 | 371471) + ~(f0213 & 371471) + 1 ^ -517099974);
            }
         }
      }
   }

   public void m2194(class_4587 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      int var10 = (f0213 | 609740) + ~(f0213 & 609740) + 1 ^ -568243976;
      int var11 = var5 / ((f0213 | 176652) + ~(f0213 & 176652) + 1 ^ -567625925);

      for (int var12 = -var11; var12 < var4; var12 += var11) {
         if (var10 == 0) {
            C0438.m3963(
               var1,
               (float)(var2 + var12),
               (float)var3,
               (float)(var2 + var12 + var11),
               (float)(var3 + var5),
               (f0213 | 263149) + ~(f0213 & 263149) + 1 ^ 567540007
            );
            C0438.m3963(
               var1,
               (float)(var2 + var12),
               (float)(var3 + var11),
               (float)(var2 + var12 + var11),
               (float)(var3 + var5),
               (f0213 | 206248) + ~(f0213 & 206248) + 1 ^ 565948429
            );
            if (var12 < var4 - var11) {
               int var13 = var2 + var12 + var11;
               int var14 = Math.min(var2 + var4, var2 + var12 + var11 * ((f0213 | 282484) + ~(f0213 & 282484) + 1 ^ -567522749));
               C0438.m3963(var1, (float)var13, (float)var3, (float)var14, (float)(var3 + var5), (f0213 | 204407) + ~(f0213 & 204407) + 1 ^ 565939154);
               C0438.m3963(var1, (float)var13, (float)(var3 + var11), (float)var14, (float)(var3 + var5), (f0213 | 157516) + ~(f0213 & 157516) + 1 ^ 567647622);
            }
         }

         var10 = var10 == 0 ? (f0213 | 433508) + ~(f0213 & 433508) + 1 ^ -567371696 : (f0213 | 860576) + ~(f0213 & 860576) + 1 ^ -567991147;
      }

      Matrix4f var10000 = var1.method_23760().method_23761();
      float var10001 = (float)var2;
      float var10002 = (float)var3;
      float var10003 = (float)var4;
      float var10004 = (float)var5;
      int[] var10005 = new int[(f0213 | 30938) + ~(f0213 & 30938) + 1 ^ -567771667];
      var10005[(f0213 | 601134) + ~(f0213 & 601134) + 1 ^ -568252133] = new Color(
            var6, var7, var8, Float.intBitsToFloat((f0213 | 714204) + ~(f0213 & 714204) + 1 ^ -509419287)
         )
         .hashCode();
      var10005[(f0213 | 690087) + ~(f0213 & 690087) + 1 ^ -568163693] = (f0213 | 301546) + ~(f0213 & 301546) + 1 ^ -567501601;
      C0438.m3965(var10000, var10001, var10002, var10003, var10004, var10005);
      this.m2206(this.f0211, (float)var4 - (float)(var4 - ((f0213 | 633545) + ~(f0213 & 633545) + 1 ^ -568217602)) * var9);
      float var15 = (float)var2 + this.f0211.m2325() - Float.intBitsToFloat((f0213 | 556215) + ~(f0213 & 556215) + 1 ^ -509576830);
      C0438.m3962(
         var1,
         var15 - Float.intBitsToFloat((f0213 | 665154) + ~(f0213 & 665154) + 1 ^ -505273481),
         (float)var3 - Float.intBitsToFloat((f0213 | 538804) + ~(f0213 & 538804) + 1 ^ -517980799),
         var15 + Float.intBitsToFloat((f0213 | 481054) + ~(f0213 & 481054) + 1 ^ -504409557),
         (float)(var3 + var5) + Float.intBitsToFloat((f0213 | 591137) + ~(f0213 & 591137) + 1 ^ -517930988),
         this.f0206 ? Color.white : this.m2201()
      );
      C0438.m3963(
         var1,
         var15 - Float.intBitsToFloat((f0213 | 441504) + ~(f0213 & 441504) + 1 ^ -508642923),
         (float)var3,
         var15 + Float.intBitsToFloat((f0213 | 546541) + ~(f0213 & 546541) + 1 ^ -509586472),
         (float)(var3 + var5),
         (f0213 | 724298) + ~(f0213 & 724298) + 1 ^ 568129408
      );
   }

   @Override
   public void m0003(double var1, double var3, int var5) {
      if (!this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         int var6 = this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL();
         if (this.m2198(var1, var3) && var5 == ((f0213 | 152442) + ~(f0213 & 152442) + 1 ^ -567650738)) {
            this.f0202 = (boolean)(!this.f0202 ? (f0213 | 892253) + ~(f0213 & 892253) + 1 ^ -567961495 : (f0213 | 138227) + ~(f0213 & 138227) + 1 ^ -567664954);
         }

         if (this.f0202) {
            this.f0198.forEach(var5x -> var5x.m0003(var1, var3, var5));
         }

         if (this.f0202 && var5 == 0) {
            if (var1 > (double)(this.m2199() + Float.intBitsToFloat((f0213 | 415852) + ~(f0213 & 415852) + 1 ^ -1641128615))
               && var1
                  < (double)(
                     this.m2199()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - Float.intBitsToFloat((f0213 | 751410) + ~(f0213 & 751410) + 1 ^ -1641844217)
                  )
               && var3 > (double)(this.m2200() + (float)var6)
               && var3
                  < (double)(
                     this.m2200()
                        + (float)var6
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - Float.intBitsToFloat((f0213 | 779421) + ~(f0213 & 779421) + 1 ^ -1641815640)
                  )) {
               this.f0204 = (boolean)((f0213 | 567040) + ~(f0213 & 567040) + 1 ^ -568286668);
            }

            if (var1 > (double)(this.m2199() + Float.intBitsToFloat((f0213 | 132722) + ~(f0213 & 132722) + 1 ^ -1641413817))
               && var1
                  < (double)(
                     this.m2199()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - Float.intBitsToFloat((f0213 | 525023) + ~(f0213 & 525023) + 1 ^ -1642067990)
                  )
               && var3
                  > (double)(
                     this.m2200()
                        + (float)var6
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                  )
               && var3
                  < (double)(
                     this.m2200()
                        + (float)var6
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + Float.intBitsToFloat((f0213 | 927221) + ~(f0213 & 927221) + 1 ^ -1629085504)
                  )) {
               this.f0205 = (boolean)((f0213 | 616140) + ~(f0213 & 616140) + 1 ^ -568237064);
            }

            if (var1 > (double)(this.m2199() + Float.intBitsToFloat((f0213 | 973723) + ~(f0213 & 973723) + 1 ^ -1641619794))
               && var1
                  < (double)(
                     this.m2199()
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        - Float.intBitsToFloat((f0213 | 847878) + ~(f0213 & 847878) + 1 ^ -1641745101)
                  )
               && var3
                  > (double)(
                     this.m2200()
                        + (float)var6
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + Float.intBitsToFloat((f0213 | 243936) + ~(f0213 & 243936) + 1 ^ -1624523307)
                  )
               && var3
                  < (double)(
                     this.m2200()
                        + (float)var6
                        + (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
                        + Float.intBitsToFloat((f0213 | 36230) + ~(f0213 & 36230) + 1 ^ -1622636365)
                  )
               && !this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.f3317) {
               this.f0206 = (boolean)((f0213 | 85887) + ~(f0213 & 85887) + 1 ^ -567719349);
            }

            super.m0003(var1, var3, var5);
         }
      }
   }

   public void m2195(double var1, double var3, int var5) {
      if (!this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         this.f0198.forEach(var5x -> var5x.m0004(var1, var3, var5));
         super.m$$iZnnVBJ17A5YJbakVntJjvhjlzvzt8abld4g7DVpkphruizpxyO31ajNTWEZ2smIjpUa4yekh7iZ7sJESIVA0nApb5M9c0lYC(var1, var3, var5);
         this.f0204 = this.f0205 = this.f0206 = (boolean)((f0213 | 997694) + ~(f0213 & 997694) + 1 ^ -567854069);
      }
   }

   public void m2196(char var1) {
      if (!this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         this.f0198.forEach(var1x -> var1x.m0007(var1));
         super.m$$iZnnVBJ17A5YJbakVntJjvhjlzvzt8abld4g7DVpkphruizpxyO31ajNTWEZ2smIjpUa4yekh7iZ7sJESIVA0nApb5M9c0lYC(var1);
      }
   }

   public void m2197(int var1) {
      if (!this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         this.f0198.forEach(var1x -> var1x.m0006(var1));
         super.m$$yg0cpclxSfUVqU7oQsoc5QGpAfuAHnWO6hSZXPc02Rtdkhgiy5O2zVSeVJ5m1n8f89H7zN0QQKEhHucs2zRigaWB8TuBUNnXn(var1);
      }
   }

   @Override
   public int m0172() {
      if (this.f0202 && !this.m$$STDt5JeVOLvpsDsEaqvKooezG4fl5lgQQRrGRKi1BSQx5RCTZiGpiNl9MhmPuA122tO5m0lfbSnyOh6ELiKUca8nxNN9fcD8V()) {
         int var1 = (int)(
            (float)this.m$$F2VfRczxZgfSe3elTQhPXeEksLehCkyfAuyqtTiWZTRt0Js08hZqVR8N3vuoeqziiTFXxmCcxA9OCdO6VEZ1GrXbj54aT0ytc().m0240()
               + Float.intBitsToFloat((f0213 | 888414) + ~(f0213 & 888414) + 1 ^ -1631220885)
               + (float)(
                  this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL()
                     * ((f0213 | 514835) + ~(f0213 & 514835) + 1 ^ -567288284)
               )
               + this.m2202()
         );
         if (this.f0198.size() > ((f0213 | 893257) + ~(f0213 & 893257) + 1 ^ -567958402)) {
            var1 = (int)(
               (float)var1
                  + (float)(
                     this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL()
                        * (this.f0198.size() - ((f0213 | 463010) + ~(f0213 & 463010) + 1 ^ -567339627))
                  )
                  + Float.intBitsToFloat((f0213 | 590370) + ~(f0213 & 590370) + 1 ^ -517929193)
            );
         }

         return var1;
      } else {
         return super.m0172();
      }
   }

   @Override
   public void init() {
      this.m2204((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue());
      this.f0198.forEach(C0448::init);
   }

   @Override
   public boolean isClosed() {
      return (boolean)(!this.m$$F87DBNHG44NIiTbHTfZJoMsa5zpiFFLsXxMOy9L7Pf1mMhPavILHtyiav89foqp5vCpxjGjcuJtntji01Z3ibUwOHCcNs3jV4.isClosed() && this.f0202
         ? (f0213 | 776750) + ~(f0213 & 776750) + 1 ^ -568074469
         : (f0213 | 723535) + ~(f0213 & 723535) + 1 ^ -568127621);
   }

   public boolean m2198(double var1, double var3) {
      return (boolean)(var1 > (double)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getX()
            && var1
               < (double)(
                  this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getX()
                     + this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.m0240()
               )
            && var3
               > (double)(
                  this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getY()
                     + this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1
               )
            && var3
               < (double)(
                  this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getY()
                     + this.m$$4pV0XlRIp4cDUyskylgOmPZTmM1Cm1Gb3t6qmsm9WaHYQRZKVwi9AWUFUSK0Q6Q4SAfIUacgGminfDDGkwXZhAbLvD3aANrPL()
                     + this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1
               )
         ? (f0213 | 179815) + ~(f0213 & 179815) + 1 ^ -567624877
         : (f0213 | 589833) + ~(f0213 & 589833) + 1 ^ -568261316);
   }

   public float m2199() {
      return (float)this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getX();
   }

   public float m2200() {
      return (float)(
         this.m$$WdQySQFfK5inj4ZJGVO6i5WS7jlaOT0fUXzeE72Sw9Wmijq6vyjlGV1NVssQ5YaIBkwJ733gAhF7vRR3FxyvTRYFBXWiENTbT.getY()
            + this.m$$hlCUpAMCB8w0fikXDazwCNyOBsPOGWgAm2lmO5tu7dGyqkbhliec158gzgZe9bnF3DuoOxLmXH5dfCU0wQDHsWXD8knX2Gis1
      );
   }

   public Color m2201() {
      return C0152.m3474(
         this.m$$RMYwRgyl7vvgm1H2lo9ktTEAKiIDvTunbc3az4N3Oaj484okgkcjCPFt1Y13NM7WuhGQlRXRy1LG34HAHpl3bQqOTw5JlDdEu().f3779.getValue(),
         Float.intBitsToFloat((f0213 | 984935) + ~(f0213 & 984935) + 1 ^ -509148590)
      );
   }

   public float m2202() {
      return this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.f3317
         ? Float.intBitsToFloat((f0213 | 975810) + ~(f0213 & 975810) + 1 ^ -1641617673)
         : Float.intBitsToFloat((f0213 | 17355) + ~(f0213 & 17355) + 1 ^ -1626847490);
   }

   public boolean m2203(double var1, double var3) {
      return (boolean)(!super.m$$KS06f9f0NeLXQssz988RwWxLCd732LAhBiLrzA6AumbpOGfb45EuzpXjfSeTD0OkSNHYLtbwg5PkbT1fpFz6nDh4Qmr4NR48O(var1, var3)
            && !this.f0205
            && !this.f0204
            && !this.f0206
         ? (f0213 | 74863) + ~(f0213 & 74863) + 1 ^ -567729830
         : (f0213 | 992850) + ~(f0213 & 992850) + 1 ^ -567860378);
   }

   public void m2204(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      this.f0207[(f0213 | 49564) + ~(f0213 & 49564) + 1 ^ -567753559] = var2[(f0213 | 644467) + ~(f0213 & 644467) + 1 ^ -568209338];
      this.f0207[(f0213 | 338631) + ~(f0213 & 338631) + 1 ^ -567463949] = var2[(f0213 | 492462) + ~(f0213 & 492462) + 1 ^ -567310694];
      this.f0207[(f0213 | 717949) + ~(f0213 & 717949) + 1 ^ -568135350] = var2[(f0213 | 849538) + ~(f0213 & 849538) + 1 ^ -568003659];
   }

   public Color m2205() {
      return C0152.m3473(
         Color.getHSBColor(
            this.f0207[(f0213 | 676477) + ~(f0213 & 676477) + 1 ^ -568174776],
            this.f0207[(f0213 | 362985) + ~(f0213 & 362985) + 1 ^ -567440163],
            this.f0207[(f0213 | 820160) + ~(f0213 & 820160) + 1 ^ -568031497]
         ),
         ((Color)this.m$$lcsK03SA5Uzf6wbRbQ3Gyei3NLvWgLlLpsuyxu7J47EMHW3DQr1eadbZKYZ9X1WwYOys2RS5VtAUQtmcQIirvqXan3F1K71WH.getValue()).getAlpha()
      );
   }

   public void m2206(C0792 var1, float var2) {
      if (this.f0203) {
         var1.m4117(var2);
      } else {
         var1.m2326(var2);
      }
   }

   static {
      long var10000 = 1775127774194181912L;
   }
}
