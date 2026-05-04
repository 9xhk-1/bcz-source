package gs;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q8 extends p8 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56458g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56459h = null;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56460c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56461d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56462e;

    /* renamed from: f, reason: collision with root package name */
    public long f56463f;

    public q8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f56458g, f56459h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56463f;
            this.f56463f = 0L;
        }
        View.OnClickListener onClickListener = this.f56344b;
        String str = this.f56343a;
        long j12 = j11 & 6;
        int i11 = 0;
        if (j12 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j12 != 0) {
                j11 |= isEmpty ? 16L : 8L;
            }
            if (isEmpty) {
                i11 = 8;
            }
        }
        if ((6 & j11) != 0) {
            this.f56460c.setVisibility(i11);
            TextViewBindingAdapter.setText(this.f56461d, str);
        }
        if ((j11 & 5) != 0) {
            this.f56462e.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56463f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56463f = 4L;
        }
        requestRebind();
    }

    @Override // gs.p8
    public void k(@Nullable View.OnClickListener Click) {
        this.f56344b = Click;
        synchronized (this) {
            this.f56463f |= 1;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    @Override // gs.p8
    public void l(@Nullable String Text) {
        this.f56343a = Text;
        synchronized (this) {
            this.f56463f |= 2;
        }
        notifyPropertyChanged(84);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (13 == variableId) {
            k((View.OnClickListener) variable);
            return true;
        }
        if (84 != variableId) {
            return false;
        }
        l((String) variable);
        return true;
    }

    public q8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f56463f = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f56460c = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) bindings[1];
        this.f56461d = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) bindings[2];
        this.f56462e = textView2;
        textView2.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
