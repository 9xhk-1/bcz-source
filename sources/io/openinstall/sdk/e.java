package io.openinstall.sdk;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fm.openinstall.model.AppData;
import io.openinstall.sdk.az;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tz.e0;
import tz.h0;
import tz.j0;
import tz.q0;

/* loaded from: classes8.dex */
public class e extends e0 {

    /* renamed from: l, reason: collision with root package name */
    public final Uri f62604l;

    /* renamed from: m, reason: collision with root package name */
    public final sl.e f62605m;

    public e(q0 q0Var, Uri uri, sl.e eVar) {
        super(q0Var);
        this.f62604l = uri;
        this.f62605m = eVar;
    }

    @Override // tz.e0
    public void b() {
        this.f91250i.d("wakeup");
        this.f91244c.b("wakeup", 6000L);
    }

    @Override // tz.e0
    public void c(az azVar) {
        if (azVar.a() != az.a.SUCCESS) {
            if (j0.f91313a) {
                j0.c("decodeWakeUp fail : %s", azVar.g());
            }
            sl.e eVar = this.f62605m;
            if (eVar != null) {
                eVar.a(null, new tl.a(azVar.e(), azVar.g()));
                return;
            }
            return;
        }
        if (j0.f91313a) {
            j0.a("decodeWakeUp success : %s", azVar.i());
        }
        if (!TextUtils.isEmpty(azVar.g()) && j0.f91313a) {
            j0.b("decodeWakeUp warning : %s", azVar.g());
        }
        try {
            AppData appData = new AppData();
            if (azVar.e() == 1) {
                appData = f(azVar.i());
            } else {
                aw d11 = aw.d(azVar.i());
                appData.setChannel(d11.a());
                appData.setData(d11.b());
            }
            sl.e eVar2 = this.f62605m;
            if (eVar2 != null) {
                eVar2.a(appData, null);
            }
            if (appData == null || appData.isEmpty()) {
                return;
            }
            e(this.f62604l);
        } catch (JSONException e11) {
            if (j0.f91313a) {
                j0.c("decodeWakeUp error : %s", e11.toString());
            }
            sl.e eVar3 = this.f62605m;
            if (eVar3 != null) {
                eVar3.a(null, null);
            }
        }
    }

    @Override // tz.e0
    public az d() {
        if (!this.f91244c.d()) {
            String a11 = this.f91245d.a("FM_init_msg");
            az azVar = new az(az.a.ERROR, -12);
            azVar.f("初始化时错误：" + a11);
            return azVar;
        }
        Uri uri = this.f62604l;
        if (uri == null) {
            HashMap hashMap = new HashMap();
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
            this.f91242a.i().execute(new f(this, linkedBlockingQueue));
            try {
                Pair pair = (Pair) linkedBlockingQueue.poll(3L, TimeUnit.SECONDS);
                hashMap.put(pair.first, pair.second);
                this.f91250i.d("wakeup");
            } catch (InterruptedException unused) {
            }
            az g11 = this.f91249h.g(hashMap);
            a(g11.k());
            return g11;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 0) {
            az azVar2 = new az(az.a.SUCCESS, 1);
            azVar2.f("The wakeup parameter is invalid");
            return azVar2;
        }
        if (pathSegments.get(0).equalsIgnoreCase("c")) {
            if (pathSegments.size() <= 1) {
                az azVar3 = new az(az.a.SUCCESS, 1);
                azVar3.h("");
                return azVar3;
            }
            String b11 = h0.b(pathSegments.get(1), 8);
            az azVar4 = new az(az.a.SUCCESS, 1);
            azVar4.h(b11);
            return azVar4;
        }
        if (!pathSegments.get(0).equalsIgnoreCase(CmcdData.STREAMING_FORMAT_HLS)) {
            az azVar5 = new az(az.a.SUCCESS, 1);
            azVar5.f("The wakeup parameter is invalid");
            return azVar5;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("waU", this.f62604l.toString());
        az g12 = this.f91249h.g(hashMap2);
        a(g12.k());
        return g12;
    }

    public final void e(Uri uri) {
        this.f91242a.i().execute(new n(this.f91242a, uri));
    }

    public final AppData f(String str) throws JSONException {
        AppData appData = new AppData();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("c")) {
                appData.setChannel(jSONObject.optString("c"));
            }
            if (jSONObject.has("d") && !jSONObject.isNull("d")) {
                appData.setData(jSONObject.optString("d"));
            }
        }
        return appData;
    }
}
