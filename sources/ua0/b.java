package ua0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.koin.core.logger.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,61:1\n43#1:62\n43#1:63\n*S KotlinDebug\n*F\n+ 1 Logger.kt\norg/koin/core/logger/Logger\n*L\n46#1:62\n50#1:63\n*E\n"})
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Level f92090a;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(@k String msg) {
        g0.p(msg, "msg");
        g(Level.DEBUG, msg);
    }

    public abstract void b(@k Level level, @k String str);

    public final void c(@k String msg) {
        g0.p(msg, "msg");
        g(Level.ERROR, msg);
    }

    @k
    public final Level d() {
        return this.f92090a;
    }

    public final void e(@k String msg) {
        g0.p(msg, "msg");
        g(Level.INFO, msg);
    }

    public final boolean f(@k Level lvl) {
        g0.p(lvl, "lvl");
        return d().compareTo(lvl) <= 0;
    }

    public final void g(@k Level lvl, @k String msg) {
        g0.p(lvl, "lvl");
        g0.p(msg, "msg");
        if (d().compareTo(lvl) <= 0) {
            b(lvl, msg);
        }
    }

    public final void h(@k Level lvl, @k x00.a<String> msg) {
        g0.p(lvl, "lvl");
        g0.p(msg, "msg");
        if (d().compareTo(lvl) <= 0) {
            b(lvl, msg.invoke());
        }
    }

    public final void i(@k Level level) {
        g0.p(level, "<set-?>");
        this.f92090a = level;
    }

    public final void j(@k String msg) {
        g0.p(msg, "msg");
        g(Level.WARNING, msg);
    }

    public b(@k Level level) {
        g0.p(level, "level");
        this.f92090a = level;
    }

    public /* synthetic */ b(Level level, int i11, v vVar) {
        this((i11 & 1) != 0 ? Level.INFO : level);
    }
}
