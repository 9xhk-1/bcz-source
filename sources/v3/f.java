package v3;

import android.os.Looper;
import c40.j;
import c40.r0;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.c;
import l.g;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f implements g<c.d<g2>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g<c.a<g2>> f92911a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.database.SqlSchemaWrap$create$1", f = "ISqlDriverFactory.android.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super c.d<g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92912a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l.e f92914c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.e eVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f92914c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return f.this.new a(this.f92914c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super c.d<g2>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92912a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l j11 = ((c.a) f.this.f92911a.a(this.f92914c)).j();
                this.f92912a = 1;
                if (c.a.a(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return c.d.b(l.c.f69104a.a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.database.SqlSchemaWrap$migrate$1", f = "ISqlDriverFactory.android.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super c.d<g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92915a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l.e f92917c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f92918d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f92919e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l.a[] f92920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.e eVar, long j11, long j12, l.a[] aVarArr, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f92917c = eVar;
            this.f92918d = j11;
            this.f92919e = j12;
            this.f92920f = aVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return f.this.new b(this.f92917c, this.f92918d, this.f92919e, this.f92920f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super c.d<g2>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92915a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                g gVar = f.this.f92911a;
                l.e eVar = this.f92917c;
                long j11 = this.f92918d;
                long j12 = this.f92919e;
                l.a[] aVarArr = this.f92920f;
                l j13 = ((c.a) gVar.b(eVar, j11, j12, (l.a[]) Arrays.copyOf(aVarArr, aVarArr.length))).j();
                this.f92915a = 1;
                if (c.a.a(j13, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return c.d.b(l.c.f69104a.a());
        }
    }

    public f(@k g<c.a<g2>> schedules) {
        g0.p(schedules, "schedules");
        this.f92911a = schedules;
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ c.d<g2> a(l.e eVar) {
        return c.d.b(d(eVar));
    }

    @Override // l.g
    public /* bridge */ /* synthetic */ c.d<g2> b(l.e eVar, long j11, long j12, l.a[] aVarArr) {
        return c.d.b(e(eVar, j11, j12, aVarArr));
    }

    @k
    public Object d(@k l.e driver) {
        Object b11;
        g0.p(driver, "driver");
        z6.b.j(z6.b.f101032b, "ISqlDriverFactoryImpl", "create  " + Thread.currentThread().getId() + ' ' + Looper.getMainLooper().getThread().getId(), null, 4, null);
        b11 = j.b(null, new a(driver, null), 1, null);
        return ((c.d) b11).h();
    }

    @k
    public Object e(@k l.e driver, long j11, long j12, @k l.a... callbacks) {
        Object b11;
        g0.p(driver, "driver");
        g0.p(callbacks, "callbacks");
        z6.b.j(z6.b.f101032b, "ISqlDriverFactoryImpl", "migrate " + j11 + ' ' + j12 + GlideException.a.f28776d + Thread.currentThread().getId() + ' ' + Looper.getMainLooper().getThread().getId(), null, 4, null);
        b11 = j.b(null, new b(driver, j11, j12, callbacks, null), 1, null);
        return ((c.d) b11).h();
    }

    @Override // l.g
    public long getVersion() {
        return this.f92911a.getVersion();
    }
}
