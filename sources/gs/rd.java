package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class rd implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56640a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56641b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56642c;

    public rd(@NonNull ConstraintLayout rootView, @NonNull TextView switchType, @NonNull TextView title) {
        this.f56640a = rootView;
        this.f56641b = switchType;
        this.f56642c = title;
    }

    @NonNull
    public static rd a(@NonNull View rootView) {
        int i11 = R.id.switch_type;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.switch_type);
        if (textView != null) {
            i11 = R.id.title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
            if (textView2 != null) {
                return new rd((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static rd c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static rd d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_books_group, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56640a;
    }
}
