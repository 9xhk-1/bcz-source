package za0;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102473a;

    public c(@k String value) {
        g0.p(value, "value");
        this.f102473a = value;
    }

    public static /* synthetic */ c c(c cVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f102473a;
        }
        return cVar.b(str);
    }

    @k
    public final String a() {
        return this.f102473a;
    }

    @k
    public final c b(@k String value) {
        g0.p(value, "value");
        return new c(value);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g0.g(this.f102473a, ((c) obj).f102473a);
    }

    @Override // za0.a
    @k
    public String getValue() {
        return this.f102473a;
    }

    public int hashCode() {
        return this.f102473a.hashCode();
    }

    @k
    public String toString() {
        return getValue();
    }
}
