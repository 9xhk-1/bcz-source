package com.baicizhan.client.business.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;
import com.malmstein.fenster.view.FensterVideoView;
import org.junit.jupiter.api.j2;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WikiVideoView extends FrameLayout implements View.OnClickListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {

    /* renamed from: x, reason: collision with root package name */
    public static final String f17222x = "WikiVideoView";

    /* renamed from: y, reason: collision with root package name */
    public static final int f17223y = 16;

    /* renamed from: z, reason: collision with root package name */
    public static final int f17224z = 9;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17225a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f17226b;

    /* renamed from: c, reason: collision with root package name */
    public FensterVideoView f17227c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f17228d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f17229e;

    /* renamed from: f, reason: collision with root package name */
    public View f17230f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f17231g;

    /* renamed from: h, reason: collision with root package name */
    public View f17232h;

    /* renamed from: i, reason: collision with root package name */
    public RotatingImageView f17233i;

    /* renamed from: j, reason: collision with root package name */
    public View f17234j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17235k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17236l;

    /* renamed from: m, reason: collision with root package name */
    public int f17237m;

    /* renamed from: n, reason: collision with root package name */
    public int f17238n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17239o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17240p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17241q;

    /* renamed from: r, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f17242r;

    /* renamed from: s, reason: collision with root package name */
    public f f17243s;

    /* renamed from: t, reason: collision with root package name */
    public e f17244t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f17245u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17246v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f17247w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements MediaPlayer.OnInfoListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mp2, int what, int extra) {
            if (3 != what) {
                return false;
            }
            WikiVideoView.this.f17234j.setVisibility(8);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WikiVideoView.this.f17234j.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WikiVideoView.this.f17230f.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17251a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(boolean toPlay);
    }

    public WikiVideoView(Context context) {
        this(context, null, 0);
    }

    private void setVideoVisibility(int visibility) {
        this.f17227c.setVisibility(visibility);
    }

    public final void c() {
        this.f17230f.removeCallbacks(this.f17247w);
        this.f17230f.setVisibility(0);
        this.f17230f.postDelayed(this.f17247w, 3000L);
    }

    public final int d() {
        return this.f17227c.getCurrentPosition();
    }

    public final void e() {
        this.f17227c.pause();
    }

    public void f() {
        boolean o11 = o();
        if (o11) {
            r();
        } else {
            t(-1);
        }
        f fVar = this.f17243s;
        if (fVar != null) {
            fVar.a(!o11);
        }
    }

    public final void g(int millis) {
        this.f17227c.seekTo(millis);
    }

    public int getCurrentPosition() {
        return this.f17227c.getCurrentPosition();
    }

    public int getDuration() {
        return this.f17227c.getDuration();
    }

    public String getName() {
        Uri uri = this.f17226b;
        if (uri != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    public final void h() {
        this.f17239o = false;
        this.f17227c.start();
    }

    public final void i() {
        this.f17239o = true;
        this.f17235k = false;
        this.f17225a = false;
        this.f17234j.setVisibility(0);
        this.f17227c.f0();
        FileUtils.deleteContents(getContext().getCacheDir());
    }

    public void j() {
        if (this.f17236l) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        setLayoutParams(layoutParams);
        this.f17236l = true;
        requestLayout();
        invalidate();
    }

    public void k() {
        setVideoVisibility(0);
        this.f17228d.setVisibility(4);
        this.f17229e.setVisibility(8);
        this.f17230f.setVisibility(8);
        this.f17233i.setVisibility(0);
    }

    public final void l(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new a());
    }

    public boolean m() {
        return this.f17236l;
    }

    public boolean n() {
        return this.f17241q;
    }

    public boolean o() {
        return this.f17227c.isPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17246v) {
            this.f17246v = false;
            f();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e eVar;
        int id2 = view.getId();
        if (view == this) {
            if (this.f17240p && this.f17235k) {
                c();
                return;
            } else {
                f();
                return;
            }
        }
        if (R.id.play == id2 || R.id.toggle == id2) {
            f();
            return;
        }
        if (R.id.play_controller == id2) {
            c();
        } else {
            if (R.id.fullscreen != id2 || (eVar = this.f17244t) == null) {
                return;
            }
            this.f17245u = Boolean.TRUE;
            eVar.a();
            this.f17245u = Boolean.FALSE;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp2) {
        s(false);
        MediaPlayer.OnCompletionListener onCompletionListener = this.f17242r;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mp2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Boolean bool = this.f17245u;
        if (bool == null || !bool.booleanValue()) {
            qb.c.b(f17222x, "detached: playing: " + o(), new Object[0]);
            if (o()) {
                this.f17246v = true;
            }
            r();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp2, int what, int extra) {
        qb.c.d(f17222x, "play error, what=%d, extra=%d", Integer.valueOf(what), Integer.valueOf(extra));
        this.f17227c.f0();
        this.f17225a = false;
        s(false);
        g.g(R.string.play_err, 0);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        qb.c.b(f17222x, "onMeasure " + size + j2.O + size2, new Object[0]);
        int i11 = size * 9;
        int i12 = size2 * 16;
        if (i12 == 0) {
            size2 = i11 / 16;
        }
        if (i11 == 0) {
            size = i12 / 9;
        }
        if (i11 > 0 && i12 > 0 && (!this.f17240p || !this.f17241q)) {
            if (i11 > i12) {
                size = i12 / 9;
            } else {
                size2 = i11 / 16;
            }
        }
        if (!this.f17236l && size > 0 && size2 > 0) {
            this.f17237m = size;
            this.f17238n = size2;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mp2) {
        this.f17235k = true;
        this.f17233i.setVisibility(4);
        if (this.f17240p) {
            c();
        }
        l(mp2);
    }

    public boolean p() {
        return this.f17235k;
    }

    public boolean q() {
        return this.f17239o;
    }

    public void r() {
        if (this.f17240p) {
            c();
            this.f17231g.setImageResource(R.drawable.tv_big_play_normal_default);
        } else {
            this.f17229e.setVisibility(0);
        }
        this.f17233i.setVisibility(4);
        e();
    }

    public void s(boolean resetSize) {
        if (o() || d() > 0) {
            g(0);
            e();
        }
        this.f17228d.setVisibility(0);
        this.f17229e.setVisibility(0);
        this.f17230f.setVisibility(8);
        this.f17233i.setVisibility(4);
        if (resetSize) {
            this.f17236l = false;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.f17237m;
            layoutParams.height = this.f17238n;
            setLayoutParams(layoutParams);
        }
    }

    public void setFullscreen(boolean fullscreen) {
        this.f17241q = fullscreen;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17232h.getLayoutParams();
        layoutParams.width = xb.f.a(getContext(), fullscreen ? 50.0f : 40.0f);
        layoutParams.height = xb.f.a(getContext(), fullscreen ? 50.0f : 40.0f);
        if (fullscreen) {
            int a11 = xb.f.a(getContext(), 40.0f);
            layoutParams.setMargins(0, 0, a11, a11);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.f17232h.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = fullscreen ? -1 : 0;
        setLayoutParams(layoutParams2);
        d dVar = new d();
        dVar.f17251a = this.f17241q;
        i80.c.f().q(dVar);
    }

    public void setFullscreenEnabled(boolean enabled) {
        FensterVideoView fensterVideoView = this.f17227c;
        if (fensterVideoView != null) {
            this.f17240p = enabled;
            fensterVideoView.setIsolateMediaSuface(enabled);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener listener) {
        this.f17242r = listener;
    }

    public void setOnFullscreenListener(e listener) {
        this.f17244t = listener;
    }

    public void setOnToggleListener(f listener) {
        this.f17243s = listener;
    }

    public void setSnapshot(String url) {
        if (TextUtils.isEmpty(url)) {
            this.f17228d.setImageResource(R.drawable.tv_default_normal_default);
        } else {
            hc.c.l(url).j(R.drawable.tv_default_normal_default).f(R.drawable.tv_default_normal_default).h().o(this.f17228d);
        }
    }

    public void setVideoURI(String url) {
        try {
            this.f17226b = Uri.parse(url);
        } catch (Exception e11) {
            qb.c.d(f17222x, e11.toString(), new Object[0]);
            this.f17226b = null;
        }
    }

    public void t(int position) {
        if (!this.f17225a) {
            this.f17225a = true;
            setVideoURI(this.f17226b);
        }
        setVideoVisibility(0);
        this.f17228d.setVisibility(4);
        if (this.f17240p) {
            this.f17229e.setVisibility(8);
            if (this.f17235k) {
                c();
            } else {
                this.f17230f.setVisibility(8);
            }
            this.f17231g.setImageResource(R.drawable.tv_pausenew_normal_default);
        } else {
            this.f17229e.setVisibility(4);
            this.f17230f.setVisibility(8);
        }
        j();
        if (position > -1) {
            g(position);
        }
        h();
        if (this.f17235k) {
            return;
        }
        this.f17233i.setVisibility(0);
    }

    public void u() {
        s(false);
        i();
    }

    public WikiVideoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WikiVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17225a = false;
        this.f17235k = false;
        this.f17236l = false;
        this.f17237m = -1;
        this.f17238n = -1;
        this.f17239o = true;
        this.f17240p = false;
        this.f17241q = false;
        this.f17245u = null;
        this.f17246v = false;
        this.f17247w = new c();
        LayoutInflater.from(context).inflate(R.layout.wiki_video_view, (ViewGroup) this, true);
        this.f17228d = (ImageView) findViewById(R.id.snapshot);
        this.f17234j = findViewById(R.id.placeholder);
        this.f17229e = (ImageView) findViewById(R.id.play);
        this.f17230f = findViewById(R.id.play_controller);
        this.f17231g = (ImageView) findViewById(R.id.toggle);
        this.f17232h = findViewById(R.id.fullscreen);
        this.f17233i = (RotatingImageView) findViewById(R.id.loading_view);
        setOnClickListener(this);
        this.f17229e.setOnClickListener(this);
        this.f17230f.setOnClickListener(this);
        this.f17231g.setOnClickListener(this);
        this.f17232h.setOnClickListener(this);
        FensterVideoView fensterVideoView = (FensterVideoView) findViewById(R.id.texture_view);
        this.f17227c = fensterVideoView;
        fensterVideoView.setVisibility(0);
        this.f17227c.setOnErrorListener(this);
        this.f17227c.setOnCompletionListener(this);
        this.f17227c.setOnPreparedListener(this);
    }

    private void setVideoURI(Uri uri) {
        this.f17227c.a0(uri, 0);
    }
}
