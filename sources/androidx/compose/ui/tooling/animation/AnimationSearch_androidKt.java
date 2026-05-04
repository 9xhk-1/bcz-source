package androidx.compose.ui.tooling.animation;

import a00.h0;
import a00.m0;
import a00.r0;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.Group;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n49#1:502\n50#1:518\n51#1:531\n1603#2,9:456\n1855#2:465\n288#2,2:466\n1856#2:469\n1612#2:470\n1603#2,9:471\n1855#2:480\n1856#2:482\n1612#2:483\n1603#2,9:484\n1855#2:493\n288#2,2:494\n1856#2:497\n1612#2:498\n288#2,2:499\n1603#2,9:503\n1855#2:512\n288#2,2:513\n1856#2:516\n1612#2:517\n1603#2,9:519\n1855#2,2:528\n1612#2:530\n1603#2,9:532\n1855#2:541\n288#2,2:542\n1856#2:544\n1612#2:545\n1360#2:546\n1446#2,5:547\n1360#2:552\n1446#2,5:553\n288#2,2:558\n1360#2:560\n1446#2,5:561\n1360#2:566\n1446#2,5:567\n288#2,2:572\n1#3:468\n1#3:481\n1#3:496\n1#3:501\n1#3:515\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n57#1:502\n57#1:518\n57#1:531\n49#1:456,9\n49#1:465\n49#1:466,2\n49#1:469\n49#1:470\n50#1:471,9\n50#1:480\n50#1:482\n50#1:483\n51#1:484,9\n51#1:493\n51#1:494,2\n51#1:497\n51#1:498\n56#1:499,2\n57#1:503,9\n57#1:512\n57#1:513,2\n57#1:516\n57#1:517\n57#1:519,9\n57#1:528,2\n57#1:530\n57#1:532,9\n57#1:541\n57#1:542,2\n57#1:544\n57#1:545\n67#1:546\n67#1:547,5\n69#1:552\n69#1:553,5\n70#1:558,2\n67#1:560\n67#1:561,5\n69#1:566\n69#1:567,5\n70#1:572,2\n49#1:468\n50#1:481\n51#1:496\n57#1:515\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimationSearch_androidKt {

    @k
    private static final String ANIMATED_CONTENT = "AnimatedContent";

    @k
    private static final String ANIMATED_VISIBILITY = "AnimatedVisibility";

    @k
    private static final String ANIMATE_VALUE_AS_STATE = "animateValueAsState";

    @k
    private static final String REMEMBER = "remember";

    @k
    private static final String REMEMBER_INFINITE_TRANSITION = "rememberInfiniteTransition";

    @k
    private static final String REMEMBER_UPDATED_STATE = "rememberUpdatedState";

    @k
    private static final String SIZE_ANIMATION_MODIFIER = "androidx.compose.animation.SizeAnimationModifierElement";

    @k
    private static final String UPDATE_TRANSITION = "updateTransition";

    private static final /* synthetic */ <T> T findData(Group group, boolean z11) {
        T t11;
        Collection<Object> data = group.getData();
        List children = group.getChildren();
        if (z11) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList, ((Group) it.next()).getChildren());
            }
            children = r0.I4(children, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            m0.s0(arrayList2, ((Group) it2.next()).getData());
        }
        Iterator<T> it3 = r0.I4(data, arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it3.next();
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (t11 != null) {
                break;
            }
        }
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t11;
    }

    public static /* synthetic */ Object findData$default(Group group, boolean z11, int i11, Object obj) {
        Object obj2;
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        Collection<Object> data = group.getData();
        List children = group.getChildren();
        if (z11) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList, ((Group) it.next()).getChildren());
            }
            children = r0.I4(children, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            m0.s0(arrayList2, ((Group) it2.next()).getData());
        }
        Iterator it3 = r0.I4(data, arrayList2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj2 != null) {
                break;
            }
        }
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        return obj2;
    }

    private static final /* synthetic */ <T> List<T> findRememberedData(Collection<? extends Group> collection) {
        T t11;
        Collection<? extends Group> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (true) {
            T t12 = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = ((Group) it.next()).getData().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (next != null) {
                    t12 = next;
                    break;
                }
            }
            g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (t12 != null) {
                arrayList.add(t12);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it3.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (firstOrNull != null) {
                arrayList2.add(firstOrNull);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Iterator<T> it5 = ((Group) it4.next()).getData().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t11 = null;
                    break;
                }
                t11 = it5.next();
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (t11 != null) {
                    break;
                }
            }
            g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (t11 != null) {
                arrayList3.add(t11);
            }
        }
        return r0.I4(arrayList, arrayList3);
    }

    private static final /* synthetic */ <T> List<T> findRememberedData(Group group) {
        T t11;
        T t12;
        T t13;
        List l11;
        Iterator<T> it = group.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it.next();
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (t11 != null) {
                break;
            }
        }
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        List J = (t11 == null || (l11 = a00.g0.l(t11)) == null) ? h0.J() : l11;
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    t13 = null;
                    break;
                }
                t13 = it3.next();
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (t13 != null) {
                    break;
                }
            }
            g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (t13 != null) {
                arrayList.add(t13);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it4 = children.iterator();
        while (it4.hasNext()) {
            Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (firstOrNull != null) {
                arrayList2.add(firstOrNull);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    t12 = null;
                    break;
                }
                t12 = it6.next();
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (t12 != null) {
                    break;
                }
            }
            g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (t12 != null) {
                arrayList3.add(t12);
            }
        }
        return r0.I4(J, r0.I4(arrayList, arrayList3));
    }
}
