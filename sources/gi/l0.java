package gi;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l0 implements View.OnClickListener, IAudioPlayer.b {

    /* renamed from: a, reason: collision with root package name */
    public IAudioPlayer f53790a;

    /* renamed from: b, reason: collision with root package name */
    public String f53791b;

    /* renamed from: c, reason: collision with root package name */
    public TopicRecord f53792c;

    /* renamed from: d, reason: collision with root package name */
    public String f53793d;

    /* renamed from: e, reason: collision with root package name */
    public View f53794e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f53795f;

    /* renamed from: g, reason: collision with root package name */
    public IAudioPlayer.State f53796g;

    /* renamed from: h, reason: collision with root package name */
    public a f53797h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();

        void b();
    }

    public l0(IAudioPlayer player, String path, ImageView playView) {
        this(player, path, (View) null, playView);
    }

    private void a(boolean run) {
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f53795f.getBackground();
        if (run) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
            animationDrawable.selectDrawable(0);
        }
    }

    public void b() {
        String str = this.f53791b;
        if (str != null) {
            e.r(this.f53790a, str, this);
        } else {
            this.f53790a.f(this);
            ZPackUtils.loadAudioCompat(this.f53790a, this.f53792c, this.f53793d);
        }
        a(true);
        a aVar = this.f53797h;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c(a l11) {
        this.f53797h = l11;
    }

    public void d() {
        this.f53790a.stop();
        a(false);
    }

    public final void e() {
        if (IAudioPlayer.State.Playing == this.f53796g) {
            d();
        } else {
            b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
    public void onPlayStateChanged(IAudioPlayer.State state) {
        this.f53796g = state;
        if (IAudioPlayer.State.Stopped != state && IAudioPlayer.State.Completed != state) {
            if (IAudioPlayer.State.Playing == state) {
                a(true);
            }
        } else {
            a(false);
            a aVar = this.f53797h;
            if (aVar == null || IAudioPlayer.State.Completed != state) {
                return;
            }
            aVar.a();
        }
    }

    public l0(IAudioPlayer player, String path, View playFrame, ImageView playView) {
        this.f53790a = player;
        this.f53791b = path;
        this.f53794e = playFrame;
        this.f53795f = playView;
        playView.setOnClickListener(this);
        View view = this.f53794e;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public l0(IAudioPlayer player, TopicRecord record, String audioName, ImageView playView) {
        this(player, record, audioName, null, playView);
    }

    public l0(IAudioPlayer player, TopicRecord record, String audioName, View playFrame, ImageView playView) {
        this.f53790a = player;
        this.f53792c = record;
        this.f53793d = audioName;
        this.f53794e = playFrame;
        this.f53795f = playView;
        playView.setOnClickListener(this);
        View view = this.f53794e;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }
}
