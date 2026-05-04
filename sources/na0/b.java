package na0;

import a00.a0;
import a00.l1;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.time.n;
import m80.k;
import org.koin.core.logger.Level;
import org.koin.core.option.KoinOption;
import va0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.a
@u0({"SMAP\nKoinApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinApplication.kt\norg/koin/core/KoinApplication\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,152:1\n43#2:153\n24#3:154\n63#3,3:155\n*S KotlinDebug\n*F\n+ 1 KoinApplication.kt\norg/koin/core/KoinApplication\n*L\n63#1:153\n64#1:154\n64#1:155,3\n*E\n"})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f75035c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final na0.a f75036a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f75037b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final b a() {
            return new b(null);
        }

        public a() {
        }
    }

    public /* synthetic */ b(v vVar) {
        this();
    }

    public static /* synthetic */ b l(b bVar, Level level, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            level = Level.INFO;
        }
        return bVar.k(level);
    }

    public final void a(boolean z11) {
        this.f75037b = z11;
    }

    public final void b() {
        this.f75036a.a();
    }

    public final void c() {
        this.f75036a.b();
    }

    @k
    public final na0.a d() {
        return this.f75036a;
    }

    public final void e(List<c> list) {
        this.f75036a.V(list, this.f75037b, false);
    }

    @k
    public final b f(@k ua0.b logger) {
        g0.p(logger, "logger");
        this.f75036a.Y(logger);
        return this;
    }

    @k
    public final b g(@k List<c> modules) {
        g0.p(modules, "modules");
        ua0.b w11 = this.f75036a.w();
        Level level = Level.INFO;
        if (w11.d().compareTo(level) > 0) {
            e(modules);
            return this;
        }
        long b11 = n.b.f67794b.b();
        e(modules);
        long i11 = n.b.a.i(b11);
        int t11 = this.f75036a.u().t();
        this.f75036a.w().b(level, "Started " + t11 + " definitions in " + db0.a.a(i11) + " ms");
        return this;
    }

    @k
    public final b h(@k c modules) {
        g0.p(modules, "modules");
        return g(a00.g0.l(modules));
    }

    @k
    public final b i(@k c... modules) {
        g0.p(modules, "modules");
        return g(a0.dz(modules));
    }

    @k
    public final b j(@k Pair<? extends KoinOption, ? extends Object>... optionValue) {
        g0.p(optionValue, "optionValue");
        this.f75036a.y().c(l1.H0(optionValue));
        return this;
    }

    @k
    public final b k(@k Level level) {
        g0.p(level, "level");
        this.f75036a.Y(jb0.c.f64013a.c(level));
        return this;
    }

    @k
    public final b m(@k Map<String, ? extends Object> values) {
        g0.p(values, "values");
        this.f75036a.J().e(values);
        return this;
    }

    public final void n(@k List<c> modules) {
        g0.p(modules, "modules");
        this.f75036a.Z(modules);
    }

    public final void o(@k c module) {
        g0.p(module, "module");
        this.f75036a.Z(a00.g0.l(module));
    }

    public b() {
        this.f75036a = new na0.a();
        this.f75037b = true;
    }
}
