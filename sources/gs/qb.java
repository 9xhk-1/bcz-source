package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class qb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56478a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56479b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56480c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ScrollView f56481d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final rb f56482e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final rb f56483f;

    public qb(@NonNull RelativeLayout rootView, @NonNull ImageView close, @NonNull View divider, @NonNull ScrollView panel, @NonNull rb topic1, @NonNull rb topic2) {
        this.f56478a = rootView;
        this.f56479b = close;
        this.f56480c = divider;
        this.f56481d = panel;
        this.f56482e = topic1;
        this.f56483f = topic2;
    }

    @NonNull
    public static qb a(@NonNull View rootView) {
        int i11 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close);
        if (imageView != null) {
            i11 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
            if (findChildViewById != null) {
                i11 = R.id.panel;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.panel);
                if (scrollView != null) {
                    i11 = R.id.topic1;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.topic1);
                    if (findChildViewById2 != null) {
                        rb a11 = rb.a(findChildViewById2);
                        i11 = R.id.topic2;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.topic2);
                        if (findChildViewById3 != null) {
                            return new qb((RelativeLayout) rootView, imageView, findChildViewById, scrollView, a11, rb.a(findChildViewById3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static qb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static qb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_wiki_diff_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56478a;
    }
}
