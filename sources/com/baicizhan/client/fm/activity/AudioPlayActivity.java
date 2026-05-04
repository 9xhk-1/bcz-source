package com.baicizhan.client.fm.activity;

import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.ThemeUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import l6.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class AudioPlayActivity extends BaseAppCompatActivity implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17327e = "AudioPlayActivity";

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f17328a;

    /* renamed from: b, reason: collision with root package name */
    public AudioManager f17329b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f17330c;

    /* renamed from: d, reason: collision with root package name */
    public int f17331d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp2) {
            AudioPlayActivity.this.N0(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17333a;

        public b(final int val$playId) {
            this.f17333a = val$playId;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialog) {
            AudioPlayActivity.this.f17331d = -1;
            AudioPlayActivity.this.V0(this.f17333a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ va.f f17335a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17336b;

        public c(final va.f val$loading, final int val$playId) {
            this.f17335a = val$loading;
            this.f17336b = val$playId;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mp2, int what, int extra) {
            this.f17335a.dismiss();
            AudioPlayActivity.this.W0(this.f17336b, what, extra);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ va.f f17338a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17339b;

        public d(final va.f val$loading, final int val$playId) {
            this.f17338a = val$loading;
            this.f17339b = val$playId;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mp2) {
            if (!this.f17338a.isShowing()) {
                AudioPlayActivity.this.f17328a.reset();
            } else {
                this.f17338a.dismiss();
                AudioPlayActivity.this.M0(this.f17339b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AudioPlayActivity.this.isFinishing() || !AudioPlayActivity.this.f17328a.isPlaying()) {
                return;
            }
            AudioPlayActivity audioPlayActivity = AudioPlayActivity.this;
            audioPlayActivity.Z0(audioPlayActivity.f17328a.getCurrentPosition());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends PhoneStateListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<AudioPlayActivity> f17342a;

        public f(AudioPlayActivity activity) {
            this.f17342a = new WeakReference<>(activity);
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            AudioPlayActivity audioPlayActivity = this.f17342a.get();
            if (audioPlayActivity == null || state == 0 || !audioPlayActivity.Q0()) {
                return;
            }
            audioPlayActivity.a1();
        }
    }

    public final void M0(final int playId) {
        this.f17331d = playId;
        this.f17328a.start();
        this.f17330c.cancel();
        Timer timer = new Timer();
        this.f17330c = timer;
        timer.schedule(new e(), 0L, 1000L);
        T0();
    }

    public final void N0(boolean isCompleted) {
        int i11 = this.f17331d;
        this.f17331d = -1;
        this.f17330c.cancel();
        this.f17329b.abandonAudioFocus(this);
        this.f17328a.stop();
        U0(i11, isCompleted);
    }

    public int O0() {
        return this.f17331d;
    }

    public int P0() {
        return this.f17328a.getDuration();
    }

    public boolean Q0() {
        return O0() >= 0 && !isFinishing() && this.f17328a.isPlaying();
    }

    public final boolean R0(String url) {
        return url.startsWith(n.f70249a);
    }

    public abstract void S0();

    public abstract void T0();

    public abstract void U0(int playId, boolean isCompleted);

    public abstract void V0(int playId);

    public abstract void W0(int playId, int what, int extra);

    public abstract void X0(int playId, IOException e11);

    public abstract void Y0();

    public abstract void Z0(int position);

    public void a1() {
        this.f17328a.pause();
        this.f17330c.cancel();
        this.f17329b.abandonAudioFocus(this);
        S0();
    }

    public void b1(final int playId, final String url) {
        this.f17329b.requestAudioFocus(this, 3, 1);
        int i11 = this.f17331d;
        if (playId == i11) {
            M0(i11);
            return;
        }
        if (O0() > -1) {
            d1();
        }
        if (!R0(url) && !rb.d.f(this)) {
            Y0();
            return;
        }
        Uri parse = Uri.parse(url);
        this.f17328a.reset();
        this.f17328a.setAudioStreamType(3);
        try {
            this.f17328a.setDataSource(getApplicationContext(), parse);
            va.f fVar = new va.f(this);
            fVar.setCancelable(true);
            fVar.setCanceledOnTouchOutside(false);
            fVar.setOnCancelListener(new b(playId));
            int b11 = rb.d.b(this);
            fVar.f((R0(url) || 1 > b11 || b11 > 3) ? "加载中" : "正在2G/3G/4G网络下加载");
            fVar.show();
            this.f17328a.setOnErrorListener(new c(fVar, playId));
            this.f17328a.setOnPreparedListener(new d(fVar, playId));
            this.f17328a.prepareAsync();
        } catch (IOException e11) {
            X0(playId, e11);
        }
    }

    public void c1(int position) {
        this.f17328a.seekTo(position);
    }

    public void d1() {
        N0(false);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if (focusChange != 1) {
            if (isFinishing() || !this.f17328a.isPlaying()) {
                return;
            }
            a1();
            return;
        }
        if (isFinishing() || !this.f17328a.isPlaying()) {
            return;
        }
        this.f17328a.start();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ThemeUtil.setThemeOnAppCompatActivityCreate(this);
        super.onCreate(savedInstanceState);
        this.f17331d = -1;
        try {
            this.f17329b = (AudioManager) getApplicationContext().getSystemService("audio");
            ((TelephonyManager) getApplicationContext().getSystemService("phone")).listen(new f(this), 32);
        } catch (Exception e11) {
            qb.c.c(f17327e, "", e11);
        }
        this.f17330c = new Timer();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f17328a = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new a());
        setVolumeControlStream(3);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f17330c.cancel();
        if (O0() > -1) {
            d1();
        }
        this.f17328a.reset();
        this.f17328a.release();
    }
}
