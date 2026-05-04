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
public final class UserIdentityLevelInfo implements NoProguard {
    public static final int $stable = 8;

    @k
    private final List<String> categories;
    private final int identityId;

    public UserIdentityLevelInfo(int i11, @k List<String> categories) {
        g0.p(categories, "categories");
        this.identityId = i11;
        this.categories = categories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserIdentityLevelInfo copy$default(UserIdentityLevelInfo userIdentityLevelInfo, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = userIdentityLevelInfo.identityId;
        }
        if ((i12 & 2) != 0) {
            list = userIdentityLevelInfo.categories;
        }
        return userIdentityLevelInfo.copy(i11, list);
    }

    public final int component1() {
        return this.identityId;
    }

    @k
    public final List<String> component2() {
        return this.categories;
    }

    @k
    public final UserIdentityLevelInfo copy(int i11, @k List<String> categories) {
        g0.p(categories, "categories");
        return new UserIdentityLevelInfo(i11, categories);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserIdentityLevelInfo)) {
            return false;
        }
        UserIdentityLevelInfo userIdentityLevelInfo = (UserIdentityLevelInfo) obj;
        return this.identityId == userIdentityLevelInfo.identityId && g0.g(this.categories, userIdentityLevelInfo.categories);
    }

    @k
    public final List<String> getCategories() {
        return this.categories;
    }

    public final int getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.identityId) * 31) + this.categories.hashCode();
    }

    @k
    public String toString() {
        return "UserIdentityLevelInfo(identityId=" + this.identityId + ", categories=" + this.categories + j.f81007d;
    }
}
