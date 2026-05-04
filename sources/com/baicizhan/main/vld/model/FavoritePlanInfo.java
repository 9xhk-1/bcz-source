package com.baicizhan.main.vld.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class FavoritePlanInfo implements Serializable {
    public static final int $stable = 0;
    private final long bookId;
    private final int planCount;

    public FavoritePlanInfo(long j11, int i11) {
        this.bookId = j11;
        this.planCount = i11;
    }

    public static /* synthetic */ FavoritePlanInfo copy$default(FavoritePlanInfo favoritePlanInfo, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = favoritePlanInfo.bookId;
        }
        if ((i12 & 2) != 0) {
            i11 = favoritePlanInfo.planCount;
        }
        return favoritePlanInfo.copy(j11, i11);
    }

    public final long component1() {
        return this.bookId;
    }

    public final int component2() {
        return this.planCount;
    }

    @k
    public final FavoritePlanInfo copy(long j11, int i11) {
        return new FavoritePlanInfo(j11, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritePlanInfo)) {
            return false;
        }
        FavoritePlanInfo favoritePlanInfo = (FavoritePlanInfo) obj;
        return this.bookId == favoritePlanInfo.bookId && this.planCount == favoritePlanInfo.planCount;
    }

    public final long getBookId() {
        return this.bookId;
    }

    public final int getPlanCount() {
        return this.planCount;
    }

    public int hashCode() {
        return (Long.hashCode(this.bookId) * 31) + Integer.hashCode(this.planCount);
    }

    @k
    public String toString() {
        return "FavoritePlanInfo(bookId=" + this.bookId + ", planCount=" + this.planCount + j.f81007d;
    }

    public /* synthetic */ FavoritePlanInfo(long j11, int i11, int i12, v vVar) {
        this(j11, (i12 & 2) != 0 ? 0 : i11);
    }
}
