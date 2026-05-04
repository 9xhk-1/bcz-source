package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class vi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57193a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f57194b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f57195c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57196d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f57197e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57198f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57199g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final gj f57200h;

    public vi(@NonNull ConstraintLayout rootView, @NonNull Guideline contentLeftGuideline, @NonNull Guideline contentRightGuideline, @NonNull ImageView expand, @NonNull View expandedArea, @NonNull ConstraintLayout root, @NonNull TextView title, @NonNull gj topDivider) {
        this.f57193a = rootView;
        this.f57194b = contentLeftGuideline;
        this.f57195c = contentRightGuideline;
        this.f57196d = expand;
        this.f57197e = expandedArea;
        this.f57198f = root;
        this.f57199g = title;
        this.f57200h = topDivider;
    }

    @NonNull
    public static vi a(@NonNull View rootView) {
        int i11 = R.id.content_left_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.content_left_guideline);
        if (guideline != null) {
            i11 = R.id.content_right_guideline;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.content_right_guideline);
            if (guideline2 != null) {
                i11 = R.id.expand;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expand);
                if (imageView != null) {
                    i11 = R.id.expanded_area;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.expanded_area);
                    if (findChildViewById != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                        i11 = R.id.title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                        if (textView != null) {
                            i11 = R.id.top_divider;
                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.top_divider);
                            if (findChildViewById2 != null) {
                                return new vi(constraintLayout, guideline, guideline2, imageView, findChildViewById, constraintLayout, textView, gj.a(findChildViewById2));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static vi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static vi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_item_basic_title, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57193a;
    }
}
