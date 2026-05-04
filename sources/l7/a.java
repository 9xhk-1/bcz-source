package l7;

import com.baicizhan.app.api.AppType;
import com.baicizhan.app.biz.platform.DeviceType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AppType f70538a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final DeviceType f70539b;

    public a(@m80.k AppType appType, @m80.k DeviceType deviceType) {
        kotlin.jvm.internal.g0.p(appType, "appType");
        kotlin.jvm.internal.g0.p(deviceType, "deviceType");
        this.f70538a = appType;
        this.f70539b = deviceType;
    }

    public static /* synthetic */ a d(a aVar, AppType appType, DeviceType deviceType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appType = aVar.f70538a;
        }
        if ((i11 & 2) != 0) {
            deviceType = aVar.f70539b;
        }
        return aVar.c(appType, deviceType);
    }

    @m80.k
    public final AppType a() {
        return this.f70538a;
    }

    @m80.k
    public final DeviceType b() {
        return this.f70539b;
    }

    @m80.k
    public final a c(@m80.k AppType appType, @m80.k DeviceType deviceType) {
        kotlin.jvm.internal.g0.p(appType, "appType");
        kotlin.jvm.internal.g0.p(deviceType, "deviceType");
        return new a(appType, deviceType);
    }

    @m80.k
    public final AppType e() {
        return this.f70538a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f70538a == aVar.f70538a && this.f70539b == aVar.f70539b;
    }

    @m80.k
    public final DeviceType f() {
        return this.f70539b;
    }

    public int hashCode() {
        return (this.f70538a.hashCode() * 31) + this.f70539b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AppOSPair(appType=" + this.f70538a + ", deviceType=" + this.f70539b + ')';
    }
}
