package l2;

import k2.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends c {

    /* renamed from: b, reason: collision with root package name */
    public final c.a f69185b;

    public h(c.a aVar) {
        this.f69185b = aVar == null ? new c.a() : aVar;
    }

    @Override // l2.c
    public x1.k b(x1.i iVar) {
        return new k2.c(iVar, this.f69185b);
    }

    public h(String str, String str2) {
        this(new c.a(str, str2));
    }

    public h(v1.a aVar, v1.a aVar2) {
        this(aVar.I(), aVar2.I());
    }

    public h() {
        this(null);
    }
}
