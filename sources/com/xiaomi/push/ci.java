package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class ci {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ci f45335a;

    /* renamed from: a, reason: collision with other field name */
    private Context f195a;

    /* renamed from: a, reason: collision with other field name */
    private ch f196a;

    /* renamed from: a, reason: collision with other field name */
    private final HashMap<String, cg> f198a = new HashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private ThreadPoolExecutor f199a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<a> f197a = new ArrayList<>();

    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with other field name */
        private a f201a;

        /* renamed from: a, reason: collision with other field name */
        private String f202a;

        /* renamed from: a, reason: collision with other field name */
        private WeakReference<Context> f203a;

        /* renamed from: b, reason: collision with root package name */
        protected String f45337b;

        /* renamed from: a, reason: collision with other field name */
        protected cg f200a = null;

        /* renamed from: a, reason: collision with other field name */
        private Random f204a = new Random();

        /* renamed from: a, reason: collision with root package name */
        private int f45336a = 0;

        public a(String str) {
            this.f202a = str;
        }

        public SQLiteDatabase a() {
            return this.f200a.getWritableDatabase();
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f203a;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f200a == null || TextUtils.isEmpty(this.f202a)) {
                return;
            }
            File file = new File(this.f202a);
            v.a(context, new File(file.getParentFile(), bn.b(file.getAbsolutePath())), new ck(this, context));
        }

        /* renamed from: a, reason: collision with other method in class */
        public Object mo5790a() {
            return null;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m5791a() {
            return this.f202a;
        }

        public void a(Context context) {
            a aVar = this.f201a;
            if (aVar != null) {
                aVar.a(context, mo5790a());
            }
            b(context);
        }

        public void a(Context context, Object obj) {
            ci.a(context).a(this);
        }

        public void a(cg cgVar, Context context) {
            this.f200a = cgVar;
            this.f45337b = cgVar.a();
            this.f203a = new WeakReference<>(context);
        }

        public void a(a aVar) {
            this.f201a = aVar;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5792a() {
            return this.f200a == null || TextUtils.isEmpty(this.f45337b) || this.f203a == null;
        }

        public void b(Context context) {
        }
    }

    public static abstract class b<T> extends a {

        /* renamed from: a, reason: collision with root package name */
        private int f45338a;

        /* renamed from: a, reason: collision with other field name */
        private String f205a;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f206a;

        /* renamed from: a, reason: collision with other field name */
        private String[] f207a;

        /* renamed from: b, reason: collision with root package name */
        private List<T> f45339b;

        /* renamed from: c, reason: collision with root package name */
        private String f45340c;

        /* renamed from: d, reason: collision with root package name */
        private String f45341d;

        /* renamed from: e, reason: collision with root package name */
        private String f45342e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i11) {
            super(str);
            this.f45339b = new ArrayList();
            this.f206a = list;
            this.f205a = str2;
            this.f207a = strArr;
            this.f45340c = str3;
            this.f45341d = str4;
            this.f45342e = str5;
            this.f45338a = i11;
        }

        @Override // com.xiaomi.push.ci.a
        public SQLiteDatabase a() {
            return ((a) this).f200a.getReadableDatabase();
        }

        public abstract T a(Context context, Cursor cursor);

        public abstract void a(Context context, List<T> list);

        @Override // com.xiaomi.push.ci.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f45339b.clear();
            List<String> list = this.f206a;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f206a.size()];
                this.f206a.toArray(strArr2);
                strArr = strArr2;
            }
            int i11 = this.f45338a;
            Cursor query = sQLiteDatabase.query(super.f45337b, strArr, this.f205a, this.f207a, this.f45340c, this.f45341d, this.f45342e, i11 > 0 ? String.valueOf(i11) : null);
            if (query != null && query.moveToFirst()) {
                do {
                    T a11 = a(context, query);
                    if (a11 != null) {
                        this.f45339b.add(a11);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.f45339b);
        }
    }

    public static class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<a> f45343a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            ArrayList<a> arrayList2 = new ArrayList<>();
            this.f45343a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.ci.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it = this.f45343a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }

        @Override // com.xiaomi.push.ci.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it = this.f45343a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }
    }

    public static class d extends a {

        /* renamed from: a, reason: collision with root package name */
        private String f45344a;

        /* renamed from: a, reason: collision with other field name */
        protected String[] f208a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f45344a = str2;
            this.f208a = strArr;
        }

        @Override // com.xiaomi.push.ci.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f45337b, this.f45344a, this.f208a);
        }
    }

    public static class e extends a {

        /* renamed from: a, reason: collision with root package name */
        private ContentValues f45345a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f45345a = contentValues;
        }

        @Override // com.xiaomi.push.ci.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f45337b, null, this.f45345a);
        }
    }

    private ci(Context context) {
        this.f195a = context;
    }

    private cg a(String str) {
        cg cgVar = this.f198a.get(str);
        if (cgVar != null) {
            return cgVar;
        }
        synchronized (this.f198a) {
            if (cgVar == null) {
                try {
                    cgVar = this.f196a.a(this.f195a, str);
                    this.f198a.put(str, cgVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return cgVar;
    }

    public void b(a aVar) {
        cg cgVar;
        if (aVar == null) {
            return;
        }
        if (this.f196a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m5791a = aVar.m5791a();
        synchronized (this.f198a) {
            try {
                cgVar = this.f198a.get(m5791a);
                if (cgVar == null) {
                    cgVar = this.f196a.a(this.f195a, m5791a);
                    this.f198a.put(m5791a, cgVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f199a.isShutdown()) {
            return;
        }
        aVar.a(cgVar, this.f195a);
        a((Runnable) aVar);
    }

    public static ci a(Context context) {
        if (f45335a == null) {
            synchronized (ci.class) {
                try {
                    if (f45335a == null) {
                        f45335a = new ci(context);
                    }
                } finally {
                }
            }
        }
        return f45335a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5789a(String str) {
        return a(str).a();
    }

    private void a() {
        aj.a(this.f195a).b(new cj(this), com.xiaomi.push.service.ba.a(this.f195a).a(hm.StatDataProcessFrequency.a(), 5));
    }

    public void a(a aVar) {
        cg cgVar;
        if (aVar == null) {
            return;
        }
        if (this.f196a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m5791a = aVar.m5791a();
        synchronized (this.f198a) {
            try {
                cgVar = this.f198a.get(m5791a);
                if (cgVar == null) {
                    cgVar = this.f196a.a(this.f195a, m5791a);
                    this.f198a.put(m5791a, cgVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f199a.isShutdown()) {
            return;
        }
        aVar.a(cgVar, this.f195a);
        synchronized (this.f197a) {
            this.f197a.add(aVar);
            a();
        }
    }

    public void a(Runnable runnable) {
        if (this.f199a.isShutdown()) {
            return;
        }
        this.f199a.execute(runnable);
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f196a == null) {
            throw new IllegalStateException("should exec setDbHelperFactory method first!");
        }
        HashMap hashMap = new HashMap();
        if (this.f199a.isShutdown()) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m5792a()) {
                next.a(a(next.m5791a()), this.f195a);
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get(next.m5791a());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(next.m5791a(), arrayList2);
            }
            arrayList2.add(next);
        }
        for (String str : hashMap.keySet()) {
            ArrayList arrayList3 = (ArrayList) hashMap.get(str);
            if (arrayList3 != null && arrayList3.size() > 0) {
                c cVar = new c(str, arrayList3);
                cVar.a(((a) arrayList3.get(0)).f200a, this.f195a);
                this.f199a.execute(cVar);
            }
        }
    }
}
