package com.getui.gtc.i.d;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.getui.gtc.a.a.e;
import com.getui.gtc.a.a.f;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.dim.DimManager;
import com.getui.gtc.f.c;
import com.heytap.mcssdk.constant.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f30113a;

    public static class a extends f {
        public a(e eVar) {
            this.f29697e = eVar;
        }

        @Override // com.getui.gtc.a.a.f
        public final void a() {
            e eVar = this.f29697e;
            if (eVar != null) {
                try {
                    eVar.a(null);
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.c(th2);
                }
            }
        }

        @Override // com.getui.gtc.a.a.f
        public final void a(int i11) {
            e eVar = this.f29697e;
            if (eVar != null) {
                try {
                    eVar.a(null);
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.c(th2);
                }
            }
        }

        @Override // com.getui.gtc.a.a.f
        public final void a(Map<String, List<String>> map, byte[] bArr) {
            try {
                if (this.f29697e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("header", map);
                    hashMap.put("data", new String(bArr, "utf-8"));
                    this.f29697e.a(hashMap);
                }
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
            }
        }
    }

    /* renamed from: com.getui.gtc.i.d.b$b, reason: collision with other inner class name */
    public static class C0360b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f30118a = new b(0);
    }

    private b() {
        this.f30113a = new AtomicBoolean(false);
        final Map<String, String> a11 = c.a(Constants.MILLS_OF_LAUNCH_INTERVAL, new com.getui.gtc.f.e() { // from class: com.getui.gtc.i.d.b.1
            @Override // com.getui.gtc.f.e
            public final void a(String str) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:118:0x01ca, code lost:
            
                if (r8.equals("dim-2-1-14-1") != false) goto L111;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:16:0x009a. Please report as an issue. */
            @Override // com.getui.gtc.f.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.util.Map<java.lang.String, java.lang.String> r47, java.util.Map<java.lang.String, java.lang.String> r48) {
                /*
                    Method dump skipped, instructions count: 832
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.i.d.b.AnonymousClass1.a(java.util.Map, java.util.Map):void");
            }
        });
        a(a11);
        ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.i.d.b.2
            @Override // java.lang.Runnable
            public final void run() {
                com.getui.gtc.i.c.b.a((Map<String, String>) a11);
            }
        });
    }

    private void a() {
        if (this.f30113a.getAndSet(true) || a(GtcProvider.context())) {
            return;
        }
        a aVar = new a(new e() { // from class: com.getui.gtc.i.d.b.3
            @Override // com.getui.gtc.a.a.e
            public final void a(Object obj) throws Throwable {
                Map map;
                List<String> list;
                if (obj instanceof HashMap) {
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap.size() <= 0 || (map = (Map) hashMap.get("header")) == null || map.size() <= 0 || (list = (List) map.get("Date")) == null) {
                        return;
                    }
                    for (String str : list) {
                        if (str.contains(":") && str.contains("GMT")) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.ENGLISH);
                            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                            Date parse = simpleDateFormat.parse(str);
                            long time = parse.getTime();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis != time) {
                                long j11 = time - currentTimeMillis;
                                com.getui.gtc.i.c.a.a("serverDate:" + parse + ", localTimeByServerTimeDiff:" + j11);
                                DimManager.getInstance().set("dim-2-2-4-1", "dim-2-2-4-1", String.valueOf(j11));
                            }
                        }
                    }
                }
            }
        });
        aVar.f29693a = "https://sdk-open-phone.getui.com/";
        ScheduleQueue.getInstance().addSchedule(new com.getui.gtc.a.a.b(aVar));
    }

    public /* synthetic */ b(byte b11) {
        this();
    }

    public final void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            DimManager.getInstance().set("dim-2-2-1-1", "dim-2-2-1-1", new JSONObject(map).toString());
            String str = map.get("sdk.gtc.dim.halfclosed.enable");
            if (TextUtils.isEmpty(str) || "none".equals(str)) {
                return;
            }
            a();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
        }
    }

    private static boolean a(Context context) {
        return CommonUtil.isAppForeground() && Settings.System.getInt(context.getContentResolver(), "auto_time", 1) == 1;
    }
}
