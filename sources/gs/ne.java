package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ne extends me {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56058f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56059g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final CardView f56060d;

    /* renamed from: e, reason: collision with root package name */
    public long f56061e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56059g = sparseIntArray;
        sparseIntArray.put(R.id.mean_type, 1);
        sparseIntArray.put(R.id.mean_text, 2);
        sparseIntArray.put(R.id.sentences_container, 3);
    }

    public ne(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56058f, f56059g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56061e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56061e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56061e = 1L;
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

    public ne(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[1], (LinearLayout) bindings[3]);
        this.f56061e = -1L;
        CardView cardView = (CardView) bindings[0];
        this.f56060d = cardView;
        cardView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
