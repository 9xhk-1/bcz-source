package s;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import com.jiongji.andriod.card.R;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: e, reason: collision with root package name */
    public static final String f86998e = "BeepManager";

    /* renamed from: f, reason: collision with root package name */
    public static final float f86999f = 0.1f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f87000g = 200;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f87001a;

    /* renamed from: b, reason: collision with root package name */
    public MediaPlayer f87002b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87003c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87004d;

    public b(Activity activity) {
        this.f87001a = activity;
        e();
    }

    public static boolean d(SharedPreferences prefs, Context activity) {
        boolean z11 = prefs.getBoolean(v.a.f92790i, true);
        if (!z11 || ((AudioManager) activity.getSystemService("audio")).getRingerMode() == 2) {
            return z11;
        }
        return false;
    }

    public final MediaPlayer a(Context activity) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        AssetFileDescriptor openRawResourceFd = activity.getResources().openRawResourceFd(R.raw.beep);
        try {
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            return mediaPlayer;
        } catch (IOException e11) {
            qb.c.p(f86998e, "", e11);
            return null;
        }
    }

    public synchronized void b() {
        MediaPlayer mediaPlayer = this.f87002b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f87002b = null;
        }
    }

    public synchronized void c() {
        MediaPlayer mediaPlayer;
        try {
            if (this.f87003c && (mediaPlayer = this.f87002b) != null) {
                mediaPlayer.start();
            }
            if (this.f87004d) {
                ((Vibrator) this.f87001a.getSystemService("vibrator")).vibrate(200L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f87001a);
        this.f87003c = d(defaultSharedPreferences, this.f87001a);
        this.f87004d = defaultSharedPreferences.getBoolean(v.a.f92791j, false);
        if (this.f87003c && this.f87002b == null) {
            this.f87001a.setVolumeControlStream(3);
            this.f87002b = a(this.f87001a);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp2) {
        mp2.seekTo(0);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mp2, int what, int extra) {
        try {
            if (what == 100) {
                this.f87001a.finish();
            } else {
                mp2.release();
                this.f87002b = null;
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }
}
