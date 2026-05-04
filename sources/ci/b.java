package ci;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import c4.j;
import dd.h;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.x2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\ncom/baicizhan/main/unity/bridge/HandlerKt\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,22:1\n10#2:23\n43#3:24\n124#4,4:25\n142#5:29\n*S KotlinDebug\n*F\n+ 1 Handler.kt\ncom/baicizhan/main/unity/bridge/HandlerKt\n*L\n19#1:23\n19#1:24\n19#1:25,4\n19#1:29\n*E\n"})
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Map<String, x2> f8677a = new LinkedHashMap();

    public static final /* synthetic */ <T extends x2> T a(Context context) {
        g0.p(context, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        String simpleName = x2.class.getSimpleName();
        if (b().containsKey(simpleName)) {
            x2 x2Var = b().get(simpleName);
            g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) x2Var;
        }
        h.g(context);
        cb0.b h11 = j.f7801a.a().P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) h11.i(o0.d(Object.class), null, null);
        b().put(simpleName, t11);
        return t11;
    }

    @k
    public static final Map<String, x2> b() {
        return f8677a;
    }
}
