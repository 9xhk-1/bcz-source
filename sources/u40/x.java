package u40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x<Object, Field> implements b<Object, Field> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.l<Object, Field> f91813a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f91814b;

    public x(@m80.k h10.l<Object, Field> property, @m80.k String name) {
        g0.p(property, "property");
        g0.p(name, "name");
        this.f91813a = property;
        this.f91814b = name;
    }

    @Override // u40.b
    @m80.l
    public Field a(Object object) {
        return this.f91813a.get(object);
    }

    @Override // w40.a
    @m80.l
    public Field d(Object object, Field field) {
        Field field2 = this.f91813a.get(object);
        if (field2 == null) {
            this.f91813a.set(object, field);
            return null;
        }
        if (g0.g(field2, field)) {
            return null;
        }
        return field2;
    }

    @Override // w40.a
    @m80.k
    public String getName() {
        return this.f91814b;
    }

    public /* synthetic */ x(h10.l lVar, String str, int i11, kotlin.jvm.internal.v vVar) {
        this(lVar, (i11 & 2) != 0 ? lVar.getName() : str);
    }
}
