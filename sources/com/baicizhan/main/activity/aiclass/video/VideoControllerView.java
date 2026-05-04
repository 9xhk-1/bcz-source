package com.baicizhan.main.activity.aiclass.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.WorkerThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.res.ResourcesCompat;
import com.baicizhan.main.activity.aiclass.video.VideoControllerView;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import gs.io;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import sa.q;
import wb0.p;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVideoControllerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoControllerView.kt\ncom/baicizhan/main/activity/aiclass/video/VideoControllerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,647:1\n1#2:648\n*E\n"})
/* loaded from: classes4.dex */
public final class VideoControllerView extends ConstraintLayout {

    @k
    public static final a A = new a(null);
    public static final int B = 8;
    public static final String C = VideoControllerView.class.getSimpleName();
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final long H = 6000;
    public static final long I = 10000;
    public static final float J = 1.7777778f;
    public static final float K = 0.008333334f;
    public static final long L = 3;
    public static final long M = 10;
    public static final long N = 60;
    public static final long O = 15;

    /* renamed from: a, reason: collision with root package name */
    @l
    public c f18259a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public e f18260b;

    /* renamed from: c, reason: collision with root package name */
    public long f18261c;

    /* renamed from: d, reason: collision with root package name */
    public long f18262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18263e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18264f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18265g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public State f18266h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ValueAnimator f18267i;

    /* renamed from: j, reason: collision with root package name */
    public float f18268j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18269k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18270l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final c0 f18271m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final c0 f18272n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final c0 f18273o;

    /* renamed from: p, reason: collision with root package name */
    public long f18274p;

    /* renamed from: q, reason: collision with root package name */
    public long f18275q;

    /* renamed from: r, reason: collision with root package name */
    public long f18276r;

    /* renamed from: s, reason: collision with root package name */
    public long f18277s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final b f18278t;

    /* renamed from: u, reason: collision with root package name */
    public final dc0.c<Long> f18279u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final qb0.h f18280v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public qb0.h f18281w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18282x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final io f18283y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final GestureDetector f18284z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State SEEKING = new State("SEEKING", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, SEEKING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private State(String str, int i11) {
        }

        @k
        public static m00.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final String b(long j11) {
            String format = String.format("%06d", Arrays.copyOf(new Object[]{Long.valueOf((j11 / 3) + 1)}, 1));
            g0.o(format, "format(...)");
            return format;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nVideoControllerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoControllerView.kt\ncom/baicizhan/main/activity/aiclass/video/VideoControllerView$MsgHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,647:1\n1#2:648\n*E\n"})
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WeakReference<VideoControllerView> f18285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k VideoControllerView v11) {
            super(Looper.getMainLooper());
            g0.p(v11, "v");
            this.f18285a = new WeakReference<>(v11);
        }

        @Override // android.os.Handler
        public void handleMessage(@k Message msg) {
            g0.p(msg, "msg");
            super.handleMessage(msg);
            VideoControllerView videoControllerView = this.f18285a.get();
            if (videoControllerView != null) {
                if (!videoControllerView.isAttachedToWindow()) {
                    videoControllerView = null;
                }
                if (videoControllerView == null) {
                    return;
                }
                int i11 = msg.what;
                if (i11 == 0) {
                    VideoControllerView.E0(videoControllerView, true, false, 2, null);
                    videoControllerView.f18269k = true;
                    return;
                }
                if (i11 == 1) {
                    VideoControllerView.E0(videoControllerView, false, false, 2, null);
                    videoControllerView.f18269k = false;
                    videoControllerView.f18270l = false;
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    Object obj = msg.obj;
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar == null) {
                        return;
                    }
                    videoControllerView.y0(dVar);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            @l
            @WorkerThread
            @Deprecated
            public static Bitmap a(@k c cVar, @k String positionDesc, int i11, int i12, boolean z11) {
                g0.p(positionDesc, "positionDesc");
                return c.super.i0(positionDesc, i11, i12, z11);
            }
        }

        void M(long j11);

        void T(@k State state);

        @l
        @WorkerThread
        default Bitmap i0(@k String positionDesc, int i11, int i12, boolean z11) {
            g0.p(positionDesc, "positionDesc");
            return null;
        }

        void o();

        void q(float f11);

        void r0();

        void s0();

        void w(boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f18286a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18287b;

        public d(long j11, boolean z11) {
            this.f18286a = j11;
            this.f18287b = z11;
        }

        public static /* synthetic */ d d(d dVar, long j11, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = dVar.f18286a;
            }
            if ((i11 & 2) != 0) {
                z11 = dVar.f18287b;
            }
            return dVar.c(j11, z11);
        }

        public final long a() {
            return this.f18286a;
        }

        public final boolean b() {
            return this.f18287b;
        }

        @k
        public final d c(long j11, boolean z11) {
            return new d(j11, z11);
        }

        public final boolean e() {
            return this.f18287b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f18286a == dVar.f18286a && this.f18287b == dVar.f18287b;
        }

        public final long f() {
            return this.f18286a;
        }

        public int hashCode() {
            return (Long.hashCode(this.f18286a) * 31) + Boolean.hashCode(this.f18287b);
        }

        @k
        public String toString() {
            return "PreviewRefresh(positionMills=" + this.f18286a + ", forward=" + this.f18287b + j.f81007d;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final e f18288b = new e("DEFAULT", 0, 1.0f);

        /* renamed from: c, reason: collision with root package name */
        public static final e f18289c = new e("ONE", 1, 1.25f);

        /* renamed from: d, reason: collision with root package name */
        public static final e f18290d = new e("TWO", 2, 0.75f);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ e[] f18291e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ m00.a f18292f;

        /* renamed from: a, reason: collision with root package name */
        public final float f18293a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18294a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.f18288b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.f18289c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.f18290d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f18294a = iArr;
            }
        }

        static {
            e[] a11 = a();
            f18291e = a11;
            f18292f = m00.c.c(a11);
        }

        public e(String str, int i11, float f11) {
            this.f18293a = f11;
        }

        public static final /* synthetic */ e[] a() {
            return new e[]{f18288b, f18289c, f18290d};
        }

        @k
        public static m00.a<e> c() {
            return f18292f;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f18291e.clone();
        }

        @k
        public final String b() {
            int i11 = a.f18294a[ordinal()];
            if (i11 == 1) {
                return "1.0X";
            }
            if (i11 == 2) {
                return "1.25X";
            }
            if (i11 == 3) {
                return "0.75X";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final float d() {
            return this.f18293a;
        }

        @k
        public final e e() {
            int i11 = a.f18294a[ordinal()];
            if (i11 == 1) {
                return f18289c;
            }
            if (i11 == 2) {
                return f18290d;
            }
            if (i11 == 3) {
                return f18288b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nVideoControllerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoControllerView.kt\ncom/baicizhan/main/activity/aiclass/video/VideoControllerView$gestureDetector$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,647:1\n1#2:648\n*E\n"})
    public static final class f extends GestureDetector.SimpleOnGestureListener {
        public f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            g0.p(e11, "e");
            qb.c.b(VideoControllerView.C, "gesture: onDown", new Object[0]);
            VideoControllerView.I0(VideoControllerView.this, null, 1, null);
            VideoControllerView.this.f18278t.removeCallbacksAndMessages(null);
            if (!VideoControllerView.this.f18269k) {
                VideoControllerView.this.f18278t.obtainMessage(0).sendToTarget();
                VideoControllerView.this.f18270l = true;
            } else if (VideoControllerView.this.f18270l) {
                VideoControllerView.this.f18270l = false;
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f11, float f12) {
            g0.p(e22, "e2");
            qb.c.b(VideoControllerView.C, "gesture: onFling", new Object[0]);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f11, float f12) {
            g0.p(e22, "e2");
            if (!VideoControllerView.this.f18265g) {
                qb.c.b(VideoControllerView.C, "gesture: onScroll starting", new Object[0]);
                VideoControllerView.this.setScrolling(true);
            }
            VideoControllerView videoControllerView = VideoControllerView.this;
            long j11 = videoControllerView.f18261c;
            float x11 = e22.getX();
            if (motionEvent == null) {
                return false;
            }
            Long valueOf = Long.valueOf(Math.max(0L, Math.min(j11, (long) ((((x11 - motionEvent.getX()) / VideoControllerView.this.getWidthOfSeeking()) * VideoControllerView.this.f18261c) + VideoControllerView.this.f18274p))));
            if (valueOf.longValue() == VideoControllerView.this.f18275q) {
                valueOf = null;
            }
            if (valueOf != null) {
                videoControllerView.f18275q = valueOf.longValue();
                VideoControllerView.this.f18278t.obtainMessage(2, new d(VideoControllerView.this.f18275q, f11 < 0.0f)).sendToTarget();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            g0.p(e11, "e");
            qb.c.b(VideoControllerView.C, "gesture: onSingleTapUp", new Object[0]);
            VideoControllerView.this.t0(true);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
            ImageView screenshotPreview = VideoControllerView.this.f18283y.f55374o;
            g0.o(screenshotPreview, "screenshotPreview");
            q.z(screenshotPreview, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f18297a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoControllerView f18298b;

        public h(boolean z11, VideoControllerView videoControllerView) {
            this.f18297a = z11;
            this.f18298b = videoControllerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            if (this.f18297a) {
                return;
            }
            ImageView screenshotPreview = this.f18298b.f18283y.f55374o;
            g0.o(screenshotPreview, "screenshotPreview");
            if (q.m(screenshotPreview)) {
                ImageView screenshotPreview2 = this.f18298b.f18283y.f55374o;
                g0.o(screenshotPreview2, "screenshotPreview");
                q.z(screenshotPreview2, false);
            }
            Group controlArea = this.f18298b.f18283y.f55362c;
            g0.o(controlArea, "controlArea");
            q.z(controlArea, false);
            View bg2 = this.f18298b.f18283y.f55361b;
            g0.o(bg2, "bg");
            q.z(bg2, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
            if (this.f18297a) {
                Group controlArea = this.f18298b.f18283y.f55362c;
                g0.o(controlArea, "controlArea");
                q.z(controlArea, true);
                View bg2 = this.f18298b.f18283y.f55361b;
                g0.o(bg2, "bg");
                q.z(bg2, true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public int f18299a = -1;

        public i() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            if (z11) {
                int i12 = this.f18299a;
                this.f18299a = i11;
                if (i11 >= 0) {
                    b bVar = VideoControllerView.this.f18278t;
                    VideoControllerView videoControllerView = VideoControllerView.this;
                    if (seekBar == null) {
                        return;
                    }
                    bVar.obtainMessage(2, new d(videoControllerView.q0(seekBar), this.f18299a > i12)).sendToTarget();
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            VideoControllerView.this.setSeeking(true);
            VideoControllerView.this.f18278t.removeMessages(1);
            VideoControllerView.this.H0(seekBar);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            c cVar = VideoControllerView.this.f18259a;
            if (cVar != null) {
                VideoControllerView videoControllerView = VideoControllerView.this;
                if (seekBar == null) {
                    return;
                }
                long q02 = videoControllerView.q0(seekBar);
                VideoControllerView videoControllerView2 = VideoControllerView.this;
                qb.c.b(VideoControllerView.C, "user seek: " + q02 + " / " + videoControllerView2.f18261c, new Object[0]);
                cVar.M(q02);
            }
            VideoControllerView.this.d0();
            VideoControllerView.this.f0();
            VideoControllerView.this.f18278t.sendMessageDelayed(VideoControllerView.this.f18278t.obtainMessage(1), 6000L);
            this.f18299a = -1;
            VideoControllerView.this.setSeeking(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public VideoControllerView(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    public static final rx.c B(final VideoControllerView videoControllerView, final Long l11) {
        rx.c M2 = rx.c.M2(l11);
        final x00.l lVar = new x00.l() { // from class: jd.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                return VideoControllerView.h(l11, videoControllerView, (Long) obj);
            }
        };
        return M2.c3(new p() { // from class: jd.t
            @Override // wb0.p
            public final Object call(Object obj) {
                return VideoControllerView.k(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
    }

    public static /* synthetic */ void B0(VideoControllerView videoControllerView, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = videoControllerView.f18261c;
        }
        videoControllerView.A0(j11, j12);
    }

    public static final rx.c C(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final g2 D(VideoControllerView videoControllerView, Bitmap bitmap) {
        if (bitmap == null) {
            return g2.f100423a;
        }
        videoControllerView.J0(bitmap);
        return g2.f100423a;
    }

    private final void D0(boolean z11, boolean z12) {
        ValueAnimator valueAnimator = this.f18267i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z12) {
            final DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            ValueAnimator duration = ValueAnimator.ofFloat(this.f18268j, z11 ? 1.0f : 0.0f).setDuration(250L);
            duration.addListener(new h(z11, this));
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jd.l
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    VideoControllerView.F0(VideoControllerView.this, decelerateInterpolator, valueAnimator2);
                }
            });
            this.f18267i = duration;
            duration.start();
            return;
        }
        this.f18268j = 0.0f;
        this.f18283y.f55374o.setAlpha(0.0f);
        this.f18283y.f55362c.setAlpha(this.f18268j);
        this.f18283y.f55361b.setAlpha(this.f18268j);
        ImageView screenshotPreview = this.f18283y.f55374o;
        g0.o(screenshotPreview, "screenshotPreview");
        q.z(screenshotPreview, false);
        Group controlArea = this.f18283y.f55362c;
        g0.o(controlArea, "controlArea");
        q.z(controlArea, false);
        View bg2 = this.f18283y.f55361b;
        g0.o(bg2, "bg");
        q.z(bg2, false);
    }

    public static final void E(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static /* synthetic */ void E0(VideoControllerView videoControllerView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        videoControllerView.D0(z11, z12);
    }

    public static final void F(Throwable th2) {
        qb.c.c(C, "", th2);
    }

    public static final void F0(VideoControllerView videoControllerView, DecelerateInterpolator decelerateInterpolator, ValueAnimator it) {
        g0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        videoControllerView.f18268j = ((Float) animatedValue).floatValue();
        ImageView screenshotPreview = videoControllerView.f18283y.f55374o;
        g0.o(screenshotPreview, "screenshotPreview");
        if (q.m(screenshotPreview)) {
            videoControllerView.f18283y.f55374o.setAlpha(videoControllerView.f18268j);
        }
        videoControllerView.f18283y.f55362c.setAlpha(videoControllerView.f18268j);
        videoControllerView.f18283y.f55361b.setAlpha(decelerateInterpolator.getInterpolation(videoControllerView.f18268j));
    }

    public static /* synthetic */ void I0(VideoControllerView videoControllerView, SeekBar seekBar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            seekBar = videoControllerView.f18283y.f55369j;
        }
        videoControllerView.H0(seekBar);
    }

    public static final int K0(VideoControllerView videoControllerView) {
        return videoControllerView.getMeasuredWidth();
    }

    private final int getPreviewHeight() {
        return ((Number) this.f18272n.getValue()).intValue();
    }

    private final long getPreviewSliceGap() {
        long j11 = this.f18277s;
        if (j11 > 0) {
            return j11;
        }
        if (this.f18261c <= 0) {
            return 10L;
        }
        long max = Math.max(3L, Math.min(10L, (long) ((r0 / 1000) * 0.008333334f)));
        qb.c.b(C, "calculated preview slice gap: " + max + "s", new Object[0]);
        this.f18277s = max;
        return max;
    }

    private final int getPreviewWidth() {
        return ((Number) this.f18273o.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidthOfSeeking() {
        return ((Number) this.f18271m.getValue()).intValue();
    }

    public static Bitmap h(Long l11, VideoControllerView videoControllerView, Long l12) {
        Bitmap bitmap;
        String str;
        c cVar;
        a aVar = A;
        g0.m(l11);
        String b11 = aVar.b(l11.longValue());
        try {
            cVar = videoControllerView.f18259a;
        } catch (Exception e11) {
            qb.c.c(C, "fetch preview: [" + b11 + "](" + l11 + j.f81007d, e11);
        }
        if (cVar != null) {
            bitmap = cVar.i0(b11, videoControllerView.getPreviewWidth(), videoControllerView.getPreviewHeight(), false);
            str = "fetch preview: [" + b11 + "](" + l11 + j.f81007d;
            if (l11.longValue() == videoControllerView.f18276r || bitmap == null) {
                qb.c.b(C, str, new Object[0]);
                return null;
            }
            qb.c.b(C, str + " -> update", new Object[0]);
            return bitmap;
        }
        bitmap = null;
        str = "fetch preview: [" + b11 + "](" + l11 + j.f81007d;
        if (l11.longValue() == videoControllerView.f18276r) {
        }
        qb.c.b(C, str, new Object[0]);
        return null;
    }

    public static final rx.c h0(final VideoControllerView videoControllerView, final Long l11) {
        rx.c M2 = rx.c.M2(l11);
        final x00.l lVar = new x00.l() { // from class: jd.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean i02;
                i02 = VideoControllerView.i0(l11, videoControllerView, (Long) obj);
                return i02;
            }
        };
        return M2.c3(new p() { // from class: jd.b0
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean j02;
                j02 = VideoControllerView.j0(x00.l.this, obj);
                return j02;
            }
        }).w5(bc0.c.e());
    }

    public static final Boolean i0(Long l11, VideoControllerView videoControllerView, Long l12) {
        a aVar = A;
        g0.m(l11);
        String b11 = aVar.b(l11.longValue());
        try {
            c cVar = videoControllerView.f18259a;
            if (cVar != null) {
                cVar.i0(b11, videoControllerView.getPreviewWidth(), videoControllerView.getPreviewHeight(), true);
            }
        } catch (Exception e11) {
            qb.c.c(C, "init previews: [" + b11 + "](" + l11 + j.f81007d, e11);
        }
        return Boolean.TRUE;
    }

    public static final Boolean j0(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static Bitmap k(x00.l lVar, Object obj) {
        return (Bitmap) lVar.invoke(obj);
    }

    public static final rx.c k0(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final g2 l0(Boolean bool) {
        return g2.f100423a;
    }

    public static final void m0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void n0(Throwable th2) {
        qb.c.c(C, "", th2);
    }

    public static final void o0(VideoControllerView videoControllerView, Ref.LongRef longRef, final dc0.c<Long> cVar, final long j11) {
        videoControllerView.postDelayed(new Runnable() { // from class: jd.i
            @Override // java.lang.Runnable
            public final void run() {
                VideoControllerView.p0(dc0.c.this, j11);
            }
        }, longRef.element);
        longRef.element += 22;
    }

    public static final void p0(dc0.c cVar, long j11) {
        cVar.onNext(Long.valueOf(j11));
    }

    public static final g2 r0(VideoControllerView videoControllerView, View it) {
        c cVar;
        g0.p(it, "it");
        videoControllerView.f18278t.removeMessages(1);
        if (g0.g(it, videoControllerView.f18283y.f55363d)) {
            c cVar2 = videoControllerView.f18259a;
            if (cVar2 != null) {
                cVar2.r0();
            }
        } else if (g0.g(it, videoControllerView.f18283y.f55364e)) {
            c cVar3 = videoControllerView.f18259a;
            if (cVar3 != null) {
                cVar3.s0();
            }
        } else if (g0.g(it, videoControllerView.f18283y.f55371l)) {
            c cVar4 = videoControllerView.f18259a;
            if (cVar4 != null) {
                e e11 = videoControllerView.f18260b.e();
                videoControllerView.f18260b = e11;
                videoControllerView.f18283y.f55371l.setText(e11.b());
                cVar4.q(videoControllerView.f18260b.d());
            }
        } else if (g0.g(it, videoControllerView.f18283y.f55370k) && (cVar = videoControllerView.f18259a) != null) {
            cVar.w(it.isActivated() || it.isSelected());
        }
        b bVar = videoControllerView.f18278t;
        bVar.sendMessageDelayed(bVar.obtainMessage(1), 6000L);
        return g2.f100423a;
    }

    public static final g2 s0(VideoControllerView videoControllerView, View it) {
        g0.p(it, "it");
        videoControllerView.f18278t.removeMessages(1);
        c cVar = videoControllerView.f18259a;
        if (cVar != null) {
            cVar.o();
        }
        b bVar = videoControllerView.f18278t;
        bVar.sendMessageDelayed(bVar.obtainMessage(1), 6000L);
        return g2.f100423a;
    }

    private final void setCurrentState(State state) {
        State state2 = this.f18266h;
        if (state == state2) {
            return;
        }
        qb.c.b(C, "state: " + state2 + " -> " + state, new Object[0]);
        this.f18266h = state;
        c cVar = this.f18259a;
        if (cVar != null) {
            cVar.T(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrolling(boolean z11) {
        if (z11 == this.f18265g) {
            return;
        }
        this.f18265g = z11;
        setCurrentState(z11 ? State.SEEKING : State.IDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeeking(boolean z11) {
        if (z11 == this.f18264f) {
            return;
        }
        this.f18264f = z11;
        setCurrentState(z11 ? State.SEEKING : State.IDLE);
    }

    public static /* synthetic */ void u0(VideoControllerView videoControllerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        videoControllerView.t0(z11);
    }

    public static final int w0(VideoControllerView videoControllerView) {
        return videoControllerView.getResources().getDimensionPixelSize(R.dimen.video_controller_preview_height);
    }

    public static final int x0(VideoControllerView videoControllerView) {
        return (int) (videoControllerView.getPreviewHeight() / 1.7777778f);
    }

    public final void A0(long j11, long j12) {
        if (this.f18261c <= 0) {
            if (j12 <= 0) {
                qb.c.d(C, "Duration has not been initialized!", new Object[0]);
                return;
            } else {
                this.f18261c = j12;
                setEnabled(true);
            }
        }
        if (j11 == this.f18262d) {
            return;
        }
        this.f18262d = j11;
        if (this.f18263e && !this.f18264f && !this.f18265g) {
            this.f18283y.f55369j.setProgress((int) ((j11 / j12) * 1000));
        }
        TextView noproguardTimeProgress = this.f18283y.f55372m;
        g0.o(noproguardTimeProgress, "noproguardTimeProgress");
        C0(noproguardTimeProgress, j11, j12);
        boolean z11 = this.f18262d + 10000 >= this.f18261c;
        boolean isActivated = this.f18283y.f55370k.isActivated();
        z0(z11);
        if (!z11 || isActivated || this.f18269k) {
            return;
        }
        this.f18278t.obtainMessage(0).sendToTarget();
    }

    public final void C0(TextView textView, long j11, long j12) {
        textView.setText(textView.getResources().getString(R.string.video_control_time_progress_desc, c0(j11), c0(j12)));
    }

    public final void G0() {
        this.f18283y.f55369j.setOnSeekBarChangeListener(new i());
    }

    public final void H0(SeekBar seekBar) {
        if (seekBar == null) {
            return;
        }
        this.f18274p = q0(seekBar);
    }

    public final void J0(Bitmap bitmap) {
        this.f18283y.f55365f.setImageBitmap(bitmap);
    }

    public final String c0(long j11) {
        long j12 = j11 / 1000;
        long j13 = 60;
        String format = String.format(TimeModel.f32587h, Arrays.copyOf(new Object[]{Long.valueOf(j12 / j13)}, 1));
        g0.o(format, "format(...)");
        String format2 = String.format(TimeModel.f32587h, Arrays.copyOf(new Object[]{Long.valueOf(j12 % j13)}, 1));
        g0.o(format2, "format(...)");
        return format + ":" + format2;
    }

    public final void d0() {
        this.f18274p = -1L;
        this.f18275q = -1L;
        this.f18276r = -1L;
    }

    public final long e0(long j11, long j12) {
        long j13 = j11 / 1000;
        long j14 = j12 / 1000;
        if (j13 == 0) {
            return 0L;
        }
        return j13 == j14 ? j13 : Math.max(0L, Math.min((j13 / getPreviewSliceGap()) * getPreviewSliceGap(), j14));
    }

    public final void f0() {
        qb.c.b(C, "hide preview", new Object[0]);
        this.f18278t.removeMessages(2);
        this.f18278t.removeMessages(3);
        Group previewArea = this.f18283y.f55373n;
        g0.o(previewArea, "previewArea");
        q.z(previewArea, false);
    }

    public final void g0(long j11) {
        if (this.f18282x) {
            return;
        }
        this.f18282x = true;
        dc0.c y72 = dc0.c.y7();
        rx.c<T> H4 = y72.H4(15L, TimeUnit.MILLISECONDS);
        final x00.l lVar = new x00.l() { // from class: jd.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c h02;
                h02 = VideoControllerView.h0(VideoControllerView.this, (Long) obj);
                return h02;
            }
        };
        rx.c I3 = H4.b2(new p() { // from class: jd.n
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c k02;
                k02 = VideoControllerView.k0(x00.l.this, obj);
                return k02;
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        final x00.l lVar2 = new x00.l() { // from class: jd.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l02;
                l02 = VideoControllerView.l0((Boolean) obj);
                return l02;
            }
        };
        this.f18281w = I3.u5(new wb0.b() { // from class: jd.p
            @Override // wb0.b
            public final void call(Object obj) {
                VideoControllerView.m0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: jd.q
            @Override // wb0.b
            public final void call(Object obj) {
                VideoControllerView.n0((Throwable) obj);
            }
        });
        Ref.LongRef longRef = new Ref.LongRef();
        long j12 = j11 / 1000;
        long j13 = this.f18261c / 1000;
        long previewSliceGap = j12 - getPreviewSliceGap();
        while (true) {
            if (j12 < j13) {
                o0(this, longRef, y72, j12);
                j12 += getPreviewSliceGap();
            }
            if (previewSliceGap > 0) {
                o0(this, longRef, y72, previewSliceGap);
                previewSliceGap -= getPreviewSliceGap();
            }
            if (previewSliceGap <= 0 && j12 >= j13) {
                o0(this, longRef, y72, j13);
                o0(this, longRef, y72, 0L);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18280v.unsubscribe();
        qb0.h hVar = this.f18281w;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f18278t.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ImageView noproguardBack = this.f18283y.f55363d;
        g0.o(noproguardBack, "noproguardBack");
        ImageView noproguardPlayOrPause = this.f18283y.f55364e;
        g0.o(noproguardPlayOrPause, "noproguardPlayOrPause");
        TextView noproguardSpeed = this.f18283y.f55371l;
        g0.o(noproguardSpeed, "noproguardSpeed");
        TextView noproguardSkip = this.f18283y.f55370k;
        g0.o(noproguardSkip, "noproguardSkip");
        q.s(new View[]{noproguardBack, noproguardPlayOrPause, noproguardSpeed, noproguardSkip}, 500, new x00.l() { // from class: jd.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r02;
                r02 = VideoControllerView.r0(VideoControllerView.this, (View) obj);
                return r02;
            }
        });
        ImageView noproguardScreenshot = this.f18283y.f55368i;
        g0.o(noproguardScreenshot, "noproguardScreenshot");
        q.t(noproguardScreenshot, 0, new x00.l() { // from class: jd.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s02;
                s02 = VideoControllerView.s0(VideoControllerView.this, (View) obj);
                return s02;
            }
        }, 1, null);
        this.f18283y.f55371l.setText(this.f18260b.b());
        G0();
        D0(false, false);
        setEnabled(false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@k MotionEvent event) {
        g0.p(event, "event");
        boolean onTouchEvent = this.f18284z.onTouchEvent(event);
        boolean z11 = event.getAction() == 1;
        if (onTouchEvent || !z11) {
            return onTouchEvent || super.onTouchEvent(event);
        }
        u0(this, false, 1, null);
        return true;
    }

    public final long q0(SeekBar seekBar) {
        return (long) ((seekBar.getProgress() / seekBar.getMax()) * this.f18261c);
    }

    public final void setFinished(boolean z11) {
        z0(z11);
    }

    public final void setOnControlListener(@k c listener) {
        g0.p(listener, "listener");
        this.f18259a = listener;
    }

    public final void setPlaying(boolean z11) {
        qb.c.b(C, "update playing: " + this.f18263e + " -> " + z11, new Object[0]);
        this.f18263e = z11;
        this.f18283y.f55364e.setImageResource(z11 ? R.drawable.ic_video_controller_pause : R.drawable.ic_video_controller_play);
    }

    public final void t0(boolean z11) {
        c cVar;
        String str = C;
        qb.c.b(str, "touch up: " + z11 + ", pendingHiding : " + this.f18270l, new Object[0]);
        if (this.f18269k) {
            this.f18278t.removeMessages(1);
            if (this.f18270l || !z11) {
                b bVar = this.f18278t;
                bVar.sendMessageDelayed(bVar.obtainMessage(1), 6000L);
            } else if (z11) {
                this.f18278t.obtainMessage(1).sendToTarget();
            }
        }
        if (this.f18265g && (cVar = this.f18259a) != null) {
            SeekBar noproguardSeeker = this.f18283y.f55369j;
            g0.o(noproguardSeeker, "noproguardSeeker");
            long q02 = q0(noproguardSeeker);
            qb.c.b(str, "onTouch seek: " + q02 + " / " + this.f18261c, new Object[0]);
            cVar.M(q02);
        }
        setScrolling(false);
        d0();
        f0();
    }

    public final void v0(@k Bitmap bitmap) {
        g0.p(bitmap, "bitmap");
        va.g.g(R.string.video_control_toast_screenshot_done, 0);
        this.f18283y.f55374o.setImageBitmap(bitmap);
        this.f18283y.f55374o.setForeground(ResourcesCompat.getDrawable(getResources(), R.drawable.fg_video_control_sceenshot_preview, null));
        this.f18283y.f55374o.setAlpha(0.0f);
        this.f18283y.f55374o.animate().alpha(1.0f).setListener(new g()).setDuration(150L).start();
    }

    public final void y0(d dVar) {
        Group previewArea = this.f18283y.f55373n;
        g0.o(previewArea, "previewArea");
        if (!q.m(previewArea)) {
            Group previewArea2 = this.f18283y.f55373n;
            g0.o(previewArea2, "previewArea");
            q.z(previewArea2, true);
            g0(dVar.f());
            qb.c.b(C, "show preview", new Object[0]);
        }
        Long valueOf = Long.valueOf(dVar.f());
        if (valueOf.longValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            TextView noproguardPreviewTime = this.f18283y.f55366g;
            g0.o(noproguardPreviewTime, "noproguardPreviewTime");
            C0(noproguardPreviewTime, longValue, this.f18261c);
            TextView textView = this.f18283y.f55366g;
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), dVar.e() ? R.drawable.ic_video_controller_forward : R.drawable.ic_video_controller_backward, null);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            } else {
                drawable = null;
            }
            textView.setCompoundDrawables(drawable, null, null, null);
            long e02 = e0(longValue, this.f18261c);
            long j11 = this.f18276r;
            if (j11 == -1 || j11 != e02) {
                qb.c.b(C, "matched: " + j11 + " -> " + e02, new Object[0]);
                this.f18276r = e02;
                this.f18279u.onNext(Long.valueOf(e02));
            }
            this.f18283y.f55369j.setProgress((int) ((longValue / this.f18261c) * 1000));
        }
    }

    public final void z0(boolean z11) {
        this.f18283y.f55370k.setActivated(z11);
        if (!z11 || this.f18283y.f55370k.isSelected()) {
            return;
        }
        this.f18283y.f55370k.setSelected(true);
        this.f18283y.f55370k.setText(getResources().getString(R.string.video_control_skip_activate));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public VideoControllerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public VideoControllerView(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public VideoControllerView(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
        this.f18260b = e.f18288b;
        this.f18261c = -1L;
        this.f18262d = -1L;
        this.f18266h = State.IDLE;
        this.f18271m = e0.c(new x00.a() { // from class: jd.h
            @Override // x00.a
            public final Object invoke() {
                int K0;
                K0 = VideoControllerView.K0(VideoControllerView.this);
                return Integer.valueOf(K0);
            }
        });
        this.f18272n = e0.c(new x00.a() { // from class: jd.s
            @Override // x00.a
            public final Object invoke() {
                int w02;
                w02 = VideoControllerView.w0(VideoControllerView.this);
                return Integer.valueOf(w02);
            }
        });
        this.f18273o = e0.c(new x00.a() { // from class: jd.u
            @Override // x00.a
            public final Object invoke() {
                int x02;
                x02 = VideoControllerView.x0(VideoControllerView.this);
                return Integer.valueOf(x02);
            }
        });
        this.f18274p = -1L;
        this.f18275q = -1L;
        this.f18276r = -1L;
        this.f18277s = -1L;
        this.f18278t = new b(this);
        dc0.c<Long> y72 = dc0.c.y7();
        this.f18279u = y72;
        io b11 = io.b(LayoutInflater.from(context), this);
        g0.o(b11, "inflate(...)");
        this.f18283y = b11;
        rx.c<Long> H4 = y72.H4(60L, TimeUnit.MILLISECONDS);
        final x00.l lVar = new x00.l() { // from class: jd.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c B2;
                B2 = VideoControllerView.B(VideoControllerView.this, (Long) obj);
                return B2;
            }
        };
        rx.c I3 = H4.b2(new p() { // from class: jd.w
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c C2;
                C2 = VideoControllerView.C(x00.l.this, obj);
                return C2;
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        final x00.l lVar2 = new x00.l() { // from class: jd.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 D2;
                D2 = VideoControllerView.D(VideoControllerView.this, (Bitmap) obj);
                return D2;
            }
        };
        qb0.h u52 = I3.u5(new wb0.b() { // from class: jd.y
            @Override // wb0.b
            public final void call(Object obj) {
                VideoControllerView.E(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: jd.z
            @Override // wb0.b
            public final void call(Object obj) {
                VideoControllerView.F((Throwable) obj);
            }
        });
        g0.o(u52, "subscribe(...)");
        this.f18280v = u52;
        this.f18284z = new GestureDetector(context, new f());
    }

    public /* synthetic */ VideoControllerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
