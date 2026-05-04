package o;

import a00.r0;
import java.util.ArrayList;
import java.util.List;
import l.f;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Object> f75423a = new ArrayList();

    @Override // l.f
    public void a(int i11, @l Boolean bool) {
        this.f75423a.add(bool);
    }

    @Override // l.f
    public void b(int i11, @l Double d11) {
        this.f75423a.add(d11);
    }

    @Override // l.f
    public void bindString(int i11, @l String str) {
        this.f75423a.add(str);
    }

    @Override // l.f
    public void c(int i11, @l Long l11) {
        this.f75423a.add(l11);
    }

    @Override // l.f
    public void e(int i11, @l byte[] bArr) {
        this.f75423a.add(bArr);
    }

    @k
    public final List<Object> f() {
        List<Object> a62 = r0.a6(this.f75423a);
        this.f75423a.clear();
        return a62;
    }
}
