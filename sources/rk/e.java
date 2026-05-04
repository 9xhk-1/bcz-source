package rk;

import androidx.annotation.NonNull;
import fl.m;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e<T> implements u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f84235a;

    public e(@NonNull T t11) {
        this.f84235a = (T) m.e(t11);
    }

    @Override // kk.u
    @NonNull
    public Class<T> a() {
        return (Class<T>) this.f84235a.getClass();
    }

    @Override // kk.u
    @NonNull
    public final T get() {
        return this.f84235a;
    }

    @Override // kk.u
    public final int getSize() {
        return 1;
    }

    @Override // kk.u
    public void recycle() {
    }
}
