package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ZCNMean {
    public static final int $stable = 8;

    @l
    @c("examOrder")
    private final List<Long> examOrder;

    @k
    @c("meanOrder")
    private final List<String> meanOrder;

    public ZCNMean(@l List<Long> list, @k List<String> meanOrder) {
        g0.p(meanOrder, "meanOrder");
        this.examOrder = list;
        this.meanOrder = meanOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZCNMean copy$default(ZCNMean zCNMean, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = zCNMean.examOrder;
        }
        if ((i11 & 2) != 0) {
            list2 = zCNMean.meanOrder;
        }
        return zCNMean.copy(list, list2);
    }

    @l
    public final List<Long> component1() {
        return this.examOrder;
    }

    @k
    public final List<String> component2() {
        return this.meanOrder;
    }

    @k
    public final ZCNMean copy(@l List<Long> list, @k List<String> meanOrder) {
        g0.p(meanOrder, "meanOrder");
        return new ZCNMean(list, meanOrder);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZCNMean)) {
            return false;
        }
        ZCNMean zCNMean = (ZCNMean) obj;
        return g0.g(this.examOrder, zCNMean.examOrder) && g0.g(this.meanOrder, zCNMean.meanOrder);
    }

    @l
    public final List<Long> getExamOrder() {
        return this.examOrder;
    }

    @k
    public final List<String> getMeanOrder() {
        return this.meanOrder;
    }

    public int hashCode() {
        List<Long> list = this.examOrder;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.meanOrder.hashCode();
    }

    @k
    public String toString() {
        return "ZCNMean(examOrder=" + this.examOrder + ", meanOrder=" + this.meanOrder + j.f81007d;
    }
}
