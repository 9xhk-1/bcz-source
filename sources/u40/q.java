package u40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q<Target, Type> extends a<Target, Type> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b<Target, Type> f91799a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f91800b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Type f91801c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final m<Target> f91802d;

    public /* synthetic */ q(b bVar, String str, Object obj, m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this(bVar, (i11 & 2) != 0 ? bVar.getName() : str, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : mVar);
    }

    @Override // u40.n
    @m80.k
    public b<Target, Type> a() {
        return this.f91799a;
    }

    @Override // u40.n
    @m80.l
    public m<Target> b() {
        return this.f91802d;
    }

    @Override // u40.n
    @m80.l
    public Type getDefaultValue() {
        return this.f91801c;
    }

    @Override // u40.n
    @m80.k
    public String getName() {
        return this.f91800b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@m80.k b<? super Target, Type> accessor, @m80.k String name, @m80.l Type type, @m80.l m<? super Target> mVar) {
        g0.p(accessor, "accessor");
        g0.p(name, "name");
        this.f91799a = accessor;
        this.f91800b = name;
        this.f91801c = type;
        this.f91802d = mVar;
    }
}
