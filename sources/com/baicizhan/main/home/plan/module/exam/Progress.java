package com.baicizhan.main.home.plan.module.exam;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class Progress {
    public static final int $stable = 0;
    private final int finishedWordsCount;
    private final int remainDaysCount;
    private final int totalWordsCount;

    public Progress(int i11, int i12, int i13) {
        this.totalWordsCount = i11;
        this.remainDaysCount = i12;
        this.finishedWordsCount = i13;
    }

    public static /* synthetic */ Progress copy$default(Progress progress, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = progress.totalWordsCount;
        }
        if ((i14 & 2) != 0) {
            i12 = progress.remainDaysCount;
        }
        if ((i14 & 4) != 0) {
            i13 = progress.finishedWordsCount;
        }
        return progress.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.totalWordsCount;
    }

    public final int component2() {
        return this.remainDaysCount;
    }

    public final int component3() {
        return this.finishedWordsCount;
    }

    @k
    public final Progress copy(int i11, int i12, int i13) {
        return new Progress(i11, i12, i13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Progress)) {
            return false;
        }
        Progress progress = (Progress) obj;
        return this.totalWordsCount == progress.totalWordsCount && this.remainDaysCount == progress.remainDaysCount && this.finishedWordsCount == progress.finishedWordsCount;
    }

    public final int getFinishedWordsCount() {
        return this.finishedWordsCount;
    }

    public final int getRemainDaysCount() {
        return this.remainDaysCount;
    }

    public final int getTotalWordsCount() {
        return this.totalWordsCount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.totalWordsCount) * 31) + Integer.hashCode(this.remainDaysCount)) * 31) + Integer.hashCode(this.finishedWordsCount);
    }

    @k
    public String toString() {
        return "Progress(totalWordsCount=" + this.totalWordsCount + ", remainDaysCount=" + this.remainDaysCount + ", finishedWordsCount=" + this.finishedWordsCount + j.f81007d;
    }
}
