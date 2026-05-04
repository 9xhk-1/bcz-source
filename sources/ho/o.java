package ho;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@j
@go.c
/* loaded from: classes7.dex */
public class o implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f59679e = "com.google.common.base.internal.Finalizer";

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue<Object> f59681a;

    /* renamed from: b, reason: collision with root package name */
    public final PhantomReference<Object> f59682b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59683c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f59678d = Logger.getLogger(o.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final Method f59680f = e(f(new d(), new a(), new b()));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f59684a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        @Override // ho.o.c
        @CheckForNull
        public Class<?> a() {
            try {
                return c(b()).loadClass(o.f59679e);
            } catch (Exception e11) {
                o.f59678d.log(Level.WARNING, f59684a, (Throwable) e11);
                return null;
            }
        }

        public URL b() throws IOException {
            String str = o.f59679e.replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String url = resource.toString();
            if (url.endsWith(str)) {
                return new URL(resource, url.substring(0, url.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + url);
        }

        public URLClassLoader c(URL base) {
            return new URLClassLoader(new URL[]{base}, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements c {
        @Override // ho.o.c
        public Class<?> a() {
            try {
                return Class.forName("io.a");
            } catch (ClassNotFoundException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        @CheckForNull
        Class<?> a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @go.e
        public static boolean f59685a;

        @Override // ho.o.c
        @CheckForNull
        public Class<?> a() {
            if (f59685a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(o.f59679e);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                o.f59678d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public o() {
        boolean z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f59681a = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f59682b = phantomReference;
        try {
            f59680f.invoke(null, n.class, referenceQueue, phantomReference);
            z11 = true;
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (Throwable th2) {
            f59678d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z11 = false;
        }
        this.f59683c = z11;
    }

    public static Method e(Class<?> finalizer) {
        try {
            return finalizer.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e11) {
            throw new AssertionError(e11);
        }
    }

    public static Class<?> f(c... loaders) {
        for (c cVar : loaders) {
            Class<?> a11 = cVar.a();
            if (a11 != null) {
                return a11;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c() {
        if (this.f59683c) {
            return;
        }
        while (true) {
            Reference<? extends Object> poll = this.f59681a.poll();
            if (poll == 0) {
                return;
            }
            poll.clear();
            try {
                ((n) poll).a();
            } catch (Throwable th2) {
                f59678d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f59682b.enqueue();
        c();
    }
}
