package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import com.squareup.picasso.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import l60.g1;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f41780t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f41781u = new a();

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f41782v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f41783w = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f41784a = f41782v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final Picasso f41785b;

    /* renamed from: c, reason: collision with root package name */
    public final j f41786c;

    /* renamed from: d, reason: collision with root package name */
    public final com.squareup.picasso.e f41787d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f41788e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41789f;

    /* renamed from: g, reason: collision with root package name */
    public final y f41790g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41791h;

    /* renamed from: i, reason: collision with root package name */
    public int f41792i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f41793j;

    /* renamed from: k, reason: collision with root package name */
    public com.squareup.picasso.a f41794k;

    /* renamed from: l, reason: collision with root package name */
    public List<com.squareup.picasso.a> f41795l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f41796m;

    /* renamed from: n, reason: collision with root package name */
    public Future<?> f41797n;

    /* renamed from: o, reason: collision with root package name */
    public Picasso.LoadedFrom f41798o;

    /* renamed from: p, reason: collision with root package name */
    public Exception f41799p;

    /* renamed from: q, reason: collision with root package name */
    public int f41800q;

    /* renamed from: r, reason: collision with root package name */
    public int f41801r;

    /* renamed from: s, reason: collision with root package name */
    public Picasso.Priority f41802s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder(h0.f41859a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a0 {
        @Override // com.squareup.picasso.a0
        public boolean canHandleRequest(y yVar) {
            return true;
        }

        @Override // com.squareup.picasso.a0
        public a0.a load(y yVar, int i11) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + yVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    public static class RunnableC0500c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f41803a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f41804b;

        public RunnableC0500c(g0 g0Var, RuntimeException runtimeException) {
            this.f41803a = g0Var;
            this.f41804b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f41803a.key() + " crashed with exception.", this.f41804b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f41805a;

        public d(StringBuilder sb2) {
            this.f41805a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f41805a.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f41806a;

        public e(g0 g0Var) {
            this.f41806a = g0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f41806a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f41807a;

        public f(g0 g0Var) {
            this.f41807a = g0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f41807a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(Picasso picasso, j jVar, com.squareup.picasso.e eVar, c0 c0Var, com.squareup.picasso.a aVar, a0 a0Var) {
        this.f41785b = picasso;
        this.f41786c = jVar;
        this.f41787d = eVar;
        this.f41788e = c0Var;
        this.f41794k = aVar;
        this.f41789f = aVar.d();
        this.f41790g = aVar.i();
        this.f41802s = aVar.h();
        this.f41791h = aVar.e();
        this.f41792i = aVar.f();
        this.f41793j = a0Var;
        this.f41801r = a0Var.getRetryCount();
    }

    public static Bitmap a(List<g0> list, Bitmap bitmap) {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            g0 g0Var = list.get(i11);
            try {
                Bitmap transform = g0Var.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(g0Var.key());
                    sb2.append(" returned null after ");
                    sb2.append(i11);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<g0> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().key());
                        sb2.append('\n');
                    }
                    Picasso.f41724q.post(new d(sb2));
                    return null;
                }
                if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f41724q.post(new e(g0Var));
                    return null;
                }
                if (transform != bitmap && !bitmap.isRecycled()) {
                    Picasso.f41724q.post(new f(g0Var));
                    return null;
                }
                i11++;
                bitmap = transform;
            } catch (RuntimeException e11) {
                Picasso.f41724q.post(new RunnableC0500c(g0Var, e11));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap e(g1 g1Var, y yVar) throws IOException {
        l60.m e11 = r0.e(g1Var);
        boolean s11 = h0.s(e11);
        boolean z11 = yVar.f41992r;
        BitmapFactory.Options createBitmapOptions = a0.createBitmapOptions(yVar);
        boolean requiresInSampleSize = a0.requiresInSampleSize(createBitmapOptions);
        if (s11) {
            byte[] w22 = e11.w2();
            if (requiresInSampleSize) {
                BitmapFactory.decodeByteArray(w22, 0, w22.length, createBitmapOptions);
                a0.calculateInSampleSize(yVar.f41982h, yVar.f41983i, createBitmapOptions, yVar);
            }
            return BitmapFactory.decodeByteArray(w22, 0, w22.length, createBitmapOptions);
        }
        InputStream R8 = e11.R8();
        if (requiresInSampleSize) {
            q qVar = new q(R8);
            qVar.a(false);
            long e12 = qVar.e(1024);
            BitmapFactory.decodeStream(qVar, null, createBitmapOptions);
            a0.calculateInSampleSize(yVar.f41982h, yVar.f41983i, createBitmapOptions, yVar);
            qVar.c(e12);
            qVar.a(true);
            R8 = qVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(R8, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static c g(Picasso picasso, j jVar, com.squareup.picasso.e eVar, c0 c0Var, com.squareup.picasso.a aVar) {
        y i11 = aVar.i();
        List<a0> l11 = picasso.l();
        int size = l11.size();
        for (int i12 = 0; i12 < size; i12++) {
            a0 a0Var = l11.get(i12);
            if (a0Var.canHandleRequest(i11)) {
                return new c(picasso, jVar, eVar, c0Var, aVar, a0Var);
            }
        }
        return new c(picasso, jVar, eVar, c0Var, aVar, f41783w);
    }

    public static int l(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int m(int i11) {
        return (i11 == 2 || i11 == 7 || i11 == 4 || i11 == 5) ? -1 : 1;
    }

    public static boolean v(boolean z11, int i11, int i12, int i13, int i14) {
        if (!z11) {
            return true;
        }
        if (i13 == 0 || i11 <= i13) {
            return i14 != 0 && i12 > i14;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap y(com.squareup.picasso.y r27, android.graphics.Bitmap r28, int r29) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.y(com.squareup.picasso.y, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void z(y yVar) {
        String b11 = yVar.b();
        StringBuilder sb2 = f41781u.get();
        sb2.ensureCapacity(b11.length() + 8);
        sb2.replace(8, sb2.length(), b11);
        Thread.currentThread().setName(sb2.toString());
    }

    public void b(com.squareup.picasso.a aVar) {
        boolean z11 = this.f41785b.f41739n;
        y yVar = aVar.f41758b;
        if (this.f41794k == null) {
            this.f41794k = aVar;
            if (z11) {
                List<com.squareup.picasso.a> list = this.f41795l;
                if (list == null || list.isEmpty()) {
                    h0.u(h0.f41870l, h0.f41881w, yVar.e(), "to empty hunter");
                    return;
                } else {
                    h0.u(h0.f41870l, h0.f41881w, yVar.e(), h0.l(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f41795l == null) {
            this.f41795l = new ArrayList(3);
        }
        this.f41795l.add(aVar);
        if (z11) {
            h0.u(h0.f41870l, h0.f41881w, yVar.e(), h0.l(this, "to "));
        }
        Picasso.Priority h11 = aVar.h();
        if (h11.ordinal() > this.f41802s.ordinal()) {
            this.f41802s = h11;
        }
    }

    public boolean c() {
        List<com.squareup.picasso.a> list;
        Future<?> future;
        return this.f41794k == null && ((list = this.f41795l) == null || list.isEmpty()) && (future = this.f41797n) != null && future.cancel(false);
    }

    public final Picasso.Priority d() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<com.squareup.picasso.a> list = this.f41795l;
        boolean z11 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.f41794k;
        if (aVar == null && !z11) {
            return priority;
        }
        if (aVar != null) {
            priority = aVar.h();
        }
        if (z11) {
            int size = this.f41795l.size();
            for (int i11 = 0; i11 < size; i11++) {
                Picasso.Priority h11 = this.f41795l.get(i11).h();
                if (h11.ordinal() > priority.ordinal()) {
                    priority = h11;
                }
            }
        }
        return priority;
    }

    public void f(com.squareup.picasso.a aVar) {
        boolean remove;
        if (this.f41794k == aVar) {
            this.f41794k = null;
            remove = true;
        } else {
            List<com.squareup.picasso.a> list = this.f41795l;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.f41802s) {
            this.f41802s = d();
        }
        if (this.f41785b.f41739n) {
            h0.u(h0.f41870l, h0.f41882x, aVar.f41758b.e(), h0.l(this, "from "));
        }
    }

    public com.squareup.picasso.a h() {
        return this.f41794k;
    }

    public List<com.squareup.picasso.a> i() {
        return this.f41795l;
    }

    public y j() {
        return this.f41790g;
    }

    public Exception k() {
        return this.f41799p;
    }

    public String n() {
        return this.f41789f;
    }

    public Picasso.LoadedFrom o() {
        return this.f41798o;
    }

    public int p() {
        return this.f41791h;
    }

    public Picasso q() {
        return this.f41785b;
    }

    public Picasso.Priority r() {
        return this.f41802s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f41790g);
                        if (this.f41785b.f41739n) {
                            h0.t(h0.f41870l, h0.f41878t, h0.k(this));
                        }
                        Bitmap t11 = t();
                        this.f41796m = t11;
                        if (t11 == null) {
                            this.f41786c.e(this);
                        } else {
                            this.f41786c.d(this);
                        }
                        Thread.currentThread().setName(h0.f41860b);
                    } catch (IOException e11) {
                        this.f41799p = e11;
                        this.f41786c.i(this);
                        Thread.currentThread().setName(h0.f41860b);
                    }
                } catch (s.b e12) {
                    if (!NetworkPolicy.isOfflineOnly(e12.f41949b) || e12.f41948a != 504) {
                        this.f41799p = e12;
                    }
                    this.f41786c.e(this);
                    Thread.currentThread().setName(h0.f41860b);
                }
            } catch (Exception e13) {
                this.f41799p = e13;
                this.f41786c.e(this);
                Thread.currentThread().setName(h0.f41860b);
            } catch (OutOfMemoryError e14) {
                StringWriter stringWriter = new StringWriter();
                this.f41788e.a().b(new PrintWriter(stringWriter));
                this.f41799p = new RuntimeException(stringWriter.toString(), e14);
                this.f41786c.e(this);
                Thread.currentThread().setName(h0.f41860b);
            }
        } catch (Throwable th2) {
            Thread.currentThread().setName(h0.f41860b);
            throw th2;
        }
    }

    public Bitmap s() {
        return this.f41796m;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap t() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.t():android.graphics.Bitmap");
    }

    public boolean u() {
        Future<?> future = this.f41797n;
        return future != null && future.isCancelled();
    }

    public boolean w(boolean z11, NetworkInfo networkInfo) {
        int i11 = this.f41801r;
        if (i11 <= 0) {
            return false;
        }
        this.f41801r = i11 - 1;
        return this.f41793j.shouldRetry(z11, networkInfo);
    }

    public boolean x() {
        return this.f41793j.supportsReplay();
    }
}
