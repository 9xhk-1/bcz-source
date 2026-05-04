package io.openinstall.sdk;

import android.text.TextUtils;
import com.fm.openinstall.model.AppData;
import io.openinstall.sdk.az;
import org.json.JSONException;
import tz.e0;
import tz.j0;
import tz.q0;

/* loaded from: classes8.dex */
public class d extends e0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62601l;

    /* renamed from: m, reason: collision with root package name */
    public final int f62602m;

    /* renamed from: n, reason: collision with root package name */
    public final sl.b f62603n;

    public d(q0 q0Var, boolean z11, int i11, sl.b bVar) {
        super(q0Var);
        this.f62601l = z11;
        this.f62602m = e(i11);
        this.f62603n = bVar;
    }

    @Override // tz.e0
    public void b() {
        if (this.f62601l) {
            this.f91250i.k("install");
        } else {
            this.f91250i.d("install");
        }
        this.f91244c.b("install", this.f62602m * 1000);
    }

    @Override // tz.e0
    public void c(az azVar) {
        if (azVar.a() != az.a.SUCCESS) {
            if (j0.f91313a) {
                j0.c("decodeInstall fail : %s", azVar.g());
            }
            sl.b bVar = this.f62603n;
            if (bVar != null) {
                bVar.a(null, new tl.a(azVar.e(), azVar.g()));
                return;
            }
            return;
        }
        if (j0.f91313a) {
            j0.a("decodeInstall success : %s", azVar.i());
        }
        if (!TextUtils.isEmpty(azVar.g()) && j0.f91313a) {
            j0.b("decodeInstall warning : %s", azVar.g());
        }
        try {
            aw d11 = aw.d(azVar.i());
            AppData appData = new AppData();
            appData.setChannel(d11.a());
            appData.setData(d11.b());
            sl.b bVar2 = this.f62603n;
            if (bVar2 != null) {
                bVar2.a(appData, null);
            }
        } catch (JSONException e11) {
            if (j0.f91313a) {
                j0.c("decodeInstall error : %s", e11.toString());
            }
            sl.b bVar3 = this.f62603n;
            if (bVar3 != null) {
                bVar3.a(null, null);
            }
        }
    }

    @Override // tz.e0
    public az d() {
        if (!this.f91244c.e()) {
            az azVar = new az(az.a.ERROR, -4);
            azVar.f("超时返回，请重试");
            return azVar;
        }
        if (this.f91244c.d()) {
            String a11 = this.f91245d.a("FM_init_data");
            az azVar2 = new az(az.a.SUCCESS, 0);
            azVar2.h(a11);
            a(azVar2.k());
            return azVar2;
        }
        String a12 = this.f91245d.a("FM_init_msg");
        az azVar3 = new az(az.a.ERROR, -12);
        azVar3.f("初始化时错误：" + a12);
        return azVar3;
    }

    public final int e(int i11) {
        if (i11 > 0) {
            return i11;
        }
        return 10;
    }
}
