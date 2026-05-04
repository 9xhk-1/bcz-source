package com.xiaomi.push.service;

/* loaded from: classes8.dex */
public abstract class bk {
    public static String A = "ext_cloud_attr";
    public static String B = "ext_pkg_name";
    public static String C = "ext_notify_id";
    public static String D = "ext_clicked_button";
    public static String E = "ext_notify_type";
    public static String F = "ext_session";
    public static String G = "sig";
    public static String H = "ext_notify_title";
    public static String I = "ext_notify_description";
    public static String J = "ext_messenger";
    public static String K = "title";
    public static String L = "description";
    public static String M = "notifyId";
    public static String N = "dump";

    /* renamed from: a, reason: collision with root package name */
    public static String f46300a = "1";

    /* renamed from: b, reason: collision with root package name */
    public static String f46301b = "2";

    /* renamed from: c, reason: collision with root package name */
    public static String f46302c = "3";

    /* renamed from: d, reason: collision with root package name */
    public static String f46303d = "com.xiaomi.push.OPEN_CHANNEL";

    /* renamed from: e, reason: collision with root package name */
    public static String f46304e = "com.xiaomi.push.SEND_MESSAGE";

    /* renamed from: f, reason: collision with root package name */
    public static String f46305f = "com.xiaomi.push.SEND_IQ";

    /* renamed from: g, reason: collision with root package name */
    public static String f46306g = "com.xiaomi.push.BATCH_SEND_MESSAGE";

    /* renamed from: h, reason: collision with root package name */
    public static String f46307h = "com.xiaomi.push.SEND_PRES";

    /* renamed from: i, reason: collision with root package name */
    public static String f46308i = "com.xiaomi.push.CLOSE_CHANNEL";

    /* renamed from: j, reason: collision with root package name */
    public static String f46309j = "com.xiaomi.push.FORCE_RECONN";

    /* renamed from: k, reason: collision with root package name */
    public static String f46310k = "com.xiaomi.push.RESET_CONN";

    /* renamed from: l, reason: collision with root package name */
    public static String f46311l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";

    /* renamed from: m, reason: collision with root package name */
    public static String f46312m = "com.xiaomi.push.SEND_STATS";

    /* renamed from: n, reason: collision with root package name */
    public static String f46313n = "com.xiaomi.push.HANDLE_FCM_MSG";

    /* renamed from: o, reason: collision with root package name */
    public static String f46314o = "com.xiaomi.push.CHANGE_HOST";

    /* renamed from: p, reason: collision with root package name */
    public static String f46315p = "com.xiaomi.push.PING_TIMER";

    /* renamed from: q, reason: collision with root package name */
    public static String f46316q = "ext_user_id";

    /* renamed from: r, reason: collision with root package name */
    public static String f46317r = "ext_user_server";

    /* renamed from: s, reason: collision with root package name */
    public static String f46318s = "ext_user_res";

    /* renamed from: t, reason: collision with root package name */
    public static String f46319t = "ext_chid";

    /* renamed from: u, reason: collision with root package name */
    public static String f46320u = "ext_sid";

    /* renamed from: v, reason: collision with root package name */
    public static String f46321v = "ext_token";

    /* renamed from: w, reason: collision with root package name */
    public static String f46322w = "ext_auth_method";

    /* renamed from: x, reason: collision with root package name */
    public static String f46323x = "ext_security";

    /* renamed from: y, reason: collision with root package name */
    public static String f46324y = "ext_kick";

    /* renamed from: z, reason: collision with root package name */
    public static String f46325z = "ext_client_attr";

    public static String a(int i11) {
        switch (i11) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i11);
        }
    }
}
