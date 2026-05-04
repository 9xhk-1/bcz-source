package r50;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f83079a = 100;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r50.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f83080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, g gVar) {
            super(activity);
            this.f83080b = gVar;
        }

        @Override // r50.a
        public void a() {
            this.f83080b.unregister();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        public final int f83082b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f83084d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f83085e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f83086f;

        /* renamed from: a, reason: collision with root package name */
        public final Rect f83081a = new Rect();

        /* renamed from: c, reason: collision with root package name */
        public boolean f83083c = false;

        public b(Activity activity, View view, d dVar) {
            this.f83084d = activity;
            this.f83085e = view;
            this.f83086f = dVar;
            this.f83082b = Math.round(s50.a.a(activity, 100.0f));
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f83085e.getWindowVisibleDisplayFrame(this.f83081a);
            boolean z11 = this.f83085e.getRootView().getHeight() - this.f83081a.height() > this.f83082b;
            if (z11 == this.f83083c) {
                return;
            }
            this.f83083c = z11;
            this.f83086f.a(z11);
        }
    }

    public static View a(Activity activity) {
        return ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
    }

    public static boolean b(Activity activity) {
        Rect rect = new Rect();
        View a11 = a(activity);
        int round = Math.round(s50.a.a(activity, 100.0f));
        a11.getWindowVisibleDisplayFrame(rect);
        return a11.getRootView().getHeight() - rect.height() > round;
    }

    public static g c(Activity activity, d dVar) {
        if (activity == null) {
            throw new NullPointerException("Parameter:activity must not be null");
        }
        if (dVar == null) {
            throw new NullPointerException("Parameter:listener must not be null");
        }
        View a11 = a(activity);
        b bVar = new b(activity, a11, dVar);
        a11.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        return new f(activity, bVar);
    }

    public static void d(Activity activity, d dVar) {
        activity.getApplication().registerActivityLifecycleCallbacks(new a(activity, c(activity, dVar)));
    }
}
