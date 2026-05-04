package cl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public abstract class n<Z> extends b<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final int f8769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8770c;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // cl.p
    public final void j(@NonNull o oVar) {
        if (fl.o.x(this.f8769b, this.f8770c)) {
            oVar.e(this.f8769b, this.f8770c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f8769b + " and height: " + this.f8770c + ", either provide dimensions in the constructor or call override()");
    }

    public n(int i11, int i12) {
        this.f8769b = i11;
        this.f8770c = i12;
    }

    @Override // cl.p
    public void g(@NonNull o oVar) {
    }
}
