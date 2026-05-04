package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class z4 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57730a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57731b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57732c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57733d;

    public z4(@NonNull LinearLayout rootView, @NonNull TextView month, @NonNull LinearLayout titles, @NonNull TextView year) {
        this.f57730a = rootView;
        this.f57731b = month;
        this.f57732c = titles;
        this.f57733d = year;
    }

    @NonNull
    public static z4 a(@NonNull View rootView) {
        int i11 = R.id.month;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.month);
        if (textView != null) {
            i11 = R.id.titles;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.titles);
            if (linearLayout != null) {
                i11 = R.id.year;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.year);
                if (textView2 != null) {
                    return new z4((LinearLayout) rootView, textView, linearLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static z4 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static z4 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.calendar_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57730a;
    }
}
