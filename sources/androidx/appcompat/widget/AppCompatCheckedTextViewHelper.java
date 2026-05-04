package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;

    @NonNull
    private final CheckedTextView mView;

    public AppCompatCheckedTextViewHelper(@NonNull CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    public void applyCheckMarkTint() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.mHasCheckMarkTint) {
                    DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
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
            android.widget.CheckedTextView r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CheckedTextView
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r9 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r3, r12, r8)
            android.widget.CheckedTextView r1 = r10.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.getWrappedTypeArray()
            r7 = 0
            r4 = r11
            r6 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.getResourceId(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.getColorStateList(r11)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CheckedTextView r12 = r10.mView     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.getInt(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r11, r0)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.recycle()
            return
        L83:
            r9.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextViewHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
