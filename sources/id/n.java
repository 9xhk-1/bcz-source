package id;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.course_api.CourseApiService;
import com.baicizhan.online.course_api.ImproveChapterDoneReq;
import com.baicizhan.online.course_api.ImproveVideoInfo;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n f60511a = new n();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f60512b = "AiClassModule";

    /* renamed from: c, reason: collision with root package name */
    public static final int f60513c = 0;

    public static final void A(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void B(Throwable th2) {
        qb.c.c(f60512b, "", th2);
    }

    public static final g2 n(long j11, Boolean bool) {
        qb.c.i(f60512b, "finish class " + j11 + ": " + bool, new Object[0]);
        return g2.f100423a;
    }

    public static final void o(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void p(Throwable th2) {
        qb.c.c(f60512b, "", th2);
    }

    public static final Boolean r(long j11, int i11, CourseApiService.Client client) {
        client.submit_improve_chapter_done(new ImproveChapterDoneReq(j11, i11));
        return Boolean.TRUE;
    }

    public static final Boolean s(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final a u(long j11, CourseApiService.Client client) {
        ImproveVideoInfo improveVideoInfo = client.get_improve_video_info(j11);
        g0.o(improveVideoInfo, "get_improve_video_info(...)");
        return new a(improveVideoInfo, j11);
    }

    public static final a v(x00.l lVar, Object obj) {
        return (a) lVar.invoke(obj);
    }

    public static final g2 x(Context context, Bitmap bitmap, Bitmap bitmap2) {
        b9.d.c().e(context, bitmap);
        bitmap.recycle();
        return g2.f100423a;
    }

    public static final void y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final g2 z(Bitmap bitmap) {
        return g2.f100423a;
    }

    public final void m(final long j11) {
        rx.c<Boolean> q11 = q(j11, 1);
        final x00.l lVar = new x00.l() { // from class: id.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = n.n(j11, (Boolean) obj);
                return n11;
            }
        };
        q11.u5(new wb0.b() { // from class: id.e
            @Override // wb0.b
            public final void call(Object obj) {
                n.o(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: id.f
            @Override // wb0.b
            public final void call(Object obj) {
                n.p((Throwable) obj);
            }
        });
    }

    public final rx.c<Boolean> q(final long j11, final int i11) {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/course"));
        final x00.l lVar = new x00.l() { // from class: id.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean r11;
                r11 = n.r(j11, i11, (CourseApiService.Client) obj);
                return r11;
            }
        };
        rx.c<Boolean> w52 = a11.c3(new wb0.p() { // from class: id.h
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean s11;
                s11 = n.s(x00.l.this, obj);
                return s11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    @m80.k
    public final rx.c<a> t(final long j11) {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/course"));
        final x00.l lVar = new x00.l() { // from class: id.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                a u11;
                u11 = n.u(j11, (CourseApiService.Client) obj);
                return u11;
            }
        };
        rx.c<a> w52 = a11.c3(new wb0.p() { // from class: id.d
            @Override // wb0.p
            public final Object call(Object obj) {
                a v11;
                v11 = n.v(x00.l.this, obj);
                return v11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final void w(@m80.k final Bitmap bitmap, @m80.k final Context context) {
        g0.p(bitmap, "bitmap");
        g0.p(context, "context");
        rx.c M2 = rx.c.M2(bitmap);
        final x00.l lVar = new x00.l() { // from class: id.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = n.x(context, bitmap, (Bitmap) obj);
                return x11;
            }
        };
        rx.c w52 = M2.L1(new wb0.b() { // from class: id.j
            @Override // wb0.b
            public final void call(Object obj) {
                n.y(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        final x00.l lVar2 = new x00.l() { // from class: id.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = n.z((Bitmap) obj);
                return z11;
            }
        };
        w52.u5(new wb0.b() { // from class: id.l
            @Override // wb0.b
            public final void call(Object obj) {
                n.A(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: id.m
            @Override // wb0.b
            public final void call(Object obj) {
                n.B((Throwable) obj);
            }
        });
    }
}
