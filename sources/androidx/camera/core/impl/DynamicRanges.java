package androidx.camera.core.impl;

import a00.v1;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDynamicRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n288#2,2:131\n1855#2:133\n1855#2,2:134\n1856#2:136\n*S KotlinDebug\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n*L\n40#1:131,2\n65#1:133\n74#1:134,2\n65#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class DynamicRanges {

    @m80.k
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = dynamicRange2.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }

    @w00.o
    public static final boolean canResolve(@m80.k DynamicRange dynamicRangeToTest, @m80.k Set<DynamicRange> fullySpecifiedDynamicRanges) {
        Object obj;
        g0.p(dynamicRangeToTest, "dynamicRangeToTest");
        g0.p(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRangeToTest, (DynamicRange) obj)) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        return canMatchBitDepth(dynamicRange, dynamicRange2) && canMatchEncoding(dynamicRange, dynamicRange2);
    }

    @w00.o
    @m80.k
    public static final Set<DynamicRange> findAllPossibleMatches(@m80.k Set<DynamicRange> dynamicRangesToTest, @m80.k Set<DynamicRange> fullySpecifiedDynamicRanges) {
        g0.p(dynamicRangesToTest, "dynamicRangesToTest");
        g0.p(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        Set d11 = v1.d();
        for (DynamicRange dynamicRange : dynamicRangesToTest) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        d11.add(dynamicRange2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                d11.add(dynamicRange);
            }
        }
        return v1.a(d11);
    }
}
