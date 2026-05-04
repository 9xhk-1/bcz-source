package zu;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import tv.h;
import tv.s;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x("dagger.Reusable")
@tv.e
/* loaded from: classes8.dex */
public final class b implements h<FragmentActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Activity> f102900a;

    public b(t<Activity> activityProvider) {
        this.f102900a = activityProvider;
    }

    public static b a(t<Activity> activityProvider) {
        return new b(activityProvider);
    }

    public static FragmentActivity c(Activity activity) {
        return (FragmentActivity) s.f(a.b(activity));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentActivity get() {
        return c(this.f102900a.get());
    }
}
