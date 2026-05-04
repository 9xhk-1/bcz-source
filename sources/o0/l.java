package o0;

import a00.a0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import c40.l2;
import coil.request.ImageRequest;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q0.c;
import u0.s;
import u0.w;
import u0.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestService.kt\ncoil/request/RequestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b0.f f75478a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y f75479b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final s f75480c;

    public l(@m80.k b0.f fVar, @m80.k y yVar, @m80.l w wVar) {
        this.f75478a = fVar;
        this.f75479b = yVar;
        this.f75480c = u0.h.a(wVar);
    }

    @m80.k
    public final e a(@m80.k ImageRequest imageRequest, @m80.k Throwable th2) {
        Drawable t11;
        if (th2 instanceof NullRequestDataException) {
            t11 = imageRequest.u();
            if (t11 == null) {
                t11 = imageRequest.t();
            }
        } else {
            t11 = imageRequest.t();
        }
        return new e(t11, imageRequest, th2);
    }

    @WorkerThread
    public final boolean b(j jVar) {
        return !u0.a.f(jVar.f()) || this.f75480c.a();
    }

    public final boolean c(@m80.k ImageRequest imageRequest, @m80.k Bitmap.Config config) {
        if (!u0.a.f(config)) {
            return true;
        }
        if (!imageRequest.h()) {
            return false;
        }
        r0.c M = imageRequest.M();
        if (M instanceof r0.d) {
            View view = ((r0.d) M).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(ImageRequest imageRequest, q0.g gVar) {
        if (u0.a.f(imageRequest.j())) {
            return c(imageRequest, imageRequest.j()) && this.f75480c.b(gVar);
        }
        return true;
    }

    public final boolean e(ImageRequest imageRequest) {
        return imageRequest.O().isEmpty() || a0.B8(u0.l.w(), imageRequest.j());
    }

    @m80.k
    public final j f(@m80.k ImageRequest imageRequest, @m80.k q0.g gVar) {
        Bitmap.Config j11 = (e(imageRequest) && d(imageRequest, gVar)) ? imageRequest.j() : Bitmap.Config.ARGB_8888;
        q0.c f11 = gVar.f();
        c.b bVar = c.b.f81359a;
        return new j(imageRequest.l(), j11, imageRequest.k(), gVar, (g0.g(f11, bVar) || g0.g(gVar.e(), bVar)) ? Scale.FIT : imageRequest.J(), u0.k.a(imageRequest), imageRequest.i() && imageRequest.O().isEmpty() && j11 != Bitmap.Config.ALPHA_8, imageRequest.I(), imageRequest.r(), imageRequest.x(), imageRequest.L(), imageRequest.E(), imageRequest.C(), imageRequest.s(), imageRequest.D());
    }

    @m80.k
    public final k g(@m80.k ImageRequest imageRequest, @m80.k l2 l2Var) {
        Lifecycle z11 = imageRequest.z();
        r0.c M = imageRequest.M();
        return M instanceof r0.d ? new o(this.f75478a, imageRequest, (r0.d) M, z11, l2Var) : new a(z11, l2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0.j h(@m80.k o0.j r23) {
        /*
            r22 = this;
            android.graphics.Bitmap$Config r0 = r23.f()
            coil.request.CachePolicy r1 = r23.l()
            boolean r2 = r22.b(r23)
            r3 = 1
            if (r2 != 0) goto L14
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = r3
        L12:
            r6 = r0
            goto L16
        L14:
            r2 = 0
            goto L12
        L16:
            coil.request.CachePolicy r0 = r23.l()
            boolean r0 = r0.getReadEnabled()
            if (r0 == 0) goto L2f
            r0 = r22
            u0.y r4 = r0.f75479b
            boolean r4 = r4.f()
            if (r4 != 0) goto L31
            coil.request.CachePolicy r1 = coil.request.CachePolicy.DISABLED
        L2c:
            r19 = r1
            goto L33
        L2f:
            r0 = r22
        L31:
            r3 = r2
            goto L2c
        L33:
            if (r3 == 0) goto L50
            r20 = 16381(0x3ffd, float:2.2955E-41)
            r21 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r4 = r23
            o0.j r1 = o0.j.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L50:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l.h(o0.j):o0.j");
    }
}
