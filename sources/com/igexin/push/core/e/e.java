package com.igexin.push.core.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.push.core.b.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38069b = "RALDataManager";

    /* renamed from: c, reason: collision with root package name */
    private static final int f38070c = 318;

    /* renamed from: d, reason: collision with root package name */
    private static final int f38071d = 300;

    /* renamed from: e, reason: collision with root package name */
    private static volatile e f38072e;

    /* renamed from: a, reason: collision with root package name */
    public final List<n> f38073a = new CopyOnWriteArrayList();

    /* renamed from: com.igexin.push.core.e.e$3, reason: invalid class name */
    public class AnonymousClass3 extends com.igexin.push.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ContentValues contentValues, long j11) {
            super(contentValues);
            this.f38078a = j11;
        }

        @Override // com.igexin.push.b.d
        public final void a_() throws Exception {
            this.f37409d.update(com.igexin.push.core.b.f37705ab, this.f37413h, "id=?", new String[]{String.valueOf(this.f38078a)});
        }
    }

    private e() {
    }

    private int a(byte b11) {
        Iterator<n> it = this.f38073a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().f37889c == b11) {
                i11++;
            }
        }
        return i11;
    }

    private List<n> b() {
        return this.f38073a;
    }

    public static ContentValues a(n nVar) {
        if (nVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(nVar.f37887a));
        contentValues.put("data", com.igexin.c.b.a.b(nVar.f37888b.getBytes()));
        contentValues.put("type", Byte.valueOf(nVar.f37889c));
        contentValues.put("time", Long.valueOf(nVar.f37890d));
        contentValues.put("send_times", Integer.valueOf(nVar.f37891e));
        return contentValues;
    }

    private void b(byte b11) {
        n nVar;
        try {
            Iterator<n> it = this.f38073a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                } else {
                    nVar = it.next();
                    if (nVar.f37889c == b11) {
                        break;
                    }
                }
            }
            if (nVar != null) {
                a(nVar.f37887a, true);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final n a(long j11) {
        for (n nVar : this.f38073a) {
            if (nVar.f37887a == j11) {
                return nVar;
            }
        }
        return null;
    }

    @Override // com.igexin.push.core.e.a
    public final void b(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query(com.igexin.push.core.b.f37705ab, new String[]{"id", "data", "type", "time", "send_times"}, null, null, null, null, null);
                long currentTimeMillis = System.currentTimeMillis();
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        long j11 = cursor.getLong(0);
                        byte b11 = (byte) cursor.getInt(2);
                        long j12 = cursor.getLong(3);
                        int i11 = cursor.getInt(4);
                        if ((j12 == 0 || currentTimeMillis - j12 <= 259200000) && i11 < com.igexin.push.config.d.N - 1) {
                            List<n> list = this.f38073a;
                            n nVar = new n(j11, new String(com.igexin.c.b.a.c(cursor.getBlob(1))), b11, j12);
                            nVar.f37891e = i11;
                            list.add(nVar);
                        } else {
                            a(j11, true);
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static e a() {
        if (f38072e == null) {
            synchronized (e.class) {
                try {
                    if (f38072e == null) {
                        f38072e = new e();
                    }
                } finally {
                }
            }
        }
        return f38072e;
    }

    public final void b(final n nVar) {
        byte b11;
        if (this.f38073a.size() < 318 || (b11 = nVar.f37889c) == 2 || b11 == 7) {
            byte b12 = nVar.f37889c;
            if (b12 != 2) {
                if (b12 != 3) {
                    if (b12 != 5) {
                        if (b12 != 6) {
                            if (b12 != 7) {
                                if (b12 == 8 && a((byte) 8) >= 3) {
                                    return;
                                }
                            }
                        } else if (a((byte) 6) >= 10) {
                            return;
                        }
                    } else if (a((byte) 5) >= 3) {
                        return;
                    }
                } else if (a((byte) 3) >= 300) {
                    return;
                }
                this.f38073a.add(nVar);
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d(a(nVar)) { // from class: com.igexin.push.core.e.e.1
                    @Override // com.igexin.push.b.d
                    public final void a_() throws Exception {
                        this.f37409d.replace(com.igexin.push.core.b.f37705ab, null, this.f37413h);
                    }
                }, false, true);
            }
            b(b12);
            this.f38073a.add(nVar);
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.b.d(a(nVar)) { // from class: com.igexin.push.core.e.e.1
                @Override // com.igexin.push.b.d
                public final void a_() throws Exception {
                    this.f37409d.replace(com.igexin.push.core.b.f37705ab, null, this.f37413h);
                }
            }, false, true);
        }
    }

    public final void a(final long j11, boolean z11) {
        n a11 = a(j11);
        if (a11 != null) {
            this.f38073a.remove(a11);
        }
        com.igexin.c.a.b.e.a().a(new com.igexin.push.b.d(a(a11)) { // from class: com.igexin.push.core.e.e.2
            @Override // com.igexin.push.b.d
            public final void a_() throws Exception {
                this.f37409d.delete(com.igexin.push.core.b.f37705ab, "id=?", new String[]{String.valueOf(j11)});
            }
        }, z11, !z11);
    }

    @Override // com.igexin.push.core.e.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    private boolean a(long j11, long j12) {
        n a11 = a(j11);
        if (a11 == null) {
            return false;
        }
        a11.f37890d = j12;
        a11.f37891e++;
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass3(a(a11), j11), true, true);
        return true;
    }

    @Override // com.igexin.push.core.e.a
    public final void c(SQLiteDatabase sQLiteDatabase) {
    }
}
