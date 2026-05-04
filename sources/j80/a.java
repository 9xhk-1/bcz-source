package j80;

import i80.n;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f63884a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<? extends c> f63885b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63886c;

    public a(Class cls, Class<? extends c> cls2, boolean z11) {
        this.f63884a = cls;
        this.f63885b = cls2;
        this.f63886c = z11;
    }

    @Override // j80.c
    public Class b() {
        return this.f63884a;
    }

    @Override // j80.c
    public boolean c() {
        return this.f63886c;
    }

    @Override // j80.c
    public c d() {
        Class<? extends c> cls = this.f63885b;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        }
    }

    public n e(String str, Class<?> cls) {
        return g(str, cls, ThreadMode.POSTING, 0, false);
    }

    public n f(String str, Class<?> cls, ThreadMode threadMode) {
        return g(str, cls, threadMode, 0, false);
    }

    public n g(String str, Class<?> cls, ThreadMode threadMode, int i11, boolean z11) {
        try {
            return new n(this.f63884a.getDeclaredMethod(str, cls), cls, threadMode, i11, z11);
        } catch (NoSuchMethodException e11) {
            throw new EventBusException("Could not find subscriber method in " + this.f63884a + ". Maybe a missing ProGuard rule?", e11);
        }
    }
}
