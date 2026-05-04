package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AllTopCategoryInfo implements NoProguard {
    public static final int $stable = 8;

    @k
    private final String categoryName;

    @k
    private final List<String> subCategoryIds;

    public AllTopCategoryInfo(@k String categoryName, @k List<String> subCategoryIds) {
        g0.p(categoryName, "categoryName");
        g0.p(subCategoryIds, "subCategoryIds");
        this.categoryName = categoryName;
        this.subCategoryIds = subCategoryIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllTopCategoryInfo copy$default(AllTopCategoryInfo allTopCategoryInfo, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = allTopCategoryInfo.categoryName;
        }
        if ((i11 & 2) != 0) {
            list = allTopCategoryInfo.subCategoryIds;
        }
        return allTopCategoryInfo.copy(str, list);
    }

    @k
    public final String component1() {
        return this.categoryName;
    }

    @k
    public final List<String> component2() {
        return this.subCategoryIds;
    }

    @k
    public final AllTopCategoryInfo copy(@k String categoryName, @k List<String> subCategoryIds) {
        g0.p(categoryName, "categoryName");
        g0.p(subCategoryIds, "subCategoryIds");
        return new AllTopCategoryInfo(categoryName, subCategoryIds);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllTopCategoryInfo)) {
            return false;
        }
        AllTopCategoryInfo allTopCategoryInfo = (AllTopCategoryInfo) obj;
        return g0.g(this.categoryName, allTopCategoryInfo.categoryName) && g0.g(this.subCategoryIds, allTopCategoryInfo.subCategoryIds);
    }

    @k
    public final String getCategoryName() {
        return this.categoryName;
    }

    @k
    public final List<String> getSubCategoryIds() {
        return this.subCategoryIds;
    }

    public int hashCode() {
        return (this.categoryName.hashCode() * 31) + this.subCategoryIds.hashCode();
    }

    @k
    public String toString() {
        return "AllTopCategoryInfo(categoryName=" + this.categoryName + ", subCategoryIds=" + this.subCategoryIds + j.f81007d;
    }
}
