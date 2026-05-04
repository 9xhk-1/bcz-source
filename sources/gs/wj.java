package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class wj extends vj {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57347f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57348g = null;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57349c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57350d;

    /* renamed from: e, reason: collision with root package name */
    public long f57351e;

    public wj(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f57347f, f57348g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57351e;
            this.f57351e = 0L;
        }
        View.OnClickListener onClickListener = this.f57202b;
        if ((j11 & 5) != 0) {
            this.f57350d.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57351e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57351e = 4L;
        }
        requestRebind();
    }

    @Override // gs.vj
    public void k(@Nullable View.OnClickListener BackClick) {
        this.f57201a = BackClick;
    }

    @Override // gs.vj
    public void l(@Nullable View.OnClickListener RefreshClick) {
        this.f57202b = RefreshClick;
        synchronized (this) {
            this.f57351e |= 1;
        }
        notifyPropertyChanged(55);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (55 == variableId) {
            l((View.OnClickListener) variable);
            return true;
        }
        if (2 != variableId) {
            return false;
        }
        k((View.OnClickListener) variable);
        return true;
    }

    public wj(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f57351e = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f57349c = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) bindings[1];
        this.f57350d = textView;
        textView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
