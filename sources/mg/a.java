package mg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.AdCommonHelper;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final int f73240k = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f73241a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73242b;

    /* renamed from: c, reason: collision with root package name */
    public int f73243c;

    /* renamed from: d, reason: collision with root package name */
    public int f73244d;

    /* renamed from: e, reason: collision with root package name */
    public float f73245e;

    /* renamed from: f, reason: collision with root package name */
    public float f73246f;

    /* renamed from: g, reason: collision with root package name */
    public float f73247g;

    /* renamed from: h, reason: collision with root package name */
    public float f73248h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f73249i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public String f73250j;

    public a() {
        this(0L, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public static /* synthetic */ a l(a aVar, long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = aVar.f73241a;
        }
        return aVar.k(j11, (i13 & 2) != 0 ? aVar.f73242b : j12, (i13 & 4) != 0 ? aVar.f73243c : i11, (i13 & 8) != 0 ? aVar.f73244d : i12, (i13 & 16) != 0 ? aVar.f73245e : f11, (i13 & 32) != 0 ? aVar.f73246f : f12, (i13 & 64) != 0 ? aVar.f73247g : f13, (i13 & 128) != 0 ? aVar.f73248h : f14, (i13 & 256) != 0 ? aVar.f73249i : str, (i13 & 512) != 0 ? aVar.f73250j : str2);
    }

    public final void A(float f11) {
        this.f73248h = f11;
    }

    public final void B(int i11) {
        this.f73244d = i11;
    }

    public final void C(int i11) {
        this.f73243c = i11;
    }

    public final long a() {
        return this.f73241a;
    }

    @k
    public final String b() {
        return this.f73250j;
    }

    public final long c() {
        return this.f73242b;
    }

    public final int d() {
        return this.f73243c;
    }

    public final int e() {
        return this.f73244d;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f73241a == aVar.f73241a && this.f73242b == aVar.f73242b && this.f73243c == aVar.f73243c && this.f73244d == aVar.f73244d && Float.compare(this.f73245e, aVar.f73245e) == 0 && Float.compare(this.f73246f, aVar.f73246f) == 0 && Float.compare(this.f73247g, aVar.f73247g) == 0 && Float.compare(this.f73248h, aVar.f73248h) == 0 && g0.g(this.f73249i, aVar.f73249i) && g0.g(this.f73250j, aVar.f73250j);
    }

    public final float f() {
        return this.f73245e;
    }

    public final float g() {
        return this.f73246f;
    }

    public final float h() {
        return this.f73247g;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f73241a) * 31) + Long.hashCode(this.f73242b)) * 31) + Integer.hashCode(this.f73243c)) * 31) + Integer.hashCode(this.f73244d)) * 31) + Float.hashCode(this.f73245e)) * 31) + Float.hashCode(this.f73246f)) * 31) + Float.hashCode(this.f73247g)) * 31) + Float.hashCode(this.f73248h)) * 31) + this.f73249i.hashCode()) * 31) + this.f73250j.hashCode();
    }

    public final float i() {
        return this.f73248h;
    }

    @k
    public final String j() {
        return this.f73249i;
    }

    @k
    public final a k(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, @k String ua2, @k String price) {
        g0.p(ua2, "ua");
        g0.p(price, "price");
        return new a(j11, j12, i11, i12, f11, f12, f13, f14, ua2, price);
    }

    public final float m() {
        return this.f73245e;
    }

    public final float n() {
        return this.f73246f;
    }

    @k
    public final String o() {
        return this.f73250j;
    }

    public final long p() {
        return this.f73242b;
    }

    public final long q() {
        return this.f73241a;
    }

    @k
    public final String r() {
        return this.f73249i;
    }

    public final float s() {
        return this.f73247g;
    }

    public final float t() {
        return this.f73248h;
    }

    @k
    public String toString() {
        return "AdReportModel(timeSec=" + this.f73241a + ", timeMSec=" + this.f73242b + ", vWidth=" + this.f73243c + ", vHeight=" + this.f73244d + ", downX=" + this.f73245e + ", downY=" + this.f73246f + ", upX=" + this.f73247g + ", upY=" + this.f73248h + ", ua=" + this.f73249i + ", price=" + this.f73250j + j.f81007d;
    }

    public final int u() {
        return this.f73244d;
    }

    public final int v() {
        return this.f73243c;
    }

    public final void w(float f11) {
        this.f73245e = f11;
    }

    public final void x(float f11) {
        this.f73246f = f11;
    }

    public final void y(@k String str) {
        g0.p(str, "<set-?>");
        this.f73250j = str;
    }

    public final void z(float f11) {
        this.f73247g = f11;
    }

    public a(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, @k String ua2, @k String price) {
        g0.p(ua2, "ua");
        g0.p(price, "price");
        this.f73241a = j11;
        this.f73242b = j12;
        this.f73243c = i11;
        this.f73244d = i12;
        this.f73245e = f11;
        this.f73246f = f12;
        this.f73247g = f13;
        this.f73248h = f14;
        this.f73249i = ua2;
        this.f73250j = price;
    }

    public /* synthetic */ a(long j11, long j12, int i11, int i12, float f11, float f12, float f13, float f14, String str, String str2, int i13, v vVar) {
        this((i13 & 1) != 0 ? System.currentTimeMillis() / 1000 : j11, (i13 & 2) != 0 ? System.currentTimeMillis() : j12, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? 0.0f : f11, (i13 & 32) != 0 ? 0.0f : f12, (i13 & 64) != 0 ? 0.0f : f13, (i13 & 128) == 0 ? f14 : 0.0f, (i13 & 256) != 0 ? AdCommonHelper.INSTANCE.getMSystemUAStr() : str, (i13 & 512) != 0 ? "" : str2);
    }
}
