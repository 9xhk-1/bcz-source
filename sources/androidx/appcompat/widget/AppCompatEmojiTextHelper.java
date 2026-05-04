package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    @NonNull
    private final EmojiTextViewHelper mEmojiTextViewHelper;

    @NonNull
    private final TextView mView;

    public AppCompatEmojiTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(textView, false);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }

    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i11) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i11, 0);
        try {
            int i12 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z11 = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getBoolean(i12, true) : true;
            obtainStyledAttributes.recycle();
            setEnabled(z11);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setAllCaps(boolean z11) {
        this.mEmojiTextViewHelper.setAllCaps(z11);
    }

    public void setEnabled(boolean z11) {
        this.mEmojiTextViewHelper.setEnabled(z11);
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
