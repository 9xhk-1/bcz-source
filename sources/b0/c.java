package b0;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import b0.c;
import coil.request.ImageRequest;
import m80.k;
import m80.l;
import o0.j;
import o0.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface c extends ImageRequest.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f5587a = b.f5589a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public static final c f5588b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f5589a = new b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b0.c$c, reason: collision with other inner class name */
    public static final class C0100c {
        @WorkerThread
        @Deprecated
        public static void a(@k c cVar, @k ImageRequest imageRequest, @k f0.h hVar, @k j jVar, @l f0.f fVar) {
            c.super.z(imageRequest, hVar, jVar, fVar);
        }

        @WorkerThread
        @Deprecated
        public static void b(@k c cVar, @k ImageRequest imageRequest, @k f0.h hVar, @k j jVar) {
            c.super.i(imageRequest, hVar, jVar);
        }

        @WorkerThread
        @Deprecated
        public static void c(@k c cVar, @k ImageRequest imageRequest, @k i0.i iVar, @k j jVar, @l i0.h hVar) {
            c.super.l(imageRequest, iVar, jVar, hVar);
        }

        @WorkerThread
        @Deprecated
        public static void d(@k c cVar, @k ImageRequest imageRequest, @k i0.i iVar, @k j jVar) {
            c.super.m(imageRequest, iVar, jVar);
        }

        @MainThread
        @Deprecated
        public static void e(@k c cVar, @k ImageRequest imageRequest, @l String str) {
            c.super.e(imageRequest, str);
        }

        @MainThread
        @Deprecated
        public static void f(@k c cVar, @k ImageRequest imageRequest, @k Object obj) {
            c.super.r(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void g(@k c cVar, @k ImageRequest imageRequest, @k Object obj) {
            c.super.j(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void h(@k c cVar, @k ImageRequest imageRequest, @k Object obj) {
            c.super.E(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void i(@k c cVar, @k ImageRequest imageRequest) {
            c.super.a(imageRequest);
        }

        @MainThread
        @Deprecated
        public static void j(@k c cVar, @k ImageRequest imageRequest, @k o0.e eVar) {
            c.super.b(imageRequest, eVar);
        }

        @MainThread
        @Deprecated
        public static void k(@k c cVar, @k ImageRequest imageRequest) {
            c.super.d(imageRequest);
        }

        @MainThread
        @Deprecated
        public static void l(@k c cVar, @k ImageRequest imageRequest, @k m mVar) {
            c.super.c(imageRequest, mVar);
        }

        @MainThread
        @Deprecated
        public static void m(@k c cVar, @k ImageRequest imageRequest, @k q0.g gVar) {
            c.super.B(imageRequest, gVar);
        }

        @MainThread
        @Deprecated
        public static void n(@k c cVar, @k ImageRequest imageRequest) {
            c.super.M(imageRequest);
        }

        @WorkerThread
        @Deprecated
        public static void o(@k c cVar, @k ImageRequest imageRequest, @k Bitmap bitmap) {
            c.super.I(imageRequest, bitmap);
        }

        @WorkerThread
        @Deprecated
        public static void p(@k c cVar, @k ImageRequest imageRequest, @k Bitmap bitmap) {
            c.super.F(imageRequest, bitmap);
        }

        @MainThread
        @Deprecated
        public static void q(@k c cVar, @k ImageRequest imageRequest, @k t0.c cVar2) {
            c.super.u(imageRequest, cVar2);
        }

        @MainThread
        @Deprecated
        public static void r(@k c cVar, @k ImageRequest imageRequest, @k t0.c cVar2) {
            c.super.t(imageRequest, cVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f5590a = a.f5592a;

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @k
        public static final d f5591b = new d() { // from class: b0.d
            @Override // b0.c.d
            public final c b(ImageRequest imageRequest) {
                c c11;
                c11 = c.d.c(imageRequest);
                return c11;
            }
        };

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f5592a = new a();
        }

        static c c(ImageRequest imageRequest) {
            return c.f5588b;
        }

        @k
        c b(@k ImageRequest imageRequest);
    }

    @MainThread
    default void M(@k ImageRequest imageRequest) {
    }

    @Override // coil.request.ImageRequest.a
    @MainThread
    default void a(@k ImageRequest imageRequest) {
    }

    @Override // coil.request.ImageRequest.a
    @MainThread
    default void d(@k ImageRequest imageRequest) {
    }

    @MainThread
    default void B(@k ImageRequest imageRequest, @k q0.g gVar) {
    }

    @MainThread
    default void E(@k ImageRequest imageRequest, @k Object obj) {
    }

    @WorkerThread
    default void F(@k ImageRequest imageRequest, @k Bitmap bitmap) {
    }

    @WorkerThread
    default void I(@k ImageRequest imageRequest, @k Bitmap bitmap) {
    }

    @Override // coil.request.ImageRequest.a
    @MainThread
    default void b(@k ImageRequest imageRequest, @k o0.e eVar) {
    }

    @Override // coil.request.ImageRequest.a
    @MainThread
    default void c(@k ImageRequest imageRequest, @k m mVar) {
    }

    @MainThread
    default void e(@k ImageRequest imageRequest, @l String str) {
    }

    @MainThread
    default void j(@k ImageRequest imageRequest, @k Object obj) {
    }

    @MainThread
    default void r(@k ImageRequest imageRequest, @k Object obj) {
    }

    @MainThread
    default void t(@k ImageRequest imageRequest, @k t0.c cVar) {
    }

    @MainThread
    default void u(@k ImageRequest imageRequest, @k t0.c cVar) {
    }

    @WorkerThread
    default void i(@k ImageRequest imageRequest, @k f0.h hVar, @k j jVar) {
    }

    @WorkerThread
    default void m(@k ImageRequest imageRequest, @k i0.i iVar, @k j jVar) {
    }

    @WorkerThread
    default void l(@k ImageRequest imageRequest, @k i0.i iVar, @k j jVar, @l i0.h hVar) {
    }

    @WorkerThread
    default void z(@k ImageRequest imageRequest, @k f0.h hVar, @k j jVar, @l f0.f fVar) {
    }
}
