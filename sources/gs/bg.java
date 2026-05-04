package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.view.FlowRadioGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class bg extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FlowRadioGroup f54288a;

    public bg(Object _bindingComponent, View _root, int _localFieldCount, FlowRadioGroup radioGroup) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54288a = radioGroup;
    }

    public static bg b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static bg c(@NonNull View view, @Nullable Object component) {
        return (bg) ViewDataBinding.bind(component, view, R.layout.item_wiki_list_flow_radio);
    }

    @NonNull
    public static bg d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static bg e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static bg g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (bg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_list_flow_radio, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static bg h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (bg) ViewDataBinding.inflateInternal(inflater, R.layout.item_wiki_list_flow_radio, null, false, component);
    }
}
