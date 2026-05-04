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
public final class ni implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56074a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f56075b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56076c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56077d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56078e;

    public ni(@NonNull ConstraintLayout rootView, @NonNull View anchor, @NonNull ImageView line, @NonNull ConstraintLayout mainGuideExamAssistant, @NonNull TextView tip) {
        this.f56074a = rootView;
        this.f56075b = anchor;
        this.f56076c = line;
        this.f56077d = mainGuideExamAssistant;
        this.f56078e = tip;
    }

    @NonNull
    public static ni a(@NonNull View rootView) {
        int i11 = R.id.anchor;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.anchor);
        if (findChildViewById != null) {
            i11 = R.id.line;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.line);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                i11 = R.id.tip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                if (textView != null) {
                    return new ni(constraintLayout, findChildViewById, imageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ni c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ni d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_main_guide_golden_exam_assistant, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56074a;
    }
}
