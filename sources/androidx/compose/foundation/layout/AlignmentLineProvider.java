package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;

        @m80.k
        private final l<Measured, Integer> lineProviderBlock;

        /* JADX WARN: Multi-variable type inference failed */
        public Block(@m80.k l<? super Measured, Integer> lVar) {
            super(null);
            this.lineProviderBlock = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Block copy$default(Block block, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = block.lineProviderBlock;
            }
            return block.copy(lVar);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(@m80.k Placeable placeable) {
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        @m80.k
        public final l<Measured, Integer> component1() {
            return this.lineProviderBlock;
        }

        @m80.k
        public final Block copy(@m80.k l<? super Measured, Integer> lVar) {
            return new Block(lVar);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && g0.g(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        @m80.k
        public final l<Measured, Integer> getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        @m80.k
        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;

        @m80.k
        private final AlignmentLine alignmentLine;

        public Value(@m80.k AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(@m80.k Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }

        @m80.k
        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        @m80.k
        public final Value copy(@m80.k AlignmentLine alignmentLine) {
            return new Value(alignmentLine);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && g0.g(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        @m80.k
        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        @m80.k
        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    public /* synthetic */ AlignmentLineProvider(v vVar) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(@m80.k Placeable placeable);

    private AlignmentLineProvider() {
    }
}
