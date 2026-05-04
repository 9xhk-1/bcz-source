package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.baicizhan.main.customview.CountDownButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends e {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts B;

    @Nullable
    public static final SparseIntArray C;
    public long A;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(26);
        B = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.desc, 3);
        sparseIntArray.put(R.id.noproguard_clear_guideline, 4);
        sparseIntArray.put(R.id.account, 5);
        sparseIntArray.put(R.id.view, 6);
        sparseIntArray.put(R.id.noproguard_auth_code, 7);
        sparseIntArray.put(R.id.account_barrier, 8);
        sparseIntArray.put(R.id.account_clear, 9);
        sparseIntArray.put(R.id.noproguard_verify_code, 10);
        sparseIntArray.put(R.id.noproguard_see, 11);
        sparseIntArray.put(R.id.verify_code_clear, 12);
        sparseIntArray.put(R.id.noproguard_new_password, 13);
        sparseIntArray.put(R.id.divider_new_pwd, 14);
        sparseIntArray.put(R.id.noproguard_pwd_see, 15);
        sparseIntArray.put(R.id.noproguard_new_password_clear, 16);
        sparseIntArray.put(R.id.password_barrier, 17);
        sparseIntArray.put(R.id.noproguard_verify_barrier, 18);
        sparseIntArray.put(R.id.verify, 19);
        sparseIntArray.put(R.id.forget_password, 20);
        sparseIntArray.put(R.id.agreement, 21);
        sparseIntArray.put(R.id.weibo_mail, 22);
        sparseIntArray.put(R.id.weibo_btn, 23);
        sparseIntArray.put(R.id.mail_btn, 24);
        sparseIntArray.put(R.id.password_new_barrier, 25);
    }

    public f(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 26, B, C));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.A;
            this.A = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f54668d.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f54668d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                return this.f54668d.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.A = 2L;
        }
        this.f54668d.invalidateAll();
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
        this.f54668d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public f(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (EmailAutoCompleteEditText) bindings[5], (Barrier) bindings[8], (ImageView) bindings[9], (a) bindings[1], (TextView) bindings[21], (ConstraintLayout) bindings[0], (TextView) bindings[3], (View) bindings[14], (TextView) bindings[20], (FrameLayout) bindings[24], (CountDownButton) bindings[7], (Guideline) bindings[4], (EditText) bindings[13], (ImageView) bindings[16], (ImageView) bindings[15], (ImageView) bindings[11], (Barrier) bindings[18], (EditText) bindings[10], (Barrier) bindings[17], (Barrier) bindings[25], (TextView) bindings[2], (Button) bindings[19], (ImageView) bindings[12], (View) bindings[6], (FrameLayout) bindings[23], (Guideline) bindings[22]);
        this.A = -1L;
        setContainedBinding(this.f54668d);
        this.f54670f.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
