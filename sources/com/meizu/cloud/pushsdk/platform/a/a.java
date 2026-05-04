package com.meizu.cloud.pushsdk.platform.a;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.File;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f39924a;

    /* renamed from: b, reason: collision with root package name */
    private String f39925b;

    /* renamed from: c, reason: collision with root package name */
    private String f39926c;

    /* renamed from: d, reason: collision with root package name */
    private String f39927d;

    /* renamed from: e, reason: collision with root package name */
    private String f39928e;

    /* renamed from: f, reason: collision with root package name */
    private String f39929f;

    /* renamed from: g, reason: collision with root package name */
    private String f39930g;

    /* renamed from: h, reason: collision with root package name */
    private String f39931h;

    /* renamed from: i, reason: collision with root package name */
    private String f39932i;

    /* renamed from: j, reason: collision with root package name */
    private String f39933j;

    /* renamed from: k, reason: collision with root package name */
    private String f39934k;

    /* renamed from: l, reason: collision with root package name */
    private String f39935l;

    /* renamed from: m, reason: collision with root package name */
    private String f39936m;

    /* renamed from: n, reason: collision with root package name */
    private String f39937n;

    /* renamed from: o, reason: collision with root package name */
    private String f39938o;

    public a(Context context) {
        this.f39924a = "https://api-push.meizu.com/garcia/api/client/";
        this.f39925b = this.f39924a + "message/registerPush";
        this.f39926c = this.f39924a + "message/unRegisterPush";
        this.f39927d = this.f39924a + "advance/unRegisterPush";
        this.f39928e = this.f39924a + "message/getRegisterSwitch";
        this.f39929f = this.f39924a + "message/changeRegisterSwitch";
        this.f39930g = this.f39924a + "message/changeAllSwitch";
        this.f39931h = this.f39924a + "message/subscribeTags";
        this.f39932i = this.f39924a + "message/unSubscribeTags";
        this.f39933j = this.f39924a + "message/unSubAllTags";
        this.f39934k = this.f39924a + "message/getSubTags";
        this.f39935l = this.f39924a + "message/subscribeAlias";
        this.f39936m = this.f39924a + "message/unSubscribeAlias";
        this.f39937n = this.f39924a + "message/getSubAlias";
        this.f39938o = this.f39924a + "advance/changeRegisterSwitch";
        com.meizu.cloud.pushsdk.c.a.a();
        if (MzSystemUtils.isOverseas()) {
            this.f39924a = "https://api-push.in.meizu.com/garcia/api/client/";
            this.f39925b = this.f39924a + "message/registerPush";
            this.f39926c = this.f39924a + "message/unRegisterPush";
            this.f39927d = this.f39924a + "advance/unRegisterPush";
            this.f39928e = this.f39924a + "message/getRegisterSwitch";
            this.f39929f = this.f39924a + "message/changeRegisterSwitch";
            this.f39930g = this.f39924a + "message/changeAllSwitch";
            this.f39931h = this.f39924a + "message/subscribeTags";
            this.f39932i = this.f39924a + "message/unSubscribeTags";
            this.f39933j = this.f39924a + "message/unSubAllTags";
            this.f39934k = this.f39924a + "message/getSubTags";
            this.f39935l = this.f39924a + "message/subscribeAlias";
            this.f39936m = this.f39924a + "message/unSubscribeAlias";
            this.f39937n = this.f39924a + "message/getSubAlias";
            this.f39938o = this.f39924a + "advance/changeRegisterSwitch";
        }
    }

    public c a(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("deviceId", str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "register post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39925b).a(linkedHashMap2).a().a();
    }

    public c b(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("deviceId", str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "unregister post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.a(this.f39926c).a(linkedHashMap2).a().a();
    }

    public c c(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.a(this.f39928e).a(linkedHashMap2).a().a();
    }

    public c d(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeAllTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39933j).a(linkedHashMap2).a().a();
    }

    public c e(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.a(this.f39934k).a(linkedHashMap2).a().a();
    }

    public c a(String str, String str2, String str3, int i11, boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put("msgType", String.valueOf(i11));
        linkedHashMap.put("subSwitch", z11 ? "1" : "0");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", this.f39929f + " switchPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39929f).a(linkedHashMap2).a().a();
    }

    public c b(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put("tags", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39932i).a(linkedHashMap2).a().a();
    }

    public c c(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(IntentConstant.APP_KEY, str2);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put(PushConstants.SUB_ALIAS_STATUS_NAME, str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39935l).a(linkedHashMap2).a().a();
    }

    public c d(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put(PushConstants.SUB_ALIAS_STATUS_NAME, str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39936m).a(linkedHashMap2).a().a();
    }

    public c<String> a(String str, String str2, String str3, File file) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("msgId", str);
        linkedHashMap.put("deviceId", str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, "4a2ca769d79f4856bb3bd982d30de790"));
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap2.put("errorMsg", str3);
        }
        DebugLogger.i("PushAPI", "uploadLogFile post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.c("https://api-push.meizu.com/garcia/api/client/log/upload").a(linkedHashMap2).a("logFile", file).a().a();
    }

    public c a(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put("tags", str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39931h).a(linkedHashMap2).a().a();
    }

    public c a(String str, String str2, String str3, boolean z11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put("pushId", str3);
        linkedHashMap.put("subSwitch", z11 ? "1" : "0");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(HwPayConstant.KEY_SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", this.f39930g + " switchPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.f39930g).a(linkedHashMap2).a().a();
    }
}
