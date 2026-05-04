package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n extends m {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55956q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55957r;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55958o;

    /* renamed from: p, reason: collision with root package name */
    public long f55959p;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        f55956q = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55957r = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.content, 3);
        sparseIntArray.put(R.id.account, 4);
        sparseIntArray.put(R.id.account_clear, 5);
        sparseIntArray.put(R.id.password, 6);
        sparseIntArray.put(R.id.see, 7);
        sparseIntArray.put(R.id.password_clear, 8);
        sparseIntArray.put(R.id.protocol, 9);
        sparseIntArray.put(R.id.login, 10);
        sparseIntArray.put(R.id.divider, 11);
        sparseIntArray.put(R.id.go_register, 12);
        sparseIntArray.put(R.id.forget_password, 13);
        sparseIntArray.put(R.id.login_weibo, 14);
    }

    public n(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 15, f55956q, f55957r));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55959p |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55959p;
            this.f55959p = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55813c.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f55813c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55959p != 0) {
                    return true;
                }
                return this.f55813c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55959p = 2L;
        }
        this.f55813c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55813c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public n(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (EmailAutoCompleteEditText) bindings[4], (ImageView) bindings[5], (a) bindings[1], (RelativeLayout) bindings[3], (View) bindings[11], (TextView) bindings[13], (TextView) bindings[12], (Button) bindings[10], (ImageView) bindings[14], (EditText) bindings[6], (ImageView) bindings[8], (TextView) bindings[9], (ImageView) bindings[7], (TextView) bindings[2]);
        this.f55959p = -1L;
        setContainedBinding(this.f55813c);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55958o = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
