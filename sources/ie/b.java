package ie;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f60522g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f60523a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f60524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f60525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f60526d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f60527e;

    /* renamed from: f, reason: collision with root package name */
    public final long f60528f;

    public b(int i11, @k String title, @k String jump, @k String contentImage, @l String str, long j11) {
        g0.p(title, "title");
        g0.p(jump, "jump");
        g0.p(contentImage, "contentImage");
        this.f60523a = i11;
        this.f60524b = title;
        this.f60525c = jump;
        this.f60526d = contentImage;
        this.f60527e = str;
        this.f60528f = j11;
    }

    public static /* synthetic */ b h(b bVar, int i11, String str, String str2, String str3, String str4, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f60523a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f60524b;
        }
        if ((i12 & 4) != 0) {
            str2 = bVar.f60525c;
        }
        if ((i12 & 8) != 0) {
            str3 = bVar.f60526d;
        }
        if ((i12 & 16) != 0) {
            str4 = bVar.f60527e;
        }
        if ((i12 & 32) != 0) {
            j11 = bVar.f60528f;
        }
        long j12 = j11;
        String str5 = str4;
        String str6 = str2;
        return bVar.g(i11, str, str6, str3, str5, j12);
    }

    public final int a() {
        return this.f60523a;
    }

    @k
    public final String b() {
        return this.f60524b;
    }

    @k
    public final String c() {
        return this.f60525c;
    }

    @k
    public final String d() {
        return this.f60526d;
    }

    @l
    public final String e() {
        return this.f60527e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60523a == bVar.f60523a && g0.g(this.f60524b, bVar.f60524b) && g0.g(this.f60525c, bVar.f60525c) && g0.g(this.f60526d, bVar.f60526d) && g0.g(this.f60527e, bVar.f60527e) && this.f60528f == bVar.f60528f;
    }

    public final long f() {
        return this.f60528f;
    }

    @k
    public final b g(int i11, @k String title, @k String jump, @k String contentImage, @l String str, long j11) {
        g0.p(title, "title");
        g0.p(jump, "jump");
        g0.p(contentImage, "contentImage");
        return new b(i11, title, jump, contentImage, str, j11);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f60523a) * 31) + this.f60524b.hashCode()) * 31) + this.f60525c.hashCode()) * 31) + this.f60526d.hashCode()) * 31;
        String str = this.f60527e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f60528f);
    }

    @k
    public final String i() {
        return this.f60526d;
    }

    public final int j() {
        return this.f60523a;
    }

    @k
    public final String k() {
        return this.f60525c;
    }

    public final long l() {
        return this.f60528f;
    }

    @l
    public final String m() {
        return this.f60527e;
    }

    @k
    public final String n() {
        return this.f60524b;
    }

    @k
    public String toString() {
        return "MyDevice(deviceType=" + this.f60523a + ", title=" + this.f60524b + ", jump=" + this.f60525c + ", contentImage=" + this.f60526d + ", tipImage=" + this.f60527e + ", timeStamp=" + this.f60528f + j.f81007d;
    }
}
