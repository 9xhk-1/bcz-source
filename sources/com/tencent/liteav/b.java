package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b {
    private static HashMap<String, a> A = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private static String f43081a = "TXCDataReport";

    /* renamed from: c, reason: collision with root package name */
    private String f43083c;

    /* renamed from: d, reason: collision with root package name */
    private Context f43084d;

    /* renamed from: f, reason: collision with root package name */
    private long f43086f;

    /* renamed from: g, reason: collision with root package name */
    private long f43087g;

    /* renamed from: h, reason: collision with root package name */
    private long f43088h;

    /* renamed from: i, reason: collision with root package name */
    private long f43089i;

    /* renamed from: j, reason: collision with root package name */
    private long f43090j;

    /* renamed from: k, reason: collision with root package name */
    private long f43091k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43092l;

    /* renamed from: m, reason: collision with root package name */
    private long f43093m;

    /* renamed from: v, reason: collision with root package name */
    private long f43102v;

    /* renamed from: z, reason: collision with root package name */
    private String f43106z;

    /* renamed from: o, reason: collision with root package name */
    private long f43095o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f43096p = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f43097q = false;

    /* renamed from: r, reason: collision with root package name */
    private long f43098r = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f43099s = 0;

    /* renamed from: t, reason: collision with root package name */
    private long f43100t = 0;

    /* renamed from: u, reason: collision with root package name */
    private long f43101u = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f43103w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f43104x = 0;

    /* renamed from: y, reason: collision with root package name */
    private long f43105y = 0;
    private String B = "";
    private String C = "";

    /* renamed from: b, reason: collision with root package name */
    private HashMap f43082b = new HashMap(100);

    /* renamed from: e, reason: collision with root package name */
    private String f43085e = TXCCommonUtil.getAppVersion();

    /* renamed from: n, reason: collision with root package name */
    private int f43094n = 5000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        PENDING,
        CONFIRM,
        NEGATIVE
    }

    public b(Context context) {
        this.f43102v = 0L;
        this.f43084d = context.getApplicationContext();
        this.f43102v = 0L;
    }

    private void g() {
        a(6002, PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED, PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED);
        TXCStatus.a(this.B, ConnectionResult.RESOLUTION_REQUIRED, Integer.valueOf(com.tencent.liteav.basic.util.h.a()[0]));
        a(ConnectionResult.RESOLUTION_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.RESTRICTED_PROFILE);
        TXCStatus.a(this.B, ConnectionResult.SERVICE_UPDATING, Integer.valueOf(com.tencent.liteav.basic.util.h.b()));
        a(ConnectionResult.SERVICE_UPDATING, ConnectionResult.SIGN_IN_FAILED, 9006);
    }

    private int h() {
        long timeTick = TXCTimeUtil.getTimeTick();
        long c11 = TXCStatus.c(this.B, 6109);
        long j11 = this.f43095o;
        int i11 = 0;
        if (j11 != 0) {
            long j12 = timeTick - j11;
            long j13 = c11 - this.f43096p;
            if (j12 > 0) {
                i11 = (int) ((j13 * 1000) / j12);
            }
        } else {
            long j14 = timeTick - this.f43103w;
            if (j14 > 0) {
                i11 = (int) ((1000 * c11) / j14);
            }
        }
        this.f43095o = timeTick;
        this.f43096p = c11;
        return i11;
    }

    private void i() {
        HashMap hashMap = new HashMap();
        String b11 = TXCStatus.b(this.B, 7116);
        String b12 = TXCStatus.b(this.B, 7117);
        String b13 = TXCStatus.b(this.B, 7118);
        int c11 = TXCStatus.c(this.B, 7105);
        String b14 = TXCStatus.b(this.B, 7106);
        int c12 = TXCStatus.c(this.B, 7111);
        hashMap.put("stream_url", b11);
        hashMap.put("stream_id", b12);
        hashMap.put("bizid", b13);
        hashMap.put("err_code", String.valueOf(c11));
        hashMap.put("err_info", b14);
        hashMap.put("channel_type", String.valueOf(c12));
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f43098r;
        hashMap.put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f43098r)));
        hashMap.put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(currentTimeMillis)));
        hashMap.put("total_time", String.valueOf(j11));
        long a11 = TXCStatus.a(this.B, 6003);
        long a12 = TXCStatus.a(this.B, 6006);
        long a13 = TXCStatus.a(this.B, 6005);
        long j12 = a11 != 0 ? a12 / a11 : 0L;
        hashMap.put("block_count", String.valueOf(a11));
        hashMap.put("block_duration_max", String.valueOf(a13));
        hashMap.put("block_duration_avg", String.valueOf(j12));
        long j13 = this.f43101u;
        long j14 = j13 != 0 ? this.f43100t / j13 : 0L;
        hashMap.put("jitter_cache_max", String.valueOf(this.f43099s));
        hashMap.put("jitter_cache_avg", String.valueOf(j14));
        String txCreateToken = TXCDRApi.txCreateToken();
        int i11 = com.tencent.liteav.basic.datareport.a.f43282ag;
        int i12 = com.tencent.liteav.basic.datareport.a.f43288am;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.f43084d, txCreateToken, i11, i12, tXCDRExtInfo);
        TXCLog.d(f43081a, "report evt 40402: token=" + txCreateToken);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            TXCLog.e(f43081a, "RealTimePlayStatisticInfo: " + str + " = " + str2);
            if (str != null && str.length() > 0 && str2 != null) {
                TXCDRApi.txSetEventValue(txCreateToken, i11, str, str2);
            }
        }
        TXCDRApi.nativeReportEvent(txCreateToken, i11);
        this.f43097q = false;
        this.f43098r = 0L;
        this.f43101u = 0L;
        this.f43100t = 0L;
        this.f43099s = 0L;
    }

    private void j() {
        this.f43092l = false;
        this.f43093m = 0L;
        this.f43104x = 0;
        String str = this.C;
        if (TextUtils.isEmpty(str)) {
            str = TXCCommonUtil.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = com.tencent.liteav.basic.util.h.b(this.f43084d);
        }
        this.f43082b.put("str_user_id", str);
        HashMap hashMap = this.f43082b;
        String str2 = com.tencent.liteav.basic.util.e.f43437a;
        hashMap.put("str_device_type", str2);
        this.f43082b.put("str_device_type", str2);
        this.f43082b.put("u32_network_type", Integer.valueOf(com.tencent.liteav.basic.util.h.d(this.f43084d)));
        this.f43082b.put("token", com.tencent.liteav.basic.util.h.c());
        this.f43082b.put("str_package_name", com.tencent.liteav.basic.util.h.c(this.f43084d));
        this.f43082b.put("dev_uuid", com.tencent.liteav.basic.util.h.e(this.f43084d));
        this.f43082b.put("str_os_info", com.tencent.liteav.basic.util.e.f43441e);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        this.f43102v = utcTimeTick;
        this.f43082b.put("u64_timestamp", Long.valueOf(utcTimeTick));
        this.f43103w = TXCTimeUtil.getTimeTick();
    }

    public void a() {
        j();
        this.f43087g = -1L;
        this.f43091k = -1L;
        this.f43088h = 0L;
        this.f43089i = 0L;
        this.f43090j = 0L;
        this.f43098r = System.currentTimeMillis();
        this.f43105y = TXCTimeUtil.getTimeTick();
    }

    public void b() {
        if (this.f43092l) {
            if (this.f43097q) {
                c(com.tencent.liteav.basic.datareport.a.Y);
            } else if (c() != a.NEGATIVE) {
                c(com.tencent.liteav.basic.datareport.a.V);
            }
            if (this.f43097q) {
                b(com.tencent.liteav.basic.datareport.a.Z);
            } else {
                b(com.tencent.liteav.basic.datareport.a.W);
            }
        } else {
            TXCLog.e(f43081a, "play " + this.f43083c + " failed");
            if (this.f43097q) {
                a(com.tencent.liteav.basic.datareport.a.X);
            } else {
                a(com.tencent.liteav.basic.datareport.a.U);
            }
        }
        if (this.f43097q) {
            i();
        }
        TXCStatus.a(this.B, 7107, (Object) 0L);
        TXCStatus.a(this.B, 2033, (Object) 0L);
        TXCStatus.a(this.B, 6001, (Object) 0L);
        TXCStatus.a(this.B, 7104, (Object) 0L);
        TXCStatus.a(this.B, 7108, (Object) 0L);
    }

    public a c() {
        Uri parse;
        try {
            parse = Uri.parse(this.f43106z);
        } catch (Exception e11) {
            TXCLog.e(f43081a, "check stream failed.", e11);
        }
        if (parse == null) {
            return a.PENDING;
        }
        final String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return a.PENDING;
        }
        String scheme = parse.getScheme();
        if (scheme == null) {
            return a.PENDING;
        }
        if (!scheme.equals("rtmp") && !scheme.equals("http") && !scheme.equals("https")) {
            return a.PENDING;
        }
        if (c(host)) {
            return a.CONFIRM;
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && (queryParameterNames.contains("bizid") || queryParameterNames.contains("txTime") || queryParameterNames.contains("txSecret"))) {
            return a.CONFIRM;
        }
        if (A.containsKey(host)) {
            return A.get(host);
        }
        A.put(host, a.PENDING);
        new Thread(new Runnable() { // from class: com.tencent.liteav.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean z11 = true;
                    com.tencent.liteav.network.a.e[] a11 = com.tencent.liteav.network.a.a.a.c().a(new com.tencent.liteav.network.a.b(host, true), null);
                    int length = a11.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z11 = false;
                            break;
                        }
                        com.tencent.liteav.network.a.e eVar = a11[i11];
                        if (eVar.a() && b.c(eVar.f43729a)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    b.A.put(host, z11 ? a.CONFIRM : a.NEGATIVE);
                    TXCLog.d(b.f43081a, host + " isTencent " + z11);
                } catch (Exception e12) {
                    TXCLog.e(b.f43081a, "check dns failed.", e12);
                }
            }
        }).start();
        return a.PENDING;
    }

    public void d(String str) {
        this.B = str;
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("room://")) {
            return;
        }
        str.split("/")[r3.length - 1].split("_");
        TXCStatus.a(this.B, 7112, (Object) 3L);
    }

    public void d() {
        g();
        if (!this.f43092l) {
            long a11 = TXCStatus.a(this.B, 6001);
            long a12 = TXCStatus.a(this.B, 7104);
            long a13 = TXCStatus.a(this.B, 2033);
            long a14 = TXCStatus.a(this.B, 7108);
            if (a11 > 0 && a12 > 0 && a14 > 0 && a13 > 0) {
                a(this.f43097q ? com.tencent.liteav.basic.datareport.a.X : com.tencent.liteav.basic.datareport.a.U);
                this.f43094n = 5000;
                this.f43092l = true;
            }
            String b11 = TXCStatus.b(this.B, 7119);
            if (b11 != null) {
                b(b11);
            }
        }
        if (this.f43104x >= 3 && !this.f43092l) {
            a(this.f43097q ? com.tencent.liteav.basic.datareport.a.X : com.tencent.liteav.basic.datareport.a.U);
            this.f43094n = 5000;
            this.f43092l = true;
        }
        this.f43104x++;
        if (this.f43093m <= 0) {
            this.f43093m = TXCTimeUtil.getTimeTick();
        }
        if (TXCTimeUtil.getTimeTick() > this.f43093m + this.f43094n) {
            if (this.f43097q) {
                c(com.tencent.liteav.basic.datareport.a.Y);
                this.f43094n = 5000;
            } else {
                if (c() == a.NEGATIVE) {
                    return;
                }
                c(com.tencent.liteav.basic.datareport.a.V);
                int statusReportInterval = TXCDRApi.getStatusReportInterval();
                this.f43094n = statusReportInterval;
                if (statusReportInterval < 5000) {
                    this.f43094n = 5000;
                }
                if (this.f43094n > 300000) {
                    this.f43094n = 300000;
                }
            }
            this.f43087g = TXCStatus.a(this.B, 6004);
            this.f43091k = TXCStatus.c(this.B, 2002);
            this.f43093m = TXCTimeUtil.getTimeTick();
        }
    }

    public void e(String str) {
        this.C = str;
    }

    private int g(String str) {
        Number number = (Number) this.f43082b.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public void a(boolean z11) {
        this.f43097q = z11;
    }

    public void a(String str) {
        this.f43083c = str;
        b(str);
    }

    public void a(int i11, int i12, int i13) {
        if (i11 == 6002) {
            double d11 = TXCStatus.d(this.B, i11);
            if (d11 < 0.001d) {
                return;
            }
            double d12 = TXCStatus.d(this.B, i12);
            int c11 = TXCStatus.c(this.B, i13) + 1;
            TXCStatus.a(this.B, i12, Double.valueOf(d12 + ((d11 - d12) / c11)));
            TXCStatus.a(this.B, i13, Integer.valueOf(c11));
            return;
        }
        double c12 = TXCStatus.c(this.B, i11);
        if (c12 < 0.001d) {
            return;
        }
        double d13 = TXCStatus.d(this.B, i12);
        int c13 = TXCStatus.c(this.B, i13) + 1;
        TXCStatus.a(this.B, i12, Double.valueOf(d13 + ((c12 - d13) / c13)));
        TXCStatus.a(this.B, i13, Integer.valueOf(c13));
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        this.f43106z = str;
    }

    private void a(int i11) {
        long j11;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f43083c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f43082b.get("token");
        TXCDRApi.InitEvent(this.f43084d, str, i11, com.tencent.liteav.basic.datareport.a.f43289an, tXCDRExtInfo);
        a(i11, str);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_timestamp", ((Long) this.f43082b.get("u64_timestamp")).longValue());
        long a11 = TXCStatus.a(this.B, 7107);
        long a12 = TXCStatus.a(this.B, 7108);
        if (a12 != -1) {
            a12 -= a11;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_dns_time", a12 < 0 ? -1L : a12);
        long a13 = TXCStatus.a(this.B, 7109);
        if (a13 != -1) {
            a13 -= a11;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_connect_server_time", a13 < 0 ? -1L : a13);
        int c11 = TXCStatus.c(this.B, PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_decode_type", c11);
        long a14 = TXCStatus.a(this.B, 6001) - this.f43105y;
        this.f43086f = a14;
        if (a14 < 0) {
            a14 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_i_frame", a14);
        long a15 = TXCStatus.a(this.B, 7103) - this.f43105y;
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_frame_down", a15 < 0 ? -1L : a15);
        long a16 = TXCStatus.a(this.B, 5005) - this.f43105y;
        if (a16 < 0) {
            a16 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_video_decode_time", a16);
        long a17 = TXCStatus.a(this.B, 7104) - this.f43105y;
        if (a17 < 0) {
            j11 = a17;
            a17 = -1;
        } else {
            j11 = a17;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_audio_frame_down", a17);
        long a18 = TXCStatus.a(this.B, 2033) - this.f43105y;
        if (a18 < 0) {
            a18 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_audio_render_time", a18);
        int c12 = TXCStatus.c(this.B, 7105);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_err_code", c12);
        int c13 = TXCStatus.c(this.B, 7106);
        TXCDRApi.txSetEventIntValue(str, i11, "str_err_info", c13);
        int c14 = TXCStatus.c(this.B, 7112);
        TXCDRApi.txSetEventValue(str, i11, "u32_link_type", String.valueOf(c14));
        int c15 = TXCStatus.c(this.B, 7111);
        TXCDRApi.txSetEventValue(str, i11, "u32_channel_type", String.valueOf(c15));
        TXCDRApi.txSetEventValue(str, i11, "str_app_version", this.f43085e);
        TXCDRApi.nativeReportEvent(str, i11);
        TXCLog.d(f43081a, "report evt " + i11 + ": token=" + str + "\nstr_user_id" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_user_id") + "\ndev_uuid" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("dev_uuid") + "\nstr_session_id" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_session_id") + "\nstr_device_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_device_type") + "\nstr_os_info" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_os_info") + "\nstr_package_name" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_package_name") + "\nu32_network_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u32_network_type") + "\nu32_server_ip" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u32_server_ip") + "\nstr_stream_url" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_stream_url") + "\nu64_timestamp" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u64_timestamp") + "\nu32_dns_time" + ContainerUtils.KEY_VALUE_DELIMITER + a12 + "\nu32_connect_server_time" + ContainerUtils.KEY_VALUE_DELIMITER + a13 + "\nu32_video_decode_type" + ContainerUtils.KEY_VALUE_DELIMITER + c11 + "\nu32_first_frame_down" + ContainerUtils.KEY_VALUE_DELIMITER + a15 + "\nu32_first_video_decode_time" + ContainerUtils.KEY_VALUE_DELIMITER + a16 + "\nu32_first_i_frame" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43086f + "\nu32_first_audio_frame_down" + ContainerUtils.KEY_VALUE_DELIMITER + j11 + "\nu32_first_audio_render_time" + ContainerUtils.KEY_VALUE_DELIMITER + a18 + "\nu64_err_code" + ContainerUtils.KEY_VALUE_DELIMITER + c12 + "\nstr_err_info" + ContainerUtils.KEY_VALUE_DELIMITER + c13 + "\nu32_link_type" + ContainerUtils.KEY_VALUE_DELIMITER + c14 + "\nu32_channel_type" + ContainerUtils.KEY_VALUE_DELIMITER + c15 + "\nstr_app_version" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43085e);
    }

    private void b(int i11) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f43083c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.f43082b.get("token");
        TXCDRApi.InitEvent(this.f43084d, str, i11, com.tencent.liteav.basic.datareport.a.f43289an, tXCDRExtInfo);
        a(i11, str);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, i11, "u64_end_timestamp", utcTimeTick);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_timestamp", utcTimeTick);
        double d11 = TXCStatus.d(this.B, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        TXCDRApi.txSetEventValue(str, i11, "u32_avg_cpu_usage", String.valueOf(d11));
        double d12 = TXCStatus.d(this.B, ConnectionResult.SIGN_IN_FAILED);
        TXCDRApi.txSetEventValue(str, i11, "u32_avg_memory", String.valueOf(d12));
        String valueOf = String.valueOf(this.f43102v);
        TXCDRApi.txSetEventValue(str, i11, "u64_begin_timestamp", valueOf);
        long timeTick = (TXCTimeUtil.getTimeTick() - TXCStatus.a(this.B, 7107)) / 1000;
        long j11 = 0;
        TXCDRApi.txSetEventIntValue(str, i11, "u64_playtime", timeTick < 0 ? -1L : timeTick);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_result", timeTick < 0 ? -1L : timeTick);
        int c11 = TXCStatus.c(this.B, 7105);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_err_code", c11);
        int c12 = TXCStatus.c(this.B, 2004);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_speed_cnt", c12);
        int c13 = TXCStatus.c(this.B, 2008);
        long j12 = c13;
        TXCDRApi.txSetEventIntValue(str, i11, "u64_audio_cache_avg", j12);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_cache_time", j12);
        long c14 = TXCStatus.c(this.B, 2003);
        TXCDRApi.txSetEventValue(str, i11, "u32_max_load", String.valueOf(c14));
        long c15 = TXCStatus.c(this.B, 2001);
        TXCDRApi.txSetEventValue(str, i11, "u32_avg_load", String.valueOf(c15));
        long c16 = TXCStatus.c(this.B, 2002);
        TXCDRApi.txSetEventValue(str, i11, "u32_load_cnt", String.valueOf(c16));
        int c17 = TXCStatus.c(this.B, 2005);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_nodata_cnt", c17);
        long j13 = c15 * c16;
        TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_block_time", j13);
        long j14 = this.f43086f;
        if (j14 < 0) {
            j14 = -1;
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_i_frame", j14);
        int c18 = TXCStatus.c(this.B, 6010);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_width", c18);
        int c19 = TXCStatus.c(this.B, 6011);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_height", c19);
        double d13 = TXCStatus.d(this.B, PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED);
        TXCDRApi.txSetEventValue(str, i11, "u32_video_avg_fps", String.valueOf(d13));
        long a11 = TXCStatus.a(this.B, 6003);
        long a12 = TXCStatus.a(this.B, 6005);
        long a13 = TXCStatus.a(this.B, 6006);
        if (a11 > 0) {
            j11 = a13 / a11;
        }
        long j15 = j11;
        TXCDRApi.txSetEventIntValue(str, i11, "u64_block_duration_avg", j15);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_block_time", j15);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_block_count", a11);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_block_time", a13);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_block_duration_max", a12);
        long a14 = TXCStatus.a(this.B, 6103);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_jitter_cache_max", a14);
        long a15 = TXCStatus.a(this.B, 6102);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_jitter_cache_avg", a15);
        TXCDRApi.txSetEventValue(str, i11, "u32_link_type", String.valueOf(TXCStatus.c(this.B, 7112)));
        int c21 = TXCStatus.c(this.B, 7111);
        TXCDRApi.txSetEventValue(str, i11, "u32_channel_type", String.valueOf(c21));
        int c22 = TXCStatus.c(this.B, 7113);
        TXCDRApi.txSetEventValue(str, i11, "u32_ip_count_quic", String.valueOf(c22));
        int c23 = TXCStatus.c(this.B, 7114);
        TXCDRApi.txSetEventValue(str, i11, "u32_connect_count_quic", String.valueOf(c23));
        int c24 = TXCStatus.c(this.B, 7115);
        TXCDRApi.txSetEventValue(str, i11, "u32_connect_count_tcp", String.valueOf(c24));
        TXCDRApi.txSetEventValue(str, i11, "str_app_version", this.f43085e);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_is_real_time", this.f43097q ? 1L : 0L);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_first_frame_black", TXCStatus.a(this.B, 6013));
        TXCDRApi.nativeReportEvent(str, i11);
        TXCLog.d(f43081a, "report evt " + i11 + ": token=" + str + "\nstr_user_id" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_user_id") + "\ndev_uuid" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("dev_uuid") + "\nstr_session_id" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_session_id") + "\nstr_device_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_device_type") + "\nstr_os_info" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_os_info") + "\nstr_package_name" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_package_name") + "\nu32_network_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u32_network_type") + "\nu32_server_ip" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u32_server_ip") + "\nstr_stream_url" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("str_stream_url") + "\nu64_timestamp" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43082b.get("u64_timestamp") + "\nu32_avg_cpu_usage" + ContainerUtils.KEY_VALUE_DELIMITER + d11 + "\nu32_avg_memory" + ContainerUtils.KEY_VALUE_DELIMITER + d12 + "\nu32_first_i_frame" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43086f + "\nu32_video_width" + ContainerUtils.KEY_VALUE_DELIMITER + c18 + "\nu32_video_height" + ContainerUtils.KEY_VALUE_DELIMITER + c19 + "\nu32_video_avg_fps" + ContainerUtils.KEY_VALUE_DELIMITER + d13 + "\nu32_speed_cnt" + ContainerUtils.KEY_VALUE_DELIMITER + c12 + "\nu32_nodata_cnt" + ContainerUtils.KEY_VALUE_DELIMITER + c17 + "\nu32_avg_cache_time" + ContainerUtils.KEY_VALUE_DELIMITER + c13 + "\nu32_avg_block_time" + ContainerUtils.KEY_VALUE_DELIMITER + j15 + "\nu32_avg_load" + ContainerUtils.KEY_VALUE_DELIMITER + c15 + "\nu32_max_load" + ContainerUtils.KEY_VALUE_DELIMITER + c14 + "\nu32_video_block_time" + ContainerUtils.KEY_VALUE_DELIMITER + a13 + "\nu32_audio_block_time" + ContainerUtils.KEY_VALUE_DELIMITER + j13 + "\nu32_load_cnt" + ContainerUtils.KEY_VALUE_DELIMITER + c16 + "\nu32_result" + ContainerUtils.KEY_VALUE_DELIMITER + timeTick + "\nu64_err_code" + ContainerUtils.KEY_VALUE_DELIMITER + c11 + "\nu32_channel_type" + ContainerUtils.KEY_VALUE_DELIMITER + c21 + "\nu32_ip_count_quic" + ContainerUtils.KEY_VALUE_DELIMITER + c22 + "\nu32_connect_count_quic" + ContainerUtils.KEY_VALUE_DELIMITER + c23 + "\nu32_connect_count_tcp" + ContainerUtils.KEY_VALUE_DELIMITER + c24 + "\nu64_block_count" + ContainerUtils.KEY_VALUE_DELIMITER + a11 + "\nu64_jitter_cache_max" + ContainerUtils.KEY_VALUE_DELIMITER + a14 + "\nu64_jitter_cache_avg" + ContainerUtils.KEY_VALUE_DELIMITER + a15 + "\nu64_begin_timestamp" + ContainerUtils.KEY_VALUE_DELIMITER + valueOf + "\nu32_is_real_time" + ContainerUtils.KEY_VALUE_DELIMITER + TXCStatus.a(this.B, 2009) + "\nstr_app_version" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43085e);
    }

    public static boolean c(String str) {
        if (str == null || !str.contains("myqcloud")) {
            return com.tencent.liteav.basic.d.c.a().a(str);
        }
        return true;
    }

    private void c(int i11) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.f43083c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        String str = (String) this.f43082b.get("token");
        TXCDRApi.InitEvent(this.f43084d, str, i11, com.tencent.liteav.basic.datareport.a.f43289an, tXCDRExtInfo);
        a(i11, str);
        TXCDRApi.txSetEventIntValue(str, i11, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        int[] a11 = com.tencent.liteav.basic.util.h.a();
        TXCDRApi.txSetEventIntValue(str, i11, "u32_cpu_usage", a11[1]);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_app_cpu_usage", a11[0]);
        TXCDRApi.txSetEventValue(str, i11, "u32_avg_cpu_usage", String.valueOf(TXCStatus.d(this.B, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)));
        TXCDRApi.txSetEventValue(str, i11, "u32_avg_memory", String.valueOf(TXCStatus.d(this.B, ConnectionResult.SIGN_IN_FAILED)));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_recv_av_diff_time", TXCStatus.a(this.B, 6108));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_play_av_diff_time", TXCStatus.a(this.B, 6107));
        TXCDRApi.txSetEventValue(str, i11, "u64_playtime", String.valueOf((TXCTimeUtil.getUtcTimeTick() - this.f43102v) / 1000));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_decode_type", TXCStatus.c(this.B, 2015) == 0 ? 2 : 1);
        long a12 = TXCStatus.a(this.B, 2002);
        long j11 = this.f43091k;
        if (j11 == -1) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_block_count", 0L);
        } else if (a12 >= j11) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_block_count", a12 - j11);
        } else {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_block_count", -1L);
        }
        this.f43091k = a12;
        TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_cache_time", TXCStatus.c(this.B, 2010));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_drop", TXCStatus.c(this.B, 2014));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_decode_type", TXCStatus.c(this.B, PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED));
        int d11 = (int) TXCStatus.d(this.B, 5007);
        if (d11 == 0) {
            d11 = h();
        }
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_recv_fps", d11);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_fps", (int) TXCStatus.d(this.B, 6002));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_cache_time", TXCStatus.c(this.B, 6101));
        long a13 = TXCStatus.a(this.B, 6102);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_cache_count", a13);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_cache_count", a13);
        long a14 = TXCStatus.a(this.B, 6004);
        long j12 = this.f43087g;
        if (j12 == -1) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_block_count", 0L);
        } else if (a14 >= j12) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_block_count", a14 - j12);
        } else {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_block_count", 0L);
        }
        this.f43087g = a14;
        int c11 = TXCStatus.c(this.B, 7102);
        int c12 = TXCStatus.c(this.B, 7101);
        long j13 = c11 + c12;
        TXCDRApi.txSetEventIntValue(str, i11, "u32_net_speed", j13);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_net_speed", j13);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_audio_bitrate", c11);
        TXCDRApi.txSetEventIntValue(str, i11, "u32_avg_video_bitrate", c12);
        TXCDRApi.txSetEventValue(str, i11, "u32_link_type", String.valueOf(TXCStatus.c(this.B, 7112)));
        TXCDRApi.txSetEventValue(str, i11, "u32_channel_type", String.valueOf(TXCStatus.c(this.B, 7111)));
        TXCDRApi.txSetEventValue(str, i11, "str_app_version", this.f43085e);
        long a15 = TXCStatus.a(this.B, 6009);
        long j14 = this.f43088h;
        if (a15 > j14) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_light_block_count", a15 - j14);
        } else {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_light_block_count", 0L);
        }
        this.f43088h = a15;
        long a16 = TXCStatus.a(this.B, 6003);
        long j15 = this.f43089i;
        if (a16 > j15) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_large_block_count", a16 - j15);
        } else {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_video_large_block_count", 0L);
        }
        this.f43089i = a16;
        long c13 = TXCStatus.c(this.B, 2034);
        long j16 = this.f43090j;
        if (c13 > j16) {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_jitter_60ms_count", c13 - j16);
        } else {
            TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_jitter_60ms_count", 0L);
        }
        this.f43090j = c13;
        TXCDRApi.txSetEventIntValue(str, i11, "u32_video_decode_fail", TXCStatus.c(this.B, 5006));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_audio_decode_fail", TXCStatus.c(this.B, 2035));
        TXCDRApi.nativeReportEvent(str, i11);
        if (this.f43097q) {
            this.f43101u++;
            this.f43100t += a13;
            if (a13 > this.f43099s) {
                this.f43099s = a13;
            }
        }
    }

    private void a(int i11, String str) {
        String b11 = TXCStatus.b(this.B, 7121);
        if (TextUtils.isEmpty(b11)) {
            b11 = str;
        }
        this.f43082b.put("str_session_id", b11);
        this.f43082b.put("u32_server_ip", TXCStatus.b(this.B, 7110));
        if (this.f43097q) {
            this.f43082b.put("str_stream_url", TXCStatus.b(this.B, 7116));
            f((String) this.f43082b.get("str_stream_url"));
        } else {
            this.f43082b.put("str_stream_url", TXCStatus.b(this.B, 7119));
        }
        TXCDRApi.txSetEventValue(str, i11, "str_user_id", (String) this.f43082b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, i11, "dev_uuid", (String) this.f43082b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, i11, "str_session_id", (String) this.f43082b.get("str_session_id"));
        TXCDRApi.txSetEventValue(str, i11, "str_device_type", (String) this.f43082b.get("str_device_type"));
        TXCDRApi.txSetEventValue(str, i11, "str_os_info", (String) this.f43082b.get("str_os_info"));
        TXCDRApi.txSetEventValue(str, i11, "str_package_name", (String) this.f43082b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, i11, "u32_network_type", g("u32_network_type"));
        TXCDRApi.txSetEventValue(str, i11, "u32_server_ip", (String) this.f43082b.get("u32_server_ip"));
        TXCDRApi.txSetEventValue(str, i11, "str_stream_url", (String) this.f43082b.get("str_stream_url"));
    }
}
