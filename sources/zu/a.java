package zu;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import nu.h;
import nu.i;
import nu.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@pu.e({ru.a.class})
@h
/* loaded from: classes8.dex */
public abstract class a {
    @j
    @i
    public static FragmentActivity b(Activity activity) {
        try {
            return (FragmentActivity) activity;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e11);
        }
    }

    @nu.a
    @cv.a
    public abstract Context a(Activity activity);
}
