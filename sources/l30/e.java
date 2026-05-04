package l30;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public c<T> f69771a;

    public e(@m80.k c<T> arrayMap) {
        g0.p(arrayMap, "arrayMap");
        this.f69771a = arrayMap;
    }

    @Override // l30.a
    @m80.k
    public final c<T> a() {
        return this.f69771a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l30.a
    public final void f(@m80.k String keyQualifiedName, @m80.k T value) {
        g0.p(keyQualifiedName, "keyQualifiedName");
        g0.p(value, "value");
        int e11 = b().e(keyQualifiedName);
        int a11 = this.f69771a.a();
        if (a11 == 0) {
            this.f69771a = new o(value, e11);
            return;
        }
        if (a11 == 1) {
            c<T> cVar = this.f69771a;
            g0.n(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.d() == e11) {
                this.f69771a = new o(value, e11);
                return;
            } else {
                d dVar = new d();
                this.f69771a = dVar;
                dVar.b(oVar.d(), oVar.f());
            }
        }
        this.f69771a.b(e11, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            l30.i r0 = l30.i.f69784a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.g0.n(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.e.<init>():void");
    }
}
