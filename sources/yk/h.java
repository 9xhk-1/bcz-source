package yk;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import sk.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes6.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set<Activity> f100169a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f100170b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f100171a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: yk.h$a$a, reason: collision with other inner class name */
        public class RunnableC1368a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f100173a;

            public RunnableC1368a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f100173a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0.c().i();
                h.this.f100170b = true;
                h.b(a.this.f100171a, this.f100173a);
                h.this.f100169a.clear();
            }
        }

        public a(View view) {
            this.f100171a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            fl.o.z(new RunnableC1368a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // yk.i
    public void a(Activity activity) {
        if (!this.f100170b && this.f100169a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
