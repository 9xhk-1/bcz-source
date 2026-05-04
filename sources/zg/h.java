package zg;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final int f102669e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102672c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f102673d;

    public h(@k String aid, @k String img, int i11, @k String link) {
        g0.p(aid, "aid");
        g0.p(img, "img");
        g0.p(link, "link");
        this.f102670a = aid;
        this.f102671b = img;
        this.f102672c = i11;
        this.f102673d = link;
    }

    public static /* synthetic */ h f(h hVar, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = hVar.f102670a;
        }
        if ((i12 & 2) != 0) {
            str2 = hVar.f102671b;
        }
        if ((i12 & 4) != 0) {
            i11 = hVar.f102672c;
        }
        if ((i12 & 8) != 0) {
            str3 = hVar.f102673d;
        }
        return hVar.e(str, str2, i11, str3);
    }

    @k
    public final String a() {
        return this.f102670a;
    }

    @k
    public final String b() {
        return this.f102671b;
    }

    public final int c() {
        return this.f102672c;
    }

    @k
    public final String d() {
        return this.f102673d;
    }

    @k
    public final h e(@k String aid, @k String img, int i11, @k String link) {
        g0.p(aid, "aid");
        g0.p(img, "img");
        g0.p(link, "link");
        return new h(aid, img, i11, link);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f102670a, hVar.f102670a) && g0.g(this.f102671b, hVar.f102671b) && this.f102672c == hVar.f102672c && g0.g(this.f102673d, hVar.f102673d);
    }

    public final int g() {
        return this.f102672c;
    }

    @k
    public final String h() {
        return this.f102670a;
    }

    public int hashCode() {
        return (((((this.f102670a.hashCode() * 31) + this.f102671b.hashCode()) * 31) + Integer.hashCode(this.f102672c)) * 31) + this.f102673d.hashCode();
    }

    @k
    public final String i() {
        return this.f102671b;
    }

    @k
    public final String j() {
        return this.f102673d;
    }

    @k
    public String toString() {
        return "TrainingBanner(aid=" + this.f102670a + ", img=" + this.f102671b + ", action=" + this.f102672c + ", link=" + this.f102673d + j.f81007d;
    }

    public /* synthetic */ h(String str, String str2, int i11, String str3, int i12, v vVar) {
        this(str, str2, (i12 & 4) != 0 ? 0 : i11, str3);
    }
}
