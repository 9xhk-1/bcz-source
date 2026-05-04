package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,380:1\n152#1,16:381\n152#1,16:397\n152#1,16:413\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n111#1:381,16\n137#1:397,16\n145#1:413,16\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class IntervalTree<T> {

    @w00.g
    @m80.k
    public IntervalTree<T>.Node root;

    @w00.g
    @m80.k
    public final ArrayList<IntervalTree<T>.Node> stack;

    @w00.g
    @m80.k
    public final IntervalTree<T>.Node terminator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class Node extends Interval<T> {
        private int color;

        @m80.k
        private IntervalTree<T>.Node left;
        private float max;
        private float min;

        @m80.k
        private IntervalTree<T>.Node parent;

        @m80.k
        private IntervalTree<T>.Node right;

        public Node(float f11, float f12, @m80.l T t11, int i11) {
            super(f11, f12, t11);
            this.color = i11;
            this.min = f11;
            this.max = f12;
            IntervalTree<T>.Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final int getColor() {
            return this.color;
        }

        @m80.k
        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @m80.k
        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        @m80.k
        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        @m80.k
        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (true) {
                IntervalTree<T>.Node node2 = node.left;
                if (node2 == IntervalTree.this.terminator) {
                    return node;
                }
                node = node2;
            }
        }

        @m80.k
        public final IntervalTree<T>.Node next() {
            IntervalTree<T>.Node node = this.right;
            if (node != IntervalTree.this.terminator) {
                return node.lowestNode();
            }
            IntervalTree<T>.Node node2 = this.parent;
            Node node3 = this;
            while (node2 != IntervalTree.this.terminator && node3 == node2.right) {
                node3 = node2;
                node2 = node2.parent;
            }
            return node2;
        }

        public final void setColor(int i11) {
            this.color = i11;
        }

        public final void setLeft(@m80.k IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final void setMax(float f11) {
            this.max = f11;
        }

        public final void setMin(float f11) {
            this.min = f11;
        }

        public final void setParent(@m80.k IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final void setRight(@m80.k IntervalTree<T>.Node node) {
            this.right = node;
        }
    }

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        return intervalTree.findFirstOverlap(f11, f12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, g10.f fVar, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(fVar, list);
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f11, float f12, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f11, f12)) {
                    lVar.invoke(remove);
                }
                if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= f11) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= f12) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(IntervalTree<T>.Node node) {
        while (node != this.root && node.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = node.getParent().getParent();
            if (node.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getRight()) {
                        node = node.getParent();
                        rotateLeft(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rotateRight(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node right = node.getRight();
        node.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(node);
        }
        right.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(right);
        } else {
            node.getParent().setRight(right);
        }
        right.setLeft(node);
        node.setParent(right);
        updateNodeData(node);
    }

    private final void rotateRight(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node left = node.getLeft();
        node.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(node);
        }
        left.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().setRight(left);
        } else {
            node.getParent().setLeft(left);
        }
        left.setRight(node);
        node.setParent(left);
        updateNodeData(node);
    }

    private final void updateNodeData(IntervalTree<T>.Node node) {
        while (node != this.terminator) {
            node.setMin(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.setMax(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    public final void addInterval(float f11, float f12, @m80.l T t11) {
        IntervalTree<T>.Node node = new Node(f11, f12, t11, 0);
        IntervalTree<T>.Node node2 = this.terminator;
        for (IntervalTree<T>.Node node3 = this.root; node3 != this.terminator; node3 = node.getStart() <= node3.getStart() ? node3.getLeft() : node3.getRight()) {
            node2 = node3;
        }
        node.setParent(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.setLeft(node);
        } else {
            node2.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final boolean contains(float f11) {
        return findFirstOverlap(f11, f11) != IntervalTreeKt.getEmptyInterval();
    }

    @m80.k
    public final Interval<T> findFirstOverlap(@m80.k g10.f<Float> fVar) {
        return findFirstOverlap(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
    }

    @m80.k
    public final List<Interval<T>> findOverlaps(@m80.k g10.f<Float> fVar, @m80.k List<Interval<T>> list) {
        return findOverlaps(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue(), list);
    }

    public final void forEach$ui_graphics_release(@m80.k g10.f<Float> fVar, @m80.k x00.l<? super Interval<T>, yz.g2> lVar) {
        float floatValue = fVar.getStart().floatValue();
        float floatValue2 = fVar.getEndInclusive().floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(floatValue, floatValue2)) {
                    lVar.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= floatValue) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= floatValue2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    @m80.k
    public final Iterator<Interval<T>> iterator() {
        return new IntervalTree$iterator$1(this);
    }

    public final void plusAssign(@m80.k Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    public final boolean contains(@m80.k g10.f<Float> fVar) {
        return findFirstOverlap(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    @m80.k
    public final Interval<T> findFirstOverlap(float f11, float f12) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f11, f12)) {
                    return remove;
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f11) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f12) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        kotlin.jvm.internal.g0.n(interval, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return interval;
    }

    @m80.k
    public final List<Interval<T>> findOverlaps(float f11, float f12, @m80.k List<Interval<T>> list) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f11, f12)) {
                    list.add(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f11) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f12) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f11, float f12, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        if ((i11 & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f11, f12, list);
    }

    public final void forEach$ui_graphics_release(float f11, float f12, @m80.k x00.l<? super Interval<T>, yz.g2> lVar) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f11, f12)) {
                    lVar.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f11) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f12) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
