package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a3 extends z2 {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts E;

    @Nullable
    public static final SparseIntArray F;

    @NonNull
    public final ConstraintLayout C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(29);
        E = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.detail_word_book_img, 2);
        sparseIntArray.put(R.id.word_book_name, 3);
        sparseIntArray.put(R.id.edit_book_name, 4);
        sparseIntArray.put(R.id.word_book_info_row, 5);
        sparseIntArray.put(R.id.word_book_content_count, 6);
        sparseIntArray.put(R.id.word_book_tags_container, 7);
        sparseIntArray.put(R.id.export, 8);
        sparseIntArray.put(R.id.go_study, 9);
        sparseIntArray.put(R.id.add_score, 10);
        sparseIntArray.put(R.id.book_radio_group, 11);
        sparseIntArray.put(R.id.time_order, 12);
        sparseIntArray.put(R.id.time_reverse, 13);
        sparseIntArray.put(R.id.letter_order, 14);
        sparseIntArray.put(R.id.letter_reverse, 15);
        sparseIntArray.put(R.id.book_radio_group_disable, 16);
        sparseIntArray.put(R.id.radio_barrier, 17);
        sparseIntArray.put(R.id.word_data_recycler, 18);
        sparseIntArray.put(R.id.noproguard_no_word_img, 19);
        sparseIntArray.put(R.id.noproguard_no_word_tip, 20);
        sparseIntArray.put(R.id.wb_group_no_word_view, 21);
        sparseIntArray.put(R.id.noproguard_safe_area, 22);
        sparseIntArray.put(R.id.noproguard_bottom_menu_bg, 23);
        sparseIntArray.put(R.id.noproguard_all_check, 24);
        sparseIntArray.put(R.id.noproguard_all_check_text, 25);
        sparseIntArray.put(R.id.noproguard_btn_cancel_delete, 26);
        sparseIntArray.put(R.id.noproguard_btn_do_delete, 27);
        sparseIntArray.put(R.id.wb_group_bottom_delete_operate, 28);
    }

    public a3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 29, E, F));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.D;
            this.D = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f57701a.I(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_action_bar_menu));
            this.f57701a.J(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_word_book_detail_share));
            this.f57701a.H(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_new_red_short));
            this.f57701a.P(Boolean.TRUE);
            this.f57701a.S(true);
            this.f57701a.T(true);
        }
        ViewDataBinding.executeBindingsOn(this.f57701a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.f57701a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.D = 2L;
        }
        this.f57701a.invalidateAll();
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
        this.f57701a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public a3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (TextView) bindings[10], (RadioGroup) bindings[11], (RadioGroup) bindings[16], (ImageView) bindings[2], (ImageView) bindings[4], (TextView) bindings[8], (TextView) bindings[9], (RadioButton) bindings[14], (RadioButton) bindings[15], (ImageView) bindings[24], (TextView) bindings[25], (View) bindings[23], (TextView) bindings[26], (TextView) bindings[27], (ImageView) bindings[19], (TextView) bindings[20], (View) bindings[22], (Barrier) bindings[17], (RadioButton) bindings[12], (RadioButton) bindings[13], (Group) bindings[28], (Group) bindings[21], (TextView) bindings[6], (LinearLayout) bindings[5], (TextView) bindings[3], (LinearLayout) bindings[7], (RecyclerView) bindings[18]);
        this.D = -1L;
        setContainedBinding(this.f57701a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
