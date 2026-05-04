package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.widget.RoundedButton;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.baicizhan.main.customview.WordListNavigation;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k3 extends j3 {

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55566t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55567u;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55568r;

    /* renamed from: s, reason: collision with root package name */
    public long f55569s;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(18);
        f55566t = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic"}, new int[]{2}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55567u = sparseIntArray;
        sparseIntArray.put(R.id.bg_cover, 3);
        sparseIntArray.put(R.id.bg_cover_front, 4);
        sparseIntArray.put(R.id.book_cover, 5);
        sparseIntArray.put(R.id.book_summary, 6);
        sparseIntArray.put(R.id.book_desc, 7);
        sparseIntArray.put(R.id.book_link, 8);
        sparseIntArray.put(R.id.book_download, 9);
        sparseIntArray.put(R.id.navigator, 10);
        sparseIntArray.put(R.id.bg_bottom_area, 11);
        sparseIntArray.put(R.id.wordlist_edit_bar, 12);
        sparseIntArray.put(R.id.edit, 13);
        sparseIntArray.put(R.id.sort, 14);
        sparseIntArray.put(R.id.word_count_header, 15);
        sparseIntArray.put(R.id.collect_word_review, 16);
        sparseIntArray.put(R.id.placeholder, 17);
    }

    public k3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 18, f55566t, f55567u));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55569s |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55569s;
            this.f55569s = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55406a.F(ViewDataBinding.getColorFromResource(getRoot(), android.R.color.transparent));
            this.f55406a.W(true);
        }
        ViewDataBinding.executeBindingsOn(this.f55406a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55569s != 0) {
                    return true;
                }
                return this.f55406a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55569s = 2L;
        }
        this.f55406a.invalidateAll();
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
        this.f55406a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public k3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[2], (View) bindings[11], (ImageView) bindings[3], (View) bindings[4], (AspectRoundImageView) bindings[5], (TextView) bindings[7], (OfflineDownloadView) bindings[9], (ConstraintLayout) bindings[1], (TextView) bindings[8], (TextView) bindings[6], (TextView) bindings[16], (RoundedButton) bindings[13], (WordListNavigation) bindings[10], (FrameLayout) bindings[17], (RoundedButton) bindings[14], (TextView) bindings[15], (RelativeLayout) bindings[12]);
        this.f55569s = -1L;
        setContainedBinding(this.f55406a);
        this.f55413h.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55568r = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
