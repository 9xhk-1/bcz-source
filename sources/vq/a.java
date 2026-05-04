package vq;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import fr.k;
import fr.l;
import fr.n;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: vq.a$a, reason: collision with other inner class name */
    public static class CallableC1270a implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f94258a;

        /* renamed from: b, reason: collision with root package name */
        public final String f94259b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f94260c;

        /* renamed from: d, reason: collision with root package name */
        public final l<String> f94261d;

        public CallableC1270a(l<String> lVar, Context context, String str, boolean z11) {
            this.f94258a = context;
            this.f94259b = str;
            this.f94260c = z11;
            this.f94261d = lVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (this.f94260c) {
                Log.i("HomeCountryImpl", "force homeCountry");
                xq.a.b(this.f94261d, this.f94258a, this.f94259b);
                return null;
            }
            String i11 = zq.a.a(this.f94258a).i();
            if (i11 != null) {
                Log.i("HomeCountryImpl", "homeCountry from cache");
                if (System.currentTimeMillis() - zq.a.a(this.f94258a).j() < zq.a.a(this.f94258a).e()) {
                    Log.i("HomeCountryImpl", "current homeCountry is valid");
                    this.f94261d.d(i11);
                    return null;
                }
            }
            String d11 = a.d(this.f94258a);
            if (d11 != null) {
                Log.i("HomeCountryImpl", "homeCountry from settings");
                a.e(this.f94258a);
                zq.a.a(this.f94258a).f(d11);
                this.f94261d.d(d11);
                return null;
            }
            String g11 = zq.a.a(this.f94258a).g();
            if (g11 != null) {
                Log.i("HomeCountryImpl", "homeCountry from sp");
                if (System.currentTimeMillis() - zq.a.a(this.f94258a).h() < zq.a.a(this.f94258a).e()) {
                    Log.i("HomeCountryImpl", "current homeCountry is valid");
                    this.f94261d.d(g11);
                    return null;
                }
            }
            xq.a.b(this.f94261d, this.f94258a, this.f94259b);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final Context f94262a;

        public b(Context context, Handler handler) {
            super(handler);
            this.f94262a = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11, Uri uri) {
            super.onChange(z11, uri);
            Log.d("HomeCountryImpl", "homeCountry changed");
            if (uri.equals(Settings.Secure.getUriFor("appgallery_service_homecountry"))) {
                zq.a.a(this.f94262a).f(a.d(this.f94262a));
            }
        }
    }

    public static k<String> a(Context context, String str, boolean z11) {
        l lVar = new l();
        if (context == null) {
            lVar.c(new Exception("context is null"));
        } else {
            n.f(new CallableC1270a(lVar, context, str, z11));
        }
        return lVar.b();
    }

    public static String d(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "appgallery_service_homecountry");
        } catch (Exception unused) {
            Log.e("HomeCountryImpl", "getHomeCountryBySettings exception");
            return null;
        }
    }

    public static void e(Context context) {
        try {
            context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("appgallery_service_homecountry"), false, new b(context, null));
        } catch (Exception unused) {
            Log.e("HomeCountryImpl", "registerHomeCountryObserver exception");
        }
    }
}
