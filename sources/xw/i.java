package xw;

import cx.y;
import io.ktor.client.plugins.logging.LogLevel;
import io.ktor.utils.io.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public e f98411c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public List<x00.l<y, Boolean>> f98409a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<s> f98410b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public LogLevel f98412d = LogLevel.HEADERS;

    public static /* synthetic */ void g(i iVar, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "***";
        }
        iVar.f(str, lVar);
    }

    public final void a(@m80.k x00.l<? super y, Boolean> predicate) {
        g0.p(predicate, "predicate");
        this.f98409a.add(predicate);
    }

    @m80.k
    public final List<x00.l<y, Boolean>> b() {
        return this.f98409a;
    }

    @m80.k
    public final LogLevel c() {
        return this.f98412d;
    }

    @m80.k
    public final e d() {
        e eVar = this.f98411c;
        return eVar == null ? g.e(e.f98405a) : eVar;
    }

    @m80.k
    public final List<s> e() {
        return this.f98410b;
    }

    public final void f(@m80.k String placeholder, @m80.k x00.l<? super String, Boolean> predicate) {
        g0.p(placeholder, "placeholder");
        g0.p(predicate, "predicate");
        this.f98410b.add(new s(placeholder, predicate));
    }

    public final void h(@m80.k List<x00.l<y, Boolean>> list) {
        g0.p(list, "<set-?>");
        this.f98409a = list;
    }

    public final void i(@m80.k LogLevel logLevel) {
        g0.p(logLevel, "<set-?>");
        this.f98412d = logLevel;
    }

    public final void j(@m80.k e value) {
        g0.p(value, "value");
        this.f98411c = value;
    }
}
