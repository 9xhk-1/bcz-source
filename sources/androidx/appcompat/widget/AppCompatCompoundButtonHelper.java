package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;

    @NonNull
    private final CompoundButton mView;

    public AppCompatCompoundButtonHelper(@NonNull CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    public void applyButtonTint() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    DrawableCompat.setTintList(mutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    DrawableCompat.setTintMode(mutate, this.mButtonTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(mutate);
            }
        }
    }

    public ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CompoundButton
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r9 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r3, r12, r8)
            android.widget.CompoundButton r1 = r10.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.getWrappedTypeArray()
            r7 = 0
            r4 = r11
            r6 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.getColorStateList(r11)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.getInt(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r11, r0)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CompoundButtonCompat.setButtonTintMode(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.recycle()
            return
        L83:
            r9.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    public int getCompoundPaddingLeft(int i11) {
        return i11;
    }
}
