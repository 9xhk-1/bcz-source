package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);

    @l
    private final x00.l<KeyboardActionScope, g2> onDone;

    @l
    private final x00.l<KeyboardActionScope, g2> onGo;

    @l
    private final x00.l<KeyboardActionScope, g2> onNext;

    @l
    private final x00.l<KeyboardActionScope, g2> onPrevious;

    @l
    private final x00.l<KeyboardActionScope, g2> onSearch;

    @l
    private final x00.l<KeyboardActionScope, g2> onSend;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnDone() {
        return this.onDone;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnGo() {
        return this.onGo;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnNext() {
        return this.onNext;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnPrevious() {
        return this.onPrevious;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnSearch() {
        return this.onSearch;
    }

    @l
    public final x00.l<KeyboardActionScope, g2> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        x00.l<KeyboardActionScope, g2> lVar = this.onDone;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        x00.l<KeyboardActionScope, g2> lVar2 = this.onGo;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        x00.l<KeyboardActionScope, g2> lVar3 = this.onNext;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        x00.l<KeyboardActionScope, g2> lVar4 = this.onPrevious;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        x00.l<KeyboardActionScope, g2> lVar5 = this.onSearch;
        int hashCode5 = (hashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        x00.l<KeyboardActionScope, g2> lVar6 = this.onSend;
        return hashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(@l x00.l<? super KeyboardActionScope, g2> lVar, @l x00.l<? super KeyboardActionScope, g2> lVar2, @l x00.l<? super KeyboardActionScope, g2> lVar3, @l x00.l<? super KeyboardActionScope, g2> lVar4, @l x00.l<? super KeyboardActionScope, g2> lVar5, @l x00.l<? super KeyboardActionScope, g2> lVar6) {
        this.onDone = lVar;
        this.onGo = lVar2;
        this.onNext = lVar3;
        this.onPrevious = lVar4;
        this.onSearch = lVar5;
        this.onSend = lVar6;
    }

    public /* synthetic */ KeyboardActions(x00.l lVar, x00.l lVar2, x00.l lVar3, x00.l lVar4, x00.l lVar5, x00.l lVar6, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : lVar, (i11 & 2) != 0 ? null : lVar2, (i11 & 4) != 0 ? null : lVar3, (i11 & 8) != 0 ? null : lVar4, (i11 & 16) != 0 ? null : lVar5, (i11 & 32) != 0 ? null : lVar6);
    }
}
