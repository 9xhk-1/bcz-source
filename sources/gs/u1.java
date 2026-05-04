package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class u1 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56932a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56933b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f56934c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56935d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56936e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56937f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56938g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56939h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56940i;

    public u1(@NonNull ConstraintLayout rootView, @NonNull TextView confirm, @NonNull View divider, @NonNull ImageView logo, @NonNull TextView protocolContent, @NonNull TextView refuse, @NonNull NestedScrollView scrollview, @NonNull TextView subtitle, @NonNull TextView title) {
        this.f56932a = rootView;
        this.f56933b = confirm;
        this.f56934c = divider;
        this.f56935d = logo;
        this.f56936e = protocolContent;
        this.f56937f = refuse;
        this.f56938g = scrollview;
        this.f56939h = subtitle;
        this.f56940i = title;
    }

    @NonNull
    public static u1 a(@NonNull View rootView) {
        int i11 = R.id.confirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
        if (textView != null) {
            i11 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
            if (findChildViewById != null) {
                i11 = R.id.logo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.logo);
                if (imageView != null) {
                    i11 = R.id.protocol_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.protocol_content);
                    if (textView2 != null) {
                        i11 = R.id.refuse;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.refuse);
                        if (textView3 != null) {
                            i11 = R.id.scrollview;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollview);
                            if (nestedScrollView != null) {
                                i11 = R.id.subtitle;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                                if (textView4 != null) {
                                    i11 = R.id.title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                    if (textView5 != null) {
                                        return new u1((ConstraintLayout) rootView, textView, findChildViewById, imageView, textView2, textView3, nestedScrollView, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static u1 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static u1 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_protocol, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56932a;
    }
}
