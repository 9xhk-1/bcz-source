package b0;

import android.content.Context;
import androidx.annotation.WorkerThread;
import b0.f;
import c40.r0;
import coil.request.ImageRequest;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import w00.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ImageLoaders")
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super o0.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5606a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f5607b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f5608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ImageRequest imageRequest, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f5607b = fVar;
            this.f5608c = imageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new a(this.f5607b, this.f5608c, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super o0.g> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5606a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            f fVar = this.f5607b;
            ImageRequest imageRequest = this.f5608c;
            this.f5606a = 1;
            Object e11 = fVar.e(imageRequest, this);
            return e11 == l11 ? l11 : e11;
        }
    }

    @j(name = "create")
    @k
    public static final f a(@k Context context) {
        return new f.a(context).j();
    }

    @WorkerThread
    @k
    public static final o0.g b(@k f fVar, @k ImageRequest imageRequest) {
        Object b11;
        b11 = c40.j.b(null, new a(fVar, imageRequest, null), 1, null);
        return (o0.g) b11;
    }
}
