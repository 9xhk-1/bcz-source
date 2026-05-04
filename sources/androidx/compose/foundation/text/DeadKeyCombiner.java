package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;

    @l
    private Integer deadKeyCode;

    @l
    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m1050consumeZmokQxo(@k KeyEvent keyEvent) {
        int m3590getUtf16CodePointZmokQxo = KeyEvent_androidKt.m3590getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & m3590getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m3590getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(m3590getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), m3590getUtf16CodePointZmokQxo));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        return num2 == null ? Integer.valueOf(m3590getUtf16CodePointZmokQxo) : num2;
    }
}
