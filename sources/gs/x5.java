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
public final class x5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57407a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57408b;

    public x5(@NonNull LinearLayout rootView, @NonNull TextView tvContent) {
        this.f57407a = rootView;
        this.f57408b = tvContent;
    }

    @NonNull
    public static x5 a(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvContent);
        if (textView != null) {
            return new x5((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tvContent)));
    }

    @NonNull
    public static x5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static x5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.custom_marker_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57407a;
    }
}
