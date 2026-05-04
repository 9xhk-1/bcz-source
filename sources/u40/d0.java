package u40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0<Target> extends a<Target, Integer> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b<Target, Integer> f91776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91778c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f91779d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Integer f91780e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final m<Target> f91781f;

    /* renamed from: g, reason: collision with root package name */
    public final int f91782g;

    public /* synthetic */ d0(b bVar, int i11, int i12, String str, Integer num, m mVar, int i13, kotlin.jvm.internal.v vVar) {
        this(bVar, i11, i12, (i13 & 8) != 0 ? bVar.getName() : str, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : mVar);
    }

    @Override // u40.n
    @m80.k
    public b<Target, Integer> a() {
        return this.f91776a;
    }

    @Override // u40.n
    @m80.l
    public m<Target> b() {
        return this.f91781f;
    }

    @Override // u40.n
    @m80.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultValue() {
        return this.f91780e;
    }

    public final int d() {
        return this.f91782g;
    }

    public final int e() {
        return this.f91778c;
    }

    public final int f() {
        return this.f91777b;
    }

    @Override // u40.n
    @m80.k
    public String getName() {
        return this.f91779d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@m80.k b<? super Target, Integer> accessor, int i11, int i12, @m80.k String name, @m80.l Integer num, @m80.l m<? super Target> mVar) {
        int i13;
        g0.p(accessor, "accessor");
        g0.p(name, "name");
        this.f91776a = accessor;
        this.f91777b = i11;
        this.f91778c = i12;
        this.f91779d = name;
        this.f91780e = num;
        this.f91781f = mVar;
        if (i12 < 10) {
            i13 = 1;
        } else if (i12 < 100) {
            i13 = 2;
        } else {
            if (i12 >= 1000) {
                throw new IllegalArgumentException("Max value " + i12 + " is too large");
            }
            i13 = 3;
        }
        this.f91782g = i13;
    }
}
