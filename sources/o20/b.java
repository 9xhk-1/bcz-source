package o20;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f75589a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f75590b;

    @k
    public String a() {
        return b().getDescription();
    }

    @k
    public d b() {
        return this.f75590b;
    }

    @k
    public String toString() {
        String a11 = a();
        if (a11.length() <= 0) {
            return this.f75589a;
        }
        return this.f75589a + " (" + a11 + ')';
    }
}
