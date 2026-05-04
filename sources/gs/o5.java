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
public final class o5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56181a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56182b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56183c;

    public o5(@NonNull LinearLayout rootView, @NonNull TextView category, @NonNull View divider) {
        this.f56181a = rootView;
        this.f56182b = category;
        this.f56183c = divider;
    }

    @NonNull
    public static o5 a(@NonNull View rootView) {
        int i11 = R.id.category;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.category);
        if (textView != null) {
            i11 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
            if (findChildViewById != null) {
                return new o5((LinearLayout) rootView, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static o5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static o5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.clear_category_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56181a;
    }
}
