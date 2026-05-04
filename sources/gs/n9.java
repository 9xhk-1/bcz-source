package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.LineChart;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class n9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LineChart f56012a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56013b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56014c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56015d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56016e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56017f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56018g;

    /* renamed from: h, reason: collision with root package name */
    @Bindable
    public boolean f56019h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public String f56020i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f56021j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public List<Integer> f56022k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public int f56023l;

    public n9(Object _bindingComponent, View _root, int _localFieldCount, LineChart chart, TextView evaluation, ProgressBar loading, TextView noData, TextView reevaluation, TextView title, TextView wordCountValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56012a = chart;
        this.f56013b = evaluation;
        this.f56014c = loading;
        this.f56015d = noData;
        this.f56016e = reevaluation;
        this.f56017f = title;
        this.f56018g = wordCountValue;
    }

    public static n9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static n9 c(@NonNull View view, @Nullable Object component) {
        return (n9) ViewDataBinding.bind(component, view, R.layout.fragment_my_evaluation_item);
    }

    @NonNull
    public static n9 j(@NonNull LayoutInflater inflater) {
        return m(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static n9 k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return l(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static n9 l(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (n9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_my_evaluation_item, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static n9 m(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (n9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_my_evaluation_item, null, false, component);
    }

    @Nullable
    public List<Integer> d() {
        return this.f56022k;
    }

    public boolean e() {
        return this.f56019h;
    }

    @Nullable
    public View.OnClickListener g() {
        return this.f56021j;
    }

    public int h() {
        return this.f56023l;
    }

    @Nullable
    public String i() {
        return this.f56020i;
    }

    public abstract void n(@Nullable List<Integer> chartData);

    public abstract void o(boolean isReading);

    public abstract void p(@Nullable View.OnClickListener reEvaluation);

    public abstract void r(int status);

    public abstract void s(@Nullable String wordCount);
}
