package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class EmojiTextViewHelper {
    private final HelperInternal mHelper;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(19)
    public static class HelperInternal19 extends HelperInternal {
        private final EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled = true;
        private final TextView mTextView;

        public HelperInternal19(TextView textView) {
            this.mTextView = textView;
            this.mEmojiInputFilter = new EmojiInputFilter(textView);
        }

        @NonNull
        private InputFilter[] addEmojiInputFilterIfMissing(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.mEmojiInputFilter) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.mEmojiInputFilter;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> getEmojiInputFilterPositionArray(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i11 = 0; i11 < inputFilterArr.length; i11++) {
                InputFilter inputFilter = inputFilterArr[i11];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i11, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        private InputFilter[] removeEmojiInputFilterIfPresent(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (emojiInputFilterPositionArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }

        @Nullable
        private TransformationMethod unwrapForDisabled(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
        }

        private void updateFilters() {
            this.mTextView.setFilters(getFilters(this.mTextView.getFilters()));
        }

        @NonNull
        private TransformationMethod wrapForEnabled(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod instanceof EmojiTransformationMethod ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new EmojiTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            return !this.mEnabled ? removeEmojiInputFilterIfPresent(inputFilterArr) : addEmojiInputFilterIfMissing(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mEnabled;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setAllCaps(boolean z11) {
            if (z11) {
                updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setEnabled(boolean z11) {
            this.mEnabled = z11;
            updateTransformationMethod();
            updateFilters();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void setEnabledUnsafe(boolean z11) {
            this.mEnabled = z11;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void updateTransformationMethod() {
            this.mTextView.setTransformationMethod(wrapTransformationMethod(this.mTextView.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            return this.mEnabled ? wrapForEnabled(transformationMethod) : unwrapForDisabled(transformationMethod);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(19)
    public static class SkippingHelper19 extends HelperInternal {
        private final HelperInternal19 mHelperDelegate;

        public SkippingHelper19(TextView textView) {
            this.mHelperDelegate = new HelperInternal19(textView);
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            return !EmojiCompat.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            return skipBecauseEmojiCompatNotInitialized() ? inputFilterArr : this.mHelperDelegate.getFilters(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mHelperDelegate.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setAllCaps(boolean z11) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.setAllCaps(z11);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setEnabled(boolean z11) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.setEnabledUnsafe(z11);
            } else {
                this.mHelperDelegate.setEnabled(z11);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void updateTransformationMethod() {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.updateTransformationMethod();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            return skipBecauseEmojiCompatNotInitialized() ? transformationMethod : this.mHelperDelegate.wrapTransformationMethod(transformationMethod);
        }
    }

    public EmojiTextViewHelper(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.mHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mHelper.isEnabled();
    }

    public void setAllCaps(boolean z11) {
        this.mHelper.setAllCaps(z11);
    }

    public void setEnabled(boolean z11) {
        this.mHelper.setEnabled(z11);
    }

    public void updateTransformationMethod() {
        this.mHelper.updateTransformationMethod();
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.mHelper.wrapTransformationMethod(transformationMethod);
    }

    public EmojiTextViewHelper(@NonNull TextView textView, boolean z11) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        if (z11) {
            this.mHelper = new HelperInternal19(textView);
        } else {
            this.mHelper = new SkippingHelper19(textView);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HelperInternal {
        public boolean isEnabled() {
            return false;
        }

        public void updateTransformationMethod() {
        }

        @NonNull
        public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void setAllCaps(boolean z11) {
        }

        public void setEnabled(boolean z11) {
        }

        @Nullable
        public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
