package com.baicizhan.client.framework;

import android.app.Application;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pb.a;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class BaseApp extends Application {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f17503a = new ArrayList();

    public abstract a[] b();

    public final void c() {
        a.d(this);
        ib.a aVar = new ib.a();
        aVar.b();
        this.f17503a.add(aVar);
        a[] b11 = b();
        if (b11 != null) {
            for (a aVar2 : b11) {
                aVar2.b();
                this.f17503a.add(aVar2);
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        String e11 = f.e(this);
        Log.d("whiz", "process name: " + e11);
        if (e11 == null || e11.equals("")) {
            return;
        }
        wb.a.e();
        c();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        Iterator<a> it = this.f17503a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f17503a.clear();
    }
}
