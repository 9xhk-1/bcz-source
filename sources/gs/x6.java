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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class x6 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57409a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57410b;

    public x6(Object _bindingComponent, View _root, int _localFieldCount, TextView magicPromptMessage, TextView magicPromptTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57409a = magicPromptMessage;
        this.f57410b = magicPromptTitle;
    }

    public static x6 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static x6 c(@NonNull View view, @Nullable Object component) {
        return (x6) ViewDataBinding.bind(component, view, R.layout.dialog_wifi_tips_prompt);
    }

    @NonNull
    public static x6 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static x6 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static x6 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (x6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_wifi_tips_prompt, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static x6 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (x6) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_wifi_tips_prompt, null, false, component);
    }
}
