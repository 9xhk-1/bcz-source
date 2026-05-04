package j;

import j.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransacter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transacter.kt\napp/cash/sqldelight/TransacterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
/* loaded from: classes3.dex */
public abstract class v extends c implements t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@m80.k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    public final <R> R H(boolean z11, x00.l<? super z<R>, ? extends R> lVar) {
        R r11;
        t.b value = C().s6().getValue();
        t.b h11 = value.h();
        if (h11 != null && z11) {
            throw new IllegalStateException("Already in a transaction");
        }
        Throwable th2 = null;
        try {
            value.u(this);
            r11 = lVar.invoke(new z(value));
            try {
                value.t(true);
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            r11 = null;
            th2 = th4;
        }
        value.j();
        return (R) G(value, h11, th2, r11);
    }

    @Override // j.t
    public void m(boolean z11, @m80.k x00.l<? super y, g2> body) {
        g0.p(body, "body");
        H(z11, body);
    }

    @Override // j.t
    public <R> R n(boolean z11, @m80.k x00.l<? super x<R>, ? extends R> bodyWithReturn) {
        g0.p(bodyWithReturn, "bodyWithReturn");
        return (R) H(z11, bodyWithReturn);
    }
}
