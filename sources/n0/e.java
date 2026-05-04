package n0;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import n0.d;
import u0.j;
import u0.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f73951a = "NetworkObserver";

    @k
    public static final d a(@k Context context, @k d.a aVar, @l w wVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !u0.d.e(context, yk.e.f100168b)) {
            if (wVar != null && wVar.getLevel() <= 5) {
                wVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new c();
        }
        try {
            return new f(connectivityManager, aVar);
        } catch (Exception e11) {
            if (wVar != null) {
                j.b(wVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e11));
            }
            return new c();
        }
    }
}
