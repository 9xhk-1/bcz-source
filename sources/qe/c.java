package qe;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final int f82061h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f82062a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82063b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f82064c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f82065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82067f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82068g;

    public c(int i11, @k String name, @l String str, @k String cover, int i12, int i13, boolean z11) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        this.f82062a = i11;
        this.f82063b = name;
        this.f82064c = str;
        this.f82065d = cover;
        this.f82066e = i12;
        this.f82067f = i13;
        this.f82068g = z11;
    }

    public static /* synthetic */ c i(c cVar, int i11, String str, String str2, String str3, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = cVar.f82062a;
        }
        if ((i14 & 2) != 0) {
            str = cVar.f82063b;
        }
        if ((i14 & 4) != 0) {
            str2 = cVar.f82064c;
        }
        if ((i14 & 8) != 0) {
            str3 = cVar.f82065d;
        }
        if ((i14 & 16) != 0) {
            i12 = cVar.f82066e;
        }
        if ((i14 & 32) != 0) {
            i13 = cVar.f82067f;
        }
        if ((i14 & 64) != 0) {
            z11 = cVar.f82068g;
        }
        int i15 = i13;
        boolean z12 = z11;
        int i16 = i12;
        String str4 = str2;
        return cVar.h(i11, str, str4, str3, i16, i15, z12);
    }

    public final int a() {
        return this.f82062a;
    }

    @k
    public final String b() {
        return this.f82063b;
    }

    @l
    public final String c() {
        return this.f82064c;
    }

    @k
    public final String d() {
        return this.f82065d;
    }

    public final int e() {
        return this.f82066e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f82062a == cVar.f82062a && g0.g(this.f82063b, cVar.f82063b) && g0.g(this.f82064c, cVar.f82064c) && g0.g(this.f82065d, cVar.f82065d) && this.f82066e == cVar.f82066e && this.f82067f == cVar.f82067f && this.f82068g == cVar.f82068g;
    }

    public final int f() {
        return this.f82067f;
    }

    public final boolean g() {
        return this.f82068g;
    }

    @k
    public final c h(int i11, @k String name, @l String str, @k String cover, int i12, int i13, boolean z11) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        return new c(i11, name, str, cover, i12, i13, z11);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f82062a) * 31) + this.f82063b.hashCode()) * 31;
        String str = this.f82064c;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f82065d.hashCode()) * 31) + Integer.hashCode(this.f82066e)) * 31) + Integer.hashCode(this.f82067f)) * 31) + Boolean.hashCode(this.f82068g);
    }

    public final boolean j() {
        return this.f82068g;
    }

    @k
    public final String k() {
        return this.f82065d;
    }

    @l
    public final String l() {
        return this.f82064c;
    }

    public final int m() {
        return this.f82062a;
    }

    @k
    public final String n() {
        return this.f82063b;
    }

    public final int o() {
        return this.f82067f;
    }

    public final int p() {
        return this.f82066e;
    }

    public final void q(boolean z11) {
        this.f82068g = z11;
    }

    @k
    public String toString() {
        return "BookInfo(id=" + this.f82062a + ", name=" + this.f82063b + ", description=" + this.f82064c + ", cover=" + this.f82065d + ", wordsCount=" + this.f82066e + ", type=" + this.f82067f + ", added=" + this.f82068g + j.f81007d;
    }

    public /* synthetic */ c(int i11, String str, String str2, String str3, int i12, int i13, boolean z11, int i14, v vVar) {
        this(i11, str, str2, str3, i12, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? false : z11);
    }
}
