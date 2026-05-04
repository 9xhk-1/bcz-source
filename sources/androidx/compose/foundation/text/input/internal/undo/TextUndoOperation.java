package androidx.compose.foundation.text.input.internal.undo;

import a00.h0;
import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextUndoOperation restore(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            g0.n(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(3);
            g0.n(obj5, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            g0.n(obj6, "null cannot be cast to non-null type kotlin.Int");
            long TextRange = TextRangeKt.TextRange(intValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            g0.n(obj7, "null cannot be cast to non-null type kotlin.Int");
            int intValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            g0.n(obj8, "null cannot be cast to non-null type kotlin.Int");
            long TextRange2 = TextRangeKt.TextRange(intValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            g0.n(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(intValue, (String) obj3, (String) obj4, TextRange, TextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return h0.Q(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m4559getStartimpl(textUndoOperation.m1383getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m4554getEndimpl(textUndoOperation.m1383getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m4559getStartimpl(textUndoOperation.m1382getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m4554getEndimpl(textUndoOperation.m1382getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;

    @k
    private final String postText;
    private final long preSelection;

    @k
    private final String preText;

    @k
    private final TextEditType textEditType;
    private final long timeInMillis;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextUndoOperation(int i11, String str, String str2, long j11, long j12, long j13, boolean z11, v vVar) {
        this(i11, str, str2, j11, j12, j13, z11);
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    @k
    public final TextDeleteType getDeletionType() {
        return this.textEditType != TextEditType.Delete ? TextDeleteType.NotByUser : !TextRange.m4553getCollapsedimpl(this.postSelection) ? TextDeleteType.NotByUser : TextRange.m4553getCollapsedimpl(this.preSelection) ? TextRange.m4559getStartimpl(this.preSelection) > TextRange.m4559getStartimpl(this.postSelection) ? TextDeleteType.Start : TextDeleteType.End : (TextRange.m4559getStartimpl(this.preSelection) == TextRange.m4559getStartimpl(this.postSelection) && TextRange.m4559getStartimpl(this.preSelection) == this.index) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m1382getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    @k
    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m1383getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    @k
    public final String getPreText() {
        return this.preText;
    }

    @k
    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    private TextUndoOperation(int i11, String str, String str2, long j11, long j12, long j13, boolean z11) {
        this.index = i11;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j11;
        this.postSelection = j12;
        this.timeInMillis = j13;
        this.canMerge = z11;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public /* synthetic */ TextUndoOperation(int i11, String str, String str2, long j11, long j12, long j13, boolean z11, int i12, v vVar) {
        this(i11, str, str2, j11, j12, (i12 & 32) != 0 ? UndoManager_jvmKt.timeNowMillis() : j13, (i12 & 64) != 0 ? true : z11, null);
    }
}
