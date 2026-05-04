package ti;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import c4.j;
import javax.inject.Singleton;
import k3.j3;
import k3.s0;
import k3.x2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import nu.h;
import nu.i;
import pu.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nWikiModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiModule.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/di/WikiModule\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,29:1\n10#2:30\n10#2:37\n43#3:31\n43#3:38\n124#4,4:32\n124#4,4:39\n142#5:36\n142#5:43\n*S KotlinDebug\n*F\n+ 1 WikiModule.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/di/WikiModule\n*L\n20#1:30\n26#1:37\n20#1:31\n26#1:38\n20#1:32,4\n26#1:39,4\n20#1:36\n26#1:43\n*E\n"})
@h
@e({fv.a.class})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f90646a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f90647b = 0;

    @Singleton
    @i
    @k
    public final s0 a(@k Application application) {
        g0.p(application, "application");
        dd.h.g(application);
        return (s0) ((x2) j.f7801a.a().P().h().i(o0.d(s0.class), null, null));
    }

    @Singleton
    @i
    @k
    public final j3 b(@k Application application) {
        g0.p(application, "application");
        dd.h.g(application);
        return (j3) ((x2) j.f7801a.a().P().h().i(o0.d(j3.class), null, null));
    }
}
