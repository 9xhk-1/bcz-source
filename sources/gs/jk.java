package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class jk extends ik {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55531k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55532l = null;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55533h;

    /* renamed from: i, reason: collision with root package name */
    public InverseBindingListener f55534i;

    /* renamed from: j, reason: collision with root package name */
    public long f55535j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            boolean c11 = te.h.c(jk.this.f55336b);
            MutableLiveData<Boolean> mutableLiveData = jk.this.f55340f;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.valueOf(c11));
            }
        }
    }

    public jk(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55531k, f55532l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55535j;
            this.f55535j = 0L;
        }
        String str = this.f55341g;
        String str2 = this.f55339e;
        View.OnClickListener onClickListener = this.f55338d;
        MutableLiveData<Boolean> mutableLiveData = this.f55340f;
        long j12 = 18 & j11;
        long j13 = 20 & j11;
        long j14 = 24 & j11;
        long j15 = 17 & j11;
        Boolean value = (j15 == 0 || mutableLiveData == null) ? null : mutableLiveData.getValue();
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.f55335a, str);
        }
        if (j14 != 0) {
            this.f55336b.setOnClickListener(onClickListener);
        }
        if (j15 != 0) {
            te.h.b(this.f55336b, value);
        }
        if ((j11 & 16) != 0) {
            te.h.a(this.f55336b, this.f55534i);
        }
        if (j13 != 0) {
            TextViewBindingAdapter.setText(this.f55337c, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55535j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55535j = 16L;
        }
        requestRebind();
    }

    @Override // gs.ik
    public void m(@Nullable MutableLiveData<Boolean> Checked) {
        updateLiveDataRegistration(0, Checked);
        this.f55340f = Checked;
        synchronized (this) {
            this.f55535j |= 1;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    @Override // gs.ik
    public void n(@Nullable View.OnClickListener OnClickListener) {
        this.f55338d = OnClickListener;
        synchronized (this) {
            this.f55535j |= 8;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // gs.ik
    public void o(@Nullable String SubTitle) {
        this.f55341g = SubTitle;
        synchronized (this) {
            this.f55535j |= 2;
        }
        notifyPropertyChanged(82);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return r((MutableLiveData) object, fieldId);
    }

    @Override // gs.ik
    public void p(@Nullable String Title) {
        this.f55339e = Title;
        synchronized (this) {
            this.f55535j |= 4;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    public final boolean r(MutableLiveData<Boolean> Checked, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55535j |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (82 == variableId) {
            o((String) variable);
            return true;
        }
        if (86 == variableId) {
            p((String) variable);
            return true;
        }
        if (48 == variableId) {
            n((View.OnClickListener) variable);
            return true;
        }
        if (12 != variableId) {
            return false;
        }
        m((MutableLiveData) variable);
        return true;
    }

    public jk(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[3], (SwitchButton) bindings[2], (TextView) bindings[1]);
        this.f55534i = new a();
        this.f55535j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55533h = constraintLayout;
        constraintLayout.setTag(null);
        this.f55335a.setTag(null);
        this.f55336b.setTag(null);
        this.f55337c.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
