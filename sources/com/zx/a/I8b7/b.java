package com.zx.a.I8b7;

import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public SQLiteOpenHelper f46463b;

    /* renamed from: a, reason: collision with root package name */
    public Map<Class<? extends c>, c> f46462a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f46464c = new AtomicBoolean(false);

    public abstract String a();

    public final SQLiteOpenHelper b() {
        SQLiteOpenHelper sQLiteOpenHelper = this.f46463b;
        if (sQLiteOpenHelper != null) {
            return sQLiteOpenHelper;
        }
        StringBuilder a11 = f3.a("db ");
        a11.append(a());
        a11.append(" has not been initialized");
        throw new RuntimeException(a11.toString());
    }

    public abstract int c();
}
