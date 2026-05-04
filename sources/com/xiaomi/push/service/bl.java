package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.cu;
import com.xiaomi.push.dv;
import com.xiaomi.push.dw;
import com.xiaomi.push.ey;
import com.xiaomi.push.fg;
import com.xiaomi.push.fi;
import com.xiaomi.push.fv;
import com.xiaomi.push.gx;
import com.xiaomi.push.service.bv;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class bl extends bv.a implements cu.a {

    /* renamed from: a, reason: collision with root package name */
    private long f46326a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f974a;

    public static class a implements cu.b {
        @Override // com.xiaomi.push.cu.b
        public String a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", gx.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter(oc.h.f76767b, String.valueOf(com.xiaomi.push.s.a()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.b.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a11 = com.xiaomi.push.bi.a(com.xiaomi.push.s.m6183a(), url);
                fi.a(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - currentTimeMillis), null);
                return a11;
            } catch (IOException e11) {
                fi.a(url.getHost() + ":" + port, -1, e11);
                throw e11;
            }
        }
    }

    public static class b extends com.xiaomi.push.cu {
        public b(Context context, com.xiaomi.push.ct ctVar, cu.b bVar, String str) {
            super(context, ctVar, bVar, str);
        }

        @Override // com.xiaomi.push.cu
        public String a(ArrayList<String> arrayList, String str, String str2, boolean z11) {
            try {
                if (fg.m5936a().m5941a()) {
                    str2 = bv.m6265a();
                }
                return super.a(arrayList, str, str2, z11);
            } catch (IOException e11) {
                fi.a(0, ey.GSLB_ERR.a(), 1, null, com.xiaomi.push.bi.c(com.xiaomi.push.cu.f45364a) ? 1 : 0);
                throw e11;
            }
        }
    }

    public bl(XMPushService xMPushService) {
        this.f974a = xMPushService;
    }

    @Override // com.xiaomi.push.cu.a
    public com.xiaomi.push.cu a(Context context, com.xiaomi.push.ct ctVar, cu.b bVar, String str) {
        return new b(context, ctVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.bv.a
    public void a(dv.a aVar) {
    }

    @Override // com.xiaomi.push.service.bv.a
    public void a(dw.b bVar) {
        com.xiaomi.push.cq b11;
        if (bVar.m5851b() && bVar.m5850a() && System.currentTimeMillis() - this.f46326a > 3600000) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("fetch bucket :" + bVar.m5850a());
            this.f46326a = System.currentTimeMillis();
            com.xiaomi.push.cu a11 = com.xiaomi.push.cu.a();
            a11.m5807a();
            a11.m5810b();
            fv m6206a = this.f974a.m6206a();
            if (m6206a == null || (b11 = a11.b(m6206a.m5964a().c())) == null) {
                return;
            }
            ArrayList<String> m5794a = b11.m5794a();
            Iterator<String> it = m5794a.iterator();
            while (it.hasNext()) {
                if (it.next().equals(m6206a.mo5965a())) {
                    return;
                }
            }
            if (m5794a.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("bucket changed, force reconnect");
            this.f974a.a(0, (Exception) null);
            this.f974a.a(false);
        }
    }

    public static void a(XMPushService xMPushService) {
        bl blVar = new bl(xMPushService);
        bv.a().a(blVar);
        synchronized (com.xiaomi.push.cu.class) {
            com.xiaomi.push.cu.a(blVar);
            com.xiaomi.push.cu.a(xMPushService, null, new a(), "0", com.igexin.push.config.c.f37565x, "2.2");
        }
    }
}
