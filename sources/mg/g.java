package mg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.ad_property.AdExtraResp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f73257f = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f73258a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f73259b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f73260c;

    /* renamed from: d, reason: collision with root package name */
    public int f73261d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AdExtraResp f73262e;

    public g(@k String id2, @k String imageUrl, @l String str, int i11, @l AdExtraResp adExtraResp) {
        g0.p(id2, "id");
        g0.p(imageUrl, "imageUrl");
        this.f73258a = id2;
        this.f73259b = imageUrl;
        this.f73260c = str;
        this.f73261d = i11;
        this.f73262e = adExtraResp;
    }

    public static /* synthetic */ g g(g gVar, String str, String str2, String str3, int i11, AdExtraResp adExtraResp, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gVar.f73258a;
        }
        if ((i12 & 2) != 0) {
            str2 = gVar.f73259b;
        }
        if ((i12 & 4) != 0) {
            str3 = gVar.f73260c;
        }
        if ((i12 & 8) != 0) {
            i11 = gVar.f73261d;
        }
        if ((i12 & 16) != 0) {
            adExtraResp = gVar.f73262e;
        }
        AdExtraResp adExtraResp2 = adExtraResp;
        String str4 = str3;
        return gVar.f(str, str2, str4, i11, adExtraResp2);
    }

    @k
    public final String a() {
        return this.f73258a;
    }

    @k
    public final String b() {
        return this.f73259b;
    }

    @l
    public final String c() {
        return this.f73260c;
    }

    public final int d() {
        return this.f73261d;
    }

    @l
    public final AdExtraResp e() {
        return this.f73262e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f73258a, gVar.f73258a) && g0.g(this.f73259b, gVar.f73259b) && g0.g(this.f73260c, gVar.f73260c) && this.f73261d == gVar.f73261d && g0.g(this.f73262e, gVar.f73262e);
    }

    @k
    public final g f(@k String id2, @k String imageUrl, @l String str, int i11, @l AdExtraResp adExtraResp) {
        g0.p(id2, "id");
        g0.p(imageUrl, "imageUrl");
        return new g(id2, imageUrl, str, i11, adExtraResp);
    }

    @l
    public final AdExtraResp h() {
        return this.f73262e;
    }

    public int hashCode() {
        int hashCode = ((this.f73258a.hashCode() * 31) + this.f73259b.hashCode()) * 31;
        String str = this.f73260c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f73261d)) * 31;
        AdExtraResp adExtraResp = this.f73262e;
        return hashCode2 + (adExtraResp != null ? adExtraResp.hashCode() : 0);
    }

    @k
    public final String i() {
        return this.f73258a;
    }

    @k
    public final String j() {
        return this.f73259b;
    }

    public final int k() {
        return this.f73261d;
    }

    @l
    public final String l() {
        return this.f73260c;
    }

    public final void m(int i11) {
        this.f73261d = i11;
    }

    @k
    public String toString() {
        return "WordAdCard(id=" + this.f73258a + ", imageUrl=" + this.f73259b + ", link=" + this.f73260c + ", index=" + this.f73261d + ", adResp=" + this.f73262e + j.f81007d;
    }

    public /* synthetic */ g(String str, String str2, String str3, int i11, AdExtraResp adExtraResp, int i12, v vVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? 0 : i11, adExtraResp);
    }
}
