package com.baicizhan.client.business.util.navigate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.webview.JsonParams;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class NavigationIntentInfo implements NavigationIntentDescription {

    @k
    @c("activity_id")
    private final String activityId;

    @k
    @c(NavigationIntentInfoKt.KEY_ACTIVITY_URL)
    private final String activityUrl;

    @k
    @c("url")
    private final JsonParams.WebActivityIntentI intent;

    @k
    @c(NavigationIntentInfoKt.KEY_SOURCE_ID)
    private final String sourceBczId;

    @k
    @c(NavigationIntentInfoKt.KEY_VISIT_UUID)
    private final String uuid;

    @k
    public static final Helper Helper = new Helper(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Helper {
        public /* synthetic */ Helper(v vVar) {
            this();
        }

        @l
        public final NavigationIntentInfo parseFrom(@k String desc) {
            g0.p(desc, "desc");
            try {
                return (NavigationIntentInfo) BczJson.fromJson(desc, NavigationIntentInfo.class);
            } catch (Exception e11) {
                qb.c.d("NavigationInfo", e11.getMessage(), new Object[0]);
                return null;
            }
        }

        private Helper() {
        }
    }

    public NavigationIntentInfo(@k JsonParams.WebActivityIntentI intent, @k String sourceBczId, @k String activityId, @k String activityUrl, @k String uuid) {
        g0.p(intent, "intent");
        g0.p(sourceBczId, "sourceBczId");
        g0.p(activityId, "activityId");
        g0.p(activityUrl, "activityUrl");
        g0.p(uuid, "uuid");
        this.intent = intent;
        this.sourceBczId = sourceBczId;
        this.activityId = activityId;
        this.activityUrl = activityUrl;
        this.uuid = uuid;
    }

    public static /* synthetic */ NavigationIntentInfo copy$default(NavigationIntentInfo navigationIntentInfo, JsonParams.WebActivityIntentI webActivityIntentI, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            webActivityIntentI = navigationIntentInfo.intent;
        }
        if ((i11 & 2) != 0) {
            str = navigationIntentInfo.sourceBczId;
        }
        if ((i11 & 4) != 0) {
            str2 = navigationIntentInfo.activityId;
        }
        if ((i11 & 8) != 0) {
            str3 = navigationIntentInfo.activityUrl;
        }
        if ((i11 & 16) != 0) {
            str4 = navigationIntentInfo.uuid;
        }
        String str5 = str4;
        String str6 = str2;
        return navigationIntentInfo.copy(webActivityIntentI, str, str6, str3, str5);
    }

    @k
    public final JsonParams.WebActivityIntentI component1() {
        return this.intent;
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
    public final NavigationIntentInfo copy(@k JsonParams.WebActivityIntentI intent, @k String sourceBczId, @k String activityId, @k String activityUrl, @k String uuid) {
        g0.p(intent, "intent");
        g0.p(sourceBczId, "sourceBczId");
        g0.p(activityId, "activityId");
        g0.p(activityUrl, "activityUrl");
        g0.p(uuid, "uuid");
        return new NavigationIntentInfo(intent, sourceBczId, activityId, activityUrl, uuid);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationIntentInfo)) {
            return false;
        }
        NavigationIntentInfo navigationIntentInfo = (NavigationIntentInfo) obj;
        return g0.g(this.intent, navigationIntentInfo.intent) && g0.g(this.sourceBczId, navigationIntentInfo.sourceBczId) && g0.g(this.activityId, navigationIntentInfo.activityId) && g0.g(this.activityUrl, navigationIntentInfo.activityUrl) && g0.g(this.uuid, navigationIntentInfo.uuid);
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

    @k
    public final JsonParams.WebActivityIntentI getIntent() {
        return this.intent;
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getSourceBczId() {
        return this.sourceBczId;
    }

    @Override // com.baicizhan.client.business.util.navigate.NavigationIntentDescription
    @k
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((this.intent.hashCode() * 31) + this.sourceBczId.hashCode()) * 31) + this.activityId.hashCode()) * 31) + this.activityUrl.hashCode()) * 31) + this.uuid.hashCode();
    }

    @k
    public String toString() {
        return "NavigationIntentInfo(intent=" + this.intent + ", sourceBczId=" + this.sourceBczId + ", activityId=" + this.activityId + ", activityUrl=" + this.activityUrl + ", uuid=" + this.uuid + j.f81007d;
    }
}
