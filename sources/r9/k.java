package r9;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.AdCommonHelper;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final int f83767k = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f83768a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83769b;

    /* renamed from: c, reason: collision with root package name */
    public int f83770c;

    /* renamed from: d, reason: collision with root package name */
    public int f83771d;

    /* renamed from: e, reason: collision with root package name */
    public float f83772e;

    /* renamed from: f, reason: collision with root package name */
    public float f83773f;

    /* renamed from: g, reason: collision with root package name */
    public float f83774g;

    /* renamed from: h, reason: collision with root package name */
    public float f83775h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final String f83776i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public String f83777j;

    public k() {
        this(0L, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public static /* synthetic */ k l(k kVar, long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = kVar.f83768a;
        }
        return kVar.k(j11, (i13 & 2) != 0 ? kVar.f83769b : j12, (i13 & 4) != 0 ? kVar.f83770c : i11, (i13 & 8) != 0 ? kVar.f83771d : i12, (i13 & 16) != 0 ? kVar.f83772e : f11, (i13 & 32) != 0 ? kVar.f83773f : f12, (i13 & 64) != 0 ? kVar.f83774g : f13, (i13 & 128) != 0 ? kVar.f83775h : f14, (i13 & 256) != 0 ? kVar.f83776i : str, (i13 & 512) != 0 ? kVar.f83777j : str2);
    }

    public final void A(float f11) {
        this.f83775h = f11;
    }

    public final void B(int i11) {
        this.f83771d = i11;
    }

    public final void C(int i11) {
        this.f83770c = i11;
    }

    public final long a() {
        return this.f83768a;
    }

    @m80.k
    public final String b() {
        return this.f83777j;
    }

    public final long c() {
        return this.f83769b;
    }

    public final int d() {
        return this.f83770c;
    }

    public final int e() {
        return this.f83771d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f83768a == kVar.f83768a && this.f83769b == kVar.f83769b && this.f83770c == kVar.f83770c && this.f83771d == kVar.f83771d && Float.compare(this.f83772e, kVar.f83772e) == 0 && Float.compare(this.f83773f, kVar.f83773f) == 0 && Float.compare(this.f83774g, kVar.f83774g) == 0 && Float.compare(this.f83775h, kVar.f83775h) == 0 && g0.g(this.f83776i, kVar.f83776i) && g0.g(this.f83777j, kVar.f83777j);
    }

    public final float f() {
        return this.f83772e;
    }

    public final float g() {
        return this.f83773f;
    }

    public final float h() {
        return this.f83774g;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f83768a) * 31) + Long.hashCode(this.f83769b)) * 31) + Integer.hashCode(this.f83770c)) * 31) + Integer.hashCode(this.f83771d)) * 31) + Float.hashCode(this.f83772e)) * 31) + Float.hashCode(this.f83773f)) * 31) + Float.hashCode(this.f83774g)) * 31) + Float.hashCode(this.f83775h)) * 31) + this.f83776i.hashCode()) * 31) + this.f83777j.hashCode();
    }

    public final float i() {
        return this.f83775h;
    }

    @m80.k
    public final String j() {
        return this.f83776i;
    }

    @m80.k
    public final k k(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, @m80.k String ua2, @m80.k String price) {
        g0.p(ua2, "ua");
        g0.p(price, "price");
        return new k(j11, j12, i11, i12, f11, f12, f13, f14, ua2, price);
    }

    public final float m() {
        return this.f83772e;
    }

    public final float n() {
        return this.f83773f;
    }

    @m80.k
    public final String o() {
        return this.f83777j;
    }

    public final long p() {
        return this.f83769b;
    }

    public final long q() {
        return this.f83768a;
    }

    @m80.k
    public final String r() {
        return this.f83776i;
    }

    public final float s() {
        return this.f83774g;
    }

    public final float t() {
        return this.f83775h;
    }

    @m80.k
    public String toString() {
        return "AdReportModel(timeSec=" + this.f83768a + ", timeMSec=" + this.f83769b + ", vWidth=" + this.f83770c + ", vHeight=" + this.f83771d + ", downX=" + this.f83772e + ", downY=" + this.f83773f + ", upX=" + this.f83774g + ", upY=" + this.f83775h + ", ua=" + this.f83776i + ", price=" + this.f83777j + pn.j.f81007d;
    }

    public final int u() {
        return this.f83771d;
    }

    public final int v() {
        return this.f83770c;
    }

    public final void w(float f11) {
        this.f83772e = f11;
    }

    public final void x(float f11) {
        this.f83773f = f11;
    }

    public final void y(@m80.k String str) {
        g0.p(str, "<set-?>");
        this.f83777j = str;
    }

    public final void z(float f11) {
        this.f83774g = f11;
    }

    public k(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, @m80.k String ua2, @m80.k String price) {
        g0.p(ua2, "ua");
        g0.p(price, "price");
        this.f83768a = j11;
        this.f83769b = j12;
        this.f83770c = i11;
        this.f83771d = i12;
        this.f83772e = f11;
        this.f83773f = f12;
        this.f83774g = f13;
        this.f83775h = f14;
        this.f83776i = ua2;
        this.f83777j = price;
    }

    public /* synthetic */ k(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, String str, String str2, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? System.currentTimeMillis() / 1000 : j11, (i13 & 2) != 0 ? System.currentTimeMillis() : j12, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? 0.0f : f11, (i13 & 32) != 0 ? 0.0f : f12, (i13 & 64) != 0 ? 0.0f : f13, (i13 & 128) == 0 ? f14 : 0.0f, (i13 & 256) != 0 ? AdCommonHelper.INSTANCE.getMSystemUAStr() : str, (i13 & 512) != 0 ? "" : str2);
    }
}
