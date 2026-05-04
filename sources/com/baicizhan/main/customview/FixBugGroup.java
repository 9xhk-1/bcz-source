package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.timepicker.TimeModel;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FixBugGroup extends Group {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20014a = "FixBugGroup";

    public FixBugGroup(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.Group, android.view.View
    public void setVisibility(int visibility) {
        c.i(f20014a, TimeModel.f32588i, Integer.valueOf(visibility));
        super.setVisibility(visibility);
        if (getParent() != null) {
            getParent().requestLayout();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(ConstraintLayout container) {
        c.i(f20014a, "", new Object[0]);
        super.updatePreLayout(container);
    }

    public FixBugGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixBugGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
