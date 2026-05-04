package com.igexin.push.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.c.a.b.e;
import com.igexin.c.a.d.f;
import com.igexin.push.core.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public static int f37379a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f37380b = -980948;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37381g = -2147483639;

    /* renamed from: h, reason: collision with root package name */
    private static final String f37382h = "com.igexin.push.b.a";

    /* renamed from: c, reason: collision with root package name */
    protected SQLiteDatabase f37383c;

    /* renamed from: d, reason: collision with root package name */
    protected Cursor f37384d;

    /* renamed from: e, reason: collision with root package name */
    List<com.igexin.push.core.e.a> f37385e;

    /* renamed from: f, reason: collision with root package name */
    boolean f37386f;

    public a() {
        super(1);
        this.f37385e = new LinkedList();
    }

    private void b(boolean z11) {
        this.f37386f = z11;
    }

    public final void a(com.igexin.push.core.e.a aVar) {
        this.f37385e.add(aVar);
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        SQLiteDatabase writableDatabase = d.a.f37956a.f37950i.getWritableDatabase();
        this.f37383c = writableDatabase;
        writableDatabase.setVersion(7);
        Iterator<com.igexin.push.core.e.a> it = this.f37385e.iterator();
        while (it.hasNext()) {
            it.next().a(this.f37383c);
        }
        for (com.igexin.push.core.e.a aVar : this.f37385e) {
            if (this.f37386f) {
                aVar.c(this.f37383c);
            } else {
                aVar.b(this.f37383c);
            }
        }
        e.a().a(new c());
        e.a().b();
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2147483639;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
        super.d();
        this.f37226o = true;
        this.L = true;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d_() {
        super.d_();
        Cursor cursor = this.f37384d;
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
