package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class v1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57106a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57107b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ListView f57108c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57109d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57110e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57111f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f57112g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f57113h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57114i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f57115j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f57116k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final SeekBar f57117l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f57118m;

    public v1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, FrameLayout buy, ListView chapterList, LinearLayout controlPanel, TextView desc, TextView endTime, ImageView image, ImageView next, TextView nowTime, ImageView play, ImageView prev, SeekBar seekbar, TextView title) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57106a = actionBar;
        this.f57107b = buy;
        this.f57108c = chapterList;
        this.f57109d = controlPanel;
        this.f57110e = desc;
        this.f57111f = endTime;
        this.f57112g = image;
        this.f57113h = next;
        this.f57114i = nowTime;
        this.f57115j = play;
        this.f57116k = prev;
        this.f57117l = seekbar;
        this.f57118m = title;
    }

    public static v1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static v1 c(@NonNull View view, @Nullable Object component) {
        return (v1) ViewDataBinding.bind(component, view, R.layout.activity_reading_plan_play);
    }

    @NonNull
    public static v1 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static v1 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static v1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (v1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_reading_plan_play, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static v1 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (v1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_reading_plan_play, null, false, component);
    }
}
