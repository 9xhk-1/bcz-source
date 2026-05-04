package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class y3 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57543a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57544b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57545c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57546d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f57547e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57548f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57549g;

    public y3(@NonNull FrameLayout rootView, @NonNull TextView confirm, @NonNull ConstraintLayout container, @NonNull TextView content, @NonNull NestedScrollView contentArea, @NonNull TextView refuse, @NonNull TextView title) {
        this.f57543a = rootView;
        this.f57544b = confirm;
        this.f57545c = container;
        this.f57546d = content;
        this.f57547e = contentArea;
        this.f57548f = refuse;
        this.f57549g = title;
    }

    @NonNull
    public static y3 a(@NonNull View rootView) {
        int i11 = R.id.confirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
        if (textView != null) {
            i11 = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
            if (constraintLayout != null) {
                i11 = R.id.content;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.content);
                if (textView2 != null) {
                    i11 = R.id.content_area;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.content_area);
                    if (nestedScrollView != null) {
                        i11 = R.id.refuse;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.refuse);
                        if (textView3 != null) {
                            i11 = R.id.title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView4 != null) {
                                return new y3((FrameLayout) rootView, textView, constraintLayout, textView2, nestedScrollView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static y3 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static y3 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.app_protocol_upgrade_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57543a;
    }
}
