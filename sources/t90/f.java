package t90;

import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends q90.a<e, h> {
    public f() {
        this(null, null);
    }

    @Override // q90.a
    public void d(String[] strArr, int[] iArr) {
        if (s().M0() == null) {
            s().W0(new b(strArr, iArr));
        }
    }

    @Override // q90.a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public e f() {
        return new e();
    }

    @Override // q90.a
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public h g() {
        return new h();
    }

    @Override // q90.a
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d h(e eVar) {
        return new d(eVar);
    }

    @Override // q90.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public g i(Writer writer, h hVar) {
        return new g(writer, hVar);
    }

    public f(e eVar) {
        this(eVar, null);
    }

    public f(h hVar) {
        this(null, hVar);
    }

    public f(e eVar, h hVar) {
        super("Fixed-width parsing/writing routine", eVar, hVar);
    }
}
