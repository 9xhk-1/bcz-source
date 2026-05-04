package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55142a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f55143b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55144c;

    public h6(Object _bindingComponent, View _root, int _localFieldCount, TextView magicPromptMessage, RoundedImageView magicPromptPic, TextView magicPromptTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55142a = magicPromptMessage;
        this.f55143b = magicPromptPic;
        this.f55144c = magicPromptTitle;
    }

    public static h6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h6 c(@NonNull View view, @Nullable Object component) {
        return (h6) ViewDataBinding.bind(component, view, R.layout.dialog_beta_prompt);
    }

    @NonNull
    public static h6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_beta_prompt, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_beta_prompt, null, false, component);
    }
}
