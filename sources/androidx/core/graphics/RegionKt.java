package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RegionKt {
    @m80.k
    public static final Region and(@m80.k Region region, @m80.k Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(@m80.k Region region, @m80.k Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void forEach(@m80.k Region region, @m80.k x00.l<? super Rect, g2> lVar) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    @m80.k
    public static final Iterator<Rect> iterator(@m80.k Region region) {
        return new RegionKt$iterator$1(region);
    }

    @m80.k
    public static final Region minus(@m80.k Region region, @m80.k Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @m80.k
    public static final Region not(@m80.k Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @m80.k
    public static final Region or(@m80.k Region region, @m80.k Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @m80.k
    public static final Region plus(@m80.k Region region, @m80.k Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @m80.k
    public static final Region unaryMinus(@m80.k Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @m80.k
    public static final Region xor(@m80.k Region region, @m80.k Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @m80.k
    public static final Region and(@m80.k Region region, @m80.k Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    @m80.k
    public static final Region minus(@m80.k Region region, @m80.k Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @m80.k
    public static final Region or(@m80.k Region region, @m80.k Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @m80.k
    public static final Region plus(@m80.k Region region, @m80.k Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @m80.k
    public static final Region xor(@m80.k Region region, @m80.k Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
