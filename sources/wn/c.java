package wn;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import wn.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface c<C extends d> extends pn.b {
    public static final int W0 = 1;
    public static final int X0 = 2;
    public static final int Y0 = 3;
    public static final int Z0 = 5;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f96515a1 = 0;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f96516b1 = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: wn.c$c, reason: collision with other inner class name */
    public @interface InterfaceC1294c {
    }

    void a(C c11);

    void e(C c11);

    void g(int i11);

    int getState();
}
