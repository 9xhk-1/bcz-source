package ug;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f92201d = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k String key) {
        super(key, null);
        g0.p(key, "key");
        this.f92202c = key;
    }

    public static /* synthetic */ d d(d dVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f92202c;
        }
        return dVar.c(str);
    }

    @Override // ug.b
    @k
    public String a() {
        return this.f92202c;
    }

    @k
    public final String b() {
        return this.f92202c;
    }

    @k
    public final d c(@k String key) {
        g0.p(key, "key");
        return new d(key);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f92202c, ((d) obj).f92202c);
    }

    public int hashCode() {
        return this.f92202c.hashCode();
    }

    @k
    public String toString() {
        return "Milestone(key=" + this.f92202c + j.f81007d;
    }
}
