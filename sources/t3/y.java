package t3;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y implements l {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f89299b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f89300c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f89301d;

    public y(@m80.k com.baicizhan.app.preferences.a bczPreference, @m80.k String scope) {
        g0.p(bczPreference, "bczPreference");
        g0.p(scope, "scope");
        this.f89299b = bczPreference;
        this.f89300c = scope;
        this.f89301d = yz.e0.c(new x00.a() { // from class: t3.x
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g g11;
                g11 = y.g(y.this);
                return g11;
            }
        });
    }

    private final com.baicizhan.app.preferences.g e() {
        return (com.baicizhan.app.preferences.g) this.f89301d.getValue();
    }

    public static final com.baicizhan.app.preferences.g g(y yVar) {
        return yVar.f89299b.a(yVar.f89300c);
    }

    @Override // t3.l
    @m80.l
    public Object a(@m80.k j00.c<? super g2> cVar) {
        Object a11 = e().a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @Override // t3.l
    @m80.l
    public Object b(@m80.k byte[] bArr, @m80.k j00.c<? super g2> cVar) {
        Object e11 = e().e(this.f89300c + m.f89272a, bArr, cVar);
        return e11 == kotlin.coroutines.intrinsics.b.l() ? e11 : g2.f100423a;
    }

    @Override // t3.l
    @m80.l
    public Object c(@m80.k j00.c<? super byte[]> cVar) {
        return e().c(this.f89300c + m.f89272a, null, cVar);
    }

    @m80.k
    public final String f() {
        return this.f89300c;
    }
}
