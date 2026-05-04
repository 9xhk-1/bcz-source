package wa;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.auth.share.ShareChannel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f96018e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ShareChannel f96019a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96021c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96022d;

    public a(@k ShareChannel channel, @k String channelName, int i11, boolean z11) {
        g0.p(channel, "channel");
        g0.p(channelName, "channelName");
        this.f96019a = channel;
        this.f96020b = channelName;
        this.f96021c = i11;
        this.f96022d = z11;
    }

    public static /* synthetic */ a f(a aVar, ShareChannel shareChannel, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            shareChannel = aVar.f96019a;
        }
        if ((i12 & 2) != 0) {
            str = aVar.f96020b;
        }
        if ((i12 & 4) != 0) {
            i11 = aVar.f96021c;
        }
        if ((i12 & 8) != 0) {
            z11 = aVar.f96022d;
        }
        return aVar.e(shareChannel, str, i11, z11);
    }

    @k
    public final ShareChannel a() {
        return this.f96019a;
    }

    @k
    public final String b() {
        return this.f96020b;
    }

    public final int c() {
        return this.f96021c;
    }

    public final boolean d() {
        return this.f96022d;
    }

    @k
    public final a e(@k ShareChannel channel, @k String channelName, int i11, boolean z11) {
        g0.p(channel, "channel");
        g0.p(channelName, "channelName");
        return new a(channel, channelName, i11, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96019a == aVar.f96019a && g0.g(this.f96020b, aVar.f96020b) && this.f96021c == aVar.f96021c && this.f96022d == aVar.f96022d;
    }

    @k
    public final ShareChannel g() {
        return this.f96019a;
    }

    public final int h() {
        return this.f96021c;
    }

    public int hashCode() {
        return (((((this.f96019a.hashCode() * 31) + this.f96020b.hashCode()) * 31) + Integer.hashCode(this.f96021c)) * 31) + Boolean.hashCode(this.f96022d);
    }

    @k
    public final String i() {
        return this.f96020b;
    }

    public final boolean j() {
        return this.f96022d;
    }

    @k
    public String toString() {
        return "ShareChannelInfo(channel=" + this.f96019a + ", channelName=" + this.f96020b + ", channelImage=" + this.f96021c + ", enabled=" + this.f96022d + j.f81007d;
    }

    public /* synthetic */ a(ShareChannel shareChannel, String str, int i11, boolean z11, int i12, v vVar) {
        this(shareChannel, str, i11, (i12 & 8) != 0 ? false : z11);
    }
}
