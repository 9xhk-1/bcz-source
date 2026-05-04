package androidx.compose.ui.layout;

import c10.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements p<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, b.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i11, int i12) {
        return Integer.valueOf(Math.max(i11, i12));
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
