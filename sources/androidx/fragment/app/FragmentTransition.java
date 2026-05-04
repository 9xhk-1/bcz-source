package androidx.fragment.app;

import a00.r0;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n515#2:124\n500#2,6:125\n125#3:131\n152#3,3:132\n125#3:135\n152#3,3:136\n125#3:139\n152#3,3:140\n1855#4,2:143\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:124\n50#1:125,6\n53#1:131\n53#1:132,3\n98#1:135\n98#1:136,3\n99#1:139\n99#1:140,3\n113#1:143,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentTransition {

    @m80.k
    public static final FragmentTransition INSTANCE;

    @m80.l
    @w00.g
    public static final FragmentTransitionImpl PLATFORM_IMPL;

    @m80.l
    @w00.g
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    @w00.o
    public static final void callSharedElementStartEnd(@m80.k Fragment inFragment, @m80.k Fragment outFragment, boolean z11, @m80.k ArrayMap<String, View> sharedElements, boolean z12) {
        g0.p(inFragment, "inFragment");
        g0.p(outFragment, "outFragment");
        g0.p(sharedElements, "sharedElements");
        SharedElementCallback enterTransitionCallback = z11 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z12) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    @m80.l
    @w00.o
    public static final String findKeyForValue(@m80.k ArrayMap<String, String> arrayMap, @m80.k String value) {
        g0.p(arrayMap, "<this>");
        g0.p(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (g0.g(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) r0.L2(arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            g0.n(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @w00.o
    public static final void retainValues(@m80.k ArrayMap<String, String> arrayMap, @m80.k ArrayMap<String, View> namedViews) {
        g0.p(arrayMap, "<this>");
        g0.p(namedViews, "namedViews");
        int size = arrayMap.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    @w00.o
    public static final void setViewVisibility(@m80.k List<? extends View> views, int i11) {
        g0.p(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    @w00.o
    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
