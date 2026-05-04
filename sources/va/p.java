package va;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class p extends ClickableSpan {
    private int mDefaultBackgroundColor;
    private int mDefaultTextColor = -1;
    private boolean mIsPressed;
    private int mPressedBackgroundColor;

    public p(int pressedBackgroundColor) {
        this.mPressedBackgroundColor = pressedBackgroundColor;
    }

    public void setPressed(boolean isSelected) {
        this.mIsPressed = isSelected;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        if (ds2.getColor() != -1) {
            this.mDefaultTextColor = ds2.getColor();
        }
        boolean z11 = this.mIsPressed;
        if (!z11) {
            this.mDefaultBackgroundColor = ds2.bgColor;
        }
        if (z11) {
            ds2.setColor(-1);
        } else {
            ds2.setColor(this.mDefaultTextColor);
        }
        ds2.bgColor = this.mIsPressed ? this.mPressedBackgroundColor : this.mDefaultBackgroundColor;
    }
}
