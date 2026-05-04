package t0;

import m80.k;
import m80.l;
import o0.e;
import o0.g;
import o0.m;
import t0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f89100a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f89101b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c.a {
        @Override // t0.c.a
        @k
        public c a(@k d dVar, @k g gVar) {
            return new b(dVar, gVar);
        }

        public boolean equals(@l Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(@k d dVar, @k g gVar) {
        this.f89100a = dVar;
        this.f89101b = gVar;
    }

    @Override // t0.c
    public void a() {
        g gVar = this.f89101b;
        if (gVar instanceof m) {
            this.f89100a.a(((m) gVar).a());
        } else if (gVar instanceof e) {
            this.f89100a.g(gVar.a());
        }
    }
}
