package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class fi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54936a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f54937b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54938c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54939d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54940e;

    public fi(@NonNull ConstraintLayout rootView, @NonNull View anchor, @NonNull ConstraintLayout guideWbExport, @NonNull ImageView line, @NonNull TextView tip) {
        this.f54936a = rootView;
        this.f54937b = anchor;
        this.f54938c = guideWbExport;
        this.f54939d = line;
        this.f54940e = tip;
    }

    @NonNull
    public static fi a(@NonNull View rootView) {
        int i11 = R.id.anchor;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.anchor);
        if (findChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i11 = R.id.line;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.line);
            if (imageView != null) {
                i11 = R.id.tip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                if (textView != null) {
                    return new fi(constraintLayout, findChildViewById, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static fi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static fi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_guide_word_book_export, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54936a;
    }
}
