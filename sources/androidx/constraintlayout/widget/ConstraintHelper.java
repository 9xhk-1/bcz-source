package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {
    protected static final String CHILD_TAG = "CONSTRAINT_LAYOUT_HELPER_CHILD";
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    protected HashMap<Integer, String> mMap;
    protected String mReferenceIds;
    protected String mReferenceTags;
    protected boolean mUseViewMeasure;
    private View[] mViews;
    protected Context myContext;

    public ConstraintHelper(Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(null);
    }

    private void addID(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        int findId = findId(trim);
        if (findId != 0) {
            this.mMap.put(Integer.valueOf(findId), trim);
            addRscID(findId);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void addRscID(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i12 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i13 = this.mCount;
        iArr2[i13] = i11;
        this.mCount = i13 + 1;
    }

    private void addTag(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    private int[] convertReferenceString(String str) {
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        int i11 = 0;
        for (String str2 : split) {
            int findId = findId(str2.trim());
            if (findId != 0) {
                iArr[i11] = findId;
                i11++;
            }
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private int findId(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i11 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i11 = ((Integer) designInformation).intValue();
            }
        }
        if (i11 == 0 && constraintLayout != null) {
            i11 = findId(constraintLayout, str);
        }
        if (i11 == 0) {
            try {
                i11 = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i11 == 0 ? this.myContext.getResources().getIdentifier(str, "id", this.myContext.getPackageName()) : i11;
    }

    public static boolean isChildOfHelper(View view) {
        return CHILD_TAG == view.getTag();
    }

    public void addView(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.mReferenceIds = null;
            addRscID(view.getId());
            requestLayout();
        }
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.mCount; i11++) {
            View viewById = constraintLayout.getViewById(this.mIds[i11]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public boolean containsId(int i11) {
        for (int i12 : this.mIds) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i11 = 0; i11 < this.mCount; i11++) {
            this.mViews[i11] = constraintLayout.getViewById(this.mIds[i11]);
        }
        return this.mViews;
    }

    public int indexFromId(int i11) {
        int i12 = -1;
        for (int i13 : this.mIds) {
            i12++;
            if (i13 == i11) {
                return i12;
            }
        }
        return i12;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintSet.Layout layout = constraint.layout;
        int[] iArr = layout.mReferenceIds;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.mReferenceIdString;
            if (str != null) {
                if (str.length() > 0) {
                    ConstraintSet.Layout layout2 = constraint.layout;
                    layout2.mReferenceIds = convertReferenceString(layout2.mReferenceIdString);
                } else {
                    constraint.layout.mReferenceIds = null;
                }
            }
        }
        if (helperWidget == null) {
            return;
        }
        helperWidget.removeAllIds();
        if (constraint.layout.mReferenceIds == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            int[] iArr2 = constraint.layout.mReferenceIds;
            if (i11 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i11]);
            if (constraintWidget != null) {
                helperWidget.add(constraintWidget);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public int removeView(View view) {
        int i11;
        int id2 = view.getId();
        int i12 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.mReferenceIds = null;
        int i13 = 0;
        while (true) {
            if (i13 >= this.mCount) {
                break;
            }
            if (this.mIds[i13] == id2) {
                int i14 = i13;
                while (true) {
                    i11 = this.mCount;
                    if (i14 >= i11 - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i15 = i14 + 1;
                    iArr[i14] = iArr[i15];
                    i14 = i15;
                }
                this.mIds[i11 - 1] = 0;
                this.mCount = i11 - 1;
                i12 = i13;
            } else {
                i13++;
            }
        }
        requestLayout();
        return i12;
    }

    public void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                addID(str.substring(i11));
                return;
            } else {
                addID(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                addTag(str.substring(i11));
                return;
            } else {
                addTag(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i11 : iArr) {
            addRscID(i11);
        }
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.mReferenceIds == null) {
            addRscID(i11);
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        String str;
        int findId;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i11 = 0; i11 < this.mCount; i11++) {
            int i12 = this.mIds[i11];
            View viewById = constraintLayout.getViewById(i12);
            if (viewById == null && (findId = findId(constraintLayout, (str = this.mMap.get(Integer.valueOf(i12))))) != 0) {
                this.mIds[i11] = findId;
                this.mMap.put(Integer.valueOf(findId), str);
                viewById = constraintLayout.getViewById(findId);
            }
            if (viewById != null) {
                this.mHelperWidget.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).mWidget = (ConstraintWidget) this.mHelperWidget;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i11 = 0; i11 < this.mCount; i11++) {
            helper.add(sparseArray.get(this.mIds[i11]));
        }
    }

    public void applyHelperParams() {
    }

    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z11) {
    }
}
