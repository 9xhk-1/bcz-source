package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2694b = "MediaBrowserCompat";

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2695c = Log.isLoggable(f2694b, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final String f2696d = "android.media.browse.extra.PAGE";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2697e = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2698f = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f2699g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: h, reason: collision with root package name */
    public static final String f2700h = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: i, reason: collision with root package name */
    public static final String f2701i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a, reason: collision with root package name */
    public final e f2702a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d, reason: collision with root package name */
        public final String f2703d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f2704e;

        /* renamed from: f, reason: collision with root package name */
        public final c f2705f;

        public CustomActionResultReceiver(String str, Bundle bundle, c cVar, Handler handler) {
            super(handler);
            this.f2703d = str;
            this.f2704e = bundle;
            this.f2705f = cVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i11, Bundle bundle) {
            if (this.f2705f == null) {
                return;
            }
            MediaSessionCompat.b(bundle);
            if (i11 == -1) {
                this.f2705f.a(this.f2703d, this.f2704e, bundle);
                return;
            }
            if (i11 == 0) {
                this.f2705f.c(this.f2703d, this.f2704e, bundle);
                return;
            }
            if (i11 == 1) {
                this.f2705f.b(this.f2703d, this.f2704e, bundle);
                return;
            }
            Log.w(MediaBrowserCompat.f2694b, "Unknown result code: " + i11 + " (extras=" + this.f2704e + ", resultData=" + bundle + pn.j.f81007d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ItemReceiver extends ResultReceiver {

        /* renamed from: d, reason: collision with root package name */
        public final String f2706d;

        /* renamed from: e, reason: collision with root package name */
        public final d f2707e;

        public ItemReceiver(String str, d dVar, Handler handler) {
            super(handler);
            this.f2706d = str;
            this.f2707e = dVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i11, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i11 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.f2707e.a(this.f2706d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f2707e.b((MediaItem) parcelable);
            } else {
                this.f2707e.a(this.f2706d);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d, reason: collision with root package name */
        public final String f2712d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f2713e;

        /* renamed from: f, reason: collision with root package name */
        public final k f2714f;

        public SearchResultReceiver(String str, Bundle bundle, k kVar, Handler handler) {
            super(handler);
            this.f2712d = str;
            this.f2713e = bundle;
            this.f2714f = kVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i11, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.b(bundle);
            if (i11 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.f2714f.a(this.f2712d, this.f2713e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            } else {
                arrayList = null;
            }
            this.f2714f.b(this.f2712d, this.f2713e, arrayList);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<j> f2715a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<Messenger> f2716b;

        public a(j jVar) {
            this.f2715a = new WeakReference<>(jVar);
        }

        public void a(Messenger messenger) {
            this.f2716b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f2716b;
            if (weakReference == null || weakReference.get() == null || this.f2715a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.b(data);
            j jVar = this.f2715a.get();
            Messenger messenger = this.f2716b.get();
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.b(bundle);
                    jVar.j(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    return;
                }
                if (i11 == 2) {
                    jVar.h(messenger);
                    return;
                }
                if (i11 == 3) {
                    Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.b(bundle2);
                    Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                    MediaSessionCompat.b(bundle3);
                    jVar.i(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    return;
                }
                Log.w(MediaBrowserCompat.f2694b, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } catch (BadParcelableException unused) {
                Log.e(MediaBrowserCompat.f2694b, "Could not unparcel the data.");
                if (message.what == 1) {
                    jVar.h(messenger);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        @NonNull
        MediaSessionCompat.Token a();

        void d(@NonNull String str, Bundle bundle, @Nullable c cVar);

        void disconnect();

        void e();

        void f(@NonNull String str, Bundle bundle, @NonNull k kVar);

        ComponentName g();

        @Nullable
        Bundle getExtras();

        @NonNull
        String getRoot();

        boolean isConnected();

        void k(@NonNull String str, @NonNull d dVar);

        void l(@NonNull String str, @Nullable Bundle bundle, @NonNull n nVar);

        void m(@NonNull String str, n nVar);

        @Nullable
        Bundle n();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class g extends f {
        public g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void k(@NonNull String str, @NonNull d dVar) {
            if (this.f2726g == null) {
                android.support.v4.media.b.b(this.f2721b, str, dVar.f2718a);
            } else {
                super.k(str, dVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class h extends g {
        public h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void l(@NonNull String str, @Nullable Bundle bundle, @NonNull n nVar) {
            if (this.f2726g != null && this.f2725f >= 2) {
                super.l(str, bundle, nVar);
            } else if (bundle == null) {
                android.support.v4.media.a.k(this.f2721b, str, nVar.f2800a);
            } else {
                android.support.v4.media.c.b(this.f2721b, str, bundle, nVar.f2800a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void m(@NonNull String str, n nVar) {
            if (this.f2726g != null && this.f2725f >= 2) {
                super.m(str, nVar);
            } else if (nVar == null) {
                android.support.v4.media.a.l(this.f2721b, str);
            } else {
                android.support.v4.media.c.c(this.f2721b, str, nVar.f2800a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements e, j {

        /* renamed from: o, reason: collision with root package name */
        public static final int f2755o = 0;

        /* renamed from: p, reason: collision with root package name */
        public static final int f2756p = 1;

        /* renamed from: q, reason: collision with root package name */
        public static final int f2757q = 2;

        /* renamed from: r, reason: collision with root package name */
        public static final int f2758r = 3;

        /* renamed from: s, reason: collision with root package name */
        public static final int f2759s = 4;

        /* renamed from: a, reason: collision with root package name */
        public final Context f2760a;

        /* renamed from: b, reason: collision with root package name */
        public final ComponentName f2761b;

        /* renamed from: c, reason: collision with root package name */
        public final b f2762c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f2763d;

        /* renamed from: e, reason: collision with root package name */
        public final a f2764e = new a(this);

        /* renamed from: f, reason: collision with root package name */
        public final ArrayMap<String, m> f2765f = new ArrayMap<>();

        /* renamed from: g, reason: collision with root package name */
        public int f2766g = 1;

        /* renamed from: h, reason: collision with root package name */
        public g f2767h;

        /* renamed from: i, reason: collision with root package name */
        public l f2768i;

        /* renamed from: j, reason: collision with root package name */
        public Messenger f2769j;

        /* renamed from: k, reason: collision with root package name */
        public String f2770k;

        /* renamed from: l, reason: collision with root package name */
        public MediaSessionCompat.Token f2771l;

        /* renamed from: m, reason: collision with root package name */
        public Bundle f2772m;

        /* renamed from: n, reason: collision with root package name */
        public Bundle f2773n;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z11;
                i iVar = i.this;
                if (iVar.f2766g == 0) {
                    return;
                }
                iVar.f2766g = 2;
                if (MediaBrowserCompat.f2695c && iVar.f2767h != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + i.this.f2767h);
                }
                if (iVar.f2768i != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + i.this.f2768i);
                }
                if (iVar.f2769j != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + i.this.f2769j);
                }
                Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                intent.setComponent(i.this.f2761b);
                i iVar2 = i.this;
                iVar2.f2767h = iVar2.new g();
                try {
                    i iVar3 = i.this;
                    z11 = iVar3.f2760a.bindService(intent, iVar3.f2767h, 1);
                } catch (Exception unused) {
                    Log.e(MediaBrowserCompat.f2694b, "Failed binding to service " + i.this.f2761b);
                    z11 = false;
                }
                if (!z11) {
                    i.this.c();
                    i.this.f2762c.onConnectionFailed();
                }
                if (MediaBrowserCompat.f2695c) {
                    Log.d(MediaBrowserCompat.f2694b, "connect...");
                    i.this.b();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.f2769j;
                if (messenger != null) {
                    try {
                        iVar.f2768i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserCompat.f2694b, "RemoteException during connect for " + i.this.f2761b);
                    }
                }
                i iVar2 = i.this;
                int i11 = iVar2.f2766g;
                iVar2.c();
                if (i11 != 0) {
                    i.this.f2766g = i11;
                }
                if (MediaBrowserCompat.f2695c) {
                    Log.d(MediaBrowserCompat.f2694b, "disconnect...");
                    i.this.b();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2776a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2777b;

            public c(d dVar, String str) {
                this.f2776a = dVar;
                this.f2777b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2776a.a(this.f2777b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2779a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2780b;

            public d(d dVar, String str) {
                this.f2779a = dVar;
                this.f2780b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2779a.a(this.f2780b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f2782a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2783b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2784c;

            public e(k kVar, String str, Bundle bundle) {
                this.f2782a = kVar;
                this.f2783b = str;
                this.f2784c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2782a.a(this.f2783b, this.f2784c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f2786a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2787b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2788c;

            public f(c cVar, String str, Bundle bundle) {
                this.f2786a = cVar;
                this.f2787b = str;
                this.f2788c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2786a.a(this.f2787b, this.f2788c, null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class g implements ServiceConnection {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ComponentName f2791a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IBinder f2792b;

                public a(ComponentName componentName, IBinder iBinder) {
                    this.f2791a = componentName;
                    this.f2792b = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z11 = MediaBrowserCompat.f2695c;
                    if (z11) {
                        Log.d(MediaBrowserCompat.f2694b, "MediaServiceConnection.onServiceConnected name=" + this.f2791a + " binder=" + this.f2792b);
                        i.this.b();
                    }
                    if (g.this.a("onServiceConnected")) {
                        i iVar = i.this;
                        iVar.f2768i = new l(this.f2792b, iVar.f2763d);
                        i.this.f2769j = new Messenger(i.this.f2764e);
                        i iVar2 = i.this;
                        iVar2.f2764e.a(iVar2.f2769j);
                        i.this.f2766g = 2;
                        if (z11) {
                            try {
                                Log.d(MediaBrowserCompat.f2694b, "ServiceCallbacks.onConnect...");
                                i.this.b();
                            } catch (RemoteException unused) {
                                Log.w(MediaBrowserCompat.f2694b, "RemoteException during connect for " + i.this.f2761b);
                                if (MediaBrowserCompat.f2695c) {
                                    Log.d(MediaBrowserCompat.f2694b, "ServiceCallbacks.onConnect...");
                                    i.this.b();
                                    return;
                                }
                                return;
                            }
                        }
                        i iVar3 = i.this;
                        iVar3.f2768i.b(iVar3.f2760a, iVar3.f2769j);
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class b implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ComponentName f2794a;

                public b(ComponentName componentName) {
                    this.f2794a = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f2695c) {
                        Log.d(MediaBrowserCompat.f2694b, "MediaServiceConnection.onServiceDisconnected name=" + this.f2794a + " this=" + this + " mServiceConnection=" + i.this.f2767h);
                        i.this.b();
                    }
                    if (g.this.a("onServiceDisconnected")) {
                        i iVar = i.this;
                        iVar.f2768i = null;
                        iVar.f2769j = null;
                        iVar.f2764e.a(null);
                        i iVar2 = i.this;
                        iVar2.f2766g = 4;
                        iVar2.f2762c.onConnectionSuspended();
                    }
                }
            }

            public g() {
            }

            public boolean a(String str) {
                int i11;
                i iVar = i.this;
                if (iVar.f2767h == this && (i11 = iVar.f2766g) != 0 && i11 != 1) {
                    return true;
                }
                int i12 = iVar.f2766g;
                if (i12 == 0 || i12 == 1) {
                    return false;
                }
                Log.i(MediaBrowserCompat.f2694b, str + " for " + i.this.f2761b + " with mServiceConnection=" + i.this.f2767h + " this=" + this);
                return false;
            }

            public final void b(Runnable runnable) {
                if (Thread.currentThread() == i.this.f2764e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.f2764e.post(runnable);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (bVar == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f2760a = context;
            this.f2761b = componentName;
            this.f2762c = bVar;
            this.f2763d = bundle == null ? null : new Bundle(bundle);
        }

        public static String o(int i11) {
            if (i11 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i11 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i11 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i11 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i11 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i11;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @NonNull
        public MediaSessionCompat.Token a() {
            if (isConnected()) {
                return this.f2771l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f2766g + pn.j.f81007d);
        }

        public void b() {
            Log.d(MediaBrowserCompat.f2694b, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.f2694b, "  mServiceComponent=" + this.f2761b);
            Log.d(MediaBrowserCompat.f2694b, "  mCallback=" + this.f2762c);
            Log.d(MediaBrowserCompat.f2694b, "  mRootHints=" + this.f2763d);
            Log.d(MediaBrowserCompat.f2694b, "  mState=" + o(this.f2766g));
            Log.d(MediaBrowserCompat.f2694b, "  mServiceConnection=" + this.f2767h);
            Log.d(MediaBrowserCompat.f2694b, "  mServiceBinderWrapper=" + this.f2768i);
            Log.d(MediaBrowserCompat.f2694b, "  mCallbacksMessenger=" + this.f2769j);
            Log.d(MediaBrowserCompat.f2694b, "  mRootId=" + this.f2770k);
            Log.d(MediaBrowserCompat.f2694b, "  mMediaSessionToken=" + this.f2771l);
        }

        public void c() {
            g gVar = this.f2767h;
            if (gVar != null) {
                this.f2760a.unbindService(gVar);
            }
            this.f2766g = 1;
            this.f2767h = null;
            this.f2768i = null;
            this.f2769j = null;
            this.f2764e.a(null);
            this.f2770k = null;
            this.f2771l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void d(@NonNull String str, Bundle bundle, @Nullable c cVar) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            try {
                this.f2768i.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f2764e), this.f2769j);
            } catch (RemoteException e11) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e11);
                if (cVar != null) {
                    this.f2764e.post(new f(cVar, str, bundle));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            this.f2766g = 0;
            this.f2764e.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void e() {
            int i11 = this.f2766g;
            if (i11 == 0 || i11 == 1) {
                this.f2766g = 2;
                this.f2764e.post(new a());
            } else {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + o(this.f2766g) + pn.j.f81007d);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f(@NonNull String str, Bundle bundle, @NonNull k kVar) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected (state=" + o(this.f2766g) + pn.j.f81007d);
            }
            try {
                this.f2768i.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f2764e), this.f2769j);
            } catch (RemoteException e11) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error searching items with query: " + str, e11);
                this.f2764e.post(new e(kVar, str, bundle));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @NonNull
        public ComponentName g() {
            if (isConnected()) {
                return this.f2761b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f2766g + pn.j.f81007d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @Nullable
        public Bundle getExtras() {
            if (isConnected()) {
                return this.f2772m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + o(this.f2766g) + pn.j.f81007d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @NonNull
        public String getRoot() {
            if (isConnected()) {
                return this.f2770k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + o(this.f2766g) + pn.j.f81007d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void h(Messenger messenger) {
            Log.e(MediaBrowserCompat.f2694b, "onConnectFailed for " + this.f2761b);
            if (p(messenger, "onConnectFailed")) {
                if (this.f2766g == 2) {
                    c();
                    this.f2762c.onConnectionFailed();
                    return;
                }
                Log.w(MediaBrowserCompat.f2694b, "onConnect from service while mState=" + o(this.f2766g) + "... ignoring");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (p(messenger, "onLoadChildren")) {
                boolean z11 = MediaBrowserCompat.f2695c;
                if (z11) {
                    Log.d(MediaBrowserCompat.f2694b, "onLoadChildren for " + this.f2761b + " id=" + str);
                }
                m mVar = this.f2765f.get(str);
                if (mVar == null) {
                    if (z11) {
                        Log.d(MediaBrowserCompat.f2694b, "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                n a11 = mVar.a(bundle);
                if (a11 != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a11.c(str);
                            return;
                        }
                        this.f2773n = bundle2;
                        a11.a(str, list);
                        this.f2773n = null;
                        return;
                    }
                    if (list == null) {
                        a11.d(str, bundle);
                        return;
                    }
                    this.f2773n = bundle2;
                    a11.b(str, list, bundle);
                    this.f2773n = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean isConnected() {
            return this.f2766g == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (p(messenger, "onConnect")) {
                if (this.f2766g != 2) {
                    Log.w(MediaBrowserCompat.f2694b, "onConnect from service while mState=" + o(this.f2766g) + "... ignoring");
                    return;
                }
                this.f2770k = str;
                this.f2771l = token;
                this.f2772m = bundle;
                this.f2766g = 3;
                if (MediaBrowserCompat.f2695c) {
                    Log.d(MediaBrowserCompat.f2694b, "ServiceCallbacks.onConnect...");
                    b();
                }
                this.f2762c.onConnected();
                try {
                    for (Map.Entry<String, m> entry : this.f2765f.entrySet()) {
                        String key = entry.getKey();
                        m value = entry.getValue();
                        List<n> b11 = value.b();
                        List<Bundle> c11 = value.c();
                        for (int i11 = 0; i11 < b11.size(); i11++) {
                            this.f2768i.a(key, b11.get(i11).f2801b, c11.get(i11), this.f2769j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f2694b, "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void k(@NonNull String str, @NonNull d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!isConnected()) {
                Log.i(MediaBrowserCompat.f2694b, "Not connected, unable to retrieve the MediaItem.");
                this.f2764e.post(new c(dVar, str));
                return;
            }
            try {
                this.f2768i.d(str, new ItemReceiver(str, dVar, this.f2764e), this.f2769j);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error getting media item: " + str);
                this.f2764e.post(new d(dVar, str));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void l(@NonNull String str, Bundle bundle, @NonNull n nVar) {
            m mVar = this.f2765f.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f2765f.put(str, mVar);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.e(bundle2, nVar);
            if (isConnected()) {
                try {
                    this.f2768i.a(str, nVar.f2801b, bundle2, this.f2769j);
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f2694b, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void m(@NonNull String str, n nVar) {
            m mVar = this.f2765f.get(str);
            if (mVar == null) {
                return;
            }
            try {
                if (nVar != null) {
                    List<n> b11 = mVar.b();
                    List<Bundle> c11 = mVar.c();
                    for (int size = b11.size() - 1; size >= 0; size--) {
                        if (b11.get(size) == nVar) {
                            if (isConnected()) {
                                this.f2768i.f(str, nVar.f2801b, this.f2769j);
                            }
                            b11.remove(size);
                            c11.remove(size);
                        }
                    }
                } else if (isConnected()) {
                    this.f2768i.f(str, null, this.f2769j);
                }
            } catch (RemoteException unused) {
                Log.d(MediaBrowserCompat.f2694b, "removeSubscription failed with RemoteException parentId=" + str);
            }
            if (mVar.d() || nVar == null) {
                this.f2765f.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle n() {
            return this.f2773n;
        }

        public final boolean p(Messenger messenger, String str) {
            int i11;
            if (this.f2769j == messenger && (i11 = this.f2766g) != 0 && i11 != 1) {
                return true;
            }
            int i12 = this.f2766g;
            if (i12 == 0 || i12 == 1) {
                return false;
            }
            Log.i(MediaBrowserCompat.f2694b, str + " for " + this.f2761b + " with mCallbacksMessenger=" + this.f2769j + " this=" + this);
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        void h(Messenger messenger);

        void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public Messenger f2796a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f2797b;

        public l(IBinder iBinder, Bundle bundle) {
            this.f2796a = new Messenger(iBinder);
            this.f2797b = bundle;
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle2, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            i(3, bundle2, messenger);
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f2797b);
            i(1, bundle, messenger);
        }

        public void c(Messenger messenger) throws RemoteException {
            i(2, null, messenger);
        }

        public void d(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            i(5, bundle, messenger);
        }

        public void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f2797b);
            i(6, bundle, messenger);
        }

        public void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            BundleCompat.putBinder(bundle, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            i(4, bundle, messenger);
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_SEARCH_QUERY, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            i(8, bundle2, messenger);
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_CUSTOM_ACTION, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            i(9, bundle2, messenger);
        }

        public final void i(int i11, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i11;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f2796a.send(obtain);
        }

        public void j(Messenger messenger) throws RemoteException {
            i(7, null, messenger);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public final List<n> f2798a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List<Bundle> f2799b = new ArrayList();

        public n a(Bundle bundle) {
            for (int i11 = 0; i11 < this.f2799b.size(); i11++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f2799b.get(i11), bundle)) {
                    return this.f2798a.get(i11);
                }
            }
            return null;
        }

        public List<n> b() {
            return this.f2798a;
        }

        public List<Bundle> c() {
            return this.f2799b;
        }

        public boolean d() {
            return this.f2798a.isEmpty();
        }

        public void e(Bundle bundle, n nVar) {
            for (int i11 = 0; i11 < this.f2799b.size(); i11++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f2799b.get(i11), bundle)) {
                    this.f2798a.set(i11, nVar);
                    return;
                }
            }
            this.f2798a.add(nVar);
            this.f2799b.add(bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2702a = new h(context, componentName, bVar, bundle);
        } else {
            this.f2702a = new g(context, componentName, bVar, bundle);
        }
    }

    public void a() {
        this.f2702a.e();
    }

    public void b() {
        this.f2702a.disconnect();
    }

    @Nullable
    public Bundle c() {
        return this.f2702a.getExtras();
    }

    public void d(@NonNull String str, @NonNull d dVar) {
        this.f2702a.k(str, dVar);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle e() {
        return this.f2702a.n();
    }

    @NonNull
    public String f() {
        return this.f2702a.getRoot();
    }

    @NonNull
    public ComponentName g() {
        return this.f2702a.g();
    }

    @NonNull
    public MediaSessionCompat.Token h() {
        return this.f2702a.a();
    }

    public boolean i() {
        return this.f2702a.isConnected();
    }

    public void j(@NonNull String str, Bundle bundle, @NonNull k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f2702a.f(str, bundle, kVar);
    }

    public void k(@NonNull String str, Bundle bundle, @Nullable c cVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.f2702a.d(str, bundle, cVar);
    }

    public void l(@NonNull String str, @NonNull Bundle bundle, @NonNull n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.f2702a.l(str, bundle, nVar);
    }

    public void m(@NonNull String str, @NonNull n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f2702a.l(str, null, nVar);
    }

    public void n(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f2702a.m(str, null);
    }

    public void o(@NonNull String str, @NonNull n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f2702a.m(str, nVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f2708c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f2709d = 2;

        /* renamed from: a, reason: collision with root package name */
        public final int f2710a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaDescriptionCompat f2711b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i11) {
                return new MediaItem[i11];
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface b {
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i11) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.h())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f2710a = i11;
            this.f2711b = mediaDescriptionCompat;
        }

        public static MediaItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.a(a.c.a(obj)), a.c.b(obj));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        @NonNull
        public MediaDescriptionCompat c() {
            return this.f2711b;
        }

        public int d() {
            return this.f2710a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public String e() {
            return this.f2711b.h();
        }

        public boolean g() {
            return (this.f2710a & 1) != 0;
        }

        public boolean h() {
            return (this.f2710a & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f2710a + ", mDescription=" + this.f2711b + l50.b.f69928j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f2710a);
            this.f2711b.writeToParcel(parcel, i11);
        }

        public MediaItem(Parcel parcel) {
            this.f2710a = parcel.readInt();
            this.f2711b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {
        a mConnectionCallbackInternal;
        final Object mConnectionCallbackObj = android.support.v4.media.a.c(new C0025b());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface a {
            void b();

            void c();

            void onConnected();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        public class C0025b implements a.InterfaceC0027a {
            public C0025b() {
            }

            @Override // android.support.v4.media.a.InterfaceC0027a
            public void b() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.b();
                }
                b.this.onConnectionSuspended();
            }

            @Override // android.support.v4.media.a.InterfaceC0027a
            public void c() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.c();
                }
                b.this.onConnectionFailed();
            }

            @Override // android.support.v4.media.a.InterfaceC0027a
            public void onConnected() {
                a aVar = b.this.mConnectionCallbackInternal;
                if (aVar != null) {
                    aVar.onConnected();
                }
                b.this.onConnected();
            }
        }

        public void setInternalConnectionCallback(a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class f implements e, j, b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2720a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f2721b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f2722c;

        /* renamed from: d, reason: collision with root package name */
        public final a f2723d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        public final ArrayMap<String, m> f2724e = new ArrayMap<>();

        /* renamed from: f, reason: collision with root package name */
        public int f2725f;

        /* renamed from: g, reason: collision with root package name */
        public l f2726g;

        /* renamed from: h, reason: collision with root package name */
        public Messenger f2727h;

        /* renamed from: i, reason: collision with root package name */
        public MediaSessionCompat.Token f2728i;

        /* renamed from: j, reason: collision with root package name */
        public Bundle f2729j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2730a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2731b;

            public a(d dVar, String str) {
                this.f2730a = dVar;
                this.f2731b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2730a.a(this.f2731b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2733a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2734b;

            public b(d dVar, String str) {
                this.f2733a = dVar;
                this.f2734b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2733a.a(this.f2734b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f2736a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2737b;

            public c(d dVar, String str) {
                this.f2736a = dVar;
                this.f2737b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2736a.a(this.f2737b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f2739a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2740b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2741c;

            public d(k kVar, String str, Bundle bundle) {
                this.f2739a = kVar;
                this.f2740b = str;
                this.f2741c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2739a.a(this.f2740b, this.f2741c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f2743a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2744b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2745c;

            public e(k kVar, String str, Bundle bundle) {
                this.f2743a = kVar;
                this.f2744b = str;
                this.f2745c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2743a.a(this.f2744b, this.f2745c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f, reason: collision with other inner class name */
        public class RunnableC0026f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f2747a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2748b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2749c;

            public RunnableC0026f(c cVar, String str, Bundle bundle) {
                this.f2747a = cVar;
                this.f2748b = str;
                this.f2749c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2747a.a(this.f2748b, this.f2749c, null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f2751a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2752b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f2753c;

            public g(c cVar, String str, Bundle bundle) {
                this.f2751a = cVar;
                this.f2752b = str;
                this.f2753c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2751a.a(this.f2752b, this.f2753c, null);
            }
        }

        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f2720a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f2722c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.f2721b = android.support.v4.media.a.b(context, componentName, bVar.mConnectionCallbackObj, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @NonNull
        public MediaSessionCompat.Token a() {
            if (this.f2728i == null) {
                this.f2728i = MediaSessionCompat.Token.b(android.support.v4.media.a.i(this.f2721b));
            }
            return this.f2728i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void b() {
            this.f2726g = null;
            this.f2727h = null;
            this.f2728i = null;
            this.f2723d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void d(@NonNull String str, Bundle bundle, @Nullable c cVar) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            if (this.f2726g == null) {
                Log.i(MediaBrowserCompat.f2694b, "The connected service doesn't support sendCustomAction.");
                if (cVar != null) {
                    this.f2723d.post(new RunnableC0026f(cVar, str, bundle));
                }
            }
            try {
                this.f2726g.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f2723d), this.f2727h);
            } catch (RemoteException e11) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e11);
                if (cVar != null) {
                    this.f2723d.post(new g(cVar, str, bundle));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void disconnect() {
            Messenger messenger;
            l lVar = this.f2726g;
            if (lVar != null && (messenger = this.f2727h) != null) {
                try {
                    lVar.j(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f2694b, "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.a.e(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void e() {
            android.support.v4.media.a.a(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f(@NonNull String str, Bundle bundle, @NonNull k kVar) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.f2726g == null) {
                Log.i(MediaBrowserCompat.f2694b, "The connected service doesn't support search.");
                this.f2723d.post(new d(kVar, str, bundle));
                return;
            }
            try {
                this.f2726g.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f2723d), this.f2727h);
            } catch (RemoteException e11) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error searching items with query: " + str, e11);
                this.f2723d.post(new e(kVar, str, bundle));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public ComponentName g() {
            return android.support.v4.media.a.h(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @Nullable
        public Bundle getExtras() {
            return android.support.v4.media.a.f(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @NonNull
        public String getRoot() {
            return android.support.v4.media.a.g(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f2727h != messenger) {
                return;
            }
            m mVar = this.f2724e.get(str);
            if (mVar == null) {
                if (MediaBrowserCompat.f2695c) {
                    Log.d(MediaBrowserCompat.f2694b, "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            n a11 = mVar.a(bundle);
            if (a11 != null) {
                if (bundle == null) {
                    if (list == null) {
                        a11.c(str);
                        return;
                    }
                    this.f2729j = bundle2;
                    a11.a(str, list);
                    this.f2729j = null;
                    return;
                }
                if (list == null) {
                    a11.d(str, bundle);
                    return;
                }
                this.f2729j = bundle2;
                a11.b(str, list, bundle);
                this.f2729j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean isConnected() {
            return android.support.v4.media.a.j(this.f2721b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void k(@NonNull String str, @NonNull d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!android.support.v4.media.a.j(this.f2721b)) {
                Log.i(MediaBrowserCompat.f2694b, "Not connected, unable to retrieve the MediaItem.");
                this.f2723d.post(new a(dVar, str));
                return;
            }
            if (this.f2726g == null) {
                this.f2723d.post(new b(dVar, str));
                return;
            }
            try {
                this.f2726g.d(str, new ItemReceiver(str, dVar, this.f2723d), this.f2727h);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error getting media item: " + str);
                this.f2723d.post(new c(dVar, str));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void l(@NonNull String str, Bundle bundle, @NonNull n nVar) {
            m mVar = this.f2724e.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f2724e.put(str, mVar);
            }
            nVar.e(mVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.e(bundle2, nVar);
            l lVar = this.f2726g;
            if (lVar == null) {
                android.support.v4.media.a.k(this.f2721b, str, nVar.f2800a);
                return;
            }
            try {
                lVar.a(str, nVar.f2801b, bundle2, this.f2727h);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.f2694b, "Remote error subscribing media item: " + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void m(@NonNull String str, n nVar) {
            m mVar = this.f2724e.get(str);
            if (mVar == null) {
                return;
            }
            l lVar = this.f2726g;
            if (lVar != null) {
                try {
                    if (nVar == null) {
                        lVar.f(str, null, this.f2727h);
                    } else {
                        List<n> b11 = mVar.b();
                        List<Bundle> c11 = mVar.c();
                        for (int size = b11.size() - 1; size >= 0; size--) {
                            if (b11.get(size) == nVar) {
                                this.f2726g.f(str, nVar.f2801b, this.f2727h);
                                b11.remove(size);
                                c11.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f2694b, "removeSubscription failed with RemoteException parentId=" + str);
                }
            } else if (nVar == null) {
                android.support.v4.media.a.l(this.f2721b, str);
            } else {
                List<n> b12 = mVar.b();
                List<Bundle> c12 = mVar.c();
                for (int size2 = b12.size() - 1; size2 >= 0; size2--) {
                    if (b12.get(size2) == nVar) {
                        b12.remove(size2);
                        c12.remove(size2);
                    }
                }
                if (b12.size() == 0) {
                    android.support.v4.media.a.l(this.f2721b, str);
                }
            }
            if (mVar.d() || nVar == null) {
                this.f2724e.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle n() {
            return this.f2729j;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void onConnected() {
            Bundle f11 = android.support.v4.media.a.f(this.f2721b);
            if (f11 == null) {
                return;
            }
            this.f2725f = f11.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(f11, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f2726g = new l(binder, this.f2722c);
                Messenger messenger = new Messenger(this.f2723d);
                this.f2727h = messenger;
                this.f2723d.a(messenger);
                try {
                    this.f2726g.e(this.f2720a, this.f2727h);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f2694b, "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b x02 = b.a.x0(BundleCompat.getBinder(f11, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (x02 != null) {
                this.f2728i = MediaSessionCompat.Token.c(android.support.v4.media.a.i(this.f2721b), x02);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void h(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2718a = android.support.v4.media.b.a(new a());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements b.a {
            public a() {
            }

            @Override // android.support.v4.media.b.a
            public void a(Parcel parcel) {
                if (parcel == null) {
                    d.this.b(null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem createFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                d.this.b(createFromParcel);
            }

            @Override // android.support.v4.media.b.a
            public void onError(@NonNull String str) {
                d.this.a(str);
            }
        }

        public void a(@NonNull String str) {
        }

        public void b(MediaItem mediaItem) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2800a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f2801b = new Binder();

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<m> f2802c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a.d {
            public a() {
            }

            @Override // android.support.v4.media.a.d
            public void a(@NonNull String str, List<?> list) {
                WeakReference<m> weakReference = n.this.f2802c;
                m mVar = weakReference == null ? null : weakReference.get();
                if (mVar == null) {
                    n.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b11 = MediaItem.b(list);
                List<n> b12 = mVar.b();
                List<Bundle> c11 = mVar.c();
                for (int i11 = 0; i11 < b12.size(); i11++) {
                    Bundle bundle = c11.get(i11);
                    if (bundle == null) {
                        n.this.a(str, b11);
                    } else {
                        n.this.b(str, d(b11, bundle), bundle);
                    }
                }
            }

            public List<MediaItem> d(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i11 = bundle.getInt(MediaBrowserCompat.f2696d, -1);
                int i12 = bundle.getInt(MediaBrowserCompat.f2697e, -1);
                if (i11 == -1 && i12 == -1) {
                    return list;
                }
                int i13 = i12 * i11;
                int i14 = i13 + i12;
                if (i11 < 0 || i12 < 1 || i13 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (i14 > list.size()) {
                    i14 = list.size();
                }
                return list.subList(i13, i14);
            }

            @Override // android.support.v4.media.a.d
            public void onError(@NonNull String str) {
                n.this.c(str);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends a implements c.a {
            public b() {
                super();
            }

            @Override // android.support.v4.media.c.a
            public void b(@NonNull String str, @NonNull Bundle bundle) {
                n.this.d(str, bundle);
            }

            @Override // android.support.v4.media.c.a
            public void c(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                n.this.b(str, MediaItem.b(list), bundle);
            }
        }

        public n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2800a = android.support.v4.media.c.a(new b());
            } else {
                this.f2800a = android.support.v4.media.a.d(new a());
            }
        }

        public void e(m mVar) {
            this.f2802c = new WeakReference<>(mVar);
        }

        public void c(@NonNull String str) {
        }

        public void a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        public void d(@NonNull String str, @NonNull Bundle bundle) {
        }

        public void b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class k {
        public void a(@NonNull String str, Bundle bundle) {
        }

        public void b(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }
}
