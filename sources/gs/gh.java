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
public final class gh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55071a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55072b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55073c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55074d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55075e;

    public gh(@NonNull ConstraintLayout rootView, @NonNull View bgArea, @NonNull TextView extraDesc, @NonNull TextView extraEnter, @NonNull TextView extraTitle) {
        this.f55071a = rootView;
        this.f55072b = bgArea;
        this.f55073c = extraDesc;
        this.f55074d = extraEnter;
        this.f55075e = extraTitle;
    }

    @NonNull
    public static gh a(@NonNull View rootView) {
        int i11 = R.id.bg_area;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_area);
        if (findChildViewById != null) {
            i11 = R.id.extra_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.extra_desc);
            if (textView != null) {
                i11 = R.id.extra_enter;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.extra_enter);
                if (textView2 != null) {
                    i11 = R.id.extra_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.extra_title);
                    if (textView3 != null) {
                        return new gh((ConstraintLayout) rootView, findChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static gh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_word_extra, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f55071a;
    }
}
