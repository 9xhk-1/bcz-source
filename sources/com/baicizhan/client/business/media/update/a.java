package com.baicizhan.client.business.media.update;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import j9.a;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements a.e, a.f {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16529g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f16530h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f16531i = -2;

    /* renamed from: a, reason: collision with root package name */
    public Context f16532a;

    /* renamed from: b, reason: collision with root package name */
    public da.a f16533b;

    /* renamed from: c, reason: collision with root package name */
    public j9.a f16534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16535d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16536e = false;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0270a f16537f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.media.update.a$a, reason: collision with other inner class name */
    public interface InterfaceC0270a {
        void a(boolean success, int errCode);
    }

    public a(Context context) {
        this.f16532a = context;
        this.f16533b = new da.a(context, this);
        this.f16534c = j9.a.e(this.f16532a, this, this);
    }

    public static a c(Context context, InterfaceC0270a l11) {
        a aVar = new a(context);
        aVar.f16537f = l11;
        return aVar;
    }

    @Override // j9.a.f
    public void a(boolean success, int errCode) {
        if (f()) {
            return;
        }
        if (success) {
            InterfaceC0270a interfaceC0270a = this.f16537f;
            if (interfaceC0270a != null) {
                interfaceC0270a.a(true, 0);
            }
        } else {
            InterfaceC0270a interfaceC0270a2 = this.f16537f;
            if (interfaceC0270a2 != null) {
                interfaceC0270a2.a(false, -1 != errCode ? -2 : -1);
            }
        }
        d();
    }

    public void b(boolean destroy) {
        this.f16536e = destroy;
        this.f16535d = true;
    }

    public void d() {
        this.f16534c.f();
        this.f16532a = null;
    }

    public final void e() {
        if (f()) {
            return;
        }
        this.f16534c.r(x.r().l());
    }

    public final boolean f() {
        if (!this.f16535d) {
            return false;
        }
        if (this.f16536e) {
            this.f16536e = false;
            d();
        }
        this.f16535d = false;
        return true;
    }

    public void g() {
        if (f()) {
            return;
        }
        this.f16534c.j();
    }

    @Override // j9.a.e
    public void onMidRefreshed(boolean success, int errCode) {
        if (f()) {
            return;
        }
        this.f16533b.d();
    }

    @Override // j9.a.e
    public void onUpdated(boolean success, int errCode) {
        if (f()) {
            return;
        }
        if (success) {
            this.f16534c.s(x.r().l());
            return;
        }
        InterfaceC0270a interfaceC0270a = this.f16537f;
        if (interfaceC0270a != null) {
            interfaceC0270a.a(false, -1 != errCode ? -2 : -1);
            d();
        }
    }

    @Override // j9.a.e
    public void onInserted(boolean success, int errCode, List<WordMediaRecord> records) {
    }
}
