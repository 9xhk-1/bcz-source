package rf;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import rf.h;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f83975g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f83976h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final String f83977i = h.class.getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    public static final int f83978j = 44100;

    /* renamed from: k, reason: collision with root package name */
    public static final int f83979k = 128000;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public b f83980a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public MediaRecorder f83981b;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public String f83983d;

    /* renamed from: e, reason: collision with root package name */
    public int f83984e;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f83982c = Executors.newSingleThreadExecutor();

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public d f83985f = d.f83997a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static final Float f(File file, Context context) {
            Float valueOf;
            Uri parse = Uri.parse(file.getPath());
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, parse);
                valueOf = null;
            } catch (Exception e11) {
                Log.e(h.f83977i, "getAudioDuration: " + e11);
                valueOf = Float.valueOf(0.0f);
            }
            if (valueOf == null) {
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                valueOf = extractMetadata != null ? Float.valueOf(Float.parseFloat(extractMetadata)) : null;
            }
            return Float.valueOf(valueOf != null ? valueOf.floatValue() : 0.0f);
        }

        public static final g2 g(x00.l lVar, Float f11) {
            g0.m(f11);
            lVar.invoke(f11);
            return g2.f100423a;
        }

        public static final void h(x00.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        public static final void i(Throwable th2) {
            qb.c.c(h.f83977i, "", th2);
        }

        public final void e(@m80.k final Context context, @m80.l final File file, @m80.k final x00.l<? super Float, g2> dur) {
            g0.p(context, "context");
            g0.p(dur, "dur");
            if (file == null || !file.exists()) {
                dur.invoke(Float.valueOf(-1.0f));
                return;
            }
            rx.c I3 = rx.c.z2(new Callable() { // from class: rf.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Float f11;
                    f11 = h.a.f(file, context);
                    return f11;
                }
            }).w5(bc0.c.e()).I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: rf.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 g11;
                    g11 = h.a.g(x00.l.this, (Float) obj);
                    return g11;
                }
            };
            I3.u5(new wb0.b() { // from class: rf.f
                @Override // wb0.b
                public final void call(Object obj) {
                    h.a.h(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: rf.g
                @Override // wb0.b
                public final void call(Object obj) {
                    h.a.i((Throwable) obj);
                }
            });
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f83986a = a.f83991a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f83987b = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f83988c = -2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f83989d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f83990e = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f83991a = new a();

            /* renamed from: b, reason: collision with root package name */
            public static final int f83992b = -1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f83993c = -2;

            /* renamed from: d, reason: collision with root package name */
            public static final int f83994d = 0;

            /* renamed from: e, reason: collision with root package name */
            public static final int f83995e = 1;
        }

        void a();

        void b();

        void c(int i11);

        void d(@m80.k byte[] bArr, int i11);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f83997a = new d("IDLE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f83998b = new d("STARTING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f83999c = new d("STARTED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f84000d = new d("STOPPING", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f84001e = new d("STOPPED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f84002f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ m00.a f84003g;

        static {
            d[] a11 = a();
            f84002f = a11;
            f84003g = m00.c.c(a11);
        }

        public d(String str, int i11) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{f83997a, f83998b, f83999c, f84000d, f84001e};
        }

        @m80.k
        public static m00.a<d> b() {
            return f84003g;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f84002f.clone();
        }
    }

    public static /* synthetic */ void f(h hVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = hVar.f83984e;
        }
        hVar.e(i11);
    }

    public static /* synthetic */ void i(h hVar, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        hVar.h(str, i11, z11);
    }

    public static final void j(final h hVar, int i11) {
        MediaRecorder mediaRecorder;
        try {
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            hVar.f83981b = mediaRecorder2;
            mediaRecorder2.setAudioSource(1);
            MediaRecorder mediaRecorder3 = hVar.f83981b;
            if (mediaRecorder3 != null) {
                mediaRecorder3.setOutputFormat(2);
            }
            MediaRecorder mediaRecorder4 = hVar.f83981b;
            if (mediaRecorder4 != null) {
                mediaRecorder4.setAudioEncoder(3);
            }
            MediaRecorder mediaRecorder5 = hVar.f83981b;
            if (mediaRecorder5 != null) {
                mediaRecorder5.setAudioSamplingRate(44100);
            }
            MediaRecorder mediaRecorder6 = hVar.f83981b;
            if (mediaRecorder6 != null) {
                mediaRecorder6.setAudioEncodingBitRate(f83979k);
            }
            MediaRecorder mediaRecorder7 = hVar.f83981b;
            if (mediaRecorder7 != null) {
                mediaRecorder7.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: rf.b
                    @Override // android.media.MediaRecorder.OnInfoListener
                    public final void onInfo(MediaRecorder mediaRecorder8, int i12, int i13) {
                        h.k(h.this, mediaRecorder8, i12, i13);
                    }
                });
            }
            MediaRecorder mediaRecorder8 = hVar.f83981b;
            if (mediaRecorder8 != null) {
                mediaRecorder8.setOutputFile(hVar.f83983d);
            }
            String str = hVar.f83983d;
            g0.m(str);
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (i11 != 0 && (mediaRecorder = hVar.f83981b) != null) {
                mediaRecorder.setMaxDuration(i11);
            }
            MediaRecorder mediaRecorder9 = hVar.f83981b;
            if (mediaRecorder9 != null) {
                mediaRecorder9.prepare();
            }
            MediaRecorder mediaRecorder10 = hVar.f83981b;
            if (mediaRecorder10 != null) {
                mediaRecorder10.start();
            }
            b bVar = hVar.f83980a;
            if (bVar != null) {
                bVar.b();
            }
            hVar.f83985f = d.f83999c;
            qb.c.b(f83977i, "started", new Object[0]);
        } catch (Exception e11) {
            qb.c.d(f83977i, String.valueOf(e11), new Object[0]);
            hVar.e(e11 instanceof IOException ? -2 : -1);
        }
    }

    public static final void k(h hVar, MediaRecorder mediaRecorder, int i11, int i12) {
        if (i11 == 800 || i11 == 801) {
            hVar.f83984e = 1;
            hVar.l();
        }
    }

    public static final void m(h hVar) {
        try {
            try {
                String str = f83977i;
                qb.c.b(str, "stopping running", new Object[0]);
                MediaRecorder mediaRecorder = hVar.f83981b;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = hVar.f83981b;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.release();
                }
                hVar.f83985f = d.f84001e;
                f(hVar, 0, 1, null);
                qb.c.b(str, "stopped", new Object[0]);
            } catch (Exception e11) {
                String str2 = f83977i;
                qb.c.d(str2, "error: " + e11, new Object[0]);
                hVar.e(-1);
                qb.c.b(str2, "stopped", new Object[0]);
            }
        } catch (Throwable th2) {
            qb.c.b(f83977i, "stopped", new Object[0]);
            throw th2;
        }
    }

    public final void e(int i11) {
        b bVar = this.f83980a;
        if (bVar != null) {
            bVar.a();
        }
        b bVar2 = this.f83980a;
        if (bVar2 != null) {
            bVar2.c(i11);
        }
        this.f83985f = d.f83997a;
    }

    public final void g(@m80.l b bVar) {
        this.f83980a = bVar;
    }

    public final void h(@m80.k String file, final int i11, boolean z11) {
        g0.p(file, "file");
        qb.c.b(f83977i, "state = " + this.f83985f, new Object[0]);
        if (this.f83985f != d.f83997a) {
            return;
        }
        this.f83985f = d.f83998b;
        this.f83984e = 0;
        this.f83983d = file;
        this.f83982c.submit(new Runnable() { // from class: rf.a
            @Override // java.lang.Runnable
            public final void run() {
                h.j(h.this, i11);
            }
        });
    }

    public final void l() {
        qb.c.b(f83977i, "state = " + this.f83985f + com.alipay.sdk.m.u.i.f11099d, new Object[0]);
        d dVar = d.f83998b;
        d dVar2 = d.f83999c;
        d dVar3 = this.f83985f;
        if (dVar3.compareTo(dVar) < 0 || dVar3.compareTo(dVar2) > 0) {
            return;
        }
        this.f83985f = d.f84000d;
        this.f83982c.submit(new Runnable() { // from class: rf.c
            @Override // java.lang.Runnable
            public final void run() {
                h.m(h.this);
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static class c implements b {

        /* renamed from: f, reason: collision with root package name */
        public static final int f83996f = 0;

        @Override // rf.h.b
        public void d(@m80.k byte[] data, int i11) {
            g0.p(data, "data");
        }

        @Override // rf.h.b
        public void a() {
        }

        @Override // rf.h.b
        public void b() {
        }

        @Override // rf.h.b
        public void c(int i11) {
        }
    }
}
