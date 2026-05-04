package za0;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h10.d<?> f102474a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102475b;

    public d(@k h10.d<?> type) {
        g0.p(type, "type");
        this.f102474a = type;
        this.f102475b = fb0.b.a(type);
    }

    @k
    public final h10.d<?> a() {
        return this.f102474a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == obj.getClass() && g0.g(getValue(), ((d) obj).getValue());
    }

    @Override // za0.a
    @k
    public String getValue() {
        return this.f102475b;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @k
    public String toString() {
        return getValue();
    }
}
