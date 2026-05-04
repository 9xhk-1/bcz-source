package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,266:1\n54#2:267\n59#2:269\n54#2:355\n59#2:357\n85#3:268\n90#3:270\n53#3,3:312\n53#3,3:316\n53#3,3:320\n53#3,3:324\n60#3:328\n60#3:331\n60#3:334\n60#3:337\n70#3:342\n70#3:345\n70#3:348\n70#3:351\n85#3:356\n90#3:358\n65#4,10:271\n65#4,10:281\n65#4,10:291\n65#4,10:301\n46#4:339\n56#4:340\n46#4:353\n56#4:354\n30#5:311\n30#5:315\n30#5:319\n30#5:323\n65#6:327\n65#6:330\n65#6:333\n65#6:336\n69#6:341\n69#6:344\n69#6:347\n69#6:350\n22#7:329\n22#7:332\n22#7:335\n22#7:338\n22#7:343\n22#7:346\n22#7:349\n22#7:352\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n195#1:267\n196#1:269\n243#1:355\n243#1:357\n195#1:268\n196#1:270\n208#1:312,3\n209#1:316,3\n210#1:320,3\n211#1:324,3\n213#1:328\n214#1:331\n215#1:334\n216#1:337\n221#1:342\n222#1:345\n223#1:348\n224#1:351\n243#1:356\n243#1:358\n199#1:271,10\n200#1:281,10\n201#1:291,10\n202#1:301,10\n218#1:339\n219#1:340\n226#1:353\n227#1:354\n208#1:311\n209#1:315\n210#1:319\n211#1:323\n213#1:327\n214#1:330\n215#1:333\n216#1:336\n221#1:341\n222#1:344\n223#1:347\n224#1:350\n213#1:329\n214#1:332\n215#1:335\n216#1:338\n221#1:343\n222#1:346\n223#1:349\n224#1:352\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    @k
    public static final Rect boundsInParent(@k LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo3865getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo3865getSizeYbymL2g() & 4294967295L)) : localBoundingBoxOf$default;
    }

    @k
    public static final Rect boundsInRoot(@k LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @k
    public static final Rect boundsInWindow(@k LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float mo3865getSizeYbymL2g = (int) (findRootCoordinates.mo3865getSizeYbymL2g() >> 32);
        float mo3865getSizeYbymL2g2 = (int) (findRootCoordinates.mo3865getSizeYbymL2g() & 4294967295L);
        Rect localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates, layoutCoordinates, false, 2, null);
        float left = localBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > mo3865getSizeYbymL2g) {
            left = mo3865getSizeYbymL2g;
        }
        float top = localBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > mo3865getSizeYbymL2g2) {
            top = mo3865getSizeYbymL2g2;
        }
        float right = localBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= mo3865getSizeYbymL2g) {
            mo3865getSizeYbymL2g = right;
        }
        float bottom = localBoundingBoxOf$default.getBottom();
        float f11 = bottom >= 0.0f ? bottom : 0.0f;
        if (f11 <= mo3865getSizeYbymL2g2) {
            mo3865getSizeYbymL2g2 = f11;
        }
        if (left == mo3865getSizeYbymL2g || top == mo3865getSizeYbymL2g2) {
            return Rect.Companion.getZero();
        }
        long mo3870localToWindowMKHz9U = findRootCoordinates.mo3870localToWindowMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)));
        long mo3870localToWindowMKHz9U2 = findRootCoordinates.mo3870localToWindowMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(mo3865getSizeYbymL2g) << 32)));
        long mo3870localToWindowMKHz9U3 = findRootCoordinates.mo3870localToWindowMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(mo3865getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(mo3865getSizeYbymL2g2) & 4294967295L)));
        long mo3870localToWindowMKHz9U4 = findRootCoordinates.mo3870localToWindowMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(mo3865getSizeYbymL2g2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        float intBitsToFloat = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (mo3870localToWindowMKHz9U3 & 4294967295L));
        return new Rect(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    @k
    public static final LayoutCoordinates findRootCoordinates(@k LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        }
    }

    public static final long positionInParent(@k LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2284getZeroF1C5BW0()) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    public static final long positionInRoot(@k LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo3868localToRootMKHz9U(Offset.Companion.m2284getZeroF1C5BW0());
    }

    public static final long positionInWindow(@k LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo3870localToWindowMKHz9U(Offset.Companion.m2284getZeroF1C5BW0());
    }

    public static final long positionOnScreen(@k LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo3869localToScreenMKHz9U(Offset.Companion.m2284getZeroF1C5BW0());
    }
}
