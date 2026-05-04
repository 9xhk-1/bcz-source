package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54894a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54895b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final zk f54896c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final al f54897d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54898e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54899f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54900g;

    public f9(@NonNull ConstraintLayout rootView, @NonNull TextView answerVerifyBtn, @NonNull zk optionContainer, @NonNull al patternWord, @NonNull LinearLayout recallLayout, @NonNull ImageView recallSwitchImage, @NonNull LinearLayout recallSwitchLayout) {
        this.f54894a = rootView;
        this.f54895b = answerVerifyBtn;
        this.f54896c = optionContainer;
        this.f54897d = patternWord;
        this.f54898e = recallLayout;
        this.f54899f = recallSwitchImage;
        this.f54900g = recallSwitchLayout;
    }

    @NonNull
    public static f9 a(@NonNull View rootView) {
        int i11 = R.id.answer_verify_btn;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.answer_verify_btn);
        if (textView != null) {
            i11 = R.id.option_container;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.option_container);
            if (findChildViewById != null) {
                zk a11 = zk.a(findChildViewById);
                i11 = R.id.pattern_word;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.pattern_word);
                if (findChildViewById2 != null) {
                    al a12 = al.a(findChildViewById2);
                    i11 = R.id.recall_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.recall_layout);
                    if (linearLayout != null) {
                        i11 = R.id.recall_switch_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.recall_switch_image);
                        if (imageView != null) {
                            i11 = R.id.recall_switch_layout;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.recall_switch_layout);
                            if (linearLayout2 != null) {
                                return new f9((ConstraintLayout) rootView, textView, a11, a12, linearLayout, imageView, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static f9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_word_to_pic_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54894a;
    }
}
