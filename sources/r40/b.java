package r40;

import kotlin.DeprecationLevel;
import kotlin.time.Instant;
import kotlin.time.n;
import kotlinx.datetime.LocalDate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements w30.b {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.time.m f83056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Instant f83057c;

        public a(kotlin.time.n nVar, Instant instant) {
            this.f83057c = instant;
            this.f83056b = nVar.a();
        }

        @Override // w30.b
        public Instant a() {
            return this.f83057c.m6321plusLRDsOJo(this.f83056b.a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r40.b$b, reason: collision with other inner class name */
    public static final class C1030b implements n.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w30.b f83058b;

        public C1030b(w30.b bVar) {
            this.f83058b = bVar;
        }

        @Override // kotlin.time.n
        @w30.h
        public kotlin.time.d a() {
            return new b0(this.f83058b.a(), this.f83058b);
        }
    }

    @m80.k
    public static final w30.b a(@m80.k kotlin.time.n nVar, @m80.k Instant origin) {
        kotlin.jvm.internal.g0.p(nVar, "<this>");
        kotlin.jvm.internal.g0.p(origin, "origin");
        return new a(nVar, origin);
    }

    @w30.h
    @yz.n(level = DeprecationLevel.WARNING, message = "This function is deprecated because Clock.System.asTimeSource can be confused with TimeSource.Monotonic, which are very different. See https://github.com/Kotlin/kotlinx-datetime/issues/372")
    @m80.k
    public static final n.c b(@m80.k w30.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return new C1030b(bVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use Clock.todayIn instead", replaceWith = @yz.w0(expression = "this.todayIn(timeZone)", imports = {}))
    @m80.k
    public static final LocalDate c(@m80.k w30.b bVar, @m80.k kotlinx.datetime.q timeZone) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(timeZone, "timeZone");
        return r40.a.d(bVar, timeZone);
    }

    @m80.k
    public static final LocalDate d(@m80.k w30.b bVar, @m80.k kotlinx.datetime.q timeZone) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(timeZone, "timeZone");
        return t2.i(bVar.a(), timeZone).getDate();
    }
}
