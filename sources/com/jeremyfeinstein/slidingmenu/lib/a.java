package com.jeremyfeinstein.slidingmenu.lib;

import android.graphics.Canvas;
import android.view.animation.Interpolator;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static Interpolator f38884b = new InterpolatorC0468a();

    /* renamed from: a, reason: collision with root package name */
    public SlidingMenu.c f38885a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements SlidingMenu.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Interpolator f38887a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38888b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38889c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38890d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f38891e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f38892f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f38893g;

        public c(final Interpolator val$interp, final int val$openedX, final int val$closedX, final int val$openedY, final int val$closedY, final int val$px, final int val$py) {
            this.f38887a = val$interp;
            this.f38888b = val$openedX;
            this.f38889c = val$closedX;
            this.f38890d = val$openedY;
            this.f38891e = val$closedY;
            this.f38892f = val$px;
            this.f38893g = val$py;
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.c
        public void a(Canvas canvas, float percentOpen) {
            a.this.f38885a.a(canvas, percentOpen);
            float interpolation = this.f38887a.getInterpolation(percentOpen);
            int i11 = this.f38888b;
            float f11 = ((i11 - r1) * interpolation) + this.f38889c;
            int i12 = this.f38890d;
            canvas.scale(f11, ((i12 - r2) * interpolation) + this.f38891e, this.f38892f, this.f38893g);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements SlidingMenu.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Interpolator f38895a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38896b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38897c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38898d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f38899e;

        public d(final Interpolator val$interp, final int val$openedDeg, final int val$closedDeg, final int val$px, final int val$py) {
            this.f38895a = val$interp;
            this.f38896b = val$openedDeg;
            this.f38897c = val$closedDeg;
            this.f38898d = val$px;
            this.f38899e = val$py;
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.c
        public void a(Canvas canvas, float percentOpen) {
            a.this.f38885a.a(canvas, percentOpen);
            float interpolation = this.f38895a.getInterpolation(percentOpen);
            int i11 = this.f38896b;
            canvas.rotate(((i11 - r1) * interpolation) + this.f38897c, this.f38898d, this.f38899e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements SlidingMenu.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Interpolator f38901a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38902b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38903c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38904d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f38905e;

        public e(final Interpolator val$interp, final int val$openedX, final int val$closedX, final int val$openedY, final int val$closedY) {
            this.f38901a = val$interp;
            this.f38902b = val$openedX;
            this.f38903c = val$closedX;
            this.f38904d = val$openedY;
            this.f38905e = val$closedY;
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.c
        public void a(Canvas canvas, float percentOpen) {
            a.this.f38885a.a(canvas, percentOpen);
            float interpolation = this.f38901a.getInterpolation(percentOpen);
            int i11 = this.f38902b;
            float f11 = ((i11 - r1) * interpolation) + this.f38903c;
            int i12 = this.f38904d;
            canvas.translate(f11, ((i12 - r2) * interpolation) + this.f38905e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements SlidingMenu.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SlidingMenu.c f38907a;

        public f(final SlidingMenu.c val$t) {
            this.f38907a = val$t;
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.c
        public void a(Canvas canvas, float percentOpen) {
            a.this.f38885a.a(canvas, percentOpen);
            this.f38907a.a(canvas, percentOpen);
        }
    }

    public SlidingMenu.c b(final SlidingMenu.c t11) {
        c();
        f fVar = new f(t11);
        this.f38885a = fVar;
        return fVar;
    }

    public final void c() {
        if (this.f38885a == null) {
            this.f38885a = new b();
        }
    }

    public SlidingMenu.c d(final int openedDeg, final int closedDeg, final int px2, final int py2) {
        return e(openedDeg, closedDeg, px2, py2, f38884b);
    }

    public SlidingMenu.c e(final int openedDeg, final int closedDeg, final int px2, final int py2, final Interpolator interp) {
        c();
        d dVar = new d(interp, openedDeg, closedDeg, px2, py2);
        this.f38885a = dVar;
        return dVar;
    }

    public SlidingMenu.c f(final int openedX, final int closedX, final int openedY, final int closedY) {
        return g(openedX, closedX, openedY, closedY, f38884b);
    }

    public SlidingMenu.c g(final int openedX, final int closedX, final int openedY, final int closedY, final Interpolator interp) {
        c();
        e eVar = new e(interp, openedX, closedX, openedY, closedY);
        this.f38885a = eVar;
        return eVar;
    }

    public SlidingMenu.c h(final int openedX, final int closedX, final int openedY, final int closedY, final int px2, final int py2) {
        return i(openedX, closedX, openedY, closedY, px2, py2, f38884b);
    }

    public SlidingMenu.c i(final int openedX, final int closedX, final int openedY, final int closedY, final int px2, final int py2, final Interpolator interp) {
        c();
        c cVar = new c(interp, openedX, closedX, openedY, closedY, px2, py2);
        this.f38885a = cVar;
        return cVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.jeremyfeinstein.slidingmenu.lib.a$a, reason: collision with other inner class name */
    public class InterpolatorC0468a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t11) {
            return t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements SlidingMenu.c {
        public b() {
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.c
        public void a(Canvas canvas, float percentOpen) {
        }
    }
}
