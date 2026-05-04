package n2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f74218a = true;

    public static void a(int i11, Pixmap pixmap, int i12, int i13) {
        if (!f74218a) {
            c(i11, pixmap, i12, i13);
        } else if (q1.g.f81378a.getType() == Application.ApplicationType.Android || q1.g.f81378a.getType() == Application.ApplicationType.WebGL || q1.g.f81378a.getType() == Application.ApplicationType.iOS) {
            e(i11, pixmap);
        } else {
            d(i11, pixmap, i12, i13);
        }
    }

    public static void b(Pixmap pixmap, int i11, int i12) {
        a(com.badlogic.gdx.graphics.f.f11552a0, pixmap, i11, i12);
    }

    public static void c(int i11, Pixmap pixmap, int i12, int i13) {
        q1.g.f81384g.glTexImage2D(i11, 0, pixmap.d1(), pixmap.i1(), pixmap.f1(), 0, pixmap.c1(), pixmap.e1(), pixmap.h1());
        if (q1.g.f81385h == null && i12 != i13) {
            throw new GdxRuntimeException("texture width and height must be square when using mipmapping.");
        }
        Pixmap pixmap2 = pixmap;
        int i14 = pixmap.i1() / 2;
        int f12 = pixmap.f1() / 2;
        int i15 = 1;
        while (i14 > 0 && f12 > 0) {
            Pixmap pixmap3 = new Pixmap(i14, f12, pixmap2.b1());
            pixmap3.k1(Pixmap.Blending.None);
            pixmap3.i0(pixmap2, 0, 0, pixmap2.i1(), pixmap2.f1(), 0, 0, i14, f12);
            if (i15 > 1) {
                pixmap2.dispose();
            }
            int i16 = i15;
            q1.g.f81384g.glTexImage2D(i11, i16, pixmap3.d1(), pixmap3.i1(), pixmap3.f1(), 0, pixmap3.c1(), pixmap3.e1(), pixmap3.h1());
            i14 = pixmap3.i1() / 2;
            int i17 = i16 + 1;
            f12 = pixmap3.f1() / 2;
            i15 = i17;
            pixmap2 = pixmap3;
        }
    }

    public static void d(int i11, Pixmap pixmap, int i12, int i13) {
        if (!q1.g.f81379b.d("GL_ARB_framebuffer_object") && !q1.g.f81379b.d("GL_EXT_framebuffer_object") && !q1.g.f81385h.getClass().getName().equals("com.badlogic.gdx.backends.lwjgl3.Lwjgl3GLES20") && q1.g.f81386i == null) {
            c(i11, pixmap, i12, i13);
        } else {
            q1.g.f81384g.glTexImage2D(i11, 0, pixmap.d1(), pixmap.i1(), pixmap.f1(), 0, pixmap.c1(), pixmap.e1(), pixmap.h1());
            q1.g.f81385h.l3(i11);
        }
    }

    public static void e(int i11, Pixmap pixmap) {
        q1.g.f81384g.glTexImage2D(i11, 0, pixmap.d1(), pixmap.i1(), pixmap.f1(), 0, pixmap.c1(), pixmap.e1(), pixmap.h1());
        q1.g.f81385h.l3(i11);
    }

    public static void f(boolean z11) {
        f74218a = z11;
    }
}
