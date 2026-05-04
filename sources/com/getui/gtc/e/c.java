package com.getui.gtc.e;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.db.DbManager;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public d f30024a;

    /* renamed from: b, reason: collision with root package name */
    public com.getui.gtc.e.a f30025b;

    /* renamed from: c, reason: collision with root package name */
    private e f30026c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f30027a = new c(0);
    }

    private c() {
        try {
            DbManager.init(GtcProvider.context(), b.class, com.getui.gtc.e.a.class, d.class, e.class);
            this.f30024a = (d) DbManager.getTable(b.class, d.class);
            this.f30026c = (e) DbManager.getTable(b.class, e.class);
            this.f30025b = (com.getui.gtc.e.a) DbManager.getTable(b.class, com.getui.gtc.e.a.class);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    public /* synthetic */ c(byte b11) {
        this();
    }
}
