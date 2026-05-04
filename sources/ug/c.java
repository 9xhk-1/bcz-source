package ug;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f92198e = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f92200d;

    public /* synthetic */ c(String str, int i11, v vVar) {
        this(str, i11);
    }

    public static /* synthetic */ c e(c cVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cVar.f92199c;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.f92200d;
        }
        return cVar.d(str, i11);
    }

    @Override // ug.b
    @k
    public String a() {
        return this.f92199c;
    }

    @k
    public final String b() {
        return this.f92199c;
    }

    public final int c() {
        return this.f92200d;
    }

    @k
    public final c d(@k String key, int i11) {
        g0.p(key, "key");
        return new c(key, i11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f92199c, cVar.f92199c) && a.f(this.f92200d, cVar.f92200d);
    }

    public final int f() {
        return this.f92200d;
    }

    public int hashCode() {
        return (this.f92199c.hashCode() * 31) + a.h(this.f92200d);
    }

    @k
    public String toString() {
        return "IslandInfo(key=" + this.f92199c + ", buildable=" + a.i(this.f92200d) + j.f81007d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String key, int i11) {
        super(key, null);
        g0.p(key, "key");
        this.f92199c = key;
        this.f92200d = i11;
    }

    public /* synthetic */ c(String str, int i11, int i12, v vVar) {
        this(str, (i12 & 2) != 0 ? a.f92192b.b() : i11, null);
    }
}
