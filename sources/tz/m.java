package tz;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f91324a;

    public m(l lVar) {
        this.f91324a = lVar;
    }

    @Override // tz.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Runnable runnable;
        WeakReference weakReference;
        View decorView = activity.getWindow().getDecorView();
        runnable = this.f91324a.f91323g;
        decorView.post(runnable);
        this.f91324a.f91320d = new WeakReference(activity);
        l lVar = this.f91324a;
        weakReference = lVar.f91320d;
        lVar.e(weakReference);
    }
}
