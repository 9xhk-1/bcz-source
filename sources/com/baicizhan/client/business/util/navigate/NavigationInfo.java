package com.baicizhan.client.business.util.navigate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class NavigationInfo implements NavigationIntentDescription {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    @c("activity_id")
    private final String activityId;

    @k
    @c(NavigationIntentInfoKt.KEY_ACTIVITY_URL)
    private final String activityUrl;

    @k
    @c(NavigationIntentInfoKt.KEY_SOURCE_ID)
    private final String sourceBczId;

    @k
    @c("url")
    private final String url;

    @k
    @c(NavigationIntentInfoKt.KEY_VISIT_UUID)
    private final String uuid;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @l
        public final NavigationInfo parseFrom(@k String desc) {
            g0.p(desc, "desc");
            try {
                return (NavigationInfo) BczJson.fromJson(desc, NavigationInfo.class);
            } catch (Exception e11) {
                qb.c.d("NavigationInfo", e11.getMessage(), new Object[0]);
                return null;
            }
        }

        private Companion() {
        }
    }

    public NavigationInfo(@k String url, @k String sourceBczId, @k String activityId, @k String activityUrl, @k String uuid) {
        g0.p(url, "url");
        g0.p(sourceBczId, "sourceBczId");
        g0.p(activityId, "activityId");
        g0.p(activityUrl, "activityUrl");
        g0.p(uuid, "uuid");
        this.url = url;
        this.sourceBczId = sourceBczId;
        this.activityId = activityId;
        this.activityUrl = activityUrl;
        this.uuid = uuid;
    }

    public static /* synthetic */ NavigationInfo copy$default(NavigationInfo navigationInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationInfo.url;
        }
        if ((i11 & 2) != 0) {
            str2 = navigationInfo.sourceBczId;
        }
        if ((i11 & 4) != 0) {
            str3 = navigationInfo.activityId;
        }
        if ((i11 & 8) != 0) {
            str4 = navigationInfo.activityUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = navigationInfo.uuid;
        }
        String str6 = str5;
        String str7 = str3;
        return navigationInfo.copy(str, str2, str7, str4, str6);
    }

    @k
    public final String component1() {
        return this.url;
    }

    @k
    public final String component2() {
        return this.sourceBczId;
    }

    @k
    public final String component3() {
        return this.activityId;
    }

    @k
    public final String component4() {
        return this.activityUrl;
    }

    @k
    public final String component5() {
        return this.uuid;
    }

    @k
    public final NavigationInfo copy(@k String url, @k String sourceBczId, @k String activityId, @k String activityUrl, @k String uuid) {
        g0.p(url, "url");
        g0.p(sourceBczId, "sourceBczId");
        g0.p(activityId, "activityId");
        g0.p(activityUrl, "activityUrl");
        g0.p(uuid, "uuid");
        return new NavigationInfo(url, sourceBczId, activityId, activityUrl, uuid);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationInfo)) {
            return false;
        }
        NavigationInfo navigationInfo = (NavigationInfo) obj;
        return g0.g(this.url, navigationInfo.url) && g0.g(this.sourceBczId, navigationInfo.sourceBczId) && g0.g(this.activityId, navigationInfo.activityId) && g0.g(this.activityUrl, navigationInfo.activityUrl) && g0.g(this.uuid, navigationInfo.uuid);
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getActivityId() {
        return this.activityId;
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getActivityUrl() {
        return this.activityUrl;
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getSourceBczId() {
        return this.sourceBczId;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.sourceBczId.hashCode()) * 31) + this.activityId.hashCode()) * 31) + this.activityUrl.hashCode()) * 31) + this.uuid.hashCode();
    }

    @k
    public String toString() {
        return "NavigationInfo(url=" + this.url + ", sourceBczId=" + this.sourceBczId + ", activityId=" + this.activityId + ", activityUrl=" + this.activityUrl + ", uuid=" + this.uuid + j.f81007d;
    }
}
