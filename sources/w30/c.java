package w30;

import kotlin.jvm.internal.g0;
import kotlin.time.Instant;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements b {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.time.m f94771b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Instant f94772c;

        public a(kotlin.time.n nVar, Instant instant) {
            this.f94772c = instant;
            this.f94771b = nVar.a();
        }

        @Override // w30.b
        public Instant a() {
            return this.f94772c.m6321plusLRDsOJo(this.f94771b.a());
        }
    }

    @w00.j(name = "fromTimeSource")
    @y0(version = "2.2")
    @m80.k
    @h
    public static final b a(@m80.k kotlin.time.n nVar, @m80.k Instant origin) {
        g0.p(nVar, "<this>");
        g0.p(origin, "origin");
        return new a(nVar, origin);
    }
}
