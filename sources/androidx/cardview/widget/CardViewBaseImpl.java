package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CardViewBaseImpl implements CardViewImpl {
    final RectF mCornerRect = new RectF();

    private RoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        return new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f11, f12, f13);
    }

    private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawableWithShadow) cardViewDelegate.getCardBackground();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getColor();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMaxShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinHeight();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinWidth();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getCornerRadius();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewBaseImpl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f11, Paint paint) {
                float f12 = 2.0f * f11;
                float width = (rectF.width() - f12) - 1.0f;
                float height = (rectF.height() - f12) - 1.0f;
                if (f11 >= 1.0f) {
                    float f13 = f11 + 0.5f;
                    float f14 = -f13;
                    CardViewBaseImpl.this.mCornerRect.set(f14, f14, f13, f13);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f13, rectF.top + f13);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    float f15 = (rectF.left + f13) - 1.0f;
                    float f16 = rectF.top;
                    canvas.drawRect(f15, f16, (rectF.right - f13) + 1.0f, f16 + f13, paint);
                    float f17 = (rectF.left + f13) - 1.0f;
                    float f18 = rectF.bottom;
                    canvas.drawRect(f17, f18 - f13, (rectF.right - f13) + 1.0f, f18, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f11, rectF.right, rectF.bottom - f11, paint);
            }
        };
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        RoundRectDrawableWithShadow createBackground = createBackground(context, colorStateList, f11, f12, f13);
        createBackground.setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        cardViewDelegate.setCardBackground(createBackground);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        getShadowBackground(cardViewDelegate).setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(CardViewDelegate cardViewDelegate, @Nullable ColorStateList colorStateList) {
        getShadowBackground(cardViewDelegate).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(CardViewDelegate cardViewDelegate, float f11) {
        getShadowBackground(cardViewDelegate).setShadowSize(f11);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(CardViewDelegate cardViewDelegate, float f11) {
        getShadowBackground(cardViewDelegate).setMaxShadowSize(f11);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(CardViewDelegate cardViewDelegate, float f11) {
        getShadowBackground(cardViewDelegate).setCornerRadius(f11);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(cardViewDelegate).getMaxShadowAndCornerPadding(rect);
        cardViewDelegate.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(cardViewDelegate)), (int) Math.ceil(getMinHeight(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
    }
}
