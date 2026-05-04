package qe;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f82057d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f82058a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f82059b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82060c;

    public b(@k String title, @k List<String> subTypes, int i11) {
        g0.p(title, "title");
        g0.p(subTypes, "subTypes");
        this.f82058a = title;
        this.f82059b = subTypes;
        this.f82060c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b e(b bVar, String str, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bVar.f82058a;
        }
        if ((i12 & 2) != 0) {
            list = bVar.f82059b;
        }
        if ((i12 & 4) != 0) {
            i11 = bVar.f82060c;
        }
        return bVar.d(str, list, i11);
    }

    @k
    public final String a() {
        return this.f82058a;
    }

    @k
    public final List<String> b() {
        return this.f82059b;
    }

    public final int c() {
        return this.f82060c;
    }

    @k
    public final b d(@k String title, @k List<String> subTypes, int i11) {
        g0.p(title, "title");
        g0.p(subTypes, "subTypes");
        return new b(title, subTypes, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f82058a, bVar.f82058a) && g0.g(this.f82059b, bVar.f82059b) && this.f82060c == bVar.f82060c;
    }

    public final int f() {
        return this.f82060c;
    }

    @k
    public final List<String> g() {
        return this.f82059b;
    }

    @k
    public final String h() {
        return this.f82058a;
    }

    public int hashCode() {
        return (((this.f82058a.hashCode() * 31) + this.f82059b.hashCode()) * 31) + Integer.hashCode(this.f82060c);
    }

    @k
    public String toString() {
        return "BookGroup(title=" + this.f82058a + ", subTypes=" + this.f82059b + ", categoryIndex=" + this.f82060c + j.f81007d;
    }

    public /* synthetic */ b(String str, List list, int i11, int i12, v vVar) {
        this(str, list, (i12 & 4) != 0 ? -1 : i11);
    }
}
