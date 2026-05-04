package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZMean {
    public static final int $stable = 0;

    @c("mId")
    private final long mId;

    @k
    @c(t.f26099a)
    private final String mean;

    @k
    @c("meanType")
    private final String meanType;

    @l
    @c("percent")
    private final String percent;

    public ZMean(long j11, @k String meanType, @k String mean, @l String str) {
        g0.p(meanType, "meanType");
        g0.p(mean, "mean");
        this.mId = j11;
        this.meanType = meanType;
        this.mean = mean;
        this.percent = str;
    }

    public static /* synthetic */ ZMean copy$default(ZMean zMean, long j11, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zMean.mId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = zMean.meanType;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = zMean.mean;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = zMean.percent;
        }
        return zMean.copy(j12, str4, str5, str3);
    }

    public final long component1() {
        return this.mId;
    }

    @k
    public final String component2() {
        return this.meanType;
    }

    @k
    public final String component3() {
        return this.mean;
    }

    @l
    public final String component4() {
        return this.percent;
    }

    @k
    public final ZMean copy(long j11, @k String meanType, @k String mean, @l String str) {
        g0.p(meanType, "meanType");
        g0.p(mean, "mean");
        return new ZMean(j11, meanType, mean, str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZMean)) {
            return false;
        }
        ZMean zMean = (ZMean) obj;
        return this.mId == zMean.mId && g0.g(this.meanType, zMean.meanType) && g0.g(this.mean, zMean.mean) && g0.g(this.percent, zMean.percent);
    }

    public final long getMId() {
        return this.mId;
    }

    @k
    public final String getMean() {
        return this.mean;
    }

    @k
    public final String getMeanType() {
        return this.meanType;
    }

    @l
    public final String getPercent() {
        return this.percent;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.mId) * 31) + this.meanType.hashCode()) * 31) + this.mean.hashCode()) * 31;
        String str = this.percent;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        return "ZMean(mId=" + this.mId + ", meanType=" + this.meanType + ", mean=" + this.mean + ", percent=" + this.percent + j.f81007d;
    }
}
