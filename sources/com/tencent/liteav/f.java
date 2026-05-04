package com.tencent.liteav;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class f {
    private int E;
    private int G;
    private String H;
    private String I;

    /* renamed from: c, reason: collision with root package name */
    private Context f43555c;

    /* renamed from: q, reason: collision with root package name */
    private int f43569q;

    /* renamed from: y, reason: collision with root package name */
    private int f43577y;

    /* renamed from: a, reason: collision with root package name */
    private final String f43553a = "TXCVodPlayCollection";

    /* renamed from: b, reason: collision with root package name */
    private final String f43554b = "1";

    /* renamed from: d, reason: collision with root package name */
    private String f43556d = null;

    /* renamed from: e, reason: collision with root package name */
    private long f43557e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f43558f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f43559g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43560h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43561i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f43562j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f43563k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f43564l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f43565m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f43566n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f43567o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f43568p = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f43571s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f43572t = false;

    /* renamed from: u, reason: collision with root package name */
    private int f43573u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f43574v = 0;

    /* renamed from: w, reason: collision with root package name */
    private String f43575w = "0";

    /* renamed from: x, reason: collision with root package name */
    private String f43576x = "";

    /* renamed from: z, reason: collision with root package name */
    private String f43578z = "";
    private int A = -1;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    private float F = 1.0f;
    private String K = "";

    /* renamed from: r, reason: collision with root package name */
    private String f43570r = TXCCommonUtil.getAppVersion();
    private String J = com.tencent.liteav.basic.util.h.c();

    public f(Context context) {
        this.f43555c = context;
    }

    private void m() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.f43556d;
        TXCDRApi.InitEvent(this.f43555c, this.J, com.tencent.liteav.basic.datareport.a.f43279ad, com.tencent.liteav.basic.datareport.a.f43295at, tXCDRExtInfo);
        String str = com.tencent.liteav.basic.util.e.f43437a;
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_device_type", str);
        int d11 = com.tencent.liteav.basic.util.h.d(this.f43555c);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_network_type", d11);
        String e11 = com.tencent.liteav.basic.util.h.e(this.f43555c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "dev_uuid", e11);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_app_version", this.f43570r);
        String a11 = a();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_app_name", a11);
        String str2 = this.J;
        int i11 = com.tencent.liteav.basic.datareport.a.f43279ad;
        String str3 = com.tencent.liteav.basic.datareport.a.f43337l;
        int i12 = Build.VERSION.SDK_INT;
        TXCDRApi.txSetEventValue(str2, i11, str3, String.valueOf(i12));
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_stream_url", this.f43556d);
        String str4 = this.J;
        TXCDRApi.txSetEventValue(str4, com.tencent.liteav.basic.datareport.a.f43279ad, "token", str4);
        String userId = TXCCommonUtil.getUserId();
        if (userId == null || userId.isEmpty()) {
            userId = "_" + e11;
        }
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_user_id", userId);
        String c11 = com.tencent.liteav.basic.util.h.c(this.f43555c);
        String str5 = userId;
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_package_name", c11);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_app_id", this.K);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_timeuse", this.f43564l);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_videotime", this.f43562j);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_avg_load", this.f43567o == 0 ? 0L : this.f43568p / r13);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_load_cnt", this.f43567o);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_max_load", this.f43569q);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_avg_block_time", this.f43568p);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_player_type", this.f43574v);
        String str6 = this.J;
        int i13 = com.tencent.liteav.basic.datareport.a.f43279ad;
        int i14 = this.C;
        TXCDRApi.txSetEventIntValue(str6, i13, "u32_dns_time", i14 > 0 ? i14 : -1L);
        String str7 = this.J;
        int i15 = com.tencent.liteav.basic.datareport.a.f43279ad;
        int i16 = this.B;
        TXCDRApi.txSetEventIntValue(str7, i15, "u32_tcp_did_connect", i16 > 0 ? i16 : -1L);
        String str8 = this.J;
        int i17 = com.tencent.liteav.basic.datareport.a.f43279ad;
        int i18 = this.D;
        TXCDRApi.txSetEventIntValue(str8, i17, "u32_first_video_packet", i18 > 0 ? i18 : -1L);
        String str9 = this.J;
        int i19 = com.tencent.liteav.basic.datareport.a.f43279ad;
        int i21 = this.f43566n;
        TXCDRApi.txSetEventIntValue(str9, i19, "u32_first_i_frame", i21 > 0 ? i21 : -1L);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_server_ip", this.H);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_drm_type", this.I);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_fileid", this.f43576x);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_playmode", this.f43575w);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u64_err_code", this.f43577y);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "str_err_info", this.f43578z);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_video_decode_type", this.A);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_speed", (int) (this.F * 100.0f));
        TXCDRApi.nativeReportEvent(this.J, com.tencent.liteav.basic.datareport.a.f43279ad);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("report evt 40301: token=");
        sb2.append(this.J);
        sb2.append(" ,");
        sb2.append("str_device_type");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(str);
        sb2.append(" ,");
        sb2.append("u32_network_type");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(d11);
        sb2.append(" ,");
        sb2.append("dev_uuid");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(com.tencent.liteav.basic.util.h.e(this.f43555c));
        sb2.append(" ,");
        sb2.append("str_app_version");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43570r);
        sb2.append(" ,");
        sb2.append("str_app_name");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(a11);
        sb2.append(" ,");
        sb2.append(com.tencent.liteav.basic.datareport.a.f43337l);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(i12);
        sb2.append(" ,");
        sb2.append("str_stream_url");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43556d);
        sb2.append(" ,");
        sb2.append("str_user_id");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(str5);
        sb2.append(" ,");
        sb2.append("str_package_name");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(c11);
        sb2.append(" ,");
        sb2.append("u32_timeuse");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43564l);
        sb2.append(" ,");
        sb2.append("u32_videotime");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43562j);
        sb2.append(" ,");
        sb2.append("u32_avg_load");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        int i22 = this.f43567o;
        sb2.append(i22 == 0 ? 0 : this.f43568p / i22);
        sb2.append(" ,");
        sb2.append("u32_load_cnt");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43567o);
        sb2.append(" ,");
        sb2.append("u32_max_load");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43569q);
        sb2.append(" ,");
        sb2.append("u32_avg_block_time");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43568p);
        sb2.append(" ,");
        sb2.append("u32_player_type");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43574v);
        sb2.append(" ,");
        sb2.append("u32_dns_time");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.C);
        sb2.append(" ,");
        sb2.append("u32_tcp_did_connect");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        int i23 = this.B;
        if (i23 <= 0) {
            i23 = -1;
        }
        sb2.append(i23);
        sb2.append(" ,");
        sb2.append("u32_first_video_packet");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        int i24 = this.D;
        if (i24 <= 0) {
            i24 = -1;
        }
        sb2.append(i24);
        sb2.append(" ,");
        sb2.append("u32_first_i_frame");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43566n);
        sb2.append(" ,");
        sb2.append("u32_server_ip");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.H);
        sb2.append(" ,");
        sb2.append("u32_drm_type");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.I);
        sb2.append(" ,");
        sb2.append("str_fileid");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43576x);
        sb2.append(" ,");
        sb2.append("u32_playmode");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43575w);
        sb2.append(" ,");
        sb2.append("u64_err_code");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43577y);
        sb2.append(" ,");
        sb2.append("str_err_info");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f43578z);
        sb2.append(" ,");
        sb2.append("u32_speed");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.F * 100.0f);
        sb2.append(" ,");
        sb2.append("u32_app_id");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(TXCCommonUtil.getAppID());
        sb2.append(" ,");
        sb2.append("u32_video_decode_type");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.A);
        TXCLog.i("TXCVodPlayCollection", sb2.toString());
    }

    private void n() {
        if (0 == this.f43558f) {
            TXCLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mBeginPlayTS == 0");
            return;
        }
        TXCLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mCurIndexPlayTime= " + this.f43565m + ", mBeginPlayTS=" + this.f43558f);
        this.f43565m = this.f43565m + ((long) ((int) (System.currentTimeMillis() - this.f43558f)));
        this.f43558f = System.currentTimeMillis();
        if (this.f43575w.equals("1")) {
            boolean b11 = g.a(this.f43555c).b(this.K);
            if (!b11) {
                g.a(this.f43555c).c(this.K);
            }
            if (this.f43560h && b11) {
                o();
            }
            long j11 = this.f43564l;
            long j12 = this.f43565m;
            this.f43564l = (int) (j11 + (j12 / 1000));
            this.f43565m = j12 % 1000;
        }
    }

    private void o() {
        TXCLog.i("TXCVodPlayCollection", "onSegmentReport");
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.f43556d;
        TXCDRApi.InitEvent(this.f43555c, this.J, com.tencent.liteav.basic.datareport.a.f43280ae, com.tencent.liteav.basic.datareport.a.f43295at, tXCDRExtInfo);
        String str = com.tencent.liteav.basic.util.e.f43437a;
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_device_type", str);
        int d11 = com.tencent.liteav.basic.util.h.d(this.f43555c);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_network_type", d11);
        String e11 = com.tencent.liteav.basic.util.h.e(this.f43555c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "dev_uuid", e11);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_app_version", this.f43570r);
        String a11 = a();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_app_name", a11);
        String str2 = this.J;
        int i11 = com.tencent.liteav.basic.datareport.a.f43280ae;
        String str3 = com.tencent.liteav.basic.datareport.a.f43337l;
        int i12 = Build.VERSION.SDK_INT;
        TXCDRApi.txSetEventValue(str2, i11, str3, String.valueOf(i12));
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_stream_url", this.f43556d);
        String str4 = this.J;
        TXCDRApi.txSetEventValue(str4, com.tencent.liteav.basic.datareport.a.f43280ae, "token", str4);
        String userId = TXCCommonUtil.getUserId();
        if (userId == null || userId.isEmpty()) {
            userId = "_" + e11;
        }
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_user_id", userId);
        String c11 = com.tencent.liteav.basic.util.h.c(this.f43555c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_package_name", c11);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43279ad, "u32_app_id", this.K);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_videotime", this.f43562j);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_player_type", this.f43574v);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_server_ip", this.H);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_drm_type", this.I);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "str_fileid", this.f43576x);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_playmode", this.f43575w);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_videoindex", this.f43563k);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_realplaytime", this.f43565m / 1000);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u64_timestamp", System.currentTimeMillis());
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_speed", (int) (this.F * 100.0f));
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.f43280ae, "u32_segment_duration", g.a(this.f43555c).a(this.K));
        TXCDRApi.nativeReportEvent(this.J, com.tencent.liteav.basic.datareport.a.f43280ae);
        TXCLog.i("TXCVodPlayCollection", "report evt 40302: token=" + this.J + " ,str_device_type" + ContainerUtils.KEY_VALUE_DELIMITER + str + " ,u32_network_type" + ContainerUtils.KEY_VALUE_DELIMITER + d11 + " ,dev_uuid" + ContainerUtils.KEY_VALUE_DELIMITER + com.tencent.liteav.basic.util.h.e(this.f43555c) + " ,str_app_version" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43570r + " ,str_app_name" + ContainerUtils.KEY_VALUE_DELIMITER + a11 + " ," + com.tencent.liteav.basic.datareport.a.f43337l + ContainerUtils.KEY_VALUE_DELIMITER + i12 + " ,str_stream_url" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43556d + " ,str_user_id" + ContainerUtils.KEY_VALUE_DELIMITER + userId + " ,str_package_name" + ContainerUtils.KEY_VALUE_DELIMITER + c11 + " ,u32_videotime" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43562j + " ,u32_player_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43574v + " ,u32_server_ip" + ContainerUtils.KEY_VALUE_DELIMITER + this.H + " ,u32_drm_type" + ContainerUtils.KEY_VALUE_DELIMITER + this.I + " ,str_fileid" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43576x + " ,u32_playmode" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43575w + " ,u32_videoindex" + ContainerUtils.KEY_VALUE_DELIMITER + this.f43563k + " ,u32_realplaytime" + ContainerUtils.KEY_VALUE_DELIMITER + (this.f43565m / 1000) + " ,u32_speed" + ContainerUtils.KEY_VALUE_DELIMITER + (this.F * 100.0f) + " ,u32_app_id" + ContainerUtils.KEY_VALUE_DELIMITER + TXCCommonUtil.getAppID() + " ,u64_timestamp" + ContainerUtils.KEY_VALUE_DELIMITER + System.currentTimeMillis());
    }

    public void a(String str) {
        TXCLog.i("TXCVodPlayCollection", "setUrl: " + str);
        this.f43556d = str;
    }

    public void b() {
        TXCLog.i("TXCVodPlayCollection", "stop " + this.f43565m);
        if (this.f43561i) {
            this.f43558f = System.currentTimeMillis();
        }
        if (this.f43560h) {
            n();
            this.f43564l = (int) (this.f43564l + (this.f43565m / 1000));
            this.f43565m = 0L;
            m();
            this.f43560h = false;
        }
        this.f43571s = false;
        this.f43572t = false;
        this.f43561i = false;
    }

    public void c() {
        TXCLog.i("TXCVodPlayCollection", "pause " + this.f43565m);
        if (!this.f43561i) {
            this.f43565m += System.currentTimeMillis() - this.f43558f;
        }
        this.f43561i = true;
        this.f43558f = System.currentTimeMillis();
    }

    public void d() {
        this.f43558f = System.currentTimeMillis();
        TXCLog.i("TXCVodPlayCollection", "resume " + this.f43558f);
        this.f43561i = false;
    }

    public void e() {
        TXCLog.i("TXCVodPlayCollection", "setLoadEnd mFirstFrame=" + this.f43566n + " , mIsLoading = " + this.f43572t + ",mBeginLoadTS = " + this.f43559g);
        if (this.f43566n != 0 && this.f43572t) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f43559g);
            this.f43568p += currentTimeMillis;
            this.f43567o++;
            if (this.f43569q < currentTimeMillis) {
                this.f43569q = currentTimeMillis;
            }
            this.f43572t = false;
        }
        if (this.f43571s) {
            this.f43571s = false;
        }
    }

    public void f() {
        TXCLog.i("TXCVodPlayCollection", "renderStart");
        if (this.f43566n == 0) {
            this.f43566n = (int) (System.currentTimeMillis() - this.f43557e);
        }
    }

    public void g() {
        if (this.B == 0) {
            this.B = (int) (System.currentTimeMillis() - this.f43557e);
            TXCLog.i("TXCVodPlayCollection", "mTcpConnectTS = " + this.B + ", mOriginBeginPlayTS = " + this.f43557e + j2.O + System.currentTimeMillis());
        }
    }

    public void h() {
        if (this.C == 0) {
            this.C = (int) (System.currentTimeMillis() - this.f43557e);
        }
    }

    public void i() {
        if (this.D == 0) {
            this.D = (int) (System.currentTimeMillis() - this.f43557e);
        }
    }

    public void j() {
        this.f43559g = System.currentTimeMillis();
        this.f43572t = true;
        TXCLog.i("TXCVodPlayCollection", "setLoadBegin mBeginLoadTS= " + this.f43559g);
    }

    public void k() {
        this.f43571s = true;
        this.f43573u++;
        TXCDRApi.txReportDAU(this.f43555c, com.tencent.liteav.basic.datareport.a.f43327bz);
        TXCLog.d("TXCVodPlayCollection", "mSeekCnt= " + this.f43573u);
    }

    public void l() {
        this.G++;
        TXCDRApi.txReportDAU(this.f43555c, com.tencent.liteav.basic.datareport.a.bC);
        TXCLog.d("TXCVodPlayCollection", "mSetBitrateIndexCnt= " + this.G);
    }

    public String a() {
        Context context = this.f43555c;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.labelRes;
        return i11 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i11);
    }

    public void d(String str) {
        this.f43576x = str;
    }

    public void f(String str) {
        this.K = str;
    }

    public void c(String str) {
        this.I = str;
    }

    public void a(int i11, int i12) {
        this.f43562j = i11;
        int a11 = i12 / g.a(this.f43555c).a(this.K);
        if (a11 != this.f43563k) {
            this.f43563k = a11;
            n();
        }
    }

    public void a(boolean z11) {
        this.f43560h = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.f43558f = currentTimeMillis;
        this.f43557e = currentTimeMillis;
        this.f43564l = 0;
        this.f43565m = 0L;
        this.f43563k = 0;
        this.f43559g = 0L;
        this.f43567o = 0;
        this.f43568p = 0;
        this.f43569q = 0;
        if (z11) {
            this.f43561i = false;
        }
        TXCLog.i("TXCVodPlayCollection", "start " + this.f43558f + ", mIsPaused = " + this.f43561i);
    }

    public void e(String str) {
        this.H = str;
        if (str == null) {
            this.H = "";
        }
    }

    public void b(String str) {
        this.f43575w = str;
    }

    public void b(boolean z11) {
        if (z11) {
            this.E = 1;
            TXCDRApi.txReportDAU(this.f43555c, com.tencent.liteav.basic.datareport.a.bB);
        } else {
            this.E = 0;
        }
        TXCLog.i("TXCVodPlayCollection", "mIsMirror= " + this.E);
    }

    public void b(int i11) {
        this.A = i11;
    }

    public void a(int i11) {
        this.f43574v = i11;
    }

    public void a(float f11) {
        this.F = f11;
        TXCDRApi.txReportDAU(this.f43555c, com.tencent.liteav.basic.datareport.a.bA);
        TXCLog.i("TXCVodPlayCollection", "mSpeed = " + this.F);
    }

    public void a(int i11, String str) {
        TXCLog.i("TXCVodPlayCollection", "errorCode= " + i11 + " ，errorInfo= " + str);
        if (this.f43566n == 0) {
            this.f43577y = i11;
            this.f43578z = str;
            if (str == null) {
                this.f43578z = "";
            }
        }
    }
}
