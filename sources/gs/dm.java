package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class dm extends cm {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54658i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54659j;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54660g;

    /* renamed from: h, reason: collision with root package name */
    public long f54661h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54659j = sparseIntArray;
        sparseIntArray.put(R.id.show_hide_english, 1);
        sparseIntArray.put(R.id.show_hide_chinese, 2);
        sparseIntArray.put(R.id.add_word, 3);
        sparseIntArray.put(R.id.edit_book, 4);
        sparseIntArray.put(R.id.change_voice, 5);
        sparseIntArray.put(R.id.pdf_history, 6);
    }

    public dm(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f54658i, f54659j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54661h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54661h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54661h = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public dm(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[3], (TextView) bindings[5], (TextView) bindings[4], (TextView) bindings[6], (TextView) bindings[2], (TextView) bindings[1]);
        this.f54661h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54660g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
