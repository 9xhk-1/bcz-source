package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.client.business.widget.share.SharePanelViewV2;
import com.baicizhan.main.customview.PageLineDotIndicator;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class w0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f57249a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57250b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f57251c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final PageLineDotIndicator f57252d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final SharePanelViewV2 f57253e;

    /* renamed from: f, reason: collision with root package name */
    @Bindable
    public sd.u0 f57254f;

    /* renamed from: g, reason: collision with root package name */
    @Bindable
    public ObservableInt f57255g;

    public w0(Object _bindingComponent, View _root, int _localFieldCount, ImageView actionBarClose, ImageView actionBarMore, ViewPager2 imagePager, PageLineDotIndicator pagerTab, SharePanelViewV2 sharePanel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57249a = actionBarClose;
        this.f57250b = actionBarMore;
        this.f57251c = imagePager;
        this.f57252d = pagerTab;
        this.f57253e = sharePanel;
    }

    public static w0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static w0 c(@NonNull View view, @Nullable Object component) {
        return (w0) ViewDataBinding.bind(component, view, R.layout.activity_image_daka_v2);
    }

    @NonNull
    public static w0 g(@NonNull LayoutInflater inflater) {
        return j(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static w0 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return i(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static w0 i(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (w0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_image_daka_v2, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static w0 j(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (w0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_image_daka_v2, null, false, component);
    }

    @Nullable
    public ObservableInt d() {
        return this.f57255g;
    }

    @Nullable
    public sd.u0 e() {
        return this.f57254f;
    }

    public abstract void k(@Nullable ObservableInt dakaImageStatus);

    public abstract void l(@Nullable sd.u0 viewModel);
}
