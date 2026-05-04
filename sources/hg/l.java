package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<View, Boolean> f59296b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final int f59297c = 2131362105;

    /* renamed from: a, reason: collision with root package name */
    public boolean f59298a = false;

    public static void b(TextView textView, Context context) {
        if (textView == null || !com.baicizhan.base.a.a(context) || f(textView)) {
            return;
        }
        com.baicizhan.base.d.c(textView, context);
        g(textView);
    }

    public static boolean f(View view) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag(R.id.care_mode_applied_tag);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            return true;
        }
        return f59296b.containsKey(view);
    }

    public static void g(View view) {
        if (view != null) {
            Boolean bool = Boolean.TRUE;
            view.setTag(R.id.care_mode_applied_tag, bool);
            f59296b.put(view, bool);
        }
    }

    public void a(View rootView, Context context) {
        if (!com.baicizhan.base.a.a(context) || rootView == null || f(rootView)) {
            return;
        }
        if (rootView instanceof ViewGroup) {
            d((ViewGroup) rootView, context);
        } else if (rootView instanceof TextView) {
            c((TextView) rootView, context);
        }
        this.f59298a = true;
    }

    public final void c(TextView textView, Context context) {
        if (f(textView)) {
            return;
        }
        com.baicizhan.base.d.c(textView, context);
        g(textView);
    }

    public final void d(ViewGroup viewGroup, Context context) {
        g(viewGroup);
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (!f(childAt)) {
                if (childAt instanceof TextView) {
                    c((TextView) childAt, context);
                } else if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, context);
                }
            }
        }
    }

    public boolean e() {
        return this.f59298a;
    }

    public void h() {
        this.f59298a = false;
    }
}
