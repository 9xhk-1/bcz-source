package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;

        @m80.k
        private final int[] segment = new int[2];
        protected String text;

        @m80.l
        public final int[] getRange(int i11, int i12) {
            if (i11 < 0 || i12 < 0 || i11 == i12) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i11;
            iArr[1] = i12;
            return iArr;
        }

        @m80.k
        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.g0.S("text");
            return null;
        }

        public void initialize(@m80.k String str) {
            setText(str);
        }

        public final void setText(@m80.k String str) {
            this.text = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {

        @m80.l
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;

        @m80.k
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final CharacterTextSegmentIterator getInstance(@m80.k Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                kotlin.jvm.internal.g0.n(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, kotlin.jvm.internal.v vVar) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] following(int i11) {
            int length = getText().length();
            if (length <= 0 || i11 >= length) {
                return null;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i11)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.g0.S("impl");
                        breakIterator2 = null;
                    }
                    int following = breakIterator2.following(i11);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(i11, following);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator3 = null;
                }
                i11 = breakIterator3.following(i11);
            } while (i11 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@m80.k String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.g0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] preceding(int i11) {
            int length = getText().length();
            if (length <= 0 || i11 <= 0) {
                return null;
            }
            if (i11 > length) {
                i11 = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i11)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.g0.S("impl");
                        breakIterator2 = null;
                    }
                    int preceding = breakIterator2.preceding(i11);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, i11);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator3 = null;
                }
                i11 = breakIterator3.preceding(i11);
            } while (i11 != -1);
            return null;
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {

        @m80.l
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;

        @m80.k
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @m80.k
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

        @m80.k
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                kotlin.jvm.internal.g0.n(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ LineTextSegmentIterator(kotlin.jvm.internal.v vVar) {
            this();
        }

        private final int getLineEdgeIndex(int i11, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i11);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i11);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i11, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] following(int i11) {
            int i12;
            if (getText().length() <= 0 || i11 >= getText().length()) {
                return null;
            }
            if (i11 < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult = null;
                }
                i12 = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i11);
                i12 = getLineEdgeIndex(lineForOffset, DirectionStart) == i11 ? lineForOffset : lineForOffset + 1;
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (i12 >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i12, DirectionStart), getLineEdgeIndex(i12, DirectionEnd) + 1);
        }

        public final void initialize(@m80.k String str, @m80.k TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] preceding(int i11) {
            int i12;
            if (getText().length() <= 0 || i11 <= 0) {
                return null;
            }
            if (i11 > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult = null;
                }
                i12 = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(i11);
                i12 = getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i11 ? lineForOffset : lineForOffset - 1;
            }
            if (i12 < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i12, DirectionStart), getLineEdgeIndex(i12, DirectionEnd) + 1);
        }

        private LineTextSegmentIterator() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @kotlin.jvm.internal.u0({"SMAP\nAccessibilityIterators.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,530:1\n61#2:531\n61#2:533\n26#3:532\n26#3:534\n*S KotlinDebug\n*F\n+ 1 AccessibilityIterators.android.kt\nandroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator\n*L\n455#1:531\n490#1:533\n455#1:532\n490#1:534\n*E\n"})
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {

        @m80.l
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;

        @m80.k
        private Rect tempRect;

        @m80.k
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @m80.k
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;

        @m80.k
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                kotlin.jvm.internal.g0.n(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ PageTextSegmentIterator(kotlin.jvm.internal.v vVar) {
            this();
        }

        private final int getLineEdgeIndex(int i11, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i11);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i11);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.g0.S("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i11, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] following(int i11) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i11 >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.g0.S("node");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int u11 = g10.u.u(0, i11);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(u11);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + round;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        kotlin.jvm.internal.g0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        kotlin.jvm.internal.g0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(u11, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(@m80.k String str, @m80.k TextLayoutResult textLayoutResult, @m80.k SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] preceding(int i11) {
            int i12;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i11 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.g0.S("node");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int B = g10.u.B(getText().length(), i11);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(B);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.g0.S("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - round;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        kotlin.jvm.internal.g0.S("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i12 = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    i12 = 0;
                }
                if (B == getText().length() && i12 < lineForOffset) {
                    i12++;
                }
                return getRange(getLineEdgeIndex(i12, DirectionStart), B);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;

        @m80.k
        public static final Companion Companion = new Companion(null);

        @m80.l
        private static ParagraphTextSegmentIterator instance;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                kotlin.jvm.internal.g0.n(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(kotlin.jvm.internal.v vVar) {
            this();
        }

        private final boolean isEndBoundary(int i11) {
            if (i11 <= 0 || getText().charAt(i11 - 1) == '\n') {
                return false;
            }
            return i11 == getText().length() || getText().charAt(i11) == '\n';
        }

        private final boolean isStartBoundary(int i11) {
            if (getText().charAt(i11) != '\n') {
                return i11 == 0 || getText().charAt(i11 - 1) == '\n';
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] following(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.getText()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.isStartBoundary(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.isEndBoundary(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.getRange(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.following(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] preceding(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.getText()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.getText()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.isEndBoundary(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.isStartBoundary(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.getRange(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.preceding(int):int[]");
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TextSegmentIterator {
        @m80.l
        int[] following(int i11);

        @m80.l
        int[] preceding(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {

        @m80.l
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;

        @m80.k
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final WordTextSegmentIterator getInstance(@m80.k Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                kotlin.jvm.internal.g0.n(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, kotlin.jvm.internal.v vVar) {
            this(locale);
        }

        private final boolean isEndBoundary(int i11) {
            if (i11 <= 0 || !isLetterOrDigit(i11 - 1)) {
                return false;
            }
            return i11 == getText().length() || !isLetterOrDigit(i11);
        }

        private final boolean isLetterOrDigit(int i11) {
            if (i11 < 0 || i11 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i11));
        }

        private final boolean isStartBoundary(int i11) {
            if (isLetterOrDigit(i11)) {
                return i11 == 0 || !isLetterOrDigit(i11 - 1);
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] following(int i11) {
            if (getText().length() <= 0 || i11 >= getText().length()) {
                return null;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            while (!isLetterOrDigit(i11) && !isStartBoundary(i11)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator = null;
                }
                i11 = breakIterator.following(i11);
                if (i11 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.g0.S("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i11);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(i11, following);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(@m80.k String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.g0.S("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        @m80.l
        public int[] preceding(int i11) {
            int length = getText().length();
            if (length <= 0 || i11 <= 0) {
                return null;
            }
            if (i11 > length) {
                i11 = length;
            }
            while (i11 > 0 && !isLetterOrDigit(i11 - 1) && !isEndBoundary(i11)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.g0.S("impl");
                    breakIterator = null;
                }
                i11 = breakIterator.preceding(i11);
                if (i11 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.g0.S("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i11);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, i11);
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }
}
