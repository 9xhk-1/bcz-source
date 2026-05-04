package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(19)
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    i11--;
                    if (i11 < 0) {
                        return z11 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i11);
                    if (z11) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i12--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i12--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z11 = true;
                    }
                }
                return i11;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    if (i11 >= length) {
                        if (z11) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i11);
                    if (z11) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i12--;
                        i11++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i12--;
                        i11++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11++;
                        z11 = true;
                    }
                }
                return i11;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        public EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                this.spannable = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i11, i12, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        public EmojiProcessLookupCallback(int i11) {
            this.mOffset = i11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i13 = this.mOffset;
            if (i11 > i13 || i13 >= i12) {
                return i12 <= i13;
            }
            this.start = i11;
            this.end = i12;
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        public MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(MetadataRepo.Node node, boolean z11, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z11;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i11) {
            return i11 == 65039;
        }

        private static boolean isTextStyle(int i11) {
            return i11 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public int check(int i11) {
            MetadataRepo.Node node = this.mCurrentNode.get(i11);
            int i12 = 2;
            if (this.mState != 2) {
                if (node == null) {
                    i12 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i11)) {
                i12 = reset();
            } else if (!isEmojiStyle(i11)) {
                if (this.mCurrentNode.getData() != null) {
                    i12 = 3;
                    if (this.mCurrentDepth != 1) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        i12 = reset();
                    }
                } else {
                    i12 = reset();
                }
            }
            this.mLastCodepoint = i11;
            return i12;
        }

        public TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        public TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            if (this.mState != 2 || this.mCurrentNode.getData() == null) {
                return false;
            }
            return this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint();
        }
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z11, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z11;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z11) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z11 && spanStart == selectionStart) || ((!z11 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, boolean z11) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i11 >= 0 && i12 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z11) {
                max = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i11, 0));
                min = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i12, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i11, 0);
                min = Math.min(selectionEnd + i12, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(max, min, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i11, @NonNull KeyEvent keyEvent) {
        if (!(i11 != 67 ? i11 != 112 ? false : delete(editable, keyEvent, true) : delete(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean hasGlyph(CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i11, i12, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    private static boolean hasInvalidSelection(int i11, int i12) {
        return i11 == -1 || i12 == -1 || i11 != i12;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i11, i11 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i11))).end;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i11, i11 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i11))).start;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:64:0x000e, B:67:0x0013, B:69:0x0017, B:71:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r11, @androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.IntRange(from = 0) int r13, @androidx.annotation.IntRange(from = 0) int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, int i11) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int codePointAt = Character.codePointAt(charSequence, i12);
            int check = processorSm.check(codePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check == 1) {
                i12 += Character.charCount(codePointAt);
                i14 = 0;
            } else if (check == 2) {
                i12 += Character.charCount(codePointAt);
            } else if (check == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i11) {
                    i13++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i11) {
                i14++;
            }
        }
        if (i13 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i11) {
            return i14 == 0 ? 0 : 2;
        }
        return 1;
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13, boolean z11, EmojiProcessCallback<T> emojiProcessCallback) {
        int i14;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int i15 = 0;
        boolean z12 = true;
        int codePointAt = Character.codePointAt(charSequence, i11);
        loop0: while (true) {
            i14 = i11;
            while (i11 < i12 && i15 < i13 && z12) {
                int check = processorSm.check(codePointAt);
                if (check == 1) {
                    i14 += Character.charCount(Character.codePointAt(charSequence, i14));
                    if (i14 < i12) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                    i11 = i14;
                } else if (check == 2) {
                    i11 += Character.charCount(codePointAt);
                    if (i11 < i12) {
                        codePointAt = Character.codePointAt(charSequence, i11);
                    }
                } else if (check == 3) {
                    if (z11 || !hasGlyph(charSequence, i14, i11, processorSm.getFlushMetadata())) {
                        z12 = emojiProcessCallback.handleEmoji(charSequence, i14, i11, processorSm.getFlushMetadata());
                        i15++;
                    }
                }
            }
        }
        if (processorSm.isInFlushableState() && i15 < i13 && z12 && (z11 || !hasGlyph(charSequence, i14, i11, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i14, i11, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
