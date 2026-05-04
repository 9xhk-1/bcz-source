package kk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import kk.f;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class v implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f66814a;

    /* renamed from: b, reason: collision with root package name */
    public final g<?> f66815b;

    /* renamed from: c, reason: collision with root package name */
    public int f66816c;

    /* renamed from: d, reason: collision with root package name */
    public int f66817d = -1;

    /* renamed from: e, reason: collision with root package name */
    public ik.b f66818e;

    /* renamed from: f, reason: collision with root package name */
    public List<pk.o<File, ?>> f66819f;

    /* renamed from: g, reason: collision with root package name */
    public int f66820g;

    /* renamed from: h, reason: collision with root package name */
    public volatile o.a<?> f66821h;

    /* renamed from: i, reason: collision with root package name */
    public File f66822i;

    /* renamed from: j, reason: collision with root package name */
    public w f66823j;

    public v(g<?> gVar, f.a aVar) {
        this.f66815b = gVar;
        this.f66814a = aVar;
    }

    private boolean d() {
        return this.f66820g < this.f66819f.size();
    }

    @Override // kk.f
    public boolean a() {
        gl.b.a("ResourceCacheGenerator.startNext");
        try {
            List<ik.b> c11 = this.f66815b.c();
            boolean z11 = false;
            if (c11.isEmpty()) {
                gl.b.f();
                return false;
            }
            List<Class<?>> m11 = this.f66815b.m();
            if (m11.isEmpty()) {
                if (File.class.equals(this.f66815b.r())) {
                    gl.b.f();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f66815b.i() + " to " + this.f66815b.r());
            }
            while (true) {
                if (this.f66819f != null && d()) {
                    this.f66821h = null;
                    while (!z11 && d()) {
                        List<pk.o<File, ?>> list = this.f66819f;
                        int i11 = this.f66820g;
                        this.f66820g = i11 + 1;
                        this.f66821h = list.get(i11).buildLoadData(this.f66822i, this.f66815b.t(), this.f66815b.f(), this.f66815b.k());
                        if (this.f66821h != null && this.f66815b.u(this.f66821h.f80730c.getDataClass())) {
                            this.f66821h.f80730c.loadData(this.f66815b.l(), this);
                            z11 = true;
                        }
                    }
                    gl.b.f();
                    return z11;
                }
                int i12 = this.f66817d + 1;
                this.f66817d = i12;
                if (i12 >= m11.size()) {
                    int i13 = this.f66816c + 1;
                    this.f66816c = i13;
                    if (i13 >= c11.size()) {
                        gl.b.f();
                        return false;
                    }
                    this.f66817d = 0;
                }
                ik.b bVar = c11.get(this.f66816c);
                Class<?> cls = m11.get(this.f66817d);
                this.f66823j = new w(this.f66815b.b(), bVar, this.f66815b.p(), this.f66815b.t(), this.f66815b.f(), this.f66815b.s(cls), cls, this.f66815b.k());
                File b11 = this.f66815b.d().b(this.f66823j);
                this.f66822i = b11;
                if (b11 != null) {
                    this.f66818e = bVar;
                    this.f66819f = this.f66815b.j(b11);
                    this.f66820g = 0;
                }
            }
        } catch (Throwable th2) {
            gl.b.f();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void b(Object obj) {
        this.f66814a.b(this.f66818e, obj, this.f66821h.f80730c, DataSource.RESOURCE_DISK_CACHE, this.f66823j);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@NonNull Exception exc) {
        this.f66814a.c(this.f66823j, exc, this.f66821h.f80730c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // kk.f
    public void cancel() {
        o.a<?> aVar = this.f66821h;
        if (aVar != null) {
            aVar.f80730c.cancel();
        }
    }
}
