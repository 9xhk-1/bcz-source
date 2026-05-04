package n2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.j;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class h<T extends com.badlogic.gdx.graphics.j> implements a3.q {

    /* renamed from: l, reason: collision with root package name */
    public static final int f74125l = 35056;

    /* renamed from: m, reason: collision with root package name */
    public static int f74126m;

    /* renamed from: b, reason: collision with root package name */
    public int f74130b;

    /* renamed from: c, reason: collision with root package name */
    public int f74131c;

    /* renamed from: d, reason: collision with root package name */
    public int f74132d;

    /* renamed from: e, reason: collision with root package name */
    public int f74133e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74134f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74136h;

    /* renamed from: i, reason: collision with root package name */
    public f<? extends h<T>> f74137i;

    /* renamed from: j, reason: collision with root package name */
    public IntBuffer f74138j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<h>> f74124k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static boolean f74127n = false;

    /* renamed from: o, reason: collision with root package name */
    public static final IntBuffer f74128o = BufferUtils.G(1);

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f74129a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: g, reason: collision with root package name */
    public final a3.v f74135g = new a3.v();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends f<n2.e> {
        public a(int i11, int i12) {
            super(i11, i12);
        }

        @Override // n2.h.f
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public n2.e m() {
            return new n2.e(this);
        }

        public a(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends f<n2.f> {
        public b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // n2.h.f
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public n2.f m() {
            return new n2.f(this);
        }

        public b(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends f<g> {
        public c(int i11, int i12) {
            super(i11, i12);
        }

        @Override // n2.h.f
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public g m() {
            return new g(this);
        }

        public c(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f74139a;

        public d(int i11) {
            this.f74139a = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f74140a;

        /* renamed from: b, reason: collision with root package name */
        public int f74141b;

        /* renamed from: c, reason: collision with root package name */
        public int f74142c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f74143d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f74144e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f74145f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f74146g;

        public e(int i11, int i12, int i13) {
            this.f74140a = i11;
            this.f74141b = i12;
            this.f74142c = i13;
        }

        public boolean a() {
            return (this.f74145f || this.f74146g) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<U extends h<? extends com.badlogic.gdx.graphics.j>> {

        /* renamed from: a, reason: collision with root package name */
        public int f74147a;

        /* renamed from: b, reason: collision with root package name */
        public int f74148b;

        /* renamed from: c, reason: collision with root package name */
        public int f74149c;

        /* renamed from: d, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<e> f74150d;

        /* renamed from: e, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<d> f74151e;

        /* renamed from: f, reason: collision with root package name */
        public d f74152f;

        /* renamed from: g, reason: collision with root package name */
        public d f74153g;

        /* renamed from: h, reason: collision with root package name */
        public d f74154h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f74155i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f74156j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f74157k;

        public f(int i11, int i12) {
            this(i11, i12, 0);
        }

        public f<U> a(Pixmap.Format format) {
            int glFormat = Pixmap.Format.toGlFormat(format);
            return f(glFormat, glFormat, Pixmap.Format.toGlType(format));
        }

        public f<U> b() {
            return g(com.badlogic.gdx.graphics.f.f11652q4);
        }

        public f<U> c() {
            return j(35056);
        }

        public f<U> d() {
            return k(com.badlogic.gdx.graphics.f.f11664s4);
        }

        public f<U> e(int i11) {
            this.f74151e.a(new d(i11));
            return this;
        }

        public f<U> f(int i11, int i12, int i13) {
            this.f74150d.a(new e(i11, i12, i13));
            return this;
        }

        public f<U> g(int i11) {
            this.f74153g = new d(i11);
            this.f74156j = true;
            return this;
        }

        public f<U> h(int i11, int i12) {
            e eVar = new e(i11, com.badlogic.gdx.graphics.f.B1, i12);
            eVar.f74145f = true;
            this.f74150d.a(eVar);
            return this;
        }

        public f<U> i(int i11, int i12, int i13, boolean z11) {
            e eVar = new e(i11, i12, i13);
            eVar.f74143d = true;
            eVar.f74144e = z11;
            this.f74150d.a(eVar);
            return this;
        }

        public f<U> j(int i11) {
            this.f74154h = new d(i11);
            this.f74157k = true;
            return this;
        }

        public f<U> k(int i11) {
            this.f74152f = new d(i11);
            this.f74155i = true;
            return this;
        }

        public f<U> l(int i11, int i12) {
            e eVar = new e(i11, com.badlogic.gdx.graphics.f.I4, i12);
            eVar.f74146g = true;
            this.f74150d.a(eVar);
            return this;
        }

        public abstract U m();

        public f(int i11, int i12, int i13) {
            this.f74150d = new com.badlogic.gdx.utils.a<>();
            this.f74151e = new com.badlogic.gdx.utils.a<>();
            this.f74147a = i11;
            this.f74148b = i12;
            this.f74149c = i13;
        }
    }

    public h() {
    }

    public static void I(Application application) {
        f74124k.remove(application);
    }

    public static String V0() {
        return a1(new StringBuilder()).toString();
    }

    public static StringBuilder a1(StringBuilder sb2) {
        sb2.append("Managed buffers/app: { ");
        Iterator<Application> it = f74124k.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f74124k.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2;
    }

    public static void b(Application application, h hVar) {
        Map<Application, com.badlogic.gdx.utils.a<h>> map = f74124k;
        com.badlogic.gdx.utils.a<h> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(hVar);
        map.put(application, aVar);
    }

    public static void e1(Application application) {
        com.badlogic.gdx.utils.a<h> aVar;
        if (q1.g.f81385h == null || (aVar = f74124k.get(application)) == null) {
            return;
        }
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            aVar.get(i11).z();
        }
    }

    public static void p() {
        q1.g.f81385h.K(com.badlogic.gdx.graphics.f.f11622l4, f74126m);
    }

    public int C0() {
        return this.f74133e;
    }

    public final void D() {
        if (this.f74137i.f74149c > 0 && !q1.g.f81379b.C()) {
            throw new GdxRuntimeException("Framebuffer multisample requires GLES 3.1+");
        }
        f<? extends h<T>> fVar = this.f74137i;
        if (fVar.f74149c > 0 && fVar.f74150d.f13179b > 0) {
            throw new GdxRuntimeException("Framebuffer multisample with texture attachments not yet supported");
        }
        if (!q1.g.f81379b.m()) {
            boolean z11 = q1.g.f81379b.d("GL_OES_packed_depth_stencil") || q1.g.f81379b.d("GL_EXT_packed_depth_stencil");
            f<? extends h<T>> fVar2 = this.f74137i;
            if (fVar2.f74157k && !z11) {
                throw new GdxRuntimeException("Packed Stencil/Render render buffers are not available on GLES 2.0");
            }
            com.badlogic.gdx.utils.a<e> aVar = fVar2.f74150d;
            if (aVar.f13179b > 1) {
                throw new GdxRuntimeException("Multiple render targets not available on GLES 2.0");
            }
            a.b<e> it = aVar.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next.f74145f) {
                    throw new GdxRuntimeException("Depth texture FrameBuffer Attachment not available on GLES 2.0");
                }
                if (next.f74146g) {
                    throw new GdxRuntimeException("Stencil texture FrameBuffer Attachment not available on GLES 2.0");
                }
                if (next.f74143d && !q1.g.f81379b.d("OES_texture_float")) {
                    throw new GdxRuntimeException("Float texture FrameBuffer Attachment not available on GLES 2.0");
                }
            }
        }
        f<? extends h<T>> fVar3 = this.f74137i;
        if (fVar3.f74157k) {
            if (fVar3.f74156j || fVar3.f74155i) {
                throw new GdxRuntimeException("Frame buffer couldn't be constructed: packed stencil depth buffer cannot be specified together with separated depth or stencil buffer");
            }
        }
    }

    public int J0() {
        return this.f74130b;
    }

    public int Q0() {
        return this.f74137i.f74148b;
    }

    public abstract T R(e eVar);

    public void S() {
        q1.g.f81385h.K(com.badlogic.gdx.graphics.f.f11622l4, this.f74130b);
    }

    public abstract void X(T t11);

    public void Z(int i11, int i12, int i13, int i14) {
        p();
        q1.g.f81385h.glViewport(i11, i12, i13, i14);
    }

    public int b1() {
        return this.f74132d;
    }

    public void c() {
        S();
        f1();
    }

    public com.badlogic.gdx.utils.a<T> c1() {
        return this.f74129a;
    }

    public int d1() {
        return this.f74137i.f74147a;
    }

    @Override // a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        a.b<T> it = this.f74129a.iterator();
        while (it.hasNext()) {
            X(it.next());
        }
        fVar.e1(this.f74133e);
        fVar.e1(this.f74131c);
        fVar.e1(this.f74132d);
        fVar.s1(this.f74130b);
        Map<Application, com.badlogic.gdx.utils.a<h>> map = f74124k;
        if (map.get(q1.g.f81378a) != null) {
            map.get(q1.g.f81378a).C(this, true);
        }
    }

    public void end() {
        Z(0, 0, q1.g.f81379b.D(), q1.g.f81379b.T());
    }

    public void f1() {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        f<? extends h<T>> fVar2 = this.f74137i;
        fVar.glViewport(0, 0, fVar2.f74147a, fVar2.f74148b);
    }

    public void g1(h<T> hVar) {
        a.b<e> it = hVar.f74137i.f74150d.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            e next = it.next();
            if (next.f74145f) {
                f<? extends h<T>> fVar = this.f74137i;
                if (fVar.f74156j || fVar.f74157k) {
                    i11 |= 256;
                }
            }
            if (next.f74146g) {
                f<? extends h<T>> fVar2 = this.f74137i;
                if (fVar2.f74155i || fVar2.f74157k) {
                    i11 |= 1024;
                }
            }
            if (this.f74135g.f1640b > 0) {
                i11 |= 16384;
            }
        }
        h1(hVar, i11);
    }

    public void h1(h<T> hVar, int i11) {
        if (hVar.d1() != d1() || hVar.Q0() != Q0()) {
            throw new IllegalArgumentException("source and destination frame buffers must have same size.");
        }
        q1.g.f81384g.K(com.badlogic.gdx.graphics.g.f11734e8, this.f74130b);
        q1.g.f81384g.K(com.badlogic.gdx.graphics.g.f11740f8, hVar.f74130b);
        a.b<e> it = hVar.f74137i.f74150d.iterator();
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next().a()) {
                q1.g.f81386i.d3(i13 + com.badlogic.gdx.graphics.f.G4);
                IntBuffer intBuffer = f74128o;
                intBuffer.clear();
                intBuffer.put(i14 + com.badlogic.gdx.graphics.f.G4);
                intBuffer.flip();
                q1.g.f81386i.y(1, intBuffer);
                q1.g.f81386i.b0(0, 0, d1(), Q0(), 0, 0, hVar.d1(), hVar.Q0(), i12, com.badlogic.gdx.graphics.f.f11692x2);
                i13++;
                i12 = 16384;
            }
            i14++;
        }
        if (i12 != 16384) {
            q1.g.f81386i.b0(0, 0, d1(), Q0(), 0, 0, hVar.d1(), hVar.Q0(), i12, com.badlogic.gdx.graphics.f.f11692x2);
        }
        IntBuffer intBuffer2 = hVar.f74138j;
        if (intBuffer2 != null) {
            q1.g.f81386i.y(intBuffer2.limit(), hVar.f74138j);
        }
        q1.g.f81384g.K(com.badlogic.gdx.graphics.g.f11734e8, 0);
        q1.g.f81384g.K(com.badlogic.gdx.graphics.g.f11740f8, 0);
    }

    public int i0(int i11) {
        return this.f74135g.m(i11);
    }

    public T n0() {
        return this.f74129a.first();
    }

    public abstract void o(T t11);

    public int w0() {
        return this.f74131c;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021a A[LOOP:2: B:78:0x0214->B:80:0x021a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.z():void");
    }

    public h(f<? extends h<T>> fVar) {
        this.f74137i = fVar;
        z();
    }
}
