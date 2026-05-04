package com.igexin.assist.sdk;

import android.content.Context;
import com.igexin.assist.control.AbstractPushManager;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.config.d;
import com.igexin.push.core.e;
import com.igexin.push.core.e.f;
import com.igexin.push.g.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class AssistPushManager {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37017a = "Assist_OtherPushManager";

    /* renamed from: b, reason: collision with root package name */
    private AbstractPushManager f37018b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f37019c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AssistPushManager f37020a = new AssistPushManager(0);

        private a() {
        }
    }

    private AssistPushManager() {
        this.f37019c = new AtomicBoolean(false);
    }

    public static boolean checkSupportDevice(Context context) {
        return (d.U && b.a(context.getApplicationContext(), AssistUtils.BRAND_HON)) || b.a(context.getApplicationContext(), "huawei") || b.a(context.getApplicationContext(), "xiaomi") || b.a(context.getApplicationContext(), "oppo") || b.a(context.getApplicationContext(), "meizu") || b.a(context.getApplicationContext(), "vivo") || b.a(context);
    }

    public static AssistPushManager getInstance() {
        return a.f37020a;
    }

    public static String getToken() {
        return e.I;
    }

    public void initialize(Context context) {
        this.f37018b = com.igexin.assist.sdk.a.a().a(context);
    }

    public void register(Context context) {
        AbstractPushManager abstractPushManager = this.f37018b;
        if (abstractPushManager != null) {
            abstractPushManager.register(context);
        }
    }

    public void saveToken(String str) {
        f.a().b(str);
    }

    public void setSilentTime(Context context, int i11, int i12) {
        AbstractPushManager abstractPushManager = this.f37018b;
        if (abstractPushManager != null) {
            abstractPushManager.setSilentTime(context, i11, i12);
        }
    }

    public void turnOffPush(Context context) {
        AbstractPushManager abstractPushManager = this.f37018b;
        if (abstractPushManager != null) {
            abstractPushManager.turnOffPush(context);
        }
    }

    public void turnOnPush(Context context) {
        AbstractPushManager abstractPushManager = this.f37018b;
        if (abstractPushManager != null) {
            abstractPushManager.turnOnPush(context);
        }
    }

    public void unregister(Context context) {
        AbstractPushManager abstractPushManager = this.f37018b;
        if (abstractPushManager != null) {
            abstractPushManager.unregister(context);
        }
    }

    public /* synthetic */ AssistPushManager(byte b11) {
        this();
    }
}
