package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.LineChart;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o9 extends n9 {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56199q = null;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56200r = null;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56201m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f56202n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f56203o;

    /* renamed from: p, reason: collision with root package name */
    public long f56204p;

    public o9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, f56199q, f56200r));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.o9.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56204p != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56204p = 32L;
        }
        requestRebind();
    }

    @Override // gs.n9
    public void n(@Nullable List<Integer> ChartData) {
        this.f56022k = ChartData;
        synchronized (this) {
            this.f56204p |= 8;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // gs.n9
    public void o(boolean IsReading) {
        this.f56019h = IsReading;
        synchronized (this) {
            this.f56204p |= 4;
        }
        notifyPropertyChanged(31);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.n9
    public void p(@Nullable View.OnClickListener ReEvaluation) {
        this.f56021j = ReEvaluation;
        synchronized (this) {
            this.f56204p |= 16;
        }
        notifyPropertyChanged(53);
        super.requestRebind();
    }

    @Override // gs.n9
    public void r(int Status) {
        this.f56023l = Status;
        synchronized (this) {
            this.f56204p |= 1;
        }
        notifyPropertyChanged(79);
        super.requestRebind();
    }

    @Override // gs.n9
    public void s(@Nullable String WordCount) {
        this.f56020i = WordCount;
        synchronized (this) {
            this.f56204p |= 2;
        }
        notifyPropertyChanged(94);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (79 == variableId) {
            r(((Integer) variable).intValue());
            return true;
        }
        if (94 == variableId) {
            s((String) variable);
            return true;
        }
        if (31 == variableId) {
            o(((Boolean) variable).booleanValue());
            return true;
        }
        if (11 == variableId) {
            n((List) variable);
            return true;
        }
        if (53 != variableId) {
            return false;
        }
        p((View.OnClickListener) variable);
        return true;
    }

    public o9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LineChart) bindings[6], (TextView) bindings[8], (ProgressBar) bindings[9], (TextView) bindings[7], (TextView) bindings[5], (TextView) bindings[1], (TextView) bindings[4]);
        this.f56204p = -1L;
        this.f56012a.setTag(null);
        this.f56013b.setTag(null);
        this.f56014c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56201m = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[2];
        this.f56202n = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) bindings[3];
        this.f56203o = imageView2;
        imageView2.setTag(null);
        this.f56015d.setTag(null);
        this.f56016e.setTag(null);
        this.f56017f.setTag(null);
        this.f56018g.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
