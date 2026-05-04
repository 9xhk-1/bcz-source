package com.esotericsoftware.spine.android;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.NonNull;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.esotericsoftware.spine.android.bounds.Alignment;
import com.esotericsoftware.spine.android.bounds.ContentMode;
import java.io.File;
import java.net.URL;
import ll.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SpineView extends View implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f29265a;

    /* renamed from: b, reason: collision with root package name */
    public float f29266b;

    /* renamed from: c, reason: collision with root package name */
    public float f29267c;

    /* renamed from: d, reason: collision with root package name */
    public float f29268d;

    /* renamed from: e, reason: collision with root package name */
    public float f29269e;

    /* renamed from: f, reason: collision with root package name */
    public float f29270f;

    /* renamed from: g, reason: collision with root package name */
    public float f29271g;

    /* renamed from: h, reason: collision with root package name */
    public float f29272h;

    /* renamed from: i, reason: collision with root package name */
    public final com.esotericsoftware.spine.android.b f29273i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f29274j;

    /* renamed from: k, reason: collision with root package name */
    public ll.a f29275k;

    /* renamed from: l, reason: collision with root package name */
    public c f29276l;

    /* renamed from: m, reason: collision with root package name */
    public ll.b f29277m;

    /* renamed from: n, reason: collision with root package name */
    public Alignment f29278n;

    /* renamed from: o, reason: collision with root package name */
    public ContentMode f29279o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29280p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29281a;

        static {
            int[] iArr = new int[ContentMode.values().length];
            f29281a = iArr;
            try {
                iArr[ContentMode.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29281a[ContentMode.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f29282a;

        /* renamed from: b, reason: collision with root package name */
        public final c f29283b;

        /* renamed from: c, reason: collision with root package name */
        public String f29284c;

        /* renamed from: d, reason: collision with root package name */
        public String f29285d;

        /* renamed from: e, reason: collision with root package name */
        public File f29286e;

        /* renamed from: f, reason: collision with root package name */
        public File f29287f;

        /* renamed from: g, reason: collision with root package name */
        public URL f29288g;

        /* renamed from: h, reason: collision with root package name */
        public URL f29289h;

        /* renamed from: i, reason: collision with root package name */
        public File f29290i;

        /* renamed from: j, reason: collision with root package name */
        public kl.b f29291j;

        /* renamed from: k, reason: collision with root package name */
        public ll.b f29292k = new d();

        /* renamed from: l, reason: collision with root package name */
        public Alignment f29293l = Alignment.CENTER;

        /* renamed from: m, reason: collision with root package name */
        public ContentMode f29294m = ContentMode.FIT;

        public b(Context context, c cVar) {
            this.f29282a = context;
            this.f29283b = cVar;
        }

        public SpineView a() {
            URL url;
            File file;
            File file2;
            String str;
            SpineView spineView = new SpineView(this.f29282a, this.f29283b);
            spineView.f29277m = this.f29292k;
            spineView.f29278n = this.f29293l;
            spineView.f29279o = this.f29294m;
            String str2 = this.f29284c;
            if (str2 != null && (str = this.f29285d) != null) {
                spineView.l(str2, str);
                return spineView;
            }
            File file3 = this.f29286e;
            if (file3 != null && (file2 = this.f29287f) != null) {
                spineView.q(file3, file2);
                return spineView;
            }
            URL url2 = this.f29288g;
            if (url2 != null && (url = this.f29289h) != null && (file = this.f29290i) != null) {
                spineView.s(url2, url, file);
                return spineView;
            }
            kl.b bVar = this.f29291j;
            if (bVar != null) {
                spineView.o(bVar);
            }
            return spineView;
        }

        public b b(Alignment alignment) {
            this.f29293l = alignment;
            return this;
        }

        public b c(ll.b bVar) {
            this.f29292k = bVar;
            return this;
        }

        public b d(ContentMode contentMode) {
            this.f29294m = contentMode;
            return this;
        }

        public b e(String str, String str2) {
            this.f29284c = str;
            this.f29285d = str2;
            return this;
        }

        public b f(kl.b bVar) {
            this.f29291j = bVar;
            return this;
        }

        public b g(File file, File file2) {
            this.f29286e = file;
            this.f29287f = file2;
            return this;
        }

        public b h(URL url, URL url2, File file) {
            this.f29288g = url;
            this.f29289h = url2;
            this.f29290i = file;
            return this;
        }
    }

    public SpineView(Context context, c cVar) {
        super(context);
        this.f29265a = 0L;
        this.f29266b = 0.0f;
        this.f29267c = 0.0f;
        this.f29268d = 0.0f;
        this.f29269e = 1.0f;
        this.f29270f = 1.0f;
        this.f29271g = 0.0f;
        this.f29272h = 0.0f;
        this.f29273i = new com.esotericsoftware.spine.android.b();
        this.f29274j = Boolean.TRUE;
        this.f29275k = new ll.a();
        this.f29277m = new d();
        this.f29278n = Alignment.CENTER;
        this.f29279o = ContentMode.FIT;
        this.f29280p = false;
        this.f29276l = cVar;
        if (Build.VERSION.SDK_INT < 29) {
            setLayerType(1, null);
        }
    }

    public static /* synthetic */ void a(final SpineView spineView, ml.a aVar, Handler handler) {
        spineView.getClass();
        final kl.b load = aVar.load();
        handler.post(new Runnable() { // from class: kl.j
            @Override // java.lang.Runnable
            public final void run() {
                SpineView.e(SpineView.this, load);
            }
        });
    }

    public static /* synthetic */ void e(SpineView spineView, kl.b bVar) {
        spineView.f29275k = spineView.f29277m.a(bVar);
        spineView.t();
        spineView.f29276l.o(bVar);
        Choreographer.getInstance().postFrameCallback(spineView);
    }

    public static SpineView m(String str, String str2, Context context, c cVar) {
        SpineView spineView = new SpineView(context, cVar);
        spineView.l(str, str2);
        return spineView;
    }

    public static SpineView n(kl.b bVar, Context context, c cVar) {
        SpineView spineView = new SpineView(context, cVar);
        spineView.o(bVar);
        return spineView;
    }

    public static SpineView p(File file, File file2, Context context, c cVar) {
        SpineView spineView = new SpineView(context, cVar);
        spineView.q(file, file2);
        return spineView;
    }

    public static SpineView r(URL url, URL url2, File file, Context context, c cVar) {
        SpineView spineView = new SpineView(context, cVar);
        spineView.s(url, url2, file);
        return spineView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        if (this.f29280p) {
            if (this.f29265a != 0) {
                this.f29266b = (j11 - r0) / 1.0E9f;
            }
            this.f29265a = j11;
            invalidate();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public Alignment getAlignment() {
        return this.f29278n;
    }

    public ll.b getBoundsProvider() {
        return this.f29277m;
    }

    public ContentMode getContentMode() {
        return this.f29279o;
    }

    public c getController() {
        return this.f29276l;
    }

    public Boolean j() {
        return this.f29274j;
    }

    public final void k(final ml.a aVar) {
        final Handler handler = new Handler(Looper.getMainLooper());
        new Thread(new Runnable() { // from class: kl.n
            @Override // java.lang.Runnable
            public final void run() {
                SpineView.a(SpineView.this, aVar, handler);
            }
        }).start();
    }

    public void l(final String str, final String str2) {
        k(new ml.a() { // from class: kl.k
            @Override // ml.a
            public final b load() {
                b a11;
                a11 = b.a(str, str2, SpineView.this.getContext());
                return a11;
            }
        });
    }

    public void o(final kl.b bVar) {
        k(new ml.a() { // from class: kl.o
            @Override // ml.a
            public final b load() {
                return SpineView.b(b.this);
            }
        });
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29280p = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29280p = false;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        c cVar = this.f29276l;
        if (cVar != null && cVar.p() && this.f29274j.booleanValue()) {
            if (this.f29276l.q()) {
                this.f29276l.h();
                this.f29276l.l().i(this.f29266b);
                this.f29276l.f();
            }
            canvas.save();
            canvas.translate(this.f29267c, this.f29268d);
            canvas.scale(this.f29269e, this.f29270f * (-1.0f));
            canvas.translate(this.f29271g, this.f29272h);
            this.f29276l.g(canvas);
            com.badlogic.gdx.utils.a<b.C0343b> a11 = this.f29273i.a(this.f29276l.m());
            this.f29273i.c(canvas, a11);
            this.f29276l.e(canvas, a11);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        t();
    }

    public void q(final File file, final File file2) {
        k(new ml.a() { // from class: kl.l
            @Override // ml.a
            public final b load() {
                b b11;
                b11 = b.b(file, file2);
                return b11;
            }
        });
    }

    public void s(final URL url, final URL url2, final File file) {
        k(new ml.a() { // from class: kl.m
            @Override // ml.a
            public final b load() {
                b c11;
                c11 = b.c(url, url2, file);
                return c11;
            }
        });
    }

    public void setAlignment(Alignment alignment) {
        this.f29278n = alignment;
        t();
    }

    public void setBoundsProvider(ll.b bVar) {
        this.f29277m = bVar;
        t();
    }

    public void setContentMode(ContentMode contentMode) {
        this.f29279o = contentMode;
        t();
    }

    public void setController(c cVar) {
        this.f29276l = cVar;
    }

    public void setRendering(Boolean bool) {
        this.f29274j = bool;
    }

    public final void t() {
        if (this.f29276l == null) {
            return;
        }
        this.f29271g = (float) (((-this.f29275k.c()) - (this.f29275k.b() / 2.0d)) - ((this.f29278n.getX() * this.f29275k.b()) / 2.0d));
        this.f29272h = (float) (((-this.f29275k.d()) - (this.f29275k.a() / 2.0d)) - ((this.f29278n.getY() * this.f29275k.a()) / 2.0d));
        int i11 = a.f29281a[this.f29279o.ordinal()];
        if (i11 == 1) {
            float min = (float) Math.min(getWidth() / this.f29275k.b(), getHeight() / this.f29275k.a());
            this.f29270f = min;
            this.f29269e = min;
        } else if (i11 == 2) {
            float max = (float) Math.max(getWidth() / this.f29275k.b(), getHeight() / this.f29275k.a());
            this.f29270f = max;
            this.f29269e = max;
        }
        this.f29267c = (float) ((getWidth() / 2.0d) + ((this.f29278n.getX() * getWidth()) / 2.0d));
        this.f29268d = (float) ((getHeight() / 2.0d) + ((this.f29278n.getY() * getHeight()) / 2.0d));
        c cVar = this.f29276l;
        float f11 = this.f29271g;
        float f12 = this.f29267c;
        float f13 = this.f29269e;
        float f14 = this.f29272h;
        cVar.t(f11 + (f12 / f13), f14 + (r0 / r6), f13, this.f29270f);
    }

    public SpineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29265a = 0L;
        this.f29266b = 0.0f;
        this.f29267c = 0.0f;
        this.f29268d = 0.0f;
        this.f29269e = 1.0f;
        this.f29270f = 1.0f;
        this.f29271g = 0.0f;
        this.f29272h = 0.0f;
        this.f29273i = new com.esotericsoftware.spine.android.b();
        this.f29274j = Boolean.TRUE;
        this.f29275k = new ll.a();
        this.f29277m = new d();
        this.f29278n = Alignment.CENTER;
        this.f29279o = ContentMode.FIT;
        this.f29280p = false;
    }

    public static /* synthetic */ kl.b b(kl.b bVar) {
        return bVar;
    }

    public SpineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f29265a = 0L;
        this.f29266b = 0.0f;
        this.f29267c = 0.0f;
        this.f29268d = 0.0f;
        this.f29269e = 1.0f;
        this.f29270f = 1.0f;
        this.f29271g = 0.0f;
        this.f29272h = 0.0f;
        this.f29273i = new com.esotericsoftware.spine.android.b();
        this.f29274j = Boolean.TRUE;
        this.f29275k = new ll.a();
        this.f29277m = new d();
        this.f29278n = Alignment.CENTER;
        this.f29279o = ContentMode.FIT;
        this.f29280p = false;
    }
}
