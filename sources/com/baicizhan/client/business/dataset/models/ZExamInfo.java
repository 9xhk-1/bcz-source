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
public final class ZExamInfo {
    public static final int $stable = 0;

    @k
    @c("examName")
    private final String examName;

    @c("nums")
    private final int nums;

    @c("recent")
    private final int recent;

    public ZExamInfo(int i11, @k String examName, int i12) {
        g0.p(examName, "examName");
        this.recent = i11;
        this.examName = examName;
        this.nums = i12;
    }

    public static /* synthetic */ ZExamInfo copy$default(ZExamInfo zExamInfo, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = zExamInfo.recent;
        }
        if ((i13 & 2) != 0) {
            str = zExamInfo.examName;
        }
        if ((i13 & 4) != 0) {
            i12 = zExamInfo.nums;
        }
        return zExamInfo.copy(i11, str, i12);
    }

    public final int component1() {
        return this.recent;
    }

    @k
    public final String component2() {
        return this.examName;
    }

    public final int component3() {
        return this.nums;
    }

    @k
    public final ZExamInfo copy(int i11, @k String examName, int i12) {
        g0.p(examName, "examName");
        return new ZExamInfo(i11, examName, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZExamInfo)) {
            return false;
        }
        ZExamInfo zExamInfo = (ZExamInfo) obj;
        return this.recent == zExamInfo.recent && g0.g(this.examName, zExamInfo.examName) && this.nums == zExamInfo.nums;
    }

    @k
    public final String getExamName() {
        return this.examName;
    }

    public final int getNums() {
        return this.nums;
    }

    public final int getRecent() {
        return this.recent;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.recent) * 31) + this.examName.hashCode()) * 31) + Integer.hashCode(this.nums);
    }

    @k
    public String toString() {
        return "ZExamInfo(recent=" + this.recent + ", examName=" + this.examName + ", nums=" + this.nums + j.f81007d;
    }
}
