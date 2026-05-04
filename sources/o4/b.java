package o4;

import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.net.exception.NetworkException;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import f50.k0;
import h10.d;
import h10.r;
import h10.t;
import io.ktor.server.routing.b1;
import io.ktor.server.routing.c1;
import java.util.Locale;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import o50.f;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczParamExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,74:1\n40#1,20:76\n147#2:75\n58#3,16:96\n58#3,16:113\n18#4:112\n*S KotlinDebug\n*F\n+ 1 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n*L\n33#1:76,20\n25#1:75\n34#1:96,16\n70#1:113,16\n70#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final xy.a<k50.a> f75713a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f75714b = "Bcz-Param";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f75715c = "bcz-local://game.baicizhan.com";

    static {
        r rVar;
        d d11 = o0.d(k50.a.class);
        try {
            rVar = o0.B(k50.a.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f75713a = new xy.a<>("KtorJson", new gz.a(d11, rVar));
    }

    public static final /* synthetic */ <T> Object a(c1 c1Var, l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super g2> cVar) {
        s4.c cVar2;
        s4.c cVar3;
        b1 a11 = c1Var.a();
        try {
            cVar3 = new s4.c(1, (String) null, lVar.invoke(cVar), 2, (v) null);
        } catch (Throwable th2) {
            z6.b.f101032b.i("safeExecute", "", th2);
            if (th2 instanceof BizInternalException) {
                int code = 100000 + ((BizInternalException) th2).getCode();
                String message = th2.getMessage();
                cVar2 = new s4.c(code, message != null ? message : "Unknown error", (Object) null, 4, (v) null);
            } else if (th2 instanceof NetworkException) {
                String message2 = th2.getMessage();
                cVar2 = new s4.c(s3.c.f87473e, message2 != null ? message2 : "Unknown error", (Object) null, 4, (v) null);
            } else if (th2 instanceof LogicException) {
                LogicException logicException = (LogicException) th2;
                cVar3 = new s4.c(s3.c.f87471c + logicException.code, logicException.message_, (Object) null, 4, (v) null);
            } else {
                cVar2 = new s4.c(s3.c.f87474f, th2.getMessage(), (Object) null, 4, (v) null);
            }
            cVar3 = cVar2;
        }
        d d11 = o0.d(s4.c.class);
        r rVar = null;
        try {
            t.a aVar = t.f57954c;
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
            rVar = o0.C(s4.c.class, aVar.e(null));
        } catch (Throwable unused) {
        }
        gz.a aVar2 = new gz.a(d11, rVar);
        d0.e(0);
        a11.E(cVar3, aVar2, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    public static final /* synthetic */ <T> T b(zx.b bVar) {
        g0.p(bVar, "<this>");
        k50.a aVar = (k50.a) bVar.w0().getAttributes().g(d());
        String str = bVar.f().a().get(f75714b);
        g0.m(str);
        f serializersModule = aVar.getSerializersModule();
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.withModule");
        return (T) aVar.c(k0.n(serializersModule, null), str);
    }

    @k
    public static final ix.k c(@k String path) {
        g0.p(path, "path");
        String lowerCase = u30.k0.N5(path, '.', "").toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        return ix.l0.e(ix.k.f62843f, lowerCase);
    }

    @k
    public static final xy.a<k50.a> d() {
        return f75713a;
    }

    public static final /* synthetic */ <T> Object e(l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super s4.c<T>> cVar) {
        try {
            return new s4.c(1, (String) null, lVar.invoke(cVar), 2, (v) null);
        } catch (Throwable th2) {
            z6.b.f101032b.i("safeExecute", "", th2);
            if (th2 instanceof BizInternalException) {
                int code = 100000 + ((BizInternalException) th2).getCode();
                String message = th2.getMessage();
                return new s4.c(code, message != null ? message : "Unknown error", (Object) null, 4, (v) null);
            }
            if (th2 instanceof NetworkException) {
                String message2 = th2.getMessage();
                return new s4.c(s3.c.f87473e, message2 != null ? message2 : "Unknown error", (Object) null, 4, (v) null);
            }
            if (!(th2 instanceof LogicException)) {
                return new s4.c(s3.c.f87474f, th2.getMessage(), (Object) null, 4, (v) null);
            }
            LogicException logicException = (LogicException) th2;
            return new s4.c(s3.c.f87471c + logicException.code, logicException.message_, (Object) null, 4, (v) null);
        }
    }
}
