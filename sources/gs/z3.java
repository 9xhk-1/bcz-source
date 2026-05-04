package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class z3 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57727a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57728b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57729c;

    public z3(@NonNull RelativeLayout rootView, @NonNull TextView cancelLoading, @NonNull ProgressBar loadingProgress) {
        this.f57727a = rootView;
        this.f57728b = cancelLoading;
        this.f57729c = loadingProgress;
    }

    @NonNull
    public static z3 a(@NonNull View rootView) {
        int i11 = R.id.cancel_loading;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_loading);
        if (textView != null) {
            i11 = R.id.loading_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.loading_progress);
            if (progressBar != null) {
                return new z3((RelativeLayout) rootView, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static z3 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static z3 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.asset_load_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57727a;
    }
}
