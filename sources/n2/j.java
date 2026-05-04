package n2;

import com.badlogic.gdx.graphics.glutils.HdpiMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static HdpiMode f74165a = HdpiMode.Logical;

    public static void a(int i11, int i12, int i13, int i14) {
        if (f74165a != HdpiMode.Logical || (q1.g.f81379b.getWidth() == q1.g.f81379b.D() && q1.g.f81379b.getHeight() == q1.g.f81379b.T())) {
            q1.g.f81384g.glScissor(i11, i12, i13, i14);
        } else {
            q1.g.f81384g.glScissor(d(i11), e(i12), d(i13), e(i14));
        }
    }

    public static void b(int i11, int i12, int i13, int i14) {
        if (f74165a != HdpiMode.Logical || (q1.g.f81379b.getWidth() == q1.g.f81379b.D() && q1.g.f81379b.getHeight() == q1.g.f81379b.T())) {
            q1.g.f81384g.glViewport(i11, i12, i13, i14);
        } else {
            q1.g.f81384g.glViewport(d(i11), e(i12), d(i13), e(i14));
        }
    }

    public static void c(HdpiMode hdpiMode) {
        f74165a = hdpiMode;
    }

    public static int d(int i11) {
        return (int) ((i11 * q1.g.f81379b.D()) / q1.g.f81379b.getWidth());
    }

    public static int e(int i11) {
        return (int) ((i11 * q1.g.f81379b.T()) / q1.g.f81379b.getHeight());
    }

    public static int f(int i11) {
        return (int) ((i11 * q1.g.f81379b.getWidth()) / q1.g.f81379b.D());
    }

    public static int g(int i11) {
        return (int) ((i11 * q1.g.f81379b.getHeight()) / q1.g.f81379b.T());
    }
}
