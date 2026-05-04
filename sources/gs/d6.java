package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d6 extends c6 {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54597l = null;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54598m;

    /* renamed from: k, reason: collision with root package name */
    public long f54599k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54598m = sparseIntArray;
        sparseIntArray.put(R.id.daka_progress, 4);
        sparseIntArray.put(R.id.daka_tip, 5);
        sparseIntArray.put(R.id.error_title1, 6);
        sparseIntArray.put(R.id.error_title2, 7);
    }

    public d6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f54597l, f54598m));
    }

    private boolean m(ObservableInt Status, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54599k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        int i11;
        synchronized (this) {
            j11 = this.f54599k;
            this.f54599k = 0L;
        }
        ObservableInt observableInt = this.f54405i;
        View.OnClickListener onClickListener = this.f54406j;
        long j12 = j11 & 5;
        if (j12 != 0) {
            int i12 = observableInt != null ? observableInt.get() : 0;
            boolean z11 = i12 == 3;
            boolean z12 = i12 == 1;
            if (j12 != 0) {
                j11 |= z11 ? 16L : 8L;
            }
            if ((j11 & 5) != 0) {
                j11 |= z12 ? 64L : 32L;
            }
            int i13 = z11 ? 0 : 8;
            i11 = z12 ? 0 : 8;
            r9 = i13;
        } else {
            i11 = 0;
        }
        if ((6 & j11) != 0) {
            this.f54399c.setOnClickListener(onClickListener);
        }
        if ((j11 & 5) != 0) {
            this.f54403g.setVisibility(r9);
            this.f54404h.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54599k != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54599k = 4L;
        }
        requestRebind();
    }

    @Override // gs.c6
    public void k(@Nullable View.OnClickListener Retry) {
        this.f54406j = Retry;
        synchronized (this) {
            this.f54599k |= 2;
        }
        notifyPropertyChanged(58);
        super.requestRebind();
    }

    @Override // gs.c6
    public void l(@Nullable ObservableInt Status) {
        updateRegistration(0, Status);
        this.f54405i = Status;
        synchronized (this) {
            this.f54599k |= 1;
        }
        notifyPropertyChanged(79);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return m((ObservableInt) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (79 == variableId) {
            l((ObservableInt) variable);
            return true;
        }
        if (58 != variableId) {
            return false;
        }
        k((View.OnClickListener) variable);
        return true;
    }

    public d6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (ProgressBar) bindings[4], (TextView) bindings[2], (TextView) bindings[5], (TextView) bindings[6], (TextView) bindings[7], (Group) bindings[3], (Group) bindings[1]);
        this.f54599k = -1L;
        this.f54397a.setTag(null);
        this.f54399c.setTag(null);
        this.f54403g.setTag(null);
        this.f54404h.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
