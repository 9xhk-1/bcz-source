package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class nj extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56079a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56080b;

    /* renamed from: c, reason: collision with root package name */
    @Bindable
    public String f56081c;

    /* renamed from: d, reason: collision with root package name */
    @Bindable
    public String f56082d;

    /* renamed from: e, reason: collision with root package name */
    @Bindable
    public boolean f56083e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f56084f;

    public nj(Object _bindingComponent, View _root, int _localFieldCount, TextView mean, TextView word) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56079a = mean;
        this.f56080b = word;
    }

    public static nj b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static nj c(@NonNull View view, @Nullable Object component) {
        return (nj) ViewDataBinding.bind(component, view, R.layout.learning_calendarview_word_item);
    }

    @NonNull
    public static nj i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static nj j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static nj k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (nj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_word_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static nj l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (nj) ViewDataBinding.inflateInternal(inflater, R.layout.learning_calendarview_word_item, null, false, component);
    }

    @Nullable
    public String d() {
        return this.f56081c;
    }

    @Nullable
    public String e() {
        return this.f56082d;
    }

    @Nullable
    public View.OnClickListener g() {
        return this.f56084f;
    }

    public boolean h() {
        return this.f56083e;
    }

    public abstract void m(@Nullable String learnWord);

    public abstract void n(@Nullable String learnWordMean);

    public abstract void o(@Nullable View.OnClickListener onClick);

    public abstract void p(boolean showDivider);
}
