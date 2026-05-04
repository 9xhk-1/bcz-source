package ki;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.vld.model.WifiFreqType;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f66590d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f66591a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final WifiFreqType f66592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66593c;

    public l(@m80.k String ssid, @m80.k WifiFreqType wifiType, int i11) {
        g0.p(ssid, "ssid");
        g0.p(wifiType, "wifiType");
        this.f66591a = ssid;
        this.f66592b = wifiType;
        this.f66593c = i11;
    }

    public static /* synthetic */ l e(l lVar, String str, WifiFreqType wifiFreqType, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lVar.f66591a;
        }
        if ((i12 & 2) != 0) {
            wifiFreqType = lVar.f66592b;
        }
        if ((i12 & 4) != 0) {
            i11 = lVar.f66593c;
        }
        return lVar.d(str, wifiFreqType, i11);
    }

    @m80.k
    public final String a() {
        return this.f66591a;
    }

    @m80.k
    public final WifiFreqType b() {
        return this.f66592b;
    }

    public final int c() {
        return this.f66593c;
    }

    @m80.k
    public final l d(@m80.k String ssid, @m80.k WifiFreqType wifiType, int i11) {
        g0.p(ssid, "ssid");
        g0.p(wifiType, "wifiType");
        return new l(ssid, wifiType, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f66591a, lVar.f66591a) && this.f66592b == lVar.f66592b && this.f66593c == lVar.f66593c;
    }

    public final int f() {
        return this.f66593c;
    }

    @m80.k
    public final String g() {
        return this.f66591a;
    }

    @m80.k
    public final WifiFreqType h() {
        return this.f66592b;
    }

    public int hashCode() {
        return (((this.f66591a.hashCode() * 31) + this.f66592b.hashCode()) * 31) + Integer.hashCode(this.f66593c);
    }

    @m80.k
    public String toString() {
        return "WifiInfo(ssid=" + this.f66591a + ", wifiType=" + this.f66592b + ", level=" + this.f66593c + pn.j.f81007d;
    }
}
