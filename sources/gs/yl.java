package gs;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.main.customview.PopPointWindowLayout;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class yl extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f57633a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57634b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f57635c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f57636d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57637e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f57638f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57639g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57640h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57641i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57642j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f57643k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FlowLayout f57644l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57645m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final AutofitTextView f57646n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public Word f57647o;

    /* renamed from: p, reason: collision with root package name */
    @Bindable
    public ExtendedWordInfo f57648p;

    /* renamed from: q, reason: collision with root package name */
    @Bindable
    public Typeface f57649q;

    /* renamed from: r, reason: collision with root package name */
    @Bindable
    public boolean f57650r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public boolean f57651s;

    /* renamed from: t, reason: collision with root package name */
    @Bindable
    public yg.j2 f57652t;

    /* renamed from: u, reason: collision with root package name */
    @Bindable
    public boolean f57653u;

    /* renamed from: v, reason: collision with root package name */
    @Bindable
    public PopPointWindowLayout.f f57654v;

    public yl(Object _bindingComponent, View _root, int _localFieldCount, TextView accent, ImageView accentVoice, View bottomPoint, ImageView collect, RelativeLayout content, View divider, TextView failed, ProgressBar loadProgress, TextView meanCn, TextView moreInfo, View topPoint, FlowLayout usPlay, LinearLayout window, AutofitTextView wordView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57633a = accent;
        this.f57634b = accentVoice;
        this.f57635c = bottomPoint;
        this.f57636d = collect;
        this.f57637e = content;
        this.f57638f = divider;
        this.f57639g = failed;
        this.f57640h = loadProgress;
        this.f57641i = meanCn;
        this.f57642j = moreInfo;
        this.f57643k = topPoint;
        this.f57644l = usPlay;
        this.f57645m = window;
        this.f57646n = wordView;
    }

    public static yl b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static yl c(@NonNull View view, @Nullable Object component) {
        return (yl) ViewDataBinding.bind(component, view, R.layout.pop_point_window_layout);
    }

    @NonNull
    public static yl m(@NonNull LayoutInflater inflater) {
        return p(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static yl n(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return o(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static yl o(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (yl) ViewDataBinding.inflateInternal(inflater, R.layout.pop_point_window_layout, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static yl p(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (yl) ViewDataBinding.inflateInternal(inflater, R.layout.pop_point_window_layout, null, false, component);
    }

    @Nullable
    public Typeface d() {
        return this.f57649q;
    }

    public boolean e() {
        return this.f57653u;
    }

    @Nullable
    public ExtendedWordInfo g() {
        return this.f57648p;
    }

    public boolean h() {
        return this.f57650r;
    }

    public boolean i() {
        return this.f57651s;
    }

    @Nullable
    public PopPointWindowLayout.f j() {
        return this.f57654v;
    }

    @Nullable
    public yg.j2 k() {
        return this.f57652t;
    }

    @Nullable
    public Word l() {
        return this.f57647o;
    }

    public abstract void r(@Nullable Typeface accentFont);

    public abstract void s(boolean collected);

    public abstract void t(@Nullable ExtendedWordInfo extendedInfo);

    public abstract void u(boolean floatTop);

    public abstract void v(boolean moreDisabled);

    public abstract void x(@Nullable PopPointWindowLayout.f presenter);

    public abstract void y(@Nullable yg.j2 state);

    public abstract void z(@Nullable Word word);
}
