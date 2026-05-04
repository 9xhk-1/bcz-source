package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.a;
import com.squareup.picasso.x;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Picasso {

    /* renamed from: p, reason: collision with root package name */
    public static final String f41723p = "Picasso";

    /* renamed from: q, reason: collision with root package name */
    public static final Handler f41724q = new a(Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile Picasso f41725r = null;

    /* renamed from: a, reason: collision with root package name */
    public final d f41726a;

    /* renamed from: b, reason: collision with root package name */
    public final e f41727b;

    /* renamed from: c, reason: collision with root package name */
    public final c f41728c;

    /* renamed from: d, reason: collision with root package name */
    public final List<a0> f41729d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f41730e;

    /* renamed from: f, reason: collision with root package name */
    public final j f41731f;

    /* renamed from: g, reason: collision with root package name */
    public final com.squareup.picasso.e f41732g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f41733h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.a> f41734i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<ImageView, i> f41735j;

    /* renamed from: k, reason: collision with root package name */
    public final ReferenceQueue<Object> f41736k;

    /* renamed from: l, reason: collision with root package name */
    public final Bitmap.Config f41737l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41738m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f41739n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41740o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        LoadedFrom(int i11) {
            this.debugColor = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().f41739n) {
                    h0.u(h0.f41868j, h0.f41875q, aVar.f41758b.e(), "target got garbage collected");
                }
                aVar.f41757a.b(aVar.k());
                return;
            }
            int i12 = 0;
            if (i11 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i12 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i12);
                    cVar.f41785b.g(cVar);
                    i12++;
                }
                return;
            }
            if (i11 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i12 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i12);
                aVar2.f41757a.x(aVar2);
                i12++;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f41741a;

        /* renamed from: b, reason: collision with root package name */
        public k f41742b;

        /* renamed from: c, reason: collision with root package name */
        public ExecutorService f41743c;

        /* renamed from: d, reason: collision with root package name */
        public com.squareup.picasso.e f41744d;

        /* renamed from: e, reason: collision with root package name */
        public d f41745e;

        /* renamed from: f, reason: collision with root package name */
        public e f41746f;

        /* renamed from: g, reason: collision with root package name */
        public List<a0> f41747g;

        /* renamed from: h, reason: collision with root package name */
        public Bitmap.Config f41748h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f41749i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f41750j;

        public b(@NonNull Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f41741a = context.getApplicationContext();
        }

        public b a(@NonNull a0 a0Var) {
            if (a0Var == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.f41747g == null) {
                this.f41747g = new ArrayList();
            }
            if (this.f41747g.contains(a0Var)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.f41747g.add(a0Var);
            return this;
        }

        public Picasso b() {
            Context context = this.f41741a;
            if (this.f41742b == null) {
                this.f41742b = new t(context);
            }
            if (this.f41744d == null) {
                this.f41744d = new p(context);
            }
            if (this.f41743c == null) {
                this.f41743c = new v();
            }
            if (this.f41746f == null) {
                this.f41746f = e.f41755a;
            }
            c0 c0Var = new c0(this.f41744d);
            return new Picasso(context, new j(context, this.f41743c, Picasso.f41724q, this.f41742b, this.f41744d, c0Var), this.f41744d, this.f41745e, this.f41746f, this.f41747g, c0Var, this.f41748h, this.f41749i, this.f41750j);
        }

        public b c(@NonNull Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.f41748h = config;
            return this;
        }

        public b d(@NonNull k kVar) {
            if (kVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f41742b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f41742b = kVar;
            return this;
        }

        public b e(@NonNull ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.f41743c != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.f41743c = executorService;
            return this;
        }

        public b f(boolean z11) {
            this.f41749i = z11;
            return this;
        }

        public b g(@NonNull d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f41745e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f41745e = dVar;
            return this;
        }

        public b h(boolean z11) {
            this.f41750j = z11;
            return this;
        }

        public b i(@NonNull com.squareup.picasso.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.f41744d != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.f41744d = eVar;
            return this;
        }

        public b j(@NonNull e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.f41746f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.f41746f = eVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final ReferenceQueue<Object> f41751a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f41752b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f41753a;

            public a(Exception exc) {
                this.f41753a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f41753a);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f41751a = referenceQueue;
            this.f41752b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void a() {
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0499a c0499a = (a.C0499a) this.f41751a.remove(1000L);
                    Message obtainMessage = this.f41752b.obtainMessage();
                    if (c0499a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0499a.f41769a;
                        this.f41752b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e11) {
                    this.f41752b.post(new a(e11));
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public Picasso(Context context, j jVar, com.squareup.picasso.e eVar, d dVar, e eVar2, List<a0> list, c0 c0Var, Bitmap.Config config, boolean z11, boolean z12) {
        this.f41730e = context;
        this.f41731f = jVar;
        this.f41732g = eVar;
        this.f41726a = dVar;
        this.f41727b = eVar2;
        this.f41737l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new b0(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new g(context));
        arrayList.add(new r(context));
        arrayList.add(new h(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new m(context));
        arrayList.add(new s(jVar.f41901d, c0Var));
        this.f41729d = Collections.unmodifiableList(arrayList);
        this.f41733h = c0Var;
        this.f41734i = new WeakHashMap();
        this.f41735j = new WeakHashMap();
        this.f41738m = z11;
        this.f41739n = z12;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f41736k = referenceQueue;
        c cVar = new c(referenceQueue, f41724q);
        this.f41728c = cVar;
        cVar.start();
    }

    public static void B(@NonNull Picasso picasso) {
        if (picasso == null) {
            throw new IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (Picasso.class) {
            try {
                if (f41725r != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                f41725r = picasso;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Picasso k() {
        if (f41725r == null) {
            synchronized (Picasso.class) {
                try {
                    if (f41725r == null) {
                        Context context = PicassoProvider.f41756a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f41725r = new b(context).b();
                    }
                } finally {
                }
            }
        }
        return f41725r;
    }

    public void A(boolean z11) {
        this.f41739n = z11;
    }

    public void C() {
        if (this == f41725r) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.f41740o) {
            return;
        }
        this.f41732g.clear();
        this.f41728c.a();
        this.f41733h.n();
        this.f41731f.z();
        Iterator<i> it = this.f41735j.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f41735j.clear();
        this.f41740o = true;
    }

    public void D(com.squareup.picasso.a aVar) {
        this.f41731f.j(aVar);
    }

    public y E(y yVar) {
        y a11 = this.f41727b.a(yVar);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Request transformer " + this.f41727b.getClass().getCanonicalName() + " returned null for " + yVar);
    }

    public boolean a() {
        return this.f41738m;
    }

    public void b(Object obj) {
        h0.c();
        com.squareup.picasso.a remove = this.f41734i.remove(obj);
        if (remove != null) {
            remove.a();
            this.f41731f.c(remove);
        }
        if (obj instanceof ImageView) {
            i remove2 = this.f41735j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    public void c(@NonNull ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        b(imageView);
    }

    public void d(@NonNull RemoteViews remoteViews, @IdRes int i11) {
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews cannot be null.");
        }
        b(new x.c(remoteViews, i11));
    }

    public void e(@NonNull e0 e0Var) {
        if (e0Var == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        b(e0Var);
    }

    public void f(@NonNull Object obj) {
        h0.c();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancel requests with null tag.");
        }
        ArrayList arrayList = new ArrayList(this.f41734i.values());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) arrayList.get(i11);
            if (obj.equals(aVar.j())) {
                b(aVar.k());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f41735j.values());
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            i iVar = (i) arrayList2.get(i12);
            if (obj.equals(iVar.b())) {
                iVar.a();
            }
        }
    }

    public void g(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h11 = cVar.h();
        List<com.squareup.picasso.a> i11 = cVar.i();
        boolean z11 = (i11 == null || i11.isEmpty()) ? false : true;
        if (h11 != null || z11) {
            Uri uri = cVar.j().f41978d;
            Exception k11 = cVar.k();
            Bitmap s11 = cVar.s();
            LoadedFrom o11 = cVar.o();
            if (h11 != null) {
                i(s11, o11, h11, k11);
            }
            if (z11) {
                int size = i11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    i(s11, o11, i11.get(i12), k11);
                }
            }
            d dVar = this.f41726a;
            if (dVar == null || k11 == null) {
                return;
            }
            dVar.onImageLoadFailed(this, uri, k11);
        }
    }

    public void h(ImageView imageView, i iVar) {
        if (this.f41735j.containsKey(imageView)) {
            b(imageView);
        }
        this.f41735j.put(imageView, iVar);
    }

    public final void i(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f41734i.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.f41739n) {
                h0.u(h0.f41868j, h0.B, aVar.f41758b.e(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, loadedFrom);
        if (this.f41739n) {
            h0.u(h0.f41868j, h0.A, aVar.f41758b.e(), "from " + loadedFrom);
        }
    }

    public void j(com.squareup.picasso.a aVar) {
        Object k11 = aVar.k();
        if (k11 != null && this.f41734i.get(k11) != aVar) {
            b(k11);
            this.f41734i.put(k11, aVar);
        }
        D(aVar);
    }

    public List<a0> l() {
        return this.f41729d;
    }

    public d0 m() {
        return this.f41733h.a();
    }

    public void n(@Nullable Uri uri) {
        if (uri != null) {
            this.f41732g.c(uri.toString());
        }
    }

    public void o(@NonNull File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        n(Uri.fromFile(file));
    }

    public void p(@Nullable String str) {
        if (str != null) {
            n(Uri.parse(str));
        }
    }

    public boolean q() {
        return this.f41739n;
    }

    public z r(@DrawableRes int i11) {
        if (i11 != 0) {
            return new z(this, null, i11);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public z s(@Nullable Uri uri) {
        return new z(this, uri, 0);
    }

    public z t(@NonNull File file) {
        return file == null ? new z(this, null, 0) : s(Uri.fromFile(file));
    }

    public z u(@Nullable String str) {
        if (str == null) {
            return new z(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return s(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void v(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f41731f.g(obj);
    }

    public Bitmap w(String str) {
        Bitmap bitmap = this.f41732g.get(str);
        if (bitmap != null) {
            this.f41733h.d();
            return bitmap;
        }
        this.f41733h.e();
        return bitmap;
    }

    public void x(com.squareup.picasso.a aVar) {
        Bitmap w11 = MemoryPolicy.shouldReadFromMemoryCache(aVar.f41761e) ? w(aVar.d()) : null;
        if (w11 == null) {
            j(aVar);
            if (this.f41739n) {
                h0.t(h0.f41868j, h0.D, aVar.f41758b.e());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        i(w11, loadedFrom, aVar, null);
        if (this.f41739n) {
            h0.u(h0.f41868j, h0.A, aVar.f41758b.e(), "from " + loadedFrom);
        }
    }

    public void y(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("tag == null");
        }
        this.f41731f.h(obj);
    }

    public void z(boolean z11) {
        this.f41738m = z11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41755a = new a();

        y a(y yVar);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements e {
            @Override // com.squareup.picasso.Picasso.e
            public y a(y yVar) {
                return yVar;
            }
        }
    }
}
