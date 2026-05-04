package zx;

import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f f103125a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<x00.l<a, g2>> f103126b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<String> f103127c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f103128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103129e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final r f103130f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f103131g;

    public v0(@m80.k f environment, @m80.k List<x00.l<a, g2>> modules, @m80.k List<String> watchPaths, @m80.k String rootPath, boolean z11, @m80.k kotlin.coroutines.d parentCoroutineContext) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(modules, "modules");
        kotlin.jvm.internal.g0.p(watchPaths, "watchPaths");
        kotlin.jvm.internal.g0.p(rootPath, "rootPath");
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        this.f103125a = environment;
        this.f103126b = modules;
        this.f103127c = watchPaths;
        this.f103128d = rootPath;
        this.f103129e = z11;
        r rVar = new r(this, parentCoroutineContext);
        this.f103130f = rVar;
        this.f103131g = rVar.a();
    }

    public final boolean a() {
        return this.f103129e;
    }

    @m80.k
    public final f b() {
        return this.f103125a;
    }

    @m80.k
    public final List<x00.l<a, g2>> c() {
        return this.f103126b;
    }

    @m80.k
    public final kotlin.coroutines.d d() {
        return this.f103131g;
    }

    @m80.k
    public final String e() {
        return this.f103128d;
    }

    @m80.k
    public final List<String> f() {
        return this.f103127c;
    }

    public /* synthetic */ v0(f fVar, List list, List list2, String str, boolean z11, kotlin.coroutines.d dVar, int i11, kotlin.jvm.internal.v vVar) {
        this(fVar, list, list2, str, (i11 & 16) != 0 ? io.ktor.util.a.f61985a.b() : z11, dVar);
    }
}
