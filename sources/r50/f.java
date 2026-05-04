package r50;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f83087a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f83088b;

    public f(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f83087a = new WeakReference<>(activity);
        this.f83088b = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // r50.g
    public void unregister() {
        Activity activity = this.f83087a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f83088b.get();
        if (activity != null && onGlobalLayoutListener != null) {
            c.a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f83087a.clear();
        this.f83088b.clear();
    }
}
