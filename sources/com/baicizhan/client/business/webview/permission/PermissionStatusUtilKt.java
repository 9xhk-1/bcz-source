package com.baicizhan.client.business.webview.permission;

import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.d;
import java.util.LinkedHashMap;
import java.util.List;
import jt.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPermissionStatusUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionStatusUtil.kt\ncom/baicizhan/client/business/webview/permission/PermissionStatusUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 PermissionStatusUtil.kt\ncom/baicizhan/client/business/webview/permission/PermissionStatusUtilKt\n*L\n31#1:67,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PermissionStatusUtilKt {

    @k
    public static final String PERMISSION_ALBUM_READ = "album-rw";

    @k
    public static final String PERMISSION_ALBUM_WRITE = "album-write";

    @k
    public static final String PERMISSION_CAMERA = "camera";

    @k
    public static final String PERMISSION_GPS = "gps";

    @k
    public static final String PERMISSION_MICROPHONE = "microphone";

    @k
    public static final String PERMISSION_NOTIFICATION = "notification";

    @k
    public static final String PERMISSION_STATUS_AUTHORIZED = "Authorized";

    @k
    public static final String PERMISSION_STATUS_DENIED = "Denied";

    @k
    public static final String PERMISSION_STATUS_UNKNOWN = "Unknown";

    @k
    public static final String getPermissionGranted(@k Context context, @k String permission) {
        g0.p(context, "context");
        g0.p(permission, "permission");
        switch (permission.hashCode()) {
            case -1890379007:
                return !permission.equals(PERMISSION_ALBUM_WRITE) ? PERMISSION_STATUS_UNKNOWN : grantedStatus("android.permission.WRITE_EXTERNAL_STORAGE", context, true);
            case -1367751899:
                return !permission.equals(PERMISSION_CAMERA) ? PERMISSION_STATUS_UNKNOWN : grantedStatus$default("android.permission.CAMERA", context, false, 2, null);
            case 102570:
                return !permission.equals(PERMISSION_GPS) ? PERMISSION_STATUS_UNKNOWN : grantedStatus$default("android.permission.ACCESS_FINE_LOCATION", context, false, 2, null);
            case 595233003:
                return !permission.equals("notification") ? PERMISSION_STATUS_UNKNOWN : getPermissionStatus(NotificationManagerCompat.from(context).areNotificationsEnabled());
            case 1370921258:
                return !permission.equals(PERMISSION_MICROPHONE) ? PERMISSION_STATUS_UNKNOWN : grantedStatus$default("android.permission.RECORD_AUDIO", context, false, 2, null);
            case 1532030563:
                return !permission.equals(PERMISSION_ALBUM_READ) ? PERMISSION_STATUS_UNKNOWN : grantedStatus("android.permission.READ_EXTERNAL_STORAGE", context, true);
            default:
                return PERMISSION_STATUS_UNKNOWN;
        }
    }

    @k
    public static final String getPermissionInfo(@k Context context, @l List<String> list) {
        g0.p(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (String str : list) {
                linkedHashMap.put(str, getPermissionGranted(context, str));
            }
        }
        String z11 = new d().z(linkedHashMap);
        g0.o(z11, "toJson(...)");
        return z11;
    }

    @k
    public static final String getPermissionStatus(boolean z11) {
        return z11 ? PERMISSION_STATUS_AUTHORIZED : PERMISSION_STATUS_DENIED;
    }

    @k
    public static final String grantedStatus(@k String str, @k Context context, boolean z11) {
        g0.p(str, "<this>");
        g0.p(context, "context");
        return (!z11 || Build.VERSION.SDK_INT < 29) ? getPermissionStatus(c.c(context, str)) : PERMISSION_STATUS_AUTHORIZED;
    }

    public static /* synthetic */ String grantedStatus$default(String str, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return grantedStatus(str, context, z11);
    }
}
