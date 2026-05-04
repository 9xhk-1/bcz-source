package d7;

import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import d7.i;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import org.junit.jupiter.api.j2;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d implements j {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f47278e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f47279f = "file:///android_asset/";

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public MediaPlayer f47280a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public AssetFileDescriptor f47281b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final y<i> f47282c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final m0<i> f47283d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public d() {
        y<i> a11 = o0.a(i.c.f47302a);
        this.f47282c = a11;
        this.f47283d = kotlinx.coroutines.flow.k.n(a11);
    }

    public static final void h(d dVar, MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        dVar.f47282c.setValue(i.f.f47305a);
    }

    public static final void i(d dVar, MediaPlayer mediaPlayer) {
        dVar.f47282c.setValue(i.a.f47300a);
    }

    public static final boolean j(d dVar, MediaPlayer mediaPlayer, int i11, int i12) {
        dVar.f47282c.setValue(new i.b("MediaPlayer error: " + i11 + j2.O + i12));
        return true;
    }

    @Override // d7.j
    public void a() {
        MediaPlayer mediaPlayer = this.f47280a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            this.f47282c.setValue(i.f.f47305a);
        }
    }

    @Override // d7.j
    public void c(@m80.k String source, @m80.l h hVar) {
        g0.p(source, "source");
        try {
            stop();
            this.f47282c.setValue(i.d.f47303a);
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
            k(mediaPlayer, source);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: d7.a
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    d.h(d.this, mediaPlayer2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: d7.b
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    d.i(d.this, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: d7.c
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i11, int i12) {
                    boolean j11;
                    j11 = d.j(d.this, mediaPlayer2, i11, i12);
                    return j11;
                }
            });
            mediaPlayer.prepareAsync();
            this.f47280a = mediaPlayer;
        } catch (Exception e11) {
            z6.b.f101032b.e("AndroidAudioPlayer", "play error", e11);
            this.f47282c.setValue(new i.b(e11.getMessage()));
        }
    }

    public final void g() {
        try {
            AssetFileDescriptor assetFileDescriptor = this.f47281b;
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        } catch (Exception e11) {
            z6.b.f101032b.e("AndroidAudioPlayer", "close AssetFileDescriptor error", e11);
        }
        this.f47281b = null;
    }

    @Override // d7.j
    @m80.k
    public m0<i> getState() {
        return this.f47283d;
    }

    public final void k(MediaPlayer mediaPlayer, String str) {
        if (!f0.J2(str, "file:///android_asset/", false, 2, null)) {
            mediaPlayer.setDataSource(str);
            return;
        }
        AssetFileDescriptor openFd = f7.b.c().getAssets().openFd(k0.x4(str, "file:///android_asset/"));
        this.f47281b = openFd;
        if (openFd != null) {
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
        }
    }

    @Override // d7.j
    public void pause() {
        MediaPlayer mediaPlayer = this.f47280a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        mediaPlayer.pause();
        this.f47282c.setValue(i.e.f47304a);
    }

    @Override // d7.j
    public void release() {
        stop();
    }

    @Override // d7.j
    public void stop() {
        MediaPlayer mediaPlayer = this.f47280a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        this.f47280a = null;
        g();
        this.f47282c.setValue(i.c.f47302a);
    }
}
