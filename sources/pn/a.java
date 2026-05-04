package pn;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public abstract class a<V extends View> {

    /* renamed from: g, reason: collision with root package name */
    public static final String f80968g = "MaterialBackHelper";

    /* renamed from: h, reason: collision with root package name */
    public static final int f80969h = 300;

    /* renamed from: i, reason: collision with root package name */
    public static final int f80970i = 150;

    /* renamed from: j, reason: collision with root package name */
    public static final int f80971j = 100;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f80972a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final V f80973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80976e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public BackEventCompat f80977f;

    public a(@NonNull V v11) {
        this.f80973b = v11;
        Context context = v11.getContext();
        this.f80972a = j.g(context, R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
        this.f80974c = j.f(context, R.attr.motionDurationMedium2, 300);
        this.f80975d = j.f(context, R.attr.motionDurationShort3, 150);
        this.f80976e = j.f(context, R.attr.motionDurationShort2, 100);
    }

    public float a(float f11) {
        return this.f80972a.getInterpolation(f11);
    }

    @Nullable
    public BackEventCompat b() {
        if (this.f80977f == null) {
            Log.w(f80968g, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f80977f;
        this.f80977f = null;
        return backEventCompat;
    }

    @Nullable
    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f80977f;
        this.f80977f = null;
        return backEventCompat;
    }

    public void d(@NonNull BackEventCompat backEventCompat) {
        this.f80977f = backEventCompat;
    }

    @Nullable
    public BackEventCompat e(@NonNull BackEventCompat backEventCompat) {
        if (this.f80977f == null) {
            Log.w(f80968g, "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f80977f;
        this.f80977f = backEventCompat;
        return backEventCompat2;
    }
}
