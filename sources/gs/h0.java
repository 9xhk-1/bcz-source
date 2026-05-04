package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public abstract class h0 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55118a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ListView f55119b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55120c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55121d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55122e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55123f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f55124g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f55125h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final SeekBar f55126i;

    public h0(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, ListView chapterList, LinearLayout controlPanel, TextView endTime, ImageView next, TextView nowTime, ImageView play, ImageView prev, SeekBar seekbar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55118a = actionBar;
        this.f55119b = chapterList;
        this.f55120c = controlPanel;
        this.f55121d = endTime;
        this.f55122e = next;
        this.f55123f = nowTime;
        this.f55124g = play;
        this.f55125h = prev;
        this.f55126i = seekbar;
    }

    public static h0 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h0 c(@NonNull View view, @Nullable Object component) {
        return (h0) ViewDataBinding.bind(component, view, R.layout.activity_exam_audio_play);
    }

    @NonNull
    public static h0 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h0 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h0 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_exam_audio_play, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h0 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h0) ViewDataBinding.inflateInternal(inflater, R.layout.activity_exam_audio_play, null, false, component);
    }
}
