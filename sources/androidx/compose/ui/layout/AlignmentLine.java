package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;

    @k
    private final p<Integer, Integer, Integer> merger;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlignmentLine(p pVar, v vVar) {
        this(pVar);
    }

    @k
    public final p<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(p<? super Integer, ? super Integer, Integer> pVar) {
        this.merger = pVar;
    }
}
