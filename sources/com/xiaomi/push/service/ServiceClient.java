package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.es;
import com.xiaomi.push.gj;
import com.xiaomi.push.gk;
import com.xiaomi.push.gl;
import com.xiaomi.push.go;
import com.xiaomi.push.gx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ServiceClient {

    /* renamed from: a, reason: collision with other field name */
    private static ServiceClient f862a;

    /* renamed from: a, reason: collision with other field name */
    private static String f863a;

    /* renamed from: a, reason: collision with other field name */
    private Context f864a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f867a;

    /* renamed from: b, reason: collision with other field name */
    private Messenger f868b;

    /* renamed from: b, reason: collision with root package name */
    private static String f46197b = gx.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: a, reason: collision with root package name */
    private static long f46196a = 0;

    /* renamed from: a, reason: collision with other field name */
    private Messenger f865a = null;

    /* renamed from: a, reason: collision with other field name */
    private List<Message> f866a = new ArrayList();

    /* renamed from: b, reason: collision with other field name */
    private boolean f869b = false;

    private ServiceClient(Context context) {
        this.f867a = false;
        this.f864a = context.getApplicationContext();
        if (m6192a()) {
            com.xiaomi.channel.commonutils.logger.b.c("use miui push service");
            this.f867a = true;
        }
    }

    private Intent a() {
        if (!isMiuiPushServiceEnabled()) {
            Intent intent = new Intent(this.f864a, (Class<?>) XMPushService.class);
            intent.putExtra(bk.B, this.f864a.getPackageName());
            b();
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setPackage("com.xiaomi.xmsf");
        intent2.setClassName("com.xiaomi.xmsf", m6188a());
        intent2.putExtra(bk.B, this.f864a.getPackageName());
        m6190a();
        return intent2;
    }

    private void b() {
        this.f864a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f864a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f862a == null) {
            f862a = new ServiceClient(context);
        }
        return f862a;
    }

    public static String getSession() {
        return f863a;
    }

    public static void setSession(String str) {
        f863a = str;
    }

    public boolean batchSendMessage(gl[] glVarArr, boolean z11) {
        if (!com.xiaomi.push.bi.b(this.f864a)) {
            return false;
        }
        Intent a11 = a();
        int length = glVarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i11 = 0; i11 < glVarArr.length; i11++) {
            String a12 = es.a();
            if (!TextUtils.isEmpty(a12)) {
                gj gjVar = new gj(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, null, null, null);
                gj gjVar2 = new gj("sent", null, null, null);
                gjVar2.m5988a(a12);
                gjVar.a(gjVar2);
                glVarArr[i11].a(gjVar);
            }
            com.xiaomi.channel.commonutils.logger.b.c("SEND:" + glVarArr[i11].mo5990a());
            bundleArr[i11] = glVarArr[i11].a();
        }
        if (length <= 0) {
            return false;
        }
        a11.setAction(bk.f46306g);
        a11.putExtra(bk.F, f863a);
        a11.putExtra("ext_packets", bundleArr);
        a11.putExtra("ext_encrypt", z11);
        return startServiceSafely(a11);
    }

    public void checkAlive() {
        Intent a11 = a();
        a11.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(a11);
    }

    public boolean closeChannel() {
        Intent a11 = a();
        a11.setAction(bk.f46308i);
        return startServiceSafely(a11);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z11, List<org.apache.http.v> list, List<org.apache.http.v> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z11, a(list), a(list2));
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f867a;
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z11) {
        Intent a11 = a();
        a11.setAction(bk.f46303d);
        a(a11, str, str2, str3, str4, str5, z11, map, map2);
        startServiceSafely(a11);
        return 0;
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z11, List<org.apache.http.v> list, List<org.apache.http.v> list2) {
        resetConnection(str, str2, str3, str4, str5, z11, a(list), a(list2));
    }

    public boolean sendIQ(gk gkVar) {
        if (!com.xiaomi.push.bi.b(this.f864a)) {
            return false;
        }
        Intent a11 = a();
        Bundle a12 = gkVar.a();
        if (a12 == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + gkVar.mo5990a());
        a11.setAction(bk.f46305f);
        a11.putExtra(bk.F, f863a);
        a11.putExtra("ext_packet", a12);
        return startServiceSafely(a11);
    }

    public boolean sendMessage(gl glVar, boolean z11) {
        if (!com.xiaomi.push.bi.b(this.f864a)) {
            return false;
        }
        Intent a11 = a();
        String a12 = es.a();
        if (!TextUtils.isEmpty(a12)) {
            gj gjVar = new gj(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, null, null, null);
            gj gjVar2 = new gj("sent", null, null, null);
            gjVar2.m5988a(a12);
            gjVar.a(gjVar2);
            glVar.a(gjVar);
        }
        Bundle a13 = glVar.a();
        if (a13 == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + glVar.mo5990a());
        a11.setAction(bk.f46304e);
        a11.putExtra(bk.F, f863a);
        a11.putExtra("ext_packet", a13);
        a11.putExtra("ext_encrypt", z11);
        return startServiceSafely(a11);
    }

    public boolean sendPresence(go goVar) {
        if (!com.xiaomi.push.bi.b(this.f864a)) {
            return false;
        }
        Intent a11 = a();
        Bundle a12 = goVar.a();
        if (a12 == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + goVar.mo5990a());
        a11.setAction(bk.f46307h);
        a11.putExtra(bk.F, f863a);
        a11.putExtra("ext_packet", a12);
        return startServiceSafely(a11);
    }

    public void setMessenger(Messenger messenger) {
        this.f865a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (com.xiaomi.push.j.m6171a() || Build.VERSION.SDK_INT < 26) {
                this.f864a.startService(intent);
                return true;
            }
            m6191a(intent);
            return true;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<org.apache.http.v> list, List<org.apache.http.v> list2) {
        updateChannelInfo(str, a(list), a(list2));
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    public boolean closeChannel(String str) {
        Intent a11 = a();
        a11.setAction(bk.f46308i);
        a11.putExtra(bk.f46319t, str);
        return startServiceSafely(a11);
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z11, Map<String, String> map, Map<String, String> map2) {
        Intent a11 = a();
        a11.setAction(bk.f46309j);
        a(a11, str, str2, str3, str4, str5, z11, map, map2);
        return startServiceSafely(a11);
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z11, List<org.apache.http.v> list, List<org.apache.http.v> list2) {
        return openChannel(str, str2, str3, str4, str5, a(list), a(list2), z11);
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z11, Map<String, String> map, Map<String, String> map2) {
        Intent a11 = a();
        a11.setAction(bk.f46310k);
        a(a11, str, str2, str3, str4, str5, z11, map, map2);
        startServiceSafely(a11);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String str3;
        if (!com.xiaomi.push.bi.b(this.f864a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent a11 = a();
        a11.setAction(bk.f46304e);
        a11.putExtra(bk.F, f863a);
        a11.putExtra("ext_raw_packet", bArr);
        int indexOf = str.indexOf(EmailAutoCompleteEditText.f17091d);
        String str4 = null;
        String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            str4 = str.substring(indexOf + 1, lastIndexOf);
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        a11.putExtra(bk.f46316q, substring);
        a11.putExtra(bk.f46317r, str4);
        a11.putExtra(bk.f46318s, str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f46197b);
        long j11 = f46196a;
        f46196a = 1 + j11;
        sb2.append(j11);
        String sb3 = sb2.toString();
        a11.putExtra("ext_pkt_id", sb3);
        a11.putExtra("ext_chid", str2);
        com.xiaomi.channel.commonutils.logger.b.e("SEND: chid=" + str2 + ", packetId=" + sb3);
        return startServiceSafely(a11);
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent a11 = a();
        a11.setAction(bk.f46311l);
        if (map != null) {
            String a12 = a(map);
            if (!TextUtils.isEmpty(a12)) {
                a11.putExtra(bk.f46325z, a12);
            }
        }
        if (map2 != null) {
            String a13 = a(map2);
            if (!TextUtils.isEmpty(a13)) {
                a11.putExtra(bk.A, a13);
            }
        }
        a11.putExtra(bk.f46319t, str);
        startServiceSafely(a11);
    }

    public boolean closeChannel(String str, String str2) {
        Intent a11 = a();
        a11.setAction(bk.f46308i);
        a11.putExtra(bk.f46319t, str);
        a11.putExtra(bk.f46316q, str2);
        return startServiceSafely(a11);
    }

    /* renamed from: a, reason: collision with other method in class */
    private String m6188a() {
        try {
            return this.f864a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            if (i11 < map.size()) {
                sb2.append(",");
            }
            i11++;
        }
        return sb2.toString();
    }

    private Map<String, String> a(List<org.apache.http.v> list) {
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (org.apache.http.v vVar : list) {
                if (vVar != null) {
                    hashMap.put(vVar.getName(), vVar.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m6190a() {
        this.f864a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f864a, (Class<?>) XMPushService.class), 2, 1);
    }

    /* renamed from: a, reason: collision with other method in class */
    private synchronized void m6191a(Intent intent) {
        try {
            if (this.f869b) {
                Message a11 = a(intent);
                if (this.f866a.size() >= 50) {
                    this.f866a.remove(0);
                }
                this.f866a.add(a11);
                return;
            }
            if (this.f868b == null) {
                this.f864a.bindService(intent, new bu(this), 1);
                this.f869b = true;
                this.f866a.clear();
                this.f866a.add(a(intent));
            } else {
                try {
                    this.f868b.send(a(intent));
                } catch (RemoteException unused) {
                    this.f868b = null;
                    this.f869b = false;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z11, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(bk.f46316q, str);
        intent.putExtra(bk.f46319t, str2);
        intent.putExtra(bk.f46321v, str3);
        intent.putExtra(bk.f46323x, str5);
        intent.putExtra(bk.f46322w, str4);
        intent.putExtra(bk.f46324y, z11);
        intent.putExtra(bk.F, f863a);
        intent.putExtra(bk.J, this.f865a);
        if (map != null && map.size() > 0) {
            String a11 = a(map);
            if (!TextUtils.isEmpty(a11)) {
                intent.putExtra(bk.f46325z, a11);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String a12 = a(map2);
        if (TextUtils.isEmpty(a12)) {
            return;
        }
        intent.putExtra(bk.A, a12);
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m6192a() {
        if (com.xiaomi.push.ab.f45243e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f864a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }
}
