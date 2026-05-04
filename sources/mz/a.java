package mz;

import c40.j;
import c40.l2;
import c40.r0;
import io.ktor.utils.io.g;
import io.ktor.utils.io.h;
import io.ktor.utils.io.m;
import io.ktor.utils.io.q;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f73897a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$close$1", f = "Blocking.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: mz.a$b$a, reason: collision with other inner class name */
        public static final class C0893a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73898a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f73899b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0893a(m mVar, j00.c<? super C0893a> cVar) {
                super(2, cVar);
                this.f73899b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0893a(this.f73899b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0893a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73898a;
                if (i11 == 0) {
                    e.n(obj);
                    m mVar = this.f73899b;
                    this.f73898a = 1;
                    if (mVar.j(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$flush$1", f = "Blocking.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: mz.a$b$b, reason: collision with other inner class name */
        public static final class C0894b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73900a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f73901b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0894b(m mVar, j00.c<? super C0894b> cVar) {
                super(2, cVar);
                this.f73901b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0894b(this.f73901b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0894b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73900a;
                if (i11 == 0) {
                    e.n(obj);
                    m mVar = this.f73901b;
                    this.f73900a = 1;
                    if (mVar.g(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$1", f = "Blocking.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73902a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f73903b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f73904c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(m mVar, int i11, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f73903b = mVar;
                this.f73904c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new c(this.f73903b, this.f73904c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73902a;
                if (i11 == 0) {
                    e.n(obj);
                    m mVar = this.f73903b;
                    byte b11 = (byte) this.f73904c;
                    this.f73902a = 1;
                    if (q.p(mVar, b11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2", f = "Blocking.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73905a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f73906b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ byte[] f73907c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f73908d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f73909e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(m mVar, byte[] bArr, int i11, int i12, j00.c<? super d> cVar) {
                super(2, cVar);
                this.f73906b = mVar;
                this.f73907c = bArr;
                this.f73908d = i11;
                this.f73909e = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new d(this.f73906b, this.f73907c, this.f73908d, this.f73909e, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73905a;
                if (i11 == 0) {
                    e.n(obj);
                    m mVar = this.f73906b;
                    byte[] bArr = this.f73907c;
                    int i12 = this.f73908d;
                    int i13 = this.f73909e + i12;
                    this.f73905a = 1;
                    if (q.r(mVar, bArr, i12, i13, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        public b(m mVar) {
            this.f73897a = mVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            j.b(null, new C0893a(this.f73897a, null), 1, null);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            j.b(null, new C0894b(this.f73897a, null), 1, null);
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            j.b(null, new c(this.f73897a, i11, null), 1, null);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b11, int i11, int i12) {
            g0.p(b11, "b");
            j.b(null, new d(this.f73897a, b11, i11, i12, null), 1, null);
        }
    }

    @k
    public static final InputStream a(@k g gVar, @l l2 l2Var) {
        g0.p(gVar, "<this>");
        return new C0891a(gVar);
    }

    public static /* synthetic */ InputStream b(g gVar, l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l2Var = null;
        }
        return a(gVar, l2Var);
    }

    @k
    public static final OutputStream c(@k m mVar) {
        g0.p(mVar, "<this>");
        return new b(mVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: mz.a$a, reason: collision with other inner class name */
    public static final class C0891a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f73894a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1", f = "Blocking.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: mz.a$a$a, reason: collision with other inner class name */
        public static final class C0892a extends SuspendLambda implements p<r0, j00.c<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73895a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f73896b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0892a(g gVar, j00.c<? super C0892a> cVar) {
                super(2, cVar);
                this.f73896b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0892a(this.f73896b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
                return ((C0892a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73895a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                    return obj;
                }
                e.n(obj);
                g gVar = this.f73896b;
                this.f73895a = 1;
                Object a11 = g.b.a(gVar, 0, this, 1, null);
                return a11 == l11 ? l11 : a11;
            }
        }

        public C0891a(g gVar) {
            this.f73894a = gVar;
        }

        public final void a() {
            j.b(null, new C0892a(this.f73894a, null), 1, null);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            h.a(this.f73894a);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f73894a.f()) {
                return -1;
            }
            if (this.f73894a.e().J()) {
                a();
            }
            if (this.f73894a.f()) {
                return -1;
            }
            return this.f73894a.e().readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] b11, int i11, int i12) {
            g0.p(b11, "b");
            if (this.f73894a.f()) {
                return -1;
            }
            if (this.f73894a.e().J()) {
                a();
            }
            int c72 = this.f73894a.e().c7(b11, i11, Math.min(io.ktor.utils.io.j.m(this.f73894a), i12) + i11);
            return c72 >= 0 ? c72 : this.f73894a.f() ? -1 : 0;
        }
    }
}
