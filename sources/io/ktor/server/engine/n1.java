package io.ktor.server.engine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z f61414a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public String f61415b;

    /* renamed from: c, reason: collision with root package name */
    public int f61416c;

    /* JADX WARN: Multi-variable type inference failed */
    public n1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.server.engine.o1
    public int a() {
        return this.f61416c;
    }

    @Override // io.ktor.server.engine.o1
    @m80.k
    public String b() {
        return this.f61415b;
    }

    @Override // io.ktor.server.engine.o1
    @m80.k
    public z getType() {
        return this.f61414a;
    }

    public void k(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f61415b = str;
    }

    public void l(int i11) {
        this.f61416c = i11;
    }

    @m80.k
    public String toString() {
        return getType().f() + ' ' + b() + ':' + a();
    }

    public n1(@m80.k z type) {
        kotlin.jvm.internal.g0.p(type, "type");
        this.f61414a = type;
        this.f61415b = "0.0.0.0";
        this.f61416c = 80;
    }

    public /* synthetic */ n1(z zVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? z.f61475b.a() : zVar);
    }
}
