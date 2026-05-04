package n0;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import n0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"MissingPermission"})
@u0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12474#2,2:113\n12474#2,2:115\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n*L\n82#1:113,2\n96#1:115,2\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConnectivityManager f73952a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d.a f73953b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f73954c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@k Network network) {
            f.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@k Network network) {
            f.this.d(network, false);
        }
    }

    public f(@k ConnectivityManager connectivityManager, @k d.a aVar) {
        this.f73952a = connectivityManager;
        this.f73953b = aVar;
        a aVar2 = new a();
        this.f73954c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    @Override // n0.d
    public boolean a() {
        for (Network network : this.f73952a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f73952a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z11) {
        Network[] allNetworks = this.f73952a.getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network2 = allNetworks[i11];
            if (g0.g(network2, network) ? z11 : c(network2)) {
                z12 = true;
                break;
            }
            i11++;
        }
        this.f73953b.a(z12);
    }

    @Override // n0.d
    public void shutdown() {
        this.f73952a.unregisterNetworkCallback(this.f73954c);
    }
}
