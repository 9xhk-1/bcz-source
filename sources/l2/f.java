package l2;

import k2.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public final b.a f69171b;

    public f(b.a aVar) {
        this.f69171b = aVar == null ? new b.a() : aVar;
    }

    @Override // l2.c
    public x1.k b(x1.i iVar) {
        return new k2.b(iVar, this.f69171b);
    }

    public f(String str, String str2) {
        this(new b.a(str, str2));
    }

    public f(v1.a aVar, v1.a aVar2) {
        this(aVar.I(), aVar2.I());
    }

    public f() {
        this(null);
    }
}
