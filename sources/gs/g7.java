package gs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g7 extends f7 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55009j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55010k = null;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55011g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55012h;

    /* renamed from: i, reason: collision with root package name */
    public long f55013i;

    public g7(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55009j, f55010k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55013i;
            this.f55013i = 0L;
        }
        String str = this.f54891d;
        String str2 = this.f54892e;
        View.OnClickListener onClickListener = this.f54893f;
        Drawable drawable = this.f54890c;
        long j12 = j11 & 18;
        int i11 = 0;
        if (j12 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (j12 != 0) {
                j11 |= isEmpty ? 64L : 32L;
            }
            if (isEmpty) {
                i11 = 8;
            }
        }
        long j13 = 20 & j11;
        if ((24 & j11) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.f54888a, drawable);
        }
        if ((j11 & 18) != 0) {
            TextViewBindingAdapter.setText(this.f55012h, str2);
            this.f55012h.setVisibility(i11);
        }
        if (j13 != 0) {
            this.f55012h.setOnClickListener(onClickListener);
        }
        if ((j11 & 17) != 0) {
            TextViewBindingAdapter.setText(this.f54889b, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55013i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55013i = 16L;
        }
        requestRebind();
    }

    @Override // gs.f7
    public void m(@Nullable String Content) {
        this.f54891d = Content;
        synchronized (this) {
            this.f55013i |= 1;
        }
        notifyPropertyChanged(17);
        super.requestRebind();
    }

    @Override // gs.f7
    public void n(@Nullable Drawable Img) {
        this.f54890c = Img;
        synchronized (this) {
            this.f55013i |= 8;
        }
        notifyPropertyChanged(30);
        super.requestRebind();
    }

    @Override // gs.f7
    public void o(@Nullable String Retry) {
        this.f54892e = Retry;
        synchronized (this) {
            this.f55013i |= 2;
        }
        notifyPropertyChanged(58);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // gs.f7
    public void p(@Nullable View.OnClickListener RetryClick) {
        this.f54893f = RetryClick;
        synchronized (this) {
            this.f55013i |= 4;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (17 == variableId) {
            m((String) variable);
            return true;
        }
        if (58 == variableId) {
            o((String) variable);
            return true;
        }
        if (59 == variableId) {
            p((View.OnClickListener) variable);
            return true;
        }
        if (30 != variableId) {
            return false;
        }
        n((Drawable) variable);
        return true;
    }

    public g7(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (TextView) bindings[2]);
        this.f55013i = -1L;
        this.f54888a.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55011g = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) bindings[3];
        this.f55012h = textView;
        textView.setTag(null);
        this.f54889b.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
