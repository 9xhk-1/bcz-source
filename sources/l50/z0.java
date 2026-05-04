package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z0 extends c {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final k50.b f70091j;

    /* renamed from: k, reason: collision with root package name */
    public final int f70092k;

    /* renamed from: l, reason: collision with root package name */
    public int f70093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(@m80.k k50.a json, @m80.k k50.b value) {
        super(json, value, null, 4, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f70091j = value;
        this.f70092k = o0().size();
        this.f70093l = -1;
    }

    @Override // j50.s1
    @m80.k
    public String O(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // l50.c
    @m80.k
    public k50.k W(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return o0().get(Integer.parseInt(tag));
    }

    @Override // i50.d
    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        int i11 = this.f70093l;
        if (i11 >= this.f70092k - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f70093l = i12;
        return i12;
    }

    @Override // l50.c
    @m80.k
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public k50.b o0() {
        return this.f70091j;
    }
}
