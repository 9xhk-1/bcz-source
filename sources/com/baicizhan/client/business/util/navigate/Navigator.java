package com.baicizhan.client.business.util.navigate;

import android.content.Context;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.navigate.NavigationIntent;
import com.baicizhan.client.business.util.navigate.NavigationIntentDescription;
import com.baicizhan.client.business.util.navigate.Navigator;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import m80.l;
import ma.a;
import ma.u;
import w00.j;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Navigator")
/* loaded from: classes4.dex */
public final class Navigator {
    private static final HashMap<String, String> createStats(Context context, NavigationIntentDescription navigationIntentDescription, NavigationIntent<?> navigationIntent, boolean z11) {
        return u.d(new String[]{"url", NavigationIntentInfoKt.KEY_SOURCE_ID, "activity_id", NavigationIntentInfoKt.KEY_ACTIVITY_URL, NavigationIntentInfoKt.KEY_VISIT_UUID, NavigationIntentInfoKt.KEY_NAVIGATE_STATUS, "device_id"}, new Object[]{navigationIntent.getUrl(), navigationIntentDescription.getSourceBczId(), navigationIntentDescription.getActivityId(), navigationIntentDescription.getActivityUrl(), navigationIntentDescription.getUuid(), z11 ? "hold_on" : "direct", DeviceUtil.getUniqueID(context)}, false, 4, null);
    }

    @k
    public static final boolean navigate(@m80.k Context context, @l String str) {
        g0.p(context, "context");
        return navigate$default(context, str, null, 0, 12, null);
    }

    public static /* synthetic */ boolean navigate$default(Context context, String str, OpenNavigateListener openNavigateListener, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            openNavigateListener = null;
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        return navigate(context, str, openNavigateListener, i11);
    }

    @m80.k
    public static final NavigationIntent<? extends Object> reportNavigation(@m80.k final Context context, @l String str, final boolean z11, final boolean z12) {
        g0.p(context, "context");
        return NavigationParser.INSTANCE.parse(str, new OpenNavigateListener() { // from class: ra.a
            @Override // com.baicizhan.client.business.util.navigate.OpenNavigateListener
            public final void onOpenNavigate(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
                Navigator.reportNavigation$lambda$0(z12, context, z11, navigationIntentDescription, navigationIntent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportNavigation$lambda$0(boolean z11, Context context, boolean z12, NavigationIntentDescription intentInfo, NavigationIntent navIntent) {
        g0.p(intentInfo, "intentInfo");
        g0.p(navIntent, "navIntent");
        if (z11) {
            ma.l.b("activity-common", a.U4, createStats(context, intentInfo, navIntent, z12));
        } else {
            ma.l.d("activity-common", a.U4, createStats(context, intentInfo, navIntent, z12));
        }
    }

    @k
    public static final boolean navigate(@m80.k Context context, @l String str, @l OpenNavigateListener openNavigateListener) {
        g0.p(context, "context");
        return navigate$default(context, str, openNavigateListener, 0, 8, null);
    }

    public static final void reportNavigation(@m80.k Context context, @m80.k NavigationIntentDescription info, @m80.k NavigationIntent<?> intent, boolean z11, boolean z12) {
        g0.p(context, "context");
        g0.p(info, "info");
        g0.p(intent, "intent");
        if (z12) {
            ma.l.b("activity-common", a.U4, createStats(context, info, intent, z11));
        } else {
            ma.l.d("activity-common", a.U4, createStats(context, info, intent, z11));
        }
    }

    @k
    public static final boolean navigate(@m80.k Context context, @l String str, @l OpenNavigateListener openNavigateListener, int i11) {
        g0.p(context, "context");
        return NavigationParser.INSTANCE.navigate(context, str, openNavigateListener, i11);
    }
}
