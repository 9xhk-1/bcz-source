package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZTvInfo {
    public static final int $stable = 0;

    @k
    @c("tvPath")
    private final String tvPath;

    @k
    @c("tvSnapshot")
    private final String tvSnapshot;

    public ZTvInfo(@k String tvPath, @k String tvSnapshot) {
        g0.p(tvPath, "tvPath");
        g0.p(tvSnapshot, "tvSnapshot");
        this.tvPath = tvPath;
        this.tvSnapshot = tvSnapshot;
    }

    public static /* synthetic */ ZTvInfo copy$default(ZTvInfo zTvInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zTvInfo.tvPath;
        }
        if ((i11 & 2) != 0) {
            str2 = zTvInfo.tvSnapshot;
        }
        return zTvInfo.copy(str, str2);
    }

    @k
    public final String component1() {
        return this.tvPath;
    }

    @k
    public final String component2() {
        return this.tvSnapshot;
    }

    @k
    public final ZTvInfo copy(@k String tvPath, @k String tvSnapshot) {
        g0.p(tvPath, "tvPath");
        g0.p(tvSnapshot, "tvSnapshot");
        return new ZTvInfo(tvPath, tvSnapshot);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZTvInfo)) {
            return false;
        }
        ZTvInfo zTvInfo = (ZTvInfo) obj;
        return g0.g(this.tvPath, zTvInfo.tvPath) && g0.g(this.tvSnapshot, zTvInfo.tvSnapshot);
    }

    @k
    public final String getTvPath() {
        return this.tvPath;
    }

    @k
    public final String getTvSnapshot() {
        return this.tvSnapshot;
    }

    public int hashCode() {
        return (this.tvPath.hashCode() * 31) + this.tvSnapshot.hashCode();
    }

    @k
    public String toString() {
        return "ZTvInfo(tvPath=" + this.tvPath + ", tvSnapshot=" + this.tvSnapshot + j.f81007d;
    }
}
