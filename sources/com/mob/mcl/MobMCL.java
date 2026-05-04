package com.mob.mcl;

import android.content.Context;
import android.os.Bundle;
import com.mob.mcl.c.h;
import com.mob.mgs.OnIdChangeListener;
import com.mob.tools.proguard.EverythingKeeper;

/* loaded from: classes7.dex */
public class MobMCL implements EverythingKeeper {
    public static final String SDK_TAG = "MobMCL";

    public interface ELPMessageListener extends EverythingKeeper {
        boolean messageReceived(Bundle bundle);
    }

    public static void addBusinessMessageListener(int i11, BusinessMessageListener businessMessageListener) {
        com.mob.mcl.b.a.a(i11, businessMessageListener);
    }

    public static void addELPMessageListener(ELPMessageListener eLPMessageListener) {
        com.mob.mcl.b.a.a(eLPMessageListener);
    }

    public static void deleteMsg(String str) {
        h.b().a(str);
    }

    public static void getClientTcpStatus(BusinessCallBack<Boolean> businessCallBack) {
        h.b().a(businessCallBack);
    }

    public static long getCreateSuidTime() {
        return com.mob.mcl.b.a.b();
    }

    public static String getSuid() {
        return com.mob.mcl.b.a.a();
    }

    public static void getTcpStatus(BusinessCallBack<Boolean> businessCallBack) {
        h.b().b(businessCallBack);
    }

    public static void initMCLink(Context context, String str, String str2) {
        com.mob.mcl.b.a.a(context, str, str2);
    }

    public static boolean syncSuid(String str, long j11) {
        return com.mob.mcl.b.a.a(str, j11);
    }

    public static void getSuid(OnIdChangeListener onIdChangeListener) {
        com.mob.mcl.b.a.a(onIdChangeListener);
    }
}
