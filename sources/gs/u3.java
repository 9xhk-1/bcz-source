package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class u3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56951a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56952b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56953c;

    public u3(Object _bindingComponent, View _root, int _localFieldCount, TextView answer, FrameLayout answerContainer, ImageView mask) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56951a = answer;
        this.f56952b = answerContainer;
        this.f56953c = mask;
    }

    public static u3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static u3 c(@NonNull View view, @Nullable Object component) {
        return (u3) ViewDataBinding.bind(component, view, R.layout.ai_class_question_dialog_option_item);
    }

    @NonNull
    public static u3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static u3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static u3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (u3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_question_dialog_option_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static u3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (u3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_question_dialog_option_item, null, false, component);
    }
}
