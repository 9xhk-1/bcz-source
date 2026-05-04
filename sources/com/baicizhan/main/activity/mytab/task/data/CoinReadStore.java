package com.baicizhan.main.activity.mytab.task.data;

import com.baicizhan.client.business.util.NoProguard;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
final class CoinReadStore implements NoProguard {
    private final int count;
    private final long readDay;

    public CoinReadStore(long j11, int i11) {
        this.readDay = j11;
        this.count = i11;
    }

    public static /* synthetic */ CoinReadStore copy$default(CoinReadStore coinReadStore, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = coinReadStore.readDay;
        }
        if ((i12 & 2) != 0) {
            i11 = coinReadStore.count;
        }
        return coinReadStore.copy(j11, i11);
    }

    public final long component1() {
        return this.readDay;
    }

    public final int component2() {
        return this.count;
    }

    @k
    public final CoinReadStore copy(long j11, int i11) {
        return new CoinReadStore(j11, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinReadStore)) {
            return false;
        }
        CoinReadStore coinReadStore = (CoinReadStore) obj;
        return this.readDay == coinReadStore.readDay && this.count == coinReadStore.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getReadDay() {
        return this.readDay;
    }

    public int hashCode() {
        return (Long.hashCode(this.readDay) * 31) + Integer.hashCode(this.count);
    }

    @k
    public String toString() {
        return "CoinReadStore(readDay=" + this.readDay + ", count=" + this.count + j.f81007d;
    }
}
