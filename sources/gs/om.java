package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.ShowOffDragView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class om extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f56252a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56253b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56254c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56255d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56256e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f56257f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f56258g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final qm f56259h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f56260i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ShowOffDragView f56261j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f56262k;

    public om(Object _bindingComponent, View _root, int _localFieldCount, ImageView arrow1, ImageView arrow2, LinearLayout arrowContainer, ImageView bgCircle, ImageView bgRibbon, ImageView centerImg, ImageView close, qm dragCard, ImageView mainTitle, ShowOffDragView showOffDragView, ImageView subTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56252a = arrow1;
        this.f56253b = arrow2;
        this.f56254c = arrowContainer;
        this.f56255d = bgCircle;
        this.f56256e = bgRibbon;
        this.f56257f = centerImg;
        this.f56258g = close;
        this.f56259h = dragCard;
        this.f56260i = mainTitle;
        this.f56261j = showOffDragView;
        this.f56262k = subTitle;
    }

    public static om b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static om c(@NonNull View view, @Nullable Object component) {
        return (om) ViewDataBinding.bind(component, view, R.layout.showoff_drag_view);
    }

    @NonNull
    public static om d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static om e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static om g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (om) ViewDataBinding.inflateInternal(inflater, R.layout.showoff_drag_view, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static om h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (om) ViewDataBinding.inflateInternal(inflater, R.layout.showoff_drag_view, null, false, component);
    }
}
