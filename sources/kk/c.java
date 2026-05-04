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
public class c implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final List<ik.b> f66635a;

    /* renamed from: b, reason: collision with root package name */
    public final g<?> f66636b;

    /* renamed from: c, reason: collision with root package name */
    public final f.a f66637c;

    /* renamed from: d, reason: collision with root package name */
    public int f66638d;

    /* renamed from: e, reason: collision with root package name */
    public ik.b f66639e;

    /* renamed from: f, reason: collision with root package name */
    public List<pk.o<File, ?>> f66640f;

    /* renamed from: g, reason: collision with root package name */
    public int f66641g;

    /* renamed from: h, reason: collision with root package name */
    public volatile o.a<?> f66642h;

    /* renamed from: i, reason: collision with root package name */
    public File f66643i;

    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean d() {
        return this.f66641g < this.f66640f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (d() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f66640f;
        r3 = r7.f66641g;
        r7.f66641g = r3 + 1;
        r7.f66642h = r0.get(r3).buildLoadData(r7.f66643i, r7.f66636b.t(), r7.f66636b.f(), r7.f66636b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f66642h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f66636b.u(r7.f66642h.f80730c.getDataClass()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f66642h.f80730c.loadData(r7.f66636b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f66642h = null;
     */
    @Override // kk.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            gl.b.a(r0)
        L5:
            java.util.List<pk.o<java.io.File, ?>> r0 = r7.f66640f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.d()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f66642h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.d()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<pk.o<java.io.File, ?>> r0 = r7.f66640f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f66641g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f66641g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            pk.o r0 = (pk.o) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f66643i     // Catch: java.lang.Throwable -> L68
            kk.g<?> r4 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            kk.g<?> r5 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            kk.g<?> r6 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            ik.e r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            pk.o$a r0 = r0.buildLoadData(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f66642h = r0     // Catch: java.lang.Throwable -> L68
            pk.o$a<?> r0 = r7.f66642h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            kk.g<?> r0 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            pk.o$a<?> r3 = r7.f66642h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r3 = r3.f80730c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.getDataClass()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            pk.o$a<?> r0 = r7.f66642h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r0 = r0.f80730c     // Catch: java.lang.Throwable -> L68
            kk.g<?> r2 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.loadData(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            gl.b.f()
            return r2
        L6e:
            int r0 = r7.f66638d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f66638d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<ik.b> r1 = r7.f66635a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            gl.b.f()
            return r2
        L7f:
            java.util.List<ik.b> r0 = r7.f66635a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f66638d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            ik.b r0 = (ik.b) r0     // Catch: java.lang.Throwable -> L68
            kk.d r1 = new kk.d     // Catch: java.lang.Throwable -> L68
            kk.g<?> r3 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            ik.b r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            kk.g<?> r3 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            mk.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f66643i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f66639e = r0     // Catch: java.lang.Throwable -> L68
            kk.g<?> r0 = r7.f66636b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f66640f = r0     // Catch: java.lang.Throwable -> L68
            r7.f66641g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            gl.b.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.c.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void b(Object obj) {
        this.f66637c.b(this.f66639e, obj, this.f66642h.f80730c, DataSource.DATA_DISK_CACHE, this.f66639e);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@NonNull Exception exc) {
        this.f66637c.c(this.f66639e, exc, this.f66642h.f80730c, DataSource.DATA_DISK_CACHE);
    }

    @Override // kk.f
    public void cancel() {
        o.a<?> aVar = this.f66642h;
        if (aVar != null) {
            aVar.f80730c.cancel();
        }
    }

    public c(List<ik.b> list, g<?> gVar, f.a aVar) {
        this.f66638d = -1;
        this.f66635a = list;
        this.f66636b = gVar;
        this.f66637c = aVar;
    }
}
