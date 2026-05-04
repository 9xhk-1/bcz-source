package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Placeholder extends View {
    private View mContent;
    private int mContentId;
    private int mEmptyVisibility;

    public Placeholder(Context context) {
        super(context);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(null);
    }

    private void init(AttributeSet attributeSet) {
        super.setVisibility(this.mEmptyVisibility);
        this.mContentId = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.mContentId = obtainStyledAttributes.getResourceId(index, this.mContentId);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.mEmptyVisibility = obtainStyledAttributes.getInt(index, this.mEmptyVisibility);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.mContent;
    }

    public int getEmptyVisibility() {
        return this.mEmptyVisibility;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(com.jiongji.andriod.card.R.styleable.Theme_drawable_sound1, com.jiongji.andriod.card.R.styleable.Theme_drawable_sound1, com.jiongji.andriod.card.R.styleable.Theme_drawable_sound1);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View findViewById;
        if (this.mContentId == i11) {
            return;
        }
        View view = this.mContent;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.mContent.getLayoutParams()).mIsInPlaceholder = false;
            this.mContent = null;
        }
        this.mContentId = i11;
        if (i11 == -1 || (findViewById = ((View) getParent()).findViewById(i11)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i11) {
        this.mEmptyVisibility = i11;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.mContent == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.mContent.getLayoutParams();
        layoutParams2.mWidget.setVisibility(0);
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = layoutParams.mWidget.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (horizontalDimensionBehaviour != dimensionBehaviour) {
            layoutParams.mWidget.setWidth(layoutParams2.mWidget.getWidth());
        }
        if (layoutParams.mWidget.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            layoutParams.mWidget.setHeight(layoutParams2.mWidget.getHeight());
        }
        layoutParams2.mWidget.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.mContentId == -1 && !isInEditMode()) {
            setVisibility(this.mEmptyVisibility);
        }
        View findViewById = constraintLayout.findViewById(this.mContentId);
        this.mContent = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).mIsInPlaceholder = true;
            this.mContent.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.mContentId = -1;
        this.mContent = null;
        this.mEmptyVisibility = 4;
        init(attributeSet);
    }
}
