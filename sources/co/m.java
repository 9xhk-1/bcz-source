package co;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class m extends SharedElementCallback {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static WeakReference<View> f9467f;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Rect f9471d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9468a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9469b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9470c = false;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public d f9472e = new e();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Window f9473a;

        public a(Window window) {
            this.f9473a = window;
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.j(this.f9473a);
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f9473a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9475a;

        public b(Activity activity) {
            this.f9475a = activity;
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f9467f != null && (view = (View) m.f9467f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f9467f = null;
            }
            this.f9475a.finish();
            this.f9475a.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Window f9477a;

        public c(Window window) {
            this.f9477a = window;
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f9477a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        @Nullable
        vn.p a(@NonNull View view);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // co.m.d
        @Nullable
        public vn.p a(@NonNull View view) {
            if (view instanceof vn.t) {
                return ((vn.t) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @Nullable
    public static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    public static void i(Window window) {
        Drawable f11 = f(window);
        if (f11 == null) {
            return;
        }
        f11.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
    }

    public static void j(Window window) {
        Drawable f11 = f(window);
        if (f11 == null) {
            return;
        }
        f11.mutate().clearColorFilter();
    }

    public static void p(Window window, l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @Nullable
    public d e() {
        return this.f9472e;
    }

    public boolean g() {
        return this.f9470c;
    }

    public boolean h() {
        return this.f9469b;
    }

    public void k(@Nullable d dVar) {
        this.f9472e = dVar;
    }

    public void l(boolean z11) {
        this.f9470c = z11;
    }

    public void m(boolean z11) {
        this.f9469b = z11;
    }

    public final void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f9470c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f9469b) {
                p(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    public final void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.g0(true);
            lVar.addListener(new b(activity));
            if (this.f9469b) {
                p(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f9467f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        vn.p a11;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f9467f) != null && this.f9472e != null && (view = weakReference.get()) != null && (a11 = this.f9472e.a(view)) != null) {
            onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, a11);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity a11;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (a11 = com.google.android.material.internal.c.a(view.getContext())) == null) {
            return;
        }
        Window window = a11.getWindow();
        if (this.f9468a) {
            n(window);
        } else {
            o(a11, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i11 = R.id.mtrl_motion_snapshot_view;
            if (view.getTag(i11) instanceof View) {
                list2.get(0).setTag(i11, null);
            }
        }
        if (!this.f9468a && !list2.isEmpty()) {
            this.f9471d = w.j(list2.get(0));
        }
        this.f9468a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f9468a || list2.isEmpty() || this.f9471d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f9471d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9471d.height(), 1073741824));
        Rect rect = this.f9471d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
