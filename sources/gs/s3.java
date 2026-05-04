package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s3 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56702a;

    public s3(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout optionsContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56702a = optionsContainer;
    }

    public static s3 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static s3 c(@NonNull View view, @Nullable Object component) {
        return (s3) ViewDataBinding.bind(component, view, R.layout.ai_class_question_dialog);
    }

    @NonNull
    public static s3 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static s3 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static s3 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (s3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_question_dialog, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static s3 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (s3) ViewDataBinding.inflateInternal(inflater, R.layout.ai_class_question_dialog, null, false, component);
    }
}
