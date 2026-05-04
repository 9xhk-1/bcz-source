package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f4282b;

    public /* synthetic */ c(LocationManager locationManager, LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f4281a = locationManager;
        this.f4282b = gpsStatusTransport;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(this.f4281a.addGpsStatusListener(this.f4282b));
        return valueOf;
    }
}
