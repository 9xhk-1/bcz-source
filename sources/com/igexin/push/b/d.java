package com.igexin.push.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.c.a.b.e;
import com.igexin.c.a.d.f;
import com.igexin.push.core.d;

/* loaded from: classes7.dex */
public abstract class d extends f {

    /* renamed from: l, reason: collision with root package name */
    public static final int f37407l = -2147483640;

    /* renamed from: a, reason: collision with root package name */
    private final String f37408a;

    /* renamed from: d, reason: collision with root package name */
    protected SQLiteDatabase f37409d;

    /* renamed from: e, reason: collision with root package name */
    protected Cursor f37410e;

    /* renamed from: f, reason: collision with root package name */
    Context f37411f;

    /* renamed from: g, reason: collision with root package name */
    protected String[] f37412g;

    /* renamed from: h, reason: collision with root package name */
    protected ContentValues f37413h;

    /* renamed from: i, reason: collision with root package name */
    protected ContentValues[] f37414i;

    /* renamed from: j, reason: collision with root package name */
    protected Object f37415j;

    /* renamed from: k, reason: collision with root package name */
    public c f37416k;

    public d() {
        super(1);
        this.f37408a = getClass().getName();
    }

    private void a(c cVar) {
        this.f37416k = cVar;
    }

    public abstract void a_() throws Exception;

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        this.f37409d = d.a.f37956a.f37950i.getWritableDatabase();
        a_();
        if (this.f37416k != null) {
            e.a().a(this.f37416k);
            e.a().b();
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return f37407l;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
        this.f37226o = true;
        this.L = true;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d_() {
        super.d_();
        Cursor cursor = this.f37410e;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        try {
            this.f37410e.close();
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    public d(ContentValues contentValues) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37413h = contentValues;
    }

    private d(Context context) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
    }

    private d(Context context, ContentValues contentValues) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
        this.f37413h = contentValues;
    }

    private d(Context context, c cVar) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
        this.f37416k = cVar;
    }

    private d(Context context, Object obj) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
        this.f37415j = obj;
    }

    private d(Context context, ContentValues[] contentValuesArr) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
        this.f37414i = contentValuesArr;
    }

    private d(Context context, String[] strArr) {
        super(1);
        this.f37408a = getClass().getName();
        this.f37411f = context;
        this.f37412g = strArr;
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
