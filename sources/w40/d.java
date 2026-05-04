package w40;

import kotlin.jvm.internal.g0;
import w40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d<Receiver> extends e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    public final int f95230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95231d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a<Receiver, t40.c> f95232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, int i12, @m80.k a<? super Receiver, t40.c> setter, @m80.k String name) {
        super(i11 == i12 ? Integer.valueOf(i11) : null, name, null);
        g0.p(setter, "setter");
        g0.p(name, "name");
        this.f95230c = i11;
        this.f95231d = i12;
        this.f95232e = setter;
        if (1 > i11 || i11 >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i11 + " for field " + c() + ": expected 1..9").toString());
        }
        if (i11 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(("Invalid maximum length " + i12 + " for field " + c() + ": expected " + i11 + "..9").toString());
        }
    }

    @Override // w40.e
    @m80.l
    public g a(Receiver receiver, @m80.k CharSequence input, int i11, int i12) {
        int d11;
        g f11;
        g0.p(input, "input");
        int i13 = i12 - i11;
        int i14 = this.f95230c;
        if (i13 < i14) {
            return new g.c(i14);
        }
        int i15 = this.f95231d;
        if (i13 > i15) {
            return new g.d(i15);
        }
        a<Receiver, t40.c> aVar = this.f95232e;
        d11 = f.d(input, i11, i12);
        f11 = f.f(aVar, receiver, new t40.c(d11, i13));
        return f11;
    }
}
