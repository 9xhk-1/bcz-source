package u90;

import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends q90.a<c, f> {
    public d() {
        this(null, null);
    }

    @Override // q90.a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public c f() {
        return new c();
    }

    @Override // q90.a
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public f g() {
        return new f();
    }

    @Override // q90.a
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b h(c cVar) {
        return new b(cVar);
    }

    @Override // q90.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public e i(Writer writer, f fVar) {
        return new e(writer, fVar);
    }

    public d(c cVar) {
        this(cVar, null);
    }

    public d(f fVar) {
        this(null, fVar);
    }

    public d(c cVar, f fVar) {
        super("TSV parsing/writing routine", cVar, fVar);
    }
}
