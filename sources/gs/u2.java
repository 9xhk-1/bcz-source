package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class u2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56941a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56942b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f56943c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f56944d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56945e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56946f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56947g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56948h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56949i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56950j;

    public u2(@NonNull ConstraintLayout rootView, @NonNull ImageView close, @NonNull Guideline guideline, @NonNull Guideline guidelineBottom, @NonNull FrameLayout listeningType, @NonNull FrameLayout readingType, @NonNull TextView testListening, @NonNull TextView testReading, @NonNull TextView tip, @NonNull TextView title) {
        this.f56941a = rootView;
        this.f56942b = close;
        this.f56943c = guideline;
        this.f56944d = guidelineBottom;
        this.f56945e = listeningType;
        this.f56946f = readingType;
        this.f56947g = testListening;
        this.f56948h = testReading;
        this.f56949i = tip;
        this.f56950j = title;
    }

    @NonNull
    public static u2 a(@NonNull View rootView) {
        int i11 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close);
        if (imageView != null) {
            i11 = R.id.guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline);
            if (guideline != null) {
                i11 = R.id.guideline_bottom;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline_bottom);
                if (guideline2 != null) {
                    i11 = R.id.listening_type;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.listening_type);
                    if (frameLayout != null) {
                        i11 = R.id.reading_type;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.reading_type);
                        if (frameLayout2 != null) {
                            i11 = R.id.test_listening;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.test_listening);
                            if (textView != null) {
                                i11 = R.id.test_reading;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.test_reading);
                                if (textView2 != null) {
                                    i11 = R.id.tip;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                                    if (textView3 != null) {
                                        i11 = R.id.title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                        if (textView4 != null) {
                                            return new u2((ConstraintLayout) rootView, imageView, guideline, guideline2, frameLayout, frameLayout2, textView, textView2, textView3, textView4);
                                        }
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
    public static u2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static u2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_vocabulary_test_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56941a;
    }
}
