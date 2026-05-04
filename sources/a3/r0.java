package a3;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r0 {
    public static void a(float f11, float f12, float f13, float f14) {
        b(f11, f12, f13, f14, false);
    }

    public static void b(float f11, float f12, float f13, float f14, boolean z11) {
        c(f11, f12, f13, f14, z11, false);
    }

    public static void c(float f11, float f12, float f13, float f14, boolean z11, boolean z12) {
        q1.g.f81384g.glClearColor(f11, f12, f13, f14);
        int i11 = z11 ? 16640 : 16384;
        if (z12 && q1.g.f81379b.G().f11345h) {
            i11 |= 32768;
        }
        q1.g.f81384g.glClear(i11);
    }

    public static void d(com.badlogic.gdx.graphics.b bVar) {
        b(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d, false);
    }

    public static void e(com.badlogic.gdx.graphics.b bVar, boolean z11) {
        b(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d, z11);
    }

    public static byte[] f(int i11, int i12, int i13, int i14, boolean z11) {
        q1.g.f81384g.glPixelStorei(com.badlogic.gdx.graphics.f.U0, 1);
        int i15 = i13 * i14 * 4;
        ByteBuffer C = BufferUtils.C(i15);
        q1.g.f81384g.glReadPixels(i11, i12, i13, i14, 6408, com.badlogic.gdx.graphics.f.f11673u1, C);
        byte[] bArr = new byte[i15];
        if (!z11) {
            C.clear();
            C.get(bArr);
            return bArr;
        }
        int i16 = i13 * 4;
        for (int i17 = 0; i17 < i14; i17++) {
            C.position(((i14 - i17) - 1) * i16);
            C.get(bArr, i17 * i16, i16);
        }
        return bArr;
    }

    public static byte[] g(boolean z11) {
        return f(0, 0, q1.g.f81379b.D(), q1.g.f81379b.T(), z11);
    }

    @Deprecated
    public static Pixmap h(int i11, int i12, int i13, int i14) {
        return Pixmap.b(i11, i12, i13, i14);
    }

    public static w1.o i() {
        return j(0, 0, q1.g.f81379b.D(), q1.g.f81379b.T());
    }

    public static w1.o j(int i11, int i12, int i13, int i14) {
        int H = com.badlogic.gdx.math.n.H(i13);
        int H2 = com.badlogic.gdx.math.n.H(i14);
        Pixmap b11 = Pixmap.b(i11, i12, i13, i14);
        Pixmap pixmap = new Pixmap(H, H2, Pixmap.Format.RGBA8888);
        pixmap.k1(Pixmap.Blending.None);
        pixmap.X(b11, 0, 0);
        w1.o oVar = new w1.o(new Texture(pixmap), 0, i14, i13, -i14);
        pixmap.dispose();
        b11.dispose();
        return oVar;
    }
}
