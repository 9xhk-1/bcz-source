package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.v;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public static final int $stable = 8;

        @m80.k
        private l<? super Measured, Integer> block;

        public WithAlignmentLineBlockNode(@m80.k l<? super Measured, Integer> lVar) {
            super(null);
            this.block = lVar;
        }

        @m80.k
        public final l<Measured, Integer> getBlock() {
            return this.block;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        @m80.k
        public Object modifyParentData(@m80.k Density density, @m80.l Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public final void setBlock(@m80.k l<? super Measured, Integer> lVar) {
            this.block = lVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public static final int $stable = 8;

        @m80.k
        private AlignmentLine alignmentLine;

        public WithAlignmentLineNode(@m80.k AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        @m80.k
        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        @m80.k
        public Object modifyParentData(@m80.k Density density, @m80.l Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public final void setAlignmentLine(@m80.k AlignmentLine alignmentLine) {
            this.alignmentLine = alignmentLine;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(v vVar) {
        this();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @m80.l
    public abstract Object modifyParentData(@m80.k Density density, @m80.l Object obj);

    private SiblingsAlignedNode() {
    }
}
