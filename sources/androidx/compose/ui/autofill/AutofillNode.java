package androidx.compose.ui.autofill;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,120:1\n27#2:121\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode\n*L\n93#1:121\n*E\n"})
@yz.n(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
/* loaded from: classes.dex */
public final class AutofillNode {
    public static final int $stable;

    @m80.k
    public static final Companion Companion;

    @m80.k
    private static final Object lock;
    private static int previousId;

    @m80.k
    private final List<AutofillType> autofillTypes;

    @m80.l
    private Rect boundingBox;

    /* renamed from: id, reason: collision with root package name */
    private final int f4139id;

    @m80.l
    private final x00.l<String, g2> onFill;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,120:1\n32#2,2:121\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n95#1:121,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i11;
            synchronized (AutofillNode.lock) {
                Companion companion = AutofillNode.Companion;
                AutofillNode.previousId++;
                i11 = AutofillNode.previousId;
            }
            return i11;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        lock = companion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(@m80.k List<? extends AutofillType> list, @m80.l Rect rect, @m80.l x00.l<? super String, g2> lVar) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = lVar;
        this.f4139id = ComposeUiFlags.isSemanticAutofillEnabled ? SemanticsModifierKt.generateSemanticsId() : Companion.generateId();
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return g0.g(this.autofillTypes, autofillNode.autofillTypes) && g0.g(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    @m80.k
    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    @m80.l
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.f4139id;
    }

    @m80.l
    public final x00.l<String, g2> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int hashCode2 = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        x00.l<String, g2> lVar = this.onFill;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final void setBoundingBox(@m80.l Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? h0.J() : list, (i11 & 2) != 0 ? null : rect, lVar);
    }
}
