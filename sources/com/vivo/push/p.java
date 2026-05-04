package com.vivo.push;

import android.net.Uri;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f45051a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f45052b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* renamed from: c, reason: collision with root package name */
    public static final Uri f45053c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f45054d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    public static String a(int i11) {
        switch (i11) {
            case 2002:
                return "method_alias_bind";
            case 2003:
                return "method_alias_unbind";
            case 2004:
                return "method_tag_bind";
            case 2005:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}
