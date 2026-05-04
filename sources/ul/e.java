package ul;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ul.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    public static final String f92290g = "lib";

    /* renamed from: a, reason: collision with root package name */
    public final Set<String> f92291a;

    /* renamed from: b, reason: collision with root package name */
    public final d.b f92292b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f92293c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92294d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92295e;

    /* renamed from: f, reason: collision with root package name */
    public d.InterfaceC1241d f92296f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92297a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f92298b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f92299c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.c f92300d;

        public a(Context context, String str, String str2, d.c cVar) {
            this.f92297a = context;
            this.f92298b = str;
            this.f92299c = str2;
            this.f92300d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.j(this.f92297a, this.f92298b, this.f92299c);
                this.f92300d.b();
            } catch (MissingLibraryException e11) {
                this.f92300d.a(e11);
            } catch (UnsatisfiedLinkError e12) {
                this.f92300d.a(e12);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f92302a;

        public b(String str) {
            this.f92302a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f92302a);
        }
    }

    public e() {
        this(new f(), new ul.a());
    }

    public void b(Context context, String str, String str2) {
        File d11 = d(context);
        File e11 = e(context, str, str2);
        File[] listFiles = d11.listFiles(new b(this.f92292b.d(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f92294d || !file.getAbsolutePath().equals(e11.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public e c() {
        this.f92294d = true;
        return this;
    }

    public File d(Context context) {
        return context.getDir(f92290g, 0);
    }

    public File e(Context context, String str, String str2) {
        String d11 = this.f92292b.d(str);
        if (g.a(str2)) {
            return new File(d(context), d11);
        }
        return new File(d(context), d11 + "." + str2);
    }

    public void f(Context context, String str) {
        h(context, str, null, null);
    }

    public void g(Context context, String str, String str2) {
        h(context, str, str2, null);
    }

    public void h(Context context, String str, String str2, d.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (g.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m("Beginning load of %s...", str);
        if (cVar == null) {
            j(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public void i(Context context, String str, d.c cVar) {
        h(context, str, null, cVar);
    }

    public final void j(Context context, String str, String str2) {
        e eVar;
        Context context2;
        vl.f fVar;
        if (this.f92291a.contains(str) && !this.f92294d) {
            m("%s already loaded previously!", str);
            return;
        }
        try {
            this.f92292b.loadLibrary(str);
            this.f92291a.add(str);
            m("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e11) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e11));
            m("%s (%s) was not loaded normally, re-linking...", str, str2);
            File e12 = e(context, str, str2);
            if (!e12.exists() || this.f92294d) {
                if (this.f92294d) {
                    m("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                eVar = this;
                context2 = context;
                this.f92293c.a(context2, this.f92292b.b(), this.f92292b.d(str), e12, eVar);
            } else {
                eVar = this;
                context2 = context;
            }
            try {
                if (eVar.f92295e) {
                    try {
                        fVar = new vl.f(e12);
                        try {
                            List<String> e13 = fVar.e();
                            fVar.close();
                            Iterator<String> it = e13.iterator();
                            while (it.hasNext()) {
                                f(context2, eVar.f92292b.a(it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            fVar.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            eVar.f92292b.c(e12.getAbsolutePath());
            eVar.f92291a.add(str);
            m("%s (%s) was re-linked!", str, str2);
        }
    }

    public e k(d.InterfaceC1241d interfaceC1241d) {
        this.f92296f = interfaceC1241d;
        return this;
    }

    public void l(String str) {
        d.InterfaceC1241d interfaceC1241d = this.f92296f;
        if (interfaceC1241d != null) {
            interfaceC1241d.log(str);
        }
    }

    public void m(String str, Object... objArr) {
        l(String.format(Locale.US, str, objArr));
    }

    public e n() {
        this.f92295e = true;
        return this;
    }

    public e(d.b bVar, d.a aVar) {
        this.f92291a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f92292b = bVar;
        this.f92293c = aVar;
    }
}
