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
public final class d7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54600a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54601b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54602c;

    public d7(@NonNull LinearLayout rootView, @NonNull LinearLayout emptyView, @NonNull TextView text) {
        this.f54600a = rootView;
        this.f54601b = emptyView;
        this.f54602c = text;
    }

    @NonNull
    public static d7 a(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text);
        if (textView != null) {
            return new d7(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.text)));
    }

    @NonNull
    public static d7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static d7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.empty_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54600a;
    }
}
