package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.reflect.ReflectionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p0<T> extends j0<T> {

    /* renamed from: d, reason: collision with root package name */
    public final g3.d f1614d;

    public p0(Class<T> cls) {
        this(cls, 16, Integer.MAX_VALUE);
    }

    @Override // a3.j0
    public T g() {
        try {
            return (T) this.f1614d.d(null);
        } catch (Exception e11) {
            throw new GdxRuntimeException("Unable to create new instance: " + this.f1614d.a().getName(), e11);
        }
    }

    @d0
    public final g3.d j(Class<T> cls) {
        try {
            try {
                return g3.c.e(cls, null);
            } catch (Exception unused) {
                g3.d i11 = g3.c.i(cls, null);
                i11.e(true);
                return i11;
            }
        } catch (ReflectionException unused2) {
            return null;
        }
    }

    public p0(Class<T> cls, int i11) {
        this(cls, i11, Integer.MAX_VALUE);
    }

    public p0(Class<T> cls, int i11, int i12) {
        super(i11, i12);
        g3.d j11 = j(cls);
        this.f1614d = j11;
        if (j11 != null) {
            return;
        }
        throw new RuntimeException("Class cannot be created (missing no-arg constructor): " + cls.getName());
    }
}
