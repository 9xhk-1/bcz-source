package com.igexin.push.core.e;

import android.database.sqlite.SQLiteDatabase;
import com.igexin.push.g.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    private static b f38050b;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, byte[]> f38051a = new HashMap();

    private b() {
    }

    private static b a() {
        if (f38050b == null) {
            f38050b = new b();
        }
        return f38050b;
    }

    private String a(byte[] bArr) {
        String a11;
        do {
            a11 = p.a();
        } while (this.f38051a.containsKey(a11));
        this.f38051a.put(a11, bArr);
        return a11;
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    private synchronized byte[] a(String str) {
        byte[] bArr;
        bArr = this.f38051a.get(str);
        if (bArr != null) {
            this.f38051a.remove(str);
        }
        return bArr;
    }

    @Override // com.igexin.push.core.e.a
    public final void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
    }
}
