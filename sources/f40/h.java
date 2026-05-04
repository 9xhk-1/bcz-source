package f40;

import java.util.List;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f50921a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final l00.c f50922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50923c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<StackTraceElement> f50924d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f50925e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Thread f50926f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final l00.c f50927g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final List<StackTraceElement> f50928h;

    public h(@m80.k i iVar, @m80.k kotlin.coroutines.d dVar) {
        this.f50921a = dVar;
        this.f50922b = iVar.d();
        this.f50923c = iVar.f50930b;
        this.f50924d = iVar.e();
        this.f50925e = iVar.g();
        this.f50926f = iVar.lastObservedThread;
        this.f50927g = iVar.f();
        this.f50928h = iVar.h();
    }

    @m80.k
    public final kotlin.coroutines.d a() {
        return this.f50921a;
    }

    @m80.l
    public final l00.c b() {
        return this.f50922b;
    }

    @m80.k
    public final List<StackTraceElement> c() {
        return this.f50924d;
    }

    @m80.l
    public final l00.c d() {
        return this.f50927g;
    }

    @m80.l
    public final Thread e() {
        return this.f50926f;
    }

    public final long f() {
        return this.f50923c;
    }

    @m80.k
    public final String g() {
        return this.f50925e;
    }

    @w00.j(name = "lastObservedStackTrace")
    @m80.k
    public final List<StackTraceElement> h() {
        return this.f50928h;
    }
}
