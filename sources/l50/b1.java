package l50;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b1 extends x0 {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final k50.i0 f69945n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final List<String> f69946o;

    /* renamed from: p, reason: collision with root package name */
    public final int f69947p;

    /* renamed from: q, reason: collision with root package name */
    public int f69948q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(@m80.k k50.a json, @m80.k k50.i0 value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f69945n = value;
        List<String> a62 = a00.r0.a6(o0().keySet());
        this.f69946o = a62;
        this.f69947p = a62.size() * 2;
        this.f69948q = -1;
    }

    @Override // l50.x0, j50.s1
    @m80.k
    public String O(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return this.f69946o.get(i11 / 2);
    }

    @Override // l50.x0, l50.c
    @m80.k
    public k50.k W(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return this.f69948q % 2 == 0 ? k50.o.d(tag) : (k50.k) a00.l1.K(o0(), tag);
    }

    @Override // l50.x0, i50.d
    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        int i11 = this.f69948q;
        if (i11 >= this.f69947p - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f69948q = i12;
        return i12;
    }

    @Override // l50.x0, l50.c, j50.h3, i50.d
    public void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
    }

    @Override // l50.x0, l50.c
    @m80.k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public k50.i0 o0() {
        return this.f69945n;
    }
}
